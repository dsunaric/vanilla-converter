//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 08:54:38 AM CET 
//


package org.omg.spec.bpmn._20100524.model;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tAdHocSubProcess complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tAdHocSubProcess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tSubProcess"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="completionCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="cancelRemainingInstances" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="ordering" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tAdHocOrdering" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAdHocSubProcess", propOrder = {
    "completionCondition"
})
public class TAdHocSubProcess
    extends TSubProcess
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected TExpression completionCondition;
    @XmlAttribute(name = "cancelRemainingInstances")
    protected Boolean cancelRemainingInstances;
    @XmlAttribute(name = "ordering")
    protected TAdHocOrdering ordering;

    /**
     * Ruft den Wert der completionCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * Legt den Wert der completionCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setCompletionCondition(TExpression value) {
        this.completionCondition = value;
    }

    /**
     * Ruft den Wert der cancelRemainingInstances-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCancelRemainingInstances() {
        if (cancelRemainingInstances == null) {
            return true;
        } else {
            return cancelRemainingInstances;
        }
    }

    /**
     * Legt den Wert der cancelRemainingInstances-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelRemainingInstances(Boolean value) {
        this.cancelRemainingInstances = value;
    }

    /**
     * Ruft den Wert der ordering-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAdHocOrdering }
     *     
     */
    public TAdHocOrdering getOrdering() {
        return ordering;
    }

    /**
     * Legt den Wert der ordering-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdHocOrdering }
     *     
     */
    public void setOrdering(TAdHocOrdering value) {
        this.ordering = value;
    }

}
