package com.example.vanillatransformer.service.event.mappings;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.service.abstractmappings.NoMapping;
import jakarta.xml.bind.JAXBElement;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.*;

@Setter
@Getter
@Component
public class EventMapping implements Mapping<TEvent,TEvent> {

    private static Logger LOG = LoggerFactory.getLogger(EventMapping.class);


    @Autowired
    private NoMapping noMapping;

    @Autowired
    private EventDefinitionMapping eventDefinitionMapping;

    @Autowired
    private ThrowEventMapping throwEventMapping;

    @Override
    public TEvent map(TEvent tEvent) {
        LOG.info("MAPPING: bpmn:event with id={}",tEvent.getId());
        if(tEvent instanceof TCatchEvent){
            TCatchEvent catchEvent = (TCatchEvent) tEvent;
            if(catchEvent.getEventDefinitions().isEmpty()) {
                return (TEvent) noMapping.map(catchEvent);
            }
            for (JAXBElement<? extends TEventDefinition> jaxbElement : catchEvent.getEventDefinitions()) {
                TEventDefinition eventDefinition = jaxbElement.getValue();
                eventDefinition = eventDefinitionMapping.map(eventDefinition);
            }
            return tEvent;
        }

        if(tEvent instanceof TThrowEvent){
            TThrowEvent throwEvent = (TThrowEvent) tEvent;

            return throwEventMapping.map(throwEvent);
        }
        return (TEvent) noMapping.map(tEvent);
    }

}
