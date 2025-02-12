//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.12 um 09:20:58 AM CET 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für tBaseElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tBaseElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}extensionElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBaseElement", propOrder = {
    "documentations",
    "extensionElements"
})
@XmlSeeAlso({
    TResourceRole.class,
    TLoopCharacteristics.class,
    TConversationNode.class,
    TArtifact.class,
    TRootElement.class,
    TFlowElement.class,
    ResourceParameterBinding.class,
    ResourceParameter.class,
    ResourceAssignmentExpression.class,
    Rendering.class,
    Relationship.class,
    Property.class,
    ParticipantAssociation.class,
    ParticipantMultiplicity.class,
    Participant.class,
    Operation.class,
    Monitoring.class,
    MessageFlowAssociation.class,
    MessageFlow.class,
    LaneSet.class,
    Lane.class,
    OutputSet.class,
    IoSpecification.class,
    IoBinding.class,
    InputSet.class,
    DataOutput.class,
    TDataAssociation.class,
    DataState.class,
    DataInput.class,
    CorrelationSubscription.class,
    CorrelationPropertyRetrievalExpression.class,
    CorrelationPropertyBinding.class,
    CorrelationKey.class,
    ConversationLink.class,
    ConversationAssociation.class,
    ComplexBehaviorDefinition.class,
    CategoryValue.class,
    Auditing.class,
    Assignment.class
})
public abstract class TBaseElement implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "documentation")
    protected List<Documentation> documentations;
    protected ExtensionElements extensionElements;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the documentations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Documentation }
     * 
     * 
     */
    public List<Documentation> getDocumentations() {
        if (documentations == null) {
            documentations = new ArrayList<Documentation>();
        }
        return this.documentations;
    }

    /**
     * Ruft den Wert der extensionElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionElements }
     *     
     */
    public ExtensionElements getExtensionElements() {
        return extensionElements;
    }

    /**
     * Legt den Wert der extensionElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionElements }
     *     
     */
    public void setExtensionElements(ExtensionElements value) {
        this.extensionElements = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
