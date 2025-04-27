package com.example.vanillatransformer.service.task.mappings;

import com.example.vanillatransformer.exception.BPMNParseException;
import com.example.vanillatransformer.service.CalledDecisionMapping;
import com.example.vanillatransformer.service.TaskDefinitionMapping;
import com.example.vanillatransformer.service.abstractmappings.Mapping;
import com.example.vanillatransformer.service.abstractmappings.RemoveAttributeMapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import com.example.vanillatransformer.util.CustomNamespacePrefixMapper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import xml.CalledDecision;
import xml.ExtensionElements;
import xml.TTask;

import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class BusinessRuleTaskMapping implements Mapping<TTask,TTask> {

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Autowired
    private CalledDecisionMapping calledDecisionMapping;

    @Autowired
    private RemoveAttributeMapping removeAttributeMapping;

    @Autowired
    private ServiceTaskLikeMapping serviceTaskLikeMapping;

    private static Logger LOG = LoggerFactory.getLogger(BusinessRuleTaskMapping.class);
    @Override
    public TTask map(TTask businessRuleTask) {
        LOG.info("MAPPING: Task with id={}",businessRuleTask.getId());

        ExtensionElements extensionElements = new ExtensionElements();
        var elements = extensionElements.getAnies();

        QName businessRuleDefinitionType = getServiceTaskDefinitionType(businessRuleTask);
        String businessRulesDefinition = businessRuleTask.getOtherAttributes().get(businessRuleDefinitionType);

        if(!businessRuleDefinitionType.equals(Camunda7Constants.CAMUNDA_DECISION_REF)){
            return serviceTaskLikeMapping.map(businessRuleTask);
        }
        String businessRuleTargetVariable = businessRuleTask.getOtherAttributes().get(Camunda7Constants.CAMUNDA_RESULT_VARIABLE);

        try {
            JAXBContext context = JAXBContext.newInstance(CalledDecision.class);
            DOMResult res = new DOMResult();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
            marshaller.marshal(calledDecisionMapping.map(businessRulesDefinition, businessRuleTargetVariable), res);
            Element elt = ((Document)res.getNode()).getDocumentElement();
            elements.add(elt);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        removeAttributeMapping.map(businessRuleTask, Camunda7Constants.CAMUNDA_RESULT_VARIABLE);
        removeAttributeMapping.map(businessRuleTask, Camunda7Constants.CAMUNDA_DECISION_REF);
        businessRuleTask.setExtensionElements(extensionElements);

        LOG.info("TODO (OPTIONAL): adapt zeebe:taskDefinition type for Task with id={} to select correct JobWorker",businessRuleTask.getId());
        return businessRuleTask;
    }

    public QName getServiceTaskDefinitionType(TTask tServiceTaskLike){
        if(tServiceTaskLike.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION)){
            return Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION;
        }

        if(tServiceTaskLike.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_CLASS)){
            return Camunda7Constants.CAMUNDA_CLASS;
        }

        if(tServiceTaskLike.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_EXPRESSION)){
            return Camunda7Constants.CAMUNDA_EXPRESSION;
        }

        if(tServiceTaskLike.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_DECISION_REF)){
            return Camunda7Constants.CAMUNDA_DECISION_REF;
        }

        throw new BPMNParseException("no task definition found");
    }

}
