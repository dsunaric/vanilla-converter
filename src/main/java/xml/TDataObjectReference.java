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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tDataObjectReference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tDataObjectReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tFlowElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="itemSubjectRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="dataObjectRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDataObjectReference", propOrder = {
    "dataState"
})
public class TDataObjectReference
    extends TFlowElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "dataState", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataState.class, required = false)
    protected DataState dataState;
    @XmlAttribute(name = "itemSubjectRef")
    protected QName itemSubjectRef;
    @XmlAttribute(name = "dataObjectRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object dataObjectRef;

    /**
     * Ruft den Wert der dataState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataState }
     *     
     */
    public DataState getDataState() {
        return dataState;
    }

    /**
     * Legt den Wert der dataState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataState }
     *     
     */
    public void setDataState(DataState value) {
        this.dataState = value;
    }

    /**
     * Ruft den Wert der itemSubjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getItemSubjectRef() {
        return itemSubjectRef;
    }

    /**
     * Legt den Wert der itemSubjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setItemSubjectRef(QName value) {
        this.itemSubjectRef = value;
    }

    /**
     * Ruft den Wert der dataObjectRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataObjectRef() {
        return dataObjectRef;
    }

    /**
     * Legt den Wert der dataObjectRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDataObjectRef(Object value) {
        this.dataObjectRef = value;
    }

}
