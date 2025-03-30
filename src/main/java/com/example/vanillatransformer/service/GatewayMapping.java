package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.service.abstractmappings.NoMapping;
import com.example.vanillatransformer.service.abstractmappings.RemoveAttributeMapping;
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
import xml.ExtensionElements;
import xml.Subscription;
import xml.TGateway;
import xml.TMessage;

import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class GatewayMapping implements Mapping<TGateway,TGateway> {

    @Autowired
    private NoMapping noMapping;

    private static Logger LOG = LoggerFactory.getLogger(GatewayMapping.class);
    @Override
    public TGateway map(TGateway tGateway) {
        LOG.info("MAPPING: bpmn:gateway with id={}",tGateway.getId());

        return (TGateway) noMapping.map(tGateway);
    }

}
