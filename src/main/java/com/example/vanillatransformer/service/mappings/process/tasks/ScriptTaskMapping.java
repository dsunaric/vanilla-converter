package com.example.vanillatransformer.service.mappings.process.tasks;

import com.example.vanillatransformer.service.mappings.ErrorMapping;
import com.example.vanillatransformer.service.mappings.process.tasks.usertask.FormDefinitionMapping;
import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMappingImplemented;
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
public class ScriptTaskMapping implements Mapping<TScriptTask,TScriptTask> {

    private static Logger LOG = LoggerFactory.getLogger(ScriptTaskMapping.class);

    @Autowired
    private NoMappingImplemented noMappingImplemented;

    @Override
    public TScriptTask map(TScriptTask tScriptTask) {
        LOG.info("MAPPING: ScriptTask with id={}",tScriptTask.getId());
        TScriptTask scriptTask =  (TScriptTask) noMappingImplemented.map(tScriptTask);
        LOG.info("FINISHED MAPPING: ScriptTask with id={}",tScriptTask.getId());
        return scriptTask;
    }

}
