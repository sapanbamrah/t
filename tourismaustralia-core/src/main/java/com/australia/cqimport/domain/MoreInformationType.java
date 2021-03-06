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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoreInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoreInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hdl_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_MoreLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img_Content" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_LinkTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_MoreLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="stf_MoreLinkText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Teaser" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "MoreInformationType", propOrder = {
    "hdlTitle",
    "ancLink",
    "ancMoreLink",
    "imgContent",
    "stfLinkTitle",
    "stfMoreLink",
    "stfMoreLinkText",
    "stfTeaser"
})
public class MoreInformationType {

    @XmlElement(name = "hdl_Title", required = true)
    protected String hdlTitle;
    @XmlElement(name = "anc_Link", required = true)
    protected String ancLink;
    @XmlElement(name = "anc_MoreLink", required = true)
    protected String ancMoreLink;
    @XmlElement(name = "img_Content", required = true)
    protected String imgContent;
    @XmlElement(name = "stf_LinkTitle", required = true)
    protected String stfLinkTitle;
    @XmlElement(name = "stf_MoreLink", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String stfMoreLink;
    @XmlElement(name = "stf_MoreLinkText", required = true)
    protected String stfMoreLinkText;
    @XmlElement(name = "stf_Teaser", required = true)
    protected String stfTeaser;
    @XmlAttribute(name = "isTemplate")
    protected Byte isTemplate;

    /**
     * Gets the value of the hdlTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHdlTitle() {
        return hdlTitle;
    }

    /**
     * Sets the value of the hdlTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHdlTitle(String value) {
        this.hdlTitle = value;
    }

    /**
     * Gets the value of the ancLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncLink() {
        return ancLink;
    }

    /**
     * Sets the value of the ancLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncLink(String value) {
        this.ancLink = value;
    }

    /**
     * Gets the value of the ancMoreLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncMoreLink() {
        return ancMoreLink;
    }

    /**
     * Sets the value of the ancMoreLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncMoreLink(String value) {
        this.ancMoreLink = value;
    }

    /**
     * Gets the value of the imgContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgContent() {
        return imgContent;
    }

    /**
     * Sets the value of the imgContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgContent(String value) {
        this.imgContent = value;
    }

    /**
     * Gets the value of the stfLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfLinkTitle() {
        return stfLinkTitle;
    }

    /**
     * Sets the value of the stfLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfLinkTitle(String value) {
        this.stfLinkTitle = value;
    }

    /**
     * Gets the value of the stfMoreLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfMoreLink() {
        return stfMoreLink;
    }

    /**
     * Sets the value of the stfMoreLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfMoreLink(String value) {
        this.stfMoreLink = value;
    }

    /**
     * Gets the value of the stfMoreLinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfMoreLinkText() {
        return stfMoreLinkText;
    }

    /**
     * Sets the value of the stfMoreLinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfMoreLinkText(String value) {
        this.stfMoreLinkText = value;
    }

    /**
     * Gets the value of the stfTeaser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTeaser() {
        return stfTeaser;
    }

    /**
     * Sets the value of the stfTeaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTeaser(String value) {
        this.stfTeaser = value;
    }

    /**
     * Gets the value of the isTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIsTemplate() {
        return isTemplate;
    }

    /**
     * Sets the value of the isTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIsTemplate(Byte value) {
        this.isTemplate = value;
    }

}
