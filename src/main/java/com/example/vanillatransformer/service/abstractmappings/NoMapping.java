package com.example.vanillatransformer.service.abstractmappings;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import xml.TBaseElement;

@Setter
@Getter
@Component
public class NoMapping implements Mapping<TBaseElement,TBaseElement> {


    private static Logger LOG = LoggerFactory.getLogger(NoMapping.class);
    @Override
    public TBaseElement map(TBaseElement a) {
        LOG.info("NO MAPPING NEEDED: for element with id={}",a.getId() );
        return a;
    }
}
