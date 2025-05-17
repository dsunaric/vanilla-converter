package com.example.vanillatransformer.service.mappings;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TEscalation;
import xml.TSignal;

@Setter
@Getter
@Component
public class EscalationMapping implements Mapping<TEscalation,TEscalation> {

    private static Logger LOG = LoggerFactory.getLogger(EscalationMapping.class);


    @Autowired
    private NoMapping noMapping;

    @Override
    public TEscalation map(TEscalation tEscalation) {
        LOG.info("MAPPING: bpmn:escalation with id={}",tEscalation.getId());
        TEscalation escalation = (TEscalation) noMapping.map(tEscalation);
        LOG.info("FINISHED MAPPING: bpmn:escalation with id={}",tEscalation.getId());
        return escalation;
    }

}
