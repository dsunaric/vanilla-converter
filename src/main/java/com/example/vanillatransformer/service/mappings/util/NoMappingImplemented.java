package com.example.vanillatransformer.service.mappings.util;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import xml.TBaseElement;

@Setter
@Getter
@Component
public class NoMappingImplemented implements Mapping<TBaseElement,TBaseElement> {


    private static Logger LOG = LoggerFactory.getLogger(NoMappingImplemented.class);
    @Override
    public TBaseElement map(TBaseElement a) {
        LOG.info("NO MAPPING Implemented: for element with id={}",a.getId() );
        return a;
    }
}
