package com.example.vanillatransformer.service.mappings.process.tasks.usertask;

import com.example.vanillatransformer.service.mappings.util.ExpressionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import com.example.vanillatransformer.service.mappings.util.TaskDefinitionMapping;
import com.example.vanillatransformer.util.Camunda7Constants;
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
public class FormDefinitionMapping implements Mapping<TUserTask,FormDefinition> {

    private static Logger LOG = LoggerFactory.getLogger(FormDefinitionMapping.class);


    @Autowired
    private NoMapping noMapping;
    @Autowired
    private ExpressionMapping expressionMapping;

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Override
    public FormDefinition map(TUserTask tUserTask) {
        LOG.info("MAPPING: bpmn:userTask with id={} to zeebe:formDefinition",tUserTask.getId());

        FormDefinition formDefinition = new FormDefinition();

        if(tUserTask.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_FORM_REFBINDING)){
            formDefinition.setBindingType(tUserTask.getOtherAttributes().get(Camunda7Constants.CAMUNDA_FORM_REFBINDING));
        }

        if(tUserTask.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_FORM_KEY)) {
            formDefinition.setFormId(tUserTask.getOtherAttributes().get(Camunda7Constants.CAMUNDA_FORM_KEY));
        } else if (tUserTask.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_FORM_REF)){
            formDefinition.setFormId(tUserTask.getOtherAttributes().get(Camunda7Constants.CAMUNDA_FORM_REF));
        } else {
            formDefinition.setFormId("AddFormId");
            LOG.info("TODO: bpmn:userTask with id={} need to be manually mapped to zeebe:formDefinition",tUserTask.getId());
        }

        return formDefinition;
    }

}
