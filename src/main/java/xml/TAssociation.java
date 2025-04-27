//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.27 um 09:40:55 AM CEST 
//


package xml;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tAssociation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tArtifact"&gt;
 *       &lt;attribute name="sourceRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="targetRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="associationDirection" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tAssociationDirection" default="None" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAssociation")
public class TAssociation
    extends TArtifact
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "sourceRef", required = true)
    protected QName sourceRef;
    @XmlAttribute(name = "targetRef", required = true)
    protected QName targetRef;
    @XmlAttribute(name = "associationDirection")
    protected TAssociationDirection associationDirection;

    /**
     * Ruft den Wert der sourceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getSourceRef() {
        return sourceRef;
    }

    /**
     * Legt den Wert der sourceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setSourceRef(QName value) {
        this.sourceRef = value;
    }

    /**
     * Ruft den Wert der targetRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getTargetRef() {
        return targetRef;
    }

    /**
     * Legt den Wert der targetRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setTargetRef(QName value) {
        this.targetRef = value;
    }

    /**
     * Ruft den Wert der associationDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TAssociationDirection }
     *     
     */
    public TAssociationDirection getAssociationDirection() {
        if (associationDirection == null) {
            return TAssociationDirection.NONE;
        } else {
            return associationDirection;
        }
    }

    /**
     * Legt den Wert der associationDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TAssociationDirection }
     *     
     */
    public void setAssociationDirection(TAssociationDirection value) {
        this.associationDirection = value;
    }

}
