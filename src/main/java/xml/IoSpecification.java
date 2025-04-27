//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.27 um 09:40:55 AM CEST 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tInputOutputSpecification complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tInputOutputSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}dataOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}inputSet" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}outputSet" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInputOutputSpecification", propOrder = {
    "dataInputs",
    "dataOutputs",
    "inputSets",
    "outputSets"
})
@XmlRootElement(name = "ioSpecification")
public class IoSpecification
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElementRef(name = "dataInput", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataInput.class, required = false)
    protected List<DataInput> dataInputs;
    @XmlElementRef(name = "dataOutput", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = DataOutput.class, required = false)
    protected List<DataOutput> dataOutputs;
    @XmlElementRef(name = "inputSet", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = InputSet.class)
    protected List<InputSet> inputSets;
    @XmlElementRef(name = "outputSet", namespace = "http://www.omg.org/spec/BPMN/20100524/MODEL", type = OutputSet.class)
    protected List<OutputSet> outputSets;

    /**
     * Gets the value of the dataInputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataInputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInput }
     * 
     * 
     */
    public List<DataInput> getDataInputs() {
        if (dataInputs == null) {
            dataInputs = new ArrayList<DataInput>();
        }
        return this.dataInputs;
    }

    /**
     * Gets the value of the dataOutputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataOutputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataOutput }
     * 
     * 
     */
    public List<DataOutput> getDataOutputs() {
        if (dataOutputs == null) {
            dataOutputs = new ArrayList<DataOutput>();
        }
        return this.dataOutputs;
    }

    /**
     * Gets the value of the inputSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the inputSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InputSet }
     * 
     * 
     */
    public List<InputSet> getInputSets() {
        if (inputSets == null) {
            inputSets = new ArrayList<InputSet>();
        }
        return this.inputSets;
    }

    /**
     * Gets the value of the outputSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the outputSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputSet }
     * 
     * 
     */
    public List<OutputSet> getOutputSets() {
        if (outputSets == null) {
            outputSets = new ArrayList<OutputSet>();
        }
        return this.outputSets;
    }

}
