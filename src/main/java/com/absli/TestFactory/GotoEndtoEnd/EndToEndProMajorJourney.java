package com.absli.TestFactory.GotoEndtoEnd;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

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

public class EndToEndProMajorJourney {

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
	ECCDPage eccd;
	ProposerNRIMandate nriMandate;
	InsurerNRIMandate insurerNriMandate;
	RandAPage rna;
	PaymentPage paymentpage;
	DocumentsPage documentpage;

	public static PropertiesUtils prop;
	SoftAssert softassert;
	HealthAndPureTermsPage healthandpuretermspage;
//------------------------------------------------------Same GMS------------------------------------------------------------------//

	public void gotoEndToEndMajorJourney(WebDriver driver, HashMap<String, String> testData)
			throws InterruptedException, IOException {

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
		minorpersonalinfo = new MinorPersonalInfo(getDriver());

		// Communication Details Page //
		Thread.sleep(2000);
		dashboard.checkLoaderWeb();
		communicationdetails.EnterProposerMobileNoweb(testData.get("ProposerMobileNumber"));
		communicationdetails.EnterProposerEmailIdweb(testData.get("ProposerEmailId"));
		TestUtil.scrollTillEndOfPage(getDriver());
		communicationdetails.SelectpreflangWeb(testData.get("PreferredLang"));
		communicationdetails.enteraltnumber(testData.get("AlternateNumber"));
		communicationdetails.enterresnumber(testData.get("ResidenceNumber"));
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Communication Details Insured //
		communicationdetails.EnterInsuredMobileNoweb(testData.get("InsuredMobno"));
		communicationdetails.EnterInsuredEmailIdweb(testData.get("Insuemail"));
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Custmer Photo page //
//		communicationdetails.ClickDoitLatercapitalbutton();
//		dashboard.checkLoaderWeb();
//
//		communicationdetails.ClickDoitLatercapitalbutton();
//		dashboard.checkLoaderWeb();


		// Bank Details Page //
		bankdetails.InputIFSCCode(testData.get("IFSCCode"));
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
		wait.WaitTime2();
		bankdetails.EnterAccountNumberField(testData.get("AccountNo"));
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

		try {
			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
			dashboard.checkLoaderWeb();

		} catch (Exception e) {
			System.out.println("Bank Summary Page is Not Display");
		}

		

		// Proposer-Insured Personal info tab // (Minor Scenario)
		proposerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("PropfatherSpouse"));
		proposerpersonalinfo.EnterMotherNameweb(testData.get("Propmothername"));
		proposerpersonalinfo.SelectBirthPlaceweb(testData.get("ProposerBirthPlace"));
		if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
			proposerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
		} else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
			proposerpersonalinfo.EIAwantyes();
		}
		if (testData.get("IsPropPolitical").equalsIgnoreCase("Yes")) {
			proposerpersonalinfo.IsaProppolitical(testData.get("PoliticalDetails"));
		}

		// Proposer Professional Details tab //
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
		proposerprofdetails.ClickonProposerAddInsuredButtonweb();

		// Insured Personal info tab // (major different scenario)
		try {
		insurerpersonalinfo.SelectMaritalStatusweb(testData.get("Insumarital"));
		}catch(Exception e) {
			
		}
		insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("fatherSpouse"));
		insurerpersonalinfo.EnterMotherNameweb(testData.get("mothername"));
		insurerpersonalinfo.SelectBirthPlaceweb(testData.get("InsurerBirthPlace"));
		if (testData.get("IsInsuPolitical").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.IsMinorpolitical(testData.get("PoliticalDetails"));
		}

		// Insurer Professional Details tab // (major different scenario)
		insuprofdetails.SelectQualificationweb(testData.get("qualification"));
		insuprofdetails.SelectOccupationweb(testData.get("occupationOption"));
		if (testData.get("occupationOption").equalsIgnoreCase("Professional")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Business Owner")) {
			insuprofdetails.InsurerNameofbusinessweb(testData.get("nameofbusiness"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Service")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Driver")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Armed Forces")) {
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Jeweller")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Builder")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Doctor")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Lawyer")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Architect")) {
			insuprofdetails.InsurerNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Others")) {
			insuprofdetails.InsurerNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.InsurerTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerDesignationweb(testData.get("Designation"));
			insuprofdetails.InsuredAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("IsinsurerRegisterPerson").equalsIgnoreCase("Yes")) {
			insuprofdetails.InsurerRegisterPersonaUnderGSTweb(testData.get("insurerGSTnumber"));
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

		// Purpose Of Insurance //
		TestUtil.scrollTillTOPOfPage(getDriver());
		insurerpersonalinfo.SelectpurposeofIns(testData.get("InsurancePurpose1"), testData.get("InsurancePurpose2"));
		TestUtil.scrollTillEndOfPage(getDriver());
		customerprofile.cpnextbutton(); // customer profile Next Button(QA)
		dashboard.checkLoaderWeb();

		// Address Details page //
		if (testData.get("IsPanAvailable").equalsIgnoreCase("NO") && testData.get("IsAadhaarCard").equalsIgnoreCase("NO")) {
			TestUtil.scrollTillTOPOfPage(getDriver());
			if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
				if (testData.get("AddressLocation1").equalsIgnoreCase("International")) {
					address.ClickOnAddressLocationButton(testData.get("AddressLocation1"));
					address.ClearEditPinWeb(testData.get("pinCode"));
					address.validationAddressOneWeb(testData.get("addressOne"));
					address.EnterCityAddressWeb(testData.get("CityAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));

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
				dashboard.checkLoaderWeb();
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

			TestUtil.scrollTillTOPOfPage(getDriver());
			if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
				if (testData.get("AddressLocation1").equalsIgnoreCase("International")) {
					address.ClickOnAddressLocationButton(testData.get("AddressLocation1"));
					address.ClearEditPinWeb(testData.get("pinCode"));
					address.validationAddressOneWeb(testData.get("addressOne"));
					address.EnterCityAddressWeb(testData.get("CityAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));
					address.EnterStateAddressWeb(testData.get("StateAddress"));

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
			dashboard.checkLoaderWeb();

		} else {
			TestUtil.scrollTillEndOfPage(driver);
			customerprofile.ClickOnConfirmButton();
			dashboard.checkLoaderWeb();

		}
		dashboard.checkLoaderWeb();
		Thread.sleep(2000);

		// Insurer Personal Health Details Tab //
		insupersonalhealth.EnterHeightFeet(testData.get("HeightFeet"));
		insupersonalhealth.EnterHeightInch(testData.get("HeightInch"));
		insupersonalhealth.EnterWeight(testData.get("weight"));
		if (testData.get("Isweightgainlost").equalsIgnoreCase("Yes")) {
			insupersonalhealth.ClickOnIsThereAnyWeightChangesYESBtnWeb(testData.get("Weightgainlost"));
		}
		insupersonalhealth.ClickSaveContinuecapitalBtn(); //SAVE & CONTINUE button QA//

		// Insurer Lifestyle Details Tab //
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

		// Insurer Medical History Tab //
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

			// Insurer family medical tab // father+mother+brother+sister
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
					insurercoviddetails.ClickOnhaveyoutestedCOVID19Web();
					insurercoviddetails.enterdignodateweb(testData.get("DiagnosisDate"));
					insurercoviddetails.enterrecoverydateweb(testData.get("RecoveryDate"));

					if (testData.get("IsTreatmentTaken").equalsIgnoreCase("Yes")) {
						insurercoviddetails.ClickOntreatmenttakenInsWeb();

						if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("Yes")) {
							insurercoviddetails.ClickOnAsymptyesInsWeb();
						} else if (testData.get("IsCoviddetailsAsymptomatic").equalsIgnoreCase("No")) {
							insurercoviddetails.ClickOnAsymptInsnoWeb();
						}
						if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("Yes")) {
							insurercoviddetails.ClickOnHomequrInsyesWeb();
						} else if (testData.get("IsCoviddetailsHomeQ").equalsIgnoreCase("No")) {
							insurercoviddetails.ClickOnHomequryInsnoWeb();
						}
						if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("Yes")) {
							insurercoviddetails.ClickOnHospitalInsyesWeb();
						} else if (testData.get("IsCoviddetailsHospitalized").equalsIgnoreCase("No")) {
							insurercoviddetails.ClickOnHospitalInsnoWeb();
						}
					} else {
						insurercoviddetails.ClickOnTretmentTakenNOBTNWeb();
					}
				}

				insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
				dashboard.checkLoaderWeb();

		// Insurer Medical History Tab //
		if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("No")) {
			insurermedicalhistory.Clickononotoall(); // for No To All check box //
		} else if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("Yes")) {
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
		insurerlifestyle.ClickSaveContinueBtn(); //Save & Continue Button QA//
		dashboard.checkLoaderWeb();

		// Proposer NRI Mandate //
		if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
			nriMandate.clickOnAreYouIndianOrigin(testData.get("isIndianOrigin"));
			nriMandate.enterCountryOfPermanentResidence(testData.get("pResidence"));
			nriMandate.enterDateFromWhichBecamePR(testData.get("datePR"));
			nriMandate.enterDateLastVisitedIndia(testData.get("lastVisitedIndiaDate"));
			nriMandate.enterPassportNumber(testData.get("passportNumber"));
			nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplication"));

			// FNIO - PIO //
			if (testData.get("TypeOfNRI").equalsIgnoreCase("FNIO") || testData.get("TypeOfNRI").equalsIgnoreCase("PIO")) {

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
			if ((testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
					&& (testData.get("AddressLocation1").equalsIgnoreCase("International")
							&& (testData.get("EditAddress").equalsIgnoreCase("YES")))
					|| (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							&& (testData.get("AddressLocation1").equalsIgnoreCase("International"))))) {
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

			// Residence Address while in Abroad//
			if ((testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
					&& (testData.get("AddressLocation1").equalsIgnoreCase("Indian")
							&& (testData.get("EditAddress").equalsIgnoreCase("YES"))
							|| (testData.get("IsPanAvailabel").equalsIgnoreCase("YES"))
							|| (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
									&& (testData.get("AddressLocation1").equalsIgnoreCase("Indian")))))) {
				nriMandate.addTypeNri(testData.get("nriAddressType"));
				nriMandate.enterNriAddress1(testData.get("address1Nri"));
				nriMandate.enterNriAddress2(testData.get("address2Nri"));
				nriMandate.enterNriAddress3(testData.get("address3Nri"));
				nriMandate.enterNriArea(testData.get("areaNri"));
				wait.WaitTime2();
				nriMandate.enterNriCity(testData.get("cityNri"));
				wait.WaitTime2();
				nriMandate.enterNriState(testData.get("stateNri"));
				wait.WaitTime2();
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
			if (testData.get("TypeOfNRI").equalsIgnoreCase("FNIO") || testData.get("TypeOfNRI").equalsIgnoreCase("PIO")) {
				if (testData.get("DoYouStayInIndia").equalsIgnoreCase("YES")) {
					nriMandate.clickOnFNIOPIOYESButtonInsured();
					wait.WaitTime2();
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
			}

			// Residence Address while in India//
			if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("YES")) {
				insurerNriMandate.addressSameASPropPrimary();
			} else if (testData.get("isAddSameAsPrimary").equalsIgnoreCase("NO")) {
				insurerNriMandate.enterIndianAddress1(testData.get("indianAddress1"));
				wait.WaitTime2();
				insurerNriMandate.enterIndianAddress2(testData.get("indianAddress2"));
				wait.WaitTime2();
				insurerNriMandate.enterIndianAddress3(testData.get("indianAddress3"));
				wait.WaitTime2();
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
			wait.WaitTime2();
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
			wait.WaitTime2();
			nriMandate.enterNriTeleNumberOffice(testData.get("teleNumberOfficeNriInsur"));

			// Have you traveled over the last 12 months? *//

			if (testData.get("travelledOverLast12MonthsInsur").equalsIgnoreCase("Yes")) {
				insurerNriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12MonthsInsur"));
				nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12MonthsInsur"));
				nriMandate.enterLast12MonthCity(testData.get("last12MonthCityInsur"));
				wait.WaitTime2();
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
				wait.WaitTime2();
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

		// Review and accept page //
		TestUtil.scrollTillEndOfPage(getDriver());
		if (testData.get("TDSDeclaration").equalsIgnoreCase("YES")) {
			rna.ClickOnRandATDSYesBtton();
		} else {
			rna.ClickOnRandATDSNoBtton();
		}
		String appNO = loginPage.Applicationnumber();
		rna.ClickOnRandACheckboxWeb();
		dashboard.checkLoaderWeb();
		rna.SendForReviewClick();
		dashboard.checkLoaderWeb();
		Thread.sleep(3000);

		rna.EnterOTVC();
		dashboard.checkLoaderWeb();
		Thread.sleep(3000);
		dashboard.checkLoaderWeb();
		TestUtil.scrollTillEndOfPage(getDriver());
		rna.ClickOnProceedButtonWeb();
		Thread.sleep(3000);
		dashboard.checkLoaderWeb();
		 if (testData.get("IsSelectPayment").equalsIgnoreCase("YES")) {

	            if (testData.get("PaymentType").equalsIgnoreCase("chequeDD")) {

	            	 if (testData.get("IsSelectWinBackPayment").equalsIgnoreCase("YES")) {
		                	
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.ClickOnWinBackModeweb();
		                    wait.WaitTime2();
		                    for(int j=0;j<=1;j++) {
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.EnterPolicyNOOnWinBackWeb(testData.get("WBplicyNo"));
		                    wait.WaitTime2();
		                    paymentpage.EnterAmountOnWinBackWeb(testData.get("Wbamount"));
		                    wait.WaitTime2();
		                	if(j==0) {
		                    paymentpage.ClickOnWinBackSaveBTNweb();
		                    wait.WaitTime2();
		                	}
		                	}
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.ClickOnWinBackREDEEMBTNweb();
		                    wait.WaitTime2();
		                    TestUtil.scrollTillTOPOfPage(driver);

		                }

	                paymentpage.ClickOnChequeAndDDModeweb();

	                if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Cheque")) {

	                    wait.WaitTime2();
	                    wait.WaitTime2();
	                    //TestUtil.scrollToElement(driver, WebDriverFactoryStaticThreadLocal.getDriver().findElement(By.xpath("//div[contains(text(),'CASH')]")));
	                    paymentpage.UploadChequeAndDDImgweb();
	                    wait.WaitTime2();
	                    paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
	                    paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get("CDDMonth"), testData.get("CDDYear"));
	                   // paymentpage.VarifyINCORRECTIFSCCodeOnCDDWeb();
	                    wait.WaitTime2();
	                    paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
	                    dashboard.checkLoaderWeb();
	                    wait.WaitTime2();
	                    paymentpage.ClickCDDPaymentSubmitBTNweb();
	                    dashboard.checkLoaderWeb();
	                    wait.WaitTime2();
	                    WebElement PlainEle1 =getDriver().findElement(By.xpath("(//div[contains(@class,'upper-case text-style-1')])[1]"));
	                    String PlainEle1Value2 = PlainEle1.getText();
	                    TestUtil.verifybgColor(PlainEle1, driver);
	                    String[] PlainEle1Value2update = PlainEle1Value2.split(": ");
	                    String SelectPlanUpdate = testData.get("SelectPlan").toUpperCase();
	                    softassert.assertEquals(PlainEle1Value2update[1], SelectPlanUpdate);

	                    WebElement PremiumAmountEle2 = getDriver().findElement(By.xpath("(//div[contains(@class,'amount')])[1]"));
	                    String PremiumAmountEle2Value2 = PremiumAmountEle2.getText();
	                    TestUtil.verifybgColor(PremiumAmountEle2, driver);
	                    String[] PremiumAmountEle2Value2update = PremiumAmountEle2Value2.split("s.");
	                  //  softassert.assertEquals(PremiumAmountEle2Value2update[1], InitialPremiumAmountValue1);

	                    WebElement CurrentDateEle1 = getDriver().findElement(By.xpath("(//div[contains(@class,'payment-details-value')])[2]"));
	                    String CurrentDateEle1Value = CurrentDateEle1.getText();
	                    TestUtil.verifybgColor(CurrentDateEle1, driver);
	                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	                    LocalDateTime now = LocalDateTime.now();
	                    String CurrentDateEle2 = dtf.format(now);
	                    softassert.assertEquals(CurrentDateEle1Value, CurrentDateEle2);
	                    paymentpage.Nextbutton();
	                    dashboard.checkLoaderWeb();
	                    wait.WaitTime2();

	                } else if (testData.get("selectChequeORDemandDraft").equalsIgnoreCase("Demand Draft")) {
	                    wait.WaitTime2();
	                    paymentpage.ClickDDBTNweb();
	                    wait.WaitTime2();
	                    paymentpage.UploadChequeAndDDImgweb();
	                    wait.WaitTime2();
	                    //TestUtil.scrollToElement(driver, WebDriverFactoryStaticThreadLocal.getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
	                    paymentpage.EnterChequeDDNoWeb(testData.get("ChequeDDNo"));
	                    wait.WaitTime2();
	                    paymentpage.EnterDDMMYYONCDDWeb(testData.get("CDDday"), testData.get("CDDMonth"), testData.get("CDDYear"));
	                    paymentpage.EnterIFSCCodeOnCDDWeb(testData.get("CDDIFSCcode"));
	                    wait.WaitTime2();
	                    //TestUtil.scrollToElement(driver, WebDriverFactoryStaticThreadLocal.getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
	                    paymentpage.UploadDECLARATIONFORMImgWEB();
	                    wait.WaitTime2();
	                    paymentpage.ClickCDDPaymentSubmitBTNweb();
	                    dashboard.checkLoaderWeb();
	                    wait.WaitTime2();
	                    TestUtil.scrollTillTOPOfPage(getDriver());
	                    wait.WaitTime2();
	                    paymentpage.Nextbutton();
	                    dashboard.checkLoaderWeb();
	                    wait.WaitTime2();
	                    wait.WaitTime2();
	                }
	            }

	            if (testData.get("PaymentType").equalsIgnoreCase("cash")) {

	            	 if (testData.get("IsSelectWinBackPayment").equalsIgnoreCase("YES")) {
		                	
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.ClickOnWinBackModeweb();
		                    wait.WaitTime2();
		                    for(int j=0;j<=0;j++) {
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.EnterPolicyNOOnWinBackWeb(testData.get("WBplicyNo"));
		                    wait.WaitTime2();
		                    paymentpage.EnterAmountOnWinBackWeb(testData.get("Wbamount"));
		                    wait.WaitTime2();
		                	if(j==0) {
		                    paymentpage.ClickOnWinBackSaveBTNweb();
		                    wait.WaitTime2();
		                	}
		                	}
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.ClickOnWinBackREDEEMBTNweb();
		                    wait.WaitTime2();
		                    TestUtil.scrollTillTOPOfPage(driver);

		                }

	                paymentpage.ClickOnCashModeweb();

	                Thread.sleep(2000);
	                TestUtil.scrollTillEndOfPage(driver);
	                Thread.sleep(2000);

	                paymentpage.ClickOnCashSubmitBTNweb();
	                Thread.sleep(5000);

	                WebElement PlainEle1 =getDriver()
	                        .findElement(By.xpath("(//div[contains(@class,'upper-case text-style-1')])[1]"));
	                String PlainEle1Value2 = PlainEle1.getText();
	                TestUtil.verifybgColor(PlainEle1, driver);
	                String[] PlainEle1Value2update = PlainEle1Value2.split(":");
	                softassert.assertEquals(PlainEle1Value2update[1], testData.get("PlanSelectionJourney"));

	                WebElement PremiumAmountEle2 = getDriver()
	                        .findElement(By.xpath("(//div[contains(@class,'amount')])[1]"));
	                String PremiumAmountEle2Value2 = PremiumAmountEle2.getText();
	                TestUtil.verifybgColor(PremiumAmountEle2, driver);
	                String[] PremiumAmountEle2Value2update = PremiumAmountEle2Value2.split("s.");
	               // softassert.assertEquals(PremiumAmountEle2Value2update[1], InitialPremiumAmountValue1);

	                WebElement CurrentDateEle1 = getDriver().findElement(By.xpath("(//div[contains(@class,'payment-details-value')])[2]"));
	                String CurrentDateEle1Value = CurrentDateEle1.getText();
	                TestUtil.verifybgColor(CurrentDateEle1, driver);
	                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	                LocalDateTime now = LocalDateTime.now();
	                String CurrentDateEle2 = dtf.format(now);
	                softassert.assertEquals(CurrentDateEle1Value, CurrentDateEle2);

	                paymentpage.Nextbutton();
	                Thread.sleep(4000);
	            }
	            if (testData.get("PaymentType").equalsIgnoreCase("OTC")) {

	            	 if (testData.get("IsSelectWinBackPayment").equalsIgnoreCase("YES")) {
		                	
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.ClickOnWinBackModeweb();
		                    wait.WaitTime2();
		                    for(int j=0;j<=1;j++) {
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.EnterPolicyNOOnWinBackWeb(testData.get("WBplicyNo"));
		                    wait.WaitTime2();
		                    paymentpage.EnterAmountOnWinBackWeb(testData.get("Wbamount"));
		                    wait.WaitTime2();
		                	if(j==0) {
		                    paymentpage.ClickOnWinBackSaveBTNweb();
		                    wait.WaitTime2();
		                	}
		                	}
		                    TestUtil.scrollTillEndOfPage(driver);
		                    paymentpage.ClickOnWinBackREDEEMBTNweb();
		                    wait.WaitTime2();
		                    TestUtil.scrollTillTOPOfPage(driver);

		                }
	                TestUtil.scrollTillEndOfPage(driver);
	                paymentpage.ClickOnOTCModeweb();

	                Thread.sleep(2000);
	                TestUtil.scrollTillEndOfPage(driver);
	                Thread.sleep(2000);

	                paymentpage.ClickOnOTCSubmitBTNweb();
	                Thread.sleep(5000);

	                paymentpage.Nextbutton();
	                Thread.sleep(4000);
	            }

	        } else {
	            paymentpage.ClickDoItLatterOnPaymentweb();
	        }

		//e-CDF
		switch (testData.get("ChannelName")) {

		case "BOM":
		
		
		if (testData.get("IsECDF").equalsIgnoreCase("YES")) {
            paymentpage.clickOnCheckBoxECDFweb();
            Thread.sleep(2000);
            TestUtil.scrollTillEndOfPage(driver);
            Thread.sleep(2000);
            paymentpage.clickOnSumitBTNECDFweb();
            dashboard.checkLoaderWeb();
            Thread.sleep(2000);
           
        } else  {
            TestUtil.scrollTillEndOfPage(driver);
            Thread.sleep(2000);
            WebElement Doitletter = getDriver().findElement(By.xpath("//button[@name='DO IT LATER']"));
            Thread.sleep(2000);
            Doitletter.click();

        }
		break;
		
		}
		List<WebElement> documentpageCount = getDriver()
				.findElements(By.xpath("(//div[@role='tablist'])[2]//button//span[1]"));
		int docSize = documentpageCount.size();
		for (int i = 0; i < docSize; i++) {
			String str = documentpageCount.get(i).getText();

			if (str.equalsIgnoreCase("Identity Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO")
						|| testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
							|| testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
						documentpage.clickOnIdentityTileweb();
						wait.WaitTime2();
						documentpage.SelectTypeOfDocumentweb(testData.get("SelectTypeOfDocument"));
						documentpage.UploadFileweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
						TestUtil.scrollTillEndOfPage(getDriver());
						Thread.sleep(2000);
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					} else {
						TestUtil.scrollTillEndOfPage(getDriver());
						wait.WaitTime2();
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					}
				} else {
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();

				}
			}
			if (str.equalsIgnoreCase("Address Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO")
						|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
						|| testData.get("EditAddress").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
							|| testData.get("EditAddress").equalsIgnoreCase("YES")
							|| testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
						documentpage.clickOnAddressProofTileweb();
						wait.WaitTime2();
						documentpage.SelectTypeOfDocumentweb(testData.get("SelectTypeOfDocument"));
						documentpage.UploadFileweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();

						if (testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
								&& testData.get("IsNRI").equalsIgnoreCase("NO")
								&& testData.get("EditAddress").equalsIgnoreCase("YES")
								|| testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
										&& testData.get("IsNRI").equalsIgnoreCase("NO")
										&& testData.get("IsPermanentAddressSame").equalsIgnoreCase("NO")
								|| testData.get("IsPanAvailabel").equalsIgnoreCase("YES")
										&& testData.get("IsNRI").equalsIgnoreCase("YES")
										&& testData.get("EditAddress").equalsIgnoreCase("YES")
								|| testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
										&& testData.get("IsNRI").equalsIgnoreCase("YES")
										&& testData.get("IsPermanentAddressSame").equalsIgnoreCase("NO")) {
							documentpage.SelectTypeOfDocumentPermant(testData.get("SelectTypeOfDocument"));
							documentpage.UploadFilepermant();
							dashboard.checkLoaderWeb();
						}
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					} else {
						TestUtil.scrollTillEndOfPage(getDriver());
						wait.WaitTime2();
						documentpage.clickOnNEXTButtonweb();
						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					}
				} else {
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();

				}

			}
			if (str.equalsIgnoreCase("Non Medical Requirement")) {
				try {
					documentpage.UploadNonMedicalNEFTCancelChequeProposerNotInsuredweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					documentpage.UploadNonMedicalPhotograph();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}

				try {
					documentpage.UploadNonMedicalFinacialJustcationweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					if (testData.get("IsNRI").equalsIgnoreCase("YES")) {
						documentpage.UploadNonMedicalProposerPassportCopyProposer();
						dashboard.checkLoaderWeb();
						Thread.sleep(2000);
					}
				} catch (Exception e) {

				}
				// INSURED
				try {
					if (testData.get("IsNRIInsured").equalsIgnoreCase("YES")) {
						documentpage.UploadNonMedicalProposerPassportCopyProposerInsured();
						dashboard.checkLoaderWeb();
						Thread.sleep(2000);
					}
				} catch (Exception e) {

				}
				try {
					documentpage.UploadNonMedicalIncomeProof();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				if (testData.get("IsNRI").equalsIgnoreCase("NO")) {

					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")) {
						documentpage.UploadNonMedicalForm60ProposerNotInsuredweb();

						dashboard.checkLoaderWeb();
						wait.WaitTime2();
					}
				}
				try {
					documentpage.UploadNonMedicalPhotograph();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}

				try {
					documentpage.UploadNonMedicalPEPQuestionnaireweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					documentpage.BANKSTATEMENTweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				try {
					documentpage.FINANCIALTRANSACTIONFORMweb();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}
				if (testData.get("IsECDF").equalsIgnoreCase("NO")) {
					documentpage.UploadNonMedicalCustomerDeclarationFormProposerNotInsuredweb();
					dashboard.checkLoaderWeb();
					Thread.sleep(2000);

				}

				TestUtil.scrollTillEndOfPage(getDriver());
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("Medical Requirement")) {
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}
			if (str.equalsIgnoreCase("Income Proof")) {
				documentpage.clickOnIdentityTileweb();
				wait.WaitTime2();
				documentpage.SelectTypeOfDocumentIncomePrrofweb(testData.get("SelectTypeOfDocIncomeProof"));
				documentpage.UploadFileweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("Age Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO") || testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO")
							|| testData.get("PanNameEdit").equalsIgnoreCase("YES")
							|| testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
						try {
							documentpage.SelectTypeOfDocumentAgePrrofweb(testData.get("SelectTypeOfDocAgeProof"));
							documentpage.UploadFileweb();
							dashboard.checkLoaderWeb();
						} catch (Exception e) {

						}

					}
				}

				TestUtil.scrollTillEndOfPage(getDriver());

				try {
					documentpage.SelectTypeOfDocumentAgePrrofweb(testData.get("SelectTypeOfDocAgeProof"));
					documentpage.UploadFilepermant();
					dashboard.checkLoaderWeb();
				} catch (Exception e) {

				}

				wait.WaitTime2();
				wait.WaitTime2();
				documentpage.clickOnSumbitweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("E-NACH Registration")) {
				documentpage.clickOnENACHRegistrationTileweb();
				wait.WaitTime2();
				TestUtil.scrollTillEndOfPage(getDriver());
				wait.WaitTime2();
				wait.WaitTime2();
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("PAN Card Proof")) {
				if (testData.get("PanNameEdit").equalsIgnoreCase("YES")
						|| testData.get("IsPanAvailabel").equalsIgnoreCase("NO")) {
					documentpage.SelectTypeOfDocumentweb("PAN Card");
					documentpage.UploadFileweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				} else {
					TestUtil.scrollTillEndOfPage(getDriver());
					wait.WaitTime2();
					documentpage.clickOnNEXTButtonweb();
					dashboard.checkLoaderWeb();
					wait.WaitTime2();
				}

			}
			if (str.equalsIgnoreCase("ECS Mandate")) {
				documentpage.clickOnECSMAndateTileweb();
				wait.WaitTime2();
				documentpage.UploadFileweb();
				dashboard.checkLoaderWeb();
				TestUtil.scrollTillEndOfPage(driver);
				Thread.sleep(9000);
				documentpage.clickOnNEXTButtonweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
			}

		}
		wait.WaitTime2();
		dashboard.checkLoaderWeb();
		documentpage.ClickOnCSEAlertOKButton();
		dashboard.checkLoaderWeb();

	}

}