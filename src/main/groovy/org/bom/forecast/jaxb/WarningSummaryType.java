//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.23 at 08:36:19 AM AEST 
//


package org.bom.forecast.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for warning-summaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="warning-summaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{}periodic-warning-summaryType">
 *       &lt;attribute name="start-time-utc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="start-time-local" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="end-time-utc" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="end-time-local" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "warning-summaryType")
public class WarningSummaryType
    extends PeriodicWarningSummaryType
{

    @XmlAttribute(name = "start-time-utc", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimeUtc;
    @XmlAttribute(name = "start-time-local", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimeLocal;
    @XmlAttribute(name = "end-time-utc", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeUtc;
    @XmlAttribute(name = "end-time-local", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeLocal;

    /**
     * Gets the value of the startTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeUtc() {
        return startTimeUtc;
    }

    /**
     * Sets the value of the startTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeUtc(XMLGregorianCalendar value) {
        this.startTimeUtc = value;
    }

    /**
     * Gets the value of the startTimeLocal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeLocal() {
        return startTimeLocal;
    }

    /**
     * Sets the value of the startTimeLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeLocal(XMLGregorianCalendar value) {
        this.startTimeLocal = value;
    }

    /**
     * Gets the value of the endTimeUtc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeUtc() {
        return endTimeUtc;
    }

    /**
     * Sets the value of the endTimeUtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeUtc(XMLGregorianCalendar value) {
        this.endTimeUtc = value;
    }

    /**
     * Gets the value of the endTimeLocal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeLocal() {
        return endTimeLocal;
    }

    /**
     * Sets the value of the endTimeLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeLocal(XMLGregorianCalendar value) {
        this.endTimeLocal = value;
    }

}