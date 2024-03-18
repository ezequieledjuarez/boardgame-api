package com.boargame.api.model.soap.response;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
@Data
@XmlRootElement(name = "name")
public class Name {

    private String primary;
    private int sortindex;
    private String value;

    @XmlAttribute(name = "primary")
    public String getPrimary() {
        return primary;
    }

    @XmlAttribute(name = "sortindex")
    public int getSortindex() {
        return sortindex;
    }

    @XmlElement(name = "name")
    public String getValue() {
        return value;
    }

}
