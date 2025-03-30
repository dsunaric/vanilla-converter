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

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@Component
public class SubProcessMapping implements Mapping<TSubProcess,TSubProcess> {

    @Autowired
    private ServiceTaskLikeMapping serviceTaskLikeMapping;

    @Autowired
    private BusinessRuleTaskMapping businessRuleTaskMapping;

    @Autowired
    private SequenceFlowMapping sequenceFlowMapping;

    @Autowired
    private NoMapping noMapping;

    private static Logger LOG = LoggerFactory.getLogger(SubProcessMapping.class);

    @Override
    public TSubProcess map(TSubProcess tSubProcess) {
        LOG.info("MAPPING: <bpmn:subProcess> with id {}", tSubProcess.getId());

        List<TServiceTask> serviceTasks = extractElementsWithType(tSubProcess, TServiceTask.class);
        for(var task : serviceTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TSendTask> sendTasks = extractElementsWithType(tSubProcess, TSendTask.class);
        for(var task : sendTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TBusinessRuleTask> businessRuleTasks = extractElementsWithType(tSubProcess, TBusinessRuleTask.class);
        for(var task : businessRuleTasks) {
            businessRuleTaskMapping.map(task);
        }

        List<TSequenceFlow> sequenceFlows = extractElementsWithType(tSubProcess, TSequenceFlow.class);
        for(var flow : sequenceFlows) {
            sequenceFlowMapping.map(flow);
        }

        List<TEvent> events = extractElementsWithType(tSubProcess, TEvent.class);
        for(var event : events) {
            noMapping.map(event);
        }

        List<TSubProcess> subProcesses = extractElementsWithType(tSubProcess, TSubProcess.class);
        for(var subProcess : subProcesses) {
            map(subProcess);
        }

        return tSubProcess;
    }

    private <T> List<T> extractElementsWithType(TSubProcess tSubProcess, Class<T> taskType) {
        return tSubProcess.getFlowElements().stream()
                .map(jaxbElement -> jaxbElement.getValue()) // Extract the actual value
                .filter(element -> taskType.isAssignableFrom(element.getClass())) // Check for type compatibility
                .map(taskType::cast) // Cast to the desired type
                .collect(Collectors.toList());
    }



}
