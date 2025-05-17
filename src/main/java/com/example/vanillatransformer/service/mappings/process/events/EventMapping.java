package com.example.vanillatransformer.service.mappings.process.events;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
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
    private CatchEventDefinitionMapping catchEventDefinitionMapping;

    @Autowired
    private ThrowEventMapping throwEventMapping;

    @Override
    public TEvent map(TEvent tEvent) {
        LOG.info("MAPPING: bpmn:event with id={}",tEvent.getId());
        if(tEvent instanceof TCatchEvent){
            TCatchEvent catchEvent = (TCatchEvent) tEvent;
            if(catchEvent.getEventDefinitions().isEmpty()) {
                tEvent = (TEvent) noMapping.map(catchEvent);
                LOG.info("FINISHED MAPPING: bpmn:event with id={}",tEvent.getId());
                return tEvent;
            }
            for (JAXBElement<? extends TEventDefinition> jaxbElement : catchEvent.getEventDefinitions()) {
                TEventDefinition eventDefinition = jaxbElement.getValue();
                eventDefinition = catchEventDefinitionMapping.map(eventDefinition);
            }
            LOG.info("FINISHED MAPPING: bpmn:event with id={}",tEvent.getId());
            return tEvent;
        }

        if(tEvent instanceof TThrowEvent){
            TThrowEvent throwEvent = throwEventMapping.map((TThrowEvent) tEvent );
            LOG.info("FINISHED MAPPING: bpmn:event with id={}",tEvent.getId());
            return throwEvent;
        }
        TEvent event = (TEvent) noMapping.map(tEvent);
        LOG.info("FINISHED MAPPING: bpmn:event with id={}",tEvent.getId());
        return event;
    }

}
