//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 08:54:38 AM CET 
//


package org.camunda.schema.zeebe._1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="input" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="output" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "inputs",
    "outputs"
})
@XmlRootElement(name = "ioMapping")
public class IoMapping
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "input")
    protected List<IoMapping.Input> inputs;
    @XmlElement(name = "output")
    protected List<IoMapping.Output> outputs;

    /**
     * Gets the value of the inputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IoMapping.Input }
     * 
     * 
     */
    public List<IoMapping.Input> getInputs() {
        if (inputs == null) {
            inputs = new ArrayList<IoMapping.Input>();
        }
        return this.inputs;
    }

    /**
     * Gets the value of the outputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IoMapping.Output }
     * 
     * 
     */
    public List<IoMapping.Output> getOutputs() {
        if (outputs == null) {
            outputs = new ArrayList<IoMapping.Output>();
        }
        return this.outputs;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Input
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "source", required = true)
        protected String source;
        @XmlAttribute(name = "target", required = true)
        protected String target;

        /**
         * Ruft den Wert der source-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Legt den Wert der source-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Ruft den Wert der target-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Legt den Wert der target-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Output
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlAttribute(name = "source", required = true)
        protected String source;
        @XmlAttribute(name = "target", required = true)
        protected String target;

        /**
         * Ruft den Wert der source-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Legt den Wert der source-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Ruft den Wert der target-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Legt den Wert der target-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

    }

}
