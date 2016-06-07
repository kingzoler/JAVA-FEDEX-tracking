//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.27 ʱ�� 10:50:45 AM CST 
//


package tracking.fedex;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Detailed tracking information about a particular package.
 * 
 * <p>TrackDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notification" type="{http://fedex.com/ws/track/v10}Notification" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Barcode" type="{http://fedex.com/ws/track/v10}StringBarcode" minOccurs="0"/>
 *         &lt;element name="TrackingNumberUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDetail" type="{http://fedex.com/ws/track/v10}TrackStatusDetail" minOccurs="0"/>
 *         &lt;element name="CustomerExceptionRequests" type="{http://fedex.com/ws/track/v10}CustomerExceptionRequestDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Reconciliation" type="{http://fedex.com/ws/track/v10}TrackReconciliation" minOccurs="0"/>
 *         &lt;element name="ServiceCommitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationServiceAreaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/track/v10}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://fedex.com/ws/track/v10}OperatingCompanyType" minOccurs="0"/>
 *         &lt;element name="OperatingCompanyOrCarrierDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CartageAgentCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionLocationContactAndAddress" type="{http://fedex.com/ws/track/v10}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="OtherIdentifiers" type="{http://fedex.com/ws/track/v10}TrackOtherIdentifierDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://fedex.com/ws/track/v10}TrackServiceDescriptionDetail" minOccurs="0"/>
 *         &lt;element name="PackageWeight" type="{http://fedex.com/ws/track/v10}Weight" minOccurs="0"/>
 *         &lt;element name="PackageDimensions" type="{http://fedex.com/ws/track/v10}Dimensions" minOccurs="0"/>
 *         &lt;element name="PackageDimensionalWeight" type="{http://fedex.com/ws/track/v10}Weight" minOccurs="0"/>
 *         &lt;element name="ShipmentWeight" type="{http://fedex.com/ws/track/v10}Weight" minOccurs="0"/>
 *         &lt;element name="Packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagingType" type="{http://fedex.com/ws/track/v10}PackagingType" minOccurs="0"/>
 *         &lt;element name="PackageSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Charges" type="{http://fedex.com/ws/track/v10}TrackChargeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/track/v10}TrackDetailAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipmentContents" type="{http://fedex.com/ws/track/v10}ContentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackageContents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClearanceLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commodities" type="{http://fedex.com/ws/track/v10}Commodity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnDetail" type="{http://fedex.com/ws/track/v10}TrackReturnDetail" minOccurs="0"/>
 *         &lt;element name="CustomsOptionDetails" type="{http://fedex.com/ws/track/v10}CustomsOptionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdvanceNotificationDetail" type="{http://fedex.com/ws/track/v10}TrackAdvanceNotificationDetail" minOccurs="0"/>
 *         &lt;element name="SpecialHandlings" type="{http://fedex.com/ws/track/v10}TrackSpecialHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shipper" type="{http://fedex.com/ws/track/v10}Contact" minOccurs="0"/>
 *         &lt;element name="PossessionStatus" type="{http://fedex.com/ws/track/v10}TrackPossessionStatusType" minOccurs="0"/>
 *         &lt;element name="ShipperAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="OriginLocationAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="OriginStationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedPickupTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalTransitDistance" type="{http://fedex.com/ws/track/v10}Distance" minOccurs="0"/>
 *         &lt;element name="DistanceToDestination" type="{http://fedex.com/ws/track/v10}Distance" minOccurs="0"/>
 *         &lt;element name="SpecialInstructions" type="{http://fedex.com/ws/track/v10}TrackSpecialInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Recipient" type="{http://fedex.com/ws/track/v10}Contact" minOccurs="0"/>
 *         &lt;element name="LastUpdatedDestinationAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="DestinationAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="HoldAtLocationContact" type="{http://fedex.com/ws/track/v10}Contact" minOccurs="0"/>
 *         &lt;element name="HoldAtLocationAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="DestinationStationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationLocationAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="DestinationLocationType" type="{http://fedex.com/ws/track/v10}FedExLocationType" minOccurs="0"/>
 *         &lt;element name="DestinationLocationTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AppointmentDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryAddress" type="{http://fedex.com/ws/track/v10}Address" minOccurs="0"/>
 *         &lt;element name="OfficeOrderDeliveryMethod" type="{http://fedex.com/ws/track/v10}OfficeOrderDeliveryMethodType" minOccurs="0"/>
 *         &lt;element name="DeliveryLocationType" type="{http://fedex.com/ws/track/v10}TrackDeliveryLocationType" minOccurs="0"/>
 *         &lt;element name="DeliveryLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAttempts" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DeliverySignatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PieceCountVerificationDetails" type="{http://fedex.com/ws/track/v10}PieceCountVerificationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalUniqueAddressCountInConsolidation" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="AvailableImages" type="{http://fedex.com/ws/track/v10}AvailableImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://fedex.com/ws/track/v10}SignatureImageDetail" minOccurs="0"/>
 *         &lt;element name="NotificationEventsAvailable" type="{http://fedex.com/ws/track/v10}EMailNotificationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitShipmentParts" type="{http://fedex.com/ws/track/v10}TrackSplitShipmentPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryOptionEligibilityDetails" type="{http://fedex.com/ws/track/v10}DeliveryOptionEligibilityDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://fedex.com/ws/track/v10}TrackEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackDetail", propOrder = {
    "notification",
    "trackingNumber",
    "barcode",
    "trackingNumberUniqueIdentifier",
    "statusDetail",
    "customerExceptionRequests",
    "reconciliation",
    "serviceCommitMessage",
    "destinationServiceArea",
    "destinationServiceAreaDescription",
    "carrierCode",
    "operatingCompany",
    "operatingCompanyOrCarrierDescription",
    "cartageAgentCompanyName",
    "productionLocationContactAndAddress",
    "otherIdentifiers",
    "formId",
    "service",
    "packageWeight",
    "packageDimensions",
    "packageDimensionalWeight",
    "shipmentWeight",
    "packaging",
    "packagingType",
    "packageSequenceNumber",
    "packageCount",
    "charges",
    "nickName",
    "notes",
    "attributes",
    "shipmentContents",
    "packageContents",
    "clearanceLocationCode",
    "commodities",
    "returnDetail",
    "customsOptionDetails",
    "advanceNotificationDetail",
    "specialHandlings",
    "shipper",
    "possessionStatus",
    "shipperAddress",
    "originLocationAddress",
    "originStationId",
    "estimatedPickupTimestamp",
    "shipTimestamp",
    "totalTransitDistance",
    "distanceToDestination",
    "specialInstructions",
    "recipient",
    "lastUpdatedDestinationAddress",
    "destinationAddress",
    "holdAtLocationContact",
    "holdAtLocationAddress",
    "destinationStationId",
    "destinationLocationAddress",
    "destinationLocationType",
    "destinationLocationTimeZoneOffset",
    "commitmentTimestamp",
    "appointmentDeliveryTimestamp",
    "estimatedDeliveryTimestamp",
    "actualDeliveryTimestamp",
    "actualDeliveryAddress",
    "officeOrderDeliveryMethod",
    "deliveryLocationType",
    "deliveryLocationDescription",
    "deliveryAttempts",
    "deliverySignatureName",
    "pieceCountVerificationDetails",
    "totalUniqueAddressCountInConsolidation",
    "availableImages",
    "signature",
    "notificationEventsAvailable",
    "splitShipmentParts",
    "deliveryOptionEligibilityDetails",
    "events"
})
public class TrackDetail {

    @XmlElement(name = "Notification")
    protected Notification notification;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "Barcode")
    protected StringBarcode barcode;
    @XmlElement(name = "TrackingNumberUniqueIdentifier")
    protected String trackingNumberUniqueIdentifier;
    @XmlElement(name = "StatusDetail")
    protected TrackStatusDetail statusDetail;
    @XmlElement(name = "CustomerExceptionRequests")
    protected List<CustomerExceptionRequestDetail> customerExceptionRequests;
    @XmlElement(name = "Reconciliation")
    protected TrackReconciliation reconciliation;
    @XmlElement(name = "ServiceCommitMessage")
    protected String serviceCommitMessage;
    @XmlElement(name = "DestinationServiceArea")
    protected String destinationServiceArea;
    @XmlElement(name = "DestinationServiceAreaDescription")
    protected String destinationServiceAreaDescription;
    @XmlElement(name = "CarrierCode")
    @XmlSchemaType(name = "string")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "OperatingCompany")
    @XmlSchemaType(name = "string")
    protected OperatingCompanyType operatingCompany;
    @XmlElement(name = "OperatingCompanyOrCarrierDescription")
    protected String operatingCompanyOrCarrierDescription;
    @XmlElement(name = "CartageAgentCompanyName")
    protected String cartageAgentCompanyName;
    @XmlElement(name = "ProductionLocationContactAndAddress")
    protected ContactAndAddress productionLocationContactAndAddress;
    @XmlElement(name = "OtherIdentifiers")
    protected List<TrackOtherIdentifierDetail> otherIdentifiers;
    @XmlElement(name = "FormId")
    protected String formId;
    @XmlElement(name = "Service")
    protected TrackServiceDescriptionDetail service;
    @XmlElement(name = "PackageWeight")
    protected Weight packageWeight;
    @XmlElement(name = "PackageDimensions")
    protected Dimensions packageDimensions;
    @XmlElement(name = "PackageDimensionalWeight")
    protected Weight packageDimensionalWeight;
    @XmlElement(name = "ShipmentWeight")
    protected Weight shipmentWeight;
    @XmlElement(name = "Packaging")
    protected String packaging;
    @XmlElement(name = "PackagingType")
    @XmlSchemaType(name = "string")
    protected PackagingType packagingType;
    @XmlElement(name = "PackageSequenceNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageSequenceNumber;
    @XmlElement(name = "PackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageCount;
    @XmlElement(name = "Charges")
    protected List<TrackChargeDetail> charges;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Attributes")
    @XmlSchemaType(name = "string")
    protected List<TrackDetailAttributeType> attributes;
    @XmlElement(name = "ShipmentContents")
    protected List<ContentRecord> shipmentContents;
    @XmlElement(name = "PackageContents")
    protected List<String> packageContents;
    @XmlElement(name = "ClearanceLocationCode")
    protected String clearanceLocationCode;
    @XmlElement(name = "Commodities")
    protected List<Commodity> commodities;
    @XmlElement(name = "ReturnDetail")
    protected TrackReturnDetail returnDetail;
    @XmlElement(name = "CustomsOptionDetails")
    protected List<CustomsOptionDetail> customsOptionDetails;
    @XmlElement(name = "AdvanceNotificationDetail")
    protected TrackAdvanceNotificationDetail advanceNotificationDetail;
    @XmlElement(name = "SpecialHandlings")
    protected List<TrackSpecialHandling> specialHandlings;
    @XmlElement(name = "Shipper")
    protected Contact shipper;
    @XmlElement(name = "PossessionStatus")
    @XmlSchemaType(name = "string")
    protected TrackPossessionStatusType possessionStatus;
    @XmlElement(name = "ShipperAddress")
    protected Address shipperAddress;
    @XmlElement(name = "OriginLocationAddress")
    protected Address originLocationAddress;
    @XmlElement(name = "OriginStationId")
    protected String originStationId;
    @XmlElement(name = "EstimatedPickupTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedPickupTimestamp;
    @XmlElement(name = "ShipTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipTimestamp;
    @XmlElement(name = "TotalTransitDistance")
    protected Distance totalTransitDistance;
    @XmlElement(name = "DistanceToDestination")
    protected Distance distanceToDestination;
    @XmlElement(name = "SpecialInstructions")
    protected List<TrackSpecialInstruction> specialInstructions;
    @XmlElement(name = "Recipient")
    protected Contact recipient;
    @XmlElement(name = "LastUpdatedDestinationAddress")
    protected Address lastUpdatedDestinationAddress;
    @XmlElement(name = "DestinationAddress")
    protected Address destinationAddress;
    @XmlElement(name = "HoldAtLocationContact")
    protected Contact holdAtLocationContact;
    @XmlElement(name = "HoldAtLocationAddress")
    protected Address holdAtLocationAddress;
    @XmlElement(name = "DestinationStationId")
    protected String destinationStationId;
    @XmlElement(name = "DestinationLocationAddress")
    protected Address destinationLocationAddress;
    @XmlElement(name = "DestinationLocationType")
    @XmlSchemaType(name = "string")
    protected FedExLocationType destinationLocationType;
    @XmlElement(name = "DestinationLocationTimeZoneOffset")
    protected String destinationLocationTimeZoneOffset;
    @XmlElement(name = "CommitmentTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commitmentTimestamp;
    @XmlElement(name = "AppointmentDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentDeliveryTimestamp;
    @XmlElement(name = "EstimatedDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryTimestamp;
    @XmlElement(name = "ActualDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDeliveryTimestamp;
    @XmlElement(name = "ActualDeliveryAddress")
    protected Address actualDeliveryAddress;
    @XmlElement(name = "OfficeOrderDeliveryMethod")
    @XmlSchemaType(name = "string")
    protected OfficeOrderDeliveryMethodType officeOrderDeliveryMethod;
    @XmlElement(name = "DeliveryLocationType")
    @XmlSchemaType(name = "string")
    protected TrackDeliveryLocationType deliveryLocationType;
    @XmlElement(name = "DeliveryLocationDescription")
    protected String deliveryLocationDescription;
    @XmlElement(name = "DeliveryAttempts")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger deliveryAttempts;
    @XmlElement(name = "DeliverySignatureName")
    protected String deliverySignatureName;
    @XmlElement(name = "PieceCountVerificationDetails")
    protected List<PieceCountVerificationDetail> pieceCountVerificationDetails;
    @XmlElement(name = "TotalUniqueAddressCountInConsolidation")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalUniqueAddressCountInConsolidation;
    @XmlElement(name = "AvailableImages")
    @XmlSchemaType(name = "string")
    protected List<AvailableImageType> availableImages;
    @XmlElement(name = "Signature")
    protected SignatureImageDetail signature;
    @XmlElement(name = "NotificationEventsAvailable")
    @XmlSchemaType(name = "string")
    protected List<EMailNotificationEventType> notificationEventsAvailable;
    @XmlElement(name = "SplitShipmentParts")
    protected List<TrackSplitShipmentPart> splitShipmentParts;
    @XmlElement(name = "DeliveryOptionEligibilityDetails")
    protected List<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails;
    @XmlElement(name = "Events")
    protected List<TrackEvent> events;

    /**
     * ��ȡnotification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * ����notification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setNotification(Notification value) {
        this.notification = value;
    }

    /**
     * ��ȡtrackingNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * ����trackingNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * ��ȡbarcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StringBarcode }
     *     
     */
    public StringBarcode getBarcode() {
        return barcode;
    }

    /**
     * ����barcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StringBarcode }
     *     
     */
    public void setBarcode(StringBarcode value) {
        this.barcode = value;
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
     * ��ȡstatusDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackStatusDetail }
     *     
     */
    public TrackStatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * ����statusDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackStatusDetail }
     *     
     */
    public void setStatusDetail(TrackStatusDetail value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the customerExceptionRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerExceptionRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerExceptionRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerExceptionRequestDetail }
     * 
     * 
     */
    public List<CustomerExceptionRequestDetail> getCustomerExceptionRequests() {
        if (customerExceptionRequests == null) {
            customerExceptionRequests = new ArrayList<CustomerExceptionRequestDetail>();
        }
        return this.customerExceptionRequests;
    }

    /**
     * ��ȡreconciliation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackReconciliation }
     *     
     */
    public TrackReconciliation getReconciliation() {
        return reconciliation;
    }

    /**
     * ����reconciliation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReconciliation }
     *     
     */
    public void setReconciliation(TrackReconciliation value) {
        this.reconciliation = value;
    }

    /**
     * ��ȡserviceCommitMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCommitMessage() {
        return serviceCommitMessage;
    }

    /**
     * ����serviceCommitMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCommitMessage(String value) {
        this.serviceCommitMessage = value;
    }

    /**
     * ��ȡdestinationServiceArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    /**
     * ����destinationServiceArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServiceArea(String value) {
        this.destinationServiceArea = value;
    }

    /**
     * ��ȡdestinationServiceAreaDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }

    /**
     * ����destinationServiceAreaDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServiceAreaDescription(String value) {
        this.destinationServiceAreaDescription = value;
    }

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
     * ��ȡoperatingCompanyOrCarrierDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompanyOrCarrierDescription() {
        return operatingCompanyOrCarrierDescription;
    }

    /**
     * ����operatingCompanyOrCarrierDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompanyOrCarrierDescription(String value) {
        this.operatingCompanyOrCarrierDescription = value;
    }

    /**
     * ��ȡcartageAgentCompanyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartageAgentCompanyName() {
        return cartageAgentCompanyName;
    }

    /**
     * ����cartageAgentCompanyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartageAgentCompanyName(String value) {
        this.cartageAgentCompanyName = value;
    }

    /**
     * ��ȡproductionLocationContactAndAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getProductionLocationContactAndAddress() {
        return productionLocationContactAndAddress;
    }

    /**
     * ����productionLocationContactAndAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setProductionLocationContactAndAddress(ContactAndAddress value) {
        this.productionLocationContactAndAddress = value;
    }

    /**
     * Gets the value of the otherIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackOtherIdentifierDetail }
     * 
     * 
     */
    public List<TrackOtherIdentifierDetail> getOtherIdentifiers() {
        if (otherIdentifiers == null) {
            otherIdentifiers = new ArrayList<TrackOtherIdentifierDetail>();
        }
        return this.otherIdentifiers;
    }

    /**
     * ��ȡformId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * ����formId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * ��ȡservice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackServiceDescriptionDetail }
     *     
     */
    public TrackServiceDescriptionDetail getService() {
        return service;
    }

    /**
     * ����service���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackServiceDescriptionDetail }
     *     
     */
    public void setService(TrackServiceDescriptionDetail value) {
        this.service = value;
    }

    /**
     * ��ȡpackageWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getPackageWeight() {
        return packageWeight;
    }

    /**
     * ����packageWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setPackageWeight(Weight value) {
        this.packageWeight = value;
    }

    /**
     * ��ȡpackageDimensions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * ����packageDimensions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setPackageDimensions(Dimensions value) {
        this.packageDimensions = value;
    }

    /**
     * ��ȡpackageDimensionalWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getPackageDimensionalWeight() {
        return packageDimensionalWeight;
    }

    /**
     * ����packageDimensionalWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setPackageDimensionalWeight(Weight value) {
        this.packageDimensionalWeight = value;
    }

    /**
     * ��ȡshipmentWeight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * ����shipmentWeight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setShipmentWeight(Weight value) {
        this.shipmentWeight = value;
    }

    /**
     * ��ȡpackaging���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * ����packaging���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackaging(String value) {
        this.packaging = value;
    }

    /**
     * ��ȡpackagingType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }

    /**
     * ����packagingType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setPackagingType(PackagingType value) {
        this.packagingType = value;
    }

    /**
     * ��ȡpackageSequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageSequenceNumber() {
        return packageSequenceNumber;
    }

    /**
     * ����packageSequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageSequenceNumber(BigInteger value) {
        this.packageSequenceNumber = value;
    }

    /**
     * ��ȡpackageCount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageCount() {
        return packageCount;
    }

    /**
     * ����packageCount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageCount(BigInteger value) {
        this.packageCount = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackChargeDetail }
     * 
     * 
     */
    public List<TrackChargeDetail> getCharges() {
        if (charges == null) {
            charges = new ArrayList<TrackChargeDetail>();
        }
        return this.charges;
    }

    /**
     * ��ȡnickName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * ����nickName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * ��ȡnotes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * ����notes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackDetailAttributeType }
     * 
     * 
     */
    public List<TrackDetailAttributeType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<TrackDetailAttributeType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the shipmentContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentRecord }
     * 
     * 
     */
    public List<ContentRecord> getShipmentContents() {
        if (shipmentContents == null) {
            shipmentContents = new ArrayList<ContentRecord>();
        }
        return this.shipmentContents;
    }

    /**
     * Gets the value of the packageContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageContents() {
        if (packageContents == null) {
            packageContents = new ArrayList<String>();
        }
        return this.packageContents;
    }

    /**
     * ��ȡclearanceLocationCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceLocationCode() {
        return clearanceLocationCode;
    }

    /**
     * ����clearanceLocationCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceLocationCode(String value) {
        this.clearanceLocationCode = value;
    }

    /**
     * Gets the value of the commodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity }
     * 
     * 
     */
    public List<Commodity> getCommodities() {
        if (commodities == null) {
            commodities = new ArrayList<Commodity>();
        }
        return this.commodities;
    }

    /**
     * ��ȡreturnDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackReturnDetail }
     *     
     */
    public TrackReturnDetail getReturnDetail() {
        return returnDetail;
    }

    /**
     * ����returnDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReturnDetail }
     *     
     */
    public void setReturnDetail(TrackReturnDetail value) {
        this.returnDetail = value;
    }

    /**
     * Gets the value of the customsOptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsOptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsOptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsOptionDetail }
     * 
     * 
     */
    public List<CustomsOptionDetail> getCustomsOptionDetails() {
        if (customsOptionDetails == null) {
            customsOptionDetails = new ArrayList<CustomsOptionDetail>();
        }
        return this.customsOptionDetails;
    }

    /**
     * ��ȡadvanceNotificationDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackAdvanceNotificationDetail }
     *     
     */
    public TrackAdvanceNotificationDetail getAdvanceNotificationDetail() {
        return advanceNotificationDetail;
    }

    /**
     * ����advanceNotificationDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAdvanceNotificationDetail }
     *     
     */
    public void setAdvanceNotificationDetail(TrackAdvanceNotificationDetail value) {
        this.advanceNotificationDetail = value;
    }

    /**
     * Gets the value of the specialHandlings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSpecialHandling }
     * 
     * 
     */
    public List<TrackSpecialHandling> getSpecialHandlings() {
        if (specialHandlings == null) {
            specialHandlings = new ArrayList<TrackSpecialHandling>();
        }
        return this.specialHandlings;
    }

    /**
     * ��ȡshipper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getShipper() {
        return shipper;
    }

    /**
     * ����shipper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setShipper(Contact value) {
        this.shipper = value;
    }

    /**
     * ��ȡpossessionStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackPossessionStatusType }
     *     
     */
    public TrackPossessionStatusType getPossessionStatus() {
        return possessionStatus;
    }

    /**
     * ����possessionStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPossessionStatusType }
     *     
     */
    public void setPossessionStatus(TrackPossessionStatusType value) {
        this.possessionStatus = value;
    }

    /**
     * ��ȡshipperAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipperAddress() {
        return shipperAddress;
    }

    /**
     * ����shipperAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipperAddress(Address value) {
        this.shipperAddress = value;
    }

    /**
     * ��ȡoriginLocationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOriginLocationAddress() {
        return originLocationAddress;
    }

    /**
     * ����originLocationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOriginLocationAddress(Address value) {
        this.originLocationAddress = value;
    }

    /**
     * ��ȡoriginStationId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationId() {
        return originStationId;
    }

    /**
     * ����originStationId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationId(String value) {
        this.originStationId = value;
    }

    /**
     * ��ȡestimatedPickupTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedPickupTimestamp() {
        return estimatedPickupTimestamp;
    }

    /**
     * ����estimatedPickupTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedPickupTimestamp(XMLGregorianCalendar value) {
        this.estimatedPickupTimestamp = value;
    }

    /**
     * ��ȡshipTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipTimestamp() {
        return shipTimestamp;
    }

    /**
     * ����shipTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipTimestamp(XMLGregorianCalendar value) {
        this.shipTimestamp = value;
    }

    /**
     * ��ȡtotalTransitDistance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getTotalTransitDistance() {
        return totalTransitDistance;
    }

    /**
     * ����totalTransitDistance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setTotalTransitDistance(Distance value) {
        this.totalTransitDistance = value;
    }

    /**
     * ��ȡdistanceToDestination���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * ����distanceToDestination���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistanceToDestination(Distance value) {
        this.distanceToDestination = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSpecialInstruction }
     * 
     * 
     */
    public List<TrackSpecialInstruction> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<TrackSpecialInstruction>();
        }
        return this.specialInstructions;
    }

    /**
     * ��ȡrecipient���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getRecipient() {
        return recipient;
    }

    /**
     * ����recipient���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setRecipient(Contact value) {
        this.recipient = value;
    }

    /**
     * ��ȡlastUpdatedDestinationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }

    /**
     * ����lastUpdatedDestinationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setLastUpdatedDestinationAddress(Address value) {
        this.lastUpdatedDestinationAddress = value;
    }

    /**
     * ��ȡdestinationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * ����destinationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationAddress(Address value) {
        this.destinationAddress = value;
    }

    /**
     * ��ȡholdAtLocationContact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getHoldAtLocationContact() {
        return holdAtLocationContact;
    }

    /**
     * ����holdAtLocationContact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setHoldAtLocationContact(Contact value) {
        this.holdAtLocationContact = value;
    }

    /**
     * ��ȡholdAtLocationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getHoldAtLocationAddress() {
        return holdAtLocationAddress;
    }

    /**
     * ����holdAtLocationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setHoldAtLocationAddress(Address value) {
        this.holdAtLocationAddress = value;
    }

    /**
     * ��ȡdestinationStationId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationId() {
        return destinationStationId;
    }

    /**
     * ����destinationStationId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationId(String value) {
        this.destinationStationId = value;
    }

    /**
     * ��ȡdestinationLocationAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationLocationAddress() {
        return destinationLocationAddress;
    }

    /**
     * ����destinationLocationAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationLocationAddress(Address value) {
        this.destinationLocationAddress = value;
    }

    /**
     * ��ȡdestinationLocationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FedExLocationType }
     *     
     */
    public FedExLocationType getDestinationLocationType() {
        return destinationLocationType;
    }

    /**
     * ����destinationLocationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FedExLocationType }
     *     
     */
    public void setDestinationLocationType(FedExLocationType value) {
        this.destinationLocationType = value;
    }

    /**
     * ��ȡdestinationLocationTimeZoneOffset���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationTimeZoneOffset() {
        return destinationLocationTimeZoneOffset;
    }

    /**
     * ����destinationLocationTimeZoneOffset���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationTimeZoneOffset(String value) {
        this.destinationLocationTimeZoneOffset = value;
    }

    /**
     * ��ȡcommitmentTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitmentTimestamp() {
        return commitmentTimestamp;
    }

    /**
     * ����commitmentTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitmentTimestamp(XMLGregorianCalendar value) {
        this.commitmentTimestamp = value;
    }

    /**
     * ��ȡappointmentDeliveryTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDeliveryTimestamp() {
        return appointmentDeliveryTimestamp;
    }

    /**
     * ����appointmentDeliveryTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDeliveryTimestamp(XMLGregorianCalendar value) {
        this.appointmentDeliveryTimestamp = value;
    }

    /**
     * ��ȡestimatedDeliveryTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryTimestamp() {
        return estimatedDeliveryTimestamp;
    }

    /**
     * ����estimatedDeliveryTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryTimestamp(XMLGregorianCalendar value) {
        this.estimatedDeliveryTimestamp = value;
    }

    /**
     * ��ȡactualDeliveryTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDeliveryTimestamp() {
        return actualDeliveryTimestamp;
    }

    /**
     * ����actualDeliveryTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDeliveryTimestamp(XMLGregorianCalendar value) {
        this.actualDeliveryTimestamp = value;
    }

    /**
     * ��ȡactualDeliveryAddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }

    /**
     * ����actualDeliveryAddress���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setActualDeliveryAddress(Address value) {
        this.actualDeliveryAddress = value;
    }

    /**
     * ��ȡofficeOrderDeliveryMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OfficeOrderDeliveryMethodType }
     *     
     */
    public OfficeOrderDeliveryMethodType getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }

    /**
     * ����officeOrderDeliveryMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeOrderDeliveryMethodType }
     *     
     */
    public void setOfficeOrderDeliveryMethod(OfficeOrderDeliveryMethodType value) {
        this.officeOrderDeliveryMethod = value;
    }

    /**
     * ��ȡdeliveryLocationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackDeliveryLocationType }
     *     
     */
    public TrackDeliveryLocationType getDeliveryLocationType() {
        return deliveryLocationType;
    }

    /**
     * ����deliveryLocationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackDeliveryLocationType }
     *     
     */
    public void setDeliveryLocationType(TrackDeliveryLocationType value) {
        this.deliveryLocationType = value;
    }

    /**
     * ��ȡdeliveryLocationDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryLocationDescription() {
        return deliveryLocationDescription;
    }

    /**
     * ����deliveryLocationDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryLocationDescription(String value) {
        this.deliveryLocationDescription = value;
    }

    /**
     * ��ȡdeliveryAttempts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryAttempts() {
        return deliveryAttempts;
    }

    /**
     * ����deliveryAttempts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryAttempts(BigInteger value) {
        this.deliveryAttempts = value;
    }

    /**
     * ��ȡdeliverySignatureName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverySignatureName() {
        return deliverySignatureName;
    }

    /**
     * ����deliverySignatureName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverySignatureName(String value) {
        this.deliverySignatureName = value;
    }

    /**
     * Gets the value of the pieceCountVerificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceCountVerificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceCountVerificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceCountVerificationDetail }
     * 
     * 
     */
    public List<PieceCountVerificationDetail> getPieceCountVerificationDetails() {
        if (pieceCountVerificationDetails == null) {
            pieceCountVerificationDetails = new ArrayList<PieceCountVerificationDetail>();
        }
        return this.pieceCountVerificationDetails;
    }

    /**
     * ��ȡtotalUniqueAddressCountInConsolidation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUniqueAddressCountInConsolidation() {
        return totalUniqueAddressCountInConsolidation;
    }

    /**
     * ����totalUniqueAddressCountInConsolidation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUniqueAddressCountInConsolidation(BigInteger value) {
        this.totalUniqueAddressCountInConsolidation = value;
    }

    /**
     * Gets the value of the availableImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableImageType }
     * 
     * 
     */
    public List<AvailableImageType> getAvailableImages() {
        if (availableImages == null) {
            availableImages = new ArrayList<AvailableImageType>();
        }
        return this.availableImages;
    }

    /**
     * ��ȡsignature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SignatureImageDetail }
     *     
     */
    public SignatureImageDetail getSignature() {
        return signature;
    }

    /**
     * ����signature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureImageDetail }
     *     
     */
    public void setSignature(SignatureImageDetail value) {
        this.signature = value;
    }

    /**
     * Gets the value of the notificationEventsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationEventsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationEventsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailNotificationEventType }
     * 
     * 
     */
    public List<EMailNotificationEventType> getNotificationEventsAvailable() {
        if (notificationEventsAvailable == null) {
            notificationEventsAvailable = new ArrayList<EMailNotificationEventType>();
        }
        return this.notificationEventsAvailable;
    }

    /**
     * Gets the value of the splitShipmentParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitShipmentParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitShipmentParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSplitShipmentPart }
     * 
     * 
     */
    public List<TrackSplitShipmentPart> getSplitShipmentParts() {
        if (splitShipmentParts == null) {
            splitShipmentParts = new ArrayList<TrackSplitShipmentPart>();
        }
        return this.splitShipmentParts;
    }

    /**
     * Gets the value of the deliveryOptionEligibilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryOptionEligibilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryOptionEligibilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryOptionEligibilityDetail }
     * 
     * 
     */
    public List<DeliveryOptionEligibilityDetail> getDeliveryOptionEligibilityDetails() {
        if (deliveryOptionEligibilityDetails == null) {
            deliveryOptionEligibilityDetails = new ArrayList<DeliveryOptionEligibilityDetail>();
        }
        return this.deliveryOptionEligibilityDetails;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackEvent }
     * 
     * 
     */
    public List<TrackEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<TrackEvent>();
        }
        return this.events;
    }

}
