//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.03.30 um 02:12:50 PM CEST 
//


package xml;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tItemDefinition complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tItemDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tRootElement"&gt;
 *       &lt;attribute name="structureRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="isCollection" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="itemKind" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tItemKind" default="Information" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tItemDefinition")
public class TItemDefinition
    extends TRootElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "structureRef")
    protected QName structureRef;
    @XmlAttribute(name = "isCollection")
    protected Boolean isCollection;
    @XmlAttribute(name = "itemKind")
    protected TItemKind itemKind;

    /**
     * Ruft den Wert der structureRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getStructureRef() {
        return structureRef;
    }

    /**
     * Legt den Wert der structureRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setStructureRef(QName value) {
        this.structureRef = value;
    }

    /**
     * Ruft den Wert der isCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCollection() {
        if (isCollection == null) {
            return false;
        } else {
            return isCollection;
        }
    }

    /**
     * Legt den Wert der isCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCollection(Boolean value) {
        this.isCollection = value;
    }

    /**
     * Ruft den Wert der itemKind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TItemKind }
     *     
     */
    public TItemKind getItemKind() {
        if (itemKind == null) {
            return TItemKind.INFORMATION;
        } else {
            return itemKind;
        }
    }

    /**
     * Legt den Wert der itemKind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TItemKind }
     *     
     */
    public void setItemKind(TItemKind value) {
        this.itemKind = value;
    }

}
