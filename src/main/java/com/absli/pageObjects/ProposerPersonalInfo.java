package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import com.aventstack.extentreports.Status;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProposerPersonalInfo extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public ProposerPersonalInfo(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Proposer Personal Info // 21-06-2023=mayur

    @FindBy(xpath = "(//input[@id='fatherSpouseName'])[1]")
    private WebElement fatherspouse;
    @FindBy(xpath = "(//input[@id='motherName'])[1]")
    private WebElement motherele;
    @FindBy(xpath = "(//div[@id='birthPlace'])[1]")
    private WebElement propcntry;
    @FindBy(xpath = "(//div[contains(text(),'Want to Apply')])[1]")
    private WebElement want;
    @FindBy(xpath = "(//div[@id='mui-component-select-5'])[1]")
    private WebElement repo;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[1]")
    private WebElement eiayes;
    @FindBy(xpath = "(//h3[contains(text(),'State whether the Proposer / To Be Insured / Nominee are Politically Exposed Person')]//parent::div//child::div//button)[1]")
    private WebElement poli;
    @FindBy(xpath = "((//label[contains(text(),'Provide Details')])/following-sibling::div/input)[1]")
    private WebElement polidetal;
    @FindBy(xpath = "(//input[contains(@id,'birthState')])[1]")
    private WebElement ele1prop;
    @FindBy(xpath = "(//input[contains(@id,'birthCity')])[1]")
    private WebElement ele2prop;
    @FindBy(xpath = "(//input[@name='fatherSpouseName'])[1]")
    private WebElement fatherspousecmp;
    @FindBy(xpath = "(//input[@name='motherName'])[1]")
    private WebElement motherelecmp;
    @FindBy(xpath = "(//input[@name='maidenName'])[1]")
    private WebElement maidenname;
    @FindBy(xpath = "//input[@id='birthPlaceState']")
    private WebElement propbirthnri;
    @FindBy(xpath = "//input[@id='birthPlaceCity']")
    private WebElement PropnriCity;


    public void SelectMaritalStatusweb(String Propmarital) {
        WebElement maritalstatus = getDriver().findElement(By.xpath("(//div[contains(text(),'"+Propmarital+"')])[1]"));
        if (maritalstatus.isDisplayed()) {
            maritalstatus.click();
            Allure.step( "Select Proposer Marital Status   >"   +Propmarital );
        } else {
            System.out.println("Proposer Marital Status Tab is not visible");
        }
    }

    public void EnterFatherSpaouseNameweb(String PropfatherSpouse) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), fatherspouse, 50, "time out to find element on page");
        if (fatherspouse.isDisplayed()) {
            fatherspouse.click();
            wait.WaitTime(2);
            fatherspouse.sendKeys(PropfatherSpouse);
            Allure.step( "Enter Proposer Spouse/Father Name    >"   +PropfatherSpouse);
        } else {
            System.out.println(" Proposer Father Full Name input box is not visible");
        }
    }

    public void EnterMotherNameweb(String Propmothername) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), motherele, 50, "time out to find element on page");
        if (motherele.isDisplayed()) {
            motherele.click();
            wait.WaitTime(2);
            motherele.sendKeys(Propmothername);
            Allure.step("Enter Proposer Mother Name    >" + Propmothername);
        } else {
            System.out.println(" Proposer Mother Full Name input box is not visible");
        }
    }
    public void SelectBirthPlaceweb(String ProposerBirthPlace) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), propcntry, 30);
        if (propcntry.isDisplayed()) {
            propcntry.click();
            wait.WaitTime(2);
            WebElement OptionEle = getDriver().findElement(By.xpath("//li[@role='option']/div/span[text()='"+ProposerBirthPlace+"']"));
            wait.waitForElementToBeVisibleweb(getDriver(), OptionEle, 20, "time out to find element on page");
            OptionEle.click();
            Allure.step( "Select Proposer Birth Place   >"   +ProposerBirthPlace);

        }
    }
    public void EIAwanttoapply(String PreferredIR) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), want, 50, "time out to find element on page");
        if (want.isDisplayed()) {
            want.click();
        }
        wait.waitForElementToBeVisibleweb(getDriver(), repo, 50, "time out to find element on page");
        if (repo.isDisplayed()) {
            repo.click();
        }
        WebElement Selectrepo = getDriver().findElement(By.xpath("//ul//li//span[text()='"+PreferredIR+"']"));
        if (Selectrepo.isDisplayed()) {
            Selectrepo.click();
        }
        Allure.step( "Select Preferred IR   >"   +PreferredIR);

    }
    public void EIAwantyes() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), eiayes, 50, "time out to find element on page");
        if (eiayes.isDisplayed()) {
            eiayes.click();
            Allure.step( "Clicked On EIA ");
        }
    }
    public void IsaProppolitical(String PoliticalDetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), poli, 50, "time out to find element on page");
        if (poli.isDisplayed()) {
            poli.click();
        }
        wait.waitForElementToBeVisibleweb(getDriver(), polidetal, 50, "time out to find element on page");
        if (polidetal.isDisplayed()) {
            polidetal.click();
            wait.WaitTime(2);
            polidetal.sendKeys(PoliticalDetails);
            Allure.step( "Enter Political Details   >"    +PoliticalDetails);

        }
    }

    public void SelectpropBirthStateweb(String PropBirthState) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ele1prop, 50, "time out to find element on page");
        if (ele1prop.isDisplayed()) {
            ele1prop.sendKeys(PropBirthState);
            wait.WaitTime(2);
            ele1prop.sendKeys(Keys.ARROW_DOWN);
            wait.WaitTime(2);
            ele1prop.sendKeys(Keys.ENTER);
            Allure.step("Select Proposer State of Birth  >" + PropBirthState);
        } else {
            System.out.println("Proposer Birth State Dropdown is not visible");
        }

    }
    public void SelectpropBirthCityeweb(String PropBirthCity) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ele2prop, 50, "time out to find element on page");
        if (ele2prop.isDisplayed()) {
            wait.WaitTime(2);
            ele2prop.sendKeys(PropBirthCity);
            wait.WaitTime(2);
            ele2prop.sendKeys(Keys.ARROW_DOWN);
            wait.WaitTime(2);
            ele2prop.sendKeys(Keys.ENTER);
            Allure.step("Select Proposer City of Birth  >" + PropBirthCity);
        } else {
            System.out.println("Proposer Birth City Dropdown is not visible");
        }

    }
    public void EnterFatherSpaouseNamecompanyweb(String fatherSpouse) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), fatherspousecmp, 50, "time out to find element on page");
        if (fatherspousecmp.isDisplayed()) {
            fatherspousecmp.click();
            wait.WaitTime(2);
            fatherspousecmp.sendKeys(fatherSpouse);
            Allure.step( "Enter Insurer Spouse/Father Name    >"   +fatherSpouse);
        } else {
            System.out.println(" Insurer Father Full Name input box is not visible");
        }
    }

    public void EnterMotherNamecompanyweb(String mothername) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), motherelecmp, 50, "time out to find element on page");
        if (motherelecmp.isDisplayed()) {
            motherelecmp.click();
            wait.WaitTime(2);
            motherelecmp.sendKeys(mothername);
            Allure.step("Enter Proposer Mother Name    >" + mothername);
        } else {
            System.out.println(" Insurer Mother Full Name input box is not visible");
        }
    }

    public void EnterMaidenNameweb(String Propmaidenname) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), maidenname, 50, "time out to find element on page");
        if (maidenname.isDisplayed()) {
            maidenname.click();
            wait.WaitTime(2);
            maidenname.sendKeys(Propmaidenname);
            Allure.step("Enter Proposer Maiden Name    >" + Propmaidenname);
        } else {
            System.out.println(" Proposer MAiden Full Name input box is not visible");
        }
    }

    public void Enterstateofbirth(String PropBirthState) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), propbirthnri, 50, "time out to find element on page");
        if (propbirthnri.isDisplayed()) {
            propbirthnri.click();
            wait.WaitTime(2);
            propbirthnri.sendKeys(PropBirthState);
            Allure.step("Enter Birth State of proposer   >" + PropBirthState);
        } else {
            System.out.println(" Birth State of proposer input box is not visible");
        }
    }

    public void Enterstateofcity(String PropBirthCity) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), PropnriCity, 50, "time out to find element on page");
        if (PropnriCity.isDisplayed()) {
            PropnriCity.click();
            wait.WaitTime(2);
            PropnriCity.sendKeys(PropBirthCity);
            Allure.step("Enter Birth City of proposer    >" + PropBirthCity);
        } else {
            System.out.println(" Birth City of proposer input box is not visible");
        }
    }



















}

