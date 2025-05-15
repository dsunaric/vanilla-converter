package com.example.vanillatransformer.service.mappings.process.tasks.businessrule;

import com.example.vanillatransformer.service.mappings.util.ExpressionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.CalledDecision;

@Setter
@Getter
@Component
public class CalledDecisionMapping implements Mapping<String,CalledDecision> {

    private static Logger LOG = LoggerFactory.getLogger(CalledDecisionMapping.class);


    @Autowired
    private ExpressionMapping expressionMapping;

    @Override
    public CalledDecision map(String decisionRef) {
        CalledDecision calledDecision = new CalledDecision();
        LOG.info("MAPPING: camunda:decisionRef {} into <zeebe:calledDecision decisionId={}>",decisionRef,decisionRef);
        calledDecision.setDecisionId(decisionRef);
        return calledDecision;
    }

    public CalledDecision map(String decisionRef, String resultVariable) {
        CalledDecision calledDecision = map(decisionRef);
        LOG.info("MAPPING: camunda:resultVariable {} into <zeebe:calledDecision resultVariable={}>",
                resultVariable,resultVariable);
        calledDecision.setResultVariable(resultVariable);
        return calledDecision;
    }
}
