package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.service.abstractmappings.NoMapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TError;

@Setter
@Getter
@Component
public class ErrorMapping implements Mapping<TError,TError> {

    private static Logger LOG = LoggerFactory.getLogger(ErrorMapping.class);

    @Autowired
    private NoMapping noMapping;

    @Override
    public TError map(TError tError) {
        LOG.info("MAPPING: bpmn:error with id={}",tError.getId());
        String errorMessage = tError.getOtherAttributes().get(Camunda7Constants.CAMUNDA_ERROR_MESSAGE);
        LOG.info("WARNING: Cannot map camunda:errorMessage={} in element bpmn:error with id={}",errorMessage, tError.getId());
        return (TError) noMapping.map(tError);
    }

}
