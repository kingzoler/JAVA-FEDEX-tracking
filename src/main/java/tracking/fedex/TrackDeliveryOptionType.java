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
 * <p>TrackDeliveryOptionType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDeliveryOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPOINTMENT"/>
 *     &lt;enumeration value="DATE_CERTAIN"/>
 *     &lt;enumeration value="ELECTRONIC_SIGNATURE_RELEASE"/>
 *     &lt;enumeration value="EVENING"/>
 *     &lt;enumeration value="REDIRECT_TO_HOLD_AT_LOCATION"/>
 *     &lt;enumeration value="REROUTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackDeliveryOptionType")
@XmlEnum
public enum TrackDeliveryOptionType {

    APPOINTMENT,
    DATE_CERTAIN,
    ELECTRONIC_SIGNATURE_RELEASE,
    EVENING,
    REDIRECT_TO_HOLD_AT_LOCATION,
    REROUTE;

    public String value() {
        return name();
    }

    public static TrackDeliveryOptionType fromValue(String v) {
        return valueOf(v);
    }

}
