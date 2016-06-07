//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.05.27 ʱ�� 10:50:45 AM CST 
//


package tracking.fedex;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Commodity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Commodity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommodityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryOfManufacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HarmonizedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://fedex.com/ws/track/v10}Weight" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuantityUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalMeasures" type="{http://fedex.com/ws/track/v10}Measure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://fedex.com/ws/track/v10}Money" minOccurs="0"/>
 *         &lt;element name="CustomsValue" type="{http://fedex.com/ws/track/v10}Money" minOccurs="0"/>
 *         &lt;element name="ExciseConditions" type="{http://fedex.com/ws/track/v10}EdtExciseCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExportLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportLicenseExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CIMarksAndNumbers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NaftaDetail" type="{http://fedex.com/ws/track/v10}NaftaCommodityDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity", propOrder = {
    "commodityId",
    "name",
    "numberOfPieces",
    "description",
    "countryOfManufacture",
    "harmonizedCode",
    "weight",
    "quantity",
    "quantityUnits",
    "additionalMeasures",
    "unitPrice",
    "customsValue",
    "exciseConditions",
    "exportLicenseNumber",
    "exportLicenseExpirationDate",
    "ciMarksAndNumbers",
    "partNumber",
    "naftaDetail"
})
public class Commodity {

    @XmlElement(name = "CommodityId")
    protected String commodityId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NumberOfPieces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPieces;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CountryOfManufacture")
    protected String countryOfManufacture;
    @XmlElement(name = "HarmonizedCode")
    protected String harmonizedCode;
    @XmlElement(name = "Weight")
    protected Weight weight;
    @XmlElement(name = "Quantity")
    protected BigDecimal quantity;
    @XmlElement(name = "QuantityUnits")
    protected String quantityUnits;
    @XmlElement(name = "AdditionalMeasures")
    protected List<Measure> additionalMeasures;
    @XmlElement(name = "UnitPrice")
    protected Money unitPrice;
    @XmlElement(name = "CustomsValue")
    protected Money customsValue;
    @XmlElement(name = "ExciseConditions")
    protected List<EdtExciseCondition> exciseConditions;
    @XmlElement(name = "ExportLicenseNumber")
    protected String exportLicenseNumber;
    @XmlElement(name = "ExportLicenseExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exportLicenseExpirationDate;
    @XmlElement(name = "CIMarksAndNumbers")
    protected String ciMarksAndNumbers;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "NaftaDetail")
    protected NaftaCommodityDetail naftaDetail;

    /**
     * ��ȡcommodityId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * ����commodityId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityId(String value) {
        this.commodityId = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * ��ȡnumberOfPieces���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * ����numberOfPieces���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPieces(BigInteger value) {
        this.numberOfPieces = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡcountryOfManufacture���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    /**
     * ����countryOfManufacture���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfManufacture(String value) {
        this.countryOfManufacture = value;
    }

    /**
     * ��ȡharmonizedCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    /**
     * ����harmonizedCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedCode(String value) {
        this.harmonizedCode = value;
    }

    /**
     * ��ȡweight���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * ����weight���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setWeight(Weight value) {
        this.weight = value;
    }

    /**
     * ��ȡquantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * ����quantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
    }

    /**
     * ��ȡquantityUnits���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityUnits() {
        return quantityUnits;
    }

    /**
     * ����quantityUnits���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityUnits(String value) {
        this.quantityUnits = value;
    }

    /**
     * Gets the value of the additionalMeasures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMeasures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Measure }
     * 
     * 
     */
    public List<Measure> getAdditionalMeasures() {
        if (additionalMeasures == null) {
            additionalMeasures = new ArrayList<Measure>();
        }
        return this.additionalMeasures;
    }

    /**
     * ��ȡunitPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * ����unitPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitPrice(Money value) {
        this.unitPrice = value;
    }

    /**
     * ��ȡcustomsValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCustomsValue() {
        return customsValue;
    }

    /**
     * ����customsValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCustomsValue(Money value) {
        this.customsValue = value;
    }

    /**
     * Gets the value of the exciseConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exciseConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExciseConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdtExciseCondition }
     * 
     * 
     */
    public List<EdtExciseCondition> getExciseConditions() {
        if (exciseConditions == null) {
            exciseConditions = new ArrayList<EdtExciseCondition>();
        }
        return this.exciseConditions;
    }

    /**
     * ��ȡexportLicenseNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportLicenseNumber() {
        return exportLicenseNumber;
    }

    /**
     * ����exportLicenseNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportLicenseNumber(String value) {
        this.exportLicenseNumber = value;
    }

    /**
     * ��ȡexportLicenseExpirationDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportLicenseExpirationDate() {
        return exportLicenseExpirationDate;
    }

    /**
     * ����exportLicenseExpirationDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportLicenseExpirationDate(XMLGregorianCalendar value) {
        this.exportLicenseExpirationDate = value;
    }

    /**
     * ��ȡciMarksAndNumbers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMarksAndNumbers() {
        return ciMarksAndNumbers;
    }

    /**
     * ����ciMarksAndNumbers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMarksAndNumbers(String value) {
        this.ciMarksAndNumbers = value;
    }

    /**
     * ��ȡpartNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * ����partNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * ��ȡnaftaDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link NaftaCommodityDetail }
     *     
     */
    public NaftaCommodityDetail getNaftaDetail() {
        return naftaDetail;
    }

    /**
     * ����naftaDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link NaftaCommodityDetail }
     *     
     */
    public void setNaftaDetail(NaftaCommodityDetail value) {
        this.naftaDetail = value;
    }

}
