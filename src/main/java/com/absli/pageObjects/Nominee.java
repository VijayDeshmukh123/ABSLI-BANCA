package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import io.qameta.allure.Allure;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Nominee extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public Nominee(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }


    // Nominee Details page // 7/6/2023=mayur

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement nmfname;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement nmlname;
    @FindBy(xpath = "//input[@name='nominee.0.day']")
    private WebElement nmday;
    @FindBy(xpath = "//input[@name='nominee.0.month']")
    private WebElement nmmonth;
    @FindBy(xpath = "//input[@name='nominee.0.year']")
    private WebElement nmyear;
    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
    private WebElement relationshipDropdown;
    @FindBy(xpath = "//input[@id='percentageShare']")
    private WebElement nmshare;
    @FindBy(xpath = "//span[contains(text(), 'EDIT')]")
    private WebElement editbuttonnominee;



    public void enternomineefname(String nomineeFirstName) {
        wait.waitForElementToBeVisibleweb(getDriver(), nmfname, 50,"time out to find element on page");
        if (nmfname.isDisplayed()) {
            nmfname.sendKeys(nomineeFirstName);
            Allure.step( "Enter Nominee First Name   >"   +nomineeFirstName);

        } else {
            System.out.println("Nominee First Name input box is not visible");
        }
    }

    public void enternomineelname(String nomineeLastName) {
        wait.waitForElementToBeVisibleweb(getDriver(), nmlname, 50,"time out to find element on page");
        if (nmlname.isDisplayed()) {
            nmlname.sendKeys(nomineeLastName);
            Allure.step( "Enter Nominee Last Name   >"   +nomineeLastName);

        } else {
            System.out.println("Nominee Last Name input box is not visible");
        }
    }

    public void fillDOBdetailsNomineeWeb(String day, String month, String year) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nmday, 50,"time out to find element on page");
        nmday.click();
        wait.WaitTime(2);
        nmday.sendKeys(day);
        Allure.step( "Enter Day For DOB  >"   +day);

        wait.waitForElementToBeVisibleweb(getDriver(), nmmonth, 50,"time out to find element on page");
        nmmonth.click();
        wait.WaitTime(2);
        nmmonth.sendKeys(month);
        Allure.step( "Enter Month For DOB  >"   +month);

        wait.waitForElementToBeVisibleweb(getDriver(), nmyear, 50,"time out to find element on page");
        nmyear.click();
        wait.WaitTime(2);
        nmyear.sendKeys(year);
        Allure.step( "Enter Year For DOB  >"   +year);

    }
    public void Clicknomineegenderweb(String nomineegender) {
        WebElement ngender=getDriver().findElement(By.xpath("(//span/div[text()='"+nomineegender+"'])[1]"));
        if(ngender.isDisplayed()) {
            ngender.click();
            Allure.step( "Select Nominee Gender  >"   +nomineegender);
        }else {
            System.out.println("Nominee Gender Button is not visible");
        }
    }

    public void SelectRelationshipwithProposerdropdownWeb(String relationship) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), relationshipDropdown, 50,"time out to find element on page");
        if(relationshipDropdown.isDisplayed()) {
            relationshipDropdown.click();
        }
        wait.WaitTime(2);
        WebElement SelectrelationshipChoose =getDriver().findElement(By.xpath("//div//ul/li[@data-value='"+relationship+"']"));
        wait.waitforElementToBeClickable(getDriver(), SelectrelationshipChoose, 100);
        if(SelectrelationshipChoose.isDisplayed()){
            SelectrelationshipChoose.click();
            Allure.step( "Select Relationship for Proposer >"   +relationship);

        }else {
            System.out.println("Relation with Proposer DropDown is not visible");
        }
    }
    public void enternomineeshare(String nomineeshare) {
        wait.waitForElementToBeVisibleweb(getDriver(), nmshare, 50,"time out to find element on page");
        if (nmshare.isDisplayed()) {
            nmshare.sendKeys(nomineeshare);
            Allure.step( "Enter Nominee Share   >"   +nomineeshare);

        } else {
            System.out.println("Nominee Share % input box is not visible");
        }
    }
    public void editnomineebutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), editbuttonnominee, 10, "Element is Not Display");
        if (editbuttonnominee.isEnabled()) {
            editbuttonnominee.click();
            Allure.step("Clicked on Edit nominee button");
        } else {
            System.out.println("Edit button not visible");
        }
    }


//APOINTEEEE DETAILLSSS    SAKSHI(28-08-2023)

    @FindBy(xpath = "//input[@id='otherRelationship']")
    private WebElement nomineeother;
    @FindBy(xpath = "(//input[contains(@id,'appFirstName')])[1]")
    private WebElement apointeefname;
    @FindBy(xpath = "(//input[contains(@id,'appLastName')])[1]")
    private WebElement apointeelname;
    @FindBy(xpath = "(//input[contains(@id,'dayapp')])[1]")
    private  WebElement appday;
    @FindBy(xpath = "(//input[contains(@id,'monthapp')])[1]")
    private WebElement appmonth;
    @FindBy(xpath = "(//input[contains(@id,'yearapp')])[1]")
    private  WebElement appyear;

    @FindBy(xpath = "(//div[@aria-haspopup='listbox'])[2]")
    private WebElement apointeerel;

    @FindBy(xpath = "//input[@id='appOtherRelationship']")
    private WebElement apointeeother;

    public void nomineeOther(String Val) {
        wait.waitForElementToBeVisibleweb(getDriver(),nomineeother,100,"unable to locate element");
        if (nomineeother.isDisplayed()) {
            nomineeother.sendKeys(Val);
            Allure.step( "Enter City Value As =====>" + Val);
        } else {
            Allure.step( "City is not displayed");
        }

    }

    public void enterAppointeeFirstNameWeb(String appointeefname) {
        wait.waitForElementToBeVisibleweb(getDriver(),apointeefname,100,"unable to locate element");
        if (apointeefname.isDisplayed()) {
            apointeefname.sendKeys(appointeefname);
            Allure.step( "Enter City Value As =====>" + appointeefname);
        } else {
            Allure.step( "City is not displayed");
        }

    }

    public void enterAppointeeLastNameWeb(String appointeelname) {
        wait.waitForElementToBeVisibleweb(getDriver(),apointeelname,100,"unable to locate element");
        if (apointeelname.isDisplayed()) {
            apointeelname.sendKeys(appointeelname);
            Allure.step( "Enter City Value As =====>" + appointeelname);
        } else {
            Allure.step( "City is not displayed");
        }

    }

    public void fillDOBdetailsAppointeeWeb(String apointeeday, String apointeemonth, String apointeeyear) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), appday, 50,"time out to find element on page");
        appday.click();
        Thread.sleep(1000);
        appday.sendKeys(apointeeday);
        Allure.step( "Enter Day For DOB  >"   +apointeeday);

        wait.waitForElementToBeVisibleweb(getDriver(), appmonth, 50,"time out to find element on page");
        appmonth.click();
        Thread.sleep(1000);
        appmonth.sendKeys(apointeemonth);
        Allure.step( "Enter Month For DOB  >"   +apointeemonth);

        wait.waitForElementToBeVisibleweb(getDriver(), appyear, 50,"time out to find element on page");
        appyear.click();
        Thread.sleep(1000);
        appyear.sendKeys(apointeeyear);
        Allure.step( "Enter Year For DOB  >"   +apointeeyear);

    }
    public void Clickappointeegendertwoweb(String appointeegender) {
        WebElement appgender=getDriver().findElement(By.xpath("//button[@value='"+appointeegender+"']"));
        if(appgender.isDisplayed()) {
            appgender.click();
            Allure.step( "Select Appointee Gender  >"   +appointeegender);
        }else {
            System.out.println("Appointee Gender Button is not visible");
        }
    }

    public void SelectRelationshipwithapointeedropdownWeb(String apointeerelationship) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), apointeerel, 50,"time out to find element on page");
        if(apointeerel.isDisplayed()) {
            apointeerel.click();
        }
        Thread.sleep(1000);
        WebElement SelectrelationshipChoose =getDriver().findElement(By.xpath("//ul/li[@data-value=\""+apointeerelationship+"\"]"));
        wait.waitforElementToBeClickable(getDriver(), SelectrelationshipChoose, 100);
        if(SelectrelationshipChoose.isDisplayed()){
            SelectrelationshipChoose.click();
            Allure.step( "Select Relationship for apointee >"   +apointeerelationship);

        }else {
            System.out.println("Relation with apointee DropDown is not visible");
        }
    }

    public void SelectGenderAppointeePageWeb1(String args){
        WebElement AppointeeGenderBtnWeb= getDriver().findElement(By.xpath("(//span/div[text()=\""+args+"\"])[1]"));
        wait.waitforElementToBeClickable(getDriver(), AppointeeGenderBtnWeb, 100);
        if(AppointeeGenderBtnWeb.isDisplayed()){
            AppointeeGenderBtnWeb.click();
            Allure.step( "Select Appointee Gender As=====> "+args);
        }else {
            System.out.println("Appointee Gender Is no Display");
            Allure.step( "Appointee Gender Is not Display");
        }

    }


    public void appointeeOther(String Val) {
        wait.waitForElementToBeVisibleweb(getDriver(),apointeeother,100,"unable to locate element"); if (apointeeother.isDisplayed()) {
            apointeeother.sendKeys(Val);
            Allure.step( "Enter City Value As =====>" + Val);
        } else {
            Allure.step(  "City is not displayed");
        }

    }











}
