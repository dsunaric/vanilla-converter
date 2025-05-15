package com.example.vanillatransformer.service.mappings.process;

import com.example.vanillatransformer.service.mappings.util.ExpressionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import jakarta.servlet.MultipartConfigElement;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.*;

import java.util.List;

@Setter
@Getter
@Component
public class SequenceFlowMapping implements Mapping<TSequenceFlow,TSequenceFlow> {

    @Autowired
    private ExpressionMapping expressionMapping;

    private static Logger LOG = LoggerFactory.getLogger(SequenceFlowMapping.class);
    @Autowired
    private MultipartConfigElement multipartConfigElement;

    @Override
    public TSequenceFlow map(TSequenceFlow tSequenceFlow) {
        LOG.info("MAPPING: bpmn:sequenceFlow with id={}",tSequenceFlow.getId());

        if(tSequenceFlow.getConditionExpression() == null){
            return tSequenceFlow;
        }
        TExpression conditionalExpression = tSequenceFlow.getConditionExpression().getValue();
        var content = conditionalExpression.getContent();

        List<String> newContent = content.stream()
                .filter(element -> element instanceof String)
                .map(element -> expressionMapping.map((String) element))
                .toList();

        content.clear();
        content.addAll(newContent);

        return tSequenceFlow;
    }


}
