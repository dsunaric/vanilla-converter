package com.example.vanillatransformer.service.mappings.process.tasks.usertask;

import com.example.vanillatransformer.service.mappings.process.tasks.LoopCharacteristicsMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.RemoveAttributeMapping;
import com.example.vanillatransformer.service.mappings.util.TaskDefinitionMapping;
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
import xml.*;

import javax.xml.transform.dom.DOMResult;

@Setter
@Getter
@Component
public class UserTaskMapping implements Mapping<TUserTask,TUserTask> {

    @Autowired
    private TaskDefinitionMapping taskDefinitionMapping;

    @Autowired
    private LoopCharacteristicsMapping loopCharacteristicsMapping;

    @Autowired
    private RemoveAttributeMapping removeAttributeMapping;

    @Autowired
    private FormDefinitionMapping formDefinitionMapping;

    private static Logger LOG = LoggerFactory.getLogger(UserTaskMapping.class);
    @Override
    public TUserTask map(TUserTask tUserTask) {
        LOG.info("MAPPING: UserTask with id={}",tUserTask.getId());

        ExtensionElements extensionElements = new ExtensionElements();
        var elements = extensionElements.getAnies();

        try {
            JAXBContext context = JAXBContext.newInstance(FormDefinition.class);
            DOMResult res = new DOMResult();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
            marshaller.marshal(formDefinitionMapping.map(tUserTask), res);
            Element elt = ((Document)res.getNode()).getDocumentElement();
            elements.add(elt);
            elements.add(getEmptyZeebeUserTask());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
        tUserTask.setExtensionElements(extensionElements);
        removeAttributeMapping.map(tUserTask, Camunda7Constants.CAMUNDA_FORM_KEY);
        removeAttributeMapping.map(tUserTask, Camunda7Constants.CAMUNDA_FORM_REF);
        removeAttributeMapping.map(tUserTask, Camunda7Constants.CAMUNDA_FORM_REFBINDING);

        LOG.info("TODO (OPTIONAL): adapt zeebe:formDefinition type for Task with id={} to select correct Form for Usertask",tUserTask.getId());
        LOG.info("FINISHED MAPPING: UserTask with id={}",tUserTask.getId());
        return tUserTask;
    }

    private Element getEmptyZeebeUserTask() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(UserTask.class);
        DOMResult res = new DOMResult();
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("org.glassfish.jaxb.namespacePrefixMapper", new CustomNamespacePrefixMapper());
        marshaller.marshal(new UserTask(), res);
        return ((Document)res.getNode()).getDocumentElement();
    }


}
