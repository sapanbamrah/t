//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.20 at 10:37:30 AM EST 
//

package com.australia.asp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p/>
 * Java class for aussie-specialistsType complex type.
 * <p/>
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * 
 * <pre>
 * &lt;complexType name="aussie-specialistsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aussie-specialist" type="{}aussie-specialistType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlRootElement(name = "aussie-specialists")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aussie-specialistsType")
public class AussieSpecialistsType {

	@XmlElement(name = "aussie-specialist", required = true)
	protected List<AussieSpecialistType> aussieSpecialists;

	/**
	 * Gets the value of the aussieSpecialist property.
	 * <p/>
	 * <p/>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the aussieSpecialist property.
	 * <p/>
	 * <p/>
	 * For example, to add a new item, do as follows:
	 * <p/>
	 * 
	 * <pre>
	 * getAussieSpecialist().add(newItem);
	 * </pre>
	 * <p/>
	 * <p/>
	 * <p/>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AussieSpecialistType }
	 */
	public List<AussieSpecialistType> getAussieSpecialists() {
		if (aussieSpecialists == null) {
			aussieSpecialists = new ArrayList<AussieSpecialistType>();
		}
		return this.aussieSpecialists;
	}

}
