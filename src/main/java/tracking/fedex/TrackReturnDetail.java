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
 * <p>TrackReturnDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TrackReturnDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementStatus" type="{http://fedex.com/ws/track/v10}TrackReturnMovementStatusType" minOccurs="0"/>
 *         &lt;element name="LabelType" type="{http://fedex.com/ws/track/v10}TrackReturnLabelType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackReturnDetail", propOrder = {
    "movementStatus",
    "labelType",
    "description",
    "authorizationName"
})
public class TrackReturnDetail {

    @XmlElement(name = "MovementStatus")
    @XmlSchemaType(name = "string")
    protected TrackReturnMovementStatusType movementStatus;
    @XmlElement(name = "LabelType")
    @XmlSchemaType(name = "string")
    protected TrackReturnLabelType labelType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AuthorizationName")
    protected String authorizationName;

    /**
     * ��ȡmovementStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackReturnMovementStatusType }
     *     
     */
    public TrackReturnMovementStatusType getMovementStatus() {
        return movementStatus;
    }

    /**
     * ����movementStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReturnMovementStatusType }
     *     
     */
    public void setMovementStatus(TrackReturnMovementStatusType value) {
        this.movementStatus = value;
    }

    /**
     * ��ȡlabelType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TrackReturnLabelType }
     *     
     */
    public TrackReturnLabelType getLabelType() {
        return labelType;
    }

    /**
     * ����labelType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReturnLabelType }
     *     
     */
    public void setLabelType(TrackReturnLabelType value) {
        this.labelType = value;
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
     * ��ȡauthorizationName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationName() {
        return authorizationName;
    }

    /**
     * ����authorizationName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationName(String value) {
        this.authorizationName = value;
    }

}
