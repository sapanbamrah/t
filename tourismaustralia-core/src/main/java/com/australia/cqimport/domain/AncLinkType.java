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
 * <p>Java class for anc_linkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anc_linkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_NavTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_NavSubHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anc_linkType", propOrder = {
    "url",
    "stfNavTitle",
    "stfNavSubHeader"
})
public class AncLinkType {

    @XmlElement(required = true)
    protected String url;
    @XmlElement(name = "stf_NavTitle", required = true)
    protected String stfNavTitle;
    @XmlElement(name = "stf_NavSubHeader", required = true)
    protected String stfNavSubHeader;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the stfNavTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfNavTitle() {
        return stfNavTitle;
    }

    /**
     * Sets the value of the stfNavTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfNavTitle(String value) {
        this.stfNavTitle = value;
    }

    /**
     * Gets the value of the stfNavSubHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfNavSubHeader() {
        return stfNavSubHeader;
    }

    /**
     * Sets the value of the stfNavSubHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfNavSubHeader(String value) {
        this.stfNavSubHeader = value;
    }

}