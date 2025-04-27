//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.27 um 09:40:55 AM CEST 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tThrowEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tThrowEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInputAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}inputSet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}eventDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tThrowEvent", propOrder = {
    "dataInputs",
    "dataInputAssociations",
    "inputSet",
    "eventDefinitions",
    "eventDefinitionReves"
})
@XmlSeeAlso({
    TImplicitThrowEvent.class,
    TEndEvent.class,
    TIntermediateThrowEvent.class
})
public abstract class TThrowEvent
    extends TEvent
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "dataInput", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataInput.class, required = false)
    protected List<DataInput> dataInputs;
    @XmlElementRef(name = "dataInputAssociation", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataInputAssociation.class, required = false)
    protected List<DataInputAssociation> dataInputAssociations;
    @XmlElementRef(name = "inputSet", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = InputSet.class, required = false)
    protected InputSet inputSet;
    @XmlElementRef(name = "eventDefinition", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TEventDefinition>> eventDefinitions;
    @XmlElementRef(name = "eventDefinitionRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<QName>> eventDefinitionReves;

    /**
     * Gets the value of the dataInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInput }
     * 
     * 
     */
    public List<DataInput> getDataInputs() {
        if (dataInputs == null) {
            dataInputs = new ArrayList<DataInput>();
        }
        return this.dataInputs;
    }

    /**
     * Gets the value of the dataInputAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataInputAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInputAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInputAssociation }
     * 
     * 
     */
    public List<DataInputAssociation> getDataInputAssociations() {
        if (dataInputAssociations == null) {
            dataInputAssociations = new ArrayList<DataInputAssociation>();
        }
        return this.dataInputAssociations;
    }

    /**
     * Ruft den Wert der inputSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InputSet }
     *     
     */
    public InputSet getInputSet() {
        return inputSet;
    }

    /**
     * Legt den Wert der inputSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InputSet }
     *     
     */
    public void setInputSet(InputSet value) {
        this.inputSet = value;
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
     * {@link JAXBElement }{@code <}{@link TLinkEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TSignalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTerminateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimerEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCompensateEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TConditionalEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TErrorEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TMessageEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TCancelEventDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link TEscalationEventDefinition }{@code >}
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

}
