package com.absli.TestFactory.GotoEndtoEnd;

import com.absli.pageObjects.*;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import static Utils.CommonUtils.calculateAge;
import static com.absli.base.BasePage.getDriver;

public class EndToEndJointLifeJourney {
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
    MinorPersonalHealth minorpersonalhealth;
    ECCDPage eccd;
    ProposerNRIMandate nriMandate;
    InsurerNRIMandate insurerNriMandate;
    RandAPage rna;
    PaymentPage paymentpage;
    DocumentsPage documentpage;
    SpouseLifestyle spouselifestyle;
    SpouseMedicalHistory spousemedicalhistory;
    public static PropertiesUtils prop;
    SoftAssert softassert;
    HealthAndPureTermsPage healthandpuretermspage;

    //------------------------------------------------------Joint Life---------------------------------------//
    public void gotoEndToEndjointlifeJourney(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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

		// Communication Details Page //
		communicationdetails.SelectpreflangWeb(testData.get("PreferredLang"));
		communicationdetails.enteraltnumber(testData.get("AlternateNumber"));
		communicationdetails.enterresnumber(testData.get("ResidenceNumber"));
		communicationdetails.clicksubmitBtn();
		dashboard.checkLoaderWeb();
		communicationdetails.EnterSpouseMobileNoweb(testData.get("SpouseMobno"));
		communicationdetails.EnterSpouseEmailIdweb(testData.get("SpouseEmail"));
		communicationdetails.clicksubmitBtn();
		dashboard.checkLoaderWeb();


		// Bank Details Page //
		bankdetails.InputIFSCCode(testData.get("IFSCCode"));
		dashboard.checkLoaderWeb();
		// wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
		// wait.WaitTime2();
		bankdetails.EnterAccountNumberField(testData.get("AccountNo"));
		dashboard.checkLoaderWeb();

		bankdetails.ClickVerifyButtinweb();

		// bankdetails.ClickVerifyButtinweb();
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
		// bankdetails.ClickSaveButtonweb();
		dashboard.checkLoaderWeb();

		TestUtil.scrollTillEndOfPage(driver);

		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		dashboard.checkLoaderWeb();

		try {
			TestUtil.scrollTillEndOfPage(driver);

			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
			dashboard.checkLoaderWeb();

		} catch (Exception e) {
			System.out.println("Bank Summary Page is Not Display");
		}

		if (testData.get("PaymentType").equalsIgnoreCase("chequeDD")) {

			paymentpage.ClickOnChequeAndDDModeweb();
			wait.WaitTime2();
			paymentpage.ClickOnBranchdepositDropDown(testData.get("DepositChequeBranch"));
			wait.WaitTime2();

			if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Cheque")) {
				paymentpage.ClickChequeBTNweb();
				wait.WaitTime2();
				wait.WaitTime2();
				// TestUtil.scrollToElement(driver,
				// WebDriverFactoryStaticThreadLocal.getDriver().findElement(By.xpath("//div[contains(text(),'CASH')]")));
				paymentpage.UploadChequeAndDDImgweb();
				wait.WaitTime2();
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
				paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
				wait.WaitTime2();
				paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get("CDDMonth"),
						testData.get("CDDYear"));
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(driver);
				// paymentpage.VarifyINCORRECTIFSCCodeOnCDDWeb();
				wait.WaitTime2();
				paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
				TestUtil.scrollTillEndOfPage(driver);
				wait.WaitTime2();
				if (testData.get("ChequeBelongtoThirdParty").equalsIgnoreCase("YES")) {
					paymentpage.ClickonChequeBelongtoThirdParty();
					wait.WaitTime2();
					paymentpage.UploadChequeAndDDImgweb();
				}
				paymentpage.ClickCDDPaymentSubmitBTNweb();
				wait.WaitTime2();
				paymentpage.ClickonSubmitBtnAlertPopup();
				TestUtil.scrollTillEndOfPage(driver);
				wait.WaitTime2();
				customerprofile.cdnextbutton(); // customer details NEXT button(QA)
				dashboard.checkLoaderWeb();
				Thread.sleep(4000);

			} else if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Demand Draft")) {
				paymentpage.ClickDDBTNweb();
				wait.WaitTime2();
				paymentpage.UploadChequeAndDDImgweb();
				wait.WaitTime2();
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
				paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
				wait.WaitTime2();
				paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get(" CDDMonth"),
						testData.get(" CDDYear"));
				paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
				wait.WaitTime2();
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
				paymentpage.UploadDECLARATIONFORMImgweb();
				wait.WaitTime2();
				paymentpage.ClickCDDPaymentSubmitBTNweb();
				wait.WaitTime2();
				paymentpage.ClickonSubmitBtnAlertPopup();
				TestUtil.scrollTillEndOfPage(driver);
				wait.WaitTime2();
				customerprofile.cdnextbutton(); // customer details NEXT button(QA)
				dashboard.checkLoaderWeb();
				Thread.sleep(4000);
			}
		}

		if (testData.get("PaymentType").equalsIgnoreCase("RTGS")) {

			paymentpage.ClickOnRTGSModeweb();

			TestUtil.scrollTillEndOfPage(driver);
			paymentpage.clickOnRTGSCheckboxWeb();
			paymentpage.clickOnRTGSpaymentSubmitBTNWeb();
			Thread.sleep(5000);

			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
			dashboard.checkLoaderWeb();
			Thread.sleep(4000);

		}
		if (testData.get("PaymentType").equalsIgnoreCase("ONLINE")) {

//     			TestUtil.scrollTillEndOfPage(driver);
//     			paymentpage.ClickOnOTCModeweb();
			//
//     			Thread.sleep(2000);
//     			TestUtil.scrollTillEndOfPage(driver);
//     			Thread.sleep(2000);
			//
//     			paymentpage.ClickOnOTCSubmitBTNweb();
//     			Thread.sleep(5000);
			//
//     			paymentpage.ClickOnPaymentSummaryNextBTNweb();
//     			Thread.sleep(4000);
		}
		if (testData.get("PaymentType").equalsIgnoreCase("OTC")) {

			paymentpage.ClickOnOTCModeweb();

			TestUtil.scrollTillEndOfPage(driver);

			paymentpage.clickOnRTGSpaymentSubmitBTNWeb();
			Thread.sleep(5000);

			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
			dashboard.checkLoaderWeb();
			Thread.sleep(4000);
		}


		// Nominee Details Page //
		nominee.enternomineefname(testData.get("nomineeFirstName"));
		nominee.enternomineelname(testData.get("nomineeLastName"));
		nominee.fillDOBdetailsNomineeWeb(testData.get("day"), testData.get("month"), testData.get("year"));
		nominee.Clicknomineegenderweb(testData.get("nomineegender"));
		nominee.SelectRelationshipwithProposerdropdownWeb(testData.get("relationship"));
		nominee.enternomineeshare(testData.get("nomineeshare"));


		String yr = testData.get("day") + "/" + testData.get("month") + "/" + testData.get("year");
		System.out.println(yr);

		// Define the date format
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = dateFormat.parse(yr);

		// Calculate the age
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


		// Personal and Professional Info //
		proposerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("PropfatherSpouse"));
		proposerpersonalinfo.EnterMotherNameweb(testData.get("Propmothername"));
		if (testData.get("lifeStageValue").equalsIgnoreCase("Married") && testData.get("ProposerGender").equalsIgnoreCase("Female")) {
			proposerpersonalinfo.EnterMaidenNameweb(testData.get("Propmaidenname"));
		}
		proposerpersonalinfo.SelectBirthPlaceweb(testData.get("ProposerBirthPlace"));
		if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
			proposerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
		} else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
			proposerpersonalinfo.EIAwantyes();
		}
		if (testData.get("IsPropPolitical").equalsIgnoreCase("Yes")) {
			proposerpersonalinfo.IsaProppolitical(testData.get("PoliticalDetails"));
		}

		// Proposer Professional Details tab // (major different scenario)
		proposerprofdetails.SelectQualificationweb(testData.get("Propqualification"));
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Professional")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Business Owner")) {
			proposerprofdetails.EnterOccupationNameofbusinessweb(testData.get("Propnameofbusiness"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Service")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {

		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Retired")) {
			insuprofdetails.SpouseAnnualIncome(testData.get("PropSpouseAnnualIncome"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Student")) {
			insuprofdetails.ParentsAnnualIncome(testData.get("PropParentsAnnualIncome"));
			insuprofdetails.ParentsInsuCover(testData.get("PropParentsCover"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Housewife/Homemaker")) {
			insuprofdetails.SpouseAnnualIncome(testData.get("PropSpouseAnnualIncome"));
			insuprofdetails.SpouseCover(testData.get("PropSpouseCover"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Driver")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Armed Forces")) {
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Skilled Worker")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Jeweller")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Builder")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Scrap Dealer")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Doctor")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Lawyer")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Architect")) {
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("PropoccupationOption").equalsIgnoreCase("Others")) {
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
			proposerprofdetails.ClickOnAreYouRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
		}
		proposerprofdetails.ClickonAddSpouseButtonweb();


		// SPOUSE PERSONAL INFO TAB //
		insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("SpousefatherSpouse"));
		insurerpersonalinfo.EnterMotherNameweb(testData.get("Spousemothername"));
		if (testData.get("lifeStageValue").equalsIgnoreCase("Married") && testData.get("ProposerGender").equalsIgnoreCase("Female")) {
			if (testData.get("GMSJointlifegender").equalsIgnoreCase("Female") || (testData.get("ASPJointlifegender").equalsIgnoreCase("Female") || (testData.get("DGJointlifegender").equalsIgnoreCase("Female")))) {
				insurerpersonalinfo.EnterMaidenNameweb(testData.get("maidenname"));
			}
		} else {
			proposerpersonalinfo.EnterMaidenNameweb(testData.get("maidenname"));
		}
		insurerpersonalinfo.SelectBirthPlaceweb(testData.get("SpouseBirthPlace"));
		if (testData.get("IsSpousePolitical").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.IsMinorpolitical(testData.get("PoliticalDetails"));
		}
		// SPOUSE PROFESSIONAL DETAILS TAB//
		insuprofdetails.SelectSpouseQualificationweb(testData.get("Spousequalification"));
		insuprofdetails.SelectSpouseOccupationweb(testData.get("SpouseoccupationOption"));
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Professional")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Business Owner")) {
			insuprofdetails.SpouseNameofbusinessweb(testData.get("Spousenameofbusiness"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Service")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Retired")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			proposerprofdetails.insuSpouseAnnualIncome(testData.get("SpouseAnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Student")) {
			proposerprofdetails.insuParentsAnnualIncome(testData.get("ParentsAnnualIncome"));
			proposerprofdetails.insuParentsInsuCover(testData.get("ParentsCover"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Housewife/Homemaker")) {
			proposerprofdetails.insuSpouseAnnualIncome(testData.get("SpouseAnnualIncome"));
			proposerprofdetails.insuSpouseCover(testData.get("SpouseCover"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Driver")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Armed Forces")) {
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Skilled Worker")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Jeweller")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Builder")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Scrap Dealer")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Doctor")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Lawyer")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Architect")) {
			insuprofdetails.EnterSpouseOccupationNameofEmployeeweb(testData.get("SpouseNameOfEmployer"));
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("SpouseoccupationOption").equalsIgnoreCase("Others")) {
			insuprofdetails.SpouseNatureofbusinessweb(testData.get("Spousenatureofbusiness"));
			insuprofdetails.SpouseTypeofOrganisationweb(testData.get("SpouseTypeOfOrganisation"));
			insuprofdetails.EnterSpouseOccupationDesignationweb(testData.get("SpouseDesignation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
			insuprofdetails.InsurerRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
		}
		insuprofdetails.ClickonSaveContinueButtonweb();
		dashboard.checkLoaderWeb();

		// Existing Policy and Refused Policy Tab //
		if (testData.get("AddexistingPolicy").equalsIgnoreCase("Existing Policy")) {
			insurerpersonalinfo.IsAddexistingPolicy(testData.get("AddexistingPolicy"), testData.get("InsurerName"), testData.get("SumAssured"));
		}
		if (testData.get("AddrefusedPolicy").equalsIgnoreCase("Refused Policy")) {
			insurerpersonalinfo.IsAddrefusedPolicy(testData.get("AddrefusedPolicy"), testData.get("PolicyType"), testData.get("InsurerNameRef"), testData.get("SumAssuredref"), testData.get("ReasonRef"));
		}
		customerprofile.cdnextbutton(); // customer details NEXT button(QA)
		customerprofile.cdnextbutton(); // customer details NEXT button(QA)

		// Purpose Of Insurance //
		TestUtil.scrollTillTOPOfPage(getDriver());
		insurerpersonalinfo.SelectpurposeofIns(testData.get("InsurancePurpose1"), testData.get("InsurancePurpose2"));
		TestUtil.scrollTillEndOfPage(getDriver());
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Address Details page //
		if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
				&& testData.get("IsAadhaarCard").equalsIgnoreCase("NO")) {
			TestUtil.scrollTillTOPOfPage(getDriver());
			if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
				if (testData.get("AddressLocation1").equalsIgnoreCase("International")) {
					address.ClickOnAddressLocationButton(testData.get("AddressLocation1"));

					address.ClearEditPinWeb(testData.get("pinCode"));

					address.validationAddressOneWeb(testData.get("addressOne"));
					address.EnterCityAddressWeb(testData.get("CityAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					// address.EnterCountryAddressWeb(NRICountry);
					// documentpage.ClickOnPermanentAddress();

					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);

					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));

						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));
						}

					}

				} else if (testData.get("AddressLocation1").equalsIgnoreCase("Indian")) {
					address.ClearEditPinWeb(testData.get("pinCode"));
					address.validationAddressOneWeb(testData.get("addressOne"));
					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);
					// this is perment address
					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));
						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));

						}
					}

				}

				TestUtil.scrollTillEndOfPage(driver);
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();

			} else {
				address.clickAddressDropdownWeb();

				address.selectAddressWeb(testData.get("addressType"));
				address.enterPinWeb(testData.get("pinCode"));

				address.validationAddressOneWeb(testData.get("addressOne"));
				WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
				TestUtil.scrollToElement(getDriver(), ScrollEle1);
				if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
					address.ClickOnPermanentAddress();

				} else {
					address.EnterPinCodeWeb(testData.get("PinCodeTwo"));

					address.EnterPermanentAddressOneWeb(testData.get("AddressFour"));
				}

				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();

			}
		} else if (testData.get("EditAddress").equalsIgnoreCase("YES")) {
			TestUtil.scrollTillEndOfPage(getDriver());
			customerprofile.ClickOnEditButton();

			address.ClickOnEditAlerOkayPopUp();
			// dashboard.checkLoaderWeb();

			TestUtil.scrollTillTOPOfPage(getDriver());
			if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
				if (testData.get("AddressLocation1").equalsIgnoreCase("International")) {
					address.ClickOnAddressLocationButton(testData.get("AddressLocation1"));

					address.ClearEditPinWeb(testData.get("pinCode"));

					address.validationAddressOneWeb(testData.get("addressOne"));
					address.EnterCityAddressWeb(testData.get("CityAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					// address.EnterCountryAddressWeb(NRICountry);
					// documentpage.ClickOnPermanentAddress();

					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);

					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));

						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));
						}

					}

				} else if (testData.get("AddressLocation1").equalsIgnoreCase("Indian")) {
					address.ClearEditPinWeb(testData.get("pinCode"));
					address.validationAddressOneWeb(testData.get("addressOne"));
					WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
					TestUtil.scrollToElement(getDriver(), ScrollEle1);
					// this is perment address
					if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
						address.ClickOnPermanentAddress();

					} else {
						address.ClickOnAddressLocation2Button(testData.get("AddressLocation2"));
						if (testData.get("AddressLocation2").equalsIgnoreCase("International")) {

							address.enterpermanentpincode(testData.get("pinCode"));

							address.enterpermanentadd1(testData.get("addressOne"));
							address.enterpermanentcity(testData.get("CityAddress"));
							address.EnterStateAddress(testData.get("StateAddress"));
						} else if (testData.get("AddressLocation2").equalsIgnoreCase("Indian")) {
							address.enterpermanentpincode(testData.get("pinCode"));
							address.enterpermanentadd1(testData.get("addressOne"));

						}
					}

				}

			} else {
				address.enterPinWeb(testData.get("pinCode"));

				address.validationAddressOneWeb(testData.get("addressOne"));
				WebElement ScrollEle1 = getDriver().findElement(By.xpath("//input[contains(@id,'perAdd3Id')]"));
				TestUtil.scrollToElement(getDriver(), ScrollEle1);
				if (testData.get("IsPermanentAddressSame").equalsIgnoreCase("YES")) {
					address.ClickOnPermanentAddress();

				} else {
					address.EnterPinCodeWeb(testData.get("PinCodeTwo"));

					address.EnterPermanentAddressOneWeb(testData.get("AddressFour"));
				}
			}
			TestUtil.scrollTillEndOfPage(driver);
			address.ClickAddressEditSubmitWeb();
			// customerProfile.ClickOnConfirmButton();
			dashboard.checkLoaderWeb();

		} else {

			customerprofile.ClickOnConfirmButton();
			dashboard.checkLoaderWeb();

		}

		// PROPOSER HEALTH DETAILS TAB //
		insupersonalhealth.EnterHeightFeet(testData.get("HeightFeet"));
		insupersonalhealth.EnterHeightInch(testData.get("HeightInch"));
		insupersonalhealth.EnterWeight(testData.get("weight"));
		if (testData.get("Isweightgainlost").equalsIgnoreCase("Yes")) {
			insupersonalhealth.ClickOnIsThereAnyWeightChangesYESBtnWeb(testData.get("Weightgainlost"));
		}
		insupersonalhealth.ClickSaveContinuejointlifeBtn(); //SAVE & CONTINUE button QA//

		// PROPOSER Lifestyle Details Tab //
		if (testData.get("IsLifeStyleDetails").equalsIgnoreCase("Yes")) {
			if (testData.get("LifeStyleDetailsN").equalsIgnoreCase("Narcotics")) {
				insurerlifestyle.selectNarcoticsYESButton();
				insurerlifestyle.EnterReasonForNarcotics(testData.get("ProvideDetails"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Alcohol Consumption']")));
			if (testData.get("LifeStyleDetailsA").equalsIgnoreCase("Alcohol Consumption")) {
				insurerlifestyle.selectAlcohalConsumptionYESButton();
				insurerlifestyle.EnterReasonForalcohol(testData.get("ProvideDetails"));
				insurerlifestyle.TypeofAlcoholConsume(testData.get("TypeOfAlcohal"), testData.get("Quantity"), testData.get("Frequency"));
			}
			if (testData.get("AlcoholAdvise").equalsIgnoreCase("Yes")) {
				insurerlifestyle.selectAdvicealcoholYESButton(testData.get("Hospital"), testData.get("Reason"), testData.get("VisitDate"), testData.get("VisitMonth"), testData.get("VisitYear"));
			}
			if (testData.get("AlcoholAddicts").equalsIgnoreCase("Yes")) {
				insurerlifestyle.selectAlcohalAddictsYESButton();
			}
			if (testData.get("AlcoholAddinfo").equalsIgnoreCase("Yes")) {
				insurerlifestyle.selectAlcohalAddinfoYESButton(testData.get("Addinfo"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Tobacco / Nicotine ']")));
			if (testData.get("LifeStyleDetailsTN").equalsIgnoreCase("Tobacco/Nicotine")) {
				insurerlifestyle.selectTobacconicotinYESButton();
				insurerlifestyle.Clickdurationmonthweb(testData.get("MonthDuration"));
				insurerlifestyle.TypeofTobacco(testData.get("Tobaccotype"), testData.get("quantity"), testData.get("noofyear"));
			}
			if (testData.get("Advicetostop").equalsIgnoreCase("Yes")) {
				insurerlifestyle.selectAdvisetostopYESButton(testData.get("SpecifyReason"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Hazardous Activities']")));
			if (testData.get("LifeStyleDetailsHZ").equalsIgnoreCase("Hazardous Activities")) {
				insurerlifestyle.selectHazardousActivityYESButton();
				insurerlifestyle.HazardousSelectOption1(testData.get("Hazardactivity"));
				insurerlifestyle.enteryerashazard(testData.get("MentionYears"));
				insurerlifestyle.HazardousSelectOption2(testData.get("HazardActivityBy"));
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			if (testData.get("LifeStyleDetailsTrv").equalsIgnoreCase("Travel")) {
				insurerlifestyle.selectTraveloutsideYESButton();
				insurerlifestyle.TravelDetailstwelvemonth(testData.get("Country"), testData.get("City"), testData.get("DateofDept"), testData.get("DateofArrvl"), testData.get("Visatype"));
			}
		}
		insurerlifestyle.ClickSaveContinueBtn(); //Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		// PROPOSER Medical History Tab //
		if (testData.get("IsFamilyMedical").equalsIgnoreCase("Yes")) {
			if (testData.get("IsFamilyMedicalMHBS").equalsIgnoreCase("Mellitus/High blood sugar")) {
				insurerfamilymedical.ClickOnMellitusCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalHD").equalsIgnoreCase("Hereditary disorder")) {
				insurerfamilymedical.ClickOnHereditarydisorderCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalCD").equalsIgnoreCase("Chronic disorder")) {
				insurerfamilymedical.ClickOnChronicdisorderCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalHA").equalsIgnoreCase("Heart ailment")) {
				insurerfamilymedical.ClickOnHeartailmentCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalStroke").equalsIgnoreCase("Stroke")) {
				insurerfamilymedical.ClickOnStrokeCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalHBP").equalsIgnoreCase("High blood pressure")) {
				insurerfamilymedical.ClickOnHighbloodpressureCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalCncr").equalsIgnoreCase("Cancer")) {
				insurerfamilymedical.ClickOnCancerCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalDiab").equalsIgnoreCase("Diabetes")) {
				insurerfamilymedical.ClickOnDiabetesCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalKS").equalsIgnoreCase("Kidney disease")) {
				insurerfamilymedical.ClickOnKidneydiseaseCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalPyr").equalsIgnoreCase("Paralysis")) {
				insurerfamilymedical.ClickOnParalysisCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));
			}

			// PROPOSER family medical tab // father+mother+brother+sister
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Father']")));
			if (testData.get("IsFMBSstatus").equalsIgnoreCase("Yes")) {
				insurerfamilymedical.FatherOnFamilyMedicalWeb(testData.get("FatherStatus"), testData.get("FAge"), testData.get("FHealthState"), testData.get("FDeathage"), testData.get("FDeathcause"));
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Mother']")));
				insurerfamilymedical.MotherOnFamilyMedicalWeb(testData.get("MotherStatus"), testData.get("MAge"), testData.get("MHealthState"), testData.get("MDeathage"), testData.get("MDeathcause"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Brother']")));
			if (testData.get("IsAddBrother").equalsIgnoreCase("Yes")) {
				insurerfamilymedical.BrotheraddFamilyMedicalWeb();
				insurerfamilymedical.BrotherOnFamilyMedicalWeb(testData.get("BrotherStatus"), testData.get("BAge"), testData.get("BHealthState"), testData.get("BDeathage"), testData.get("BDeathcause"));
				insurerfamilymedical.BrothersaveFamilyMedicalWeb();
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			if (testData.get("IsAddSister").equalsIgnoreCase("Yes")) {
				insurerfamilymedical.SisteraddFamilyMedicalWeb();
				insurerfamilymedical.SisterOnFamilyMedicalWeb(testData.get("SisterStatus"), testData.get("SAge"), testData.get("SHealthState"), testData.get("SDeathage"), testData.get("SDeathcause"));
				insurerfamilymedical.SisterrsaveFamilyMedicalWeb();
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			insupersonalhealth.ClickSaveContinuecapitalBtn(); //SAVE & CONTINUE button QA//
			dashboard.checkLoaderWeb();
		}

		// proposer covid 19 details //
		if (testData.get("IsCoviddetails").equalsIgnoreCase("Yes")) {
			insurercoviddetails.ClickOnhaveyoutestedCOVID19Web();
			insurercoviddetails.enterdignodateweb(testData.get("CovidDiagnosisDate"));
			insurercoviddetails.enterrecoverydateweb(testData.get("CovidRecoveryDate"));
			if (testData.get("IsTreatmentTaken").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOntreatmenttakenWeb();
			}
			if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnAsymptyesWeb();
			} else if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("No")) {
				insurercoviddetails.ClickOnAsymptnoWeb();
			}
			if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnHomequryesWeb();
			} else if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("No")) {
				insurercoviddetails.ClickOnHomequrynoWeb();
			}
			if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnHospitalyesWeb();
			} else if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("No")) {
				insurercoviddetails.ClickOnHospitalnoWeb();
			}
		}
		insurerlifestyle.ClickSaveContinueBtn(); //Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		// PROPOSER Medical History Tab //
		if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("Yes")) {
			if (testData.get("IsAbsentFromWork").equalsIgnoreCase("Absent From Work")) {
				insurermedicalhistory.ClickonAbsentfromWork();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetails(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalization(testData.get("AFWdetails"));
			} else if (testData.get("IsAbsentFromWork").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonAbsentfromWorkNO();
			}
			if (testData.get("IsHospitalization").equalsIgnoreCase("Hospitalization")) {
				insurermedicalhistory.Clickonhospitalization();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomhos(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailshos(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationhos(testData.get("AFWdetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsulthos(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosishos(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
			} else if (testData.get("IsHospitalization").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonhospitalizationNO();
			}
			if (testData.get("IsAilments").equalsIgnoreCase("Ailments")) {
				insurermedicalhistory.ClickonAilments();

				if (testData.get("Diabetes").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsDiabetes();
					insurermedicalhistory.Clickondiabetestypeweb(testData.get("DiabetesType"));
					wait.WaitTime(5);
					insurermedicalhistory.Clickondiabetessuffering();
					insurermedicalhistory.EnterdiabetesDateOfDiagnosisspouse(testData.get("DiabDay"),testData.get("DiabMonth"),testData.get("DiabYear"));
					communicationdetails.clicksubmitBtn();
					wait.WaitTime(5);
				}
				if (testData.get("HeartIssue").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsHeartIssue();
					insurermedicalhistory.Clickonheartissuetypeweb(testData.get("HeartIssueType"));
					insurermedicalhistory.EnterHeartIssueCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterHeartissueDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterHeartissueLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterHeartissueDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterHeartIssueDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("BreathingIssue").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsbreathIssue();
					insurermedicalhistory.Clickonbreathissuetypeweb(testData.get("BreathIssueType"));
					insurermedicalhistory.EnterBreathIssueCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterBreathissueDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterBreathissueLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterBreathissueDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterBreathIssueDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Ulcer").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsUlcer();
					insurermedicalhistory.Clickonulcertypeweb(testData.get("UlcerType"));
					insurermedicalhistory.EnterUlcerCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterUlcerDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterUlcerLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterUlcerDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterUlcerDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Paralysis").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsParalysis();
					insurermedicalhistory.Clickonparalysistypeweb(testData.get("ParalysisType"));
					insurermedicalhistory.EnterParalysisCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterParalysisDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterParalysisLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterParalysisDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterParalysisDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Kidney").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsKidney();
					insurermedicalhistory.Clickonkidneytypeweb(testData.get("KidneyType"));
					insurermedicalhistory.EnterKidneyCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterKidneyDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterKidneyLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterKidneyDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterKidneyDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Arthritis").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsArthritis();
					insurermedicalhistory.Clickonarthritistypeweb(testData.get("ArthritisType"));
					insurermedicalhistory.EnterArthritisCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterArtritisDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterArthritisLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterArthritisDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterArthritisDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("EyeEar").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsEyeEar();
					insurermedicalhistory.Clickoneyeeartypeweb(testData.get("EyeEarType"));
					insurermedicalhistory.EnterEyeEarCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterEyeEarDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterEyeEarLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterEyeEarDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterEyeEarDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Tumor").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsTumor();
					insurermedicalhistory.Clickontumortypeweb(testData.get("TumorType"));
					insurermedicalhistory.EnterTumorCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterTumorDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterTumorLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterTumorDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterTumorDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Others").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsOthers();
					insurermedicalhistory.Clickonothertypeweb(testData.get("OtherType"));
					insurermedicalhistory.EnterothersCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterothersDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterothersLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterothersDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterothersDetailsofHospitalization(testData.get("AFWdetails"));
				}
				else if (testData.get("IsAilments").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonAilmentsNO();
				}
			}
			if (testData.get("IsDisorder").equalsIgnoreCase("Disorder")) {
				insurermedicalhistory.ClickonDisorder();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomdsdr(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsdsdr(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdsdr(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisdsdr(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationdsdr(testData.get("AFWdetails"));
			} else if (testData.get("IsDisorder").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonDisorderNO();
			}
			if (testData.get("IsSpouseHealth").equalsIgnoreCase("Spouse Health")) {
				insurermedicalhistory.ClickonSpouseHealth();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomspouse(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsspouse(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdspouse(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisspouse(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationspouse(testData.get("AFWdetails"));
			} else if (testData.get("IsSpouseHealth").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonSpouseHealthNO();
			}
			if (testData.get("IsOtherSymptoms").equalsIgnoreCase("Other symptoms")) {
				insurermedicalhistory.Clickonothersymp();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomother(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsother(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdother(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisother(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationother(testData.get("AFWdetails"));
			} else if (testData.get("IsOtherSymptoms").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonothersympNO();
			}
			if (testData.get("ProposerSalutation").equalsIgnoreCase("Mrs.") || (testData.get("ProposerSalutation").equalsIgnoreCase("Ms."))) {
				if (testData.get("IsPregnant").equalsIgnoreCase("Are You Pregnant")) {
					insurermedicalhistory.ClickonAreyoupregnant();
					insurermedicalhistory.EnterAreyoupregnantnumberofweeks(testData.get("NoofWeeeks"));
					insurermedicalhistory.EnterAreyoupregnantCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAreyoupregnantDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAreyoupregnantDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAreyoupregnantDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EnterAreyoupregnantDetailsofHospitalization(testData.get("AFWdetails"));
				} else if (testData.get("IsPregnant").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonAreyoupregnantNo();
				}
				if (testData.get("IsGynaecological").equalsIgnoreCase("Gynaecological Problem")) {
					insurermedicalhistory.Clickongynaecological();
					insurermedicalhistory.EntergynaecologicalCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EntergynaecologicalDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EntergynaecologicalDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EntergynaecologicalDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EntergynaecologicalDetailsofHospitalization(testData.get("AFWdetails"));
				} else if (testData.get("IsGynaecological").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickongynaecologicalNo();
				}
			}
		}
		proposerprofdetails.ClickonAddSpouseButtonweb();

		// SPOUSE Personal Health Details Tab //
		minorpersonalhealth.EnterMinorHeightFeet(testData.get("MinorHeightFeet"));
		minorpersonalhealth.EnterMinorHeightInch(testData.get("MinorHeightInch"));
		minorpersonalhealth.EnterMinorWeight(testData.get("Minorweight"));
		if (testData.get("IsMinorweightgainlost").equalsIgnoreCase("Yes")) {
			minorpersonalhealth.ClickOnIsThereAnyWeightChangesMinorYESBtnWeb(testData.get("MinorWeightgainlost"));
		}
		TestUtil.scrollTillEndOfPage(getDriver());
		insupersonalhealth.ClickSaveContinuecapitalminorBtn(); //SAVE & CONTINUE button QA//minor
		dashboard.checkLoaderWeb();


		//SPOUSE Lifestyle details tab//
		if (testData.get("IsLifeStyleDetails").equalsIgnoreCase("Yes")) {
			if (testData.get("LifeStyleDetailsN").equalsIgnoreCase("Narcotics")) {
				spouselifestyle.selectNarcoticsYESButtonSpouse();
				spouselifestyle.EnterReasonForNarcotics(testData.get("ProvideDetails"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//div[text()='Alcohol Consumption'])[2]")));
			if (testData.get("LifeStyleDetailsA").equalsIgnoreCase("Alcohol Consumption")) {
				spouselifestyle.selectAlcohalConsumptionYESButton();
				insurerlifestyle.EnterReasonForalcohol(testData.get("ProvideDetails"));
				spouselifestyle.TypeofAlcoholConsume(testData.get("TypeOfAlcohal"), testData.get("Quantity"), testData.get("Frequency"));
			}
			if (testData.get("AlcoholAdvise").equalsIgnoreCase("Yes")) {
				spouselifestyle.selectAdvicealcoholYESButton(testData.get("Hospital"), testData.get("Reason"), testData.get("VisitDate"), testData.get("VisitMonth"), testData.get("VisitYear"));
			}
			if (testData.get("AlcoholAddicts").equalsIgnoreCase("Yes")) {
				spouselifestyle.selectAlcohalAddictsYESButton();
			}
			if (testData.get("AlcoholAddinfo").equalsIgnoreCase("Yes")) {
				spouselifestyle.selectAlcohalAddinfoYESButton(testData.get("Addinfo"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//div[text()='Tobacco / Nicotine '])[2]")));
			if (testData.get("LifeStyleDetailsTN").equalsIgnoreCase("Tobacco/Nicotine")) {
				spouselifestyle.selectTobacconicotinYESButton();
				spouselifestyle.Clickdurationmonthweb(testData.get("MonthDuration"));
				spouselifestyle.TypeofTobacco(testData.get("Tobaccotype"), testData.get("quantity"), testData.get("noofyear"));
			}
			if (testData.get("Advicetostop").equalsIgnoreCase("Yes")) {
				spouselifestyle.selectAdvisetostopYESButton(testData.get("SpecifyReason"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("(//div[text()='Hazardous Activities'])[2]")));
			if (testData.get("LifeStyleDetailsHZ").equalsIgnoreCase("Hazardous Activities")) {
				spouselifestyle.selectHazardousActivityYESButton();
				spouselifestyle.HazardousSelectOption1(testData.get("Hazardactivity"));
				spouselifestyle.enteryerashazard(testData.get("MentionYears"));
				spouselifestyle.HazardousSelectOption2(testData.get("HazardActivityBy"));
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			if (testData.get("LifeStyleDetailsTrv").equalsIgnoreCase("Travel")) {
				spouselifestyle.selectTraveloutsideYESButton();
				spouselifestyle.TravelDetailstwelvemonth(testData.get("Country"), testData.get("City"), testData.get("DateofDept"), testData.get("DateofArrvl"), testData.get("Visatype"));
			}
		}
		spouselifestyle.ClickSaveContinueminorBtn(); //Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		// SPOUSE family medical Tab //
		if (testData.get("IsFamilyMedical").equalsIgnoreCase("Yes")) {
			if (testData.get("IsFamilyMedicalMHBS").equalsIgnoreCase("Mellitus/High blood sugar")) {
				insurerfamilymedical.ClickOnMellitusCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalHD").equalsIgnoreCase("Hereditary disorder")) {
				insurerfamilymedical.ClickOnHereditarydisorderCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalCD").equalsIgnoreCase("Chronic disorder")) {
				insurerfamilymedical.ClickOnChronicdisorderCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalHA").equalsIgnoreCase("Heart ailment")) {
				insurerfamilymedical.ClickOnHeartailmentCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalStroke").equalsIgnoreCase("Stroke")) {
				insurerfamilymedical.ClickOnStrokeCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalHBP").equalsIgnoreCase("High blood pressure")) {
				insurerfamilymedical.ClickOnHighbloodpressureCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalCncr").equalsIgnoreCase("Cancer")) {
				insurerfamilymedical.ClickOnCancerCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalDiab").equalsIgnoreCase("Diabetes")) {
				insurerfamilymedical.ClickOnDiabetesCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalKS").equalsIgnoreCase("Kidney disease")) {
				insurerfamilymedical.ClickOnKidneydiseaseCheckboxWeb();
			}
			if (testData.get("IsFamilyMedicalPyr").equalsIgnoreCase("Paralysis")) {
				insurerfamilymedical.ClickOnParalysisCheckboxWeb();
				insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));
			}

			// SPOUSE family medical tab // father+mother+brother+sister
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Father']")));
			if (testData.get("IsFMBSstatus").equalsIgnoreCase("Yes")) {
				insurerfamilymedical.FatherOnFamilyMedicalWeb(testData.get("FatherStatus"), testData.get("FAge"), testData.get("FHealthState"), testData.get("FDeathage"), testData.get("FDeathcause"));
				TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Mother']")));
				insurerfamilymedical.MotherOnFamilyMedicalWeb(testData.get("MotherStatus"), testData.get("MAge"), testData.get("MHealthState"), testData.get("MDeathage"), testData.get("MDeathcause"));
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Brother']")));
			if (testData.get("IsAddBrother").equalsIgnoreCase("Yes")) {
				insurerfamilymedical.BrotheraddFamilyMedicalWeb();
				insurerfamilymedical.BrotherOnFamilyMedicalWeb(testData.get("BrotherStatus"), testData.get("BAge"), testData.get("BHealthState"), testData.get("BDeathage"), testData.get("BDeathcause"));
				insurerfamilymedical.BrothersaveFamilyMedicalWeb();
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			if (testData.get("IsAddSister").equalsIgnoreCase("Yes")) {
				insurerfamilymedical.SisteraddFamilyMedicalWeb();
				insurerfamilymedical.SisterOnFamilyMedicalWeb(testData.get("SisterStatus"), testData.get("SAge"), testData.get("SHealthState"), testData.get("SDeathage"), testData.get("SDeathcause"));
				insurerfamilymedical.SisterrsaveFamilyMedicalWeb();
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			insupersonalhealth.ClickSaveContinuecapitalBtn(); //SAVE & CONTINUE button QA//
			dashboard.checkLoaderWeb();
		}

		// covid 19 details//
		if (testData.get("IsCoviddetails").equalsIgnoreCase("Yes")) {
			insurercoviddetails.ClickOnhaveyoutestedCOVID19spouseWeb();
			insurercoviddetails.enterdignodateweb(testData.get("CovidDiagnosisDate"));
			insurercoviddetails.enterrecoverydateweb(testData.get("CovidRecoveryDate"));
			if (testData.get("IsTreatmentTaken").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOntreatmenttakenWeb();
			}
			if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnAsymptyesWeb();
			} else if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("No")) {
				insurercoviddetails.ClickOnAsymptnoWeb();
			}
			if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnHomequryesWeb();
			} else if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("No")) {
				insurercoviddetails.ClickOnHomequrynoWeb();
			}
			if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("Yes")) {
				insurercoviddetails.ClickOnHospitalyesWeb();
			} else if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("No")) {
				insurercoviddetails.ClickOnHospitalnoWeb();
			}
		}
		insurerlifestyle.ClickSaveContinueBtn(); //Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		//SPOUSE MEDICAL HISTORY TAB//
		insurermedicalhistory.Clickononotoall();
		if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("Yes")) {
			if (testData.get("IsAbsentFromWork").equalsIgnoreCase("Absent From Work")) {
				spousemedicalhistory.ClickonAbsentfromWorkSpouse();
				spousemedicalhistory.EnterAbsentfromWorkCurrentSymptomsSpouse(testData.get("AFWcurrentsymptoms"));
				spousemedicalhistory.EnterAbsentfromWorkDoctorDetailsSpouse(testData.get("AFWdoctordetails"));
				spousemedicalhistory.EnterAbsentfromWorkDateOfLastConsultSpouse(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				spousemedicalhistory.EnterAbsentfromWorkDateOfDiagnosisSpouse(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				spousemedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationSpouse(testData.get("AFWdetails"));
			} else if (testData.get("IsAbsentFromWork").equalsIgnoreCase("No")) {
				spousemedicalhistory.ClickonAbsentfromWorkNOSpouse();
			}
			if (testData.get("IsHospitalization").equalsIgnoreCase("Hospitalization")) {
				insurermedicalhistory.Clickonhospitalization();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomhos(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailshos(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationhos(testData.get("AFWdetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsulthos(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosishos(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
			} else if (testData.get("IsHospitalization").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonhospitalizationNO();
			}
			if (testData.get("IsAilments").equalsIgnoreCase("Ailments")) {
				insurermedicalhistory.ClickonAilments();

				if (testData.get("Diabetes").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsDiabetes();
					insurermedicalhistory.Clickondiabetestypeweb(testData.get("DiabetesType"));
					wait.WaitTime(5);
					insurermedicalhistory.Clickondiabetessuffering();
					insurermedicalhistory.EnterdiabetesDateOfDiagnosis(testData.get("DiabDay"),testData.get("DiabMonth"),testData.get("DiabYear"));
					communicationdetails.clicksubmitBtn();
					wait.WaitTime(5);
				}
				if (testData.get("HeartIssue").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsHeartIssue();
					insurermedicalhistory.Clickonheartissuetypeweb(testData.get("HeartIssueType"));
					insurermedicalhistory.EnterHeartIssueCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterHeartissueDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterHeartissueLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterHeartissueDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterHeartIssueDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("BreathingIssue").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsbreathIssue();
					insurermedicalhistory.Clickonbreathissuetypeweb(testData.get("BreathIssueType"));
					insurermedicalhistory.EnterBreathIssueCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterBreathissueDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterBreathissueLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterBreathissueDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterBreathIssueDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Ulcer").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsUlcer();
					insurermedicalhistory.Clickonulcertypeweb(testData.get("UlcerType"));
					insurermedicalhistory.EnterUlcerCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterUlcerDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterUlcerLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterUlcerDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterUlcerDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Paralysis").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsParalysis();
					insurermedicalhistory.Clickonparalysistypeweb(testData.get("ParalysisType"));
					insurermedicalhistory.EnterParalysisCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterParalysisDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterParalysisLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterParalysisDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterParalysisDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Kidney").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsKidney();
					insurermedicalhistory.Clickonkidneytypeweb(testData.get("KidneyType"));
					insurermedicalhistory.EnterKidneyCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterKidneyDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterKidneyLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterKidneyDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterKidneyDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Arthritis").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsArthritis();
					insurermedicalhistory.Clickonarthritistypeweb(testData.get("ArthritisType"));
					insurermedicalhistory.EnterArthritisCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterArtritisDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterArthritisLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterArthritisDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterArthritisDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("EyeEar").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsEyeEar();
					insurermedicalhistory.Clickoneyeeartypeweb(testData.get("EyeEarType"));
					insurermedicalhistory.EnterEyeEarCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterEyeEarDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterEyeEarLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterEyeEarDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterEyeEarDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Tumor").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsTumor();
					insurermedicalhistory.Clickontumortypeweb(testData.get("TumorType"));
					insurermedicalhistory.EnterTumorCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterTumorDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterTumorLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterTumorDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterTumorDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Others").equalsIgnoreCase("Yes")){
					insurermedicalhistory.ClickonAilmentsOthers();
					insurermedicalhistory.Clickonothertypeweb(testData.get("OtherType"));
					insurermedicalhistory.EnterothersCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterothersDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterothersLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterothersDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterothersDetailsofHospitalization(testData.get("AFWdetails"));
				}
				else if (testData.get("IsAilments").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonAilmentsNO();
				}
			}
			if (testData.get("IsDisorder").equalsIgnoreCase("Disorder")) {
				insurermedicalhistory.ClickonDisorder();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomdsdr(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsdsdr(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdsdr(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisdsdr(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationdsdr(testData.get("AFWdetails"));
			} else if (testData.get("IsDisorder").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonDisorderNO();
			}
			if (testData.get("IsSpouseHealth").equalsIgnoreCase("Spouse Health")) {
				insurermedicalhistory.ClickonSpouseHealth();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomspouse(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsspouse(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdspouse(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisspouse(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationspouse(testData.get("AFWdetails"));
			} else if (testData.get("IsSpouseHealth").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonSpouseHealthNO();
			}
			if (testData.get("IsOtherSymptoms").equalsIgnoreCase("Other symptoms")) {
				insurermedicalhistory.Clickonothersymp();
				insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomother(testData.get("AFWcurrentsymptoms"));
				insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsother(testData.get("AFWdoctordetails"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdother(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
				insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisother(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
				insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationother(testData.get("AFWdetails"));
			} else if (testData.get("IsOtherSymptoms").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonothersympNO();
			}
			if (testData.get("GMSJointlifegender").equalsIgnoreCase("Female")||testData.get("ASPJointlifegender").equalsIgnoreCase("Female")||testData.get("DGJointlifegender").equalsIgnoreCase("Female")){
				if (testData.get("IsPregnant").equalsIgnoreCase("Are You Pregnant")) {
					insurermedicalhistory.ClickonAreyoupregnant();
					insurermedicalhistory.EnterAreyoupregnantnumberofweeks(testData.get("NoofWeeeks"));
					insurermedicalhistory.EnterAreyoupregnantCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterAreyoupregnantDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterAreyoupregnantDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EnterAreyoupregnantDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EnterAreyoupregnantDetailsofHospitalization(testData.get("AFWdetails"));
				} else if (testData.get("IsPregnant").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickonAreyoupregnantNo();
				}
				if (testData.get("IsGynaecological").equalsIgnoreCase("Gynaecological Problem")) {
					insurermedicalhistory.Clickongynaecological();
					insurermedicalhistory.EntergynaecologicalCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EntergynaecologicalDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EntergynaecologicalDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
					insurermedicalhistory.EntergynaecologicalDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					insurermedicalhistory.EntergynaecologicalDetailsofHospitalization(testData.get("AFWdetails"));
				} else if (testData.get("IsGynaecological").equalsIgnoreCase("No")) {
					insurermedicalhistory.ClickongynaecologicalNo();
				}
			}
		}
		insurerlifestyle.ClickSaveContinueminorBtn(); //Save & Continue Button QA//minor

				// Proposer NRI Mandate //
				if (testData.get("propNRI").equalsIgnoreCase("YES")) {
					nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOrigin"));
					nriMandate.enterCountryOfPermanentResidence(testData.get("pResidence"));
					nriMandate.enterDateFromWhichBecamePR(testData.get("datePR"));
					nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDate"));
					nriMandate.enterPassportNumber(testData.get("passportNumber"));
					nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplication")); //Place For Signing Application

					// FNIO - PIO //
					if (testData.get("nriType").equalsIgnoreCase("FNIO") || testData.get("nriType").equalsIgnoreCase("PIO")) {
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

					//Purpose of your stay abroad//
					nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroad"));
					if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Student")) {
						nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroad"));
					} else if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Others")) {
						nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReason"));
					}
					nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYear"), testData.get("intendedDurationMonth"));

					//Residence Address while in Abroad//
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

					//Have you traveled over the last 12 months?//
					nriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12Months"));
					if (testData.get("travelledOverLast12Months").equalsIgnoreCase("Yes")) {
						nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12Months"));
						nriMandate.enterLast12MonthCity(testData.get("last12MonthCity"));
						nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDate"));
						nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDate"));
						nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaType"));

						nriMandate.clickSaveButton();
					}

					//Are you planning to travel in next 12 months?//
					if (testData.get("LifeStyleDetailsTrv").equalsIgnoreCase("Travel")) {
						System.out.println("TravelOverNext12Months is Filled in LifeStyleDetail");
					} else if (testData.get("travelledOverNext12Months").equalsIgnoreCase("Yes")) {
						nriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12Months"));
						nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12Months"));
						nriMandate.enterNext12MonthCity(testData.get("Next12MonthCity"));
						nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDate"));
						nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDate"));
						nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaType"));

						nriMandate.clickSaveButton();
					}

					//Bank Details//
					nriMandate.doYouHaveNriAccount(testData.get("haveNriAccount"));
					if (testData.get("haveNriAccount").equalsIgnoreCase("Yes")) {
						nriMandate.typeOfNriAccount(testData.get("nriAccountType"));
						nriMandate.enterNRIMicrCode(testData.get("nriMicrCode"));
					}

					//Exchange Facility availed?//
					nriMandate.clickOnExchangeFacilityButton(testData.get("exchangeFacility"));
					if (testData.get("exchangeFacility").equalsIgnoreCase("Yes")) {
						nriMandate.enterRBIPermitNumber(testData.get("rbiPermitNumber"));
						nriMandate.enterRBIPermitDetails(testData.get("rbiPermitDetail"));
						nriMandate.enterRBIOfficeName(testData.get("rbiOfficeName"));
					}

					//Payment Details//
					nriMandate.clickOnPaymentDetails(testData.get("nriPaymentDetails"));
					if (testData.get("nriPaymentDetails").equalsIgnoreCase("Others")) {
						nriMandate.enterProvideDetails(testData.get("providePaymentDetail"));
					}
					TestUtil.scrollTillEndOfPage(getDriver());

					if (testData.get("InsuNRI").equalsIgnoreCase("YES")) {
						nriMandate.clickOnAddInsuredDetails();
					} else if ((testData.get("propNRI").equalsIgnoreCase("YES"))) {
						nriMandate.clickOnContinue();
					}
					dashboard.checkLoaderWeb();

				}

				// insurer NRI Mandate //
				if (testData.get("InsuNRI").equalsIgnoreCase("YES")) {
					nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOriginInsur"));
					nriMandate.enterCountryOfPermanentResidence(testData.get("pResidenceInsur"));
					nriMandate.enterDateFromWhichBecamePR(testData.get("datePRInsur"));
					nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDateInsur"));
					nriMandate.enterPassportNumber(testData.get("passportNumberInsur"));
					nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplicationInsur"));

					//FNIO/PIO//
					if (testData.get("insurNriType").equalsIgnoreCase("FNIO") || testData.get("nriType").equalsIgnoreCase("PIO")) {
						nriMandate.durationOfStayIndiaFNIO(testData.get("durationInYrsInsur"), testData.get("durationInMonthsInsur"));
						nriMandate.selectNatureOfVisa(testData.get("natureOfVisaHeldInsur"));
						nriMandate.selectPurposeOfStayIndiaFNIO(testData.get("purposeOfStayFNIO_PIOInsur"));
						if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Student")) {
							nriMandate.enterNatureOfStayIndiaFNIO(testData.get("natureOfStayFNIO_PIOInsur"));
						} else if (testData.get("purposeOfStayFNIO_PIOInsur").equalsIgnoreCase("Others")) {
							nriMandate.enterSpecificReasonFNIO_PIO(testData.get("specificReasonFNIO_PIOInsur"));
						}
						nriMandate.selectPIO_OCICard(testData.get("selectPIO_OCICardInsur"));
					}

					//Residence Address while in India//
					if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("YES")) {
						insurerNriMandate.addressSameASPropPrimary();
					} else if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("NO")) {
						insurerNriMandate.enterIndianAddress1(testData.get("indianAddress1"));
						insurerNriMandate.enterIndianAddress2(testData.get("indianAddress2"));
						insurerNriMandate.enterIndianAddress3(testData.get("indianAddress3"));
						insurerNriMandate.enterIndianArea(testData.get("IndianAr"));
						insurerNriMandate.enterIndianCity(testData.get("indianCity"));
						insurerNriMandate.enterIndianState(testData.get("indianState"));
						insurerNriMandate.enterIndianPinCode(testData.get("indianPincode"));
					}

					//Purpose of your stay abroad//
					nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroadInsur"));
					if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Student")) {
						nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroadInsur"));
					} else if (testData.get("purposeOfStayAbroadInsur").equalsIgnoreCase("Others")) {
						nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReasonInsur"));
					}
					nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYearInsur"), testData.get("intendedDurationMonthInsur"));

					//Residence Address while in Abroad//
					nriMandate.addTypeNri(testData.get("nriAddressTypeInsur"));
					nriMandate.enterNriAddress1(testData.get("address1NriInsur"));
					nriMandate.enterNriAddress2(testData.get("address2NriInsur"));
					nriMandate.enterNriAddress3(testData.get("address3NriInsur"));
					nriMandate.enterNriArea(testData.get("areaNriInsur"));
					nriMandate.enterNriCity(testData.get("cityNriInsur"));
					nriMandate.enterNriState(testData.get("stateNriInsur"));
					nriMandate.enterNriPinCode(testData.get("pinCodeNriInsur"));
					nriMandate.enterNrimobilenumber(testData.get("mobilenumberNri"));
					nriMandate.enterNriTeleNumberResidence(testData.get("teleNumberResidenceNriInsur"));
					nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNriInsur"));

					//Have you traveled over the last 12 months? *//
					insurerNriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12MonthsInsur"));
					if (testData.get("travelledOverLast12MonthsInsur").equalsIgnoreCase("Yes")) {
						nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12MonthsInsur"));
						nriMandate.enterLast12MonthCity(testData.get("last12MonthCityInsur"));
						nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDateInsur"));
						nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDateInsur"));
						nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaTypeInsur"));

						nriMandate.clickSaveButton();
					}

					//Are you planning to travel in next 12 months? *//
					insurerNriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12MonthsInsur"));
					if (testData.get("travelledOverNext12MonthsInsur").equalsIgnoreCase("Yes")) {
						nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12MonthsInsur"));
						nriMandate.enterNext12MonthCity(testData.get("Next12MonthCityInsur"));
						nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDateInsur"));
						nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDateInsur"));
						nriMandate.selectNext12MonthsVisaType(testData.get("nextTravelled12MonthsVisaTypeInsur"));

						nriMandate.clickSaveButton();
					}
					insurerNriMandate.clickOnInsuredContinueButton();
					dashboard.checkLoaderWeb();

				}

				// Review and accept page //
				TestUtil.scrollTillEndOfPage(getDriver());
				rna.ClickOnRandACheckboxWeb();
				rna.ClickOnAgreeButtonWeb();


			}

		}


