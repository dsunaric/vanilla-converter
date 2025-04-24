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
 * <p>Java-Klasse für CalledElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalledElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="processId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="propagateAllChildVariables" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="propagateAllParentVariables" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="bindingType" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="deployment"/&gt;
 *             &lt;enumeration value="latest"/&gt;
 *             &lt;enumeration value="version"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalledElement", namespace = "http://camunda.org/schema/zeebe/1.0")
@XmlRootElement(name = "calledElement", namespace = "http://camunda.org/schema/zeebe/1.0")
public class CalledElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "processId", required = true)
    protected String processId;
    @XmlAttribute(name = "propagateAllChildVariables", required = true)
    protected boolean propagateAllChildVariables;
    @XmlAttribute(name = "propagateAllParentVariables", required = true)
    protected boolean propagateAllParentVariables;
    @XmlAttribute(name = "bindingType", required = true)
    protected String bindingType;

    /**
     * Ruft den Wert der processId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Legt den Wert der processId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Ruft den Wert der propagateAllChildVariables-Eigenschaft ab.
     * 
     */
    public boolean isPropagateAllChildVariables() {
        return propagateAllChildVariables;
    }

    /**
     * Legt den Wert der propagateAllChildVariables-Eigenschaft fest.
     * 
     */
    public void setPropagateAllChildVariables(boolean value) {
        this.propagateAllChildVariables = value;
    }

    /**
     * Ruft den Wert der propagateAllParentVariables-Eigenschaft ab.
     * 
     */
    public boolean isPropagateAllParentVariables() {
        return propagateAllParentVariables;
    }

    /**
     * Legt den Wert der propagateAllParentVariables-Eigenschaft fest.
     * 
     */
    public void setPropagateAllParentVariables(boolean value) {
        this.propagateAllParentVariables = value;
    }

    /**
     * Ruft den Wert der bindingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingType() {
        return bindingType;
    }

    /**
     * Legt den Wert der bindingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingType(String value) {
        this.bindingType = value;
    }

}
