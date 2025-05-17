//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.05.15 um 07:06:23 PM CEST 
//


package xml;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tEventBasedGateway complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tEventBasedGateway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGateway"&gt;
 *       &lt;attribute name="instantiate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="eventGatewayType" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventBasedGatewayType" default="Exclusive" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEventBasedGateway")
public class TEventBasedGateway
    extends TGateway
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "instantiate")
    protected Boolean instantiate;
    @XmlAttribute(name = "eventGatewayType")
    protected TEventBasedGatewayType eventGatewayType;

    /**
     * Ruft den Wert der instantiate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInstantiate() {
        if (instantiate == null) {
            return false;
        } else {
            return instantiate;
        }
    }

    /**
     * Legt den Wert der instantiate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstantiate(Boolean value) {
        this.instantiate = value;
    }

    /**
     * Ruft den Wert der eventGatewayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TEventBasedGatewayType }
     *     
     */
    public TEventBasedGatewayType getEventGatewayType() {
        if (eventGatewayType == null) {
            return TEventBasedGatewayType.EXCLUSIVE;
        } else {
            return eventGatewayType;
        }
    }

    /**
     * Legt den Wert der eventGatewayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TEventBasedGatewayType }
     *     
     */
    public void setEventGatewayType(TEventBasedGatewayType value) {
        this.eventGatewayType = value;
    }

}
