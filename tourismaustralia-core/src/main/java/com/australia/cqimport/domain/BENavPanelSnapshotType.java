//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.17 at 01:40:13 PM EST 
//


package com.australia.cqimport.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BENavPanelSnapshotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BENavPanelSnapshotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stf_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lst_Events" type="{}lst_EventsType"/>
 *         &lt;element name="lst_Links">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lst_Link" type="{}lst_LinkType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "BENavPanelSnapshotType", propOrder = {
    "stfTitle",
    "lstEvents",
    "lstLinks"
})
public class BENavPanelSnapshotType {

    @XmlElement(name = "stf_Title", required = true)
    protected String stfTitle;
    @XmlElement(name = "lst_Events", required = true)
    protected LstEventsType lstEvents;
    @XmlElement(name = "lst_Links", required = true)
    protected BENavPanelSnapshotType.LstLinks lstLinks;
    @XmlAttribute(name = "isTemplate")
    protected Byte isTemplate;

    /**
     * Gets the value of the stfTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStfTitle() {
        return stfTitle;
    }

    /**
     * Sets the value of the stfTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStfTitle(String value) {
        this.stfTitle = value;
    }

    /**
     * Gets the value of the lstEvents property.
     * 
     * @return
     *     possible object is
     *     {@link LstEventsType }
     *     
     */
    public LstEventsType getLstEvents() {
        return lstEvents;
    }

    /**
     * Sets the value of the lstEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LstEventsType }
     *     
     */
    public void setLstEvents(LstEventsType value) {
        this.lstEvents = value;
    }

    /**
     * Gets the value of the lstLinks property.
     * 
     * @return
     *     possible object is
     *     {@link BENavPanelSnapshotType.LstLinks }
     *     
     */
    public BENavPanelSnapshotType.LstLinks getLstLinks() {
        return lstLinks;
    }

    /**
     * Sets the value of the lstLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BENavPanelSnapshotType.LstLinks }
     *     
     */
    public void setLstLinks(BENavPanelSnapshotType.LstLinks value) {
        this.lstLinks = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lst_Link" type="{}lst_LinkType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class LstLinks {

        @XmlElementRef(name = "lst_Link", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link LstLinkType }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}