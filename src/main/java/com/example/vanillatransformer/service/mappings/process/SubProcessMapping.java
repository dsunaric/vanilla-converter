package com.example.vanillatransformer.service.mappings.process;

import com.example.vanillatransformer.service.mappings.process.events.EventMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.LoopCharacteristicsMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.ServiceTaskLikeMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.businessrule.BusinessRuleTaskMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.callactivity.CallActivityMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.usertask.UserTaskMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
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
    private LoopCharacteristicsMapping loopCharacteristicsMapping;

    @Autowired
    private EventMapping eventMapping;

    @Autowired
    private TransactionMapping transactionMapping;

    @Autowired
    private CallActivityMapping callActivityMapping;

    @Autowired
    private GatewayMapping gatewayMapping;

    @Autowired
    private UserTaskMapping userTaskMapping;


    @Autowired
    private NoMapping noMapping;

    private static Logger LOG = LoggerFactory.getLogger(SubProcessMapping.class);

    @Override
    public TSubProcess map(TSubProcess tSubProcess) {
        LOG.info("MAPPING: <bpmn:subProcess> with id {}", tSubProcess.getId());

        if(tSubProcess instanceof TAdHocSubProcess){
            LOG.info("TODO: Manually Map Ad-Hoc Subprocess with id {} - Ad-Hoc Subprocess is not supported by Camunda8", tSubProcess.getId());
        }

        List<TGateway> gateways = extractElementsWithType(tSubProcess, TGateway.class);
        for(var gateway : gateways) {
            gatewayMapping.map(gateway);
        }

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
            eventMapping.map(event);
        }

        List<TTransaction> transactions = extractElementsWithType(tSubProcess, TTransaction.class);
        for(var transaction : transactions) {
            transactionMapping.map(transaction);
        }

        List<TCallActivity> callActivities = extractElementsWithType(tSubProcess, TCallActivity.class);
        for(var callActivity : callActivities) {
            callActivityMapping.map(callActivity);
        }

        List<TLoopCharacteristics> loopCharacteristics = extractElementsWithType(tSubProcess, TLoopCharacteristics.class);
        if(tSubProcess.getLoopCharacteristics() != null) {
            loopCharacteristics.add(tSubProcess.getLoopCharacteristics().getValue());
        }
        for(var loopCharacteristic : loopCharacteristics) {
            loopCharacteristicsMapping.map(loopCharacteristic);
        }

        List<TUserTask> userTasks = extractElementsWithType(tSubProcess, TUserTask.class);
        for(var task : userTasks) {
            userTaskMapping.map(task);
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
