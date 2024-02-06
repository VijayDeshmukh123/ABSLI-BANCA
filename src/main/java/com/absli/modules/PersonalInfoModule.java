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

public class PersonalInfoModule {
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
	ECCDPage eccd;
	ProposerNRIMandate nriMandate;
	InsurerNRIMandate insurerNriMandate;
	RandAPage rna;
	PaymentPage paymentpage;
	DocumentsPage documentpage;
	IARPage IARpage;
	public static PropertiesUtils prop;
	SoftAssert softassert;
	HealthAndPureTermsPage healthandpuretermspage;
//------------------------------------------------------Same ------------------------------------------------------------------//

	public void PersonalInfomodule(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
		  IARpage=new IARPage(getDriver());
		  
		

		// Proposer-Insured Personal info tab // (Same Scenario)
		Thread.sleep(2000);
		TestUtil.scrollTillTOPOfPage(driver);
		insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("fatherSpouse"));
		insurerpersonalinfo.EnterMotherNameweb(testData.get("mothername"));
		insurerpersonalinfo.SelectBirthPlaceweb(testData.get("InsurerBirthPlace"));
		if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
			insurerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
		} else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.EIAwantyes();
		}
		if (testData.get("IsInsuPolitical").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.IsInsupolitical(testData.get("PoliticalDetails"));
		}

		// Insurer Professional Details tab //
		insuprofdetails.SelectQualificationweb(testData.get("qualification"));
		Thread.sleep(2000);
		TestUtil.scrollTillEndOfPage(getDriver());
		if (testData.get("occupationOption").equalsIgnoreCase("Professional")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Business Owner")) {
			insuprofdetails.EnterOccupationNameofbusinessweb(testData.get("nameofbusiness"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Retired")) {
			 insuprofdetails.SpouseAnnualIncome(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Service")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Student")) {
			insuprofdetails.ParentInsurerAnnualincome(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Housewife/Homemaker")) {
			insuprofdetails.SpouseCover(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Driver")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Armed Forces")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Jeweller")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Builder")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Doctor")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Lawyer")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Architect")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Others")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
			insuprofdetails.ClickOnAreYouRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
		}
		insuprofdetails.ClickonSaveContinueButtonweb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		TestUtil.scrollTillTOPOfPage(driver);

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
	
	//=================================DCB=================================================
	public void PersonalInfomodule_DCB(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
		  IARpage=new IARPage(getDriver());
	// Proposer-Insured Personal info tab // (Same Scenario)
	Thread.sleep(2000);
	TestUtil.scrollTillTOPOfPage(driver);
	insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("fatherSpouse"));
	insurerpersonalinfo.EnterMotherNameweb(testData.get("mothername"));
	insurerpersonalinfo.SelectBirthPlaceweb(testData.get("InsurerBirthPlace"));
	if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
		insurerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
	} else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
		insurerpersonalinfo.EIAwantyes();
	}
	if (testData.get("IsInsuPolitical").equalsIgnoreCase("Yes")) {
		insurerpersonalinfo.IsInsupolitical(testData.get("PoliticalDetails"));
	}

	// Insurer Professional Details tab //
	insuprofdetails.SelectQualificationweb(testData.get("qualification"));
	Thread.sleep(2000);
	TestUtil.scrollTillEndOfPage(getDriver());
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Professional")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Professional")) {
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Business Owner")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Business Owner")) {
	
		insuprofdetails.EnterOccupationNameofbusinessweb(testData.get("nameofbusiness"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
	}
	
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Service")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Service")) {
	
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Retired")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Retired")) {
	
		 insuprofdetails.SpouseAnnualIncome(testData.get("AnnualIncome"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Student")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Student")) {
	
		insuprofdetails.ParentInsurerAnnualincome(testData.get("AnnualIncome"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Housewife/Homemaker")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Housewife/Homemaker")) {
	
		insuprofdetails.SpouseCover(testData.get("AnnualIncome"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Farmer/Agriculturist")) {
	
		insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Driver")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Driver")) {
	
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Armed Forces")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Armed Forces")) {

		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Army/Navy/Police")) {
	
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Skilled Worker")) {
	
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Jeweller")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Jeweller")) {

		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Builder")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Builder")) {

		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Scrap Dealer")) {
	
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Doctor")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Doctor")) {
	
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Lawyer")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Lawyer")) {

		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Architect")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Architect")) {
	
		insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Others")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Others")) {
	
		insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
		insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
		insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
	}
	if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
		insuprofdetails.ClickOnAreYouRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
	}
	insuprofdetails.ClickonSaveContinueButtonweb();
	dashboard.checkLoaderWeb();
	wait.WaitTime2();
	TestUtil.scrollTillTOPOfPage(driver);

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
	//=======================DBS==================
	
	
	public void PersonalInfomodule_DBS(WebDriver driver, HashMap<String, String> testData) throws InterruptedException {
		
		insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("fatherSpouse"));
		insurerpersonalinfo.EnterMotherNameweb(testData.get("mothername"));
		insurerpersonalinfo.SelectBirthPlaceweb(testData.get("InsurerBirthPlace"));
//		if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
//			insurerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
//		} else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
//			insurerpersonalinfo.EIAwantyes();
//		}
		if (testData.get("IsInsuPolitical").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.IsInsupolitical(testData.get("PoliticalDetails"));
		}

		// Insurer Professional Details tab //
		insuprofdetails.SelectQualificationweb(testData.get("qualification"));
		Thread.sleep(2000);
		TestUtil.scrollTillEndOfPage(getDriver());
		insuprofdetails.SelectOccupationweb(testData.get("occupationOption"));

		if (testData.get("occupationOption").equalsIgnoreCase("Professional")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Business Owner")) {
			insuprofdetails.EnterOccupationNameofbusinessweb(testData.get("nameofbusiness"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Retired")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			insuprofdetails.SpouseAnnualIncome(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Service")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Student")) {
			insuprofdetails.ParentInsurerAnnualincomeweb(testData.get("AnnualIncome"));
			insuprofdetails.ParentInsurerAnnualincome(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Housewife/Homemaker")) {
			insuprofdetails.SpouseAnnualIncome(testData.get("AnnualIncome"));
			insuprofdetails.SpouseCover(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Driver")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Armed Forces")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Jeweller")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Builder")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Doctor")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Lawyer")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Architect")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Others")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
			insuprofdetails.ClickOnAreYouRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
		}

		insuprofdetails.ClickonSaveContinueButtonweb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		try {
		insuprofdetails.ClickonSaveContinueButtonweb();// this is bug plz write double click code
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		dashboard.checkLoaderWeb();
		}catch(Exception e) {
			
		}
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
	//========================AXIS BANK====================================================
public void PersonalInfomodule_AXIS(WebDriver driver, HashMap<String, String> testData) throws InterruptedException {
		
		insurerpersonalinfo.EnterFatherSpaouseNameweb(testData.get("fatherSpouse"));
		insurerpersonalinfo.EnterMotherNameweb(testData.get("mothername"));
		insurerpersonalinfo.SelectBirthPlaceweb(testData.get("InsurerBirthPlace"));
//		if (testData.get("IsHaveEIA").equalsIgnoreCase("Want to Apply")) {
//			insurerpersonalinfo.EIAwanttoapply(testData.get("PreferredIR"));
//		} else if (testData.get("IsHaveEIA").equalsIgnoreCase("Yes")) {
//			insurerpersonalinfo.EIAwantyes();
//		}
		if (testData.get("IsInsuPolitical").equalsIgnoreCase("Yes")) {
			insurerpersonalinfo.IsInsupolitical(testData.get("PoliticalDetails"));
		}

		// Insurer Professional Details tab //
		if(testData.get("proposer_qualification").isEmpty()) {
		insuprofdetails.SelectQualificationweb(testData.get("qualification"));
		}
		Thread.sleep(2000);
		TestUtil.scrollTillEndOfPage(getDriver());
		if(testData.get("bank_customer_occupation").isEmpty()) {
		insuprofdetails.SelectOccupationweb(testData.get("occupationOption"));
		}
		//if (testData.get("bank_customer_occupation").isEmpty()&&testData.get("occupationOption").equalsIgnoreCase("Retired")||!testData.get("bank_customer_occupation").isEmpty()&&testData.get("bank_customer_occupation").equalsIgnoreCase("Retired")) {
		if (testData.get("occupationOption").equalsIgnoreCase("Professional")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Business Owner")) {
			insuprofdetails.EnterOccupationNameofbusinessweb(testData.get("nameofbusiness"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Retired")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
			insuprofdetails.SpouseAnnualIncome(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Service")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Student")) {
			insuprofdetails.ParentInsurerAnnualincomeweb(testData.get("AnnualIncome"));
			insuprofdetails.ParentInsurerAnnualincome(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Housewife/Homemaker")) {
			insuprofdetails.SpouseAnnualIncome(testData.get("AnnualIncome"));
			insuprofdetails.SpouseCover(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Farmer/Agriculturist")) {
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));

		}
		if (testData.get("occupationOption").equalsIgnoreCase("Driver")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Armed Forces")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Army/Navy/Police")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Skilled Worker")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Jeweller")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Builder")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Scrap Dealer")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Doctor")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Lawyer")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Architect")) {
			insuprofdetails.EnterOccupationNameofEmployeeweb(testData.get("NameOfEmployer"));
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("occupationOption").equalsIgnoreCase("Others")) {
			insuprofdetails.EnterOccupationNatureofbusinessweb(testData.get("natureofbusiness"));
			insuprofdetails.selectOccupationTypeofOrganisationweb(testData.get("TypeOfOrganisation"));
			insuprofdetails.EnterOccupationDesignationweb(testData.get("Designation"));
			insuprofdetails.InsurerAnnualincomeweb(testData.get("AnnualIncome"));
		}
		if (testData.get("IsAreYouRegisterPerson").equalsIgnoreCase("Yes")) {
			insuprofdetails.ClickOnAreYouRegisterPersonaUnderGSTweb(testData.get("GSTnumber"));
		}

		insuprofdetails.ClickonSaveContinueButtonweb();
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		try {
		insuprofdetails.ClickonSaveContinueButtonweb();// this is bug plz write double click code
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		dashboard.checkLoaderWeb();
		}catch(Exception e) {
			
		}
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
