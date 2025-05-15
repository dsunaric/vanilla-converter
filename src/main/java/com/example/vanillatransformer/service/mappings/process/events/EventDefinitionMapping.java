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
public class EventDefinitionMapping implements Mapping<TEventDefinition,TEventDefinition> {

    private static Logger LOG = LoggerFactory.getLogger(EventDefinitionMapping.class);


    @Autowired
    private NoMapping noMapping;
    @Autowired
    private ExpressionMapping expressionMapping;

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Override
    public TEventDefinition map(TEventDefinition tEventDefinition) {
        LOG.info("MAPPING: bpmn:eventDefinition with id={}",tEventDefinition.getId());
        if(tEventDefinition instanceof TMessageEventDefinition){
            TMessageEventDefinition messageEventDefinition = (TMessageEventDefinition) tEventDefinition;

            ExtensionElements extensionElements = new ExtensionElements();
            var elements = extensionElements.getAnies();


            QName messageEventDefinitionType =  ProcessUtil.getServiceTaskDefinitionType(messageEventDefinition);
            String messageEventDefinitionData = tEventDefinition.getOtherAttributes().get(messageEventDefinitionType);
            if(messageEventDefinitionData == null){
                return messageEventDefinition;
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
            tEventDefinition.setExtensionElements(extensionElements);

            LOG.info("TODO (OPTIONAL): adapt zeebe:taskDefinition type for Message Event with id={} to select correct JobWorker",tEventDefinition.getId());
            return tEventDefinition;
        }

        if(tEventDefinition instanceof TTimerEventDefinition){
            TTimerEventDefinition timerEventDefinition = (TTimerEventDefinition) tEventDefinition;
            String expression = null;
            //Cycle
            if(timerEventDefinition.getTimeCycle() != null) {
                expression = (String) timerEventDefinition.getTimeCycle().getValue().getContent().get(0);
                if (expression != null && expression.startsWith("${")) {
                    timerEventDefinition.getTimeCycle().getValue().getContent().set(0, "=" + expressionMapping.map(expression));
                }
            }

            //Date
            if(timerEventDefinition.getTimeDate() != null) {
                expression = (String) timerEventDefinition.getTimeDate().getValue().getContent().get(0);
                if (expression != null && expression.startsWith("${")) {
                    timerEventDefinition.getTimeDate().getValue().getContent().set(0, "=" + expressionMapping.map(expression));
                }
            }

            //Duration
            if(timerEventDefinition.getTimeDuration() != null) {
                expression = (String) timerEventDefinition.getTimeDuration().getValue().getContent().get(0);
                if (expression != null && expression.startsWith("${")) {
                    timerEventDefinition.getTimeDuration().getValue().getContent().set(0,"=" +  expressionMapping.map(expression));
                }
            }
            if(expression != null && expression.startsWith("${")) {
                LOG.info("TODO (OPTIONAL): for TimerEventDefinition with id {}: set output of expression '{}' as a variable in ISO8601 format and set variable as this timer events value", timerEventDefinition.getId(), expression);
            }
            return tEventDefinition;
        }
        return (TEventDefinition) noMapping.map(tEventDefinition);
    }

}
