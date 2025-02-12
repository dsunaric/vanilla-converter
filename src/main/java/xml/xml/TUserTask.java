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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tUserTask complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tUserTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tTask"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}rendering" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="implementation" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tImplementation" default="##unspecified" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tUserTask", propOrder = {
    "renderings"
})
public class TUserTask
    extends TTask
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "rendering")
    protected List<Rendering> renderings;
    @XmlAttribute(name = "implementation")
    protected String implementation;

    /**
     * Gets the value of the renderings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the renderings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenderings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rendering }
     * 
     * 
     */
    public List<Rendering> getRenderings() {
        if (renderings == null) {
            renderings = new ArrayList<Rendering>();
        }
        return this.renderings;
    }

    /**
     * Ruft den Wert der implementation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementation() {
        if (implementation == null) {
            return "##unspecified";
        } else {
            return implementation;
        }
    }

    /**
     * Legt den Wert der implementation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementation(String value) {
        this.implementation = value;
    }

}
