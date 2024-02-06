package com.absli.modules;

import static Utils.CommonUtils.calculateAge;
import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class HealthInfoModule {
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

	public void HealthInfomodule(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
		  
		

		
		
		
		
		
		// Insurer Personal Health Details Tab //
				insupersonalhealth.EnterHeightFeet(testData.get("HeightFeet"));
				insupersonalhealth.EnterHeightInch(testData.get("HeightInch"));
				insupersonalhealth.EnterWeight(testData.get("weight"));
				if (testData.get("Isweightgainlost").equalsIgnoreCase("Yes")) {
					insupersonalhealth.ClickOnIsThereAnyWeightChangesYESBtnWeb(testData.get("Weightgainlost"));
				}
				insupersonalhealth.ClickSaveContinuecapitalBtn(); // SAVE & CONTINUE button QA//
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
				// Insurer Lifestyle Details Tab //
				if (testData.get("IsLifeStyleDetails").equalsIgnoreCase("YES")) {

					if (testData.get("IsNarcoticsDetails").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectNarcoticsYESButton();

						insurerlifestyle.EnterReasonForNarcotics(testData.get("ProvideDetails"));
					}

					TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Alcohol Consumption']")));

					if (testData.get("IsAlcoholConsumptionDetails").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectAlcohalConsumptionYESButton();

						insurerlifestyle.TypeofAlcoholConsume(testData.get("TypeOfAlcohal"), testData.get("Quantity"),
								testData.get("Frequency"));

						if (testData.get("AlcoholAdviseQ1").equalsIgnoreCase("YES")) {
							insurerlifestyle.selectAdvicealcoholYESButton(testData.get("Hospital"), testData.get("Reason"),
									testData.get("VisitDate"), testData.get("VisitMonth"), testData.get("VisitYear"));
						}
						if (testData.get("AlcoholAddictsQ2").equalsIgnoreCase("YES")) {
							insurerlifestyle.selectAlcohalAddictsYESButton();
						}
						if (testData.get("AlcoholAddinfoQ3").equalsIgnoreCase("YES")) {
							insurerlifestyle.selectAlcohalAddinfoYESButton(testData.get("Addinfo"));
						}
					}

					TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Tobacco / Nicotine ']")));

					if (testData.get("IsTobaccoNicotine").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectTobacconicotinYESButton();
						insurerlifestyle.Clickdurationmonthweb(testData.get("MonthDuration"));
						insurerlifestyle.TypeofTobacco(testData.get("Tobaccotype"), testData.get("quantity"),
								testData.get("noofyear"));

						if (testData.get("Advicetostop").equalsIgnoreCase("Yes")) {
							insurerlifestyle.selectAdvisetostopYESButton(testData.get("SpecifyReason"));
						}
					}

					TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Hazardous Activities']")));
					if (testData.get("IsHazardousActivities").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectHazardousActivityYESButton();
						insurerlifestyle.HazardousSelectOption1(testData.get("Hazardactivity"));
						insurerlifestyle.enteryerashazard(testData.get("MentionYears"));
						insurerlifestyle.HazardousSelectOption2(testData.get("HazardActivityBy"));
					}
					TestUtil.scrollTillEndOfPage(getDriver());
					if (testData.get("IsTravel").equalsIgnoreCase("YES")) {
						insurerlifestyle.selectTraveloutsideYESButton();
						insurerlifestyle.TravelDetailstwelvemonth(testData.get("Country"), testData.get("City"),
								testData.get("DateofDept"), testData.get("DateofArrvl"), testData.get("Visatype"));
					}
				}
				TestUtil.scrollTillEndOfPage(getDriver());
				insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
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

					insurerfamilymedical.EnterProvideDetailsCommonWeb(testData.get("Providemeddetails"));
				}
				TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Mother']")));
				wait.WaitTime2();
				insurerfamilymedical.ValidationsOfFatherOnFamilyMedicalWeb(testData.get("FMBSLivingDemise"),testData.get("FMBSAgeDeath"), testData.get("FMBSStateAndCause"));
				wait.WaitTime2();
				if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get("FMBSLivingDemise").equalsIgnoreCase("Deceased")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedical(testData.get("Providemeddetails"));

				} else if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get("FMBSLivingDemise").equalsIgnoreCase("Living")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedicalliving(testData.get("Providemeddetails"));
				}
				WebElement Bro = getDriver().findElement(By.xpath("//div[text()='Brother']"));
				TestUtil.scrollToElement(driver, Bro);
				wait.WaitTime2();
				insurerfamilymedical.ValidationsOfMotherOnFamilyMedicalWeb(testData.get("FMBSLivingDemise"),
						testData.get("FMBSAgeDeath"), testData.get("FMBSStateAndCause"));
				wait.WaitTime2();
				if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get("FMBSLivingDemise").equalsIgnoreCase("Deceased")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedicalother(testData.get("Providemeddetails"));

				} else if (testData.get("FMBSStateAndCause").equalsIgnoreCase("Others")
						&& testData.get("FMBSLivingDemise").equalsIgnoreCase("Living")) {
					insurerfamilymedical.EnterOtherFilesOnFamilyMedicallivingMother(testData.get("Providemeddetails"));
				}

				if (testData.get("IsBrother").equalsIgnoreCase("YES")) {
					TestUtil.scrollTillEndOfPage(driver);
					insurerfamilymedical.ClickonAddBrotherBTNWeb();
					wait.WaitTime2();
					insurerfamilymedical.ValidationsOfBrotherOnFamilyMedicalWeb(testData.get("BSLivingDeceased"),testData.get("BrotherSisAge"), testData.get("BrotherSisStateOfHealth"));
					if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Deceased")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicalBro(testData.get("Providemeddetails"));

					} else if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Living")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicallivingBro(testData.get("Providemeddetails"));
					}
					insurerfamilymedical.ClickonSaveBrotherAndSisterBTNWeb();
				}

				if (testData.get("IsSister").equalsIgnoreCase("YES")) {
					TestUtil.scrollTillEndOfPage(driver);
					insurerfamilymedical.ClickonAddSisterBTNWeb1(testData.get("IsBrother"));
					wait.WaitTime2();
					insurerfamilymedical.ValidationsOfSisterOnFamilyMedicalWeb(testData.get("BSLivingDeceased"),
							testData.get("BrotherSisAge"), testData.get("BrotherSisStateOfHealth"));
					if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Deceased")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicalBro(testData.get("Providemeddetails"));

					} else if (testData.get("BrotherSisStateOfHealth").equalsIgnoreCase("Others")
							&& testData.get("BSLivingDeceased").equalsIgnoreCase("Living")) {
						insurerfamilymedical.EnterOtherFilesOnFamilyMedicallivingBro(testData.get("Providemeddetails"));
					}
					Thread.sleep(1000);
					wait.WaitTime2();
					insurerfamilymedical.ClickonSaveBrotherAndSisterBTNWeb();
				}

				insurerlifestyle.SAVEANDCONTINUEBTN(); // Save & Continue Button QA//
				dashboard.checkLoaderWeb();
				wait.WaitTime2();
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
				
					insurermedicalhistory.Clickononotoall(); // for No To All check box //


				if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("YES")) {
					if (testData.get("IsAbsentFromWork").equalsIgnoreCase("YES")) {
						insurermedicalhistory.ClickonAbsentfromWork();

						insurermedicalhistory.EnterAbsentfromWorkCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
						insurermedicalhistory.EnterAbsentfromWorkDoctorDetails(testData.get("AFWdoctordetails"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsult(testData.get("AFWLCday"),
								testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosis(testData.get("AFWDDday"),
								testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
						insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalization(testData.get("AFWdetails"));
					} else if (testData.get("IsAbsentFromWork").equalsIgnoreCase("NO")) {
						insurermedicalhistory.ClickonAbsentfromWorkNO();
					}
					if (testData.get("IsHospitalization").equalsIgnoreCase("YES")) {
						insurermedicalhistory.Clickonhospitalization();

						insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomhos(testData.get("AFWcurrentsymptoms"));
						insurermedicalhistory.EnterAbsentfromWorkDoctorDetailshos(testData.get("AFWdoctordetails"));
						insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationhos(testData.get("AFWdetails"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsulthos(testData.get("AFWLCday"),
								testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosishos(testData.get("AFWDDday"),
								testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
					} else if (testData.get("IsHospitalization").equalsIgnoreCase("No")) {
						insurermedicalhistory.ClickonhospitalizationNO();
					}
					if (testData.get("IsAilments").equalsIgnoreCase("No")) {
						insurermedicalhistory.ClickonAilmentsNO();
					}
					if (testData.get("IsDisorder").equalsIgnoreCase("YES")) {
						insurermedicalhistory.ClickonDisorder();

						insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomdsdr(testData.get("AFWcurrentsymptoms"));
						insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsdsdr(testData.get("AFWdoctordetails"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdsdr(testData.get("AFWLCday"),
								testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisdsdr(testData.get("AFWDDday"),
								testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
						insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationdsdr(testData.get("AFWdetails"));
					} else if (testData.get("IsDisorder").equalsIgnoreCase("No")) {
						insurermedicalhistory.ClickonDisorderNO();
					}
					if (testData.get("IsSpouseHealth").equalsIgnoreCase("YES")) {
						insurermedicalhistory.ClickonSpouseHealth();

						insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomspouse(testData.get("AFWcurrentsymptoms"));
						insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsspouse(testData.get("AFWdoctordetails"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdspouse(testData.get("AFWLCday"),
								testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisspouse(testData.get("AFWDDday"),
								testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
						insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationspouse(testData.get("AFWdetails"));
					} else if (testData.get("IsSpouseHealth").equalsIgnoreCase("No")) {
						insurermedicalhistory.ClickonSpouseHealthNO();
					}
					if (testData.get("IsOtherSymptoms").equalsIgnoreCase("YES")) {
						insurermedicalhistory.Clickonothersymp();

						insurermedicalhistory.EnterAbsentfromWorkCurrentSymptomother(testData.get("AFWcurrentsymptoms"));
						insurermedicalhistory.EnterAbsentfromWorkDoctorDetailsother(testData.get("AFWdoctordetails"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfLastConsultdother(testData.get("AFWLCday"),
								testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
						insurermedicalhistory.EnterAbsentfromWorkDateOfDiagnosisother(testData.get("AFWDDday"),
								testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
						insurermedicalhistory.EnterAbsentfromWorkDetailsofHospitalizationother(testData.get("AFWdetails"));
					} else if (testData.get("IsOtherSymptoms").equalsIgnoreCase("No")) {
						insurermedicalhistory.ClickonothersympNO();
					}

//		            if (testData.get("PropTitle").equalsIgnoreCase("Mrs.") || (testData.get("PropTitle").equalsIgnoreCase("Ms."))) {
//		                if (testData.get("IsPregnant").equalsIgnoreCase("Are You Pregnant")) {
//		                    insurermedicalhistory.ClickonAreyoupregnant();
		//
//		                    insurermedicalhistory.EnterAreyoupregnantnumberofweeks(testData.get("NoofWeeeks"));
//		                    insurermedicalhistory.EnterAreyoupregnantCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
//		                    insurermedicalhistory.EnterAreyoupregnantDoctorDetails(testData.get("AFWdoctordetails"));
//		                    insurermedicalhistory.EnterAreyoupregnantDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
//		                    insurermedicalhistory.EnterAreyoupregnantDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
//		                    insurermedicalhistory.EnterAreyoupregnantDetailsofHospitalization(testData.get("AFWdetails"));
//		                } else if (testData.get("IsPregnant").equalsIgnoreCase("No")) {
//		                    insurermedicalhistory.ClickonAreyoupregnantNo();
//		                }
//		                if (testData.get("IsGynaecological").equalsIgnoreCase("Gynaecological Problem")) {
//		                    insurermedicalhistory.Clickongynaecological();
		//
//		                    insurermedicalhistory.EntergynaecologicalCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
//		                    insurermedicalhistory.EntergynaecologicalDoctorDetails(testData.get("AFWdoctordetails"));
//		                    insurermedicalhistory.EntergynaecologicalDateOfLastConsult(testData.get("AFWLCday"), testData.get("AFWLCmonth"), testData.get("AFWLCyear"));
//		                    insurermedicalhistory.EntergynaecologicalDateOfDiagnosis(testData.get("AFWDDday"), testData.get("AFWDDmonth"), testData.get("AFWDDyear"));
//		                    insurermedicalhistory.EntergynaecologicalDetailsofHospitalization(testData.get("AFWdetails"));
//		                } else if (testData.get("IsGynaecological").equalsIgnoreCase("No")) {
//		                    insurermedicalhistory.ClickongynaecologicalNo();
//		                }
//		            }
				}
				insurerlifestyle.ClickSaveContinueBtn(); // Save & Continue Button QA//
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

}
}
