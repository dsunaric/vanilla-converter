//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.04.22 um 12:53:52 PM CEST 
//


package xml;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MessageVisibleKind.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MessageVisibleKind"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="initiating"/&gt;
 *     &lt;enumeration value="non_initiating"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageVisibleKind", namespace = "http://www.omg.org/spec/BPMN/20100524/DI")
@XmlEnum
public enum MessageVisibleKind {

    @XmlEnumValue("initiating")
    INITIATING("initiating"),
    @XmlEnumValue("non_initiating")
    NON_INITIATING("non_initiating");
    private final String value;

    MessageVisibleKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageVisibleKind fromValue(String v) {
        for (MessageVisibleKind c: MessageVisibleKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
