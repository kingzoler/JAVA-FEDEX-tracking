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


/**
 * <p>TrackSpecialHandling complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackSpecialHandling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v10}TrackSpecialHandlingType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/track/v10}TrackPaymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSpecialHandling", propOrder = {
    "type",
    "description",
    "paymentType"
})
public class TrackSpecialHandling {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected TrackSpecialHandlingType type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PaymentType")
    @XmlSchemaType(name = "string")
    protected TrackPaymentType paymentType;

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackSpecialHandlingType }
     *     
     */
    public TrackSpecialHandlingType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSpecialHandlingType }
     *     
     */
    public void setType(TrackSpecialHandlingType value) {
        this.type = value;
    }

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
     * ��ȡpaymentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackPaymentType }
     *     
     */
    public TrackPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * ����paymentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPaymentType }
     *     
     */
    public void setPaymentType(TrackPaymentType value) {
        this.paymentType = value;
    }

}
