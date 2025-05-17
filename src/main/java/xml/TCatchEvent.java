//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.05.15 um 07:06:23 PM CEST 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tCatchEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tCatchEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutputAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}outputSet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}eventDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="parallelMultiple" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCatchEvent", propOrder = {
    "dataOutputs",
    "dataOutputAssociations",
    "outputSet",
    "eventDefinitions",
    "eventDefinitionReves"
})
@XmlSeeAlso({
    TBoundaryEvent.class,
    TIntermediateCatchEvent.class,
    TStartEvent.class
})
public abstract class TCatchEvent
    extends TEvent
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "dataOutput", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataOutput.class, required = false)
    protected List<DataOutput> dataOutputs;
    @XmlElementRef(name = "dataOutputAssociation", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataOutputAssociation.class, required = false)
    protected List<DataOutputAssociation> dataOutputAssociations;
    @XmlElementRef(name = "outputSet", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = OutputSet.class, required = false)
    protected OutputSet outputSet;
    @XmlElementRef(name = "eventDefinition", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TEventDefinition>> eventDefinitions;
    @XmlElementRef(name = "eventDefinitionRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<QName>> eventDefinitionReves;
    @XmlAttribute(name = "parallelMultiple")
    protected Boolean parallelMultiple;

    /**
     * Gets the value of the dataOutputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataOutput }
     * 
     * 
     */
    public List<DataOutput> getDataOutputs() {
        if (dataOutputs == null) {
            dataOutputs = new ArrayList<DataOutput>();
        }
        return this.dataOutputs;
    }

    /**
     * Gets the value of the dataOutputAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutputAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOutputAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataOutputAssociation }
     * 
     * 
     */
    public List<DataOutputAssociation> getDataOutputAssociations() {
        if (dataOutputAssociations == null) {
            dataOutputAssociations = new ArrayList<DataOutputAssociation>();
        }
        return this.dataOutputAssociations;
    }

    /**
     * Ruft den Wert der outputSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutputSet }
     *     
     */
    public OutputSet getOutputSet() {
        return outputSet;
    }

    /**
     * Legt den Wert der outputSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputSet }
     *     
     */
    public void setOutputSet(OutputSet value) {
        this.outputSet = value;
    }

    /**
     * Gets the value of the eventDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventDefinition }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TEventDefinition>> getEventDefinitions() {
        if (eventDefinitions == null) {
            eventDefinitions = new ArrayList<JAXBElement<? extends TEventDefinition>>();
        }
        return this.eventDefinitions;
    }

    /**
     * Gets the value of the eventDefinitionReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eventDefinitionReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDefinitionReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<QName>> getEventDefinitionReves() {
        if (eventDefinitionReves == null) {
            eventDefinitionReves = new ArrayList<JAXBElement<QName>>();
        }
        return this.eventDefinitionReves;
    }

    /**
     * Ruft den Wert der parallelMultiple-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParallelMultiple() {
        if (parallelMultiple == null) {
            return false;
        } else {
            return parallelMultiple;
        }
    }

    /**
     * Legt den Wert der parallelMultiple-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallelMultiple(Boolean value) {
        this.parallelMultiple = value;
    }

}
