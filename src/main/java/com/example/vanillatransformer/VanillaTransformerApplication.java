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
            mar.marshal(d, new File("./example.xml"));
        } catch (IOException e) {
            LOG.error("Error reading file: {}", filePath, e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }


}
