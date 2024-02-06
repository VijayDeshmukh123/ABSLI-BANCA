package com.absli.Minor_modules;

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

public class NRIMandate_Major_Minor_Module {
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

	public void NRIMandate_Major_Minor_module(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
						|| (testData.get("IsPanAvailable").equalsIgnoreCase("NO")&& (testData.get("AddressLocation1").equalsIgnoreCase("International"))))) {
					nriMandate.EnterResidantAddressOneWhileInIndiaWeb(testData.get("address1Nri"));
					nriMandate.EnterResidantAddressCityWhileInIndiaWeb(testData.get("cityNri"));
					wait.WaitTime2();
					nriMandate.EnterResidantAddressStateWhileInIndiaWeb(testData.get("stateNri"));
					wait.WaitTime2();
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
						|| (testData.get("EditAddress").equalsIgnoreCase("NO") && (testData.get("AddressLocation1").equalsIgnoreCase("International")
						&&testData.get("AddressLocation2").equalsIgnoreCase("Indian")))) {

					
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
					wait.WaitTime2();
					nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaType"));
					wait.WaitTime2();
					nriMandate.clickSaveButton();
				}

				// Are you planning to travel in next 12 months?//
				if (testData.get("IsTravel").equalsIgnoreCase("NO")) {

					if (testData.get("travelledOverNext12Months").equalsIgnoreCase("Yes")) {
						nriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12Months"));
						wait.WaitTime2();
						nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12Months"));
						wait.WaitTime2();
						nriMandate.enterNext12MonthCity(testData.get("Next12MonthCity"));
						wait.WaitTime2();
						nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDate"));
						nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDate"));
						wait.WaitTime2();
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
				TestUtil.scrollTillEndOfPage(getDriver());

				if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
					nriMandate.clickOnAddInsuredDetails();
				} else if ((testData.get("IsNRI").equalsIgnoreCase("YES"))) {
					nriMandate.clickOnContinue();
				}
				dashboard.checkLoaderWeb();

			}

			// insurer NRI Mandate //
			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOriginInsur"));
				nriMandate.enterCountryOfPermanentResidence(testData.get("pResidenceInsur"));
				nriMandate.enterDateFromWhichBecamePR(testData.get("datePRInsur"));
				nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDateInsur"));
				nriMandate.enterPassportNumber(testData.get("passportNumberInsur"));
				wait.WaitTime2();
				nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplicationInsur"));

				// FNIO/PIO//
				if (testData.get("TypeOfNRI").equalsIgnoreCase("FNIO")
						|| testData.get("TypeOfNRI").equalsIgnoreCase("PIO")) {
					if (testData.get("DoYouStayInIndia").equalsIgnoreCase("YES")) {
						nriMandate.clickOnFNIOPIOYESButtonInsured();
						wait.WaitTime2();
						nriMandate.durationOfStayIndiaFNIO(testData.get("durationInYrsInsur"),
								testData.get("durationInMonthsInsur"));
						nriMandate.selectNatureOfVisa(testData.get("natureOfVisaHeldInsur"));
						nriMandate.selectPurposeOfStayIndiaFNIO(testData.get("purposeOfStayFNIO_PIOInsur"));
						if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Student")) {
							nriMandate.enterNatureOfStayIndiaFNIO(testData.get("natureOfStayFNIO_PIOInsur"));
						} else if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Others")) {
							nriMandate.enterSpecificReasonFNIO_PIO(testData.get("specificReasonFNIO_PIOInsur"));
						}
						nriMandate.selectPIO_OCICard(testData.get("selectPIO_OCICardInsur"));
					}
				}
				// Residence Address while in India//
				if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("YES")) {
					insurerNriMandate.addressSameASPropPrimary();
				} else if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("NO")) {
					insurerNriMandate.enterIndianAddress1(testData.get("indianAddress1"));
					insurerNriMandate.enterIndianAddress2(testData.get("indianAddress2"));
					insurerNriMandate.enterIndianAddress3(testData.get("indianAddress3"));
					insurerNriMandate.enterIndianArea(testData.get("IndianAr"));
					wait.WaitTime2();
					insurerNriMandate.enterIndianCity(testData.get("indianCity"));
					wait.WaitTime2();
					insurerNriMandate.enterIndianState(testData.get("indianState"));
					wait.WaitTime2();
					insurerNriMandate.enterIndianPinCode(testData.get("indianPincode"));
				}

				// Purpose of your stay abroad//
				nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroadInsur"));
				if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Student")) {
					nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroadInsur"));
				} else if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Others")) {
					nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReasonInsur"));
				}
				nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYearInsur"),
						testData.get("intendedDurationMonthInsur"));

				// Residence Address while in Abroad//
				nriMandate.addTypeNri(testData.get("nriAddressTypeInsur"));
				nriMandate.enterNriAddress1(testData.get("address1NriInsur"));
				nriMandate.enterNriAddress2(testData.get("address2NriInsur"));
				nriMandate.enterNriAddress3(testData.get("address3NriInsur"));
				nriMandate.enterNriArea(testData.get("areaNriInsur"));
				wait.WaitTime2();
				nriMandate.enterNriCity(testData.get("cityNriInsur"));
				wait.WaitTime2();
				nriMandate.enterNriState(testData.get("stateNriInsur"));
				wait.WaitTime2();
				nriMandate.enterNriPinCode(testData.get("pinCodeNriInsur"));
				wait.WaitTime2();
				nriMandate.enterNrimobilenumber(testData.get("mobilenumberNri"));
				nriMandate.enterNriTeleNumberResidence(testData.get("teleNumberResidenceNriInsur"));
				nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNriInsur"));

				// Have you traveled over the last 12 months? *//

				if (testData.get("travelledOverLast12MonthsInsur").equalsIgnoreCase("Yes")) {
					insurerNriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12MonthsInsur"));
					nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12MonthsInsur"));
					nriMandate.enterLast12MonthCity(testData.get("last12MonthCityInsur"));
					nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDateInsur"));
					wait.WaitTime2();
					nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDateInsur"));
					wait.WaitTime2();
					nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaTypeInsur"));

					nriMandate.clickSaveButton();
				}

				// Are you planning to travel in next 12 months? *//

				if (testData.get("travelledOverNext12MonthsInsur").equalsIgnoreCase("Yes")) {
					insurerNriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12MonthsInsur"));
					nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12MonthsInsur"));
					nriMandate.enterNext12MonthCity(testData.get("Next12MonthCityInsur"));
					nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDateInsur"));
					wait.WaitTime2();
					nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDateInsur"));
					wait.WaitTime2();
					nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaTypeInsur"));

					nriMandate.clickSaveButton();
				}

				insurerNriMandate.clickOnInsuredContinueButton();
				dashboard.checkLoaderWeb();

			}
}

}
