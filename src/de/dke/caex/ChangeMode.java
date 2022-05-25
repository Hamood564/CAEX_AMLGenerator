//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.1 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.04 at 05:08:34 PM BST 
//


package de.dke.caex;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChangeMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="state"/&gt;
 *     &lt;enumeration value="create"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="change"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeMode")
@XmlEnum
public enum ChangeMode {

    @XmlEnumValue("state")
    STATE("state"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("change")
    CHANGE("change");
    private final String value;

    ChangeMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChangeMode fromValue(String v) {
        for (ChangeMode c: ChangeMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
