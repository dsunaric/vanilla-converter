package com.example.vanillatransformer.service.mappings;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TSignal;

@Setter
@Getter
@Component
public class SignalMapping implements Mapping<TSignal,TSignal> {

    private static Logger LOG = LoggerFactory.getLogger(SignalMapping.class);


    @Autowired
    private NoMapping noMapping;

    @Override
    public TSignal map(TSignal tSignal) {
        LOG.info("MAPPING: bpmn:signal with id={}",tSignal.getId());
        tSignal = (TSignal) noMapping.map(tSignal);
        LOG.info("FINISHED MAPPING: bpmn:signal with id={}",tSignal.getId());
        return tSignal;
    }

}
