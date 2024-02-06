package com.absli.pageObjects;

import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProposerProfessionalDetails extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public ProposerProfessionalDetails(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Proposer Professional Details tab // 21/6/2023=mayur
    @FindBy(xpath = "(//div[contains(@id,'mui-component-select-23')])[1]")// for "prop" major-diff
    private WebElement qualificationele;
    @FindBy(xpath = "(//div[contains(@id,'mui-component-select-24')])[1]")// for "prop" major-diff
    private WebElement occupationele;
    @FindBy(xpath = "(//input[@name='28'])[1]")// for "prop" major-diff
    private WebElement natureofbusinessele;
    @FindBy(xpath = "(//label[contains(text(),'Name of Business')]/following-sibling::div/input)[1]")// for "prop" major-diff
    private WebElement nameofbusinessele;
    @FindBy(xpath = "(//div[contains(@id,'mui-component-select-29')])[1]")// for "prop" major-diff
    private WebElement typeoforganisationsele;
    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd'])[1]")// for "prop" major-diff
    private WebElement nameofemployeeele;
    @FindBy(xpath = "(//input[@name='30'])[1]")// for "prop" major-diff
    private WebElement Designationsele;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[5]")// for "prop" major-diff
    private WebElement GSTBtnWeb;
    @FindBy(xpath = "(//input[contains(@name,'37')])[1]")// for "prop" major-diff
    private WebElement gstnumber;
    @FindBy(xpath = "//button[contains(@name,'Add Insured details')]")// for "prop" major-diff
    private WebElement addinsu;
    @FindBy(xpath = "(//input[@name='31'])[1]")// for Company
    private WebElement cmpannl;
    @FindBy(xpath = "//button[contains(@name,'Add Spouse Details')]")
    private WebElement addspouse;

    public void SelectQualificationweb(String Propqualification) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), qualificationele, 50,"time out to find element on page");
        if(qualificationele.isDisplayed()) {
            qualificationele.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Propqualification+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 50,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select the qualification  >"   + Propqualification);
    }

    public void SelectOccupationweb(String PropoccupationOption) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), occupationele, 50,"time out to find element on page");
        if(occupationele.isDisplayed()) {
            occupationele.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+PropoccupationOption+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 50,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select the occupation Option  >"   + PropoccupationOption);
    }

    public void EnterOccupationNatureofbusinessweb(String Propnatureofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), natureofbusinessele, 50,"time out to find element on page");
        if (natureofbusinessele.isDisplayed()) {
            natureofbusinessele.sendKeys(Propnatureofbusiness);
            Allure.step( "Enter the Nature Of Business  >"   + Propnatureofbusiness);

        } else {
            System.out.println("Nature of Business button is not visible");
        }

    }
    public void EnterOccupationNameofbusinessweb(String Propnameofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nameofbusinessele, 50,"time out to find element on page");
        if (nameofbusinessele.isDisplayed()) {
            nameofbusinessele.sendKeys(Propnameofbusiness);
            Allure.step("Enter the Name Of Business  >"   + Propnameofbusiness);
        } else {
            System.out.println("Name of Business button is not visible");
        }
    }
    public void selectOccupationTypeofOrganisationweb(String Proptypeoforganisation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), typeoforganisationsele, 50,"time out to find element on page");
        if(typeoforganisationsele.isDisplayed()) {
            typeoforganisationsele.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Proptypeoforganisation+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 50,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select Type of Organisation  >"   + Proptypeoforganisation);
    }

    public void EnterOccupationNameofEmployeeweb(String Propnameofemployee) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nameofemployeeele, 50,"time out to find element on page");
        if (nameofemployeeele.isDisplayed()) {
            nameofemployeeele.sendKeys(Propnameofemployee);
            Allure.step( "Enter Name of Employee  >"   +Propnameofemployee);

        } else {
            System.out.println("Name of Employee button is not visible");
        }
    }

    public void EnterOccupationDesignationweb(String PropDesignation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), Designationsele, 50,"time out to find element on page");
        if (Designationsele.isDisplayed()) {
            Designationsele.sendKeys(PropDesignation);
            Allure.step( "Enter Designation  >"   +PropDesignation);
        } else {
            System.out.println("Enter Designation button is not visible");
        }
    }

    public void ClickOnAreYouRegisterPersonaUnderGSTweb(String GSTnumber) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), GSTBtnWeb, 20,"time out to find element on page");
        if(GSTBtnWeb.isDisplayed()) {
            GSTBtnWeb.click();
        }
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), gstnumber, 50,"time out to find element on page");
        if (gstnumber.isDisplayed()) {
            gstnumber.sendKeys(GSTnumber);
            Allure.step( "Enter GST Number  >"   +GSTnumber);
        }
    }

    public void  ClickonProposerAddInsuredButtonweb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), addinsu, 50,"time out to find element on page");
        if(addinsu.isDisplayed()) {
            addinsu.click();
            Allure.step( "Click on Add Insured Details Button");
        }else {
            System.out.println("Add Insured Details Button is Not Display");
        }

    }

    public void InsurerAnnualincomecompanyweb(String AnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cmpannl, 50,"time out to find element on page");
        if (cmpannl.isDisplayed()) {
            cmpannl.sendKeys(AnnualIncome);
            Allure.step( "Enter the Annual Income  >"   + AnnualIncome);

        } else {
            System.out.println("Annual Income button is not visible");
        }

    }

    public void  ClickonAddSpouseButtonweb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), addspouse, 50,"time out to find element on page");
        if(addspouse.isDisplayed()) {
            addspouse.click();
            Allure.step( "Click on Add spouse Details Button");
        }else {
            System.out.println("Add spouse Details Button is Not Display");
        }

    }

    @FindBy(xpath = "(//input[@name='32'])[2]")// diff='insu'
    private WebElement mdannmespouse;
    @FindBy(xpath = "(//input[@name='33'])[2]")// diff='insu'
    private WebElement parannual;
    @FindBy(xpath = "(//input[@name='34'])[2]")// diff='insu'
    private WebElement parcover;
    @FindBy(xpath = "(//input[@name='35'])[2]")// diff='insu'
    private WebElement mdannmecover;

    public void insuSpouseAnnualIncome(String SpouseAnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdannmespouse, 20,"time out to find element on page");
        if (mdannmespouse.isDisplayed()) {
            mdannmespouse.sendKeys(SpouseAnnualIncome);
            Allure.step( "Enter the Spouse Annual Income  >"   + SpouseAnnualIncome);

        } else {
            System.out.println("Spouse Annual Income button is not visible");
        }

    }
    public void insuParentsAnnualIncome(String ParentsAnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), parannual, 20,"time out to find element on page");
        if (parannual.isDisplayed()) {
            parannual.sendKeys(ParentsAnnualIncome);
            Allure.step( "Enter the Parent Annual Income  >"   + ParentsAnnualIncome);

        } else {
            System.out.println("Parent Annual Income button is not visible");
        }

    }
    public void insuParentsInsuCover(String ParentsCover) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), parcover, 20,"time out to find element on page");
        if (parcover.isDisplayed()) {
            parcover.sendKeys(ParentsCover);
            Allure.step( "Enter the Parent Insurance cover  >"   + ParentsCover);

        } else {
            System.out.println("Parent Insurance Cover button is not visible");
        }

    }
    public void insuSpouseCover(String SpouseCover) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdannmecover, 20,"time out to find element on page");
        if (mdannmecover.isDisplayed()) {
            mdannmecover.sendKeys(SpouseCover);
            Allure.step( "Enter the Annual Income  >"   + SpouseCover);

        } else {
            System.out.println("Annual Income button is not visible");
        }

    }






}
