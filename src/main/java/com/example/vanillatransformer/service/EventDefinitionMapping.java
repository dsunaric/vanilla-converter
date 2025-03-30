package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.service.abstractmappings.NoMapping;
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
public class EventDefinitionMapping implements Mapping<TEventDefinition,TEventDefinition> {

    private static Logger LOG = LoggerFactory.getLogger(EventDefinitionMapping.class);


    @Autowired
    private NoMapping noMapping;

    @Override
    public TEventDefinition map(TEventDefinition tEventDefinition) {
        LOG.info("MAPPING: bpmn:eventDefinition with id={}",tEventDefinition.getId());
        if(tEventDefinition instanceof TMessageEventDefinition){
            TMessageEventDefinition messageEventDefinition = (TMessageEventDefinition) tEventDefinition;
            LOG.info("MAPPING MISSING: bpmn:messageEventDefinition with id={}",messageEventDefinition.getId());
            LOG.info("TODO: manually map bpmn:messageEventDefinition with id={}",messageEventDefinition.getId());
            return tEventDefinition;
        }
        return (TEventDefinition) noMapping.map(tEventDefinition);
    }

}
