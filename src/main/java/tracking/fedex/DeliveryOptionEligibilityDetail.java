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
 * Details about the eligibility for a delivery option.
 * 
 * <p>DeliveryOptionEligibilityDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DeliveryOptionEligibilityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Option" type="{http://fedex.com/ws/track/v10}DeliveryOptionType" minOccurs="0"/>
 *         &lt;element name="Eligibility" type="{http://fedex.com/ws/track/v10}EligibilityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryOptionEligibilityDetail", propOrder = {
    "option",
    "eligibility"
})
public class DeliveryOptionEligibilityDetail {

    @XmlElement(name = "Option")
    @XmlSchemaType(name = "string")
    protected DeliveryOptionType option;
    @XmlElement(name = "Eligibility")
    @XmlSchemaType(name = "string")
    protected EligibilityType eligibility;

    /**
     * ��ȡoption���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOptionType }
     *     
     */
    public DeliveryOptionType getOption() {
        return option;
    }

    /**
     * ����option���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionType }
     *     
     */
    public void setOption(DeliveryOptionType value) {
        this.option = value;
    }

    /**
     * ��ȡeligibility���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EligibilityType }
     *     
     */
    public EligibilityType getEligibility() {
        return eligibility;
    }

    /**
     * ����eligibility���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityType }
     *     
     */
    public void setEligibility(EligibilityType value) {
        this.eligibility = value;
    }

}
