package tracking.test;


import tracking.fedex.ClientDetail;
import tracking.fedex.TrackIdentifierType;
import tracking.fedex.TrackPackageIdentifier;
import tracking.fedex.TrackReply;
import tracking.fedex.TrackRequest;
import tracking.fedex.TrackRequestProcessingOptionType;
import tracking.fedex.TrackSelectionDetail;
import tracking.fedex.TransactionDetail;
import tracking.fedex.VersionId;
import tracking.fedex.WebAuthenticationCredential;
import tracking.fedex.WebAuthenticationDetail;
import tracking.utils.XmlHttpUtil;



public class FedexTest {

	public static void main(String[] args) throws Exception {
		TrackRequest trackRequest = new TrackRequest();
		
		ClientDetail clientDetail = new ClientDetail();
		clientDetail.setAccountNumber("XXX");
		clientDetail.setMeterNumber("XXXX");
		
		trackRequest.setClientDetail(clientDetail);
		
		WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
		userCredential.setKey("XXX");
		userCredential.setPassword("XXX");
		
		WebAuthenticationDetail wbAuthenticationDetail = new WebAuthenticationDetail();
        wbAuthenticationDetail.setParentCredential(null);
        wbAuthenticationDetail.setUserCredential(userCredential);
        
        trackRequest.setWebAuthenticationDetail(wbAuthenticationDetail);
        
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - Tracking Request"); //This is a reference field for the customer.  Any value can be used and will be provided in the response.
        trackRequest.setTransactionDetail(transactionDetail);
        
        VersionId versionId = new VersionId();
        versionId.setServiceId("trck");
        versionId.setMajor(0);
        versionId.setIntermediate(0);
        versionId.setMinor(0);
        trackRequest.setVersion(versionId);
        //
        TrackSelectionDetail selectionDetail=new TrackSelectionDetail();
        TrackPackageIdentifier packageIdentifier=new TrackPackageIdentifier();
        packageIdentifier.setType(TrackIdentifierType.TRACKING_NUMBER_OR_DOORTAG);
        packageIdentifier.setValue("XXXX"); // tracking number
        selectionDetail.setPackageIdentifier(packageIdentifier);
        trackRequest.getSelectionDetails().add(selectionDetail);
        TrackRequestProcessingOptionType processingOption=TrackRequestProcessingOptionType.INCLUDE_DETAILED_SCANS;
        trackRequest.getProcessingOptions().add(processingOption);
		
        TrackReply s = XmlHttpUtil.post(trackRequest, "https://ws.fedex.com:443/xml", TrackReply.class);
		System.out.println(s.getHighestSeverity());
		System.out.println(s.getNotifications().get(0).getMessage());
	}
}
