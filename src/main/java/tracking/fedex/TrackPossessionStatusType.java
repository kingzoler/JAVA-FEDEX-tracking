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
 * <p>TrackPossessionStatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TrackPossessionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="CARRIER"/>
 *     &lt;enumeration value="CUSTOMS"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *     &lt;enumeration value="SPLIT_STATUS"/>
 *     &lt;enumeration value="TRANSFER_PARTNER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackPossessionStatusType")
@XmlEnum
public enum TrackPossessionStatusType {

    BROKER,
    CARRIER,
    CUSTOMS,
    RECIPIENT,
    SHIPPER,
    SPLIT_STATUS,
    TRANSFER_PARTNER;

    public String value() {
        return name();
    }

    public static TrackPossessionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
