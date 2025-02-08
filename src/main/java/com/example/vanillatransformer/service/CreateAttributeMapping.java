package com.example.vanillatransformer.service;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateAttributeMapping<A> implements Mapping<A,A>{

    String attrName;
    String attrValue;

    @Override
    public A map(A a) {
        if(attrName == null || attrValue == null){
            throw new RuntimeException("attrName and attrValue need ot be set");
        }

        return null;
    }

}
