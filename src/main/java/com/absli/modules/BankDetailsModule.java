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

public class BankDetailsModule {
	Dashboard dashboard;
	WaitUtils wait;
	LoginPage loginPage;
	SalesDetails salesdetails;
	CustomerProfile customerprofile;
	ViewQuote viewquote;
	CommunicationDetails communicationdetails;
	BankDetails bankdetails;
	
//------------------------------------------------------Same ------------------------------------------------------------------//

	public void BankDetailsmodule(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

		dashboard = new Dashboard(getDriver());
		loginPage = new LoginPage(getDriver());
		salesdetails = new SalesDetails(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		viewquote = new ViewQuote(getDriver());
		communicationdetails = new CommunicationDetails(getDriver());
		bankdetails = new BankDetails(getDriver());
	
		  
		

		// Bank Details Page //
		if(testData.get("ChannelName").equalsIgnoreCase("DBS")||testData.get("ChannelName").equalsIgnoreCase("BOM")||testData.get("ChannelName").equalsIgnoreCase("DCB")||testData.get("ChannelName").equalsIgnoreCase("AXIS")&& testData.get("bank_ifsc_code").isEmpty()) {
		bankdetails.InputIFSCCode(testData.get("IFSCCode"));
		}
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
		if(testData.get("ChannelName").equalsIgnoreCase("DBS")||testData.get("ChannelName").equalsIgnoreCase("BOM")||testData.get("ChannelName").equalsIgnoreCase("DCB")&& testData.get("bank_customer_income").isEmpty()||
		testData.get("ChannelName").equalsIgnoreCase("AXIS")&& testData.get("bank_ifsc_code").isEmpty()) {
		bankdetails.EnterAccountNumberField(testData.get("AccountNo"));//DCB
		}
		dashboard.checkLoaderWeb();
		bankdetails.ClickVerifyButtinweb();
		dashboard.checkLoaderWeb();
		int count = 0;

		while (count <= 5) {
			try {
				bankdetails.ClickOnProceedBtnweb();
				break;
			} catch (Exception e) {
				System.out.println(e);
			}
			count++;
		}
		dashboard.checkLoaderWeb();
		bankdetails.ClickPaymentMethodweb(testData.get("PaymentMethod"));
	    bankdetails.Clickdrawdateweb(testData.get("PreferredDrawDate"));
		bankdetails.Clicksourcefundweb(testData.get("SourceOfFunds"));
		TestUtil.scrollTillEndOfPage(driver);
		dashboard.checkLoaderWeb();
		TestUtil.scrollTillEndOfPage(driver);
		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		dashboard.checkLoaderWeb();
}
}
