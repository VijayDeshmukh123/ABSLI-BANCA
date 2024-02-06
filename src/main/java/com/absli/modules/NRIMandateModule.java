package com.absli.modules;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.absli.pageObjects.AddressDetalis;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CommunicationDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.DocumentsPage;
import com.absli.pageObjects.ECCDPage;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.IARPage;
import com.absli.pageObjects.InsuProfessionalDetails;
import com.absli.pageObjects.InsurerCovidDetails;
import com.absli.pageObjects.InsurerFamilyMedical;
import com.absli.pageObjects.InsurerLifestyle;
import com.absli.pageObjects.InsurerMedicalHistory;
import com.absli.pageObjects.InsurerNRIMandate;
import com.absli.pageObjects.InsurerPersonalHealth;
import com.absli.pageObjects.InsurerPersonalInfo;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.Nominee;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.ProposerNRIMandate;
import com.absli.pageObjects.ProposerPersonalInfo;
import com.absli.pageObjects.ProposerProfessionalDetails;
import com.absli.pageObjects.RandAPage;
import com.absli.pageObjects.SalesDetails;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;

public class NRIMandateModule {
	Dashboard dashboard;
	WaitUtils wait;
	LoginPage loginPage;
	SalesDetails salesdetails;
	CustomerProfile customerprofile;
	ViewQuote viewquote;
	CommunicationDetails communicationdetails;
	BankDetails bankdetails;
	Nominee nominee;
	AddressDetalis address;
	InsurerPersonalInfo insurerpersonalinfo;
	InsuProfessionalDetails insuprofdetails;
	InsurerPersonalHealth insupersonalhealth;
	InsurerLifestyle insurerlifestyle;
	InsurerFamilyMedical insurerfamilymedical;
	InsurerCovidDetails insurercoviddetails;
	InsurerMedicalHistory insurermedicalhistory;
	ProposerPersonalInfo proposerpersonalinfo;
	ProposerProfessionalDetails proposerprofdetails;
	ECCDPage eccd;
	ProposerNRIMandate nriMandate;
	InsurerNRIMandate insurerNriMandate;
	RandAPage rna;
	PaymentPage paymentpage;
	DocumentsPage documentpage;
	IARPage IARpage;
	public static PropertiesUtils prop;
	SoftAssert softassert;
	HealthAndPureTermsPage healthandpuretermspage;
//------------------------------------------------------Same ------------------------------------------------------------------//

	public void NRIMandatemodule(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

		dashboard = new Dashboard(getDriver());
		loginPage = new LoginPage(getDriver());
		salesdetails = new SalesDetails(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		viewquote = new ViewQuote(getDriver());
		communicationdetails = new CommunicationDetails(getDriver());
		bankdetails = new BankDetails(getDriver());
		nominee = new Nominee(getDriver());
		address = new AddressDetalis(getDriver());
		proposerpersonalinfo = new ProposerPersonalInfo(getDriver());
		proposerprofdetails = new ProposerProfessionalDetails(getDriver());
		insurerpersonalinfo = new InsurerPersonalInfo(getDriver());
		insuprofdetails = new InsuProfessionalDetails(getDriver());
		insupersonalhealth = new InsurerPersonalHealth((getDriver()));
		insurerlifestyle = new InsurerLifestyle(getDriver());
		insurerfamilymedical = new InsurerFamilyMedical((getDriver()));
		insurercoviddetails = new InsurerCovidDetails(getDriver());
		insurermedicalhistory = new InsurerMedicalHistory(getDriver());
		nriMandate = new ProposerNRIMandate(getDriver());
		insurerNriMandate = new InsurerNRIMandate(getDriver());
		insurerNriMandate = new InsurerNRIMandate(getDriver());
		rna = new RandAPage(getDriver());
		eccd = new ECCDPage(getDriver());
		paymentpage = new PaymentPage(getDriver());
		documentpage = new DocumentsPage(getDriver());
		prop = new PropertiesUtils();
		softassert = new SoftAssert();
		healthandpuretermspage = new HealthAndPureTermsPage(getDriver());
		  IARpage=new IARPage(getDriver());
		  
	
	
	
	// Proposer NRI Mandate //
	if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
		nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOrigin"));
		nriMandate.enterCountryOfPermanentResidence(testData.get("pResidence"));
		nriMandate.enterDateFromWhichBecamePR(testData.get("datePR"));
		nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDate"));
		nriMandate.enterPassportNumber(testData.get("passportNumber"));
		nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplication")); // Place For
																									// Signing
																									// Application

		// FNIO - PIO //
		if (testData.get("TypeOfNRI").equalsIgnoreCase("FNIO")
				|| testData.get("TypeOfNRI").equalsIgnoreCase("PIO")) {

			if (testData.get("DoYouStayInIndia").equalsIgnoreCase("YES")) {
				nriMandate.ClickDoYouStayInIndiaYesBtnWeb();

				nriMandate.durationOfStayIndiaFNIO(testData.get("durationInYrs"), testData.get("durationInMonths"));
				nriMandate.selectNatureOfVisa(testData.get("natureOfVisaHeld"));
				nriMandate.selectPurposeOfStayIndiaFNIO(testData.get("purposeOfStayFNIO_PIO"));
				if (testData.get("purposeOfStayFNIO_PIO").equalsIgnoreCase("Student")) {
					nriMandate.enterNatureOfStayIndiaFNIO(testData.get("natureOfStayFNIO_PIO"));
				} else if (testData.get("purposeOfStayFNIO_PIO").equalsIgnoreCase("Others")) {
					nriMandate.enterSpecificReasonFNIO_PIO(testData.get("specificReasonFNIO_PIO"));
				}
				nriMandate.selectPIO_OCICard(testData.get("selectPIO_OCICard"));
			}
		}
		if ((testData.get("IsPanAvailable").equalsIgnoreCase("YES")
				&& (testData.get("AddressLocation1").equalsIgnoreCase("International")
						&& (testData.get("EditAddress").equalsIgnoreCase("YES")))
				|| (testData.get("IsPanAvailable").equalsIgnoreCase("NO")
						&& (testData.get("AddressLocation1").equalsIgnoreCase("International"))))) {
			nriMandate.EnterResidantAddressOneWhileInIndiaWeb(testData.get("address1Nri"));
			nriMandate.EnterResidantAddressCityWhileInIndiaWeb(testData.get("cityNri"));
			nriMandate.EnterResidantAddressStateWhileInIndiaWeb(testData.get("stateNri"));
			nriMandate.EnterResidantAddressPinCodeWhileInIndiaWeb(testData.get("pinCodeNri"));
		}
		// Purpose of your stay abroad//
		nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroad"));
		if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Student")) {
			nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroad"));
		} else if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Others")) {
			nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReason"));
		}
		nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYear"),
				testData.get("intendedDurationMonth"));


		if ((testData.get("AddressLocation1").equalsIgnoreCase("Indian") && testData.get("AddressLocation2").equalsIgnoreCase("International"))
				|| (testData.get("AddressLocation1").equalsIgnoreCase("Indian") && testData.get("AddressLocation2").equalsIgnoreCase("Indian"))
				|| (testData.get("EditAddress").equalsIgnoreCase("NO") && (testData.get("AddressLocation1").equalsIgnoreCase("International")&&testData.get("AddressLocation2").equalsIgnoreCase("Indian")))) {

		// Residence Address while in Abroad//
//		if ((testData.get("IsPanAvailabel").equalsIgnoreCase("YES")||(testData.get("IsPanAvailabel").equalsIgnoreCase("YES")&& (testData.get("AddressLocation1").equalsIgnoreCase("Indian") && (testData.get("EditAddress").equalsIgnoreCase("YES"))) ||
//
//				(testData.get("IsPanAvailabel").equalsIgnoreCase("NO") && (testData.get("AddressLocation1").equalsIgnoreCase("Indian"))))) ){
			nriMandate.addTypeNri(testData.get("nriAddressType"));
			nriMandate.enterNriAddress1(testData.get("address1Nri"));
			nriMandate.enterNriAddress2(testData.get("address2Nri"));
			nriMandate.enterNriAddress3(testData.get("address3Nri"));
			nriMandate.enterNriArea(testData.get("areaNri"));
			nriMandate.enterNriCity(testData.get("cityNri"));
			nriMandate.enterNriState(testData.get("stateNri"));
			nriMandate.enterNriPinCode(testData.get("pinCodeNri"));
			nriMandate.enterNriTeleNumberResidence(testData.get("teleNumberResidenceNri"));
			nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNri"));
		}
		// Have you traveled over the last 12 months?//

		if (testData.get("travelledOverLast12Months").equalsIgnoreCase("Yes")) {
			nriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12Months"));
			nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12Months"));
			nriMandate.enterLast12MonthCity(testData.get("last12MonthCity"));
			nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDate"));
			nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDate"));
			nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaType"));

			nriMandate.clickSaveButton();
		}

		// Are you planning to travel in next 12 months?//
		if (testData.get("IsTravel").equalsIgnoreCase("NO")) {

			if (testData.get("travelledOverNext12Months").equalsIgnoreCase("Yes")) {
				nriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12Months"));
				nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12Months"));
				nriMandate.enterNext12MonthCity(testData.get("Next12MonthCity"));
				nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDate"));
				nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDate"));
				nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaType"));

				nriMandate.clickSaveButton();
			}
		}
		// Bank Details//
		nriMandate.doYouHaveNriAccount(testData.get("haveNriAccount"));
		if (testData.get("haveNriAccount").equalsIgnoreCase("Yes")) {
			nriMandate.typeOfNriAccount(testData.get("nriAccountType"));
			nriMandate.enterNRIMicrCode(testData.get("nriMicrCode"));
		}

		// Exchange Facility availed?//
		nriMandate.clickOnExchangeFacilityButton(testData.get("exchangeFacility"));
		if (testData.get("exchangeFacility").equalsIgnoreCase("Yes")) {
			nriMandate.enterRBIPermitNumber(testData.get("rbiPermitNumber"));
			nriMandate.enterRBIPermitDetails(testData.get("rbiPermitDetail"));
			nriMandate.enterRBIOfficeName(testData.get("rbiOfficeName"));
		}

		// Payment Details//
		nriMandate.clickOnPaymentDetails(testData.get("nriPaymentDetails"));
		if (testData.get("nriPaymentDetails").equalsIgnoreCase("Others")) {
			nriMandate.enterProvideDetails(testData.get("providePaymentDetail"));
		}
		TestUtil.scrollTillEndOfPage(getDriver());
		nriMandate.clickOnNext();
		dashboard.checkLoaderWeb();
	}
}

}
