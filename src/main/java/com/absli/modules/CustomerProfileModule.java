package com.absli.modules;

import java.util.HashMap;

import com.absli.base.TestBase;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.CommonUtils;
import Utils.TestUtil;

public class CustomerProfileModule extends TestBase{

	static Dashboard dashboard;
	static WaitUtils wait;
	static CustomerProfile customerprofile;

	public static PropertiesUtils prop;
	static CommonUtils commonUtils;


	public static void CustomerProfilemodule( HashMap<String, String> testData) throws Exception {

		dashboard = new Dashboard(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		commonUtils = new CommonUtils();
		dashboard.checkLoaderWeb();

	dashboard.checkLoaderWeb();
	TestUtil.scrollTillEndOfPage(getDriver());
	
	
	
	if (testData.get("ProposerInsuredSame").equalsIgnoreCase("YES")) {
		customerprofile.ClickOnIsproposerInsuredSameYESButton();
		// customerprofile.ClickOnIsproposerInsuredSameYESButton();

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
//		  String gstWaiver = testData.get("propNRIGSTwavier");
//		  
//		if (gstWaiver.equalsIgnoreCase("YES")) {
//			selectRadioButton(customerprofile.gstWaiver(gstWaiver));
//          } else if (gstWaiver.equalsIgnoreCase("NO")) {
//        	  selectRadioButton(customerprofile.gstWaiver(gstWaiver));
//
//          } else {
//              Assert.fail("enter correct value for the GST waiver");
//          }
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
				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.ClickOnConfirmButton();// this is bug
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
				customerprofile.ClickOnConfirmButton();// this is bug
				dashboard.checkLoaderWeb();
				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.ClickOnConfirmButton();// this is bug
				dashboard.checkLoaderWeb();

			} else {
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();
				customerprofile.ClickOnConfirmButton();// this is bug
				dashboard.checkLoaderWeb();

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

		if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
			customerprofile.ClickOnAadharCardButton();
			customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));

			// customerProfile.EnterProposerOTPWeb("");
			// customerprofile.ClickonGetOTPButton();
			dashboard.checkLoaderWeb();
			TestUtil.scrollTillEndOfPage(getDriver());

			customerprofile.cdnextbutton();
			dashboard.checkLoaderWeb();

			TestUtil.scrollTillEndOfPage(getDriver());

			if (testData.get("PanNameEdit").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEditButton();

				customerprofile.ClickOnEditAlerPopUp();
				dashboard.checkLoaderWeb();

				customerprofile.ClearEditPanNameWeb();
				TestUtil.scrollTillEndOfPage(getDriver());
				Thread.sleep(2000);
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

			} else if (testData.get("PanDOBEdit").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEditButton();

				customerprofile.ClickOnEditAlerPopUp();
				dashboard.checkLoaderWeb();

				customerprofile.ClearEditProposerDOBWeb("10101985");
				TestUtil.scrollTillEndOfPage(getDriver());
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();

			} else {
				customerprofile.ClickOnConfirmButton();
				dashboard.checkLoaderWeb();

			}

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
			TestUtil.scrollTillEndOfPage(getDriver());
			customerprofile.ClickOnConfirmButton();// PLZ COMFIRM THIS IS BUG
			dashboard.checkLoaderWeb();

		}

	}
	}
//===================================Below code is Customer Profile DCB Bank=================================
	
	public static void CustomerProfilemodule_DCB(HashMap<String, String> testData) throws Exception {

		dashboard = new Dashboard(getDriver());
		customerprofile = new CustomerProfile(getDriver());
		commonUtils = new CommonUtils();
		dashboard.checkLoaderWeb();

		dashboard.checkLoaderWeb();
		TestUtil.scrollTillEndOfPage(getDriver());

		if (testData.get("ProposerInsuredSame").equalsIgnoreCase("YES")) {
			customerprofile.ClickOnIsproposerInsuredSameYESButton();
			// customerprofile.ClickOnIsproposerInsuredSameYESButton();

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
//		  String gstWaiver = testData.get("propNRIGSTwavier");
//		  
//		if (gstWaiver.equalsIgnoreCase("YES")) {
//			selectRadioButton(customerprofile.gstWaiver(gstWaiver));
//          } else if (gstWaiver.equalsIgnoreCase("NO")) {
//        	  selectRadioButton(customerprofile.gstWaiver(gstWaiver));
//
//          } else {
//              Assert.fail("enter correct value for the GST waiver");
//          }
		}

		if (testData.get("IsPanAvailable").equalsIgnoreCase("YES")) {
			// commonUtils.EnterText(getDriver(), customerprofile.enterpanNumberQAWeb(),testData.get("ProposerPanNumber")); // QA
			wait.WaitTime2();
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

			} catch (Exception e) {
				if (testData.get("IsAadhaarCard").equalsIgnoreCase("YES")) {
					customerprofile.ClickOnAadharCardButton();
					customerprofile.EnterProposerAadharCardNoWeb(testData.get("AadharCardNo"));
					// customerprofile.EnterProposerOTPWeb("");
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				} else if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
					//customerprofile.ClickOnEnterManualButton();
					//customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();
					if(testData.get("proposer_first_name").isEmpty()) {
					customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
					}
					//customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
					if(testData.get("proposer_last_name").isEmpty()) {
					customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));
					}
					//customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));

					customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
					customerprofile.cdnextbutton();
					dashboard.checkLoaderWeb();

				}
			}
		} else {
			//customerprofile.ClickOnProposerCheckBox();
			
			customerprofile.clickOnProposerIAgreeCheckboxWeb();
			customerprofile.cpnextbutton();
			dashboard.checkLoaderWeb();

			  if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnEnterManualButton();
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				if(testData.get("proposer_first_name").isEmpty()) {
				customerprofile.EnterFirstNameInsuredweb(testData.get("ProposerName"));
				}
				customerprofile.EnterMiddleNameInsuredweb(testData.get("ProposerMiddleName"));
				if(testData.get("proposer_last_name").isEmpty()) {
				customerprofile.EnterLastNameInsuredweb(testData.get("ProposerLastName"));
				}
				//customerprofile.clickOnGenderBtnWeb(testData.get("ProposerGender"));

				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				
			}

		}
	}
	
	//===================================Below code is Customer Profile AXIS Bank=================================
	
		public static void CustomerProfilemodule_AXIS(HashMap<String, String> testData) throws Exception {

			dashboard = new Dashboard(getDriver());
			customerprofile = new CustomerProfile(getDriver());
			commonUtils = new CommonUtils();
			dashboard.checkLoaderWeb();

			dashboard.checkLoaderWeb();
			TestUtil.scrollTillEndOfPage(getDriver());

			if (testData.get("ProposerInsuredSame").equalsIgnoreCase("YES")) {
				customerprofile.ClickOnIsproposerInsuredSameYESButton();
				// customerprofile.ClickOnIsproposerInsuredSameYESButton();

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
//			  String gstWaiver = testData.get("propNRIGSTwavier");
//			  
//			if (gstWaiver.equalsIgnoreCase("YES")) {
//				selectRadioButton(customerprofile.gstWaiver(gstWaiver));
//	          } else if (gstWaiver.equalsIgnoreCase("NO")) {
//	        	  selectRadioButton(customerprofile.gstWaiver(gstWaiver));
	//
//	          } else {
//	              Assert.fail("enter correct value for the GST waiver");
//	          }
			}

			if (testData.get("IsPanAvailable").equalsIgnoreCase("YES")) {
				// commonUtils.EnterText(getDriver(), customerprofile.enterpanNumberQAWeb(),testData.get("ProposerPanNumber")); // QA
				wait.WaitTime2();
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
						

					

		}else {
			//customerprofile.ClickOnProposerCheckBox();
			
			customerprofile.clickOnProposerIAgreeCheckboxWeb();
			customerprofile.cpnextbutton();
			dashboard.checkLoaderWeb();

			  if (testData.get("IsEnterManual").equalsIgnoreCase("YES")) {
				
				customerprofile.ChangeSalutionTitleInsuredWeb(testData.get("ProposerSalutation"));
				customerprofile.cdnextbutton();
				dashboard.checkLoaderWeb();
				
			}
		
		
		}
		}
	
}
