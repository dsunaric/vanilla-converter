package com.example.vanillatransformer.service;

import com.example.vanillatransformer.exception.BPMNParseException;
import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.CalledDecision;
import xml.ExtensionElements;
import xml.TServiceTask;
import xml.TaskDefinition;

import javax.xml.namespace.QName;

@Setter
@Getter
@Component
public class TaskDefinitionMapping implements Mapping<String,TaskDefinition> {

    private static Logger LOG = LoggerFactory.getLogger(TaskDefinitionMapping.class);


    @Autowired
    private ExpressionMapping expressionMapping;

    @Override
    public TaskDefinition map(String delegateExpression) {
        LOG.info("MAPPING: bpmn:delegateExpression {} into zeebe:taskDefinition",delegateExpression);

        TaskDefinition taskDefinition = new TaskDefinition();
        taskDefinition.setType(expressionMapping.map(delegateExpression));

        LOG.info("TODO (OPTIONAL): set retries=?? in zeebe:taskDefinition Element");
        return taskDefinition;
    }

    public TaskDefinition map(String expression, QName type) {
        if(type.equals(Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION)){
            LOG.info("MAPPING: camunda:delegateExpression {} into zeebe:taskDefinition",expression);
            return map(expression);
        }

        if(type.equals(Camunda7Constants.CAMUNDA_TOPIC)){
            LOG.info("MAPPING: camunda:topic {} into zeebe:taskDefinition",expression);
            LOG.info("TODO: define jobworker {} ", expression);
            return map(expression);
        }

        if(type.equals(Camunda7Constants.CAMUNDA_EXPRESSION)){
            LOG.info("MAPPING: camunda:expression {} into zeebe:taskDefinition",expression);
            TaskDefinition taskDefinition = new TaskDefinition();
            String feelExpression = expressionMapping.map(expression);
            taskDefinition.setType(feelExpression.replaceAll(".*\\.(\\w+)\\(.*", "$1"));
            LOG.info("TODO (OPTIONAL): set retries=?? in zeebe:taskDefinition Element");
            return taskDefinition;
        }

        if(type.equals(Camunda7Constants.CAMUNDA_CLASS)){
            LOG.info("MAPPING: camunda:class {} into zeebe:taskDefinition",expression);
            TaskDefinition taskDefinition = new TaskDefinition();
            taskDefinition.setType(expression.replaceAll(".+\\.(\\w+)$", "$1"));
            LOG.info("TODO (OPTIONAL): set retries=?? in zeebe:taskDefinition Element");
            return taskDefinition;
        }

        throw new BPMNParseException("Expression " + type.toString()+ " Not Supported for Mapping TaskDefinition");
    }
}
