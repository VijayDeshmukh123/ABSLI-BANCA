package com.absli.pageObjects;

import com.absli.base.TestBase;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MinorCovidDetails extends TestBase {


    public MinorCovidDetails(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // Minor Covid 19 Details tab // 22/6/2023=mayur

    @FindBy(xpath = "(//input[@name='401'])[9]")
    private WebElement Fevercheckbox;
    @FindBy(xpath = "(//input[@name='401'])[10]")
    private WebElement Coughcheckbox;
    @FindBy(xpath = "(//input[@name='401'])[11]")
    private WebElement SoreTcheckbox;
    @FindBy(xpath = "(//input[@name='401'])[12]")
    private WebElement Breathcheckbox;
    @FindBy(xpath = "(//input[@name='401'])[13]")
    private WebElement Nauseacheckbox;
    @FindBy(xpath = "(//input[@name='401'])[14]")
    private WebElement Diarrheacheckbox;
    @FindBy(xpath = "(//input[@id='details'])[1]")
    private WebElement ProvideDetailsText;
    @FindBy(xpath = "(//div[text()='Yes'])[3]")//9
    private WebElement noval;
    @FindBy(xpath = "(//input[@name='404'])[1]")//2
    private WebElement novaldig;
    @FindBy(xpath = "(//input[@name='404'])[2]")//2
    private WebElement novaldig2;
    @FindBy(xpath = "(//input[@name='405'])[1]")//2
    private WebElement novalrec;
    @FindBy(xpath = "(//input[@name='405'])[2]")//2
    private WebElement novalrec2;
    @FindBy(xpath = "(//div[text()='Yes'])[4]")//10
    private WebElement asmptY;
    @FindBy(xpath = "(//div[text()='No'])[4]")//10
    private WebElement asmptN;
    @FindBy(xpath = "(//div[text()='Yes'])[5]")//11
    private WebElement qurntY;
    @FindBy(xpath = "(//div[text()='No'])[5]")//11
    private WebElement qurntN;
    @FindBy(xpath = "(//div[text()='Yes'])[6]")//12
    private WebElement hospitalY;
    @FindBy(xpath = "(//div[text()='No'])[6]")//12
    private WebElement hospitalN;
    @FindBy(xpath = "(//div[text()='Yes'])[7]")//13
    private WebElement ICUY;
    @FindBy(xpath = "(//div[text()='Yes'])[8]")//14
    private WebElement mchnY;
    @FindBy(xpath = "(//div[text()='Yes'])[9]")//15
    private WebElement PDY;
    @FindBy(xpath = "//input[@name='412']")
    private WebElement Dtails;



    public void ClickOncovidfeverCheckboxminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Fevercheckbox, 10, "Element is Not Display");
        if (Fevercheckbox.isEnabled()) {
            Fevercheckbox.click();
            Allure.step("Clicked on Fever check box");
        } else {
            System.out.println("Fever check box is not visible");
        }
    }
    public void ClickOncovidcoughCheckboxminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Coughcheckbox, 10, "Element is Not Display");
        if (Coughcheckbox.isEnabled()) {
            Coughcheckbox.click();
            Allure.step("Clicked on Cough check box");
        } else {
            System.out.println("Cough check box is not visible");
        }
    }
    public void ClickOnSorethroatCheckboxminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), SoreTcheckbox, 10, "Element is Not Display");
        if (SoreTcheckbox.isEnabled()) {
            SoreTcheckbox.click();
            Allure.step("Clicked on Sore Throat check box");
        } else {
            System.out.println("Sore Throat check box is not visible");
        }
    }
    public void ClickOnBreathCheckboxminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Breathcheckbox, 10, "Element is Not Display");
        if (Breathcheckbox.isEnabled()) {
            Breathcheckbox.click();
            Allure.step("Clicked on Breathlessness check box");
        } else {
            System.out.println("Breathlessness check box is not visible");
        }
    }
    public void ClickOnNauseaCheckboxminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Nauseacheckbox, 10, "Element is Not Display");
        if (Nauseacheckbox.isEnabled()) {
            Nauseacheckbox.click();
            Allure.step("Clicked on Nausea check box");
        } else {
            System.out.println("Nausea check box is not visible");
        }
    }
    public void ClickOnDiarrheaCheckboxminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), Diarrheacheckbox, 10, "Element is Not Display");
        if (Diarrheacheckbox.isEnabled()) {
            Diarrheacheckbox.click();
            Allure.step("Clicked on Diarrhea check box");
        } else {
            System.out.println("Diarrhea check box is not visible");
        }
    }
    public void EnterminorProvideDetailsCommonWeb(String Providemeddetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ProvideDetailsText, 20, "Element is Not Display");
        if (ProvideDetailsText.isDisplayed()) {
            ProvideDetailsText.sendKeys(Providemeddetails);
            Allure.step( "Clicked On Provide Details Common   >"   + Providemeddetails);
        }
    }
    ///////////////////////////////////covid TESTS ///////////////////////////////////////////////////////////////////

    public void ClickOnhaveyoutestedyesminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), noval, 10, "Element is Not Display");
        if (noval.isEnabled()) {
            noval.click();
            Allure.step("Clicked on Covid TESTS button");
        } else {
            System.out.println("Covid TESTS button is not visible");
        }
    }
    public void enterdignodateminorweb(String MinorDiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), novaldig, 50,"time out to find element on page");
        if (novaldig.isDisplayed()) {
            novaldig.sendKeys(MinorDiagnosisDate);
            Allure.step("Enter Diagnosis Date   >"   +MinorDiagnosisDate);
        } else {
            System.out.println("input box is not visible");
        }
    }
    public void enterdignodateminor(String MinorDiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), novaldig2, 50,"time out to find element on page");
        if (novaldig2.isDisplayed()) {
            novaldig2.sendKeys(MinorDiagnosisDate);
            Allure.step("Enter Diagnosis Date   >"   +MinorDiagnosisDate);
        } else {
            System.out.println("input box is not visible");
        }
    }
    public void enterrecoverydateminorweb(String MinorRecoveryDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), novalrec, 50,"time out to find element on page");
        if (novalrec.isDisplayed()) {
            novalrec.sendKeys(MinorRecoveryDate);
            Allure.step("Enter Recovery Date   >"   +MinorRecoveryDate);
        } else {
            System.out.println("input box is not visible");
        }
    }
    public void enterrecoverydateminor(String MinorRecoveryDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), novalrec2, 50,"time out to find element on page");
        if (novalrec2.isDisplayed()) {
            novalrec2.sendKeys(MinorRecoveryDate);
            Allure.step("Enter Recovery Date   >"   +MinorRecoveryDate);
        } else {
            System.out.println("input box is not visible");
        }
    }
    public void ClickOnAsymptyesminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), asmptY, 10, "Element is Not Display");
        if (asmptY.isEnabled()) {
            asmptY.click();
            Allure.step("Clicked on Asymptomatic Yes button");
        } else {
        }
    }
    public void ClickOnAsymptnominorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), asmptN, 10, "Element is Not Display");
        if (asmptN.isEnabled()) {
            asmptN.click();
            Allure.step("Clicked on Asymptomatic No button");
        } else {
            System.out.println("Asymptomatic button is not visible");
        }
    }
    public void ClickOnHomequryesminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), qurntY, 10, "Element is Not Display");
        if (qurntY.isEnabled()) {
            qurntY.click();
            Allure.step("Clicked on Home Quarantine Yes button");
        } else {
            System.out.println("Home Quarantine button is not visible");
        }
    }
    public void ClickOnHomequrynominorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), qurntN, 10, "Element is Not Display");
        if (qurntN.isEnabled()) {
            qurntN.click();
            Allure.step("Clicked on Home Quarantine No button");
        } else {
            System.out.println("Home Quarantine button is not visible");
        }
    }
    public void ClickOnHospitalyesminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), hospitalY, 10, "Element is Not Display");
        if (hospitalY.isEnabled()) {
            hospitalY.click();
            Allure.step("Clicked on Hospitalized Yes button");
        } else {
            System.out.println("Hospitalized button is not visible");
        }
    }
    public void ClickOnHospitalnominorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), hospitalN, 10, "Element is Not Display");
        if (hospitalN.isEnabled()) {
            hospitalN.click();
            Allure.step("Clicked on Hospitalized No button");
        } else {
            System.out.println("Hospitalized button is not visible");
        }
    }
    public void ClickOnICUreqyesWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), ICUY, 10, "Element is Not Display");
        if (ICUY.isEnabled()) {
            ICUY.click();
            Allure.step("Clicked on ICU requirement Yes button");
        } else {
            System.out.println("ICU requirement button is not visible");
        }
    }
    public void ClickOnmachinereqyesminorWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), mchnY, 10, "Element is Not Display");
        if (mchnY.isEnabled()) {
            mchnY.click();
            Allure.step("Clicked on Machine requirement Yes button");
        } else {
            System.out.println("Machine requirement button is not visible");
        }
    }
    public void ClickOnPostDischargeyesminorWeb(String MinorTestsDetails) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), PDY, 10, "Element is Not Display");
        if (PDY.isEnabled()) {
            PDY.click();
            Allure.step("Clicked on Post Discharge Yes button");
        }
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), Dtails, 10, "Element is Not Display");
        if (Dtails.isEnabled()) {
            Dtails.click();
            Dtails.sendKeys(MinorTestsDetails);
            Allure.step("Enter on Post Discharge details  >"   +MinorTestsDetails);
        }
    }
    ///////////////// covid vaccination ////////////////////////////////////////////////////////////////////////////
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
    @FindBy(xpath = "(//div[@id='mui-component-select-414'])[2]")
    private WebElement vaccn;
    @FindBy(xpath = "(//input[@name='416'])[2]")
    private WebElement fdose;
    @FindBy(xpath = "(//input[@name='417'])[2]")
    private WebElement sdose;
    @FindBy(xpath = "(//input[@name='418'])[2]")
    private WebElement tdose;
    @FindBy(xpath = "(//button[@name='413'])[4]")
    private WebElement vccNo;




    @FindBy(xpath = "(//button[@name='403'])[3]")
    private WebElement Covidquestion;
    @FindBy(xpath = "(//button[@name='413'])[1]")
    private WebElement treatment;


    public void ClickOnhaveyoutestedCOVID19Web() {
        wait.waitForElementToBeVisibleweb(getDriver(), Covidquestion, 10, "Element is Not Display");
        if (Covidquestion.isEnabled()) {
            Covidquestion.click();
            Allure.step("Clicked on Have you ever tested positive for COVID-19? Or have you been hospitalized for COVID infection or its related complication? Or do you have ongoing complications related to COVID infection? as YES");
        } else {
            System.out.println("Covid TESTS YES button is not visible");
        }
    }

    public void ClickOntreatmenttakenWeb() {
        wait.waitForElementToBeVisibleweb(getDriver(), treatment, 10, "Element is Not Display");
        if (treatment.isEnabled()) {
            treatment.click();
            Allure.step("Clicked on Have you ever tested positive for COVID-19? Or have you been hospitalized for COVID infection or its related complication? Or do you have ongoing complications related to COVID infection? as YES");
        } else {
            System.out.println("Covid TESTS YES button is not visible");
        }
    }




}
