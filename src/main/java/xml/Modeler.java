//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.05.15 um 07:06:23 PM CEST 
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
 * <p>Java-Klasse für ModelerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModelerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="executionPlatform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="executionPlatformVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelerType", namespace = "http://camunda.org/schema/modeler/1.0", propOrder = {
    "executionPlatform",
    "executionPlatformVersion"
})
@XmlRootElement(name = "modeler", namespace = "http://camunda.org/schema/modeler/1.0")
public class Modeler
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "executionPlatform", namespace = "http://camunda.org/schema/modeler/1.0", type = JAXBElement.class)
    protected JAXBElement<String> executionPlatform;
    @XmlElementRef(name = "executionPlatformVersion", namespace = "http://camunda.org/schema/modeler/1.0", type = JAXBElement.class)
    protected JAXBElement<String> executionPlatformVersion;

    /**
     * Ruft den Wert der executionPlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExecutionPlatform() {
        return executionPlatform;
    }

    /**
     * Legt den Wert der executionPlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExecutionPlatform(JAXBElement<String> value) {
        this.executionPlatform = value;
    }

    /**
     * Ruft den Wert der executionPlatformVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExecutionPlatformVersion() {
        return executionPlatformVersion;
    }

    /**
     * Legt den Wert der executionPlatformVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExecutionPlatformVersion(JAXBElement<String> value) {
        this.executionPlatformVersion = value;
    }

}
