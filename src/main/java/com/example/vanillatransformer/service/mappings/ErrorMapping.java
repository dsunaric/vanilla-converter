package com.example.vanillatransformer.service.mappings;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TError;
import xml.TEventDefinition;

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
        String errorCode = tError.getErrorCode();
        if(errorCode != null){
            TError error = (TError) noMapping.map(tError);
            LOG.info("FINISHED MAPPING: bpmn:error with id={}",tError.getId());
            return error;
        }
        if(errorMessage != null) {
            LOG.info("MAPPING: camunda:errorMessage={} into element errorCode with id={}", errorMessage, tError.getId());
            LOG.info("TODO (OPTIONAL): set correct Error Code for bpmn:error with id={}", tError.getId());
            tError.setErrorCode(errorMessage);
            LOG.info("FINISHED MAPPING: bpmn:error with id={}",tError.getId());
            return tError;
        }
        tError.setErrorCode("AddErrorCode");
        LOG.info("TODO: set correct Error Code for bpmn:error with id={}", tError.getId());
        LOG.info("FINISHED MAPPING: bpmn:error with id={}",tError.getId());
        return tError;
    }

}
