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
            LOG.error("No path provided. Please pass a file or folder path as an argument.");
            return;
        }

        String inputPathStr = args[0];
        Path inputPath = Paths.get(inputPathStr);

        if (!Files.exists(inputPath)) {
            LOG.error("Provided path does not exist: {}", inputPathStr);
            System.exit(1);
        }

        try {
            JAXBContext context = JAXBContext.newInstance(Definitions.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());

            if (Files.isDirectory(inputPath)) {
                // Handle folder
                try (Stream<Path> fileStream = Files.list(inputPath)) {
                    fileStream
                            .filter(path -> path.toString().endsWith(".bpmn")
                                    && !path.toString().endsWith("transformed.bpmn")
                                    && !path.toString().endsWith("expected.bpmn"))
                            .forEach(path -> processFile(context, marshaller, path));
                }
            } else if (Files.isRegularFile(inputPath) && inputPath.toString().endsWith(".bpmn")) {
                // Handle single file
                processFile(context, marshaller, inputPath);
            } else {
                LOG.error("Provided path is neither a BPMN file nor a directory: {}", inputPathStr);
            }
        } catch (JAXBException | IOException e) {
            LOG.error("Error during processing", e);
        }

        System.exit(0);
    }

    private void processFile(JAXBContext context, Marshaller marshaller, Path path) {
        LOG.info("PROCESSING FILE: {}", path);
        try {
            Definitions d = (Definitions) context.createUnmarshaller()
                    .unmarshal(new FileReader(path.toFile()));
            Definitions c8 = definitionMapping.map(d); // still used?

            String outputFileName = path.toString().replaceFirst("(\\.bpmn)$", "-transformed$1");
            marshaller.marshal(d, new File(outputFileName));
            LOG.info("FINISHED PROCESSING FILE: {}", path);
            LOG.info("TRANSFORMED FILE WRITTEN TO: {}", outputFileName);
        } catch (IOException | JAXBException e) {
            LOG.error("Failed to process file: {}", path, e);
        }
    }


}