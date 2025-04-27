package com.example.vanillatransformer.util;

import xml.TBaseElement;

import javax.xml.namespace.QName;

public class ProcessUtil {

    public static QName getServiceTaskDefinitionType(TBaseElement tBaseElement){
        if(tBaseElement.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION)){
            return Camunda7Constants.CAMUNDA_DELEGATE_EXPRESSION;
        }

        if(tBaseElement.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_CLASS)){
            return Camunda7Constants.CAMUNDA_CLASS;
        }

        if(tBaseElement.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_EXPRESSION)){
            return Camunda7Constants.CAMUNDA_EXPRESSION;
        }

        if(tBaseElement.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_TOPIC)){
            return Camunda7Constants.CAMUNDA_TOPIC;
        }

        if(tBaseElement.getOtherAttributes().containsKey(Camunda7Constants.CAMUNDA_DECISION_REF)){
            return Camunda7Constants.CAMUNDA_DECISION_REF;
        }
        return null;
    }
}
