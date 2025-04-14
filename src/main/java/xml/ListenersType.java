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
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ListenersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ListenersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="executionListener" type="{http://camunda.org/schema/modeler/1.0}ListenerType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="taskListener" type="{http://camunda.org/schema/modeler/1.0}ListenerType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListenersType", namespace = "http://camunda.org/schema/modeler/1.0", propOrder = {
    "executionListeners",
    "taskListeners"
})
public class ListenersType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "executionListener", namespace = "http://camunda.org/schema/modeler/1.0", type = JAXBElement.class)
    protected List<JAXBElement<ListenerType>> executionListeners;
    @XmlElementRef(name = "taskListener", namespace = "http://camunda.org/schema/modeler/1.0", type = JAXBElement.class)
    protected List<JAXBElement<ListenerType>> taskListeners;

    /**
     * Gets the value of the executionListeners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the executionListeners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutionListeners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ListenerType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ListenerType>> getExecutionListeners() {
        if (executionListeners == null) {
            executionListeners = new ArrayList<JAXBElement<ListenerType>>();
        }
        return this.executionListeners;
    }

    /**
     * Gets the value of the taskListeners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taskListeners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaskListeners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ListenerType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ListenerType>> getTaskListeners() {
        if (taskListeners == null) {
            taskListeners = new ArrayList<JAXBElement<ListenerType>>();
        }
        return this.taskListeners;
    }

}
