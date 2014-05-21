//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.17 at 01:40:13 PM EST 
//

package com.australia.cqimport.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for BEHomeFeaturedOverlayTextType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="BEHomeFeaturedOverlayTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anc_fullstory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdl_headline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img_background" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img_overlayIcon1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img_overlayIcon2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_overlayText1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_overlayText2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_overlayText3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_subheader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_ViewFullStory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isTemplate" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEHomeFeaturedOverlayTextType", propOrder = { "ancFullstory", "hdlHeadline", "imgBackground",
	"imgOverlayIcon1", "imgOverlayIcon2", "stfOverlayText1", "stfOverlayText2", "stfOverlayText3", "stfSubheader",
	"stfTitle", "stfViewFullStory" })
public class BEHomeFeaturedOverlayTextType {

	@XmlElement(name = "anc_fullstory", required = true)
	protected String ancFullstory;
	@XmlElement(name = "hdl_headline", required = true)
	protected String hdlHeadline;
	@XmlElement(name = "img_background", required = true)
	protected String imgBackground;
	@XmlElement(name = "img_overlayIcon1", required = true)
	protected String imgOverlayIcon1;
	@XmlElement(name = "img_overlayIcon2", required = true)
	protected String imgOverlayIcon2;
	@XmlElement(name = "stf_overlayText1", required = true)
	protected String stfOverlayText1;
	@XmlElement(name = "stf_overlayText2", required = true)
	protected String stfOverlayText2;
	@XmlElement(name = "stf_overlayText3", required = true)
	protected String stfOverlayText3;
	@XmlElement(name = "stf_subheader", required = true)
	protected String stfSubheader;
	@XmlElement(name = "stf_Title", required = true)
	protected String stfTitle;
	@XmlElement(name = "stf_ViewFullStory", required = true)
	protected String stfViewFullStory;
	@XmlAttribute(name = "isTemplate")
	protected Byte isTemplate;

	/**
	 * Gets the value of the ancFullstory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncFullstory() {
		return ancFullstory;
	}

	/**
	 * Sets the value of the ancFullstory property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncFullstory(String value) {
		this.ancFullstory = value;
	}

	/**
	 * Gets the value of the hdlHeadline property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHdlHeadline() {
		return hdlHeadline;
	}

	/**
	 * Sets the value of the hdlHeadline property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setHdlHeadline(String value) {
		this.hdlHeadline = value;
	}

	/**
	 * Gets the value of the imgBackground property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImgBackground() {
		return imgBackground;
	}

	/**
	 * Sets the value of the imgBackground property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setImgBackground(String value) {
		this.imgBackground = value;
	}

	/**
	 * Gets the value of the imgOverlayIcon1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImgOverlayIcon1() {
		return imgOverlayIcon1;
	}

	/**
	 * Sets the value of the imgOverlayIcon1 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setImgOverlayIcon1(String value) {
		this.imgOverlayIcon1 = value;
	}

	/**
	 * Gets the value of the imgOverlayIcon2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImgOverlayIcon2() {
		return imgOverlayIcon2;
	}

	/**
	 * Sets the value of the imgOverlayIcon2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setImgOverlayIcon2(String value) {
		this.imgOverlayIcon2 = value;
	}

	/**
	 * Gets the value of the stfOverlayText1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfOverlayText1() {
		return stfOverlayText1;
	}

	/**
	 * Sets the value of the stfOverlayText1 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfOverlayText1(String value) {
		this.stfOverlayText1 = value;
	}

	/**
	 * Gets the value of the stfOverlayText2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfOverlayText2() {
		return stfOverlayText2;
	}

	/**
	 * Sets the value of the stfOverlayText2 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfOverlayText2(String value) {
		this.stfOverlayText2 = value;
	}

	/**
	 * Gets the value of the stfOverlayText3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfOverlayText3() {
		return stfOverlayText3;
	}

	/**
	 * Sets the value of the stfOverlayText3 property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfOverlayText3(String value) {
		this.stfOverlayText3 = value;
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
	 * Gets the value of the stfViewFullStory property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfViewFullStory() {
		return stfViewFullStory;
	}

	/**
	 * Sets the value of the stfViewFullStory property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfViewFullStory(String value) {
		this.stfViewFullStory = value;
	}

	/**
	 * Gets the value of the isTemplate property.
	 * 
	 * @return possible object is {@link Byte }
	 * 
	 */
	public Byte getIsTemplate() {
		return isTemplate;
	}

	/**
	 * Sets the value of the isTemplate property.
	 * 
	 * @param value allowed object is {@link Byte }
	 * 
	 */
	public void setIsTemplate(Byte value) {
		this.isTemplate = value;
	}

}