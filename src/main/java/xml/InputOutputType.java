//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.03.30 um 02:12:50 PM CEST 
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
 * <p>Java-Klasse für InputOutputType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InputOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputParameter" type="{http://camunda.org/schema/modeler/1.0}ParameterType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="outputParameter" type="{http://camunda.org/schema/modeler/1.0}ParameterType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputOutputType", namespace = "http://camunda.org/schema/modeler/1.0", propOrder = {
    "inputParameters",
    "outputParameters"
})
public class InputOutputType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "inputParameter", namespace = "http://camunda.org/schema/modeler/1.0", type = JAXBElement.class)
    protected List<JAXBElement<ParameterType>> inputParameters;
    @XmlElementRef(name = "outputParameter", namespace = "http://camunda.org/schema/modeler/1.0", type = JAXBElement.class)
    protected List<JAXBElement<ParameterType>> outputParameters;

    /**
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ParameterType>> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<JAXBElement<ParameterType>>();
        }
        return this.inputParameters;
    }

    /**
     * Gets the value of the outputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParameterType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ParameterType>> getOutputParameters() {
        if (outputParameters == null) {
            outputParameters = new ArrayList<JAXBElement<ParameterType>>();
        }
        return this.outputParameters;
    }

}
