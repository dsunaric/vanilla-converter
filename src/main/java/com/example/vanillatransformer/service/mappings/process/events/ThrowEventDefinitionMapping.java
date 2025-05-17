package com.example.vanillatransformer.service.mappings.process.events;

import com.example.vanillatransformer.service.mappings.util.ExpressionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import com.example.vanillatransformer.service.mappings.util.TaskDefinitionMapping;
import com.example.vanillatransformer.util.CustomNamespacePrefixMapper;
import com.example.vanillatransformer.util.ProcessUtil;
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

import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class ThrowEventDefinitionMapping implements Mapping<TEventDefinition,TEventDefinition> {

    private static Logger LOG = LoggerFactory.getLogger(ThrowEventDefinitionMapping.class);


    @Autowired
    private NoMapping noMapping;
    @Autowired
    private ExpressionMapping expressionMapping;

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Override
    public TEventDefinition map(TEventDefinition tEventDefinition) {
        LOG.info("MAPPING: bpmn:eventDefinition with id={}",tEventDefinition.getId());
        TEventDefinition eventDefinition = (TEventDefinition) noMapping.map(tEventDefinition);
        LOG.info("FINISHED MAPPING: bpmn:eventDefinition with id={}",tEventDefinition.getId());
        return eventDefinition;
    }

}
