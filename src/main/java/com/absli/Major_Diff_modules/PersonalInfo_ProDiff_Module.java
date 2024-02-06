package com.absli.Major_Diff_modules;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
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
import com.absli.pageObjects.InsurerCovidDetails;
import com.absli.pageObjects.InsurerFamilyMedical;
import com.absli.pageObjects.InsurerLifestyle;
import com.absli.pageObjects.InsurerMedicalHistory;
import com.absli.pageObjects.InsurerNRIMandate;
import com.absli.pageObjects.InsurerPersonalHealth;
import com.absli.pageObjects.InsurerPersonalInfo;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.MinorPersonalInfo;
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

public class PersonalInfo_ProDiff_Module {
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

	public void PersonalInfo_ProDiff_module(WebDriver driver, HashMap<String, String> testData)
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
		TestUtil.scrollTillEndOfPage(getDriver());
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
	}
	//====================================
	
	public void PersonalInfo_ProDiff_module_DCB(WebDriver driver, HashMap<String, String> testData)
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
		TestUtil.scrollTillEndOfPage(getDriver());
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Professional")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Professional")) {

			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Business Owner")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Business Owner")) {
	
			proposerprofdetails.EnterOccupationNameofbusinessweb(testData.get("Propnameofbusiness"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Service")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Service")) {

			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Farmer/Agriculturist")) {


		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Driver")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Driver")) {
		
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Armed Forces")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Armed Forces")) {
	
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Army/Navy/Police")) {
		
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Skilled Worker")) {

			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Jeweller")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Jeweller")) {

			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Builder")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Builder")) {

			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Scrap Dealer")) {
	
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Doctor")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Doctor")) {

			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Lawyer")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Lawyer")) {
		
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Architect")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Architect")) {
	
			proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
			proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
			proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
			proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
		}
		if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Others")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Others")) {
	
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
	}
	
	//------------------------------------------------------Same GMS------------------------------------------------------------------//

		public void PersonalInfo_ProDiff_module_DBS(WebDriver driver, HashMap<String, String> testData)
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
			proposerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("PropfatherSpouse"));
			Thread.sleep(2000);
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
			TestUtil.scrollTillEndOfPage(getDriver());
			proposerprofdetails.SelectOccupationweb(testData.get("PropoccupationOption"));
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Professional")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Business Owner")) {
				proposerprofdetails.EnterOccupationNameofbusinessweb(testData.get("Propnameofbusiness"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Service")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {

			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Driver")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Armed Forces")) {
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
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
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Jeweller")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Builder")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Scrap Dealer")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Doctor")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Lawyer")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			}
			if (testData.get("PropoccupationOption").equalsIgnoreCase("Architect")) {
				proposerprofdetails.EnterOccupationNameofEmployeeweb(testData.get("Propnameofemployee"));
				proposerprofdetails.EnterOccupationNatureofbusinessweb(testData.get("Propnatureofbusiness"));
				proposerprofdetails.selectOccupationTypeofOrganisationweb(testData.get("Proptypeoforganisation"));
				proposerprofdetails.EnterOccupationDesignationweb(testData.get("PropDesignation"));
				insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
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
//			insurerpersonalinfo.SelectMaritalStatusweb(testData.get("Insumarital"));
//			if (testData.get("Insumarital").equalsIgnoreCase("Married")) {
//				if (testData.get("InsuredTitle").equalsIgnoreCase("Ms.")) {
//					insurerpersonalinfo.EnterMaidenNameweb(testData.get("maidenname"));
//				} else if (testData.get("InsuredTitle").equalsIgnoreCase("Mrs.")) {
//					insurerpersonalinfo.EnterMaidenNameweb(testData.get("maidenname"));
//				}
//			}
			Thread.sleep(2000);

			insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("fatherSpouse"));
			Thread.sleep(2000);

			insurerpersonalinfo.EnterMotherNameweb(testData.get("mothername"));
			Thread.sleep(2000);

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
				insurerpersonalinfo.IsAddexistingPolicy(testData.get("AddexistingPolicy"), testData.get("InsurerName"),
						testData.get("SumAssured"));
			}
			if (testData.get("AddrefusedPolicy").equalsIgnoreCase("Refused Policy")) {
				insurerpersonalinfo.IsAddrefusedPolicy(testData.get("AddrefusedPolicy"), testData.get("PolicyType"),
						testData.get("InsurerNameRef"), testData.get("SumAssuredref"), testData.get("ReasonRef"));
			}
			customerprofile.cdnextbutton(); // customer details NEXT button(QA)

			// Purpose Of Insurance //
			TestUtil.scrollTillTOPOfPage(getDriver());
			insurerpersonalinfo.SelectpurposeofIns(testData.get("InsurancePurpose1"), testData.get("InsurancePurpose2"),
					testData.get("InsurancePurpose3"));
			TestUtil.scrollTillEndOfPage(getDriver());
			customerprofile.cpnextbutton(); // customer profile Next Button(QA)
			dashboard.checkLoaderWeb();
		}
}
