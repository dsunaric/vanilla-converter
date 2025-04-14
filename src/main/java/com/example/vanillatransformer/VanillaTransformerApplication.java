package com.example.vanillatransformer;

import com.example.vanillatransformer.service.DefinitionMapping;
import com.example.vanillatransformer.util.CustomNamespacePrefixMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xml.Definitions;

import javax.xml.namespace.QName;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SpringBootApplication
public class VanillaTransformerApplication implements CommandLineRunner {

    @Autowired
    private DefinitionMapping definitionMapping;

    private static Logger LOG = LoggerFactory
            .getLogger(VanillaTransformerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(VanillaTransformerApplication.class, args);
    }


    @Override
    public void run(String... args) {

        if (args.length == 0) {
            LOG.error("No folder path provided. Please pass a folder path as an argument.");
            return;
        }

        String folderPath = args[0];
        Path dirPath = Paths.get(folderPath);

        if (!Files.exists(dirPath) || !Files.isDirectory(dirPath)) {
            LOG.error("Provided path is not a valid directory: {}", folderPath);
            return;
        }

        try {
            JAXBContext context = JAXBContext.newInstance(Definitions.class);
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            mar.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());

            try (Stream<Path> fileStream = Files.list(dirPath)) {
                fileStream
                        .filter(path -> path.toString().endsWith(".bpmn")
                                && !path.toString().endsWith("transformed.bpmn")
                                && !path.toString().endsWith("expected.bpmn"))
                        .forEach(path -> {
                            LOG.info("PROCESSING FILE: {}", path);
                            try {
                                Definitions d = (Definitions) context.createUnmarshaller()
                                        .unmarshal(new FileReader(path.toFile()));
                                Definitions c8 = definitionMapping.map(d); // still used?

                                String outputFileName = path.toString().replaceFirst("(\\.bpmn)$", "-transformed$1");
                                mar.marshal(d, new File(outputFileName));
                                LOG.info("FINISHED PROCESSING FILE: {}", path);
                                LOG.info("TRANSFORMED FILE WROTTEN TO: {}", outputFileName);
                            } catch (IOException | JAXBException e) {
                                LOG.error("Failed to process file: {}", path, e);
                            }
                        });
            }
        } catch (JAXBException | IOException e) {
            LOG.error("Error during processing", e);
        }

        System.exit(0);
    }

    public void run1(String... args) {
        LOG.info("EXECUTING : command line runner");

        if (args.length == 0) {
            LOG.error("No BPMN file provided. Please pass a file path as an argument.");
            return;
        }

        String filePath = args[0];
        Path path = Paths.get(filePath);

        if (!Files.exists(path)) {
            LOG.error("File not found: {}", filePath);
            return;
        }

        try {
            JAXBContext context = JAXBContext.newInstance(Definitions.class);
            Definitions d =
                    (Definitions) context.createUnmarshaller()
                           .unmarshal(new FileReader(filePath));
            Definitions c8 = definitionMapping.map(d);

            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            mar.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
            mar.marshal(d, new File(filePath.replaceFirst("(\\.bpmn)$", "-transformed$1")));
        } catch (IOException e) {
            LOG.error("Error reading file: {}", filePath, e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);

    }


}