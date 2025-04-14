//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.13 um 03:31:37 PM CEST 
//


package xml;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tComplexBehaviorDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tComplexBehaviorDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="condition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression"/&gt;
 *         &lt;element name="event" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplicitThrowEvent" minOccurs="0"/&gt;
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
@XmlType(name = "tComplexBehaviorDefinition", propOrder = {
    "condition",
    "event"
})
@XmlRootElement(name = "complexBehaviorDefinition")
public class ComplexBehaviorDefinition
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "condition", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected JAXBElement<TFormalExpression> condition;
    @XmlElementRef(name = "event", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected JAXBElement<TImplicitThrowEvent> event;

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     
     */
    public JAXBElement<TFormalExpression> getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     
     */
    public void setCondition(JAXBElement<TFormalExpression> value) {
        this.condition = value;
    }

    /**
     * Ruft den Wert der event-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     *     
     */
    public JAXBElement<TImplicitThrowEvent> getEvent() {
        return event;
    }

    /**
     * Legt den Wert der event-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     *     
     */
    public void setEvent(JAXBElement<TImplicitThrowEvent> value) {
        this.event = value;
    }

}
