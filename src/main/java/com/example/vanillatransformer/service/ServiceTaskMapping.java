package com.example.vanillatransformer.service;

import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import xml.ExtensionElements;
import xml.TServiceTask;

import javax.xml.namespace.QName;

@Setter
@Getter
@Component
public class ServiceTaskMapping implements Mapping<TServiceTask,TServiceTask> {

    private static Logger LOG = LoggerFactory.getLogger(ServiceTaskMapping.class);
    @Override
    public TServiceTask map(TServiceTask tServiceTask) {
        LOG.info("MAPPING: bpmn:serviceTask id={}",tServiceTask.getId());
        String delegateExpression = tServiceTask.getOtherAttributes().get(Camunda7Constants.DELEGATE_EXPRESSION);

        ExtensionElements extensionElements = new ExtensionElements();
        var elements = extensionElements.getAnies();

        //Create extention element
        //add taskdeifnition to extentionelement
        //remove camunda:delegateExpression="${exp}"
        return null;
    }
}
