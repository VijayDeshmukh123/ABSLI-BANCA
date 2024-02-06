package com.absli.Major_Diff_modules;
import static com.absli.base.BasePage.getDriver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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

import Utils.CommonUtils;
//
import Utils.SelectChannel_TestFactory;
import Utils.TestUtil;

//import util.TestUtil;
public class CustomerProfileMajor_MinorModule {
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
	CommonUtils commonUtils;
	// ------------------------------------------------------Minor
	// ------------------------------------------------------------------//

	public void CustomerProfileMajor_Minormodule(WebDriver driver, HashMap<String, String> testData) throws Exception {

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
	commonUtils = new CommonUtils();
	healthandpuretermspage = new HealthAndPureTermsPage(getDriver());


	TestUtil.scrollTillEndOfPage(getDriver());
	if (testData.get("ProposerInsuredSame").equalsIgnoreCase("YES")) {
		customerprofile.ClickOnIsproposerInsuredSameYESButton();
	} else {
				customerprofile.ClickOnIsproposerInsuredSameNOButton();
	}
		customerprofile.SelectRelationWithInsured(testData.get("RelationWithInsured"));
		if (testData.get("RelationWithInsured").equalsIgnoreCase("Father")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Mother")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandfather")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandmother")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Legal guardian")) {
			TestUtil.scrollTillEndOfPage(getDriver());
			if(testData.get("ChannelName").equalsIgnoreCase("DBS")) {
				customerprofile.ClickOnIsToBeInsuredAMinorRadioButton_DBS(testData.get("IsInsuredMinor"));
			}else {
			customerprofile.ClickOnIsToBeInsuredAMinorRadioButton(testData.get("IsInsuredMinor"));
			}
		}
	
	customerprofile.cpnextbutton(); // customer profile Next Button(QA)
	dashboard.checkLoaderWeb();

	if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
		customerprofile.ClickOnYesBtnWeb();
		wait.WaitTime2();
		customerprofile.selectTypeOfNRIWeb(testData.get("TypeOfNRI"));
		wait.WaitTime2();
		customerprofile.SelectNRICountryWeb(testData.get("NRICountry"));
		wait.WaitTime2();
		customerprofile.IspropNRIgstwavier(testData.get("propNRIGSTwavier"));
	}

	if (testData.get("IsPanAvailable").equalsIgnoreCase("YES")) {

		commonUtils.EnterText(getDriver(), customerprofile.enterpanNumberQAWeb(), testData.get("ProposerPanNumber")); // QA
		wait.WaitTime2();
		customerprofile.clickOnProposerIAgreeCheckboxWeb();
		wait.WaitTime2();
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();
		wait.WaitTime2();


		try {
			customerprofile.IsElementPresent();
			TestUtil.scrollTillEndOfPage(getDriver());
			wait.WaitTime2();
			if (testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEditButton();

				customerprofile.ClickOnEditAlerPopUp();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				customerprofile.ClearEditPanNameWeb();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.ClickOnConfirmButton();// this is bug
				dashboard.checkLoaderWeb();
//				TestUtil.scrollTillEndOfPage(getDriver());
//				customerprofile.ClickOnConfirmButton();// this is bug
//				dashboard.checkLoaderWeb();

			} else if (testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEditButton();
				wait.WaitTime2();
				customerprofile.ClickOnEditAlerPopUp();
				dashboard.checkLoaderWeb();

				customerprofile.ClearEditProposerDOBWeb("10101985");
				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.ClickOnConfirmButton();// this is bug
				dashboard.checkLoaderWeb();
//				

			} else {
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();

			}

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				dashboard.ClickOnYesBtnWeb();
				dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
				dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.clickOnGenderBtnWeb(testData.get("InsuredGender"));
				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("InsuredSalutation"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		} catch (Exception e) {
			if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnAadharCardButton();
				customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));
				// customerprofile.EnterProposerOTPWeb("");
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

			} else if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEnterManualButton();
				dashboard.checkLoaderWeb();
				customerprofile.enterProposerDOBWeb(testData.get("ProposerDOB"));
				dashboard.checkLoaderWeb();
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
					dashboard.ClickOnYesBtnWeb();
					dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
					dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
				}
				if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
					customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				} else {
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				}
				if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
					customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
					wait.WaitTime2();
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				} else {
					customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
					wait.WaitTime2();
					customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
					customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
					customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					customerprofile.clickOnGenderBtnWeb(testData.get("InsuredGender"));
					customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("InsuredSalutation"));
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				}

			}
		}
	} else {
		customerprofile.ClickOnProposerCheckBox();

		if (testData.get("IsNRI").equalsIgnoreCase("NO")) {
			customerprofile.ClickOnAlerPopUp();
		}

	customerprofile.clickOnProposerIAgreeCheckboxWeb();
		customerprofile.cpnextbutton();
		dashboard.checkLoaderWeb();

		  if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
			customerprofile.ClickOnEnterManualButton();

			customerprofile.enterProposerDOBWeb(testData.get("ProposerDOB"));

			customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
			customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
			customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));

			customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));

			customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
			customerprofile.cdnextbutton();
			dashboard.checkLoaderWeb();

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				dashboard.ClickOnYesBtnWeb();
				dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
				dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.clickOnGenderBtnWeb(testData.get("InsuredGender"));
				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("InsuredSalutation"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		}

	}
	
}
	
	
	
	
	
	
	
	//===================================================================DCB=========================
	
	
	
	
	
	

	public void CustomerProfileMajor_Minormodule_DCB(WebDriver driver, HashMap<String, String> testData) throws Exception {

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
	commonUtils = new CommonUtils();
	healthandpuretermspage = new HealthAndPureTermsPage(getDriver());


	TestUtil.scrollTillEndOfPage(getDriver());
	
		customerprofile.SelectRelationWithInsured(testData.get("RelationWithInsured"));
		if (testData.get("RelationWithInsured").equalsIgnoreCase("Father")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Mother")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandfather")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandmother")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Legal guardian")) {
			TestUtil.scrollTillEndOfPage(getDriver());
			if(testData.get("ChannelName").equalsIgnoreCase("DBS")) {
				customerprofile.ClickOnIsToBeInsuredAMinorRadioButton_DBS(testData.get("IsInsuredMinor"));
			}else {
			customerprofile.ClickOnIsToBeInsuredAMinorRadioButton(testData.get("IsInsuredMinor"));
			}
		}
	
	customerprofile.cpnextbutton(); // customer profile Next Button(QA)
	dashboard.checkLoaderWeb();

	if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
		customerprofile.ClickOnYesBtnWeb();
		wait.WaitTime2();
		customerprofile.selectTypeOfNRIWeb(testData.get("TypeOfNRI"));
		wait.WaitTime2();
		customerprofile.SelectNRICountryWeb(testData.get("NRICountry"));
		wait.WaitTime2();
		
		customerprofile.IspropNRIgstwavier(testData.get("propNRIGSTwavier"));
	}

	if (testData.get("IsPanAvailable").equalsIgnoreCase("YES")) {

		customerprofile.clickOnProposerIAgreeCheckboxWeb();
		wait.WaitTime2();
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();
		wait.WaitTime2();

		customerprofile.ClickOnEnterManualButton();
		customerprofile.cdnextbutton();
		dashboard.checkLoaderWeb();
		try {
			customerprofile.IsElementPresent();
			TestUtil.scrollTillEndOfPage(getDriver());
			wait.WaitTime2();
			if (testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEditButton();

				customerprofile.ClickOnEditAlerPopUp();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				customerprofile.ClearEditPanNameWeb();
				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				

			}  else {

				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();



			}

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				dashboard.ClickOnYesBtnWeb();
				dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
				dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				//customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				wait.WaitTime2();
				customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				if(testData.get("insured_gender").equalsIgnoreCase("Male")) {
				customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				}else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		} catch (Exception e) {
			if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnAadharCardButton();
				customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));
				// customerprofile.EnterProposerOTPWeb("");
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

			} else if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEnterManualButton();
				dashboard.checkLoaderWeb();

				if (testData.get("proposer_gender").equalsIgnoreCase("Male")) {
					customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				} else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

//				TestUtil.scrollTillEndOfPage(getDriver());
//				customerprofile.cdnextbutton();
//				dashboard.checkLoaderWeb();
				if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
					dashboard.ClickOnYesBtnWeb();
					dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
					dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
				}
				if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
					customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				} else {
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				}
				if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
					//customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));this is not editable filed
					wait.WaitTime2();
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				} else {
					wait.WaitTime2();
					customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
					customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
					customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					if(testData.get("insured_gender").equalsIgnoreCase("Male")) {
					customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
					}else {
						customerprofile.ChangeSalutionTitleInsuredDCB();
					}
					customerprofile.cpnextbutton();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				}

			}
		}
	} else {
	

	   customerprofile.clickOnProposerIAgreeCheckboxWeb();
		customerprofile.cpnextbutton();
		dashboard.checkLoaderWeb();

		 if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEnterManualButton();
			
				dashboard.checkLoaderWeb();
				if(testData.get("proposer_first_name").isEmpty()) {
				customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
				}
				customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
				if(testData.get("proposer_last_name").isEmpty()) {
				customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));
				}
				//customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));

				if (testData.get("proposer_gender").equalsIgnoreCase("Male")) {
					customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				} else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				
			

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				dashboard.ClickOnYesBtnWeb();
				dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
				dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				//customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				wait.WaitTime2();
				customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				if(testData.get("insured_gender").equalsIgnoreCase("Male")) {
				customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				}else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		}

	}
	
}	
//=========================================AXIS================================================

	public void CustomerProfileMajor_Minormodule_AXIS(WebDriver driver, HashMap<String, String> testData) throws Exception {

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
	commonUtils = new CommonUtils();
	healthandpuretermspage = new HealthAndPureTermsPage(getDriver());


	TestUtil.scrollTillEndOfPage(getDriver());
	
		customerprofile.SelectRelationWithInsured(testData.get("RelationWithInsured"));
		if (testData.get("RelationWithInsured").equalsIgnoreCase("Father")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Mother")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandfather")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandmother")
				|| testData.get("RelationWithInsured").equalsIgnoreCase("Legal guardian")) {
			TestUtil.scrollTillEndOfPage(getDriver());
			if(testData.get("ChannelName").equalsIgnoreCase("DBS")) {
				customerprofile.ClickOnIsToBeInsuredAMinorRadioButton_DBS(testData.get("IsInsuredMinor"));
			}else {
			customerprofile.ClickOnIsToBeInsuredAMinorRadioButton(testData.get("IsInsuredMinor"));
			}
		}
	
	customerprofile.cpnextbutton(); // customer profile Next Button(QA)
	dashboard.checkLoaderWeb();

	if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
		customerprofile.ClickOnYesBtnWeb();
		wait.WaitTime2();
		customerprofile.selectTypeOfNRIWeb(testData.get("TypeOfNRI"));
		wait.WaitTime2();
		customerprofile.SelectNRICountryWeb(testData.get("NRICountry"));
		wait.WaitTime2();
		
		customerprofile.IspropNRIgstwavier(testData.get("propNRIGSTwavier"));
	}

	if (testData.get("IsPanAvailable").equalsIgnoreCase("YES")) {

		customerprofile.clickOnProposerIAgreeCheckboxWeb();
		wait.WaitTime2();
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();
		wait.WaitTime2();

		
				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				



			

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				dashboard.ClickOnYesBtnWeb();
				dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
				dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				//customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				wait.WaitTime2();
				customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				if(testData.get("insured_gender").equalsIgnoreCase("Male")) {
				customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				}else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		}
	else {
	

	   customerprofile.clickOnProposerIAgreeCheckboxWeb();
		customerprofile.cpnextbutton();
		dashboard.checkLoaderWeb();

		 if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEnterManualButton();
			
				dashboard.checkLoaderWeb();
				if(testData.get("proposer_first_name").isEmpty()) {
				customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
				}
				customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
				if(testData.get("proposer_last_name").isEmpty()) {
				customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));
				}
				//customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));

				if (testData.get("proposer_gender").equalsIgnoreCase("Male")) {
					customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				} else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				
			

			if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
				dashboard.ClickOnYesBtnWeb();
				dashboard.selectTypeOfNRIWeb(testData.get("TypeOfNRIInsured"));
				dashboard.SelectNRICountryWeb(testData.get("NRICountryInsured"));
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				customerprofile.enterInsuredpanNumberWeb(testData.get("InsuredPanNo"));
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (testData.get("InsuredWithPan").equalsIgnoreCase("YES")) {
				//customerprofile.enterInsuredDOBWeb(testData.get("InsuredDOB"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			} else {
				wait.WaitTime2();
				customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredName"));
				customerprofile.EnterMiddleNameInsuredweb(testData.get("InsuredMiddleName"));
				customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastName"));
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				if(testData.get("insured_gender").equalsIgnoreCase("Male")) {
				customerprofile.ChangeSalutionTitleInsured_MALE_DCB();
				}else {
					customerprofile.ChangeSalutionTitleInsuredDCB();
				}
				customerprofile.cpnextbutton();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		}

	}
	
}	
	
	
}
