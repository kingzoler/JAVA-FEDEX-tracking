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
 * Used in authentication of the sender's identity.
 * 
 * <p>WebAuthenticationDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="WebAuthenticationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentCredential" type="{http://fedex.com/ws/track/v10}WebAuthenticationCredential" minOccurs="0"/>
 *         &lt;element name="UserCredential" type="{http://fedex.com/ws/track/v10}WebAuthenticationCredential"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebAuthenticationDetail", propOrder = {
    "parentCredential",
    "userCredential"
})
public class WebAuthenticationDetail {

    @XmlElement(name = "ParentCredential")
    protected WebAuthenticationCredential parentCredential;
    @XmlElement(name = "UserCredential", required = true)
    protected WebAuthenticationCredential userCredential;

    /**
     * ��ȡparentCredential���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public WebAuthenticationCredential getParentCredential() {
        return parentCredential;
    }

    /**
     * ����parentCredential���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public void setParentCredential(WebAuthenticationCredential value) {
        this.parentCredential = value;
    }

    /**
     * ��ȡuserCredential���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public WebAuthenticationCredential getUserCredential() {
        return userCredential;
    }

    /**
     * ����userCredential���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationCredential }
     *     
     */
    public void setUserCredential(WebAuthenticationCredential value) {
        this.userCredential = value;
    }

}
