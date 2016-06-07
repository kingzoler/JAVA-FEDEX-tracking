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
 * Specifies the details about the appointment time window.
 * 
 * <p>AppointmentTimeDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AppointmentTimeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v10}AppointmentWindowType" minOccurs="0"/>
 *         &lt;element name="Window" type="{http://fedex.com/ws/track/v10}LocalTimeRange" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentTimeDetail", propOrder = {
    "type",
    "window",
    "description"
})
public class AppointmentTimeDetail {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AppointmentWindowType type;
    @XmlElement(name = "Window")
    protected LocalTimeRange window;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AppointmentWindowType }
     *     
     */
    public AppointmentWindowType getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentWindowType }
     *     
     */
    public void setType(AppointmentWindowType value) {
        this.type = value;
    }

    /**
     * ��ȡwindow���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocalTimeRange }
     *     
     */
    public LocalTimeRange getWindow() {
        return window;
    }

    /**
     * ����window���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTimeRange }
     *     
     */
    public void setWindow(LocalTimeRange value) {
        this.window = value;
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

}
