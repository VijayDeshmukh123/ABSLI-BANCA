package com.absli.pageObjects;

import com.absli.base.BasePage;
import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesDetails extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public SalesDetails(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }


    // sales details page // 6/6/2023=mayur

    @FindBy(xpath = "//input[@name='bankCustomerId']")
    private WebElement lead;
    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement salecontinue;
    @FindBy(xpath = "//input[@name='caRefB']")
    private WebElement caref;



    public void enterleadid(String LeadID) {
        wait.waitForElementToBeVisibleweb(getDriver(), lead, 50, "time out to find element on page");
        if (lead.isDisplayed()) {
            lead.sendKeys(LeadID);
            Allure.step( "Enter the Lead ID  >"   + LeadID);
        } else {
            System.out.println("leadId input box is not visible");
        }
    }

    public void salescontinuebutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), salecontinue, 30,"time out to find element on page");
        if (salecontinue.isDisplayed()) {
            salecontinue.click();
            Allure.step( "Clicked On Sales Contiune Button");
        } else {
            System.out.println("Submit button is not visible");
        }
    }
    public void enterCArefB(String CArefB) {
        wait.waitForElementToBeVisibleweb(getDriver(), caref, 50, "time out to find element on page");
        if (caref.isDisplayed()) {
            caref.sendKeys(CArefB);
            Allure.step( "Enter the CArefb  >"   + CArefB);
        } else {
            System.out.println("CArefB input box is not visible");
        }
    }

    public void ClickOnPropwithBank(String ProposerwithBank) {
        WebElement custtype=getDriver().findElement(By.xpath("//div[contains(text(),'"+ProposerwithBank+"')]"));
        if (custtype.isDisplayed()) {
            custtype.click();
            Allure.step("Select the Proposer Type  >"   + ProposerwithBank);
        } else {
            System.out.println("Type of proposer Radio button is not visible");
        }
    }










}













