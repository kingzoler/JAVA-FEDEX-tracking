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
 * <p>NaftaProducerDeterminationCode�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaProducerDeterminationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_1"/>
 *     &lt;enumeration value="NO_2"/>
 *     &lt;enumeration value="NO_3"/>
 *     &lt;enumeration value="YES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaProducerDeterminationCode")
@XmlEnum
public enum NaftaProducerDeterminationCode {

    NO_1,
    NO_2,
    NO_3,
    YES;

    public String value() {
        return name();
    }

    public static NaftaProducerDeterminationCode fromValue(String v) {
        return valueOf(v);
    }

}
