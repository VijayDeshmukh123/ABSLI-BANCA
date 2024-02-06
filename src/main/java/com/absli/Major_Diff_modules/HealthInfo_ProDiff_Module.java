package com.absli.Major_Diff_modules;

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

public class HealthInfo_ProDiff_Module {
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

	public void HealthInfo_ProDiff_module(WebDriver driver, HashMap<String, String> testData)
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
			if (testData.get("LifeStyleDetailsA").equalsIgnoreCase("YES")) {
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

}}
