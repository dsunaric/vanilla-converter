package com.example.vanillatransformer.service.mappings.process.events;

import com.example.vanillatransformer.service.mappings.util.ExpressionMapping;
import com.example.vanillatransformer.service.mappings.util.TaskDefinitionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
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
public class ThrowEventMapping implements Mapping<TThrowEvent,TThrowEvent> {

    private static Logger LOG = LoggerFactory.getLogger(ThrowEventMapping.class);


    @Autowired
    private NoMapping noMapping;
    @Autowired
    private ExpressionMapping expressionMapping;

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Override
    public TThrowEvent map(TThrowEvent tThrowEvent) {
        LOG.info("MAPPING: bpmn:throwEvent with id={} ",tThrowEvent.getId());

        if(tThrowEvent.getEventDefinitions().isEmpty()) {
            return (TThrowEvent) noMapping.map(tThrowEvent);
        }
        if(tThrowEvent.getEventDefinitions().size() > 1){
            LOG.info("TODO: manually map throw Event with id={}",tThrowEvent.getId());
        }

        TEventDefinition eventDefinition =  tThrowEvent.getEventDefinitions().get(0).getValue();
        //only mapping for messages is needed
        if(eventDefinition instanceof TMessageEventDefinition){
            TMessageEventDefinition messageEventDefinition = (TMessageEventDefinition) eventDefinition;

            ExtensionElements extensionElements = new ExtensionElements();
            var elements = extensionElements.getAnies();


            QName messageEventDefinitionType =  ProcessUtil.getServiceTaskDefinitionType(messageEventDefinition);
            String messageEventDefinitionData = messageEventDefinition.getOtherAttributes().get(messageEventDefinitionType);
            if(messageEventDefinitionData == null){
                LOG.info("TODO (OPTIONAL): manually map throw Event with id={}",tThrowEvent.getId());
                return tThrowEvent;
            }
            try {
                JAXBContext context = JAXBContext.newInstance(TaskDefinition.class);
                DOMResult res = new DOMResult();
                Marshaller marshaller = context.createMarshaller();
                marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
                marshaller.marshal(taskDefinitionMapping.map(messageEventDefinitionData, messageEventDefinitionType), res);
                Element elt = ((Document)res.getNode()).getDocumentElement();
                elements.add(elt);
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
            tThrowEvent.setExtensionElements(extensionElements);

            LOG.info("TODO (OPTIONAL): adapt zeebe:taskDefinition type for Message Event with id={} to select correct JobWorker",tThrowEvent.getId());
            return tThrowEvent;
        }

        return (TThrowEvent) noMapping.map(tThrowEvent);
    }

}
