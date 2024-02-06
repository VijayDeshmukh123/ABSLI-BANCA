package com.absli.modules;

import static Utils.CommonUtils.calculateAge;
import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

public class PaymentModule {
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

	public void Paymentmodule(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

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
		  
		
		 if (testData.get("IsPayment").equalsIgnoreCase("YES")) {

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
	            if (testData.get("ChannelName").equalsIgnoreCase("DCB")) {

					if (testData.get("PaymentType").equalsIgnoreCase("OTC_DCB")) {

						if (testData.get("IsSelectWinBackPayment").equalsIgnoreCase("YES")) {

							TestUtil.scrollTillEndOfPage(driver);
							paymentpage.ClickOnWinBackModeweb();
							wait.WaitTime2();
							for (int j = 0; j <= 0; j++) {
								TestUtil.scrollTillEndOfPage(driver);
								paymentpage.EnterPolicyNOOnWinBackWeb(testData.get("WBplicyNo"));
								wait.WaitTime2();
								paymentpage.EnterAmountOnWinBackWeb(testData.get("Wbamount"));
								wait.WaitTime2();
								if (j == 0) {
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
						paymentpage.ClickOnOTCModeDCB();

						Thread.sleep(2000);
						TestUtil.scrollTillEndOfPage(driver);
						Thread.sleep(2000);

						paymentpage.ClickOnOTCSubmitBTNDCB();
						Thread.sleep(5000);
						paymentpage.ClickOnOTCSubmitBTNDCB();//this is issue
						paymentpage.NEXTbutton();
						Thread.sleep(4000);
						paymentpage.NEXTbutton();//THIS IS ISSUE
					}
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
				

	            if(testData.get("ChannelName").equalsIgnoreCase("DBS")) {
	            	
	        	if (testData.get("PaymentType").equalsIgnoreCase("RTGS")) {

	    			paymentpage.ClickOnRTGSModeweb();

	    			TestUtil.scrollTillEndOfPage(driver);
	    			paymentpage.clickOnRTGSCheckboxWeb();
	    		    paymentpage.clickOnRTGSpaymentSubmitBTNWeb();
	    			getDriver().navigate().refresh();
	    			Thread.sleep(5000);

	    			customerprofile.cdnextbutton(); // customer details NEXT button(QA)
	    			dashboard.checkLoaderWeb();
	    			Thread.sleep(4000);

	    		}
	            }
	            
	            
	        } else {
	            paymentpage.ClickDoItLatterOnPaymentweb();
	        }
	}
}
