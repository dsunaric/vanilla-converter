package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class ExpressionMapping implements Mapping<String,String> {

    private static Logger LOG = LoggerFactory.getLogger(ExpressionMapping.class);


    @Override
    public String map(String expression) {
        LOG.info("MAPPING: camunda:expression {} into FEEL Expression Language",expression);

        return expression.replaceAll("[#$]\\{([^}]+)}", "$1");
    }
}
