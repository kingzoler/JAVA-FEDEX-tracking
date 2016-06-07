//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.27 ʱ�� 10:50:45 AM CST 
//


package tracking.fedex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EMailNotificationEventType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON_DELIVERY"/>
 *     &lt;enumeration value="ON_EXCEPTION"/>
 *     &lt;enumeration value="ON_SHIPMENT"/>
 *     &lt;enumeration value="ON_TENDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationEventType")
@XmlEnum
public enum EMailNotificationEventType {

    ON_DELIVERY,
    ON_EXCEPTION,
    ON_SHIPMENT,
    ON_TENDER;

    public String value() {
        return name();
    }

    public static EMailNotificationEventType fromValue(String v) {
        return valueOf(v);
    }

}
