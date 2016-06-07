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
 * <p>TrackAdvanceNotificationDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackAdvanceNotificationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedTimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://fedex.com/ws/track/v10}TrackAdvanceNotificationStatusType" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackAdvanceNotificationDetail", propOrder = {
    "estimatedTimeOfArrival",
    "reason",
    "status",
    "statusDescription",
    "statusTime"
})
public class TrackAdvanceNotificationDetail {

    @XmlElement(name = "EstimatedTimeOfArrival")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedTimeOfArrival;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected TrackAdvanceNotificationStatusType status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "StatusTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusTime;

    /**
     * ��ȡestimatedTimeOfArrival���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    /**
     * ����estimatedTimeOfArrival���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedTimeOfArrival(XMLGregorianCalendar value) {
        this.estimatedTimeOfArrival = value;
    }

    /**
     * ��ȡreason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * ����reason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackAdvanceNotificationStatusType }
     *     
     */
    public TrackAdvanceNotificationStatusType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAdvanceNotificationStatusType }
     *     
     */
    public void setStatus(TrackAdvanceNotificationStatusType value) {
        this.status = value;
    }

    /**
     * ��ȡstatusDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * ����statusDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * ��ȡstatusTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusTime() {
        return statusTime;
    }

    /**
     * ����statusTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusTime(XMLGregorianCalendar value) {
        this.statusTime = value;
    }

}
