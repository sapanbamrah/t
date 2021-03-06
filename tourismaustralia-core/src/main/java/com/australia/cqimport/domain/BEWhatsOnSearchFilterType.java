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
 * <p>Java class for BEWhatsOnSearchFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEWhatsOnSearchFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stf_ButtonText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_EndLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_EventTypeLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Header" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_ResetFilters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_SearchLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_StartLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_StateLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "BEWhatsOnSearchFilterType", propOrder = {
    "stfButtonText",
    "stfEndLabel",
    "stfEventTypeLabel",
    "stfHeader",
    "stfResetFilters",
    "stfSearchLabel",
    "stfStartLabel",
    "stfStateLabel"
})
public class BEWhatsOnSearchFilterType {

    @XmlElement(name = "stf_ButtonText", required = true)
    protected String stfButtonText;
    @XmlElement(name = "stf_EndLabel", required = true)
    protected String stfEndLabel;
    @XmlElement(name = "stf_EventTypeLabel", required = true)
    protected String stfEventTypeLabel;
    @XmlElement(name = "stf_Header", required = true)
    protected String stfHeader;
    @XmlElement(name = "stf_ResetFilters", required = true)
    protected String stfResetFilters;
    @XmlElement(name = "stf_SearchLabel", required = true)
    protected String stfSearchLabel;
    @XmlElement(name = "stf_StartLabel", required = true)
    protected String stfStartLabel;
    @XmlElement(name = "stf_StateLabel", required = true)
    protected String stfStateLabel;
    @XmlAttribute(name = "isTemplate")
    protected Byte isTemplate;

    /**
     * Gets the value of the stfButtonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfButtonText() {
        return stfButtonText;
    }

    /**
     * Sets the value of the stfButtonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfButtonText(String value) {
        this.stfButtonText = value;
    }

    /**
     * Gets the value of the stfEndLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfEndLabel() {
        return stfEndLabel;
    }

    /**
     * Sets the value of the stfEndLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfEndLabel(String value) {
        this.stfEndLabel = value;
    }

    /**
     * Gets the value of the stfEventTypeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfEventTypeLabel() {
        return stfEventTypeLabel;
    }

    /**
     * Sets the value of the stfEventTypeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfEventTypeLabel(String value) {
        this.stfEventTypeLabel = value;
    }

    /**
     * Gets the value of the stfHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfHeader() {
        return stfHeader;
    }

    /**
     * Sets the value of the stfHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfHeader(String value) {
        this.stfHeader = value;
    }

    /**
     * Gets the value of the stfResetFilters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfResetFilters() {
        return stfResetFilters;
    }

    /**
     * Sets the value of the stfResetFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfResetFilters(String value) {
        this.stfResetFilters = value;
    }

    /**
     * Gets the value of the stfSearchLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfSearchLabel() {
        return stfSearchLabel;
    }

    /**
     * Sets the value of the stfSearchLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfSearchLabel(String value) {
        this.stfSearchLabel = value;
    }

    /**
     * Gets the value of the stfStartLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfStartLabel() {
        return stfStartLabel;
    }

    /**
     * Sets the value of the stfStartLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfStartLabel(String value) {
        this.stfStartLabel = value;
    }

    /**
     * Gets the value of the stfStateLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfStateLabel() {
        return stfStateLabel;
    }

    /**
     * Sets the value of the stfStateLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfStateLabel(String value) {
        this.stfStateLabel = value;
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
