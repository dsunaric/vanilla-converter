package com.example.vanillatransformer.service;

import com.example.vanillatransformer.exception.BPMNParseException;
import com.example.vanillatransformer.service.mappings.ErrorMapping;
import com.example.vanillatransformer.service.mappings.EscalationMapping;
import com.example.vanillatransformer.service.mappings.process.RootProcessMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.MessageMapping;
import com.example.vanillatransformer.service.mappings.SignalMapping;
import com.example.vanillatransformer.util.Camunda8Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.*;

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@Component
public class DefinitionMapping implements Mapping<Definitions,Definitions> {

    @Autowired
    private RootProcessMapping processMapping;

    @Autowired
    private MessageMapping messageMapping;

    @Autowired
    private ErrorMapping errorMapping;

    @Autowired
    private SignalMapping signalMapping;

    @Autowired
    private EscalationMapping escalationMapping;

    private static Logger LOG = LoggerFactory.getLogger(DefinitionMapping.class);
    @Override
    public Definitions map(Definitions definitions) {
        LOG.info("MAPPING: <bpmn:definitions>");
        LOG.info("MAPPING: Execution Plattform {} -> {}", definitions.getExecutionPlatform(), Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        definitions.setExecutionPlatform(Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        LOG.info("MAPPING: Execution Plattform Version {} -> {}", definitions.getExecutionPlatformVersion(), Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);
        definitions.setExecutionPlatformVersion(Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);

        List<TProcess> processes = extractElementsWithType(definitions, TProcess.class);
        for(var process : processes) {
            processMapping.map(process);
        }


        List<TMessage> messages = extractElementsWithType(definitions, TMessage.class);
        for(var message : messages) {
            messageMapping.map(message);
        }

        List<TError> errors = extractElementsWithType(definitions, TError.class);
        for(var error : errors) {
            errorMapping.map(error);
        }

        List<TSignal> signals = extractElementsWithType(definitions, TSignal.class);
        for(var signal : signals) {
            signalMapping.map(signal);
        }

        List<TEscalation> escalations = extractElementsWithType(definitions, TEscalation.class);
        for(var escalation : escalations) {
            escalationMapping.map(escalation);
        }

        LOG.info("FINISHED MAPPING: <bpmn:definitions>");
        return definitions;
    }

    private TProcess getProcess(Definitions definitions){
        return definitions.getRootElements().stream().filter(
                        element -> element.getDeclaredType().equals(TProcess.class))
                .map(element -> (TProcess) element.getValue())
                .findFirst()
                .orElseThrow(() -> new BPMNParseException("Cannot find expected <bpmn:process> child element"));
    }


    private <T> List<T> extractElementsWithType(Definitions definitions, Class<T> taskType) {
        return definitions.getRootElements().stream().filter(
                        element -> element.getDeclaredType().equals(taskType))
                .map(element -> taskType.cast(element.getValue()))
                .collect(Collectors.toList());
    }



}
