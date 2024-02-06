package com.absli.modules;

import static Utils.CommonUtils.calculateAge;
import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class NomineeModule {
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

	public void Nomineemodule(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
		
	

		// Nominee Details Page //
		dashboard.checkLoaderWeb();
		Thread.sleep(2000);
		nominee.enternomineefname(testData.get("nomineeFirstName"));//vijay
		nominee.enternomineelname(testData.get("nomineeLastName"));//vijay
		nominee.fillDOBdetailsNomineeWeb(testData.get("day"), testData.get("month"), testData.get("year"));
		nominee.Clicknomineegenderweb(testData.get("nomineegender"));
		nominee.SelectRelationshipwithProposerdropdownWeb(testData.get("relationship"));
		nominee.enternomineeshare(testData.get("nomineeshare"));

		String yr = testData.get("day") + "/" + testData.get("month") + "/" + testData.get("year");
		System.out.println(yr);

		// Define the date format //
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = dateFormat.parse(yr);

		// Calculate the age //
		int age = calculateAge(birthDate);

		if (age < 18) {
			Thread.sleep(2000);
			nominee.enterAppointeeFirstNameWeb(testData.get("appointeefname"));
			nominee.enterAppointeeLastNameWeb(testData.get("appointeelname"));
			nominee.fillDOBdetailsAppointeeWeb(testData.get("apointeeday"), testData.get("apointeemonth"), testData.get("apointeeyear"));
			nominee.Clickappointeegendertwoweb(testData.get("appointeegender"));
			TestUtil.scrollTillEndOfPage(getDriver());
			wait.WaitTime(2);
			nominee.SelectRelationshipwithapointeedropdownWeb(testData.get("apointeerelationship"));

		}
		TestUtil.scrollTillEndOfPage(getDriver());
		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		dashboard.checkLoaderWeb();
}
}
