//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.21 at 05:00:18 PM ICT 
//


package org.opencps.thirdparty.system.nsw.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMSCrossBorderTransportPermit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMSCrossBorderTransportPermit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegistrationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Manufacturedyear" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrademarkCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TrademarkName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Model" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Truck">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Bus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Others">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleColor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EngineNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChassisNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NameOfCompany" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Tel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Fax" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TransportOperation" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="500"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LicenceNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpiredDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidFrom">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ValidUntil">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpImpGateCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpImpGate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TravelingArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Destination" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LicenceNoGMS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpireDateGMS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Extension">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExtendedUntil">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NoticesOfExtension">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}AttachedFile" maxOccurs="unbounded"/>
 *         &lt;element ref="{}IssuingAuthority"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMSCrossBorderTransportPermit", propOrder = {
    "registrationNumber",
    "manufacturedyear",
    "trademarkCode",
    "trademarkName",
    "model",
    "vehicleType",
    "vehicleColor",
    "engineNumber",
    "chassisNumber",
    "nameOfCompany",
    "address",
    "tel",
    "fax",
    "transportOperation",
    "licenceNo",
    "expiredDate",
    "validFrom",
    "validUntil",
    "expImpGateCode",
    "expImpGate",
    "travelingArea",
    "destination",
    "licenceNoGMS",
    "expireDateGMS",
    "extension",
    "attachedFile",
    "issuingAuthority"
})
public class GMSCrossBorderTransportPermit {

    @XmlElement(name = "RegistrationNumber", required = true)
    protected String registrationNumber;
    @XmlElement(name = "Manufacturedyear")
    protected String manufacturedyear;
    @XmlElement(name = "TrademarkCode")
    protected String trademarkCode;
    @XmlElement(name = "TrademarkName")
    protected String trademarkName;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "VehicleType", required = true)
    protected GMSCrossBorderTransportPermit.VehicleType vehicleType;
    @XmlElement(name = "VehicleColor")
    protected String vehicleColor;
    @XmlElement(name = "EngineNumber")
    protected String engineNumber;
    @XmlElement(name = "ChassisNumber")
    protected String chassisNumber;
    @XmlElement(name = "NameOfCompany")
    protected String nameOfCompany;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "TransportOperation")
    protected String transportOperation;
    @XmlElement(name = "LicenceNo")
    protected String licenceNo;
    @XmlElement(name = "ExpiredDate", required = true)
    protected String expiredDate;
    @XmlElement(name = "ValidFrom", required = true)
    protected String validFrom;
    @XmlElement(name = "ValidUntil", required = true)
    protected String validUntil;
    @XmlElement(name = "ExpImpGateCode")
    protected String expImpGateCode;
    @XmlElement(name = "ExpImpGate")
    protected String expImpGate;
    @XmlElement(name = "TravelingArea")
    protected String travelingArea;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "LicenceNoGMS")
    protected String licenceNoGMS;
    @XmlElement(name = "ExpireDateGMS")
    protected String expireDateGMS;
    @XmlElement(name = "Extension", required = true)
    protected GMSCrossBorderTransportPermit.Extension extension;
    @XmlElement(name = "AttachedFile", required = true)
    protected List<AttachedFile> attachedFile;
    @XmlElement(name = "IssuingAuthority", required = true)
    protected IssuingAuthority issuingAuthority;

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the manufacturedyear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturedyear() {
        return manufacturedyear;
    }

    /**
     * Sets the value of the manufacturedyear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturedyear(String value) {
        this.manufacturedyear = value;
    }

    /**
     * Gets the value of the trademarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademarkCode() {
        return trademarkCode;
    }

    /**
     * Sets the value of the trademarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademarkCode(String value) {
        this.trademarkCode = value;
    }

    /**
     * Gets the value of the trademarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrademarkName() {
        return trademarkName;
    }

    /**
     * Sets the value of the trademarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrademarkName(String value) {
        this.trademarkName = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link GMSCrossBorderTransportPermit.VehicleType }
     *     
     */
    public GMSCrossBorderTransportPermit.VehicleType getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMSCrossBorderTransportPermit.VehicleType }
     *     
     */
    public void setVehicleType(GMSCrossBorderTransportPermit.VehicleType value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    /**
     * Sets the value of the vehicleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColor(String value) {
        this.vehicleColor = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineNumber(String value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassisNumber(String value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the nameOfCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    /**
     * Sets the value of the nameOfCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfCompany(String value) {
        this.nameOfCompany = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the transportOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportOperation() {
        return transportOperation;
    }

    /**
     * Sets the value of the transportOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportOperation(String value) {
        this.transportOperation = value;
    }

    /**
     * Gets the value of the licenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNo() {
        return licenceNo;
    }

    /**
     * Sets the value of the licenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNo(String value) {
        this.licenceNo = value;
    }

    /**
     * Gets the value of the expiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredDate() {
        return expiredDate;
    }

    /**
     * Sets the value of the expiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredDate(String value) {
        this.expiredDate = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUntil(String value) {
        this.validUntil = value;
    }

    /**
     * Gets the value of the expImpGateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpImpGateCode() {
        return expImpGateCode;
    }

    /**
     * Sets the value of the expImpGateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpImpGateCode(String value) {
        this.expImpGateCode = value;
    }

    /**
     * Gets the value of the expImpGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpImpGate() {
        return expImpGate;
    }

    /**
     * Sets the value of the expImpGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpImpGate(String value) {
        this.expImpGate = value;
    }

    /**
     * Gets the value of the travelingArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelingArea() {
        return travelingArea;
    }

    /**
     * Sets the value of the travelingArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelingArea(String value) {
        this.travelingArea = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the licenceNoGMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNoGMS() {
        return licenceNoGMS;
    }

    /**
     * Sets the value of the licenceNoGMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNoGMS(String value) {
        this.licenceNoGMS = value;
    }

    /**
     * Gets the value of the expireDateGMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDateGMS() {
        return expireDateGMS;
    }

    /**
     * Sets the value of the expireDateGMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDateGMS(String value) {
        this.expireDateGMS = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link GMSCrossBorderTransportPermit.Extension }
     *     
     */
    public GMSCrossBorderTransportPermit.Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMSCrossBorderTransportPermit.Extension }
     *     
     */
    public void setExtension(GMSCrossBorderTransportPermit.Extension value) {
        this.extension = value;
    }

    /**
     * Gets the value of the attachedFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedFile }
     * 
     * 
     */
    public List<AttachedFile> getAttachedFile() {
        if (attachedFile == null) {
            attachedFile = new ArrayList<AttachedFile>();
        }
        return this.attachedFile;
    }

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link IssuingAuthority }
     *     
     */
    public IssuingAuthority getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuingAuthority }
     *     
     */
    public void setIssuingAuthority(IssuingAuthority value) {
        this.issuingAuthority = value;
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
     *         &lt;element name="ExtendedUntil">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NoticesOfExtension">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "extendedUntil",
        "noticesOfExtension"
    })
    public static class Extension {

        @XmlElement(name = "ExtendedUntil", required = true)
        protected String extendedUntil;
        @XmlElement(name = "NoticesOfExtension", required = true)
        protected String noticesOfExtension;

        /**
         * Gets the value of the extendedUntil property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtendedUntil() {
            return extendedUntil;
        }

        /**
         * Sets the value of the extendedUntil property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtendedUntil(String value) {
            this.extendedUntil = value;
        }

        /**
         * Gets the value of the noticesOfExtension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNoticesOfExtension() {
            return noticesOfExtension;
        }

        /**
         * Sets the value of the noticesOfExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNoticesOfExtension(String value) {
            this.noticesOfExtension = value;
        }

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
     *         &lt;element name="Truck">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Bus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Others">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "truck",
        "bus",
        "others"
    })
    public static class VehicleType {

        @XmlElement(name = "Truck", required = true)
        protected String truck;
        @XmlElement(name = "Bus", required = true)
        protected String bus;
        @XmlElement(name = "Others", required = true)
        protected String others;

        /**
         * Gets the value of the truck property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTruck() {
            return truck;
        }

        /**
         * Sets the value of the truck property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTruck(String value) {
            this.truck = value;
        }

        /**
         * Gets the value of the bus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBus() {
            return bus;
        }

        /**
         * Sets the value of the bus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBus(String value) {
            this.bus = value;
        }

        /**
         * Gets the value of the others property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOthers() {
            return others;
        }

        /**
         * Sets the value of the others property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOthers(String value) {
            this.others = value;
        }

    }

}
