//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.13 um 03:31:37 PM CEST 
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
 * <p>Java-Klasse für tResourceRole complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tResourceRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="resourceRef" type="{http://www.w3.org/2001/XMLSchema}QName"/&gt;
 *           &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceParameterBinding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}resourceAssignmentExpression" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
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
@XmlType(name = "tResourceRole", propOrder = {
    "resourceAssignmentExpression",
    "resourceRef",
    "resourceParameterBindings"
})
@XmlSeeAlso({
    TPerformer.class
})
public class TResourceRole
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "resourceAssignmentExpression", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = ResourceAssignmentExpression.class, required = false)
    protected ResourceAssignmentExpression resourceAssignmentExpression;
    @XmlElementRef(name = "resourceRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected JAXBElement<QName> resourceRef;
    @XmlElementRef(name = "resourceParameterBinding", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = ResourceParameterBinding.class, required = false)
    protected List<ResourceParameterBinding> resourceParameterBindings;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Ruft den Wert der resourceAssignmentExpression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResourceAssignmentExpression }
     *     
     */
    public ResourceAssignmentExpression getResourceAssignmentExpression() {
        return resourceAssignmentExpression;
    }

    /**
     * Legt den Wert der resourceAssignmentExpression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceAssignmentExpression }
     *     
     */
    public void setResourceAssignmentExpression(ResourceAssignmentExpression value) {
        this.resourceAssignmentExpression = value;
    }

    /**
     * Ruft den Wert der resourceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QName }{@code >}
     *     
     */
    public JAXBElement<QName> getResourceRef() {
        return resourceRef;
    }

    /**
     * Legt den Wert der resourceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QName }{@code >}
     *     
     */
    public void setResourceRef(JAXBElement<QName> value) {
        this.resourceRef = value;
    }

    /**
     * Gets the value of the resourceParameterBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the resourceParameterBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceParameterBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceParameterBinding }
     * 
     * 
     */
    public List<ResourceParameterBinding> getResourceParameterBindings() {
        if (resourceParameterBindings == null) {
            resourceParameterBindings = new ArrayList<ResourceParameterBinding>();
        }
        return this.resourceParameterBindings;
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
