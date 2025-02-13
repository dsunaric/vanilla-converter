package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.util.Camunda8Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TProcess;
import xml.TServiceTask;

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@Component
public class ProcessMapping implements Mapping<TProcess,TProcess> {

    @Autowired
    private ServiceTaskMapping serviceTaskMapping;

    private static Logger LOG = LoggerFactory.getLogger(ProcessMapping.class);

    @Override
    public TProcess map(TProcess tProcess) {
        LOG.info("MAPPING: <bpmn:process>");
        List<TServiceTask> serviceTasks = extractServiceTasks(tProcess);
        for(var task : serviceTasks) {
            serviceTaskMapping.map(task);
        }
        return tProcess;
    }

    private List<TServiceTask> extractServiceTasks(TProcess tProcess){
        return tProcess.getFlowElements().stream()
                .filter(jaxbElement -> jaxbElement.getDeclaredType().equals(TServiceTask.class))
                .map(jaxbElement -> (TServiceTask) jaxbElement.getValue())
                .collect(Collectors.toList());
    }
}
