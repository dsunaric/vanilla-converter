package com.example.vanillatransformer.service;

import com.example.vanillatransformer.util.Camunda8Constants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import xml.Definitions;

@Setter
@Getter
@Component
public class DefinitionMapping implements Mapping<Definitions,Definitions>{


    @Override
    public Definitions map(Definitions definitions) {
        definitions.setExecutionPlatform(Camunda8Constants.MODELER_EXECUTIONPLATFORM);
        definitions.setExecutionPlatformVersion(Camunda8Constants.MODELER_EXECUTIONPLATFORM_VERSION);
        return definitions;
    }
}
