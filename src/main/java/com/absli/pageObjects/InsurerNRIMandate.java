package com.absli.pageObjects;

import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurerNRIMandate extends TestBase {

    public InsurerNRIMandate(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement propPrimary;

    @FindBy(xpath = "//input[@name='nriIndianAddress1Qst']")
    private WebElement add1;
    @FindBy(xpath = "//input[@name='nriIndianAddress2Qst']")
    private WebElement add2;
    @FindBy(xpath = "//input[@name='nriIndianAddress3Qst']")
    private WebElement add3;
    @FindBy(xpath = "//input[@name='nriIndianAreaQst']")
    private WebElement indianArea;
    @FindBy(xpath = "//input[@name='nriIndianCityQst']")
    private WebElement indianCty;
    @FindBy(xpath = "//input[@id='nriIndianStateQst']")
    private WebElement indianStat;
    @FindBy(xpath = "//input[@name='nriIndianPinCodeQst']")
    private WebElement indianPin;
    @FindBy(xpath = "//button[@name='CONTINUE']")
    private WebElement continueButton;


    public void addressSameASPropPrimary(){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),propPrimary,30,"TimeOut to find element on page");
        if (propPrimary.isEnabled()) {
            propPrimary.click();
            Allure.step("Selected Address Same as Proposer/Primary>"   );
        } else {
            System.out.println("Address Same as Proposer/Primary is not Displayed");
        }
    }

    public void enterIndianAddress1(String indianAddress1){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),add1,30,"TimeOut to find element on page");
        if (add1.isDisplayed()) {
            add1.click();
            add1.sendKeys(indianAddress1);
            Allure.step("Enter IndiaAddress1 As >"+indianAddress1   );
        } else {
            System.out.println("IndiaAddress1 is not Displayed");
        }
    }
    public void enterIndianAddress2(String indianAddress2){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),add2,30,"TimeOut to find element on page");
        if (add2.isDisplayed()) {
            add2.click();
            add2.sendKeys(indianAddress2);
            Allure.step("Enter IndianAddress2 As >"+indianAddress2   );
        } else {
            System.out.println("IndianAddress2 is not Displayed");
        }
    }

    public void enterIndianAddress3(String indianAddress3){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),add3,30,"TimeOut to find element on page");
        if (add3.isDisplayed()) {
            add3.click();
            add3.sendKeys(indianAddress3);
            Allure.step("Enter IndianAddress3 As >"+indianAddress3   );
        } else {
            System.out.println("IndianAddress3 is not Displayed");
        }
    }
    public void enterIndianArea(String IndianAr){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),indianArea,30,"TimeOut to find element on page");
        if (indianArea.isDisplayed()) {
            indianArea.click();
            indianArea.sendKeys(IndianAr);
            Allure.step("Enter IndianAr As >"+IndianAr   );
        } else {
            System.out.println("IndianAr is not Displayed");
        }
    }

    public void enterIndianCity(String indianCity){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),indianCty,30,"TimeOut to find element on page");
        if (indianCty.isDisplayed()) {
            indianCty.click();
            indianCty.sendKeys(indianCity);
            Allure.step("Enter IndianCity As >"+indianCity   );
        } else {
            System.out.println("IndianCity is not Displayed");
        }
    }

    public void enterIndianState(String indianState) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),indianStat,30,"TimeOut to find element on page");
        if (indianStat.isDisplayed()) {
            indianStat.sendKeys(indianState);
            wait.WaitTime(2);
            indianStat.sendKeys(Keys.ARROW_DOWN);
            indianStat.sendKeys(Keys.ARROW_DOWN);
            indianStat.sendKeys(Keys.ENTER);
            Allure.step("Select NriInsured State  As  >"   + indianState);
        } else {
            System.out.println("NriInsured State is not displayed");
        }
    }

    public void enterIndianPinCode(String indianPincode){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),indianPin,30,"unable to locate Element");
        if (indianPin.isDisplayed()) {
            indianPin.click();
            indianPin.sendKeys(indianPincode);
            Allure.step("Enter IndianCity As >"+indianPincode   );
        } else {
            System.out.println("IndianCity is not Displayed");
        }
    }

    //travel details last12 Months

    public void clickOnTravelledLast12MonthButton(String travelledOverLast12Months){
        WebElement travelled=getDriver().findElement(By.xpath("//button[@name='nriTravelDetailsPastYearsInsured']/span/div[text()='"+travelledOverLast12Months+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),travelled,30,"TimeOut to find element on page");
        if (travelled.isDisplayed()) {
            travelled.click();
            Allure.step("Selected travelledOverLast12Months As >"  +travelledOverLast12Months);
        } else {
            System.out.println("travelledOverLast12Months is not Displayed");
        }
    }

    //travel details next12 Months
    public void clickOnTravelledNext12MonthButton(String travelledOverNext12Months){
        WebElement travelled=getDriver().findElement(By.xpath("//button[@name='nriTravelDetailsInsured']/span/div[text()='"+travelledOverNext12Months+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),travelled,30,"TimeOut to find element on page");
        if (travelled.isDisplayed()) {
            travelled.click();
            Allure.step("Selected travelledOverNext12Months As >"  +travelledOverNext12Months);
        } else {
            System.out.println("travelledOverNext12Months is not Displayed");
        }
    }

    public void clickOnInsuredContinueButton(){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),continueButton,30,"unable to locate Element");
        if (continueButton.isDisplayed()) {
            continueButton.click();
            Allure.step("Click On Insured Continue Button >"   );
        } else {
            System.out.println("Insured Continue Button is not Displayed");
        }
    }




}
