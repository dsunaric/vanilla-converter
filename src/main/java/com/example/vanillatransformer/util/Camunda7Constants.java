package com.example.vanillatransformer.util;

import javax.xml.namespace.QName;

public class Camunda7Constants {
    public static final  String MODELER_EXECUTIONPLATFORM = "Camunda Platform";
    public static final  String MODELER_EXECUTIONPLATFORM_VERSION = "7.21.0";

    public static QName CAMUNDA_DELEGATE_EXPRESSION = new QName("http://camunda.org/schema/1.0/bpmn",
            "delegateExpression","camunda");



    public static QName CAMUNDA_DECISION_REF = new QName("http://camunda.org/schema/1.0/bpmn",
            "decisionRef","camunda");

    public static QName CAMUNDA_CONNECTOR = new QName("http://camunda.org/schema/1.0/bpmn",
            "connector","camunda");


    public static QName CAMUNDA_RESULT_VARIABLE = new QName("http://camunda.org/schema/1.0/bpmn",
            "resultVariable","camunda");

    public static QName CAMUNDA_EXPRESSION = new QName("http://camunda.org/schema/1.0/bpmn",
            "expression","camunda");

    public static QName CAMUNDA_TOPIC = new QName("http://camunda.org/schema/1.0/bpmn",
            "topic","camunda");

    public static QName CAMUNDA_CLASS = new QName("http://camunda.org/schema/1.0/bpmn",
            "class","camunda");

    public static QName CAMUNDA_CALLED_ELEMENT_BINDING = new QName("http://camunda.org/schema/1.0/bpmn",
            "calledElementBinding","camunda");



    public static QName CAMUNDA_ERROR_MESSAGE = new QName("http://camunda.org/schema/1.0/bpmn",
            "errorMessage","camunda");


    public static QName CAMUNDA_LOOP_ELEMENT_VARIABLE = new QName("http://camunda.org/schema/1.0/bpmn",
            "elementVariable","camunda");


    public static QName CAMUNDA_LOOP_COLLECTION = new QName("http://camunda.org/schema/1.0/bpmn",
            "collection","camunda");
}
