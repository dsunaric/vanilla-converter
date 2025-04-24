//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.22 um 12:53:52 PM CEST 
//


package xml;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LoopCharacteristics complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LoopCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="inputCollection" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="inputElement" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoopCharacteristics", namespace = "http://camunda.org/schema/zeebe/1.0")
@XmlRootElement(name = "loopCharacteristics", namespace = "http://camunda.org/schema/zeebe/1.0")
public class LoopCharacteristics
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "inputCollection", required = true)
    protected String inputCollection;
    @XmlAttribute(name = "inputElement", required = true)
    protected String inputElement;

    /**
     * Ruft den Wert der inputCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputCollection() {
        return inputCollection;
    }

    /**
     * Legt den Wert der inputCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputCollection(String value) {
        this.inputCollection = value;
    }

    /**
     * Ruft den Wert der inputElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputElement() {
        return inputElement;
    }

    /**
     * Legt den Wert der inputElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputElement(String value) {
        this.inputElement = value;
    }

}
