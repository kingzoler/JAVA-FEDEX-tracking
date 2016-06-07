//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.27 ʱ�� 10:50:45 AM CST 
//


package tracking.fedex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TrackSpecialInstruction complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackSpecialInstruction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryOption" type="{http://fedex.com/ws/track/v10}TrackDeliveryOptionType" minOccurs="0"/>
 *         &lt;element name="StatusDetail" type="{http://fedex.com/ws/track/v10}SpecialInstructionStatusDetail" minOccurs="0"/>
 *         &lt;element name="OriginalEstimatedDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalRequestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestedAppointmentTime" type="{http://fedex.com/ws/track/v10}AppointmentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSpecialInstruction", propOrder = {
    "description",
    "deliveryOption",
    "statusDetail",
    "originalEstimatedDeliveryTimestamp",
    "originalRequestTime",
    "requestedAppointmentTime"
})
public class TrackSpecialInstruction {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DeliveryOption")
    @XmlSchemaType(name = "string")
    protected TrackDeliveryOptionType deliveryOption;
    @XmlElement(name = "StatusDetail")
    protected SpecialInstructionStatusDetail statusDetail;
    @XmlElement(name = "OriginalEstimatedDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalEstimatedDeliveryTimestamp;
    @XmlElement(name = "OriginalRequestTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalRequestTime;
    @XmlElement(name = "RequestedAppointmentTime")
    protected AppointmentDetail requestedAppointmentTime;

    /**
     * ��ȡdescription���Ե�ֵ��
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
     * ����description���Ե�ֵ��
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
     * ��ȡdeliveryOption���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackDeliveryOptionType }
     *     
     */
    public TrackDeliveryOptionType getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * ����deliveryOption���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackDeliveryOptionType }
     *     
     */
    public void setDeliveryOption(TrackDeliveryOptionType value) {
        this.deliveryOption = value;
    }

    /**
     * ��ȡstatusDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionStatusDetail }
     *     
     */
    public SpecialInstructionStatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * ����statusDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionStatusDetail }
     *     
     */
    public void setStatusDetail(SpecialInstructionStatusDetail value) {
        this.statusDetail = value;
    }

    /**
     * ��ȡoriginalEstimatedDeliveryTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalEstimatedDeliveryTimestamp() {
        return originalEstimatedDeliveryTimestamp;
    }

    /**
     * ����originalEstimatedDeliveryTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalEstimatedDeliveryTimestamp(XMLGregorianCalendar value) {
        this.originalEstimatedDeliveryTimestamp = value;
    }

    /**
     * ��ȡoriginalRequestTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalRequestTime() {
        return originalRequestTime;
    }

    /**
     * ����originalRequestTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalRequestTime(XMLGregorianCalendar value) {
        this.originalRequestTime = value;
    }

    /**
     * ��ȡrequestedAppointmentTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDetail }
     *     
     */
    public AppointmentDetail getRequestedAppointmentTime() {
        return requestedAppointmentTime;
    }

    /**
     * ����requestedAppointmentTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDetail }
     *     
     */
    public void setRequestedAppointmentTime(AppointmentDetail value) {
        this.requestedAppointmentTime = value;
    }

}
