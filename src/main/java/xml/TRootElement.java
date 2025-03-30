//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.03.30 um 02:12:50 PM CEST 
//


package xml;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tRootElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="tRootElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement"&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tRootElement")
@XmlSeeAlso({
    TCategory.class,
    TCorrelationProperty.class,
    TDataStore.class,
    TEndPoint.class,
    TError.class,
    TEscalation.class,
    TCollaboration.class,
    TInterface.class,
    TItemDefinition.class,
    TMessage.class,
    TPartnerEntity.class,
    TPartnerRole.class,
    TCallableElement.class,
    TResource.class,
    TSignal.class,
    TEventDefinition.class
})
public abstract class TRootElement
    extends TBaseElement
    implements Serializable
{

    private final static long serialVersionUID = -1L;

}
