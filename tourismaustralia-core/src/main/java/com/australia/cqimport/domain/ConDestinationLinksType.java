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
 * <p>Java class for con_DestinationLinksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="con_DestinationLinksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BERolloverTextItem" type="{}BERolloverTextItemType" minOccurs="0"/>
 *         &lt;element name="BERolloverListItem" type="{}BERolloverListItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "con_DestinationLinksType", propOrder = {
    "beRolloverTextItem",
    "beRolloverListItem"
})
public class ConDestinationLinksType {

    @XmlElement(name = "BERolloverTextItem")
    protected BERolloverTextItemType beRolloverTextItem;
    @XmlElement(name = "BERolloverListItem")
    protected List<BERolloverListItemType> beRolloverListItem;

    /**
     * Gets the value of the beRolloverTextItem property.
     * 
     * @return
     *     possible object is
     *     {@link BERolloverTextItemType }
     *     
     */
    public BERolloverTextItemType getBERolloverTextItem() {
        return beRolloverTextItem;
    }

    /**
     * Sets the value of the beRolloverTextItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BERolloverTextItemType }
     *     
     */
    public void setBERolloverTextItem(BERolloverTextItemType value) {
        this.beRolloverTextItem = value;
    }

    /**
     * Gets the value of the beRolloverListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beRolloverListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBERolloverListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BERolloverListItemType }
     * 
     * 
     */
    public List<BERolloverListItemType> getBERolloverListItem() {
        if (beRolloverListItem == null) {
            beRolloverListItem = new ArrayList<BERolloverListItemType>();
        }
        return this.beRolloverListItem;
    }

}