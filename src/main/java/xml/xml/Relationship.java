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
 * <p>Java-Klasse für tRelationship complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/&gt;
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="direction" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRelationshipDirection" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRelationship", propOrder = {
    "sources",
    "targets"
})
@XmlRootElement(name = "relationship")
public class Relationship
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "source", required = true)
    protected List<QName> sources;
    @XmlElement(name = "target", required = true)
    protected List<QName> targets;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "direction")
    protected TRelationshipDirection direction;

    /**
     * Gets the value of the sources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getSources() {
        if (sources == null) {
            sources = new ArrayList<QName>();
        }
        return this.sources;
    }

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getTargets() {
        if (targets == null) {
            targets = new ArrayList<QName>();
        }
        return this.targets;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der direction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TRelationshipDirection }
     *     
     */
    public TRelationshipDirection getDirection() {
        return direction;
    }

    /**
     * Legt den Wert der direction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TRelationshipDirection }
     *     
     */
    public void setDirection(TRelationshipDirection value) {
        this.direction = value;
    }

}
