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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tTimerEventDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tTimerEventDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="timeDate" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *         &lt;element name="timeDuration" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *         &lt;element name="timeCycle" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTimerEventDefinition", propOrder = {
    "timeCycle",
    "timeDuration",
    "timeDate"
})
public class TTimerEventDefinition
    extends TEventDefinition
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected TExpression timeCycle;
    protected TExpression timeDuration;
    protected TExpression timeDate;

    /**
     * Ruft den Wert der timeCycle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeCycle() {
        return timeCycle;
    }

    /**
     * Legt den Wert der timeCycle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeCycle(TExpression value) {
        this.timeCycle = value;
    }

    /**
     * Ruft den Wert der timeDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeDuration() {
        return timeDuration;
    }

    /**
     * Legt den Wert der timeDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeDuration(TExpression value) {
        this.timeDuration = value;
    }

    /**
     * Ruft den Wert der timeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeDate() {
        return timeDate;
    }

    /**
     * Legt den Wert der timeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeDate(TExpression value) {
        this.timeDate = value;
    }

}
