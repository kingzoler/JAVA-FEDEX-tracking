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
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the version/level of a service operation expected by a caller (in each request) and performed by the callee (in each reply).
 * 
 * <p>VersionId complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VersionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionId", propOrder = {
    "serviceId",
    "major",
    "intermediate",
    "minor"
})
public class VersionId {

    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(name = "Major")
    protected int major;
    @XmlElement(name = "Intermediate")
    protected int intermediate;
    @XmlElement(name = "Minor")
    protected int minor;

    /**
     * ��ȡserviceId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * ����serviceId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * ��ȡmajor���Ե�ֵ��
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * ����major���Ե�ֵ��
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * ��ȡintermediate���Ե�ֵ��
     * 
     */
    public int getIntermediate() {
        return intermediate;
    }

    /**
     * ����intermediate���Ե�ֵ��
     * 
     */
    public void setIntermediate(int value) {
        this.intermediate = value;
    }

    /**
     * ��ȡminor���Ե�ֵ��
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * ����minor���Ե�ֵ��
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

}
