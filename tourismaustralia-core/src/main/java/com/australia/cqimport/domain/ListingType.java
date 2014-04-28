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
 * <p>Java class for ListingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anc_List1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anc_MoreLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hdl_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img_Thumbnail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="med_File" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opt_isNewWindow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_externalLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_ExternalLinkTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_IsExternalSiteArticle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_LinkLearnMore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txt_Teaser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opt_national_landscapes_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_hideInXmlSitemap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_TargetedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="con_Banner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="con_Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="con_RHSModules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="con_Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lst_Subpages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="img_Map" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_Title1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_Title2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_Title3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_Title4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stf_Title5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txt_Description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txt_Description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txt_Description3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txt_Description4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txt_Description5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ListingType", propOrder = {
    "ancList1",
    "ancMoreLink",
    "hdlTitle",
    "imgThumbnail",
    "medFile",
    "optIsNewWindow",
    "stfExternalLink",
    "stfExternalLinkTitle",
    "stfIsExternalSiteArticle",
    "stfLinkLearnMore",
    "txtTeaser",
    "optNationalLandscapesId",
    "stfHideInXmlSitemap",
    "stfTargetedCountry",
    "conBanner",
    "conBody",
    "conRHSModules",
    "conCategory",
    "lstSubpages",
    "imgMap",
    "stfTitle1",
    "stfTitle2",
    "stfTitle3",
    "stfTitle4",
    "stfTitle5",
    "txtDescription1",
    "txtDescription2",
    "txtDescription3",
    "txtDescription4",
    "txtDescription5"
})
public class ListingType {

    @XmlElement(name = "anc_List1")
    protected String ancList1;
    @XmlElement(name = "anc_MoreLink")
    protected String ancMoreLink;
    @XmlElement(name = "hdl_Title", required = true)
    protected String hdlTitle;
    @XmlElement(name = "img_Thumbnail")
    protected String imgThumbnail;
    @XmlElement(name = "med_File")
    protected String medFile;
    @XmlElement(name = "opt_isNewWindow")
    protected String optIsNewWindow;
    @XmlElement(name = "stf_externalLink")
    protected String stfExternalLink;
    @XmlElement(name = "stf_ExternalLinkTitle")
    protected String stfExternalLinkTitle;
    @XmlElement(name = "stf_IsExternalSiteArticle")
    protected String stfIsExternalSiteArticle;
    @XmlElement(name = "stf_LinkLearnMore")
    protected String stfLinkLearnMore;
    @XmlElement(name = "txt_Teaser")
    protected String txtTeaser;
    @XmlElement(name = "opt_national_landscapes_id")
    protected String optNationalLandscapesId;
    @XmlElement(name = "stf_hideInXmlSitemap")
    protected String stfHideInXmlSitemap;
    @XmlElement(name = "stf_TargetedCountry")
    protected String stfTargetedCountry;
    @XmlElement(name = "con_Banner")
    protected String conBanner;
    @XmlElement(name = "con_Body")
    protected String conBody;
    @XmlElement(name = "con_RHSModules")
    protected String conRHSModules;
    @XmlElement(name = "con_Category")
    protected String conCategory;
    @XmlElement(name = "lst_Subpages")
    protected String lstSubpages;
    @XmlElement(name = "img_Map")
    protected String imgMap;
    @XmlElement(name = "stf_Title1")
    protected String stfTitle1;
    @XmlElement(name = "stf_Title2")
    protected String stfTitle2;
    @XmlElement(name = "stf_Title3")
    protected String stfTitle3;
    @XmlElement(name = "stf_Title4")
    protected String stfTitle4;
    @XmlElement(name = "stf_Title5")
    protected String stfTitle5;
    @XmlElement(name = "txt_Description1")
    protected String txtDescription1;
    @XmlElement(name = "txt_Description2")
    protected String txtDescription2;
    @XmlElement(name = "txt_Description3")
    protected String txtDescription3;
    @XmlElement(name = "txt_Description4")
    protected String txtDescription4;
    @XmlElement(name = "txt_Description5")
    protected String txtDescription5;
    @XmlAttribute(name = "isTemplate")
    protected Byte isTemplate;

    /**
     * Gets the value of the ancList1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncList1() {
        return ancList1;
    }

    /**
     * Sets the value of the ancList1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncList1(String value) {
        this.ancList1 = value;
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
     * Gets the value of the imgThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgThumbnail() {
        return imgThumbnail;
    }

    /**
     * Sets the value of the imgThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgThumbnail(String value) {
        this.imgThumbnail = value;
    }

    /**
     * Gets the value of the medFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedFile() {
        return medFile;
    }

    /**
     * Sets the value of the medFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedFile(String value) {
        this.medFile = value;
    }

    /**
     * Gets the value of the optIsNewWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptIsNewWindow() {
        return optIsNewWindow;
    }

    /**
     * Sets the value of the optIsNewWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptIsNewWindow(String value) {
        this.optIsNewWindow = value;
    }

    /**
     * Gets the value of the stfExternalLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfExternalLink() {
        return stfExternalLink;
    }

    /**
     * Sets the value of the stfExternalLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfExternalLink(String value) {
        this.stfExternalLink = value;
    }

    /**
     * Gets the value of the stfExternalLinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfExternalLinkTitle() {
        return stfExternalLinkTitle;
    }

    /**
     * Sets the value of the stfExternalLinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfExternalLinkTitle(String value) {
        this.stfExternalLinkTitle = value;
    }

    /**
     * Gets the value of the stfIsExternalSiteArticle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfIsExternalSiteArticle() {
        return stfIsExternalSiteArticle;
    }

    /**
     * Sets the value of the stfIsExternalSiteArticle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfIsExternalSiteArticle(String value) {
        this.stfIsExternalSiteArticle = value;
    }

    /**
     * Gets the value of the stfLinkLearnMore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfLinkLearnMore() {
        return stfLinkLearnMore;
    }

    /**
     * Sets the value of the stfLinkLearnMore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfLinkLearnMore(String value) {
        this.stfLinkLearnMore = value;
    }

    /**
     * Gets the value of the txtTeaser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtTeaser() {
        return txtTeaser;
    }

    /**
     * Sets the value of the txtTeaser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtTeaser(String value) {
        this.txtTeaser = value;
    }

    /**
     * Gets the value of the optNationalLandscapesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptNationalLandscapesId() {
        return optNationalLandscapesId;
    }

    /**
     * Sets the value of the optNationalLandscapesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptNationalLandscapesId(String value) {
        this.optNationalLandscapesId = value;
    }

    /**
     * Gets the value of the stfHideInXmlSitemap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfHideInXmlSitemap() {
        return stfHideInXmlSitemap;
    }

    /**
     * Sets the value of the stfHideInXmlSitemap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfHideInXmlSitemap(String value) {
        this.stfHideInXmlSitemap = value;
    }

    /**
     * Gets the value of the stfTargetedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTargetedCountry() {
        return stfTargetedCountry;
    }

    /**
     * Sets the value of the stfTargetedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTargetedCountry(String value) {
        this.stfTargetedCountry = value;
    }

    /**
     * Gets the value of the conBanner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConBanner() {
        return conBanner;
    }

    /**
     * Sets the value of the conBanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConBanner(String value) {
        this.conBanner = value;
    }

    /**
     * Gets the value of the conBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConBody() {
        return conBody;
    }

    /**
     * Sets the value of the conBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConBody(String value) {
        this.conBody = value;
    }

    /**
     * Gets the value of the conRHSModules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConRHSModules() {
        return conRHSModules;
    }

    /**
     * Sets the value of the conRHSModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConRHSModules(String value) {
        this.conRHSModules = value;
    }

    /**
     * Gets the value of the conCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConCategory() {
        return conCategory;
    }

    /**
     * Sets the value of the conCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConCategory(String value) {
        this.conCategory = value;
    }

    /**
     * Gets the value of the lstSubpages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLstSubpages() {
        return lstSubpages;
    }

    /**
     * Sets the value of the lstSubpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLstSubpages(String value) {
        this.lstSubpages = value;
    }

    /**
     * Gets the value of the imgMap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgMap() {
        return imgMap;
    }

    /**
     * Sets the value of the imgMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgMap(String value) {
        this.imgMap = value;
    }

    /**
     * Gets the value of the stfTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTitle1() {
        return stfTitle1;
    }

    /**
     * Sets the value of the stfTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTitle1(String value) {
        this.stfTitle1 = value;
    }

    /**
     * Gets the value of the stfTitle2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTitle2() {
        return stfTitle2;
    }

    /**
     * Sets the value of the stfTitle2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTitle2(String value) {
        this.stfTitle2 = value;
    }

    /**
     * Gets the value of the stfTitle3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTitle3() {
        return stfTitle3;
    }

    /**
     * Sets the value of the stfTitle3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTitle3(String value) {
        this.stfTitle3 = value;
    }

    /**
     * Gets the value of the stfTitle4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTitle4() {
        return stfTitle4;
    }

    /**
     * Sets the value of the stfTitle4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTitle4(String value) {
        this.stfTitle4 = value;
    }

    /**
     * Gets the value of the stfTitle5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTitle5() {
        return stfTitle5;
    }

    /**
     * Sets the value of the stfTitle5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTitle5(String value) {
        this.stfTitle5 = value;
    }

    /**
     * Gets the value of the txtDescription1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtDescription1() {
        return txtDescription1;
    }

    /**
     * Sets the value of the txtDescription1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtDescription1(String value) {
        this.txtDescription1 = value;
    }

    /**
     * Gets the value of the txtDescription2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtDescription2() {
        return txtDescription2;
    }

    /**
     * Sets the value of the txtDescription2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtDescription2(String value) {
        this.txtDescription2 = value;
    }

    /**
     * Gets the value of the txtDescription3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtDescription3() {
        return txtDescription3;
    }

    /**
     * Sets the value of the txtDescription3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtDescription3(String value) {
        this.txtDescription3 = value;
    }

    /**
     * Gets the value of the txtDescription4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtDescription4() {
        return txtDescription4;
    }

    /**
     * Sets the value of the txtDescription4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtDescription4(String value) {
        this.txtDescription4 = value;
    }

    /**
     * Gets the value of the txtDescription5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtDescription5() {
        return txtDescription5;
    }

    /**
     * Sets the value of the txtDescription5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtDescription5(String value) {
        this.txtDescription5 = value;
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
