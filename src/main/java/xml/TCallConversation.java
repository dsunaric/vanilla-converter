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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tCallConversation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tCallConversation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tConversationNode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}participantAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="calledCollaborationRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCallConversation", propOrder = {
    "participantAssociations"
})
public class TCallConversation
    extends TConversationNode
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "participantAssociation", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = ParticipantAssociation.class, required = false)
    protected List<ParticipantAssociation> participantAssociations;
    @XmlAttribute(name = "calledCollaborationRef")
    protected QName calledCollaborationRef;

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
     * Ruft den Wert der calledCollaborationRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getCalledCollaborationRef() {
        return calledCollaborationRef;
    }

    /**
     * Legt den Wert der calledCollaborationRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setCalledCollaborationRef(QName value) {
        this.calledCollaborationRef = value;
    }

}
