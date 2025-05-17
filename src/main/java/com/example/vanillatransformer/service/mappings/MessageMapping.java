package com.example.vanillatransformer.service.mappings;

import com.example.vanillatransformer.service.mappings.process.SubscriptionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.RemoveAttributeMapping;
import com.example.vanillatransformer.util.CustomNamespacePrefixMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import xml.*;

import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class MessageMapping implements Mapping<TMessage,TMessage> {

    @Autowired
    private SubscriptionMapping subscriptionMapping;

    @Autowired
    private RemoveAttributeMapping removeAttributeMapping;

    private static Logger LOG = LoggerFactory.getLogger(MessageMapping.class);
    @Override
    public TMessage map(TMessage tMessage) {
        LOG.info("MAPPING: bpmn:message with id={}",tMessage.getId());

        ExtensionElements extensionElements = new ExtensionElements();
        var elements = extensionElements.getAnies();

        try {
            JAXBContext context = JAXBContext.newInstance(Subscription.class);
            DOMResult res = new DOMResult();
            Marshaller marshaller = context.createMarshaller();
            // Use custom prefix mapper
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());

            marshaller.marshal(subscriptionMapping.map("AddCorrelationKey"), res);
            Element elt = ((Document)res.getNode()).getDocumentElement();
            elements.add(elt);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        tMessage.setExtensionElements(extensionElements);
        LOG.info("FINISHED MAPPING: bpmn:message with id={}",tMessage.getId());
        return tMessage;
    }

}
