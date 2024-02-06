package com.absli.TestFactory.GotoEndtoEnd;

import static com.absli.base.BasePage.getDriver;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
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
import Utils.SelectChannel_TestFactory;
import Utils.TestUtil;

public class GoToPMSpage_Major_Minor_Journey {
	Dashboard dashboard;
	WaitUtils wait;
	CustomerProfile customerprofile;

	CommonUtils commonUtils;


	public void gotoPSM_Major_Minor_page(WebDriver driver, HashMap<String, String> testData) throws Exception {

		dashboard = new Dashboard(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		commonUtils = new CommonUtils();

		new SelectChannel_TestFactory().Select_Channel( testData);
		dashboard.checkLoaderWeb();
	
		wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(getDriver());
		if (testData.get("ProposerInsuredSame").equalsIgnoreCase("YES")) {
			customerprofile.ClickOnIsproposerInsuredSameYESButton();
		} else {
			customerprofile.ClickOnIsproposerInsuredSameNOButton();
			customerprofile.SelectRelationWithInsured(testData.get("RelationWithInsured"));
			if (testData.get("RelationWithInsured").equalsIgnoreCase("Father")
					|| testData.get("RelationWithInsured").equalsIgnoreCase("Mother")
					|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandfather")
					|| testData.get("RelationWithInsured").equalsIgnoreCase("Grandmother")
					|| testData.get("RelationWithInsured").equalsIgnoreCase("Legal guardian")) {
				TestUtil.scrollTillEndOfPage(getDriver());
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


		// PAN Ask for Proposer //
		if (testData.get("IsPanAvailable").equalsIgnoreCase("YES")) {
			commonUtils.EnterText(getDriver(), customerprofile.enterpanNumberQAWeb(), testData.get("ProposerPanNumber"));
			wait.WaitTime2();
			customerprofile.clickOnProposerIAgreeCheckboxWeb();
			wait.WaitTime2();
			customerprofile.cpnextbutton(); // customer profile Next Button(QA)
			dashboard.checkLoaderWeb();
			wait.WaitTime2();

			try { // if proposer want's editing in details //
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
					customerprofile.ClickOnConfirmButton();
					dashboard.checkLoaderWeb();

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
					customerprofile.ClickOnConfirmButton();
					dashboard.checkLoaderWeb();
				} else {
					customerprofile.ClickOnConfirmButton();
					dashboard.checkLoaderWeb();

				}

				// Insurer Data // - NRI
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
				// Insured Data With PAN journey //
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

			} catch (Exception e) { // if wrong PAN card is get entered by proposer //
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnAadharCardButton();
					customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));
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

			// Without PAN journey //
			if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnAadharCardButton();
					customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				} else if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnEnterManualButton();
					customerprofile.enterProposerDOBWeb(testData.get("ProposerDOB"));
					customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
					customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
					customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));
					customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));
					customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
					customerprofile.cdnextbutton();
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

			}
		
		}

	}


