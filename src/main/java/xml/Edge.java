//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.05.15 um 07:06:23 PM CEST 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Edge complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Edge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}DiagramElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="waypoint" type="{http://www.omg.org/spec/DD/20100524/DC}Point" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edge", namespace = "http://www.omg.org/spec/DD/20100524/DI", propOrder = {
    "waypoints"
})
@XmlSeeAlso({
    LabeledEdge.class
})
public abstract class Edge
    extends DiagramElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "waypoint", namespace = "http://www.omg.org/spec/DD/20100524/DI", type = JAXBElement.class)
    protected List<JAXBElement<Point>> waypoints;

    /**
     * Gets the value of the waypoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the waypoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaypoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Point }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Point>> getWaypoints() {
        if (waypoints == null) {
            waypoints = new ArrayList<JAXBElement<Point>>();
        }
        return this.waypoints;
    }

}
