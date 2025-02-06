//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 01:59:32 PM CET 
//


package org.camunda.schema.zeebe._1;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="inputCollection" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="inputElement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="outputCollection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="outputElement" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="parallel" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "loopCharacteristics")
public class LoopCharacteristics
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "inputCollection", required = true)
    protected String inputCollection;
    @XmlAttribute(name = "inputElement")
    protected String inputElement;
    @XmlAttribute(name = "outputCollection")
    protected String outputCollection;
    @XmlAttribute(name = "outputElement")
    protected String outputElement;
    @XmlAttribute(name = "parallel")
    protected Boolean parallel;

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

    /**
     * Ruft den Wert der outputCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputCollection() {
        return outputCollection;
    }

    /**
     * Legt den Wert der outputCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputCollection(String value) {
        this.outputCollection = value;
    }

    /**
     * Ruft den Wert der outputElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputElement() {
        return outputElement;
    }

    /**
     * Legt den Wert der outputElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputElement(String value) {
        this.outputElement = value;
    }

    /**
     * Ruft den Wert der parallel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParallel() {
        return parallel;
    }

    /**
     * Legt den Wert der parallel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParallel(Boolean value) {
        this.parallel = value;
    }

}
