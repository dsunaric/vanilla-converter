package com.example.vanillatransformer.service.mappings.process.tasks;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.RemoveAttributeMapping;
import com.example.vanillatransformer.service.mappings.util.TaskDefinitionMapping;
import com.example.vanillatransformer.util.Camunda7Constants;
import com.example.vanillatransformer.util.CustomNamespacePrefixMapper;
import com.example.vanillatransformer.util.ProcessUtil;
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
import xml.*;

import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class ServiceTaskLikeMapping implements Mapping<TTask,TTask> {

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Autowired
    private LoopCharacteristicsMapping loopCharacteristicsMapping;

    @Autowired
    private RemoveAttributeMapping removeAttributeMapping;

    private static Logger LOG = LoggerFactory.getLogger(ServiceTaskLikeMapping.class);
    @Override
    public TTask map(TTask tServiceTaskLike) {
        LOG.info("MAPPING: Task with id={}",tServiceTaskLike.getId());

        ExtensionElements extensionElements = new ExtensionElements();
        var elements = extensionElements.getAnies();

        if(!elements.isEmpty()){
            LOG.info("TODO: Manually map bpmn:extensionElements for Task with id={} ",tServiceTaskLike.getId());
        }

        if(((TActivity)tServiceTaskLike).getLoopCharacteristics() != null){
            LOG.info("MAPPING: LoopCharacteristics for element with id={}", tServiceTaskLike.getId());
            loopCharacteristicsMapping.map(((TActivity)tServiceTaskLike).getLoopCharacteristics().getValue());
        }
        TaskDefinition taskDefinition = new TaskDefinition();
        QName serviceTaskDefinitionType = ProcessUtil.getServiceTaskDefinitionType(tServiceTaskLike);
        if(serviceTaskDefinitionType != null){
            String serviceTaskDefinition = tServiceTaskLike.getOtherAttributes().get(serviceTaskDefinitionType);
            taskDefinition = taskDefinitionMapping.map(serviceTaskDefinition);
        } else {
            LOG.info("TODO (OPTIONAL): no task definition found for ServiceTaskLike Task with id={} -  manuall mapping might be needed",tServiceTaskLike.getId());
            taskDefinition.setType("AddJobWorker");
        }

        try {
            JAXBContext context = JAXBContext.newInstance(TaskDefinition.class);
            DOMResult res = new DOMResult();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
            marshaller.marshal(taskDefinition, res);
            Element elt = ((Document)res.getNode()).getDocumentElement();
            elements.add(elt);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        removeAttributeMapping.map(tServiceTaskLike, Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION);
        tServiceTaskLike.setExtensionElements(extensionElements);

        LOG.info("TODO (OPTIONAL): adapt zeebe:taskDefinition type for Task with id={} to select correct JobWorker",tServiceTaskLike.getId());

        LOG.info("FINISHED MAPPING: Task with id={}",tServiceTaskLike.getId());
        return tServiceTaskLike;
    }


}
