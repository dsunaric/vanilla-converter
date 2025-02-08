//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.08 um 03:32:02 PM CET 
//


package org.camunda.schema.modeler._1;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
@XmlType(name = "ModelerType", propOrder = {
    "executionPlatform",
    "executionPlatformVersion"
})
@XmlRootElement(name = "modeler")
public class Modeler
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected String executionPlatform;
    @XmlElement(required = true)
    protected String executionPlatformVersion;

    /**
     * Ruft den Wert der executionPlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionPlatform() {
        return executionPlatform;
    }

    /**
     * Legt den Wert der executionPlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionPlatform(String value) {
        this.executionPlatform = value;
    }

    /**
     * Ruft den Wert der executionPlatformVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionPlatformVersion() {
        return executionPlatformVersion;
    }

    /**
     * Legt den Wert der executionPlatformVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionPlatformVersion(String value) {
        this.executionPlatformVersion = value;
    }

}
