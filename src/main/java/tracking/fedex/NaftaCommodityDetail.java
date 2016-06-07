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
 * <p>NaftaCommodityDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="NaftaCommodityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceCriterion" type="{http://fedex.com/ws/track/v10}NaftaPreferenceCriterionCode" minOccurs="0"/>
 *         &lt;element name="ProducerDetermination" type="{http://fedex.com/ws/track/v10}NaftaProducerDeterminationCode" minOccurs="0"/>
 *         &lt;element name="ProducerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetCostMethod" type="{http://fedex.com/ws/track/v10}NaftaNetCostMethodCode" minOccurs="0"/>
 *         &lt;element name="NetCostDateRange" type="{http://fedex.com/ws/track/v10}DateRange" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaftaCommodityDetail", propOrder = {
    "preferenceCriterion",
    "producerDetermination",
    "producerId",
    "netCostMethod",
    "netCostDateRange"
})
public class NaftaCommodityDetail {

    @XmlElement(name = "PreferenceCriterion")
    @XmlSchemaType(name = "string")
    protected NaftaPreferenceCriterionCode preferenceCriterion;
    @XmlElement(name = "ProducerDetermination")
    @XmlSchemaType(name = "string")
    protected NaftaProducerDeterminationCode producerDetermination;
    @XmlElement(name = "ProducerId")
    protected String producerId;
    @XmlElement(name = "NetCostMethod")
    @XmlSchemaType(name = "string")
    protected NaftaNetCostMethodCode netCostMethod;
    @XmlElement(name = "NetCostDateRange")
    protected DateRange netCostDateRange;

    /**
     * ��ȡpreferenceCriterion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NaftaPreferenceCriterionCode }
     *     
     */
    public NaftaPreferenceCriterionCode getPreferenceCriterion() {
        return preferenceCriterion;
    }

    /**
     * ����preferenceCriterion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaPreferenceCriterionCode }
     *     
     */
    public void setPreferenceCriterion(NaftaPreferenceCriterionCode value) {
        this.preferenceCriterion = value;
    }

    /**
     * ��ȡproducerDetermination���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NaftaProducerDeterminationCode }
     *     
     */
    public NaftaProducerDeterminationCode getProducerDetermination() {
        return producerDetermination;
    }

    /**
     * ����producerDetermination���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaProducerDeterminationCode }
     *     
     */
    public void setProducerDetermination(NaftaProducerDeterminationCode value) {
        this.producerDetermination = value;
    }

    /**
     * ��ȡproducerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducerId() {
        return producerId;
    }

    /**
     * ����producerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducerId(String value) {
        this.producerId = value;
    }

    /**
     * ��ȡnetCostMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NaftaNetCostMethodCode }
     *     
     */
    public NaftaNetCostMethodCode getNetCostMethod() {
        return netCostMethod;
    }

    /**
     * ����netCostMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaNetCostMethodCode }
     *     
     */
    public void setNetCostMethod(NaftaNetCostMethodCode value) {
        this.netCostMethod = value;
    }

    /**
     * ��ȡnetCostDateRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getNetCostDateRange() {
        return netCostDateRange;
    }

    /**
     * ����netCostDateRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setNetCostDateRange(DateRange value) {
        this.netCostDateRange = value;
    }

}
