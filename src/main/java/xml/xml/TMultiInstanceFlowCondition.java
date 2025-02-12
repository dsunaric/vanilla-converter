//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2025.02.12 um 09:20:58 AM CET 
//


package xml;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für tMultiInstanceFlowCondition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="tMultiInstanceFlowCondition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="One"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Complex"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tMultiInstanceFlowCondition")
@XmlEnum
public enum TMultiInstanceFlowCondition {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("One")
    ONE("One"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Complex")
    COMPLEX("Complex");
    private final String value;

    TMultiInstanceFlowCondition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TMultiInstanceFlowCondition fromValue(String v) {
        for (TMultiInstanceFlowCondition c: TMultiInstanceFlowCondition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
