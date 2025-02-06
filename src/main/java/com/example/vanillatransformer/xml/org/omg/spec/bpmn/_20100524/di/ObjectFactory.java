//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 08:54:38 AM CET 
//


package org.omg.spec.bpmn._20100524.di;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.spec.bpmn._20100524.di package. 
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

    private final static QName _BPMNShape_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNShape");
    private final static QName _BPMNEdge_QNAME = new QName("http://www.omg.org/spec/BPMN/20100524/DI", "BPMNEdge");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.spec.bpmn._20100524.di
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BPMNDiagram }
     * 
     */
    public BPMNDiagram createBPMNDiagram() {
        return new BPMNDiagram();
    }

    /**
     * Create an instance of {@link BPMNPlane }
     * 
     */
    public BPMNPlane createBPMNPlane() {
        return new BPMNPlane();
    }

    /**
     * Create an instance of {@link BPMNLabelStyle }
     * 
     */
    public BPMNLabelStyle createBPMNLabelStyle() {
        return new BPMNLabelStyle();
    }

    /**
     * Create an instance of {@link BPMNShape }
     * 
     */
    public BPMNShape createBPMNShape() {
        return new BPMNShape();
    }

    /**
     * Create an instance of {@link BPMNLabel }
     * 
     */
    public BPMNLabel createBPMNLabel() {
        return new BPMNLabel();
    }

    /**
     * Create an instance of {@link BPMNEdge }
     * 
     */
    public BPMNEdge createBPMNEdge() {
        return new BPMNEdge();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BPMNShape }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BPMNShape }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/DI", name = "BPMNShape", substitutionHeadNamespace = "http://www.omg.org/spec/DD/20100524/DI", substitutionHeadName = "DiagramElement")
    public JAXBElement<BPMNShape> createBPMNShape(BPMNShape value) {
        return new JAXBElement<BPMNShape>(_BPMNShape_QNAME, BPMNShape.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BPMNEdge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BPMNEdge }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/BPMN/20100524/DI", name = "BPMNEdge", substitutionHeadNamespace = "http://www.omg.org/spec/DD/20100524/DI", substitutionHeadName = "DiagramElement")
    public JAXBElement<BPMNEdge> createBPMNEdge(BPMNEdge value) {
        return new JAXBElement<BPMNEdge>(_BPMNEdge_QNAME, BPMNEdge.class, null, value);
    }

}
