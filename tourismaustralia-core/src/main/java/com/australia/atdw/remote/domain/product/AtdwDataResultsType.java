//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.06 at 10:44:38 AM EST 
//

package com.australia.atdw.remote.domain.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for atdw_data_resultsType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="atdw_data_resultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product_distribution" type="{}product_distributionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atdw_data_resultsType")
public class AtdwDataResultsType {

	@XmlElement(name = "product_distribution", required = true)
	protected ProductDistributionType productDistribution;

	/**
	 * Gets the value of the productDistribution property.
	 * 
	 * @return possible object is {@link ProductDistributionType }
	 * 
	 */
	public ProductDistributionType getProductDistribution() {
		return productDistribution;
	}

	/**
	 * Sets the value of the productDistribution property.
	 * 
	 * @param value allowed object is {@link ProductDistributionType }
	 * 
	 */
	public void setProductDistribution(ProductDistributionType value) {
		this.productDistribution = value;
	}

}