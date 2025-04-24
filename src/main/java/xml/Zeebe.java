//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.22 um 12:53:52 PM CEST 
//


package xml;

import java.io.Serializable;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ZeebeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ZeebeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taskDefinition" type="{http://camunda.org/schema/zeebe/1.0}TaskDefinition" minOccurs="0"/&gt;
 *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscription" type="{http://camunda.org/schema/zeebe/1.0}Subscription" minOccurs="0"/&gt;
 *         &lt;element name="calledDecision" type="{http://camunda.org/schema/zeebe/1.0}CalledDecision" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeebeType", namespace = "http://camunda.org/schema/zeebe/1.0", propOrder = {
    "taskDefinition",
    "input",
    "output",
    "subscription",
    "calledDecision"
})
@XmlRootElement(name = "zeebe", namespace = "http://camunda.org/schema/zeebe/1.0")
public class Zeebe
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "taskDefinition", namespace = "http://camunda.org/schema/zeebe/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<TaskDefinition> taskDefinition;
    @XmlElementRef(name = "input", namespace = "http://camunda.org/schema/zeebe/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> input;
    @XmlElementRef(name = "output", namespace = "http://camunda.org/schema/zeebe/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> output;
    @XmlElementRef(name = "subscription", namespace = "http://camunda.org/schema/zeebe/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<Subscription> subscription;
    @XmlElementRef(name = "calledDecision", namespace = "http://camunda.org/schema/zeebe/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<CalledDecision> calledDecision;

    /**
     * Ruft den Wert der taskDefinition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaskDefinition }{@code >}
     *     
     */
    public JAXBElement<TaskDefinition> getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * Legt den Wert der taskDefinition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaskDefinition }{@code >}
     *     
     */
    public void setTaskDefinition(JAXBElement<TaskDefinition> value) {
        this.taskDefinition = value;
    }

    /**
     * Ruft den Wert der input-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInput() {
        return input;
    }

    /**
     * Legt den Wert der input-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInput(JAXBElement<String> value) {
        this.input = value;
    }

    /**
     * Ruft den Wert der output-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutput() {
        return output;
    }

    /**
     * Legt den Wert der output-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutput(JAXBElement<String> value) {
        this.output = value;
    }

    /**
     * Ruft den Wert der subscription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     *     
     */
    public JAXBElement<Subscription> getSubscription() {
        return subscription;
    }

    /**
     * Legt den Wert der subscription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Subscription }{@code >}
     *     
     */
    public void setSubscription(JAXBElement<Subscription> value) {
        this.subscription = value;
    }

    /**
     * Ruft den Wert der calledDecision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalledDecision }{@code >}
     *     
     */
    public JAXBElement<CalledDecision> getCalledDecision() {
        return calledDecision;
    }

    /**
     * Legt den Wert der calledDecision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalledDecision }{@code >}
     *     
     */
    public void setCalledDecision(JAXBElement<CalledDecision> value) {
        this.calledDecision = value;
    }

}
