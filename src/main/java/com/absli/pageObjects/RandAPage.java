package com.absli.pageObjects;
import com.absli.Listner.AllureListener;
import com.absli.base.*;

import com.absli.utils.WaitUtils;

import com.aventstack.extentreports.Status;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class RandAPage extends TestBase  {
    public WebDriver driver;
    public WaitUtils wait;


    public RandAPage(WebDriver driver)
    {
        PageFactory.initElements(getDriver(), this);
    }

    //RNA page(SAKSHI) //5-7-2023
    @FindBy(xpath = "//input[@name='userAgreementStatus']")
    private WebElement RandAcheckbox;

    @FindBy(xpath = "//span[text()='REVIEW & ACCEPT']")
    private WebElement AgreeBtn ;

    @FindBy(xpath = " //button[@name='OK']")
    private WebElement AlertOKBtn ;


    @FindBy(xpath = "//span[text()='Yes']")
    private WebElement TDSYesBTNBtn ;

    @FindBy(xpath = "//span[text()='No']")
    private WebElement TDSNoBTNBtn ;
    
    @FindBy(xpath = "//input[contains(@id,'inputotp')]")
    private WebElement optBTN ;
    
   
    @FindBy(xpath = "//span[text()='PROCEED']")
    private WebElement ProceedBtn ;
    
    @FindBy(xpath = "//button[@name='SEND TO CUSTOMER FOR REVIEW']")
    private WebElement ReviewBTN ;
    
    
    public void SendForReviewClick() {
    	  wait.waitForElementToBeVisibleweb(getDriver(), TDSYesBTNBtn, 10, "Element is Not Display");
        if(ReviewBTN.isDisplayed()) {
            ReviewBTN.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on review Button");
        }else {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL,  "Review button not Display");
        }

    }

    
    public void ClickOnRandATDSYesBtton() {
        wait.waitForElementToBeVisibleweb(getDriver(), TDSYesBTNBtn, 10, "Element is Not Display");
        if (TDSYesBTNBtn.isDisplayed()) {
        	TDSYesBTNBtn.click();
            Allure.step("Clicked on R&A TDS Yes Button");
        } else {
            System.out.println("R&A TDS Yes Button is not visible");
        }
    }
    public void ClickOnRandATDSNoBtton() {
        wait.waitForElementToBeVisibleweb(getDriver(), TDSNoBTNBtn, 10, "Element is Not Display");
        if (TDSNoBTNBtn.isEnabled()) {
        	TDSNoBTNBtn.click();
            Allure.step("Clicked on R&A TDS No Button");
        } else {
            System.out.println("R&A TDS No Buttonis not visible");
        }
    }
    
    
    public void ClickOnRandACheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), RandAcheckbox, 10, "Element is Not Display");
        if (RandAcheckbox.isEnabled()) {
            RandAcheckbox.click();
            Allure.step("Clicked on R&A check box");
        } else {
            System.out.println("R&A check box is not visible");
        }
    }

    public void ClickOnAgreeButtonWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), AgreeBtn, 10, "Element is Not Display");
        if (AgreeBtn.isEnabled()) {
            AgreeBtn.click();
            Allure.step("Clicked on Agree Btn");
        } else {
            System.out.println("Agree Btn is not visible");
        }
    }

    
    public void ClickOnProceedButtonWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ProceedBtn, 10, "Element is Not Display");
        if (ProceedBtn.isDisplayed()) {
        	ProceedBtn.click();
            Allure.step("Clicked on Proceed Btn");
        } else {
            System.out.println("Proceed Btn is not visible");
        }
    }
    
  public void EnterOTVC() throws InterruptedException {
    	
        
        Thread.sleep(2000);
        if(optBTN.isDisplayed()) {
        	optBTN.click();
        	optBTN.sendKeys("111111");
        	Allure.step("OTP entered as 111111");
        }else {
            System.out.println("OTP Btn is not visible");
        }

    }
    
    public void ClickOnAlertokButtonWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), AlertOKBtn, 10, "Element is Not Display");
        if (AlertOKBtn.isEnabled()) {
            AlertOKBtn.click();
            Allure.step("Clicked on OK Btn");
        } else {
            System.out.println("OK Btn is not visible");
        }
    }

}