//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.17 at 01:40:13 PM EST 
//

package com.australia.cqimport.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for lst_EventType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="lst_EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img_Event" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_subheader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lst_EventType", propOrder = { "url", "imgEvent", "stfTitle", "stfSubheader" })
public class LstEventType {

	@XmlElement(required = true)
	protected String url;
	@XmlElement(name = "img_Event", required = true)
	protected String imgEvent;
	@XmlElement(name = "stf_Title", required = true)
	protected String stfTitle;
	@XmlElement(name = "stf_subheader")
	protected String stfSubheader;

	/**
	 * Gets the value of the url property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the value of the url property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setUrl(String value) {
		this.url = value;
	}

	/**
	 * Gets the value of the imgEvent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImgEvent() {
		return imgEvent;
	}

	/**
	 * Sets the value of the imgEvent property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setImgEvent(String value) {
		this.imgEvent = value;
	}

	/**
	 * Gets the value of the stfTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfTitle() {
		return stfTitle;
	}

	/**
	 * Sets the value of the stfTitle property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfTitle(String value) {
		this.stfTitle = value;
	}

	/**
	 * Gets the value of the stfSubheader property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfSubheader() {
		return stfSubheader;
	}

	/**
	 * Sets the value of the stfSubheader property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfSubheader(String value) {
		this.stfSubheader = value;
	}

}