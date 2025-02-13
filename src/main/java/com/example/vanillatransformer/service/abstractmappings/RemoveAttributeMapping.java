package com.example.vanillatransformer.service.abstractmappings;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RemoveAttributeMapping<A> implements Mapping<A,A> {

    String attrName;

    @Override
    public A map(A a) {
        if(attrName == null ){
            throw new RuntimeException("attrName needs to be set");
        }

        return null;
    }

}
