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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for con_gallery_itemsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="con_gallery_itemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="BEListingItemNoLightbox" type="{}BEListingItemNoLightboxType"/>
 *         &lt;element name="div" type="{}divType"/>
 *         &lt;element name="BEListingItemLightbox" type="{}BEListingItemLightboxType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "con_gallery_itemsType", propOrder = { "beListingItemNoLightboxOrDivOrBEListingItemLightbox" })
public class ConGalleryItemsType {

	@XmlElements({ @XmlElement(name = "BEListingItemNoLightbox", type = BEListingItemNoLightboxType.class),
		@XmlElement(name = "div", type = DivType.class),
		@XmlElement(name = "BEListingItemLightbox", type = BEListingItemLightboxType.class) })
	protected List<Object> beListingItemNoLightboxOrDivOrBEListingItemLightbox;

	/**
	 * Gets the value of the beListingItemNoLightboxOrDivOrBEListingItemLightbox
	 * property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the
	 * beListingItemNoLightboxOrDivOrBEListingItemLightbox property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBEListingItemNoLightboxOrDivOrBEListingItemLightbox().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link BEListingItemNoLightboxType } {@link DivType }
	 * {@link BEListingItemLightboxType }
	 * 
	 * 
	 */
	public List<Object> getBEListingItemNoLightboxOrDivOrBEListingItemLightbox() {
		if (beListingItemNoLightboxOrDivOrBEListingItemLightbox == null) {
			beListingItemNoLightboxOrDivOrBEListingItemLightbox = new ArrayList<Object>();
		}
		return this.beListingItemNoLightboxOrDivOrBEListingItemLightbox;
	}

}