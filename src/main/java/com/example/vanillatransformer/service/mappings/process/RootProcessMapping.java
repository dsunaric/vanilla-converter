package com.example.vanillatransformer.service.mappings.process;

import com.example.vanillatransformer.service.mappings.process.events.EventMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.ReceiveTaskMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.process.tasks.businessrule.BusinessRuleTaskMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.callactivity.CallActivityMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.ServiceTaskLikeMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.usertask.UserTaskMapping;
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
public class RootProcessMapping implements Mapping<TProcess,TProcess> {

    @Autowired
    private ServiceTaskLikeMapping serviceTaskLikeMapping;

    @Autowired
    private BusinessRuleTaskMapping businessRuleTaskMapping;

    @Autowired
    private SequenceFlowMapping sequenceFlowMapping;

    @Autowired
    private EventMapping eventMapping;

    @Autowired
    private CallActivityMapping callActivityMapping;

    @Autowired
    private ReceiveTaskMapping receiveTaskMapping;

    @Autowired
    private UserTaskMapping userTaskMapping;

    @Autowired
    private SubProcessMapping subProcessMapping;

    @Autowired
    private GatewayMapping gatewayMapping;

    private static Logger LOG = LoggerFactory.getLogger(RootProcessMapping.class);

    @Override
    public TProcess map(TProcess tProcess) {
        LOG.info("MAPPING: <bpmn:process> with id={}", tProcess.getId());

        List<TGateway> gateways = extractElementsWithType(tProcess, TGateway.class);
        for(var gateway : gateways) {
            gatewayMapping.map(gateway);
        }

        List<TServiceTask> serviceTasks = extractElementsWithType(tProcess, TServiceTask.class);
        for(var task : serviceTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TUserTask> userTasks = extractElementsWithType(tProcess, TUserTask.class);
        for(var task : userTasks) {
            userTaskMapping.map(task);
        }

        List<TSendTask> sendTasks = extractElementsWithType(tProcess, TSendTask.class);
        for(var task : sendTasks) {
            serviceTaskLikeMapping.map(task);
        }

        List<TReceiveTask> receiveTasks = extractElementsWithType(tProcess, TReceiveTask.class);
        for(var task : receiveTasks) {
            receiveTaskMapping.map(task);
        }

        List<TBusinessRuleTask> businessRuleTasks = extractElementsWithType(tProcess, TBusinessRuleTask.class);
        for(var task : businessRuleTasks) {
            businessRuleTaskMapping.map(task);
        }

        List<TSequenceFlow> sequenceFlows = extractElementsWithType(tProcess, TSequenceFlow.class);
        for(var flow : sequenceFlows) {
            sequenceFlowMapping.map(flow);
        }

        List<TEvent> events = extractElementsWithType(tProcess, TEvent.class);
        for(var event : events) {
            eventMapping.map(event);
        }

        List<TCallActivity> callActivities = extractElementsWithType(tProcess, TCallActivity.class);
        for(var callActivity : callActivities) {
            callActivityMapping.map(callActivity);
        }

        List<TSubProcess> subProcesses = extractElementsWithType(tProcess, TSubProcess.class);
        for(var subProcess : subProcesses) {
            subProcessMapping.map(subProcess);
        }

        LOG.info("FINISHED MAPPING: <bpmn:process> with id={}", tProcess.getId());
        return tProcess;
    }

    private <T> List<T> extractElementsWithType(TProcess tProcess, Class<T> taskType) {
        return tProcess.getFlowElements().stream()
                .map(jaxbElement -> jaxbElement.getValue()) // Extract the actual value
                .filter(element -> taskType.isAssignableFrom(element.getClass())) // Check for type compatibility
                .map(taskType::cast) // Cast to the desired type
                .collect(Collectors.toList());
    }



}
