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
import xml.TMessage;
import xml.TProcess;
import xml.TReceiveTask;

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@Component
public class DefinitionMapping implements Mapping<Definitions,Definitions> {

    @Autowired
    private ProcessMapping processMapping;

    @Autowired
    private MessageMapping messageMapping;

    private static Logger LOG = LoggerFactory.getLogger(DefinitionMapping.class);
    @Override
    public Definitions map(Definitions definitions) {
        LOG.info("MAPPING: <bpmn:definitions>");
        LOG.info("MAPPING: Execution Plattform {} -> {}", definitions.getExecutionPlatform(), Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        definitions.setExecutionPlatform(Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        LOG.info("MAPPING: Execution Plattform Version {} -> {}", definitions.getExecutionPlatformVersion(), Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);
        definitions.setExecutionPlatformVersion(Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);
        processMapping.map(getProcess(definitions));

        List<TMessage> messages = getMessages(definitions);
        for(var message : messages) {
            messageMapping.map(message);
        }

        return definitions;
    }

    private TProcess getProcess(Definitions definitions){
        return definitions.getRootElements().stream().filter(
                        element -> element.getDeclaredType().equals(TProcess.class))
                .map(element -> (TProcess) element.getValue())
                .findFirst()
                .orElseThrow(() -> new BPMNParseException("Cannot find expected <bpmn:process> child element"));
    }

    private List<TMessage> getMessages(Definitions definitions){
        return  definitions.getRootElements().stream().filter(
                element -> element.getDeclaredType().equals(TMessage.class))
                .map(element -> (TMessage) element.getValue())
                .collect(Collectors.toList());
    }


}
