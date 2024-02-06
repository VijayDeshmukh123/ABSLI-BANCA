package com.absli.TestFactory.GotoEndtoEnd;

import com.absli.APIData.ApiData_DCB;
import com.absli.pageObjects.*;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static Utils.CommonUtils.*;
import static com.absli.base.BasePage.getDriver;

public class EndToEndProSameJourney {
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

	public void gotoEndToEndSameJourney(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
		  
		// Communication Details Page //

		Thread.sleep(2000);
		dashboard.checkLoaderWeb();
		communicationdetails.EnterProposerMobileNoweb(testData.get("ProposerMobileNumber"));
		wait.WaitTime2();
		communicationdetails.EnterProposerEmailIdweb(testData.get("ProposerEmailId"));
		TestUtil.scrollTillEndOfPage(getDriver());
		communicationdetails.SelectpreflangWeb(testData.get("PreferredLang"));
		communicationdetails.enteraltnumber(testData.get("AlternateNumber"));
		communicationdetails.enterresnumber(testData.get("ResidenceNumber"));
		communicationdetails.clicksubmitBtn();
		dashboard.checkLoaderWeb();

		// Customer Photo page //
		communicationdetails.ClickDoitLatercapitalbutton();
		dashboard.checkLoaderWeb();

		// Bank Details Page //
		bankdetails.InputIFSCCode(testData.get("IFSCCode"));
		dashboard.checkLoaderWeb();
		wait.WaitTime2();
		TestUtil.scrollTillEndOfPage(driver);
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
				Thread.sleep(2000);
				address.clickAddressDropdownWeb();
				Thread.sleep(2000);
				address.selectAddressWeb(testData.get("addressType"));
				address.enterPinWeb(testData.get("pinCode"));
				Thread.sleep(2000);
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
			customerprofile.ClickOnConfirmButton();
			dashboard.checkLoaderWeb();

		}

		// Nominee Details Page //
		dashboard.checkLoaderWeb();
		Thread.sleep(2000);
		nominee.enternomineefname(testData.get("nomineeFirstName"));
		nominee.enternomineelname(testData.get("nomineeLastName"));
		nominee.fillDOBdetailsNomineeWeb(testData.get("day"), testData.get("month"), testData.get("year"));
		nominee.Clicknomineegenderweb(testData.get("nomineegender"));
		nominee.SelectRelationshipwithProposerdropdownWeb(testData.get("relationship"));
		nominee.enternomineeshare(testData.get("nomineeshare"));

		String yr = testData.get("day") + "/" + testData.get("month") + "/" + testData.get("year");
		System.out.println(yr);

		// Define the date format //
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date birthDate = dateFormat.parse(yr);

		// Calculate the age //
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
				Thread.sleep(500);
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
				Thread.sleep(500);
			}
			TestUtil.scrollToElement(driver, getDriver().findElement(By.xpath("//div[text()='Hazardous Activities']")));
			if (testData.get("LifeStyleDetailsHZ").equalsIgnoreCase("Hazardous Activities")) {
				insurerlifestyle.selectHazardousActivityYESButton();
				insurerlifestyle.HazardousSelectOption1(testData.get("Hazardactivity"));
				insurerlifestyle.enteryerashazard(testData.get("MentionYears"));
				insurerlifestyle.HazardousSelectOption2(testData.get("HazardActivityBy"));
				Thread.sleep(500);
			}
			TestUtil.scrollTillEndOfPage(getDriver());
			if (testData.get("LifeStyleDetailsTrv").equalsIgnoreCase("Travel")) {
				insurerlifestyle.selectTraveloutsideYESButton();
				insurerlifestyle.TravelDetailstwelvemonth(testData.get("Country"), testData.get("City"), testData.get("DateofDept"), testData.get("DateofArrvl"), testData.get("Visatype"));
				Thread.sleep(500);
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
		}
			insupersonalhealth.ClickSaveContinuecapitalBtn(); //SAVE & CONTINUE button QA//
			dashboard.checkLoaderWeb();

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
		if (testData.get("IsFamilyMedicaldetails").equalsIgnoreCase("NO")) {
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

				if (testData.get("Diabetes").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsDiabetes();
					insurermedicalhistory.Clickondiabetestypeweb(testData.get("DiabetesType"));
					dashboard.checkLoaderWeb();
					wait.WaitTime(5);
					insurermedicalhistory.Clickondiabetessuffering();
					insurermedicalhistory.EnterdiabetesDateOfDiagnosis(testData.get("DiabDay"), testData.get("DiabMonth"), testData.get("DiabYear"));
					communicationdetails.clicksubmitBtn();
					dashboard.checkLoaderWeb();
					Thread.sleep(2000);
				}
				if (testData.get("HeartIssue").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsHeartIssue();
					insurermedicalhistory.Clickonheartissuetypeweb(testData.get("HeartIssueType"));
					insurermedicalhistory.EnterHeartIssueCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterHeartissueDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterHeartissueLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterHeartissueDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterHeartIssueDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("BreathingIssue").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsbreathIssue();
					insurermedicalhistory.Clickonbreathissuetypeweb(testData.get("BreathIssueType"));
					insurermedicalhistory.EnterBreathIssueCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterBreathissueDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterBreathissueLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterBreathissueDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterBreathIssueDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Ulcer").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsUlcer();
					insurermedicalhistory.Clickonulcertypeweb(testData.get("UlcerType"));
					insurermedicalhistory.EnterUlcerCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterUlcerDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterUlcerLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterUlcerDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterUlcerDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Paralysis").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsParalysis();
					insurermedicalhistory.Clickonparalysistypeweb(testData.get("ParalysisType"));
					insurermedicalhistory.EnterParalysisCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterParalysisDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterParalysisLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterParalysisDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterParalysisDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Kidney").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsKidney();
					insurermedicalhistory.Clickonkidneytypeweb(testData.get("KidneyType"));
					insurermedicalhistory.EnterKidneyCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterKidneyDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterKidneyLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterKidneyDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterKidneyDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Arthritis").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsArthritis();
					insurermedicalhistory.Clickonarthritistypeweb(testData.get("ArthritisType"));
					insurermedicalhistory.EnterArthritisCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterArtritisDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterArthritisLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterArthritisDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterArthritisDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("EyeEar").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsEyeEar();
					insurermedicalhistory.Clickoneyeeartypeweb(testData.get("EyeEarType"));
					insurermedicalhistory.EnterEyeEarCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterEyeEarDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterEyeEarLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterEyeEarDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterEyeEarDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Tumor").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsTumor();
					insurermedicalhistory.Clickontumortypeweb(testData.get("TumorType"));
					insurermedicalhistory.EnterTumorCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterTumorDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterTumorLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterTumorDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterTumorDetailsofHospitalization(testData.get("AFWdetails"));
				}
				if (testData.get("Others").equalsIgnoreCase("Yes")) {
					insurermedicalhistory.ClickonAilmentsOthers();
					insurermedicalhistory.Clickonothertypeweb(testData.get("OtherType"));
					insurermedicalhistory.EnterothersCurrentSymptoms(testData.get("AFWcurrentsymptoms"));
					insurermedicalhistory.EnterothersDoctorDetails(testData.get("AFWdoctordetails"));
					insurermedicalhistory.EnterothersLastConsultant(testData.get("LastConsultantDate"));
					insurermedicalhistory.EnterothersDignosis(testData.get("DiagnosisDate"));
					insurermedicalhistory.EnterothersDetailsofHospitalization(testData.get("AFWdetails"));
				}
			} else if (testData.get("IsAilments").equalsIgnoreCase("No")) {
				insurermedicalhistory.ClickonAilmentsNO();
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
			nriMandate.clickOnPlaceForSigningApplication(testData.get("placeOfSigningApplication")); // Place For Signing Application

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
			if ((testData.get("IsPanAvailable").equalsIgnoreCase("YES") && (testData.get("AddressLocation1").equalsIgnoreCase("International") && (testData.get("EditAddress").equalsIgnoreCase("YES"))) || (testData.get("IsPanAvailable").equalsIgnoreCase("NO") && (testData.get("AddressLocation1").equalsIgnoreCase("International"))))) {
				nriMandate.EnterResidantAddressOneWhileInIndiaWeb(testData.get("address1Nri"));
				nriMandate.EnterResidantAddressCityWhileInIndiaWeb(testData.get("cityNri"));
				nriMandate.EnterResidantAddressStateWhileInIndiaWeb(testData.get("stateNri"));
				nriMandate.EnterResidantAddressPinCodeWhileInIndiaWeb(testData.get("pinCodeNri"));
			}

			// Purpose of your stay abroad//
			nriMandate.clickOnPurposeOfStayAbroad(testData.get("purposeOfStayAbroad"));
			if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Student")) {
				nriMandate.enterStudentNatureOfStay(testData.get("studentNatureOfStayAbroad"));
			} else if (testData.get("purposeOfStayAbroad").equalsIgnoreCase("Others")) {
				nriMandate.enterSpecificNatureOfStayAbroad(testData.get("stayAbroadSpecificReason"));
			}
			nriMandate.enterIntendedDurationOfStayAbroad(testData.get("intendedDurationYear"), testData.get("intendedDurationMonth"));

			// Residence Address while in Abroad//
			if ((testData.get("IsPanAvailable").equalsIgnoreCase("YES") && (testData.get("AddressLocation1").equalsIgnoreCase("Indian") && (testData.get("EditAddress").equalsIgnoreCase("YES")))|| (testData.get("IsPanAvailable").equalsIgnoreCase("NO") && (testData.get("AddressLocation1").equalsIgnoreCase("Indian"))))) {
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
			}

			// Have you traveled over the last 12 months?//
			if (testData.get("travelledOverLast12Months").equalsIgnoreCase("Yes")) {
				nriMandate.clickOnTravelledLast12MonthButton(testData.get("travelledOverLast12Months"));
				nriMandate.enterCountryTravelledOverLast12Months(testData.get("countryTravelledLast12Months"));
				nriMandate.enterLast12MonthCity(testData.get("last12MonthCity"));
				nriMandate.enterLast12MonthsDepartDate(testData.get("lastTravelled12MonthsDepartDate"));
				nriMandate.enterLast12MonthsArrivalDate(testData.get("lastTravelled12MonthsArrivalDate"));
				nriMandate.selectVisaType(testData.get("lastTravelled12MonthsVisaType"));

				nriMandate.clickSaveButton();
			}

			// Are you planning to travel in next 12 months?//
			if (testData.get("IsTravel").equalsIgnoreCase("NO")) {

				if (testData.get("travelledOverNext12Months").equalsIgnoreCase("Yes")) {
					nriMandate.clickOnTravelledNext12MonthButton(testData.get("travelledOverNext12Months"));
					nriMandate.enterCountryTravelledOverNext12Months(testData.get("countryTravelledNext12Months"));
					nriMandate.enterNext12MonthCity(testData.get("Next12MonthCity"));
					nriMandate.enterNext12MonthsDepartDate(testData.get("nextTravelled12MonthsDepartDate"));
					nriMandate.enterNext12MonthsArrivalDate(testData.get("nextTravelled12MonthsArrivalDate"));
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
			nriMandate.clickOnNext();
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
		Thread.sleep(3000);
		rna.ClickOnProceedButtonWeb();
		dashboard.checkLoaderWeb();
		Thread.sleep(3000);


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
	     
//IAR PAGE
		 
		 if (testData.get("ChannelName").equalsIgnoreCase("DM") || testData.get("ChannelName").equalsIgnoreCase("FLS") || testData.get("ChannelName").equalsIgnoreCase("Adviser")) {
			  wait.WaitTime2();

	            if (testData.get("IsHaveYouPersonallyMet").equalsIgnoreCase("YES")) {
	            	IARpage.clickonHaveYouPersonallyMetNOWeb();
	            	IARpage.EnterHaveYouPersonallyMetWeb(testData.get("PleaseSpecify"));
	            }
	            if (testData.get("IsAreYouPersonallySatisfied").equalsIgnoreCase("YES")) {
	            	IARpage.clickonAreYouPersonallySatisfyNOWeb();
	            	IARpage.EnterAreYouPersonallySatisfyWeb(testData.get("PleaseSpecify"));
	            }
	            WebElement ScrollEle1 = getDriver().findElement(By.xpath("//div[contains(text(),'Have you personally met the life to be insured for this application?')]"));
	            TestUtil.scrollToElement(getDriver(), ScrollEle1);
	            IARpage.ClickOnHowDoyouKnowweb(testData.get("HowDoYouKnow"));
	            if (testData.get("HowDoYouKnow").equalsIgnoreCase("Others")) {
	            	IARpage.EnterOtherHowDoyouKnowweb(testData.get("PleaseSpecify"));
	            }

	            IARpage.EnterLifeToBeINSUREDPROPOSERyeardWeb(testData.get("LifeToBeInsuredYear"));
	            wait.WaitTime2();
	            IARpage.EnterLifeToBeINSUREDPROPOSERmonthWeb(testData.get("LifeToBeInsuredMonth"));
	            wait.WaitTime2();
	            if (testData.get("IsThreAnyPhysicalDefect").equalsIgnoreCase("YES")) {
	            	IARpage.clickonIsThereAnyPhysicalDefectWeb();
	            	IARpage.EnterIsThereAnyPhysicalDefectweb(testData.get("PleaseSpecify"));
	            }
	            if (testData.get("IsAreAwareofAnyinfo").equalsIgnoreCase("YES")) {
	            	IARpage.clickonIsAwareOfAnyInformationWeb();
	            	IARpage.EnterAreYouAwareOfAnyinformationweb(testData.get("PleaseSpecify"));
	            }
	            if (testData.get("IsHasAnyApplication").equalsIgnoreCase("YES")) {
	            	IARpage.clickonHasAnyApplicationWeb();
	            	IARpage.EnterHasAnyApplicationweb(testData.get("PleaseSpecify"));
	            }
	            if (testData.get("IsthereAnySpecific").equalsIgnoreCase("YES")) {
	            	IARpage.clickonIsthereAnySpecificWeb();
	                IARpage.EnterIsThereAnySpecificweb(testData.get("PleaseSpecify"));
	            }
	            TestUtil.scrollTillEndOfPage(driver);
	            wait.WaitTime2();
	            WebElement TopRightHeader =getDriver().findElement(By.xpath("//div[contains(@class,'header-content-no')]"));
	            String TextVal = TopRightHeader.getText();
	            TestUtil.verifybgColor(TopRightHeader, driver);
	            IARpage.ClickOnSearchImageBtn();
	            wait.WaitTime2();
	            IARpage.ClickSaveAndContinueButtonIARweb();
	            dashboard.checkLoaderWeb();
	            wait.WaitTime2();
	            IARpage.ClickOnCSEAlertOKButton();
	            dashboard.checkLoaderWeb();
	            wait.WaitTime2();
		 
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		// e-CDF //pending code 
		if(testData.get("username").equalsIgnoreCase("ZZ2027")){
//			TestUtil.scrollTillEndOfPage(getDriver());
//			customerprofile.cdnextbutton();
//			dashboard.checkLoaderWeb();
//			Thread.sleep(4000);
		} else{
			paymentpage.clickOnCheckBoxECDFweb();
			Thread.sleep(2000);
			TestUtil.scrollTillEndOfPage(driver);
			Thread.sleep(2000);
			paymentpage.clickOnSumitBTNECDFweb();
			dashboard.checkLoaderWeb();
			Thread.sleep(2000);
		}

		// Document Upload //
		List<WebElement> documentpageCount = getDriver().findElements(By.xpath("(//div[@role='tablist'])[2]//button//span[1]"));
		int docSize = documentpageCount.size();
		for (int i = 0; i < docSize; i++) {
			String str = documentpageCount.get(i).getText();

			if (str.equalsIgnoreCase("Identity Proof")) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO") || testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
					if (testData.get("IsPanAvailabel").equalsIgnoreCase("NO") || testData.get("PanNameEdit").equalsIgnoreCase("YES") || testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
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
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("NO")
						|| testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
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
				wait.WaitTime2();
				wait.WaitTime2();
				documentpage.clickOnSumbitweb();
				dashboard.checkLoaderWeb();
				wait.WaitTime2();

			}
			if (str.equalsIgnoreCase("E-NACH Registration")) {
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
		documentpage.ClickOnCSEAlertOKButton();
		dashboard.checkLoaderWeb();
	}

}
