//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 08:54:38 AM CET 
//


package org.camunda.schema._1_0.bpmn;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.camunda.schema._1_0.bpmn package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.camunda.schema._1_0.bpmn
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link FormData }
     * 
     */
    public FormData createFormData() {
        return new FormData();
    }

    /**
     * Create an instance of {@link InputOutput }
     * 
     */
    public InputOutput createInputOutput() {
        return new InputOutput();
    }

    /**
     * Create an instance of {@link Properties.Property }
     * 
     */
    public Properties.Property createPropertiesProperty() {
        return new Properties.Property();
    }

    /**
     * Create an instance of {@link ExecutionListener }
     * 
     */
    public ExecutionListener createExecutionListener() {
        return new ExecutionListener();
    }

    /**
     * Create an instance of {@link TaskListener }
     * 
     */
    public TaskListener createTaskListener() {
        return new TaskListener();
    }

    /**
     * Create an instance of {@link FormData.FormField }
     * 
     */
    public FormData.FormField createFormDataFormField() {
        return new FormData.FormField();
    }

    /**
     * Create an instance of {@link InputOutput.InputParameter }
     * 
     */
    public InputOutput.InputParameter createInputOutputInputParameter() {
        return new InputOutput.InputParameter();
    }

    /**
     * Create an instance of {@link InputOutput.OutputParameter }
     * 
     */
    public InputOutput.OutputParameter createInputOutputOutputParameter() {
        return new InputOutput.OutputParameter();
    }

    /**
     * Create an instance of {@link FailedJobRetryTimeCycle }
     * 
     */
    public FailedJobRetryTimeCycle createFailedJobRetryTimeCycle() {
        return new FailedJobRetryTimeCycle();
    }

}
