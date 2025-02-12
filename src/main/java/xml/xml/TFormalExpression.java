//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.12 um 09:20:58 AM CET 
//


package xml;

import java.io.Serializable;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tFormalExpression complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tFormalExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression"&gt;
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="evaluatesToTypeRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFormalExpression")
public class TFormalExpression
    extends TExpression
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlAttribute(name = "language")
    @XmlSchemaType(name = "anyURI")
    protected String language;
    @XmlAttribute(name = "evaluatesToTypeRef")
    protected QName evaluatesToTypeRef;

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der evaluatesToTypeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getEvaluatesToTypeRef() {
        return evaluatesToTypeRef;
    }

    /**
     * Legt den Wert der evaluatesToTypeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setEvaluatesToTypeRef(QName value) {
        this.evaluatesToTypeRef = value;
    }

}
