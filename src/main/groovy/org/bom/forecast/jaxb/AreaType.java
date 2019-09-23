//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.23 at 08:36:19 AM AEST 
//


package org.bom.forecast.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warning-summary" type="{}warning-summaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forecast-period" type="{}forecast-periodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hazard" type="{}hazardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="warning-group" type="{}warning-groupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="aac" use="required" type="{}aacType" />
 *       &lt;attribute name="parent-aac" type="{}aacType" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaType", propOrder = {
    "warningSummary",
    "forecastPeriod",
    "hazard",
    "warningGroup"
})
public class AreaType {

    @XmlElement(name = "warning-summary")
    protected List<WarningSummaryType> warningSummary;
    @XmlElement(name = "forecast-period")
    protected List<ForecastPeriodType> forecastPeriod;
    protected List<HazardType> hazard;
    @XmlElement(name = "warning-group")
    protected List<WarningGroupType> warningGroup;
    @XmlAttribute(name = "aac", required = true)
    protected String aac;
    @XmlAttribute(name = "parent-aac")
    protected String parentAac;
    @XmlAttribute(name = "description", required = true)
    protected String description;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the warningSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningSummaryType }
     * 
     * 
     */
    public List<WarningSummaryType> getWarningSummary() {
        if (warningSummary == null) {
            warningSummary = new ArrayList<WarningSummaryType>();
        }
        return this.warningSummary;
    }

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastPeriodType }
     * 
     * 
     */
    public List<ForecastPeriodType> getForecastPeriod() {
        if (forecastPeriod == null) {
            forecastPeriod = new ArrayList<ForecastPeriodType>();
        }
        return this.forecastPeriod;
    }

    /**
     * Gets the value of the hazard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardType }
     * 
     * 
     */
    public List<HazardType> getHazard() {
        if (hazard == null) {
            hazard = new ArrayList<HazardType>();
        }
        return this.hazard;
    }

    /**
     * Gets the value of the warningGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningGroupType }
     * 
     * 
     */
    public List<WarningGroupType> getWarningGroup() {
        if (warningGroup == null) {
            warningGroup = new ArrayList<WarningGroupType>();
        }
        return this.warningGroup;
    }

    /**
     * Gets the value of the aac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAac() {
        return aac;
    }

    /**
     * Sets the value of the aac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAac(String value) {
        this.aac = value;
    }

    /**
     * Gets the value of the parentAac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAac() {
        return parentAac;
    }

    /**
     * Sets the value of the parentAac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAac(String value) {
        this.parentAac = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}