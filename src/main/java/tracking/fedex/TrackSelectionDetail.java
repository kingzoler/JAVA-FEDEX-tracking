//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.27 ʱ�� 10:50:45 AM CST 
//


package tracking.fedex;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TrackSelectionDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackSelectionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/track/v10}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://fedex.com/ws/track/v10}OperatingCompanyType" minOccurs="0"/>
 *         &lt;element name="PackageIdentifier" type="{http://fedex.com/ws/track/v10}TrackPackageIdentifier" minOccurs="0"/>
 *         &lt;element name="TrackingNumberUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDateRangeBegin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ShipDateRangeEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ShipmentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecureSpodAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="PagingDetail" type="{http://fedex.com/ws/track/v10}PagingDetail" minOccurs="0"/>
 *         &lt;element name="CustomerSpecifiedTimeOutValueInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSelectionDetail", propOrder = {
    "carrierCode",
    "operatingCompany",
    "packageIdentifier",
    "trackingNumberUniqueIdentifier",
    "shipDateRangeBegin",
    "shipDateRangeEnd",
    "shipmentAccountNumber",
    "secureSpodAccount",
    "destination",
    "pagingDetail",
    "customerSpecifiedTimeOutValueInMilliseconds"
})
public class TrackSelectionDetail {

    @XmlElement(name = "CarrierCode")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "OperatingCompany")
    @XmlSchemaType(name = "string")
    protected OperatingCompanyType operatingCompany;
    @XmlElement(name = "PackageIdentifier")
    protected TrackPackageIdentifier packageIdentifier;
    @XmlElement(name = "TrackingNumberUniqueIdentifier")
    protected String trackingNumberUniqueIdentifier;
    @XmlElement(name = "ShipDateRangeBegin")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateRangeBegin;
    @XmlElement(name = "ShipDateRangeEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateRangeEnd;
    @XmlElement(name = "ShipmentAccountNumber")
    protected String shipmentAccountNumber;
    @XmlElement(name = "SecureSpodAccount")
    protected String secureSpodAccount;
    @XmlElement(name = "Destination")
    protected Address destination;
    @XmlElement(name = "PagingDetail")
    protected PagingDetail pagingDetail;
    @XmlElement(name = "CustomerSpecifiedTimeOutValueInMilliseconds")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger customerSpecifiedTimeOutValueInMilliseconds;

    /**
     * ��ȡcarrierCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }

    /**
     * ����carrierCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setCarrierCode(CarrierCodeType value) {
        this.carrierCode = value;
    }

    /**
     * ��ȡoperatingCompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompanyType }
     *     
     */
    public OperatingCompanyType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * ����operatingCompany���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompanyType }
     *     
     */
    public void setOperatingCompany(OperatingCompanyType value) {
        this.operatingCompany = value;
    }

    /**
     * ��ȡpackageIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackPackageIdentifier }
     *     
     */
    public TrackPackageIdentifier getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * ����packageIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPackageIdentifier }
     *     
     */
    public void setPackageIdentifier(TrackPackageIdentifier value) {
        this.packageIdentifier = value;
    }

    /**
     * ��ȡtrackingNumberUniqueIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }

    /**
     * ����trackingNumberUniqueIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberUniqueIdentifier(String value) {
        this.trackingNumberUniqueIdentifier = value;
    }

    /**
     * ��ȡshipDateRangeBegin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateRangeBegin() {
        return shipDateRangeBegin;
    }

    /**
     * ����shipDateRangeBegin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateRangeBegin(XMLGregorianCalendar value) {
        this.shipDateRangeBegin = value;
    }

    /**
     * ��ȡshipDateRangeEnd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateRangeEnd() {
        return shipDateRangeEnd;
    }

    /**
     * ����shipDateRangeEnd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateRangeEnd(XMLGregorianCalendar value) {
        this.shipDateRangeEnd = value;
    }

    /**
     * ��ȡshipmentAccountNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentAccountNumber() {
        return shipmentAccountNumber;
    }

    /**
     * ����shipmentAccountNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentAccountNumber(String value) {
        this.shipmentAccountNumber = value;
    }

    /**
     * ��ȡsecureSpodAccount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureSpodAccount() {
        return secureSpodAccount;
    }

    /**
     * ����secureSpodAccount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureSpodAccount(String value) {
        this.secureSpodAccount = value;
    }

    /**
     * ��ȡdestination���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestination() {
        return destination;
    }

    /**
     * ����destination���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestination(Address value) {
        this.destination = value;
    }

    /**
     * ��ȡpagingDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PagingDetail }
     *     
     */
    public PagingDetail getPagingDetail() {
        return pagingDetail;
    }

    /**
     * ����pagingDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PagingDetail }
     *     
     */
    public void setPagingDetail(PagingDetail value) {
        this.pagingDetail = value;
    }

    /**
     * ��ȡcustomerSpecifiedTimeOutValueInMilliseconds���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerSpecifiedTimeOutValueInMilliseconds() {
        return customerSpecifiedTimeOutValueInMilliseconds;
    }

    /**
     * ����customerSpecifiedTimeOutValueInMilliseconds���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerSpecifiedTimeOutValueInMilliseconds(BigInteger value) {
        this.customerSpecifiedTimeOutValueInMilliseconds = value;
    }

}
