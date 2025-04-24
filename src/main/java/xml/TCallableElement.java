//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.22 um 12:53:52 PM CEST 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tCallableElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tCallableElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedInterfaceRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioSpecification" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}ioBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCallableElement", propOrder = {
    "supportedInterfaceReves",
    "ioSpecification",
    "ioBindings"
})
@XmlSeeAlso({
    TGlobalTask.class,
    TProcess.class
})
public class TCallableElement
    extends TRootElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "supportedInterfaceRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<QName>> supportedInterfaceReves;
    @XmlElementRef(name = "ioSpecification", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = IoSpecification.class, required = false)
    protected IoSpecification ioSpecification;
    @XmlElementRef(name = "ioBinding", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = IoBinding.class, required = false)
    protected List<IoBinding> ioBindings;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the supportedInterfaceReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the supportedInterfaceReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedInterfaceReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<QName>> getSupportedInterfaceReves() {
        if (supportedInterfaceReves == null) {
            supportedInterfaceReves = new ArrayList<JAXBElement<QName>>();
        }
        return this.supportedInterfaceReves;
    }

    /**
     * Ruft den Wert der ioSpecification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IoSpecification }
     *     
     */
    public IoSpecification getIoSpecification() {
        return ioSpecification;
    }

    /**
     * Legt den Wert der ioSpecification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IoSpecification }
     *     
     */
    public void setIoSpecification(IoSpecification value) {
        this.ioSpecification = value;
    }

    /**
     * Gets the value of the ioBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ioBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIoBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IoBinding }
     * 
     * 
     */
    public List<IoBinding> getIoBindings() {
        if (ioBindings == null) {
            ioBindings = new ArrayList<IoBinding>();
        }
        return this.ioBindings;
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

}
