package com.absli.pageObjects;

import com.absli.Listner.AllureListener;
import com.absli.base.*;

import com.absli.utils.WaitUtils;

import com.aventstack.extentreports.Status;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class PaymentPage extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    //SASKHI
    @FindBy(xpath = "(//input[@type='file'])[1]")
    private WebElement uploadcheque;
    @FindBy(xpath = "(//input[@type='file'])[2]")
    private WebElement uploadFTimg;
    @FindBy(xpath = "//input[@id='chequeDDNo']")
    private WebElement cheqddno;
    @FindBy(xpath = "(//input[@id='chequeDDNo'])[1]")
    private WebElement JournalNo;
    @FindBy(xpath = "//input[@id='dd']")
    private WebElement cheqddday;
    @FindBy(xpath = "//input[@id='mm']")
    private WebElement cheddmonth;
    @FindBy(xpath = "//input[@id='yy']")
    private WebElement cheqddyear;
    @FindBy(xpath = "(//input[@id='dd'])[1]")
    private WebElement cheqddday1;
    @FindBy(xpath = "(//input[@id='mm'])[1]")
    private WebElement cheddmonth1;
    @FindBy(xpath = "(//input[@id='yy'])[1]")
    private WebElement cheqddyear1;
    @FindBy(xpath = "//input[@id='ifscCode']")
    private WebElement cheqddifsc;
    @FindBy(xpath = "(//span[text()='Submit'])[1]")
    private WebElement cheqddsubmit;
    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    private WebElement nextbutton;
    @FindBy(xpath = "//span[contains(text(), 'NEXT')]")
    private WebElement NEXTbutton;
    
    @FindBy(xpath = "//div[contains(text(),'CHEQUE / DEMAND DRAFT')]")
    private WebElement cheqddtab;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement declarationdd;
    @FindBy(xpath = "//button[@name='DO IT LATER']")
    private WebElement paydoitlater;
    @FindBy(xpath = "(//div[contains(text(),'FUND TRANSFER')])[1]")
    private WebElement fundft;
    @FindBy(xpath = "//input[@name='policyDetails[0].policyNo']")
    private WebElement ftpolicy;
    @FindBy(xpath = "//input[@name='policyDetails[0].policyAmount']")
    private WebElement ftamount;
    @FindBy(xpath = "//button//span[contains(text(), 'SAVE')]")
    private WebElement fundsave;
    @FindBy(xpath = "//button//span[contains(text(), 'REDEEM')]")
    private WebElement fundredeem;
    @FindBy(xpath = "//input[@id='arBranchName']")
    private WebElement SelectBranchDropDown;
    
    //NetBanking Vijay========
    
    @FindBy(xpath = "//div[contains(text(),'Net Banking')]")
    private WebElement NetBanking;
    
    @FindBy(xpath = "//div[contains(text(),'Credit Card')]")
    private WebElement CreditCard;
    
    @FindBy(xpath = "//div[contains(text(),'Debit Card')]")
    private WebElement DebitCard;
    
    @FindBy(xpath = "//span[contains(text(),'Pay Now')]")
    private WebElement PayNowBTN;
    
    
    
    @FindBy(xpath = "//div[text()='Demand Draft']")
    private WebElement DDBTN;
    

    @FindBy(xpath = "//div[text()='Cheque']")
    private WebElement ChequeBTN;

    @FindBy(xpath = "//div[contains(text(),'RTGS/SWIFT')]")
    private WebElement RtgsButton;
    @FindBy(xpath = "//div[contains(text(),'Direct Debit')]")
    private WebElement DirectDebit;
    @FindBy(xpath = "//div[contains(text(),'OVER THE COUNTER (OTC)')]")
    private WebElement OTCBtn;
    @FindBy(xpath = "//div[contains(text(),'OTC / EASY PAY')]")
    private WebElement OTCBtnDCB;
    @FindBy(xpath = "//input[contains(@id,'isRTGSChecked')]")
    private WebElement RtgsChechBox;
    @FindBy(xpath = "(//span[contains(text(),'Submit')])[1]")
    private WebElement RtgsSubmitBTN;
    
    @FindBy(xpath = "//div[text()='Yes']")
    private WebElement tpdBTN;
    
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement AlertPop;
    
    @FindBy(xpath = "//input[@id='yesToAll']")
    private WebElement eCDFyesToAll;
    
    @FindBy(xpath = "//button[@name='SUBMIT']")
    private WebElement eCDFSUBMITbutton;
    
    @FindBy(xpath = "//div[contains(text(),'WIN BACK')]")
    private WebElement WIN_BACK_BUTTON;
    
    @FindBy(xpath = "//span[text()='REDEEM']")
    private WebElement REDEEM_BUTTON;
    
    @FindBy(xpath = "(//span[text()='SAVE'])[1]")
    private WebElement SAVE_BUTTON;
    
    @FindBy(xpath = "//input[contains(@name,'policyDetails[0].policyAmount')]")
    private WebElement policyAmount;
    
    @FindBy(xpath = "//input[contains(@name,'policyDetails[0].policyNo')]")
    private WebElement policyNo;
    
    @FindBy(xpath = "(//span[contains(text(),'Submit')])[3]")
    private WebElement OTC_SUBMIT;
    @FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
    private WebElement OTC_SUBMIT1;
    @FindBy(xpath = "(//span[contains(text(),'DO IT LATER')])")
    private WebElement DOITLATTER;
    

    @FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
    private WebElement CASH_SUBMIT;
    
    @FindBy(xpath = "//div[contains(text(),'CASH')]")
    private WebElement CASH_BUTTON;

public void ClickOnCashModeweb() {
	 wait.waitforElementToBeClickable(getDriver(), CASH_BUTTON, 10);
    if(CASH_BUTTON.isDisplayed()) {
    	CASH_BUTTON.click();
    	Allure.step ("Click Or Select CASH  Payment Mode ");
    }else {
    	Allure.step  ("Payment Mode button is not display ");
    }
}

public void UploadDECLARATIONFORMImgWEB() throws InterruptedException, IOException {
	
	 
	 WebElement SelectVal=getDriver().findElement(By.xpath("//input[@type='file']"));
		  String destination= System.getProperty("user.dir")+"//Document//download.jpg";
	 
		 
		 SelectVal.sendKeys(destination);
		 // .log(Status.INFO, "Failed to upload file...Upload Button is not Display");
	
	   
    
   
}

public void ClickOnCashSubmitBTNweb() {
	 wait.waitforElementToBeClickable(getDriver(), CASH_SUBMIT, 10);
    if(CASH_SUBMIT.isDisplayed()) {
    	CASH_SUBMIT.click();
   	 Allure.step ("Click on Submit Button On Cash Payment ");
    }else {
   	 Allure.step ("Cash Submit Button is not display ");
    }
}


public void ClickDoItLatterOnPaymentweb() {
	 wait.waitforElementToBeClickable(getDriver(), DOITLATTER, 10);
    if(DOITLATTER.isDisplayed()) {
    	DOITLATTER.click();
    	 Allure.step  ("Click on Submit Button On OTC Payment ");
    }else {
    	 Allure.step  ("OTC Submit Button is not display ");
    }
}


public void ClickOnOTCSubmitBTNweb() {
	 wait.waitforElementToBeClickable(getDriver(), OTC_SUBMIT, 10);
    if(OTC_SUBMIT.isDisplayed()) {
    	OTC_SUBMIT.click();
    	 Allure.step ("Click on Submit Button On OTC Payment ");
    }else {
    	 Allure.step  ("OTC Submit Button is not display ");
    }
}


public void ClickOnOTCSubmitBTNDCB() {
	 wait.waitforElementToBeClickable(getDriver(), OTC_SUBMIT1, 10);
    if(OTC_SUBMIT1.isDisplayed()) {
    	OTC_SUBMIT1.click();
    	 Allure.step ("Click on Submit Button On OTC Payment ");
    }else {
    	 Allure.step  ("OTC Submit Button is not display ");
    }
}

public void ClickOnWinBackREDEEMBTNweb() {
	 wait.waitforElementToBeClickable(getDriver(), REDEEM_BUTTON, 10);
    if(REDEEM_BUTTON.isDisplayed()) {
    	REDEEM_BUTTON.click();
    	 Allure.step  ("Click on REDEEM Button On Win Back Payment ");
    }else {
    	 Allure.step ("Win Back REDEEM Button is not display ");
    }
}

public void ClickOnWinBackSaveBTNweb() {
	 wait.waitforElementToBeClickable(getDriver(), SAVE_BUTTON, 10);
    if(SAVE_BUTTON.isDisplayed()) {
    	SAVE_BUTTON.click();
    	 Allure.step  ("Click on Save Button On Win Back Payment ");
    }else {
    	 Allure.step  ("Win Back Save Button is not display ");
    }
}

public void EnterAmountOnWinBackWeb(String args) {
	 wait.waitforElementToBeClickable(getDriver(), policyAmount, 10);
	     if(policyAmount.isDisplayed()) {
	    	 policyAmount.click();
	    	 policyAmount.sendKeys(args);
	    	 Allure.step  ("Enter  Amount  On WinBack Payment >>>"+args);
	     }else {
	    	 Allure.step (" Amount NO Is Not Display");
	    }
	    	
	    }


public void EnterPolicyNOOnWinBackWeb(String args) {
	 wait.waitforElementToBeClickable(getDriver(), policyNo, 10);
	     if(policyNo.isDisplayed()) {
	    	 policyNo.click();
	    	 policyNo.sendKeys(args);
	    	 Allure.step  ("Enter  Policy Number On WinBack Payment  >>>"+args);
	     }else {
	    	 Allure.step  (" Policy NO Is Not Display");
	    }
	     
}


public void ClickOnWinBackModeweb() {
	 wait.waitforElementToBeClickable(getDriver(), WIN_BACK_BUTTON, 10);
    if(WIN_BACK_BUTTON.isDisplayed()) {
    	WIN_BACK_BUTTON.click();
    	 Allure.step ("Click Or Select CHEQUE / DEMAND DRAFT  Payment Mode ");
    }else {
    	 Allure.step ("Payment Mode button is not display ");
    }
}


    public void clickOnSumitBTNECDFweb() throws InterruptedException {
    	 wait.waitforElementToBeClickable(getDriver(), eCDFSUBMITbutton, 10);
        if(eCDFSUBMITbutton.isDisplayed()) {
        	eCDFSUBMITbutton.click();
        	 Allure.step ("Click on Submit Button ");
        }else {
        	eCDFSUBMITbutton.click();
        	 Allure.step ("Click on Submit Button ");
        }
    }

    
//    public void clickOnCheckBoxECDFweb() throws InterruptedException {
//    	 wait.waitforElementToBeClickable(getDriver(), eCDFyesToAll, 10);
//        if(eCDFyesToAll.isEnabled()) {
//        	eCDFyesToAll.click();
//        	 Allure.step ("Click On ECDF Checkbox ");
//        }else {
//        	eCDFyesToAll.click();
//        	 Allure.step("ECDF Checkbox is not display ");
//        }
//    }
    
    public void clickOnCheckBoxECDFweb() throws InterruptedException {
        WebElement identityBTN=getDriver().findElement(By.xpath("//input[@id='yesToAll']"));
       // waitUtils.waitForElementToBeVisibleweb(WebDriverFactoryStaticThreadLocal.getDriver(), identityBTN, 20, "Element is Not Display");
        if(identityBTN.isEnabled()) {
        	identityBTN.click();
          // // .log(Status.INFO, "Click On ECDF Checkbox ");
        }else {
        	identityBTN.click();
        	//// .log(Status.INFO, "ECDF Checkbox is not display ");
        }
    }
    
    public void UploadChequeAndDDImgweb() throws InterruptedException{
    	 wait.waitforElementToBeClickable(getDriver(), uploadcheque, 20);
        String destination = System.getProperty("user.dir") + "//Document//download.jpg";
        wait.WaitTime(2);
        uploadcheque.sendKeys(destination);
        Allure.step( "Failed to upload file...Upload Button is not Display");
    }

public void ClickDDBTNweb() throws InterruptedException {
	 wait.waitforElementToBeClickable(getDriver(), DDBTN, 10);
	if(DDBTN.isDisplayed()) {
	   DDBTN.click();
       // .log(Status.INFO, "Click   On CDD Payment ");
   }else {
   	// .log(Status.FAIL, "DD  Button  is not display ");
   }
}


public void ClickChequeBTNweb() throws InterruptedException {
	 wait.waitforElementToBeClickable(getDriver(), ChequeBTN, 10);
	if(ChequeBTN.isDisplayed()) {
		ChequeBTN.click();
       // .log(Status.INFO, "Click   On cheque button  ");
   }else {
   	// .log(Status.FAIL, "DD  Button  is not display ");
   }
}
    public void EnterChequeDDNoWeb(String ChequeDDNo) {
        wait.waitForElementToBeVisibleweb(getDriver(), cheqddno, 20, "Element is Not Display");
        if(cheqddno.isDisplayed()) {
            cheqddno.sendKeys(ChequeDDNo);
            Allure.step("Enter Cheque No OR DD No As=====>"+ChequeDDNo);
        }else {
            Allure.step( " Cheque Or Demand Draft No is not display ");
        }
    }
    public void EnterJounralNoWeb(String ChequeDDNo) {
        wait.waitForElementToBeVisibleweb(getDriver(), JournalNo, 20, "Element is Not Display");
        if(JournalNo.isDisplayed()) {
        	JournalNo.sendKeys(ChequeDDNo);
            Allure.step("Enter Jouranal No As=====>"+ChequeDDNo);
        }else {
            Allure.step( " Jouranal No is not display ");
        }
    }

    public void EnterDDMMYYONCDDWeb(String CDDday,String CDDMonth,String CDDYear ) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), cheqddday, 10);
        Thread.sleep(2000);
        cheqddday.click();
        cheqddday.sendKeys(CDDday);
        Allure.step( "Enter Cheque Date On(day) As=====> "+CDDday);
        Thread.sleep(2000);
        wait.waitforElementToBeClickable(getDriver(),cheddmonth,100);
        Thread.sleep(2000);
        cheddmonth.click();
        cheddmonth.sendKeys(CDDMonth);
        Allure.step( "Enter Cheque Date On (month) As=====> "+CDDMonth);
        Thread.sleep(2000);
        cheqddyear.click();
        cheqddyear.sendKeys(CDDYear);
        Allure.step("Enter Cheque Date On (year) As=====> "+CDDYear);
        Thread.sleep(2000);
    }
    public void EnterDDMMYYONjournalWeb(String CDDday,String CDDMonth,String CDDYear ) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), cheqddday1, 10);
        Thread.sleep(2000);
        cheqddday1.click();
        cheqddday1.sendKeys(CDDday);
        Allure.step( "Enter Jouranal Date on (day) As=====> "+CDDday);
        Thread.sleep(2000);
        wait.waitforElementToBeClickable(getDriver(),cheddmonth1,100);
        Thread.sleep(2000);
        cheddmonth1.click();
        cheddmonth1.sendKeys(CDDMonth);
        Allure.step( "Enter Jouranal Date On (month) As=====> "+CDDMonth);
        Thread.sleep(2000);
        cheqddyear1.click();
        cheqddyear1.sendKeys(CDDYear);
        Allure.step("Enter Jouranal Date On (year) As=====> "+CDDYear);
        Thread.sleep(2000);
    }

    public void EnterIFSCCodeOnCDDWeb(String CDDIFSCcode) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cheqddifsc, 20, "Element is Not Display");
        if(cheqddifsc.isDisplayed()) {
            cheqddifsc.click();
            Thread.sleep(1000);
            cheqddifsc.sendKeys(CDDIFSCcode);
           Allure.step( "Enter  IFSC Code As >>>"+CDDIFSCcode);
        }else {
            Allure.step(" IFSC Filed Is Not Display");
        }
    }
    public void ClickCDDPaymentSubmitBTNweb() throws InterruptedException {
        TestUtil.scrollToElement(getDriver(),getDriver().findElement(By.xpath("(//span[text()='Submit'])[1]")));
        TestUtil.verifybgColor(cheqddsubmit, driver);
        if(cheqddsubmit.isDisplayed()) {
            cheqddsubmit.click();
           Allure.step("Click on Submit On CDD Payment ");
        }else {
           Allure.step( "Submit  Button On CDD Payment is not display ");
        }
    }
    public void Nextbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), nextbutton, 10, "Element is Not Display");
        if (nextbutton.isEnabled()) {
            nextbutton.click();
            Allure.step("Clicked on next button on payment");
        } else {
            System.out.println("next button not visible");
        }
    }
    public void NEXTbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), NEXTbutton, 10, "Element is Not Display");
        if (NEXTbutton.isEnabled()) {
        	NEXTbutton.click();
            Allure.step("Clicked on next button on payment");
        } else {
            System.out.println("next button not visible");
        }
    }

    public void UploadDECLARATIONFORMImgweb() throws InterruptedException{
        String destination= System.getProperty("user.dir")+"\\Document\\download.jpg";
        declarationdd.sendKeys(destination);
        Allure.step( "Failed to upload file...Upload Button is not Display");
    }

    public void ClickOnChequeAndDDModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), cheqddtab, 20, "Element is Not Display");
        if(cheqddtab.isDisplayed()) {
            cheqddtab.click();
            Allure.step("Click Or Select CHEQUE / DEMAND DRAFT  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    
    public void ClickOnBranchdepositDropDown(String val) throws InterruptedException {
//    	   wait.waitForElementToBeVisibleweb(getDriver(), SelectBranchDropDown, 10, "Element is Not Display");
//    	 if (SelectBranchDropDown.isDisplayed()) {
//    		 SelectBranchDropDown.click();
//             Allure.step("Clicked on Select Branch DropDown button on Payment");
//         } else {
//             System.out.println("do it later button not visible");
//         }
    	
    	
      //  WebElement PaymentBTN=getDriver().findElement(By.xpath("//input[contains(@value,'"+val +"')]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectBranchDropDown, 10, "Element is Not Display");
        if(SelectBranchDropDown.isDisplayed()) {
        	SelectBranchDropDown.sendKeys(val);
			 Thread.sleep(2000);
			 SelectBranchDropDown.sendKeys(Keys.ARROW_DOWN);
			 SelectBranchDropDown.sendKeys(Keys.ENTER);
        	  Allure.step ("Click Or Select deposit the cheque at other branch  As=====>"+val);
        }else {
        	// .log(Status.FAIL, "Payment Mode button is not display ");
        }
    }
    public void ClickpaymentDoitLaterbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), paydoitlater, 10, "Element is Not Display");
        if (paydoitlater.isDisplayed()) {
            paydoitlater.click();
            Allure.step("Clicked on do it later button on Payment");
        } else {
            System.out.println("do it later button not visible");
        }
    }

    ///////////////////////////// Fund Transfer /////////////////////////////////////////////////////////

    public void ClickOnFundTransferModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fundft, 20, "Element is Not Display");
        if(fundft.isDisplayed()) {
            fundft.click();
            Allure.step("Click On Fund Transfer Payment Mode ");
        }else {
            Allure.step( "Payment Mode button is not display ");
        }
    }

    public void UploadFundtransferImgweb() throws InterruptedException{
        String destination = System.getProperty("user.dir") + "//Document//download.jpg";
        wait.WaitTime(2);
        uploadFTimg.sendKeys(destination);
        Allure.step( "Failed to upload file...Upload Button is not Display");
    }

    public void EnterpolicyNumberFTWeb(String PolicyNumber) {
        wait.waitForElementToBeVisibleweb(getDriver(), ftpolicy, 20, "Element is Not Display");
        if(ftpolicy.isDisplayed()) {
            ftpolicy.click();
            ftpolicy.sendKeys(PolicyNumber);
            Allure.step( "Enter PolicyNumber As >>>"+PolicyNumber);
        }else {
            Allure.step(" Policy Number Filed Is Not Display");
        }
    }
    public void EnterAmountFTWeb(String BalamountValue) {
        wait.waitForElementToBeVisibleweb(getDriver(), ftamount, 20, "Element is Not Display");
        if(ftamount.isDisplayed()) {
            ftamount.click();
            ftamount.sendKeys(BalamountValue);
            Allure.step( "Enter Amount FT As >>>"+BalamountValue);
        }else {
            Allure.step(" Amount FT Filed Is Not Display");
        }
    }
    public void ClickOnFTsavebuttonweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fundsave, 20, "Element is Not Display");
        if(fundsave.isDisplayed()) {
            fundsave.click();
            Allure.step("Click On Fund Transfer Save Button");
        }else {
            Allure.step( "Fund Transfer Save button is not display ");
        }
    }
    public void ClickOnFTredeembuttonweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fundredeem, 20, "Element is Not Display");
        if(fundredeem.isDisplayed()) {
            fundredeem.click();
            Allure.step("Click On Fund Transfer REDEEM Button");
        }else {
            Allure.step( "Fund Transfer REDEEM button is not display ");
        }
    }
//======================================NetBanking Vijay=================
    public void ClickOnNetBankingModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), NetBanking, 5, "Element is Not Display");
        if(NetBanking.isDisplayed()) {
        	NetBanking.click();
            Allure.step("Click Or Select Net Banking  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }

    public void ClickOnCreditCardModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), CreditCard, 5, "Element is Not Display");
        if(CreditCard.isDisplayed()) {
        	CreditCard.click();
            Allure.step("Click Or Select Credit card Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnDebitCardModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), DebitCard, 5, "Element is Not Display");
        if(DebitCard.isDisplayed()) {
        	DebitCard.click();
            Allure.step("Click Or SelectDebit card Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnPaymentPayNowBTNweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), PayNowBTN, 5, "Element is Not Display");
        if(PayNowBTN.isDisplayed()) {
        	PayNowBTN.click();
            Allure.step("Click Or SelectDebit card Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }

    public void ClickOnRTGSModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), RtgsButton, 20, "Element is Not Display");
        if(RtgsButton.isDisplayed()) {
        	RtgsButton.click();
            Allure.step("Click Or Select RTGS  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnDirectDebitweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), DirectDebit, 20, "Element is Not Display");
        if(DirectDebit.isDisplayed()) {
        	DirectDebit.click();
            Allure.step("Click Or Select Direct Debit  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnOTCModeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), OTCBtn, 20, "Element is Not Display");
        if(OTCBtn.isDisplayed()) {
        	OTCBtn.click();
            Allure.step("Click Or Select OTC  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void ClickOnOTCModeDCB() {
        wait.waitForElementToBeVisibleweb(getDriver(), OTCBtnDCB, 20, "Element is Not Display");
        if(OTCBtnDCB.isDisplayed()) {
        	OTCBtnDCB.click();
            Allure.step("Click Or Select OTC  Payment Mode ");
        }else {
           Allure.step( "Payment Mode button is not display ");
        }
    }
    public void clickOnRTGSCheckboxWeb() {
    	
    	 wait.waitForElementToBeVisibleweb(getDriver(), RtgsChechBox, 20, "Element is Not Display");
		if (RtgsChechBox.isEnabled()) {
			RtgsChechBox.click();
			 Allure.step( "Click on RTGS Checkbox");
        } else {
			 // .log(Status.FAIL, "Checkbox is Not Enable");
		}

	}
    public void clickOnRTGSpaymentSubmitBTNWeb() {
   	 wait.waitForElementToBeVisibleweb(getDriver(), RtgsSubmitBTN, 20, "Element is Not Display");
		if (RtgsSubmitBTN.isDisplayed()) {
			
			RtgsSubmitBTN.click();
			 Allure.step( "Click on RTGS Submit Button");
			
		} else {
			 // .log(Status.FAIL, "Submit BTN is Not Enable");
		}

	}
    public void ClickonChequeBelongtoThirdParty() throws InterruptedException {
    	wait.waitForElementToBeVisibleweb(getDriver(), tpdBTN, 20, "Element is Not Display");
        if(tpdBTN.isDisplayed()) {
        	tpdBTN.click();
           Allure.step("Click on TPD yes btn On CDD Payment ");
        }else {
           Allure.step( " TPD yes btn On CDD Payment is not display ");
        }
    }
    public void ClickonSubmitBtnAlertPopup() throws InterruptedException {
     	wait.waitForElementToBeVisibleweb(getDriver(), AlertPop, 20, "Element is Not Display");
         if(AlertPop.isDisplayed()) {
        	 AlertPop.click();
            Allure.step("Click on TPD yes btn On CDD Payment ");
         }else {
            Allure.step( " TPD yes btn On CDD Payment is not display ");
         }
     }


     // online payment //

    @FindBy(xpath = "//a[@id='ctl00_m_g_efb984f1_db26_4182_8e84_294c5259aaa6_ctl00_lnkDummy']")
    private WebElement dummypayment;
    @FindBy(xpath = "//input[@name='ctl00$m$g_efb984f1_db26_4182_8e84_294c5259aaa6$ctl00$cbDisclaimer']")
    private WebElement herbycheck;
    @FindBy(xpath = "//input[@name='ctl00$m$g_efb984f1_db26_4182_8e84_294c5259aaa6$ctl00$imgbtnSubmit']")
    private WebElement onlsubmitbtn;
    @FindBy(xpath = "//input[@name='ctl00$m$g_4b5b5f7b_0a8c_4c23_9eda_248459aab3a2$ctl00$btnPay']")
    private WebElement paynowbtn;


    public void ClickonSdummypaymethod() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), dummypayment, 20, "Element is Not Display");
        if(dummypayment.isDisplayed()) {
            dummypayment.click();
            Allure.step("Click on Dummy payment Option");
        }else {
            Allure.step( "Dummy payment Option is not display ");
        }
    }

    public void Clickoniherbyinformcheckbox() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), herbycheck, 20, "Element is Not Display");
        if(herbycheck.isDisplayed()) {
            herbycheck.click();
            Allure.step("Click on I hereby confirm that I am the policy owner and declare that the premium of this policy is being paid from the income earned from legitimate funds and from a bank account/credit card which belongs to me. I understand and agree that this is a regulatory requirement checkbox");
        }else {
            Allure.step( "Checkbox is not display ");
        }
    }
    public void Clickononlinesubmitbutton() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), onlsubmitbtn, 20, "Element is Not Display");
        if(onlsubmitbtn.isDisplayed()) {
            onlsubmitbtn.click();
            Allure.step("Click on Submit Button");
        }else {
            Allure.step( "Submit button is not display ");
        }
    }
    public void Clickonpaynowbutton() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), paynowbtn, 20, "Element is Not Display");
        if(paynowbtn.isDisplayed()) {
            paynowbtn.click();
            Allure.step("Click on Pay Now Button");
        }else {
            Allure.step( "Pay now button is not display");
        }
    }




}