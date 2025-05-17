package com.example.vanillatransformer.service.mappings.process.tasks;

import com.example.vanillatransformer.service.mappings.util.Mapping;
import com.example.vanillatransformer.service.mappings.util.NoMapping;
import com.example.vanillatransformer.service.mappings.util.NoMappingImplemented;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xml.TReceiveTask;
import xml.TScriptTask;

@Setter
@Getter
@Component
public class ReceiveTaskMapping implements Mapping<TReceiveTask,TReceiveTask> {

    private static Logger LOG = LoggerFactory.getLogger(ReceiveTaskMapping.class);

    @Autowired
    private NoMapping noMapping;

    @Override
    public TReceiveTask map(TReceiveTask tReceiveTask) {
        LOG.info("MAPPING: ReceiveTask with id={}",tReceiveTask.getId());
        TReceiveTask receiveTask = (TReceiveTask) noMapping.map(tReceiveTask);
        LOG.info("FINISHED MAPPING: ReceiveTask with id={}",tReceiveTask.getId());
        return receiveTask;
    }

}
