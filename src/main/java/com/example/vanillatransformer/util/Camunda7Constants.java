package com.example.vanillatransformer.util;

import javax.xml.namespace.QName;

public class Camunda7Constants {
    public static final  String MODELER_EXECUTIONPLATFORM = "Camunda Platform";
    public static final  String MODELER_EXECUTIONPLATFORM_VERSION = "7.21.0";

    public static QName CAMUNDA_DELEGATE_EXPRESSION = new QName("http://camunda.org/schema/1.0/bpmn",
            "delegateExpression","camunda");

    public static QName CAMUNDA_EXPRESSION = new QName("http://camunda.org/schema/1.0/bpmn",
            "expression","camunda");

    public static QName CAMUNDA_CLASS = new QName("http://camunda.org/schema/1.0/bpmn",
            "class","camunda");
}
