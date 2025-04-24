//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.22 um 12:53:52 PM CEST 
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
 * <p>Java-Klasse für tChoreographyActivity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tChoreographyActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="2"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="initiatingParticipantRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="loopType" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tChoreographyLoopType" default="None" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tChoreographyActivity", propOrder = {
    "participantReves",
    "correlationKeies"
})
@XmlSeeAlso({
    TCallChoreography.class,
    TChoreographyTask.class,
    TSubChoreography.class
})
public abstract class TChoreographyActivity
    extends TFlowNode
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "participantRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected List<JAXBElement<QName>> participantReves;
    @XmlElementRef(name = "correlationKey", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = CorrelationKey.class, required = false)
    protected List<CorrelationKey> correlationKeies;
    @XmlAttribute(name = "initiatingParticipantRef", required = true)
    protected QName initiatingParticipantRef;
    @XmlAttribute(name = "loopType")
    protected TChoreographyLoopType loopType;

    /**
     * Gets the value of the participantReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the participantReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<QName>> getParticipantReves() {
        if (participantReves == null) {
            participantReves = new ArrayList<JAXBElement<QName>>();
        }
        return this.participantReves;
    }

    /**
     * Gets the value of the correlationKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrelationKey }
     * 
     * 
     */
    public List<CorrelationKey> getCorrelationKeies() {
        if (correlationKeies == null) {
            correlationKeies = new ArrayList<CorrelationKey>();
        }
        return this.correlationKeies;
    }

    /**
     * Ruft den Wert der initiatingParticipantRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInitiatingParticipantRef() {
        return initiatingParticipantRef;
    }

    /**
     * Legt den Wert der initiatingParticipantRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInitiatingParticipantRef(QName value) {
        this.initiatingParticipantRef = value;
    }

    /**
     * Ruft den Wert der loopType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TChoreographyLoopType }
     *     
     */
    public TChoreographyLoopType getLoopType() {
        if (loopType == null) {
            return TChoreographyLoopType.NONE;
        } else {
            return loopType;
        }
    }

    /**
     * Legt den Wert der loopType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TChoreographyLoopType }
     *     
     */
    public void setLoopType(TChoreographyLoopType value) {
        this.loopType = value;
    }

}
