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

@Setter
@Getter
@Component
public class EventDefinitionMapping implements Mapping<TEventDefinition,TEventDefinition> {

    private static Logger LOG = LoggerFactory.getLogger(EventDefinitionMapping.class);


    @Autowired
    private NoMapping noMapping;
    @Autowired
    private ExpressionMapping expressionMapping;

    @Override
    public TEventDefinition map(TEventDefinition tEventDefinition) {
        LOG.info("MAPPING: bpmn:eventDefinition with id={}",tEventDefinition.getId());
        if(tEventDefinition instanceof TMessageEventDefinition){
            TMessageEventDefinition messageEventDefinition = (TMessageEventDefinition) tEventDefinition;
            LOG.info("MAPPING MISSING: bpmn:messageEventDefinition with id={}",messageEventDefinition.getId());
            LOG.info("TODO: manually map bpmn:messageEventDefinition with id={}",messageEventDefinition.getId());
            return tEventDefinition;
        }

        if(tEventDefinition instanceof TTimerEventDefinition){
            TTimerEventDefinition timerEventDefinition = (TTimerEventDefinition) tEventDefinition;
            String expression = null;
            //Cycle
            if(timerEventDefinition.getTimeCycle() != null) {
                expression = (String) timerEventDefinition.getTimeCycle().getValue().getContent().get(0);
                if (expression != null && expression.startsWith("${")) {
                    timerEventDefinition.getTimeCycle().getValue().getContent().set(0, "=" + expressionMapping.map(expression));
                }
            }

            //Date
            if(timerEventDefinition.getTimeDate() != null) {
                expression = (String) timerEventDefinition.getTimeDate().getValue().getContent().get(0);
                if (expression != null && expression.startsWith("${")) {
                    timerEventDefinition.getTimeDate().getValue().getContent().set(0, "=" + expressionMapping.map(expression));
                }
            }

            //Duration
            if(timerEventDefinition.getTimeDuration() != null) {
                expression = (String) timerEventDefinition.getTimeDuration().getValue().getContent().get(0);
                if (expression != null && expression.startsWith("${")) {
                    timerEventDefinition.getTimeDuration().getValue().getContent().set(0,"=" +  expressionMapping.map(expression));
                }
            }
            if(expression != null && expression.startsWith("${")) {
                LOG.info("OPTIONAL TODO: for TimerEventDefinition with id {}: set output of expression '{}' as a variable in ISO8601 format and set variable as this timer events value", timerEventDefinition.getId(), expression);
            }
            return tEventDefinition;
        }
        return (TEventDefinition) noMapping.map(tEventDefinition);
    }

}
