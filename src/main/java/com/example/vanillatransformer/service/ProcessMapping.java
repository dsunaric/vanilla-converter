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
public class ProcessMapping implements Mapping<TProcess,TProcess> {

    @Autowired
    private ServiceTaskLikeMapping serviceTaskLikeMapping;

    @Autowired
    private SequenceFlowMapping sequenceFlowMapping;

    @Autowired
    private NoMapping noMapping;

    private static Logger LOG = LoggerFactory.getLogger(ProcessMapping.class);

    @Override
    public TProcess map(TProcess tProcess) {
        LOG.info("MAPPING: <bpmn:process>");

        List<TServiceTask> serviceTasks = extractServiceTasks(tProcess);
        for(var task : serviceTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TSendTask> sendTasks = extractSendTasks(tProcess);
        for(var task : sendTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TBusinessRuleTask> businessRuleTasks = extractBusinessRuleTasks(tProcess);
        for(var task : businessRuleTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TSequenceFlow> sequenceFlows = extractSequenceFlows(tProcess);
        for(var flow : sequenceFlows) {
            sequenceFlowMapping.map(flow);
        }



        return tProcess;
    }

    //currently no mapping for ReceiveTasks
    private List<TSequenceFlow> extractSequenceFlows(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TSequenceFlow.class))
                .map(jaxbElement -> (TSequenceFlow) jaxbElement.getValue())
                .collect(Collectors.toList());
    }

    //currently no mapping for ReceiveTasks
    private List<TReceiveTask> extractReceiveTasks(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TReceiveTask.class))
                .map(jaxbElement -> (TReceiveTask) jaxbElement.getValue())
                .collect(Collectors.toList());
    }

    //currently no mapping for ReceiveTasks
    private List<TManualTask> extractManualTasks(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TManualTask.class))
                .map(jaxbElement -> (TManualTask) jaxbElement.getValue())
                .collect(Collectors.toList());
    }

    private List<TServiceTask> extractServiceTasks(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TServiceTask.class))
                .map(jaxbElement -> (TServiceTask) jaxbElement.getValue())
                .collect(Collectors.toList());
    }

    private List<TSendTask> extractSendTasks(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TSendTask.class))
                .map(jaxbElement -> (TSendTask) jaxbElement.getValue())
                .collect(Collectors.toList());
    }
    private List<TBusinessRuleTask> extractBusinessRuleTasks(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TBusinessRuleTask.class))
                .map(jaxbElement -> (TBusinessRuleTask) jaxbElement.getValue())
                .collect(Collectors.toList());
    }

}
