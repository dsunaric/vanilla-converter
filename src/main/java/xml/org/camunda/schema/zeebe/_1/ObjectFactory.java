//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 01:59:32 PM CET 
//


package org.camunda.schema.zeebe._1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.camunda.schema.zeebe._1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.camunda.schema.zeebe._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IoMapping }
     * 
     */
    public IoMapping createIoMapping() {
        return new IoMapping();
    }

    /**
     * Create an instance of {@link TaskDefinition }
     * 
     */
    public TaskDefinition createTaskDefinition() {
        return new TaskDefinition();
    }

    /**
     * Create an instance of {@link IoMapping.Input }
     * 
     */
    public IoMapping.Input createIoMappingInput() {
        return new IoMapping.Input();
    }

    /**
     * Create an instance of {@link IoMapping.Output }
     * 
     */
    public IoMapping.Output createIoMappingOutput() {
        return new IoMapping.Output();
    }

    /**
     * Create an instance of {@link RetryCycle }
     * 
     */
    public RetryCycle createRetryCycle() {
        return new RetryCycle();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link CalledElement }
     * 
     */
    public CalledElement createCalledElement() {
        return new CalledElement();
    }

    /**
     * Create an instance of {@link LoopCharacteristics }
     * 
     */
    public LoopCharacteristics createLoopCharacteristics() {
        return new LoopCharacteristics();
    }

}
