//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.03.12 um 09:13:58 PM CET 
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
 * <p>Java-Klasse für tCollaboration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tCollaboration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}messageFlow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}artifact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationNode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participantAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}messageFlowAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="choreographyRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}conversationLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="isClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCollaboration", propOrder = {
    "participants",
    "messageFlows",
    "artifacts",
    "conversationNodes",
    "conversationAssociations",
    "participantAssociations",
    "messageFlowAssociations",
    "correlationKeies",
    "choreographyReves",
    "conversationLinks"
})
@XmlSeeAlso({
    TChoreography.class,
    TGlobalConversation.class
})
public class TCollaboration
    extends TRootElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "participant", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = Participant.class, required = false)
    protected List<Participant> participants;
    @XmlElementRef(name = "messageFlow", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = MessageFlow.class, required = false)
    protected List<MessageFlow> messageFlows;
    @XmlElementRef(name = "artifact", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TArtifact>> artifacts;
    @XmlElementRef(name = "conversationNode", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends TConversationNode>> conversationNodes;
    @XmlElementRef(name = "conversationAssociation", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = ConversationAssociation.class, required = false)
    protected List<ConversationAssociation> conversationAssociations;
    @XmlElementRef(name = "participantAssociation", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = ParticipantAssociation.class, required = false)
    protected List<ParticipantAssociation> participantAssociations;
    @XmlElementRef(name = "messageFlowAssociation", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = MessageFlowAssociation.class, required = false)
    protected List<MessageFlowAssociation> messageFlowAssociations;
    @XmlElementRef(name = "correlationKey", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = CorrelationKey.class, required = false)
    protected List<CorrelationKey> correlationKeies;
    @XmlElementRef(name = "choreographyRef", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = JAXBElement.class, required = false)
    protected List<JAXBElement<QName>> choreographyReves;
    @XmlElementRef(name = "conversationLink", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = ConversationLink.class, required = false)
    protected List<ConversationLink> conversationLinks;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "isClosed")
    protected Boolean isClosed;

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    public List<Participant> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<Participant>();
        }
        return this.participants;
    }

    /**
     * Gets the value of the messageFlows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageFlows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFlows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFlow }
     * 
     * 
     */
    public List<MessageFlow> getMessageFlows() {
        if (messageFlows == null) {
            messageFlows = new ArrayList<MessageFlow>();
        }
        return this.messageFlows;
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
     * {@link JAXBElement }{@code <}{@link TTextAnnotation }{@code >}
     * {@link JAXBElement }{@code <}{@link TAssociation }{@code >}
     * {@link JAXBElement }{@code <}{@link TGroup }{@code >}
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
     * Gets the value of the conversationNodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conversationNodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TSubConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TCallConversation }{@code >}
     * {@link JAXBElement }{@code <}{@link TConversationNode }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TConversationNode>> getConversationNodes() {
        if (conversationNodes == null) {
            conversationNodes = new ArrayList<JAXBElement<? extends TConversationNode>>();
        }
        return this.conversationNodes;
    }

    /**
     * Gets the value of the conversationAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conversationAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversationAssociation }
     * 
     * 
     */
    public List<ConversationAssociation> getConversationAssociations() {
        if (conversationAssociations == null) {
            conversationAssociations = new ArrayList<ConversationAssociation>();
        }
        return this.conversationAssociations;
    }

    /**
     * Gets the value of the participantAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the participantAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantAssociation }
     * 
     * 
     */
    public List<ParticipantAssociation> getParticipantAssociations() {
        if (participantAssociations == null) {
            participantAssociations = new ArrayList<ParticipantAssociation>();
        }
        return this.participantAssociations;
    }

    /**
     * Gets the value of the messageFlowAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the messageFlowAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFlowAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFlowAssociation }
     * 
     * 
     */
    public List<MessageFlowAssociation> getMessageFlowAssociations() {
        if (messageFlowAssociations == null) {
            messageFlowAssociations = new ArrayList<MessageFlowAssociation>();
        }
        return this.messageFlowAssociations;
    }

    /**
     * Gets the value of the correlationKeies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKeies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationKeies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrelationKey }
     * 
     * 
     */
    public List<CorrelationKey> getCorrelationKeies() {
        if (correlationKeies == null) {
            correlationKeies = new ArrayList<CorrelationKey>();
        }
        return this.correlationKeies;
    }

    /**
     * Gets the value of the choreographyReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the choreographyReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoreographyReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * 
     */
    public List<JAXBElement<QName>> getChoreographyReves() {
        if (choreographyReves == null) {
            choreographyReves = new ArrayList<JAXBElement<QName>>();
        }
        return this.choreographyReves;
    }

    /**
     * Gets the value of the conversationLinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conversationLinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversationLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversationLink }
     * 
     * 
     */
    public List<ConversationLink> getConversationLinks() {
        if (conversationLinks == null) {
            conversationLinks = new ArrayList<ConversationLink>();
        }
        return this.conversationLinks;
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
     * Ruft den Wert der isClosed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsClosed() {
        if (isClosed == null) {
            return false;
        } else {
            return isClosed;
        }
    }

    /**
     * Legt den Wert der isClosed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsClosed(Boolean value) {
        this.isClosed = value;
    }

}
