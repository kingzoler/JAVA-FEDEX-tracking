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
 * <p>SpecialInstructionStatusDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SpecialInstructionStatusDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://fedex.com/ws/track/v10}SpecialInstructionsStatusCode" minOccurs="0"/>
 *         &lt;element name="StatusCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialInstructionStatusDetail", propOrder = {
    "status",
    "statusCreateTime"
})
public class SpecialInstructionStatusDetail {

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected SpecialInstructionsStatusCode status;
    @XmlElement(name = "StatusCreateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusCreateTime;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionsStatusCode }
     *     
     */
    public SpecialInstructionsStatusCode getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionsStatusCode }
     *     
     */
    public void setStatus(SpecialInstructionsStatusCode value) {
        this.status = value;
    }

    /**
     * ��ȡstatusCreateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusCreateTime() {
        return statusCreateTime;
    }

    /**
     * ����statusCreateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusCreateTime(XMLGregorianCalendar value) {
        this.statusCreateTime = value;
    }

}
