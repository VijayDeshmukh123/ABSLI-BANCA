package com.absli.pageObjects;
import com.absli.Listner.AllureListener;
import com.absli.base.*;

import com.absli.utils.WaitUtils;

import com.aventstack.extentreports.Status;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ECCDPage extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;


    public ECCDPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    //ECCD page(SAKSHI) //5-7-2023

    @FindBy(xpath = " //span[contains(text(), 'Complete Now')]")
    private WebElement eccdcompletenow ;
    @FindBy(xpath = " (//input[@type='checkbox'])[1]")
    private WebElement yestoallchkbox ;
    @FindBy(xpath = " (//input[@type='checkbox'])[2]")
    private WebElement  Recurringdepositchkbox ;
    @FindBy(xpath = " (//input[@type='checkbox'])[3]")
    private WebElement ABSLIchkbox ;
    @FindBy(xpath = " (//input[@type='checkbox'])[4]")
    private WebElement illustrationchkbox ;
    @FindBy(xpath = " //div[contains(text(), 'Select Relationship')]")
    private WebElement selectrelation ;
    @FindBy(xpath = " //div[contains(text(), 'Mode of Payment')]")
    private WebElement modeofpayment ;
    @FindBy(xpath = " //button[@name='Accept']")
    private WebElement acceptbutton ;
    @FindBy(xpath = "//span[contains(text(), 'Next')]")
    private WebElement nextbutton ;
    @FindBy(xpath = "//span[contains(text(), 'Copy Link')]")
    private  WebElement copylinkbutton;
    @FindBy(xpath = "//span[contains(text(), 'Continue')]")
    private  WebElement continuebutton;
    @FindBy(xpath = "//span[contains(text(), 'Do it Later')]")
    private  WebElement doitlater;
    @FindBy(xpath = "//button[@name='Go Back']")
    private  WebElement goback;
    @FindBy(xpath = "//input[@type='password']")
    private  WebElement propotp;
    
    
    @FindBy(xpath = "//span[contains(text(), 'Proceed to Next')]")
    private  WebElement proccedNext;
    
    
    
    
    
    
    
    public void ECCDCompleteNow() {
        wait.waitForElementToBeVisibleweb(getDriver(), eccdcompletenow, 10, "Element is Not Display");
        if (eccdcompletenow.isEnabled()) {
            eccdcompletenow.click();
            Allure.step("Clicked on Cpmplete now on ECCD");
        } else {
            System.out.println("Complete now button not visible");
        }
    }
    public void ClickOnyestoallCheckboxWeb() throws InterruptedException {
    	try {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Declarations']")));
        wait.WaitTime(2);
    	}catch(Exception e) {
    		
    	}
        wait.waitForElementToBeVisibleweb(getDriver(), yestoallchkbox, 10, "Element is Not Display");
        if (yestoallchkbox.isEnabled()) {
            yestoallchkbox.click();
            Allure.step("Clicked on yes to all check box");
        } else {
            System.out.println("yes to all check box is not visible");
        }
    }
    public void ClickOnrecurringdepositCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Recurringdepositchkbox, 10, "Element is Not Display");
        if (Recurringdepositchkbox.isEnabled()) {
            Recurringdepositchkbox.click();
            Allure.step("Clicked on Recurring deposit check box");
        } else {
            System.out.println("Recurring deposit check box is not visible");
        }
    }
    public void ClickOnABSLICheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ABSLIchkbox, 10, "Element is Not Display");
        if (ABSLIchkbox.isEnabled()) {
            ABSLIchkbox.click();
            Allure.step("Clicked on ABSLI check box");
        } else {
            System.out.println("ABSLI check box is not visible");
        }
    }
    public void ClickOnillustrationCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), illustrationchkbox, 10, "Element is Not Display");
        if (illustrationchkbox.isEnabled()) {
            illustrationchkbox.click();
            Allure.step("Clicked on Illustration check box");
        } else {
            System.out.println("Illustration check box is not visible");
        }
    }

    public void SelectRelationshipweb(String SelectRelationECCD) throws InterruptedException {
        TestUtil.scrollTillEndOfPage(getDriver());
        wait.waitforElementToBeClickable(getDriver(), selectrelation, 30);
        if (selectrelation.isDisplayed()) {
            selectrelation.click();
            wait.WaitTime(2);
            WebElement OptionEle = getDriver().findElement(By.xpath("//div[contains(text(), '"+SelectRelationECCD+"')]"));
            wait.waitForElementToBeVisibleweb(getDriver(), OptionEle, 20, "time out to find element on page");
            OptionEle.click();
            Allure.step( "Select Relationship   >"   +SelectRelationECCD);

        }
    }
    public void Selectmodeofpaymentweb(String ModeofPaymentECCD) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), modeofpayment, 30);
        if (modeofpayment.isDisplayed()) {
            modeofpayment.click();
            wait.WaitTime(2);
            WebElement OptionEle = getDriver().findElement(By.xpath("//div[contains(text(), '"+ModeofPaymentECCD+"')]"));
            wait.waitForElementToBeVisibleweb(getDriver(), OptionEle, 20, "time out to find element on page");
            OptionEle.click();
            Allure.step( "Select Mode of Payemnt   >"   +ModeofPaymentECCD);

        }
    }
    public void Acceptbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), acceptbutton, 10, "Element is Not Display");
        if (acceptbutton.isEnabled()) {
            acceptbutton.click();
            Allure.step("Clicked on Accept button on ECCD");
        } else {
            System.out.println("Accept button not visible");
        }
    }
    public void Nextbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), nextbutton, 10, "Element is Not Display");
        if (nextbutton.isEnabled()) {
            nextbutton.click();
            Allure.step("Clicked on next button on ECCD");
        } else {
            System.out.println("next button not visible");
        }
    }

    public void ClickCopylinkbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), copylinkbutton, 10, "Element is Not Display");
        if (copylinkbutton.isEnabled()) {
            copylinkbutton.click();
            Allure.step("Clicked on copylink button on ECCD");
        } else {
            System.out.println("copylink button not visible");
        }
    }
    public void ClickContinuebutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), continuebutton, 10, "Element is Not Display");
        if (continuebutton.isEnabled()) {
            continuebutton.click();
            Allure.step("Clicked on continue button on ECCD");
        } else {
            System.out.println("continue button not visible");
        }
    }
    public void ClickDoitLaterbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), doitlater, 10, "Element is Not Display");
        if (doitlater.isDisplayed()) {
            doitlater.click();
            Allure.step("Clicked on do it later button on ECCD");
        } else {
            System.out.println("do it later button not visible");
        }
    }
    public void ClickGoBackbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), goback, 10, "Element is Not Display");
        if (goback.isDisplayed()) {
            goback.click();
            Allure.step("Clicked on <- Go Back button on ECCD");
        } else {
            System.out.println("<- Go Back button not visible");
        }
    }
    public void enterProposerOTPeccdweb(String ProposerOTP) {
        wait.waitForElementToBeVisibleweb(getDriver(), propotp, 50,"time out to find element on page");
        if (propotp.isDisplayed()) {
            propotp.click();
            propotp.sendKeys(ProposerOTP);
            Allure.step("Enter the OTP for Proposer CCD  >"   + ProposerOTP);
        } else {
            System.out.println("OTP input box is not visible");
        }

    }

    //------------------------------------------INSURED ECCD METHODS---------------------------------------------------//

    @FindBy(xpath = "(//span[contains(text(), 'Complete Now')])[2]")
    private WebElement eccdcompletenowinsured;
    @FindBy(xpath = " (//input[@type='checkbox'])[1]")
    private WebElement yestoallchkboxinsured ;
    @FindBy(xpath = " (//input[@type='checkbox'])[2]")
    private WebElement  Recurringdepositchkboxinsured ;
    @FindBy(xpath = " (//input[@type='checkbox'])[3]")
    private WebElement ABSLIchkboxinsured ;
    @FindBy(xpath = " (//input[@type='checkbox'])[4]")
    private WebElement illustrationchkboxinsured ;
    @FindBy(xpath = " //div[contains(text(), 'Select Relationship')]")
    private WebElement selectrelationinsured ;
    @FindBy(xpath = " //div[contains(text(), 'Mode of Payment')]")
    private WebElement modeofpaymentinsured ;
    @FindBy(xpath = " //button[@name='Accept']")
    private WebElement acceptbuttoninsured ;

    public void ECCDCompleteNowInsured() {
        wait.waitForElementToBeVisibleweb(getDriver(), eccdcompletenowinsured, 10, "Element is Not Display");
        if (eccdcompletenowinsured.isEnabled()) {
            eccdcompletenowinsured.click();
            Allure.step("Clicked on Complete now on ECCD- for insured");
        } else {
            System.out.println("Complete now button not visible");
        }
    }
    public void ClickOnyestoallCheckboxInsuredWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), yestoallchkboxinsured, 10, "Element is Not Display");
        if (yestoallchkboxinsured.isEnabled()) {
            yestoallchkboxinsured.click();
            Allure.step("Clicked on yes to all check box");
        } else {
            System.out.println("yes to all check box is not visible");
        }
    }
    public void ClickOnrecurringdepositCheckboxInsuredWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Recurringdepositchkboxinsured, 10, "Element is Not Display");
        if (Recurringdepositchkboxinsured.isEnabled()) {
            Recurringdepositchkboxinsured.click();
            Allure.step("Clicked on Recurring deposit check box");
        } else {
            System.out.println("Recurring deposit check box is not visible");
        }
    }
    public void ClickOnABSLICheckboxInsuredWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ABSLIchkboxinsured, 10, "Element is Not Display");
        if (ABSLIchkboxinsured.isEnabled()) {
            ABSLIchkboxinsured.click();
            Allure.step("Clicked on ABSLI check box");
        } else {
            System.out.println("ABSLI check box is not visible");
        }
    }
    public void ClickOnillustrationCheckboxInsuredWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), illustrationchkboxinsured, 10, "Element is Not Display");
        if (illustrationchkboxinsured.isEnabled()) {
            illustrationchkboxinsured.click();
            Allure.step("Clicked on Illustration check box");
        } else {
            System.out.println("Illustration check box is not visible");
        }
    }

    public void SelectRelationshipInsuredweb(String SelectRelationECCD) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), selectrelationinsured, 30);
        if (selectrelationinsured.isDisplayed()) {
            selectrelationinsured.click();
            wait.WaitTime(2);
            WebElement OptionEle = getDriver().findElement(By.xpath("//div[contains(text(), '"+SelectRelationECCD+"')]"));
            wait.waitForElementToBeVisibleweb(getDriver(), OptionEle, 20, "time out to find element on page");
            OptionEle.click();
            Allure.step( "Select Relationship   >"   +SelectRelationECCD);

        }
    }
    public void SelectmodeofpaymentInsuredweb(String ModeofPaymentECCD) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), modeofpaymentinsured, 30);
        if (modeofpaymentinsured.isDisplayed()) {
            modeofpaymentinsured.click();
            wait.WaitTime(2);
            WebElement OptionEle = getDriver().findElement(By.xpath("//div[contains(text(), '"+ModeofPaymentECCD+"')]"));
            wait.waitForElementToBeVisibleweb(getDriver(), OptionEle, 20, "time out to find element on page");
            OptionEle.click();
            Allure.step( "Select Mode of Payemnt   >"   +ModeofPaymentECCD);

        }
    }
    public void AcceptbuttonInsured() {
        wait.waitForElementToBeVisibleweb(getDriver(), acceptbuttoninsured, 10, "Element is Not Display");
        if (acceptbuttoninsured.isEnabled()) {
            acceptbuttoninsured.click();
            Allure.step("Clicked on Accept button on ECCD");
        } else {
            System.out.println("Accept button not visible");
        }
    }
    public void enterInsurerOTPeccdweb(String InsurerOTP) {
        wait.waitForElementToBeVisibleweb(getDriver(), propotp, 50,"time out to find element on page");
        if (propotp.isDisplayed()) {
            propotp.click();
            propotp.sendKeys(InsurerOTP);
            Allure.step("Enter the OTP for Insurer CCD  >"   + InsurerOTP);
        } else {
            System.out.println("OTP input box is not visible");
        }

    }
    
    public void ProccedToNextBTN() {
        wait.waitForElementToBeVisibleweb(getDriver(), proccedNext, 5, "Element is Not Display");
        if (proccedNext.isEnabled()) {
        	proccedNext.click();
            Allure.step("Clicked on procced Next button on ECCD");
        } else {
            System.out.println("procced Next button not visible");
        }
    }
}
