package com.example.vanillatransformer.util;


import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

public class CustomNamespacePrefixMapper extends NamespacePrefixMapper {
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if ("http://camunda.org/schema/modeler/1.0".equals(namespaceUri)) {
            return "modeler";
        }
        if ("http://camunda.org/schema/1.0/bpmn".equals(namespaceUri)) {
            return "camunda";
        }
        if ("http://www.w3.org/2001/XMLSchema-instance".equals(namespaceUri)) {
            return "xsi";
        }
        if ("http://www.omg.org/spec/BPMN/20100524/MODEL".equals(namespaceUri)) {
            return "bpmn";
        }
        if ("http://www.omg.org/spec/BPMN/20100524/DI".equals(namespaceUri)) {
            return "bpmndi";
        }
        if ("http://camunda.org/schema/zeebe/1.0".equals(namespaceUri)) {
            return "zeebe";
        }
        if ("http://www.omg.org/spec/DD/20100524/DC".equals(namespaceUri)) {
            return "dc";
        }
        if ("http://www.omg.org/spec/DD/20100524/DI".equals(namespaceUri)) {
            return "di";
        }
        return suggestion; // Default behavior
    }
}