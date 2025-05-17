package com.example.vanillatransformer.service.mappings.process.tasks.callactivity;

import com.example.vanillatransformer.service.mappings.util.Mapping;
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
public class CallActivityMapping implements Mapping<TCallActivity,TCallActivity> {

    private static Logger LOG = LoggerFactory.getLogger(CallActivityMapping.class);


    @Autowired
    private CalledElementMapping calledElementMapping;

    @Override
    public TCallActivity map(TCallActivity tcallActivity) {
        LOG.info("MAPPING : <bpmn:callActivity> with id={}",tcallActivity.getId());

        ExtensionElements extensionElements = tcallActivity.getExtensionElements();
        var elements = extensionElements.getAnies();

        try {
            JAXBContext context = JAXBContext.newInstance(CalledElement.class);
            DOMResult res = new DOMResult();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
            marshaller.marshal(calledElementMapping.map(tcallActivity), res);
            Element elt = ((Document)res.getNode()).getDocumentElement();
            elements.add(elt);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        tcallActivity.setExtensionElements(extensionElements);

        LOG.info("FINISHED MAPPING : <bpmn:callActivity> with id={}",tcallActivity.getId());
        return tcallActivity;
    }

}
