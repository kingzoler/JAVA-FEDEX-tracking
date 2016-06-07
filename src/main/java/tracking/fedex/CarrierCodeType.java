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
 * <p>CarrierCodeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CarrierCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FDXC"/>
 *     &lt;enumeration value="FDXE"/>
 *     &lt;enumeration value="FDXG"/>
 *     &lt;enumeration value="FXCC"/>
 *     &lt;enumeration value="FXFR"/>
 *     &lt;enumeration value="FXSP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CarrierCodeType")
@XmlEnum
public enum CarrierCodeType {

    FDXC,
    FDXE,
    FDXG,
    FXCC,
    FXFR,
    FXSP;

    public String value() {
        return name();
    }

    public static CarrierCodeType fromValue(String v) {
        return valueOf(v);
    }

}
