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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for con_RHSModulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="con_RHSModulesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ExperienceLocationMap" type="{}ExperienceLocationMapType"/>
 *         &lt;element name="AtaGlance" type="{}AtaGlanceType"/>
 *         &lt;element name="Listing" type="{}ListingType"/>
 *         &lt;element name="PlanYourVisit" type="{}PlanYourVisitType"/>
 *         &lt;element name="PlanYourHolidayBox" type="{}PlanYourHolidayBoxType"/>
 *         &lt;element name="ConsumerRHSSocialMediaWidget" type="{}ConsumerRHSSocialMediaWidgetType"/>
 *         &lt;element name="EventsResultsRHS" type="{}EventsResultsRHSType"/>
 *         &lt;element name="MoreInformation" type="{}MoreInformationType"/>
 *         &lt;element name="IntegratedMiniMap" type="{}IntegratedMiniMapType"/>
 *         &lt;element name="TravellersStoryWidget" type="{}TravellersStoryWidgetType"/>
 *         &lt;element name="JourneysModule" type="{}JourneysModuleType"/>
 *         &lt;element name="RichTextModule" type="{}RichTextModuleType"/>
 *         &lt;element name="AccommodationRHS" type="{}AccommodationRHSType"/>
 *         &lt;element name="StarRatingModule" type="{}StarRatingModuleType"/>
 *         &lt;element name="ASPSearchRHS" type="{}ASPSearchRHSType"/>
 *         &lt;element name="AirlineModule" type="{}AirlineModuleType"/>
 *         &lt;element name="TourSearchModuleRHS" type="{}TourSearchModuleRHSType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "con_RHSModulesType", propOrder = {
    "content"
})
public class ConRHSModulesType {

    @XmlElementRefs({
        @XmlElementRef(name = "JourneysModule", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RichTextModule", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TourSearchModuleRHS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StarRatingModule", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ConsumerRHSSocialMediaWidget", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Listing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TravellersStoryWidget", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MoreInformation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntegratedMiniMap", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PlanYourHolidayBox", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AtaGlance", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ExperienceLocationMap", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EventsResultsRHS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AccommodationRHS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PlanYourVisit", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AirlineModule", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ASPSearchRHS", type = JAXBElement.class, required = false)
    })
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
     * {@link JAXBElement }{@code <}{@link RichTextModuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link JourneysModuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link TourSearchModuleRHSType }{@code >}
     * {@link JAXBElement }{@code <}{@link StarRatingModuleType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConsumerRHSSocialMediaWidgetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ListingType }{@code >}
     * {@link JAXBElement }{@code <}{@link TravellersStoryWidgetType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntegratedMiniMapType }{@code >}
     * {@link JAXBElement }{@code <}{@link MoreInformationType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link PlanYourHolidayBoxType }{@code >}
     * {@link JAXBElement }{@code <}{@link AtaGlanceType }{@code >}
     * {@link JAXBElement }{@code <}{@link EventsResultsRHSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExperienceLocationMapType }{@code >}
     * {@link JAXBElement }{@code <}{@link PlanYourVisitType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccommodationRHSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ASPSearchRHSType }{@code >}
     * {@link JAXBElement }{@code <}{@link AirlineModuleType }{@code >}
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
