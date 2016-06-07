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
 * <p>AppointmentWindowType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="AppointmentWindowType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFTERNOON"/>
 *     &lt;enumeration value="LATE_AFTERNOON"/>
 *     &lt;enumeration value="MID_DAY"/>
 *     &lt;enumeration value="MORNING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppointmentWindowType")
@XmlEnum
public enum AppointmentWindowType {

    AFTERNOON,
    LATE_AFTERNOON,
    MID_DAY,
    MORNING;

    public String value() {
        return name();
    }

    public static AppointmentWindowType fromValue(String v) {
        return valueOf(v);
    }

}
