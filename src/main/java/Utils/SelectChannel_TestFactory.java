package Utils;
import static com.absli.base.BasePage.getDriver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.absli.APIData.ApiData_Axis;
import com.absli.APIData.ApiData_DCB;
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

public class SelectChannel_TestFactory {
	Dashboard dashboard;
	WaitUtils wait;
	LoginPage loginPage;
	CustomerProfile customerprofile;
	ApiData_DCB apiData;
	ApiData_Axis apiData_axis;
	
	public static PropertiesUtils prop;

  // Channel Selection page //

	public void Select_Channel( HashMap<String, String> testData) throws Exception {

		dashboard = new Dashboard(getDriver());
		loginPage = new LoginPage(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		apiData=new ApiData_DCB();
		apiData_axis=new ApiData_Axis();

		switch (testData.get("ChannelName")) {

		
		case "BOM":

			loginPage.enterUserNameweb(testData.get("username"));
			loginPage.enterpasswordweb(testData.get("password"));
			loginPage.loginButtonweb();
			wait.WaitTime2();
			dashboard.waitforButtonDisappearWeb();
			dashboard.checkLoaderWeb();
			Thread.sleep(3000);
			dashboard.clickNewCustomerButton();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			customerprofile.EnterBankCustomerIDWeb(testData.get("BankCustID"));
			wait.WaitTime2();
			customerprofile.ClickOnIsProposerWithBank(testData.get("IsProposerWithTheBankForMoreThan7Months?"));
			customerprofile.ClickOncustomerProfileContinueButton();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			customerprofile.EnterleadidWeb(testData.get("LeadId"));
			customerprofile.EnterCARefBWeb(testData.get("CARefBValue"));
			customerprofile.SelectSPCodeForCA(testData.get("SPCodeOfCABOM"));
			wait.WaitTime2();
			customerprofile.SelectCAbranchCode(testData.get("CABranchCode"));
			wait.WaitTime2();
			customerprofile.ClickOncustomerProfileContinueButton();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			customerprofile.SelectAdviserStateForAdviser("Maharashtra");
			wait.WaitTime2();
			break;
		case "DBS":

				dashboard.checkLoaderWeb();
				customerprofile.EnterSPCodeweb(testData.get("SPCode"));
				dashboard.checkLoaderWeb();
				
			
			break;
		case "DCB":
		
			apiData.DCB_get_Lead(testData,testData.get("LeadId"),testData.get("proposer_pan"),testData.get("proposer_first_name"),testData.get("proposer_last_name"),testData.get("proposer_gender"),testData.get("proposer_dob"),testData.get("insured_dob"),testData.get("insured_gender"),
					testData.get("proposer_mobile_no"),testData.get("proposer_email_id"),testData.get("bank_account_no"),testData.get("bank_account_type"),testData.get("address_type"),testData.get("proposer_pin_code"),testData.get("proposer_address_1"),testData.get("proposer_address_2"),testData.get("proposer_address_3"),
					testData.get("proposer_city"),testData.get("proposer_state"),testData.get("proposer_country"),testData.get("is_proposer_same_as_insured"),testData.get("bank_customer_income"),testData.get("bank_customer_occupation"),testData.get("insured_marital_status"),testData.get("proposer_marital_status"),testData.get("nominee_name"),testData.get("insured_occupation"),
					testData.get("bank_nationality"),testData.get("insured_nationality"));
			dashboard.checkLoaderWeb();
			loginPage.enterUserNameweb(testData.get("username"));
			loginPage.enterpasswordweb(testData.get("password"));
			loginPage.loginButtonweb();
			wait.WaitTime2();
			dashboard.waitforButtonDisappearWeb();
			dashboard.checkLoaderWeb();
			Thread.sleep(3000);
			dashboard.clickNewCustomerButton();
			dashboard.checkLoaderWeb();
			
			wait.WaitTime2();
			customerprofile.EnterBankCustomerIDWeb(testData.get("LeadId"));
			wait.WaitTime2();
			customerprofile.ClickOnIsProposerWithBank(testData.get("IsProposerWithTheBankForMoreThan7Months?"));
			customerprofile.ClickOncustomerProfileContinueButton();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			customerprofile.EnterCARefAWeb("123ABC");
			customerprofile.EnterCARefBWeb("456DEF");
			wait.WaitTime2();
			customerprofile.SelectCAbranchCode("DCA245 - SHIVAMOGGA");
			customerprofile.EnterAuthorizeCodeWeb("BR4641");
			wait.WaitTime2();
			customerprofile.EnterTeleCallerCodeWeb("789HIJ");
			customerprofile.EnterVerifierCodeWeb("111KLM");
			customerprofile.ClickOncustomerProfileContinueButton();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			customerprofile.SelectAdviserStateForAdviser("Maharashtra");
			
			break;
			
		case "AXIS":
			
		String url=	apiData_axis.pushDataDynamic( testData, testData.get("LeadId"), testData.get("product_id"),testData.get("proposer_first_name"),testData.get("proposer_last_name"),testData.get("proposer_gender"),testData.get("proposer_mobile_no"),testData.get("proposer_pan"),  testData.get("proposer_address_1"),testData.get("proposer_address_2"),testData.get("proposer_address_3"),testData.get("proposer_city"),testData.get("proposer_country"),testData.get("proposer_pin_code"),  testData.get("proposer_state"),testData.get("email_id"),testData.get("bank_account_type"),testData.get("bank_ifsc_code"),testData.get("bank_account_no"),testData.get("bank_customer_occupation"),  testData.get("WithoutPan"),testData.get("nominee_name"),testData.get("address_1"),testData.get("address_2"),testData.get("address_3"),testData.get("insured_dob"),  testData.get("insured_first_name"),
					testData.get("insured_middle_name"),testData.get("insured_last_name"),testData.get("insured_gender"),testData.get("is_nri"),testData.get("type_of_nri"),testData.get("proposer_investment_goal"),testData.get("proposer_lifestage"),testData.get("proposer_risk_profile"),testData.get("proposer_dob"),testData.get("bank_customer_income"),testData.get("is_business_insurance"),
					testData.get("proposer_middle_name"),testData.get("proposer_qualification"),testData.get("relation_with_proposer")
					, testData.get("branch_code"), testData.get("sp_employee_code"), testData.get("sp_irdai_code"), testData.get("bank_branch"), testData.get("ebcc_kyc_flag"), testData.get("engaged_customer")
					, testData.get("need_for_insurance"), testData.get("opportunity_to_meet"), testData.get("premium_paying_capacity"), testData.get("source_type"), testData.get("sub_source_type"));
			
			getDriver().navigate().to(url);
			wait.WaitTime2();
			customerprofile.ClickOnIsProposerWithBank(testData.get("IsProposerWithTheBankForMoreThan7Months?"));
			customerprofile.ClickOncustomerProfileContinueButton();
			dashboard.checkLoaderWeb();
			wait.WaitTime2();
			customerprofile.ClickOncustomerProfileContinueButton();
			dashboard.checkLoaderWeb();
			customerprofile.SelectAdviserStateForAdviser("Maharashtra");
			break;
		case "IDFC":
			
			
			break;
			
			default :
				System.out.println("pls Select Channel");
				break;
			
			
			
			
			
	}
		 
	}
}
		 
	