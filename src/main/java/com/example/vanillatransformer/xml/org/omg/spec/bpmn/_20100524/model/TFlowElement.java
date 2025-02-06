//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 08:54:38 AM CET 
//


package org.omg.spec.bpmn._20100524.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tFlowElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tFlowElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}auditing" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}monitoring" minOccurs="0"/&gt;
 *         &lt;element name="categoryValueRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFlowElement", propOrder = {
    "auditing",
    "monitoring",
    "categoryValueReves"
})
@XmlSeeAlso({
    TDataObject.class,
    TDataObjectReference.class,
    TDataStoreReference.class,
    TSequenceFlow.class,
    TFlowNode.class
})
public abstract class TFlowElement
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Auditing auditing;
    protected Monitoring monitoring;
    @XmlElement(name = "categoryValueRef")
    protected List<QName> categoryValueReves;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Ruft den Wert der auditing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Auditing }
     *     
     */
    public Auditing getAuditing() {
        return auditing;
    }

    /**
     * Legt den Wert der auditing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Auditing }
     *     
     */
    public void setAuditing(Auditing value) {
        this.auditing = value;
    }

    /**
     * Ruft den Wert der monitoring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Monitoring }
     *     
     */
    public Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * Legt den Wert der monitoring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Monitoring }
     *     
     */
    public void setMonitoring(Monitoring value) {
        this.monitoring = value;
    }

    /**
     * Gets the value of the categoryValueReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the categoryValueReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryValueReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getCategoryValueReves() {
        if (categoryValueReves == null) {
            categoryValueReves = new ArrayList<QName>();
        }
        return this.categoryValueReves;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
