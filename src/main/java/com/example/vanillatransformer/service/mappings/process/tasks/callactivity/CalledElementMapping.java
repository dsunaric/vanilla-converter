package com.example.vanillatransformer.service.mappings.process.tasks.callactivity;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import xml.*;

@Setter
@Getter
@Component
public class CalledElementMapping implements Mapping<TCallActivity, CalledElement> {


    private static Logger LOG = LoggerFactory.getLogger(CalledElementMapping.class);

    @Override
    public CalledElement map(TCallActivity tcallActivity) {
        LOG.info("MAPPING : properties of <bpmn:callActivity> with id={} to <zeebe:CalledElement>",tcallActivity.getId());

        var elements = tcallActivity.getExtensionElements().getAnies();

        boolean inputPropagation =
                elements.stream().anyMatch(element -> element.getLocalName().equals("in")
                        && "all".equals(element.getAttribute("variables")));
        boolean outputPropagation =
                elements.stream().anyMatch(element -> element.getLocalName().equals("out")
                        && "all".equals(element.getAttribute("variables")));

        String calledProcess = tcallActivity.getCalledElement().getLocalPart();

        CalledElement calledElement = new CalledElement();

        String calledElementBinding = tcallActivity.getOtherAttributes().get(Camunda7Constants.CAMUNDA_CALLED_ELEMENT_BINDING);

        calledElement.setProcessId(calledProcess);
        calledElement.setPropagateAllChildVariables(inputPropagation);
        calledElement.setPropagateAllParentVariables(outputPropagation);
        calledElement.setBindingType(calledElementBinding);
        return calledElement;
    }

}
