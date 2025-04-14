package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.service.abstractmappings.NoMapping;
import jakarta.xml.bind.JAXBElement;
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
public class CallActivityMapping implements Mapping<TCallActivity,TCallActivity> {

    private static Logger LOG = LoggerFactory.getLogger(CallActivityMapping.class);


    @Override
    public TCallActivity map(TCallActivity tcallActivity) {
        LOG.info("MAPPING MISSING: <bpmn:callActivity> with id={}",tcallActivity.getId());
        LOG.info("TODO: map <bpmn:callActivity> with id={}",tcallActivity.getId());


        boolean inputPropagation =
                tcallActivity.getExtensionElements().getAnies().stream()
                        .anyMatch(element -> element.getLocalName().equals("in") );
        boolean outputPropagation =
                tcallActivity.getExtensionElements().getAnies().stream()
                        .anyMatch(element -> element.getLocalName().equals("out") );

        return tcallActivity;
    }

}
