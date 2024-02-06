package com.absli.TestFactory.Products;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.absli.pageObjects.AddressDetalis;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CommunicationDetails;
import com.absli.pageObjects.CompanyProfessionalDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.DocumentsPage;
import com.absli.pageObjects.ECCDPage;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.InsuProfessionalDetails;
import com.absli.pageObjects.InsurabilityDeclaration;
import com.absli.pageObjects.InsurerCovidDetails;
import com.absli.pageObjects.InsurerFamilyMedical;
import com.absli.pageObjects.InsurerLifestyle;
import com.absli.pageObjects.InsurerMedicalHistory;
import com.absli.pageObjects.InsurerNRIMandate;
import com.absli.pageObjects.InsurerPersonalHealth;
import com.absli.pageObjects.InsurerPersonalInfo;
import com.absli.pageObjects.JointlifePage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.MinorCovidDetails;
import com.absli.pageObjects.MinorPersonalHealth;
import com.absli.pageObjects.MinorPersonalInfo;
import com.absli.pageObjects.Nominee;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.ProposerNRIMandate;
import com.absli.pageObjects.ProposerPersonalInfo;
import com.absli.pageObjects.ProposerProfessionalDetails;
import com.absli.pageObjects.RandAPage;
import com.absli.pageObjects.SalesDetails;
import com.absli.pageObjects.SpouseCovidDetails;
import com.absli.pageObjects.SpouseLifestyle;
import com.absli.pageObjects.SpouseMedicalHistory;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;

public class ViewQuoteFactoryAIP {

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
	CompanyProfessionalDetails companyprofdetails;
	InsurerPersonalInfo insurerpersonalinfo;
	InsuProfessionalDetails insuprofdetails;
	InsurerPersonalHealth insupersonalhealth;
	InsurerLifestyle insurerlifestyle;
	InsurerFamilyMedical insurerfamilymedical;
	InsurerCovidDetails insurercoviddetails;
	InsurerMedicalHistory insurermedicalhistory;
	ProposerPersonalInfo proposerpersonalinfo;
	ProposerProfessionalDetails proposerprofdetails;
	MinorPersonalInfo minorpersonalinfo;
	MinorPersonalHealth minorpersonalhealth;
	MinorCovidDetails minorcoviddetails;
	InsurabilityDeclaration insudecleration;
	ECCDPage eccd;
	ProposerNRIMandate nriMandate;
	InsurerNRIMandate insurerNriMandate;
	RandAPage rna;
	PaymentPage paymentpage;
	DocumentsPage documentpage;
	JointlifePage jointlife;
	SpouseLifestyle spouselifestyle;
	SpouseCovidDetails spousecovid;
	SpouseMedicalHistory spousemedicalhistory;
	public static PropertiesUtils prop;
	SoftAssert softassert;
	HealthAndPureTermsPage healthandpuretermspage;
	//------------------------------------------------------Same GMS------------------------------------------------------------------//

	public void ViewPageAIP(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

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


		// View Quote page //
		if (testData.get("IsPremiumAmountAIP").equalsIgnoreCase("YES")) {
			viewquote.EnterPremiumAmountWeb(testData.get("premiumamountAIP"));
		}
		if (testData.get("IsPPTOptionAIP").equalsIgnoreCase("YES")) {
			viewquote.SelectPPTWeb(testData.get("pptAIP"));
			//viewquote.PopupPPTWeb();
		}
		if (testData.get("IspolicytermAIP").equalsIgnoreCase("YES")) {
			viewquote.SelectPoltermWeb(testData.get("policytermAIP"));
		}
		if (testData.get("IsPaymodeAIP").equalsIgnoreCase("YES")) {
			viewquote.SelectPaymodeWeb(testData.get("paymodeAIP"));
		}
		if (testData.get("IsBenefitOptionAIP").equalsIgnoreCase("YES")) {
			viewquote.SelectbeneoptWeb(testData.get("benefitotionAIP"));
		}
		if (testData.get("IsBenefitfrequencyAIP").equalsIgnoreCase("YES")) {
			viewquote.SelectbenefreqWeb(testData.get("benefitfreqAIP"));
		}
		if (testData.get("IsBenefitPeriodAIP").equalsIgnoreCase("YES")) {
			viewquote.SelectbeneperiodWeb(testData.get("benefitperiodAIP"));
			TestUtil.scrollTillEndOfPage(getDriver());
		}

		// Add riders //
		if (testData.get("IsAddRiderAIP").equalsIgnoreCase("YES")) {
			viewquote.addriderbutton();

			if (testData.get("IswavierofpremiumAIP").equalsIgnoreCase("Waiver Of Premium")) {
				viewquote.addWOP();
			}
			if (testData.get("IsADBRiderAIP").equalsIgnoreCase("Accidental Death Benefit Plus")) {
				viewquote.addADB(testData.get("ADMamountAIP"));
			}
			if (testData.get("IsCIRiderAIP").equalsIgnoreCase("Critical Illness")) {
				viewquote.addCI(testData.get("CIamountAIP"));
				TestUtil.scrollTillEndOfPage(getDriver());
			}
			if (testData.get("IsSCRider").equalsIgnoreCase("Surgical Care")) {
				viewquote.addSC(testData.get("SCamount"));
			}
			if (testData.get("IsHSRiderAIP").equalsIgnoreCase("Hospital Care")) {
				viewquote.addHC(testData.get("HCamountAIP"));
				TestUtil.scrollTillEndOfPage(getDriver());
			}
			viewquote.addbutton();

			TestUtil.scrollTillEndOfPage(getDriver());
		}

		// Profiler Download //
		//viewquote.profilerdownload();

		// Illustration Download //
		//viewquote.illustrationdownload();


		String SumAssuredValue = getDriver().findElement(By.xpath("(//p[@id='Initial-premium-amount'])[3]")).getText();
Thread.sleep(2000);
		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		dashboard.checkLoaderWeb();


		// Plan Info Page //
		// Assertion for policy tab , all riders and ABG //
		loginPage.Applicationnumber(); // printing of application number in report //

		WebElement PayMode = getDriver().findElement(By.xpath("//div[contains(@class,'payment-cycle-text')]"));
		String PayModeValue = PayMode.getText();
		String[] PayModeValueupdate = PayModeValue.split(": ");
		softassert.assertEquals(PayModeValueupdate[1], testData.get("paymode"));

		WebElement PlanOption = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[1]"));
		String PlanOptionValue = PlanOption.getText();
		softassert.assertEquals(PlanOptionValue, testData.get("benefitotion"));

		WebElement PT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[2]"));
		String PTValue = PT.getText();
		String[] PTValueupdate = PTValue.split(" ");
		softassert.assertEquals(PTValueupdate[0], testData.get("policyterm"));

		WebElement PPT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[4]"));
		String PPTValue = PPT.getText();
		softassert.assertEquals(PPTValue, testData.get("ppt"));

		TestUtil.scrollTillEndOfPage(getDriver());
		viewquote.clickConfirmPlanBtn(); // Confirm Plan button QA
		dashboard.checkLoaderWeb();

	}
}