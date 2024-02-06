package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankDetails extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public BankDetails(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }


    // Bank Details page // 7/6/2023=mayur

    @FindBy(xpath = "//button[@name='Verify']")
    private WebElement verify;
    @FindBy(xpath = "//input[@id='ifscCode']")
    private WebElement ifcesi;
    @FindBy(xpath = "//input[@id='accountNo']")
    private WebElement accesi;


    @FindBy(xpath = "//input[@id='ifscCode']")
    private WebElement ifsccode;
    
    @FindBy(xpath = "//input[@id='accountNo']")
    private WebElement AccountNo;
    
    @FindBy(xpath = "//span[text()='Verify']")
    private WebElement VerifyBTN;
    
    @FindBy(xpath = "(//span[contains(text(),'PROCEED')])[1]")
    public static WebElement OKBTN;
    
    
    public void Clickaccounttypeweb(String AccountType) {
        WebElement fund=getDriver().findElement(By.xpath("//span[contains(text(),'"+AccountType+"')]"));
        if(fund.isDisplayed()) {
            fund.click();
            Allure.step("Select the Account Type  >"   + AccountType);
        }else {
            System.out.println("Account Type Button is not visible");
        }
    }
    public void clicksubmitBtn(){
        wait.waitForElementToBeVisibleweb(getDriver(), verify, 30,"time out to find element on page");
        if (verify.isDisplayed()) {
            verify.click();
            Allure.step("Clicked On Verify Button");
        } else {
            System.out.println("Verify button is not visible");
        }
    }
    public void ClickPaymentMethodweb(String paymentmethod) {
        WebElement paymethod=getDriver().findElement(By.xpath("//button[contains(@value,'"+paymentmethod+"')]"));
        if(paymethod.isDisplayed()) {
            paymethod.click();
            Allure.step("Payment method selected as  >"   +paymentmethod );
        }else {
            System.out.println("Payment Method Button is not visible");
        }
    }
    public void Clickdrawdateweb(String preferredDrawDate) {
        WebElement date=getDriver().findElement(By.xpath("//button[contains(@value,'"+preferredDrawDate+"')]"));
        if(date.isDisplayed()) {
            date.click();
            Allure.step("Select the Preferred Date  >"   + preferredDrawDate);
        }else {
            System.out.println("Preferred Draw Date Button is not visible");
        }
    }
    public void Clicksourcefundweb(String sourceFund) {
        WebElement fund=getDriver().findElement(By.xpath("//button[contains(@value,'"+sourceFund+"')]"));
        if(fund.isDisplayed()) {
            fund.click();
            Allure.step("Select the source of fund  >"   + sourceFund);
        }else {
            System.out.println("Source of Fund Button is not visible");
        }
    }
    //================================E-SI==============================================// 5/7/2023


    public void EnterIFSCforesiWeb(String IFSCcode){
        wait.waitForElementToBeVisibleweb(getDriver(), ifcesi, 50, "time out to find element on page");
        if(ifcesi.isDisplayed()){
            ifcesi.click();

            for (int i = 0; i < 10; i++) {
                ifcesi.sendKeys(Keys.BACK_SPACE);
                ifcesi.sendKeys(" ");
                ifcesi.sendKeys(Keys.DELETE);
            }
            ifcesi.sendKeys(IFSCcode);
            Allure.step( "Enter IFSC code for e-SI  >"   + IFSCcode);
        }
    }
    public void EnterACCnoforesiWeb(String AccountNumber){
        wait.waitForElementToBeVisibleweb(getDriver(), accesi, 50, "time out to find element on page");
        if(accesi.isDisplayed()){
            accesi.click();

            for (int i = 0; i < 18; i++) {
                accesi.sendKeys(Keys.BACK_SPACE);
                accesi.sendKeys(" ");
                accesi.sendKeys(Keys.DELETE);
            }
            accesi.sendKeys(AccountNumber);
            Allure.step( "Enter Account Number for e-SI  >"   + AccountNumber);
        }
    }
    public void ClickAccTypeesiweb(String AccountType) {
        WebElement actype=getDriver().findElement(By.xpath("(//button[contains(@value,'"+AccountType+"')])[1]"));
        if(actype.isDisplayed()) {
            actype.click();
            Allure.step("Select the Account Type of e-SI  >"   + AccountType);
        }else {
            System.out.println("Account Type Button is not visible");
        }
    }

    public void InputIFSCCode(String ifsc) {
        
        if(ifsccode.isDisplayed()) {
        	ifsccode.sendKeys(ifsc);
        	 Allure.step ("Enter IFSC code As=====> "+ifsc);
        }else {
        	 Allure.step (" IFSC code is not display ");
        }
    }
    
    
    public void EnterAccountNumberField(String accountno) {
       
        if(AccountNo.isDisplayed()) {
        	AccountNo.sendKeys(accountno);
        	 Allure.step("Enter Account No  As=====>"+accountno);
        }else {
        	 Allure.step(" Account No is not display ");
        }
    }
    
    public void ClickVerifyButtinweb() {
       
        if(VerifyBTN.isDisplayed()) {
        	VerifyBTN.click();
        	 Allure.step ("Click on Verify Button");
        }else {
        	VerifyBTN.click();
        	 Allure.step (" Verify Button is not display ");
        }
    }
    public void ClickOnProceedBtnweb() {
        
        if(OKBTN.isDisplayed()) {
        	OKBTN.click();
       	 Allure.step( "Click on PROCEED  Button");
        }else {
        	OKBTN.click();
       	 Allure.step (" PROCEED Button is not display ");
        }
    }
  public WebElement ClickOnProceedBtnELE() {
        
        if(OKBTN.isDisplayed()) {
        	
       	 Allure.step( "Display on PROCEED  Button");
        }else {
       	 Allure.step (" PROCEED Button is not display ");
        }
        return OKBTN;
    }
}
