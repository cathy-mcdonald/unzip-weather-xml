//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.23 at 08:36:19 AM AEST 
//


package org.bom.forecast.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.bom.forecast.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Product_QNAME = new QName("", "product");
    private final static QName _Amoc_QNAME = new QName("", "amoc");
    private final static QName _PeriodicHazardTypeTextP_QNAME = new QName("", "p");
    private final static QName _WarningSummariesTypeForecastArea_QNAME = new QName("", "forecast-area");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.bom.forecast.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AreaListType }
     * 
     */
    public AreaListType createAreaListType() {
        return new AreaListType();
    }

    /**
     * Create an instance of {@link PhenomenonListType }
     * 
     */
    public PhenomenonListType createPhenomenonListType() {
        return new PhenomenonListType();
    }

    /**
     * Create an instance of {@link PeriodicHazardType }
     * 
     */
    public PeriodicHazardType createPeriodicHazardType() {
        return new PeriodicHazardType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link AmocType }
     * 
     */
    public AmocType createAmocType() {
        return new AmocType();
    }

    /**
     * Create an instance of {@link ForecastPeriodType }
     * 
     */
    public ForecastPeriodType createForecastPeriodType() {
        return new ForecastPeriodType();
    }

    /**
     * Create an instance of {@link StationType }
     * 
     */
    public StationType createStationType() {
        return new StationType();
    }

    /**
     * Create an instance of {@link WarningInfoType }
     * 
     */
    public WarningInfoType createWarningInfoType() {
        return new WarningInfoType();
    }

    /**
     * Create an instance of {@link TextElementType }
     * 
     */
    public TextElementType createTextElementType() {
        return new TextElementType();
    }

    /**
     * Create an instance of {@link LevelType }
     * 
     */
    public LevelType createLevelType() {
        return new LevelType();
    }

    /**
     * Create an instance of {@link AreaType }
     * 
     */
    public AreaType createAreaType() {
        return new AreaType();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link WarningSummaryType }
     * 
     */
    public WarningSummaryType createWarningSummaryType() {
        return new WarningSummaryType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link PeriodicWarningSummaryType }
     * 
     */
    public PeriodicWarningSummaryType createPeriodicWarningSummaryType() {
        return new PeriodicWarningSummaryType();
    }

    /**
     * Create an instance of {@link ForecastType }
     * 
     */
    public ForecastType createForecastType() {
        return new ForecastType();
    }

    /**
     * Create an instance of {@link ObservationsType }
     * 
     */
    public ObservationsType createObservationsType() {
        return new ObservationsType();
    }

    /**
     * Create an instance of {@link HazardType }
     * 
     */
    public HazardType createHazardType() {
        return new HazardType();
    }

    /**
     * Create an instance of {@link WarningSummariesType }
     * 
     */
    public WarningSummariesType createWarningSummariesType() {
        return new WarningSummariesType();
    }

    /**
     * Create an instance of {@link WarningGroupType }
     * 
     */
    public WarningGroupType createWarningGroupType() {
        return new WarningGroupType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link ObservationPeriodType }
     * 
     */
    public ObservationPeriodType createObservationPeriodType() {
        return new ObservationPeriodType();
    }

    /**
     * Create an instance of {@link AreaListType.Area }
     * 
     */
    public AreaListType.Area createAreaListTypeArea() {
        return new AreaListType.Area();
    }

    /**
     * Create an instance of {@link PhenomenonListType.Phenomenon }
     * 
     */
    public PhenomenonListType.Phenomenon createPhenomenonListTypePhenomenon() {
        return new PhenomenonListType.Phenomenon();
    }

    /**
     * Create an instance of {@link PeriodicHazardType.Text }
     * 
     */
    public PeriodicHazardType.Text createPeriodicHazardTypeText() {
        return new PeriodicHazardType.Text();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "product")
    public JAXBElement<ProductType> createProduct(ProductType value) {
        return new JAXBElement<ProductType>(_Product_QNAME, ProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "amoc")
    public JAXBElement<AmocType> createAmoc(AmocType value) {
        return new JAXBElement<AmocType>(_Amoc_QNAME, AmocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "p", scope = PeriodicHazardType.Text.class)
    public JAXBElement<String> createPeriodicHazardTypeTextP(String value) {
        return new JAXBElement<String>(_PeriodicHazardTypeTextP_QNAME, String.class, PeriodicHazardType.Text.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "forecast-area", scope = WarningSummariesType.class)
    public JAXBElement<AreaType> createWarningSummariesTypeForecastArea(AreaType value) {
        return new JAXBElement<AreaType>(_WarningSummariesTypeForecastArea_QNAME, AreaType.class, WarningSummariesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "p", scope = TextElementType.class)
    public JAXBElement<String> createTextElementTypeP(String value) {
        return new JAXBElement<String>(_PeriodicHazardTypeTextP_QNAME, String.class, TextElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "p", scope = PeriodicWarningSummaryType.class)
    public JAXBElement<String> createPeriodicWarningSummaryTypeP(String value) {
        return new JAXBElement<String>(_PeriodicHazardTypeTextP_QNAME, String.class, PeriodicWarningSummaryType.class, value);
    }

}
