//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.17 at 01:40:13 PM EST 
//


package com.australia.cqimport.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for con_CenterContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="con_CenterContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CenterContent" type="{}CenterContentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SpecialOffersCountry" type="{}SpecialOffersCountryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BET8VideoGalleryPage" type="{}BET8VideoGalleryPageType" minOccurs="0"/>
 *         &lt;element name="Video" type="{}VideoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "con_CenterContentType", propOrder = {
    "centerContent",
    "specialOffersCountry",
    "bet8VideoGalleryPage",
    "video"
})
public class ConCenterContentType {

    @XmlElement(name = "CenterContent")
    protected List<CenterContentType> centerContent;
    @XmlElement(name = "SpecialOffersCountry")
    protected List<SpecialOffersCountryType> specialOffersCountry;
    @XmlElement(name = "BET8VideoGalleryPage")
    protected BET8VideoGalleryPageType bet8VideoGalleryPage;
    @XmlElement(name = "Video")
    protected VideoType video;

    /**
     * Gets the value of the centerContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centerContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCenterContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CenterContentType }
     * 
     * 
     */
    public List<CenterContentType> getCenterContent() {
        if (centerContent == null) {
            centerContent = new ArrayList<CenterContentType>();
        }
        return this.centerContent;
    }

    /**
     * Gets the value of the specialOffersCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialOffersCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialOffersCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialOffersCountryType }
     * 
     * 
     */
    public List<SpecialOffersCountryType> getSpecialOffersCountry() {
        if (specialOffersCountry == null) {
            specialOffersCountry = new ArrayList<SpecialOffersCountryType>();
        }
        return this.specialOffersCountry;
    }

    /**
     * Gets the value of the bet8VideoGalleryPage property.
     * 
     * @return
     *     possible object is
     *     {@link BET8VideoGalleryPageType }
     *     
     */
    public BET8VideoGalleryPageType getBET8VideoGalleryPage() {
        return bet8VideoGalleryPage;
    }

    /**
     * Sets the value of the bet8VideoGalleryPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BET8VideoGalleryPageType }
     *     
     */
    public void setBET8VideoGalleryPage(BET8VideoGalleryPageType value) {
        this.bet8VideoGalleryPage = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link VideoType }
     *     
     */
    public VideoType getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoType }
     *     
     */
    public void setVideo(VideoType value) {
        this.video = value;
    }

}
