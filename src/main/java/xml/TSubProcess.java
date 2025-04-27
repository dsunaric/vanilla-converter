//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.27 um 09:40:55 AM CEST 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tSubProcess complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tSubProcess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tActivity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}laneSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}flowElement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}artifact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="triggeredByEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSubProcess", propOrder = {
    "laneSets",
    "flowElements",
    "artifacts"
})
@XmlSeeAlso({
    TAdHocSubProcess.class,
    TTransaction.class
})
public class TSubProcess
    extends TActivity
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "laneSet", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = LaneSet.class, required = false)
    protected List<LaneSet> laneSets;
    @XmlElementRef(name = "flowElement", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TFlowElement>> flowElements;
    @XmlElementRef(name = "artifact", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TArtifact>> artifacts;
    @XmlAttribute(name = "triggeredByEvent")
    protected Boolean triggeredByEvent;

    /**
     * Gets the value of the laneSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the laneSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLaneSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneSet }
     * 
     * 
     */
    public List<LaneSet> getLaneSets() {
        if (laneSets == null) {
            laneSets = new ArrayList<LaneSet>();
        }
        return this.laneSets;
    }

    /**
     * Gets the value of the flowElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the flowElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TInclusiveGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TEventBasedGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TSequenceFlow }{@code >}
     * {@link JAXBElement }{@code <}{@link TBoundaryEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TChoreographyTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TEndEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntermediateCatchEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataStoreReference }{@code >}
     * {@link JAXBElement }{@code <}{@link TAdHocSubProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TSendTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallActivity }{@code >}
     * {@link JAXBElement }{@code <}{@link TImplicitThrowEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TIntermediateThrowEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TParallelGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TUserTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TTransaction }{@code >}
     * {@link JAXBElement }{@code <}{@link TReceiveTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TComplexGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallChoreography }{@code >}
     * {@link JAXBElement }{@code <}{@link TManualTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubProcess }{@code >}
     * {@link JAXBElement }{@code <}{@link TExclusiveGateway }{@code >}
     * {@link JAXBElement }{@code <}{@link TScriptTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TServiceTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataObjectReference }{@code >}
     * {@link JAXBElement }{@code <}{@link TBusinessRuleTask }{@code >}
     * {@link JAXBElement }{@code <}{@link TStartEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TFlowElement }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TFlowElement>> getFlowElements() {
        if (flowElements == null) {
            flowElements = new ArrayList<JAXBElement<? extends TFlowElement>>();
        }
        return this.flowElements;
    }

    /**
     * Gets the value of the artifacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the artifacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     * {@link JAXBElement }{@code <}{@link TGroup }{@code >}
     * {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     * {@link JAXBElement }{@code <}{@link TArtifact }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TArtifact>> getArtifacts() {
        if (artifacts == null) {
            artifacts = new ArrayList<JAXBElement<? extends TArtifact>>();
        }
        return this.artifacts;
    }

    /**
     * Ruft den Wert der triggeredByEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTriggeredByEvent() {
        if (triggeredByEvent == null) {
            return false;
        } else {
            return triggeredByEvent;
        }
    }

    /**
     * Legt den Wert der triggeredByEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTriggeredByEvent(Boolean value) {
        this.triggeredByEvent = value;
    }

}
