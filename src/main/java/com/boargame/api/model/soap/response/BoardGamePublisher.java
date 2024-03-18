package com.boargame.api.model.soap.response;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardGamePublisher {

	@XmlAttribute
	private int objectId;
	private String value;
	
	 @XmlAttribute(name = "objectid")
	    public int getSortindex() {
	        return objectId;
	    }

	    @XmlElement(name = "name")
	    public String getValue() {
	        return value;
	    }
}
