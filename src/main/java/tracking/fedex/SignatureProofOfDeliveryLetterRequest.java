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
 * FedEx Signature Proof Of Delivery Letter request.
 * 
 * <p>SignatureProofOfDeliveryLetterRequest complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SignatureProofOfDeliveryLetterRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/track/v10}WebAuthenticationDetail"/>
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/track/v10}ClientDetail"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/track/v10}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/track/v10}VersionId"/>
 *         &lt;element name="QualifiedTrackingNumber" type="{http://fedex.com/ws/track/v10}QualifiedTrackingNumber" minOccurs="0"/>
 *         &lt;element name="AdditionalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LetterFormat" type="{http://fedex.com/ws/track/v10}SignatureProofOfDeliveryImageType" minOccurs="0"/>
 *         &lt;element name="Consignee" type="{http://fedex.com/ws/track/v10}ContactAndAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureProofOfDeliveryLetterRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "qualifiedTrackingNumber",
    "additionalComments",
    "letterFormat",
    "consignee"
})
public class SignatureProofOfDeliveryLetterRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "QualifiedTrackingNumber")
    protected QualifiedTrackingNumber qualifiedTrackingNumber;
    @XmlElement(name = "AdditionalComments")
    protected String additionalComments;
    @XmlElement(name = "LetterFormat")
    @XmlSchemaType(name = "string")
    protected SignatureProofOfDeliveryImageType letterFormat;
    @XmlElement(name = "Consignee")
    protected ContactAndAddress consignee;

    /**
     * ��ȡwebAuthenticationDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }

    /**
     * ����webAuthenticationDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail value) {
        this.webAuthenticationDetail = value;
    }

    /**
     * ��ȡclientDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClientDetail }
     *     
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    /**
     * ����clientDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetail }
     *     
     */
    public void setClientDetail(ClientDetail value) {
        this.clientDetail = value;
    }

    /**
     * ��ȡtransactionDetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * ����transactionDetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VersionId }
     *     
     */
    public VersionId getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VersionId }
     *     
     */
    public void setVersion(VersionId value) {
        this.version = value;
    }

    /**
     * ��ȡqualifiedTrackingNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link QualifiedTrackingNumber }
     *     
     */
    public QualifiedTrackingNumber getQualifiedTrackingNumber() {
        return qualifiedTrackingNumber;
    }

    /**
     * ����qualifiedTrackingNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedTrackingNumber }
     *     
     */
    public void setQualifiedTrackingNumber(QualifiedTrackingNumber value) {
        this.qualifiedTrackingNumber = value;
    }

    /**
     * ��ȡadditionalComments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalComments() {
        return additionalComments;
    }

    /**
     * ����additionalComments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalComments(String value) {
        this.additionalComments = value;
    }

    /**
     * ��ȡletterFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SignatureProofOfDeliveryImageType }
     *     
     */
    public SignatureProofOfDeliveryImageType getLetterFormat() {
        return letterFormat;
    }

    /**
     * ����letterFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProofOfDeliveryImageType }
     *     
     */
    public void setLetterFormat(SignatureProofOfDeliveryImageType value) {
        this.letterFormat = value;
    }

    /**
     * ��ȡconsignee���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getConsignee() {
        return consignee;
    }

    /**
     * ����consignee���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setConsignee(ContactAndAddress value) {
        this.consignee = value;
    }

}
