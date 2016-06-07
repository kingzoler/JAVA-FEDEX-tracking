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
 * <p>TrackChargeDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackChargeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v10}TrackChargeDetailType" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{http://fedex.com/ws/track/v10}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackChargeDetail", propOrder = {
    "type",
    "chargeAmount"
})
public class TrackChargeDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected TrackChargeDetailType type;
    @XmlElement(name = "ChargeAmount")
    protected Money chargeAmount;

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackChargeDetailType }
     *     
     */
    public TrackChargeDetailType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackChargeDetailType }
     *     
     */
    public void setType(TrackChargeDetailType value) {
        this.type = value;
    }

    /**
     * ��ȡchargeAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getChargeAmount() {
        return chargeAmount;
    }

    /**
     * ����chargeAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setChargeAmount(Money value) {
        this.chargeAmount = value;
    }

}
