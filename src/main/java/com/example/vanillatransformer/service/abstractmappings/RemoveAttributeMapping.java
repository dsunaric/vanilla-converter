package com.example.vanillatransformer.service.abstractmappings;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import xml.TBaseElement;

import javax.xml.namespace.QName;

@Setter
@Getter
@Component
public class RemoveAttributeMapping implements Mapping<TBaseElement,TBaseElement> {


    @Override
    public TBaseElement map(TBaseElement a) {
        throw new RuntimeException("attrName needs to be set");
    }


    public TBaseElement map(TBaseElement a, QName attrName) {
        if(attrName == null ){
            throw new RuntimeException("attrName needs to be set");
        }
        a.getOtherAttributes().remove(attrName);
        return a;
    }

}
