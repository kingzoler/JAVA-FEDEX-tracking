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
 * <p>FedExLocationType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="FedExLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEDEX_AUTHORIZED_SHIP_CENTER"/>
 *     &lt;enumeration value="FEDEX_EXPRESS_STATION"/>
 *     &lt;enumeration value="FEDEX_FACILITY"/>
 *     &lt;enumeration value="FEDEX_FREIGHT_SERVICE_CENTER"/>
 *     &lt;enumeration value="FEDEX_GROUND_TERMINAL"/>
 *     &lt;enumeration value="FEDEX_HOME_DELIVERY_STATION"/>
 *     &lt;enumeration value="FEDEX_OFFICE"/>
 *     &lt;enumeration value="FEDEX_SELF_SERVICE_LOCATION"/>
 *     &lt;enumeration value="FEDEX_SHIPSITE"/>
 *     &lt;enumeration value="FEDEX_SMART_POST_HUB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FedExLocationType")
@XmlEnum
public enum FedExLocationType {

    FEDEX_AUTHORIZED_SHIP_CENTER,
    FEDEX_EXPRESS_STATION,
    FEDEX_FACILITY,
    FEDEX_FREIGHT_SERVICE_CENTER,
    FEDEX_GROUND_TERMINAL,
    FEDEX_HOME_DELIVERY_STATION,
    FEDEX_OFFICE,
    FEDEX_SELF_SERVICE_LOCATION,
    FEDEX_SHIPSITE,
    FEDEX_SMART_POST_HUB;

    public String value() {
        return name();
    }

    public static FedExLocationType fromValue(String v) {
        return valueOf(v);
    }

}
