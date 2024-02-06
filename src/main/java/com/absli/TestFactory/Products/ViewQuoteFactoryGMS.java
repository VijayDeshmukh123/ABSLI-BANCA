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

public class ViewQuoteFactoryGMS {
	
	 Dashboard dashboard;
	    WaitUtils wait;
	    LoginPage loginPage;
	    CustomerProfile customerprofile;
	    ViewQuote viewquote;

	    public static PropertiesUtils prop;
	    SoftAssert softassert;
	    HealthAndPureTermsPage healthandpuretermspage;
	//------------------------------------------------------Same GMS------------------------------------------------------------------//

	    public void ViewPageGMS(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

			dashboard = new Dashboard(getDriver());
			loginPage = new LoginPage(getDriver());
			customerprofile = new CustomerProfile(getDriver());
			viewquote = new ViewQuote(getDriver());
			prop = new PropertiesUtils();
			softassert = new SoftAssert();
			healthandpuretermspage = new HealthAndPureTermsPage(getDriver());


				dashboard.checkLoaderWeb();
				if (testData.get("IsPremiumAmountGMS").equalsIgnoreCase("YES")) {
					viewquote.EnterPremiumAmountWeb(testData.get("premiumamountGMS"));
				}
				if (testData.get("IsOptionGMS").equalsIgnoreCase("YES")) {
					viewquote.SelectoptionGMSWeb(testData.get("OptionGMS"));
				}
				if (testData.get("IsPaymodeGMS").equalsIgnoreCase("YES")) {
					viewquote.SelectPaymodeWeb(testData.get("paymodeGMS"));
				}

				// Add riders //
				if (testData.get("IsAddRiderGMS").equalsIgnoreCase("YES")) {
					viewquote.addriderbutton();
					TestUtil.scrollTillTOPOfPage(driver);
					if (testData.get("IswavierofpremiumGMS").equalsIgnoreCase("Waiver Of Premium")) {
						viewquote.addWOP();
					}
					if (testData.get("IsADDRiderGMS").equalsIgnoreCase("Accidental Death and Disability")) {
						viewquote.addADD(testData.get("ADDMamountGMS"));
					}
					if (testData.get("IsCIRiderGMS").equalsIgnoreCase("Critical Illness")) {
						viewquote.addCI(testData.get("CIamountGMS"));
						TestUtil.scrollTillEndOfPage(getDriver());
					}
					if (testData.get("IsSCRiderGMS").equalsIgnoreCase("Surgical Care")) {
						viewquote.addSC(testData.get("SCamount"));
					}
					if (testData.get("IsHSRiderGMS").equalsIgnoreCase("Hospital Care")) {
						viewquote.addHC(testData.get("HCamountGMS"));
						TestUtil.scrollTillEndOfPage(getDriver());
					}
					if ((testData.get("IsADBRiderGMS")).equalsIgnoreCase("Accidental Death Benefit Plus")) {
						viewquote.addADB(testData.get("ADBamountGMS"));
					}
					viewquote.addbutton();
				}

				// Profiler Download //
				// viewquote.profilerdownload();

				// Illustration Download //
				// viewquote.illustrationdownload();
Thread.sleep(30000);
				TestUtil.scrollTillEndOfPage(getDriver());
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

