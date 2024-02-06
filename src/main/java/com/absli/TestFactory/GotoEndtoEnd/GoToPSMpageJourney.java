package com.absli.TestFactory.GotoEndtoEnd;

import static Utils.CommonUtils.*;
import static com.absli.base.BasePage.getDriver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.absli.TestFactory.ViewQuote.ViewQuoteTestFactory;
import com.absli.base.TestBase;
import com.absli.modules.ContactInfoModule;
import com.absli.modules.CustomerProfileModule;
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

import Utils.CommonUtils;
import Utils.SelectChannel_TestFactory;
import Utils.TestUtil;


public class GoToPSMpageJourney extends TestBase{
	Dashboard dashboard;
	WaitUtils wait;
	CustomerProfile customerprofile;

	public static PropertiesUtils prop;
	CommonUtils commonUtils;


	public void gotoPSMpage( HashMap<String, String> testData) throws Exception {

		dashboard = new Dashboard(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		commonUtils = new CommonUtils();
		dashboard.checkLoaderWeb();

		new SelectChannel_TestFactory().Select_Channel( testData);
		
		new CustomerProfileModule().CustomerProfilemodule(testData);
        new ContactInfoModule().ContactInfomodule(testData);

		//new ViewQuoteTestFactory().Select_ProductTestFactory( testData);
		new EndToEndProSameJourney().gotoEndToEndSameJourney(getDriver(), testData);


	}
}