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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BPMNDiagram complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BPMNDiagram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DD/20100524/DI}Diagram"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNPlane"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/DI}BPMNLabelStyle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/DI", propOrder = {
    "bpmnPlane",
    "bpmnLabelStyles"
})
@XmlRootElement(name = "BPMNDiagram", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
public class BPMNDiagram
    extends Diagram
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "BPMNPlane", namespace = "http://www.omg.org/spec/BPMN/20100524/DI", type = BPMNPlane.class)
    protected BPMNPlane bpmnPlane;
    @XmlElementRef(name = "BPMNLabelStyle", namespace = "http://www.omg.org/spec/BPMN/20100524/DI", type = BPMNLabelStyle.class, required = false)
    protected List<BPMNLabelStyle> bpmnLabelStyles;

    /**
     * Ruft den Wert der bpmnPlane-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BPMNPlane }
     *     
     */
    public BPMNPlane getBPMNPlane() {
        return bpmnPlane;
    }

    /**
     * Legt den Wert der bpmnPlane-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BPMNPlane }
     *     
     */
    public void setBPMNPlane(BPMNPlane value) {
        this.bpmnPlane = value;
    }

    /**
     * Gets the value of the bpmnLabelStyles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bpmnLabelStyles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBPMNLabelStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BPMNLabelStyle }
     * 
     * 
     */
    public List<BPMNLabelStyle> getBPMNLabelStyles() {
        if (bpmnLabelStyles == null) {
            bpmnLabelStyles = new ArrayList<BPMNLabelStyle>();
        }
        return this.bpmnLabelStyles;
    }

}
