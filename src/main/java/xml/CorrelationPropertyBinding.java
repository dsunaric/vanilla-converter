//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.05.15 um 07:06:23 PM CEST 
//


package xml;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tCorrelationPropertyBinding complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tCorrelationPropertyBinding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataPath" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFormalExpression"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="correlationPropertyRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCorrelationPropertyBinding", propOrder = {
    "dataPath"
})
@XmlRootElement(name = "correlationPropertyBinding")
public class CorrelationPropertyBinding
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "dataPath", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class)
    protected JAXBElement<TFormalExpression> dataPath;
    @XmlAttribute(name = "correlationPropertyRef", required = true)
    protected QName correlationPropertyRef;

    /**
     * Ruft den Wert der dataPath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     
     */
    public JAXBElement<TFormalExpression> getDataPath() {
        return dataPath;
    }

    /**
     * Legt den Wert der dataPath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TFormalExpression }{@code >}
     *     
     */
    public void setDataPath(JAXBElement<TFormalExpression> value) {
        this.dataPath = value;
    }

    /**
     * Ruft den Wert der correlationPropertyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getCorrelationPropertyRef() {
        return correlationPropertyRef;
    }

    /**
     * Legt den Wert der correlationPropertyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setCorrelationPropertyRef(QName value) {
        this.correlationPropertyRef = value;
    }

}
