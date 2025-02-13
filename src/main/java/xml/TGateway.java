//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.13 um 08:42:10 AM CET 
//


package xml;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tGateway complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tGateway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowNode"&gt;
 *       &lt;attribute name="gatewayDirection" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGatewayDirection" default="Unspecified" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGateway")
@XmlSeeAlso({
    TComplexGateway.class,
    TEventBasedGateway.class,
    TExclusiveGateway.class,
    TInclusiveGateway.class,
    TParallelGateway.class
})
public class TGateway
    extends TFlowNode
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "gatewayDirection")
    protected TGatewayDirection gatewayDirection;

    /**
     * Ruft den Wert der gatewayDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TGatewayDirection }
     *     
     */
    public TGatewayDirection getGatewayDirection() {
        if (gatewayDirection == null) {
            return TGatewayDirection.UNSPECIFIED;
        } else {
            return gatewayDirection;
        }
    }

    /**
     * Legt den Wert der gatewayDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TGatewayDirection }
     *     
     */
    public void setGatewayDirection(TGatewayDirection value) {
        this.gatewayDirection = value;
    }

}
