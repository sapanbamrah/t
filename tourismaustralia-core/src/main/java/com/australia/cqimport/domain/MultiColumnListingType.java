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
 * <p>Java class for MultiColumnListingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiColumnListingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stf_intro_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="txt_Intro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_List1Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_List2Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_List3Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_List1" type="{}anc_List1Type"/>
 *         &lt;element name="anc_List2" type="{}anc_List2Type"/>
 *         &lt;element name="anc_List3" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "MultiColumnListingType", propOrder = {
    "stfIntroTitle",
    "txtIntro",
    "stfList1Title",
    "stfList2Title",
    "stfList3Title",
    "ancList1",
    "ancList2",
    "ancList3"
})
public class MultiColumnListingType {

    @XmlElement(name = "stf_intro_title", required = true)
    protected String stfIntroTitle;
    @XmlElement(name = "txt_Intro", required = true)
    protected String txtIntro;
    @XmlElement(name = "stf_List1Title", required = true)
    protected String stfList1Title;
    @XmlElement(name = "stf_List2Title", required = true)
    protected String stfList2Title;
    @XmlElement(name = "stf_List3Title", required = true)
    protected String stfList3Title;
    @XmlElement(name = "anc_List1", required = true)
    protected AncList1Type ancList1;
    @XmlElement(name = "anc_List2", required = true)
    protected AncList2Type ancList2;
    @XmlElement(name = "anc_List3", required = true)
    protected String ancList3;
    @XmlAttribute(name = "isTemplate")
    protected Byte isTemplate;

    /**
     * Gets the value of the stfIntroTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfIntroTitle() {
        return stfIntroTitle;
    }

    /**
     * Sets the value of the stfIntroTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfIntroTitle(String value) {
        this.stfIntroTitle = value;
    }

    /**
     * Gets the value of the txtIntro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtIntro() {
        return txtIntro;
    }

    /**
     * Sets the value of the txtIntro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtIntro(String value) {
        this.txtIntro = value;
    }

    /**
     * Gets the value of the stfList1Title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfList1Title() {
        return stfList1Title;
    }

    /**
     * Sets the value of the stfList1Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfList1Title(String value) {
        this.stfList1Title = value;
    }

    /**
     * Gets the value of the stfList2Title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfList2Title() {
        return stfList2Title;
    }

    /**
     * Sets the value of the stfList2Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfList2Title(String value) {
        this.stfList2Title = value;
    }

    /**
     * Gets the value of the stfList3Title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfList3Title() {
        return stfList3Title;
    }

    /**
     * Sets the value of the stfList3Title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfList3Title(String value) {
        this.stfList3Title = value;
    }

    /**
     * Gets the value of the ancList1 property.
     * 
     * @return
     *     possible object is
     *     {@link AncList1Type }
     *     
     */
    public AncList1Type getAncList1() {
        return ancList1;
    }

    /**
     * Sets the value of the ancList1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncList1Type }
     *     
     */
    public void setAncList1(AncList1Type value) {
        this.ancList1 = value;
    }

    /**
     * Gets the value of the ancList2 property.
     * 
     * @return
     *     possible object is
     *     {@link AncList2Type }
     *     
     */
    public AncList2Type getAncList2() {
        return ancList2;
    }

    /**
     * Sets the value of the ancList2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AncList2Type }
     *     
     */
    public void setAncList2(AncList2Type value) {
        this.ancList2 = value;
    }

    /**
     * Gets the value of the ancList3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncList3() {
        return ancList3;
    }

    /**
     * Sets the value of the ancList3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncList3(String value) {
        this.ancList3 = value;
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
