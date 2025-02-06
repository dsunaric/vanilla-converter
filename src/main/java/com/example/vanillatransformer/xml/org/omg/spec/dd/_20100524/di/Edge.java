//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.06 um 08:54:38 AM CET 
//


package org.omg.spec.dd._20100524.di;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.omg.spec.dd._20100524.dc.Point;


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
@XmlType(name = "Edge", propOrder = {
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
    @XmlElement(name = "waypoint", required = true)
    protected List<Point> waypoints;

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
     * {@link Point }
     * 
     * 
     */
    public List<Point> getWaypoints() {
        if (waypoints == null) {
            waypoints = new ArrayList<Point>();
        }
        return this.waypoints;
    }

}
