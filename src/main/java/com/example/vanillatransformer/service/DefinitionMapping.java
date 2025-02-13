package com.example.vanillatransformer.service;

import com.example.vanillatransformer.exception.BPMNParseException;
import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.util.Camunda8Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.Definitions;
import xml.TProcess;

@Setter
@Getter
@Component
public class DefinitionMapping implements Mapping<Definitions,Definitions> {

    @Autowired
    private ProcessMapping processMapping;

    private static Logger LOG = LoggerFactory.getLogger(DefinitionMapping.class);
    @Override
    public Definitions map(Definitions definitions) {
        LOG.info("MAPPING: <bpmn:definitions>");
        LOG.info("MAPPING: Execution Plattform {} -> {}", definitions.getExecutionPlatform(), Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        definitions.setExecutionPlatform(Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        LOG.info("MAPPING: Execution Plattform Version {} -> {}", definitions.getExecutionPlatformVersion(), Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);
        definitions.setExecutionPlatformVersion(Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);
        processMapping.map(getProcess(definitions));
        return definitions;
    }

    private TProcess getProcess(Definitions definitions){
        if(! (definitions.getRootElements().get(0).getValue() instanceof TProcess)){
            throw new BPMNParseException("Cannot find expected <bpmn:process> child element");
        }
        return  (TProcess) definitions.getRootElements().get(0).getValue();
    }


}
