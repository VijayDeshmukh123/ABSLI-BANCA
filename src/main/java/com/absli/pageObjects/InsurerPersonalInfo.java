package com.absli.pageObjects;

//import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import com.aventstack.extentreports.Status;

import Utils.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurerPersonalInfo extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public InsurerPersonalInfo(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // Insurer Personal Details tab // 8/6/2023=mayur

    @FindBy(xpath = "(//input[@id='fatherSpouseName'])[2]")
    private WebElement fatherspouse;
    @FindBy(xpath = "(//input[@id='motherName'])[2]")
    private WebElement motherele;
    @FindBy(xpath = "(//input[@name='maidenName'])[1]")
    private WebElement maidenele;
    @FindBy(xpath = "(//div[@id='birthPlace'])[2]")
    private WebElement inscntry;
    @FindBy(xpath = "(//div[contains(text(),'Want to Apply')])[2]")
    private WebElement want;
    @FindBy(xpath = "(//div[@id='mui-component-select-5'])[2]")
    private WebElement repo;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[6]")
    private WebElement eiayes;
    @FindBy(xpath = "(//h3[contains(text(),'State whether the Proposer / To Be Insured / Nominee are Politically Exposed Person')]//parent::div//child::div//button)[3]")
    private WebElement poli;
    @FindBy(xpath = "(//label[contains(text(),'Provide Details')])/following-sibling::div/input")
    private WebElement polidetal;
    @FindBy(xpath = "((//label[contains(text(),'Provide Details')])/following-sibling::div/input)[2]")
    private WebElement polidetalminor;
    @FindBy(xpath = "(//input[contains(@id,'birthState')])[2]")
    private WebElement ele1;
    @FindBy(xpath = "(//input[contains(@id,'birthCity')])[2]")
    private WebElement ele2;
    @FindBy(xpath = "(//span//div[text()='YES'])[1]")
    private WebElement addexc;
    @FindBy(xpath = "(//input[@id='insurerName'])[1]")
    private WebElement insuname;
    @FindBy(xpath = "(//input[@id='sumAssured'])[1]")
    private WebElement sumassrd;
    @FindBy(xpath = "(//button[@name='SAVE'])[1]")
    private WebElement saveexc;
    @FindBy(xpath = "(//span//div[text()='YES'])[2]")
    private WebElement addref;
    @FindBy(xpath = "(//input[@id='insurerName'])[1]")
    private WebElement insunamerf;
    @FindBy(xpath = "(//input[@id='sumAssured'])[1]")
    private WebElement sumassrdrf;
    @FindBy(xpath = "(//input[@id='reason'])[1]")
    private WebElement reason;
    @FindBy(xpath = "(//button[@name='SAVE'])[1]")
    private WebElement saveref;
    @FindBy(xpath = "//input[@id='birthState']")
    private WebElement insustate;
    @FindBy(xpath = "//input[@id='birthCity']")
    private WebElement insucity ;

    public void SelectpurposeofIns(String InsurancePurpose1,String InsurancePurpose2,String InsurancePurpose3) {
        WebElement Option1 = getDriver().findElement(By.xpath("//label//span[text()='"+InsurancePurpose1+"']"));
        wait.waitforElementToBeClickable(getDriver(), Option1, 100);
        Option1.click();
        Allure.step( "Select Insurance Purpose 1 >"   +InsurancePurpose1);

        WebElement Option2 = getDriver().findElement(By.xpath("//label//span[text()='"+InsurancePurpose2+"']"));
        wait.waitforElementToBeClickable(getDriver(), Option2, 100);
        Option2.click();
        Allure.step( "Select Insurance Purpose 2 >"   +InsurancePurpose2);

        TestUtil.scrollTillEndOfPage(getDriver());
        WebElement Option3 = getDriver().findElement(By.xpath("//label//span[text()='"+InsurancePurpose3+"']"));
        wait.waitforElementToBeClickable(getDriver(), Option3, 100);
        Option3.click();
        Allure.step( "Select Insurance Purpose 3  >"   +InsurancePurpose3);

    }
    public void SelectMaritalStatusweb(String Insumarital) {
        WebElement maritalstatus = getDriver().findElement(By.xpath("(//div[contains(text(),'" + Insumarital + "')])[2]"));
        if (maritalstatus.isDisplayed()) {
            maritalstatus.click();
            Allure.step( "Select Marital Status   >"   +Insumarital);
        } else {
            System.out.println("Marital Status Tab is not visible");
        }
    }

    public void EnterFatherSpaouseNameweb(String fatherSpouse) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), fatherspouse, 50, "time out to find element on page");
        if (fatherspouse.isDisplayed()) {
            fatherspouse.click();
            wait.WaitTime(2);
            fatherspouse.sendKeys(fatherSpouse);
            Allure.step( "Enter Spouse/Father Name    >"   +fatherSpouse);
        } else {
            System.out.println("Father Full Name input box is not visible");
        }
    }

    public void EnterMotherNameweb(String mothername) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), motherele, 50, "time out to find element on page");
        if (motherele.isDisplayed()) {
            motherele.click();
            wait.WaitTime(2);
            motherele.sendKeys(mothername);
            Allure.step( "Enter Mother Name    >"   +mothername);
        } else {
            System.out.println("Mother Full Name input box is not visible");
        }
    }
    public void EnterMaidenNameweb(String maidenname) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), maidenele, 50, "time out to find element on page");
        if (maidenele.isDisplayed()) {
            maidenele.click();
            wait.WaitTime(2);
            maidenele.sendKeys(maidenname);
            Allure.step( "Enter Maiden Name    >"   +maidenname);
        } else {
            System.out.println("Maiden Full Name input box is not visible");
        }
    }

    public void SelectBirthPlaceweb(String InsurerBirthPlace) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), inscntry, 30);
        if (inscntry.isDisplayed()) {
            inscntry.click();
            Thread.sleep(1000);
            WebElement OptionEle = getDriver().findElement(By.xpath("//li[@role='option']/div/span[text()='"+InsurerBirthPlace+"']"));
            wait.waitForElementToBeVisibleweb(getDriver(), OptionEle, 20, "time out to find element on page");
            OptionEle.click();
            Allure.step( "Select Insured Birth Place   >"   +InsurerBirthPlace);

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

    public void IsInsupolitical(String PoliticalDetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), poli, 50, "time out to find element on page");
        if (poli.isDisplayed()) {
            poli.click();
        }
        wait.waitForElementToBeVisibleweb(getDriver(), polidetal, 50, "time out to find element on page");
        if (polidetal.isDisplayed()) {
            polidetal.click();
            wait.WaitTime(1);
            polidetal.sendKeys(PoliticalDetails);
            Allure.step( "Enter Political Details   >"    +PoliticalDetails);

        }
    }
    public void IsMinorpolitical(String PoliticalDetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), poli, 50, "time out to find element on page");
        if (poli.isDisplayed()) {
            poli.click();
        }
        wait.waitForElementToBeVisibleweb(getDriver(), polidetalminor, 50, "time out to find element on page");
        if (polidetalminor.isDisplayed()) {
            polidetalminor.click();
            wait.WaitTime(2);
            polidetalminor.sendKeys(PoliticalDetails);
            Allure.step( "Enter Political Details   >"    +PoliticalDetails);

        }
    }
    public void SelectpurposeofIns(String InsurancePurpose1,String InsurancePurpose2) {
        WebElement Option1 = getDriver().findElement(By.xpath("//label//span[text()='"+InsurancePurpose1+"']"));
        wait.waitforElementToBeClickable(getDriver(), Option1, 100);
        Option1.click();
        Allure.step( "Select Insurance Purpose 1 >"   +InsurancePurpose1);

        WebElement Option2 = getDriver().findElement(By.xpath("//label//span[text()='"+InsurancePurpose2+"']"));
        wait.waitforElementToBeClickable(getDriver(), Option2, 100);
        Option2.click();
        Allure.step( "Select Insurance Purpose 2 >"   +InsurancePurpose2);
    }

    //////////////////////////////////////////////for FMP plan///////////////////////////////////////////////////////////
    public void SelectBirthStateweb(String InsuBirthState) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ele1, 50, "time out to find element on page");
        if (ele1.isDisplayed()) {
            ele1.sendKeys(InsuBirthState);
            wait.WaitTime(2);
            ele1.sendKeys(Keys.ARROW_DOWN);
            wait.WaitTime(2);
            ele1.sendKeys(Keys.ENTER);
            Allure.step("Select Insurer State of Birth  >" + InsuBirthState);
        } else {
            System.out.println("Insurer Birth State Dropdown is not visible");
        }

    }

    public void SelectBirthCityeweb(String InsuBirthCity) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ele2, 50, "time out to find element on page");
        if (ele2.isDisplayed()) {
            wait.WaitTime(2);
            ele2.sendKeys(InsuBirthCity);
            wait.WaitTime(2);
            ele2.sendKeys(Keys.ARROW_DOWN);
            wait.WaitTime(2);
            ele2.sendKeys(Keys.ENTER);
            Allure.step("Select Insurer City of Birth  >" + InsuBirthCity);
        } else {
            System.out.println("Insurer Birth City Dropdown is not visible");
        }

    }

    public void Enterbirthstateinsurerweb(String InsuBirthState) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), insustate, 50, "time out to find element on page");
        if (insustate.isDisplayed()) {
            insustate.click();
            wait.WaitTime(2);
            insustate.sendKeys(InsuBirthState);
            Allure.step( "Enter Birth State of Insurer    >"   +InsuBirthState);
        } else {
            System.out.println("Birth State of Insurer input box is not visible");
        }
    }
    public void Enterbirthcityinsurerweb(String InsuBirthCity) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), insucity, 50, "time out to find element on page");
        if (insucity.isDisplayed()) {
            insucity.click();
            wait.WaitTime(2);
            insucity.sendKeys(InsuBirthCity);
            Allure.step( "Enter Birth City of Insurer    >"   +InsuBirthCity);
        } else {
            System.out.println("Birth City of Insurer input box is not visible");
        }
    }
///////////////////////////////////// existing and refused policy ////////////////////////////////////////////////


    public void IsAddexistingPolicy(String AddexistingPolicy, String InsurerName, String SumAssured) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), addexc, 50, "time out to find element on page");
        if (addexc.isDisplayed()) {
            addexc.click();
            Allure.step( "Selected Existing Policy as   >"    +AddexistingPolicy);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), insuname, 50, "time out to find element on page");
        if (insuname.isDisplayed()) {
            insuname.click();
            wait.WaitTime(2);
            insuname.sendKeys(InsurerName);
            wait.WaitTime(2);
            insuname.sendKeys(Keys.ARROW_DOWN);
            wait.WaitTime(2);
            insuname.sendKeys(Keys.ENTER);
            Allure.step( "Select Name of Insurer   >"    +InsurerName);

        }
        wait.waitForElementToBeVisibleweb(getDriver(), sumassrd, 50, "time out to find element on page");
        if (sumassrd.isDisplayed()) {
            sumassrd.click();
            wait.WaitTime(2);
            sumassrd.sendKeys(SumAssured);
            Allure.step( "Enter Sum Assured   >"    +SumAssured);

        }
        wait.waitForElementToBeVisibleweb(getDriver(), saveexc, 50, "time out to find element on page");
        if (saveexc.isDisplayed()) {
            saveexc.click();
            Allure.step( "Clicked on Existing Policy SAVE button");
        }
    }

    public void IsAddrefusedPolicy(String AddrefusedPolicy, String PolicyType, String InsurerNameRef, String SumAssuredref, String ReasonRef) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), addref, 50, "time out to find element on page");
        if (addref.isDisplayed()) {
            addref.click();
            Allure.step("Selected Refused Policy as   >" + AddrefusedPolicy);
        }

        WebElement poltyperef = getDriver().findElement(By.xpath("//div[text()='" + PolicyType + "']"));
        wait.waitforElementToBeClickable(getDriver(), poltyperef, 100);
        poltyperef.click();
        Allure.step("Select Type of Policy  >" + PolicyType);

        wait.waitForElementToBeVisibleweb(getDriver(), insunamerf, 50, "time out to find element on page");
        if (insunamerf.isDisplayed()) {
            insunamerf.click();
            wait.WaitTime(2);
            insunamerf.sendKeys(InsurerNameRef);
            wait.WaitTime(2);
            insunamerf.sendKeys(Keys.ARROW_DOWN);
            wait.WaitTime(2);
            insunamerf.sendKeys(Keys.ENTER);
            Allure.step("Select Name of Insurer   >" + InsurerNameRef);

        }
        wait.waitForElementToBeVisibleweb(getDriver(), sumassrdrf, 50, "time out to find element on page");
        if (sumassrdrf.isDisplayed()) {
            sumassrdrf.click();
            wait.WaitTime(2);
            sumassrdrf.sendKeys(SumAssuredref);
            Allure.step("Enter Sum Assured   >" + SumAssuredref);

        }
        wait.waitForElementToBeVisibleweb(getDriver(), reason, 50, "time out to find element on page");
        if (reason.isDisplayed()) {
            reason.click();
            wait.WaitTime(2);
            reason.sendKeys(ReasonRef);
            Allure.step("Enter Reason   >" + ReasonRef);

            wait.waitForElementToBeVisibleweb(getDriver(), saveref, 50, "time out to find element on page");
            if (saveref.isDisplayed()) {
                saveref.click();
                Allure.step("Clicked on Refused Policy SAVE button");
            }
        }
    }




}
