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
 * <p>
 * Java class for PlanYourVisitType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PlanYourVisitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anc_AccommodationSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_ASPSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Attraction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Destinfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_EventsSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_GeneralSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Hire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Info" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_More" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_RestaurantSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Tour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anc_Transport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hdl_Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Accomodation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_AreaFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Attractions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_AussieSpecialist" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Destinationinfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_DomesticRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Events" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Hire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Informationservices" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_PlanYourVisitTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_StateFilter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Tours" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_Transport" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PlanYourVisitType", propOrder = { "ancAccommodationSearch", "ancASPSearch", "ancAttraction",
	"ancDestinfo", "ancEventsSearch", "ancGeneralSearch", "ancHire", "ancInfo", "ancMore", "ancRestaurantSearch",
	"ancTour", "ancTransport", "hdlTitle", "language", "stfAccomodation", "stfAreaFilter", "stfAttractions",
	"stfAussieSpecialist", "stfDestinationinfo", "stfDomesticRegion", "stfEvents", "stfHire", "stfInformationservices",
	"stfPlanYourVisitTitle", "stfStateFilter", "stfTours", "stfTransport" })
public class PlanYourVisitType {

	@XmlElement(name = "anc_AccommodationSearch", required = true)
	protected String ancAccommodationSearch;
	@XmlElement(name = "anc_ASPSearch", required = true)
	protected String ancASPSearch;
	@XmlElement(name = "anc_Attraction", required = true)
	protected String ancAttraction;
	@XmlElement(name = "anc_Destinfo", required = true)
	protected String ancDestinfo;
	@XmlElement(name = "anc_EventsSearch", required = true)
	protected String ancEventsSearch;
	@XmlElement(name = "anc_GeneralSearch", required = true)
	protected String ancGeneralSearch;
	@XmlElement(name = "anc_Hire", required = true)
	protected String ancHire;
	@XmlElement(name = "anc_Info", required = true)
	protected String ancInfo;
	@XmlElement(name = "anc_More", required = true)
	protected String ancMore;
	@XmlElement(name = "anc_RestaurantSearch", required = true)
	protected String ancRestaurantSearch;
	@XmlElement(name = "anc_Tour", required = true)
	protected String ancTour;
	@XmlElement(name = "anc_Transport", required = true)
	protected String ancTransport;
	@XmlElement(name = "hdl_Title", required = true)
	protected String hdlTitle;
	@XmlElement(required = true)
	protected String language;
	@XmlElement(name = "stf_Accomodation", required = true)
	protected String stfAccomodation;
	@XmlElement(name = "stf_AreaFilter", required = true)
	protected String stfAreaFilter;
	@XmlElement(name = "stf_Attractions", required = true)
	protected String stfAttractions;
	@XmlElement(name = "stf_AussieSpecialist", required = true)
	protected String stfAussieSpecialist;
	@XmlElement(name = "stf_Destinationinfo", required = true)
	protected String stfDestinationinfo;
	@XmlElement(name = "stf_DomesticRegion", required = true)
	protected String stfDomesticRegion;
	@XmlElement(name = "stf_Events", required = true)
	protected String stfEvents;
	@XmlElement(name = "stf_Hire", required = true)
	protected String stfHire;
	@XmlElement(name = "stf_Informationservices", required = true)
	protected String stfInformationservices;
	@XmlElement(name = "stf_PlanYourVisitTitle", required = true)
	protected String stfPlanYourVisitTitle;
	@XmlElement(name = "stf_StateFilter", required = true)
	protected String stfStateFilter;
	@XmlElement(name = "stf_Tours", required = true)
	protected String stfTours;
	@XmlElement(name = "stf_Transport", required = true)
	protected String stfTransport;
	@XmlAttribute(name = "isTemplate")
	protected Byte isTemplate;

	/**
	 * Gets the value of the ancAccommodationSearch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncAccommodationSearch() {
		return ancAccommodationSearch;
	}

	/**
	 * Sets the value of the ancAccommodationSearch property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncAccommodationSearch(String value) {
		this.ancAccommodationSearch = value;
	}

	/**
	 * Gets the value of the ancASPSearch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncASPSearch() {
		return ancASPSearch;
	}

	/**
	 * Sets the value of the ancASPSearch property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncASPSearch(String value) {
		this.ancASPSearch = value;
	}

	/**
	 * Gets the value of the ancAttraction property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncAttraction() {
		return ancAttraction;
	}

	/**
	 * Sets the value of the ancAttraction property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncAttraction(String value) {
		this.ancAttraction = value;
	}

	/**
	 * Gets the value of the ancDestinfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncDestinfo() {
		return ancDestinfo;
	}

	/**
	 * Sets the value of the ancDestinfo property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncDestinfo(String value) {
		this.ancDestinfo = value;
	}

	/**
	 * Gets the value of the ancEventsSearch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncEventsSearch() {
		return ancEventsSearch;
	}

	/**
	 * Sets the value of the ancEventsSearch property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncEventsSearch(String value) {
		this.ancEventsSearch = value;
	}

	/**
	 * Gets the value of the ancGeneralSearch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncGeneralSearch() {
		return ancGeneralSearch;
	}

	/**
	 * Sets the value of the ancGeneralSearch property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncGeneralSearch(String value) {
		this.ancGeneralSearch = value;
	}

	/**
	 * Gets the value of the ancHire property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncHire() {
		return ancHire;
	}

	/**
	 * Sets the value of the ancHire property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncHire(String value) {
		this.ancHire = value;
	}

	/**
	 * Gets the value of the ancInfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncInfo() {
		return ancInfo;
	}

	/**
	 * Sets the value of the ancInfo property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncInfo(String value) {
		this.ancInfo = value;
	}

	/**
	 * Gets the value of the ancMore property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncMore() {
		return ancMore;
	}

	/**
	 * Sets the value of the ancMore property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncMore(String value) {
		this.ancMore = value;
	}

	/**
	 * Gets the value of the ancRestaurantSearch property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncRestaurantSearch() {
		return ancRestaurantSearch;
	}

	/**
	 * Sets the value of the ancRestaurantSearch property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncRestaurantSearch(String value) {
		this.ancRestaurantSearch = value;
	}

	/**
	 * Gets the value of the ancTour property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncTour() {
		return ancTour;
	}

	/**
	 * Sets the value of the ancTour property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncTour(String value) {
		this.ancTour = value;
	}

	/**
	 * Gets the value of the ancTransport property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAncTransport() {
		return ancTransport;
	}

	/**
	 * Sets the value of the ancTransport property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAncTransport(String value) {
		this.ancTransport = value;
	}

	/**
	 * Gets the value of the hdlTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHdlTitle() {
		return hdlTitle;
	}

	/**
	 * Sets the value of the hdlTitle property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setHdlTitle(String value) {
		this.hdlTitle = value;
	}

	/**
	 * Gets the value of the language property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * Sets the value of the language property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setLanguage(String value) {
		this.language = value;
	}

	/**
	 * Gets the value of the stfAccomodation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfAccomodation() {
		return stfAccomodation;
	}

	/**
	 * Sets the value of the stfAccomodation property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfAccomodation(String value) {
		this.stfAccomodation = value;
	}

	/**
	 * Gets the value of the stfAreaFilter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfAreaFilter() {
		return stfAreaFilter;
	}

	/**
	 * Sets the value of the stfAreaFilter property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfAreaFilter(String value) {
		this.stfAreaFilter = value;
	}

	/**
	 * Gets the value of the stfAttractions property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfAttractions() {
		return stfAttractions;
	}

	/**
	 * Sets the value of the stfAttractions property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfAttractions(String value) {
		this.stfAttractions = value;
	}

	/**
	 * Gets the value of the stfAussieSpecialist property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfAussieSpecialist() {
		return stfAussieSpecialist;
	}

	/**
	 * Sets the value of the stfAussieSpecialist property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfAussieSpecialist(String value) {
		this.stfAussieSpecialist = value;
	}

	/**
	 * Gets the value of the stfDestinationinfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfDestinationinfo() {
		return stfDestinationinfo;
	}

	/**
	 * Sets the value of the stfDestinationinfo property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfDestinationinfo(String value) {
		this.stfDestinationinfo = value;
	}

	/**
	 * Gets the value of the stfDomesticRegion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfDomesticRegion() {
		return stfDomesticRegion;
	}

	/**
	 * Sets the value of the stfDomesticRegion property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfDomesticRegion(String value) {
		this.stfDomesticRegion = value;
	}

	/**
	 * Gets the value of the stfEvents property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfEvents() {
		return stfEvents;
	}

	/**
	 * Sets the value of the stfEvents property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfEvents(String value) {
		this.stfEvents = value;
	}

	/**
	 * Gets the value of the stfHire property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfHire() {
		return stfHire;
	}

	/**
	 * Sets the value of the stfHire property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfHire(String value) {
		this.stfHire = value;
	}

	/**
	 * Gets the value of the stfInformationservices property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfInformationservices() {
		return stfInformationservices;
	}

	/**
	 * Sets the value of the stfInformationservices property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfInformationservices(String value) {
		this.stfInformationservices = value;
	}

	/**
	 * Gets the value of the stfPlanYourVisitTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfPlanYourVisitTitle() {
		return stfPlanYourVisitTitle;
	}

	/**
	 * Sets the value of the stfPlanYourVisitTitle property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfPlanYourVisitTitle(String value) {
		this.stfPlanYourVisitTitle = value;
	}

	/**
	 * Gets the value of the stfStateFilter property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfStateFilter() {
		return stfStateFilter;
	}

	/**
	 * Sets the value of the stfStateFilter property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfStateFilter(String value) {
		this.stfStateFilter = value;
	}

	/**
	 * Gets the value of the stfTours property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfTours() {
		return stfTours;
	}

	/**
	 * Sets the value of the stfTours property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfTours(String value) {
		this.stfTours = value;
	}

	/**
	 * Gets the value of the stfTransport property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfTransport() {
		return stfTransport;
	}

	/**
	 * Sets the value of the stfTransport property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfTransport(String value) {
		this.stfTransport = value;
	}

	/**
	 * Gets the value of the isTemplate property.
	 * 
	 * @return possible object is {@link Byte }
	 * 
	 */
	public Byte getIsTemplate() {
		return isTemplate;
	}

	/**
	 * Sets the value of the isTemplate property.
	 * 
	 * @param value allowed object is {@link Byte }
	 * 
	 */
	public void setIsTemplate(Byte value) {
		this.isTemplate = value;
	}

}