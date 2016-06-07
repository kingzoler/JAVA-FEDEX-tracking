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
 * <p>OfficeOrderDeliveryMethodType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="OfficeOrderDeliveryMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COURIER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PICKUP"/>
 *     &lt;enumeration value="SHIPMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OfficeOrderDeliveryMethodType")
@XmlEnum
public enum OfficeOrderDeliveryMethodType {

    COURIER,
    OTHER,
    PICKUP,
    SHIPMENT;

    public String value() {
        return name();
    }

    public static OfficeOrderDeliveryMethodType fromValue(String v) {
        return valueOf(v);
    }

}
