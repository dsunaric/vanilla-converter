//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.13 um 08:42:10 AM CET 
//


package xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tMultiInstanceLoopCharacteristics complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tMultiInstanceLoopCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tLoopCharacteristics"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="loopCardinality" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *         &lt;element name="loopDataInputRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="loopDataOutputRef" type="{http://www.w3.org/2001/XMLSchema}QName" minOccurs="0"/&gt;
 *         &lt;element name="inputDataItem" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tDataInput" minOccurs="0"/&gt;
 *         &lt;element name="outputDataItem" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tDataOutput" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}complexBehaviorDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="completionCondition" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isSequential" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="behavior" type="{http://www.omg.org/spec/BPMN/20100524/MODEL}tMultiInstanceFlowCondition" default="All" /&gt;
 *       &lt;attribute name="oneBehaviorEventRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;attribute name="noneBehaviorEventRef" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tMultiInstanceLoopCharacteristics", propOrder = {
    "loopCardinality",
    "loopDataInputRef",
    "loopDataOutputRef",
    "inputDataItem",
    "outputDataItem",
    "complexBehaviorDefinitions",
    "completionCondition"
})
public class TMultiInstanceLoopCharacteristics
    extends TLoopCharacteristics
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected TExpression loopCardinality;
    protected QName loopDataInputRef;
    protected QName loopDataOutputRef;
    protected DataInput inputDataItem;
    protected DataOutput outputDataItem;
    @XmlElement(name = "complexBehaviorDefinition")
    protected List<ComplexBehaviorDefinition> complexBehaviorDefinitions;
    protected TExpression completionCondition;
    @XmlAttribute(name = "isSequential")
    protected Boolean isSequential;
    @XmlAttribute(name = "behavior")
    protected TMultiInstanceFlowCondition behavior;
    @XmlAttribute(name = "oneBehaviorEventRef")
    protected QName oneBehaviorEventRef;
    @XmlAttribute(name = "noneBehaviorEventRef")
    protected QName noneBehaviorEventRef;

    /**
     * Ruft den Wert der loopCardinality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getLoopCardinality() {
        return loopCardinality;
    }

    /**
     * Legt den Wert der loopCardinality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setLoopCardinality(TExpression value) {
        this.loopCardinality = value;
    }

    /**
     * Ruft den Wert der loopDataInputRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLoopDataInputRef() {
        return loopDataInputRef;
    }

    /**
     * Legt den Wert der loopDataInputRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLoopDataInputRef(QName value) {
        this.loopDataInputRef = value;
    }

    /**
     * Ruft den Wert der loopDataOutputRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getLoopDataOutputRef() {
        return loopDataOutputRef;
    }

    /**
     * Legt den Wert der loopDataOutputRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setLoopDataOutputRef(QName value) {
        this.loopDataOutputRef = value;
    }

    /**
     * Ruft den Wert der inputDataItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataInput }
     *     
     */
    public DataInput getInputDataItem() {
        return inputDataItem;
    }

    /**
     * Legt den Wert der inputDataItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataInput }
     *     
     */
    public void setInputDataItem(DataInput value) {
        this.inputDataItem = value;
    }

    /**
     * Ruft den Wert der outputDataItem-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataOutput }
     *     
     */
    public DataOutput getOutputDataItem() {
        return outputDataItem;
    }

    /**
     * Legt den Wert der outputDataItem-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataOutput }
     *     
     */
    public void setOutputDataItem(DataOutput value) {
        this.outputDataItem = value;
    }

    /**
     * Gets the value of the complexBehaviorDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the complexBehaviorDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexBehaviorDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComplexBehaviorDefinition }
     * 
     * 
     */
    public List<ComplexBehaviorDefinition> getComplexBehaviorDefinitions() {
        if (complexBehaviorDefinitions == null) {
            complexBehaviorDefinitions = new ArrayList<ComplexBehaviorDefinition>();
        }
        return this.complexBehaviorDefinitions;
    }

    /**
     * Ruft den Wert der completionCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getCompletionCondition() {
        return completionCondition;
    }

    /**
     * Legt den Wert der completionCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setCompletionCondition(TExpression value) {
        this.completionCondition = value;
    }

    /**
     * Ruft den Wert der isSequential-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsSequential() {
        if (isSequential == null) {
            return false;
        } else {
            return isSequential;
        }
    }

    /**
     * Legt den Wert der isSequential-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSequential(Boolean value) {
        this.isSequential = value;
    }

    /**
     * Ruft den Wert der behavior-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TMultiInstanceFlowCondition }
     *     
     */
    public TMultiInstanceFlowCondition getBehavior() {
        if (behavior == null) {
            return TMultiInstanceFlowCondition.ALL;
        } else {
            return behavior;
        }
    }

    /**
     * Legt den Wert der behavior-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TMultiInstanceFlowCondition }
     *     
     */
    public void setBehavior(TMultiInstanceFlowCondition value) {
        this.behavior = value;
    }

    /**
     * Ruft den Wert der oneBehaviorEventRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getOneBehaviorEventRef() {
        return oneBehaviorEventRef;
    }

    /**
     * Legt den Wert der oneBehaviorEventRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setOneBehaviorEventRef(QName value) {
        this.oneBehaviorEventRef = value;
    }

    /**
     * Ruft den Wert der noneBehaviorEventRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getNoneBehaviorEventRef() {
        return noneBehaviorEventRef;
    }

    /**
     * Legt den Wert der noneBehaviorEventRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setNoneBehaviorEventRef(QName value) {
        this.noneBehaviorEventRef = value;
    }

}
