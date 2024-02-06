package com.absli.pageObjects;

import com.absli.base.TestBase;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpouseCovidDetails extends TestBase {

    public SpouseCovidDetails(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    @FindBy(xpath = "(//input[@name='401'])[9]")//9
    private WebElement Fevercheckbox;
    @FindBy(xpath = "(//input[@name='401'])[10]")
    private WebElement Coughcheckbox;
    @FindBy(xpath = "(//input[@name='401'])[11]")
    private WebElement SoreTcheckbox;
    @FindBy(xpath = "(//input[@name='401'])[12]")
    private WebElement Breathcheckbox;
    @FindBy(xpath = "(//input[@name='401'])[13]")
    private WebElement Nauseacheckbox;
    @FindBy(xpath = "(//input[@name='401'])[14]")//14
    private WebElement Diarrheacheckbox;
    @FindBy(xpath = "(//div[text()='Yes'])[3]")//USE
    private WebElement novalfmpA;
    @FindBy(xpath = "(//div[text()='Yes'])[4]")//USE
    private WebElement asmptYfmpA;
    @FindBy(xpath = "(//div[text()='No'])[4]")//
    private WebElement asmptfmpAN;
    @FindBy(xpath = "(//div[text()='Yes'])[5]")//
    private WebElement qurntYfmpA;
    @FindBy(xpath = "(//div[text()='No'])[5]")//
    private WebElement qurntNfmpA;
    @FindBy(xpath = "(//div[text()='Yes'])[6]")//
    private WebElement hospitalYfmpA;
    @FindBy(xpath = "(//div[text()='No'])[6]")//
    private WebElement hospitalNfmpA;
    @FindBy(xpath = "(//div[text()='Yes'])[7]")//
    private WebElement ICUYfmpA;
    @FindBy(xpath = "(//div[text()='Yes'])[8]")//
    private WebElement mchnYfmpA;
    @FindBy(xpath = "(//div[text()='Yes'])[9]")//
    private WebElement PDYfmpA;
    @FindBy(xpath = "//input[@name='412']")
    private WebElement Dtails;
    @FindBy(xpath = "//div[@id='mui-component-select-414']")
    private WebElement vaccn;
    @FindBy(xpath = "//input[@name='416']")
    private WebElement fdose;
    @FindBy(xpath = "//input[@name='417']")
    private WebElement sdose;
    @FindBy(xpath = "//input[@name='418']")
    private WebElement tdose;
    @FindBy(xpath = "(//button[@name='413'])[2]")
    private WebElement vccNo;
    @FindBy(xpath = "(//button[@name='455'])[1]")
    private WebElement fmpAcvd;
    @FindBy(xpath = "(//div[@id='mui-component-select-414'])[2]")
    private WebElement vaccnfmpA;
    @FindBy(xpath = "(//input[@name='416'])[2]")
    private WebElement fdosefmpA;
    @FindBy(xpath = "(//input[@name='417'])[2]")
    private WebElement sdosefmpA;
    @FindBy(xpath = "(//input[@name='418'])[2]")
    private WebElement tdosefmpA;
    @FindBy(xpath = "(//button[@name='413'])[4]")
    private WebElement vccNofmpA;
    @FindBy(xpath = "//input[@name='404']")
    private WebElement novaldig;
    @FindBy(xpath = "//input[@name='405']")
    private WebElement novalrec;

    @FindBy(xpath = "(//div[text()='Yes'])[7]")
    private WebElement PDY;


    public void ClickOnPostDischargeyesWeb(String TestsDetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), PDY, 10, "Element is Not Display");
        if (PDY.isEnabled()) {
            PDY.click();
            Allure.step("Clicked on Post Discharge Yes button");
        }
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), Dtails, 10, "Element is Not Display");
        if (Dtails.isEnabled()) {
            Dtails.click();
            Dtails.sendKeys(TestsDetails);
            Allure.step("Enter on Post Discharge details  >"   +TestsDetails);
        }
    }
    public void enterdignodateweb(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), novaldig, 50,"time out to find element on page");
        if (novaldig.isDisplayed()) {
            novaldig.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date   >"   +DiagnosisDate);
        } else {
            System.out.println("input box is not visible");
        }
    }
    public void enterrecoverydateweb(String RecoveryDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), novalrec, 50,"time out to find element on page");
        if (novalrec.isDisplayed()) {
            novalrec.sendKeys(RecoveryDate);
            Allure.step("Enter Recovery Date   >"   +RecoveryDate);
        } else {
            System.out.println("input box is not visible");
        }
    }

    public void ClickOncovidfeverCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Fevercheckbox, 10, "Element is Not Display");
        if (Fevercheckbox.isEnabled()) {
            Fevercheckbox.click();
            Allure.step("Clicked on Fever check box");
        } else {
            System.out.println("Fever check box is not visible");
        }
    }
    public void ClickOncovidcoughCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Coughcheckbox, 10, "Element is Not Display");
        if (Coughcheckbox.isEnabled()) {
            Coughcheckbox.click();
            Allure.step("Clicked on Cough check box");
        } else {
            System.out.println("Cough check box is not visible");
        }
    }
    public void ClickOnSorethroatCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), SoreTcheckbox, 10, "Element is Not Display");
        if (SoreTcheckbox.isEnabled()) {
            SoreTcheckbox.click();
            Allure.step("Clicked on Sore Throat check box");
        } else {
            System.out.println("Sore Throat check box is not visible");
        }
    }
    public void ClickOnBreathCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Breathcheckbox, 10, "Element is Not Display");
        if (Breathcheckbox.isEnabled()) {
            Breathcheckbox.click();
            Allure.step("Clicked on Breathlessness check box");
        } else {
            System.out.println("Breathlessness check box is not visible");
        }
    }
    public void ClickOnNauseaCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Nauseacheckbox, 10, "Element is Not Display");
        if (Nauseacheckbox.isEnabled()) {
            Nauseacheckbox.click();
            Allure.step("Clicked on Nausea check box");
        } else {
            System.out.println("Nausea check box is not visible");
        }
    }
    public void ClickOnDiarrheaCheckboxWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Diarrheacheckbox, 10, "Element is Not Display");
        if (Diarrheacheckbox.isEnabled()) {
            Diarrheacheckbox.click();
            Allure.step("Clicked on Diarrhea check box");
        } else {
            System.out.println("Diarrhea check box is not visible");
        }
    }
    /////////////////////////// covid TESTS ///////////////////

    public void ClickOnhaveyoutestedyesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), novalfmpA, 10, "Element is Not Display");
        if (novalfmpA.isEnabled()) {
            novalfmpA.click();
            Allure.step("Clicked on Covid TESTS button");
        } else {
            System.out.println("Covid TESTS button is not visible");
        }
    }

    public void ClickOnAsymptyesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), asmptYfmpA, 10, "Element is Not Display");
        if (asmptYfmpA.isEnabled()) {
            asmptYfmpA.click();
            Allure.step("Clicked on Asymptomatic Yes button");
        } else {
        }
    }

    public void ClickOnAsymptnofmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), asmptfmpAN, 10, "Element is Not Display");
        if (asmptfmpAN.isEnabled()) {
            asmptfmpAN.click();
            Allure.step("Clicked on Asymptomatic No button");
        } else {
            System.out.println("Asymptomatic button is not visible");
        }
    }

    public void ClickOnHomequryesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), qurntYfmpA, 10, "Element is Not Display");
        if (qurntYfmpA.isEnabled()) {
            qurntYfmpA.click();
            Allure.step("Clicked on Home Quarantine Yes button");
        } else {
            System.out.println("Home Quarantine button is not visible");
        }
    }

    public void ClickOnHomequrynofmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), qurntNfmpA, 10, "Element is Not Display");
        if (qurntNfmpA.isEnabled()) {
            qurntNfmpA.click();
            Allure.step("Clicked on Home Quarantine No button");
        } else {
            System.out.println("Home Quarantine button is not visible");
        }
    }

    public void ClickOnHospitalyesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), hospitalYfmpA, 10, "Element is Not Display");
        if (hospitalYfmpA.isEnabled()) {
            hospitalYfmpA.click();
            Allure.step("Clicked on Hospitalized Yes button");
        } else {
            System.out.println("Hospitalized button is not visible");
        }
    }

    public void ClickOnHospitalnofmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), hospitalNfmpA, 10, "Element is Not Display");
        if (hospitalNfmpA.isEnabled()) {
            hospitalNfmpA.click();
            Allure.step("Clicked on Hospitalized No button");
        } else {
            System.out.println("Hospitalized button is not visible");
        }
    }

    public void ClickOnICUreqyesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ICUYfmpA, 10, "Element is Not Display");
        if (ICUYfmpA.isEnabled()) {
            ICUYfmpA.click();
            Allure.step("Clicked on ICU requirement Yes button");
        } else {
            System.out.println("ICU requirement button is not visible");
        }
    }

    public void ClickOnmachinereqyesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), mchnYfmpA, 10, "Element is Not Display");
        if (mchnYfmpA.isEnabled()) {
            mchnYfmpA.click();
            Allure.step("Clicked on Machine requirement Yes button");
        } else {
            System.out.println("Machine requirement button is not visible");
        }
    }

    public void ClickOnPostDischargeyesfmpAWeb(String TestsDetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), PDYfmpA, 10, "Element is Not Display");
        if (PDYfmpA.isEnabled()) {
            PDYfmpA.click();
            Allure.step("Clicked on Post Discharge Yes button");
        }
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), Dtails, 10, "Element is Not Display");
        if (Dtails.isEnabled()) {
            Dtails.click();
            Dtails.sendKeys(TestsDetails);
            Allure.step("Enter on Post Discharge details  >"   +TestsDetails);
        }
    }
    /////////////// Covid Vaccination Tab /////////////////////////
    public void ClickOnCovidvaccineWeb(String Vaccine, String FirstDose, String SecondDose, String ThirdDose) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), vaccn, 100);
        if(vaccn.isDisplayed()) {
            vaccn.click();
        }
        wait.WaitTime(2);
        WebElement selectvaccine = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Vaccine+"']"));
        wait.waitforElementToBeClickable(getDriver(), selectvaccine, 100);
        selectvaccine.click();
        Allure.step("Select Vaccine  >"   +Vaccine);
        wait.WaitTime(2);

        wait.waitforElementToBeClickable(getDriver(), fdose, 100);
        if(fdose.isDisplayed()) {
            fdose.click();
            fdose.sendKeys(FirstDose);
            Allure.step("Enter date of First Dose  >"   +FirstDose);
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), sdose, 100);
        if(sdose.isDisplayed()) {
            sdose.click();
            sdose.sendKeys(SecondDose);
            Allure.step("Enter date of Second Dose  >"   +SecondDose);
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), tdose, 100);
        if(tdose.isDisplayed()) {
            tdose.click();
            tdose.sendKeys(ThirdDose);
            Allure.step("Enter date of Second Dose  >"   +ThirdDose);
        }

    }
    public void ClickOncovidvaccnnoWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), vccNo, 10, "Element is Not Display");
        if (vccNo.isEnabled()) {
            vccNo.click();
            Allure.step("Clicked on Covid Vaccination No button");
        } else {
            System.out.println("Covid Vaccination button is not visible");
        }
    }
    public void ClickOncovidvaccnnofmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), vccNofmpA, 10, "Element is Not Display");
        if (vccNofmpA.isEnabled()) {
            vccNofmpA.click();
            Allure.step("Clicked on Covid Vaccination No button");
        } else {
            System.out.println("Covid Vaccination button is not visible");
        }
    }
    ///////////////////////// fmp option A /////////////////////////////////////////////


    public void ClickOncovidyesfmpAWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), fmpAcvd, 10, "Element is Not Display");
        if (fmpAcvd.isEnabled()) {
            fmpAcvd.click();
            Allure.step("Clicked on Covid Question for FMP A as Yes");
        } else {
            System.out.println("Covid Question button is not visible");
        }
    }

    ///////////////////////////////////////////////////////////////////
    public void ClickOnCovidvaccineWebfmpA(String Vaccine, String FirstDose, String SecondDose, String ThirdDose) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), vaccnfmpA, 100);
        if(vaccnfmpA.isDisplayed()) {
            vaccnfmpA.click();
        }
        wait.WaitTime(2);
        WebElement selectvaccine = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Vaccine+"']"));
        wait.waitforElementToBeClickable(getDriver(), selectvaccine, 100);
        selectvaccine.click();
        Allure.step("Select Vaccine  >"   +Vaccine);
        wait.WaitTime(2);

        wait.waitforElementToBeClickable(getDriver(), fdosefmpA, 100);
        if(fdosefmpA.isDisplayed()) {
            fdosefmpA.click();
            fdosefmpA.sendKeys(FirstDose);
            Allure.step("Enter date of First Dose  >"   +FirstDose);
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), sdosefmpA, 100);
        if(sdosefmpA.isDisplayed()) {
            sdosefmpA.click();
            sdosefmpA.sendKeys(SecondDose);
            Allure.step("Enter date of Second Dose  >"   +SecondDose);
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), tdosefmpA, 100);
        if(tdosefmpA.isDisplayed()) {
            tdosefmpA.click();
            tdosefmpA.sendKeys(ThirdDose);
            Allure.step("Enter date of Second Dose  >"   +ThirdDose);
        }

    }

//--------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "//div[contains(text(),'Covid 19 Details')]")
    private WebElement covid19tab;
    @FindBy(xpath = "(//input[@name='details'])[2]")
    private WebElement detailsspousetext;

    public void ClickOncovid19tabWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), covid19tab, 10, "Element is Not Display");
        if(covid19tab.isDisplayed()) {
            covid19tab.click();
        }
    }

    public void EnterProvideDetailsSpouseCommonWeb(String Providemeddetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), detailsspousetext, 20, "Element is Not Display");
        if (detailsspousetext.isDisplayed()) {
            detailsspousetext.sendKeys(Providemeddetails);
            Allure.step( "Clicked On Provide Details Common   >"   + Providemeddetails);
        }
    }

}


