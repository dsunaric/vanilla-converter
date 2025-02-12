//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.12 um 09:20:58 AM CET 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tOperation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inMessageRef" type="{http://www.w3.org/2001/XMLSchema}QName"/&gt;
 *         &lt;element name="outMessageRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="errorRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="implementationRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tOperation", propOrder = {
    "inMessageRef",
    "outMessageRef",
    "errorReves"
})
@XmlRootElement(name = "operation")
public class Operation
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(required = true)
    protected QName inMessageRef;
    protected QName outMessageRef;
    @XmlElement(name = "errorRef")
    protected List<QName> errorReves;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "implementationRef")
    protected QName implementationRef;

    /**
     * Ruft den Wert der inMessageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getInMessageRef() {
        return inMessageRef;
    }

    /**
     * Legt den Wert der inMessageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setInMessageRef(QName value) {
        this.inMessageRef = value;
    }

    /**
     * Ruft den Wert der outMessageRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOutMessageRef() {
        return outMessageRef;
    }

    /**
     * Legt den Wert der outMessageRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOutMessageRef(QName value) {
        this.outMessageRef = value;
    }

    /**
     * Gets the value of the errorReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errorReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getErrorReves() {
        if (errorReves == null) {
            errorReves = new ArrayList<QName>();
        }
        return this.errorReves;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der implementationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getImplementationRef() {
        return implementationRef;
    }

    /**
     * Legt den Wert der implementationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setImplementationRef(QName value) {
        this.implementationRef = value;
    }

}
