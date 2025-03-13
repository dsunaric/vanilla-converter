package com.example.vanillatransformer.service;

import com.example.vanillatransformer.exception.BPMNParseException;
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
import xml.ExtensionElements;
import xml.TServiceTask;
import xml.TTask;
import xml.TaskDefinition;

import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class ServiceTaskLikeMapping implements Mapping<TTask,TTask> {

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Autowired
    private RemoveAttributeMapping removeAttributeMapping;

    private static Logger LOG = LoggerFactory.getLogger(ServiceTaskLikeMapping.class);
    @Override
    public TTask map(TTask tServiceTaskLike) {
        LOG.info("MAPPING: Task with id={}",tServiceTaskLike.getId());

        ExtensionElements extensionElements = new ExtensionElements();
        var elements = extensionElements.getAnies();

        QName serviceTaskDefinitionType = getServiceTaskDefinitionType(tServiceTaskLike);
        String serviceTaskDefinition = tServiceTaskLike.getOtherAttributes().get(serviceTaskDefinitionType);
        try {
            JAXBContext context = JAXBContext.newInstance(TaskDefinition.class);
            DOMResult res = new DOMResult();
            Marshaller marshaller = context.createMarshaller();
            // Use custom prefix mapper
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());

            marshaller.marshal(taskDefinitionMapping.map(serviceTaskDefinition, serviceTaskDefinitionType), res);
            Element elt = ((Document)res.getNode()).getDocumentElement();
            elements.add(elt);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        removeAttributeMapping.map(tServiceTaskLike, Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION);
        tServiceTaskLike.setExtensionElements(extensionElements);

        LOG.info("TODO: adapt zeebe:taskDefinition type for Task with id={} to select correct JobWorker",tServiceTaskLike.getId());
        return tServiceTaskLike;
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

        throw new BPMNParseException("no task definition found");
    }

}
