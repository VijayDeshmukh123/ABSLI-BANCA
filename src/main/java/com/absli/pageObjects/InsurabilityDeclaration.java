package com.absli.pageObjects;

import com.absli.base.TestBase;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurabilityDeclaration extends TestBase {

    public InsurabilityDeclaration(WebDriver driver) {
            PageFactory.initElements(getDriver(), this);
        }

        // Minor Insurability Declaration tab // 21/6/2023=mayur


    @FindBy(xpath = "(//button[contains(@name,'9000')])[1]") // yes button
    private WebElement HospBTN;
    @FindBy(xpath = "//input[contains(@name,'9004')]") // current symptoms
    private WebElement abcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'9005')]") // doctor details
    private WebElement abDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day9006')]") // day LC
    private WebElement ablcday;
    @FindBy(xpath = "//input[contains(@name,'month9006')]") // month LC
    private WebElement ablcmonth;
    @FindBy(xpath = "//input[contains(@name,'year9006')]") // year LC
    private WebElement ablcyear;
    @FindBy(xpath = "//input[contains(@name,'day9007')]") // day DD
    private WebElement abddday;
    @FindBy(xpath = "//input[contains(@name,'month9007')]") // month DD
    private WebElement abddmonth;
    @FindBy(xpath = "//input[contains(@name,'year9007')]") // year DD
    private WebElement abddyear;
    @FindBy(xpath = "//input[contains(@name,'9008')]") // DOH afw
    private WebElement abdoh;
    //-------------------------------------------------------------------------------------------------//

    @FindBy(xpath = "//button[contains(@name,'9001')]") // yes button
    private WebElement dognBTN;
    @FindBy(xpath = "//input[contains(@name,'9009')]") // current symptoms
    private WebElement dgcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'9010')]") // doctor details
    private WebElement dgDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day9011')]") // day LC
    private WebElement dglcday;
    @FindBy(xpath = "//input[contains(@name,'month9011')]") // month LC
    private WebElement dglcmonth;
    @FindBy(xpath = "//input[contains(@name,'year9011')]") // year LC
    private WebElement dglcyear;
    @FindBy(xpath = "//input[contains(@name,'day9012')]") // day DD
    private WebElement dgddday;
    @FindBy(xpath = "//input[contains(@name,'month9012')]") // month DD
    private WebElement dgddmonth;
    @FindBy(xpath = "//input[contains(@name,'year9012')]") // year DD
    private WebElement dgddyear;
    @FindBy(xpath = "//input[contains(@name,'9013')]") // DOH afw
    private WebElement dgdoh;
    //---------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "//button[contains(@name,'9002')]") // yes button
    private WebElement dognnBTN;
    @FindBy(xpath = "//input[contains(@name,'9014')]") // current symptoms
    private WebElement dgncurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'9015')]") // doctor details
    private WebElement dgnDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day9016')]") // day LC
    private WebElement dgnlcday;
    @FindBy(xpath = "//input[contains(@name,'month9016')]") // month LC
    private WebElement dgnlcmonth;
    @FindBy(xpath = "//input[contains(@name,'year9016')]") // year LC
    private WebElement dgnlcyear;
    @FindBy(xpath = "//input[contains(@name,'day9017')]") // day DD
    private WebElement dgnddday;
    @FindBy(xpath = "//input[contains(@name,'month9017')]") // month DD
    private WebElement dgnddmonth;
    @FindBy(xpath = "//input[contains(@name,'year9017')]") // year DD
    private WebElement dgnddyear;
    @FindBy(xpath = "//input[contains(@name,'9018')]") // DOH afw
    private WebElement dgndoh;
    //-------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "//button[contains(@name,'9003')]") // yes button
    private WebElement osBTN;
    @FindBy(xpath = "//input[contains(@name,'9019')]") // current symptoms
    private WebElement osncurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'9020')]") // doctor details
    private WebElement osDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day9021')]") // day LC
    private WebElement oslcday;
    @FindBy(xpath = "//input[contains(@name,'month9021')]") // month LC
    private WebElement oslcmonth;
    @FindBy(xpath = "//input[contains(@name,'year9021')]") // year LC
    private WebElement oslcyear;
    @FindBy(xpath = "//input[contains(@name,'day9022')]") // day DD
    private WebElement osddday;
    @FindBy(xpath = "//input[contains(@name,'month9022')]") // month DD
    private WebElement osddmonth;
    @FindBy(xpath = "//input[contains(@name,'year9022')]") // year DD
    private WebElement osddyear;
    @FindBy(xpath = "//input[contains(@name,'9023')]") // DOH afw
    private WebElement osdoh;
    //-----------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "//button[contains(@name,'9024')]") // yes button
    private WebElement ossBTN;
    @FindBy(xpath = "//input[contains(@name,'9025')]") // current symptoms
    private WebElement ossncurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'9026')]") // doctor details
    private WebElement ossDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day9027')]") // day LC
    private WebElement osslcday;
    @FindBy(xpath = "//input[contains(@name,'month9027')]") // month LC
    private WebElement osslcmonth;
    @FindBy(xpath = "//input[contains(@name,'year9027')]") // year LC
    private WebElement osslcyear;
    @FindBy(xpath = "//input[contains(@name,'day9028')]") // day DD
    private WebElement ossddday;
    @FindBy(xpath = "//input[contains(@name,'month9028')]") // month DD
    private WebElement ossddmonth;
    @FindBy(xpath = "//input[contains(@name,'year9028')]") // year DD
    private WebElement ossddyear;
    @FindBy(xpath = "//input[contains(@name,'9029')]") // DOH afw
    private WebElement ossdoh;

    public void Clickonhospitalization() {
        wait.waitForElementToBeVisibleweb(getDriver(), HospBTN, 20, "Element is Not Display");
        if (HospBTN.isDisplayed()) {
            HospBTN.click();
            Allure.step("Clicked on Hospitalization as YES");
        } else {
            System.out.println("Hospitalization is not visible");
        }
    }
    public void EnterHospCurrentSymptoms(String currentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Diagnosis 2']")));
        wait.waitForElementToBeVisibleweb(getDriver(), abcurrentsymtomsBTN, 20, "Element is Not Display");
        if (abcurrentsymtomsBTN.isDisplayed()) {
            abcurrentsymtomsBTN.sendKeys(currentsymptoms);
            Allure.step("Enter Current Symptoms  >"    + currentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }
    public void EnterHospDoctorDetails(String doctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abDoctorDetailsBTN, 20, "Element is Not Display");
        if (abDoctorDetailsBTN.isDisplayed()) {
            abDoctorDetailsBTN.sendKeys(doctordetails);
            Allure.step("Enter Doctor Details  >"    + doctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterHospDateOfLastConsult(String LCday, String LCmonth, String LCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), ablcday, 20, "Element is Not Display");
        ablcday.click();
        ablcday.sendKeys(LCday);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcmonth, 20, "Element is Not Display");
        ablcmonth.clear();
        ablcmonth.sendKeys(LCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcyear, 20, "Element is Not Display");
        ablcyear.clear();
        ablcyear.sendKeys(LCyear);
        Allure.step("Enter Date of Last Consult  >"    +LCday  +LCmonth  +LCyear);
    }
    public void EnterHospDateOfDiagnosis(String DDday, String DDmonth, String DDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), abddday, 20, "Element is Not Display");
        abddday.click();
        abddday.sendKeys(DDday);
        wait.waitForElementToBeVisibleweb(getDriver(), abddmonth, 20, "Element is Not Display");
        abddmonth.clear();
        abddmonth.sendKeys(DDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), abddyear, 20, "Element is Not Display");
        abddyear.clear();
        abddyear.sendKeys(DDyear);
        Allure.step("Enter Date of Diagnosis  >"    +DDday  +DDmonth  +DDyear);
    }
    public void EnterHospDetailsofHospitalization(String details) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdoh, 20, "Element is Not Display");
        if (abdoh.isDisplayed()) {
            abdoh.sendKeys(details);
            Allure.step("Enter Hospitalization Details  >"    + details);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ClickonDiagnosis1() {
        wait.waitForElementToBeVisibleweb(getDriver(), dognBTN, 20, "Element is Not Display");
        if (dognBTN.isDisplayed()) {
            dognBTN.click();
            Allure.step("Clicked on Diagnosis 1 as YES");
        } else {
            System.out.println("Diagnosis 1 is not visible");
        }
    }
    public void Enterdianosis1CurrentSymptoms(String currentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Diagnosis 1']")));
        wait.waitForElementToBeVisibleweb(getDriver(), dgcurrentsymtomsBTN, 20, "Element is Not Display");
        if (dgcurrentsymtomsBTN.isDisplayed()) {
            dgcurrentsymtomsBTN.sendKeys(currentsymptoms);
            Allure.step("Enter Current Symptoms  >"    + currentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }
    public void Enterdiagnosis1DoctorDetails(String doctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgDoctorDetailsBTN, 20, "Element is Not Display");
        if (dgDoctorDetailsBTN.isDisplayed()) {
            dgDoctorDetailsBTN.sendKeys(doctordetails);
            Allure.step("Enter Doctor Details  >"    + doctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void Enterdiagnosis1DateOfLastConsult(String LCday, String LCmonth, String LCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dglcday, 20, "Element is Not Display");
        dglcday.click();
        dglcday.sendKeys(LCday);
        wait.waitForElementToBeVisibleweb(getDriver(), dglcmonth, 20, "Element is Not Display");
        dglcmonth.clear();
        dglcmonth.sendKeys(LCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dglcyear, 20, "Element is Not Display");
        dglcyear.clear();
        dglcyear.sendKeys(LCyear);
        Allure.step("Enter Date of Last Consult  >"    +LCday  +LCmonth  +LCyear);
    }

    public void Enterdiagnosis1DateOfDiagnosis(String DDday, String DDmonth, String DDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgddday, 20, "Element is Not Display");
        dgddday.click();
        dgddday.sendKeys(DDday);
        wait.waitForElementToBeVisibleweb(getDriver(), dgddmonth, 20, "Element is Not Display");
        dgddmonth.clear();
        dgddmonth.sendKeys(DDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dgddyear, 20, "Element is Not Display");
        dgddyear.clear();
        dgddyear.sendKeys(DDyear);
        Allure.step("Enter Date of Diagnosis  >"    +DDday  +DDmonth  +DDyear);
    }
    public void Enterdiagnosis1DetailsofHospitalization(String details) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgdoh, 20, "Element is Not Display");
        if (dgdoh.isDisplayed()) {
            dgdoh.sendKeys(details);
            Allure.step("Enter Hospitalization Details  >"    + details);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ClickonDiagnosis2() {
        wait.waitForElementToBeVisibleweb(getDriver(), dognnBTN, 20, "Element is Not Display");
        if (dognnBTN.isDisplayed()) {
            dognnBTN.click();
            Allure.step("Clicked on Diagnosis 2 as YES");
        } else {
            System.out.println("Diagnosis 2 is not visible");
        }
    }
    public void Enterdianosis2CurrentSymptoms(String currentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Other symptoms']")));
        wait.waitForElementToBeVisibleweb(getDriver(), dgncurrentsymtomsBTN, 20, "Element is Not Display");
        if (dgncurrentsymtomsBTN.isDisplayed()) {
            dgncurrentsymtomsBTN.sendKeys(currentsymptoms);
            Allure.step("Enter Current Symptoms  >"    + currentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }
    public void Enterdiagnosis2DoctorDetails(String doctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgnDoctorDetailsBTN, 20, "Element is Not Display");
        if (dgnDoctorDetailsBTN.isDisplayed()) {
            dgnDoctorDetailsBTN.sendKeys(doctordetails);
            Allure.step("Enter Doctor Details  >"    + doctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void Enterdiagnosis2DateOfLastConsult(String LCday, String LCmonth, String LCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgnlcday, 20, "Element is Not Display");
        dgnlcday.click();
        dgnlcday.sendKeys(LCday);
        wait.waitForElementToBeVisibleweb(getDriver(), dgnlcmonth, 20, "Element is Not Display");
        dgnlcmonth.clear();
        dgnlcmonth.sendKeys(LCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dgnlcyear, 20, "Element is Not Display");
        dgnlcyear.clear();
        dgnlcyear.sendKeys(LCyear);
        Allure.step("Enter Date of Last Consult  >"    +LCday  +LCmonth  +LCyear);
    }
    public void Enterdiagnosis2DateOfDiagnosis(String DDday, String DDmonth, String DDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgnddday, 20, "Element is Not Display");
        dgnddday.click();
        dgnddday.sendKeys(DDday);
        wait.waitForElementToBeVisibleweb(getDriver(), dgnddmonth, 20, "Element is Not Display");
        dgnddmonth.clear();
        dgnddmonth.sendKeys(DDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dgnddyear, 20, "Element is Not Display");
        dgnddyear.clear();
        dgnddyear.sendKeys(DDyear);
        Allure.step("Enter Date of Diagnosis  >"    +DDday  +DDmonth  +DDyear);
    }
    public void Enterdiagnosis2DetailsofHospitalization(String details) {
        wait.waitForElementToBeVisibleweb(getDriver(), dgndoh, 20, "Element is Not Display");
        if (dgndoh.isDisplayed()) {
            dgndoh.sendKeys(details);
            Allure.step("Enter Hospitalization Details  >"    + details);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonOthersymptoms() {
        wait.waitForElementToBeVisibleweb(getDriver(), osBTN, 20, "Element is Not Display");
        if (osBTN.isDisplayed()) {
            osBTN.click();
            Allure.step("Clicked on Other Symptoms 1 as YES");
        } else {
            System.out.println("Other Symptoms 1 is not visible");
        }
    }
    public void EnterothersCurrentSymptoms(String currentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Other symptoms']")));
        wait.waitForElementToBeVisibleweb(getDriver(), osncurrentsymtomsBTN, 20, "Element is Not Display");
        if (osncurrentsymtomsBTN.isDisplayed()) {
            osncurrentsymtomsBTN.sendKeys(currentsymptoms);
            Allure.step("Enter Current Symptoms  >"    + currentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }
    public void EnterothersDoctorDetails(String doctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), osDoctorDetailsBTN, 20, "Element is Not Display");
        if (osDoctorDetailsBTN.isDisplayed()) {
            osDoctorDetailsBTN.sendKeys(doctordetails);
            Allure.step("Enter Doctor Details  >"    + doctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterothersDateOfLastConsult(String LCday, String LCmonth, String LCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), oslcday, 20, "Element is Not Display");
        oslcday.click();
        oslcday.sendKeys(LCday);
        wait.waitForElementToBeVisibleweb(getDriver(), oslcmonth, 20, "Element is Not Display");
        oslcmonth.clear();
        oslcmonth.sendKeys(LCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), oslcyear, 20, "Element is Not Display");
        oslcyear.clear();
        oslcyear.sendKeys(LCyear);
        Allure.step("Enter Date of Last Consult  >"    +LCday  +LCmonth  +LCyear);
    }

    public void EnterothersDateOfDiagnosis(String DDday, String DDmonth, String DDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), osddday, 20, "Element is Not Display");
        osddday.click();
        osddday.sendKeys(DDday);
        wait.waitForElementToBeVisibleweb(getDriver(), osddmonth, 20, "Element is Not Display");
        osddmonth.clear();
        osddmonth.sendKeys(DDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), osddyear, 20, "Element is Not Display");
        osddyear.clear();
        osddyear.sendKeys(DDyear);
        Allure.step("Enter Date of Diagnosis  >"    +DDday  +DDmonth  +DDyear);
    }
    public void EnterothersDetailsofHospitalization(String details) {
        wait.waitForElementToBeVisibleweb(getDriver(), osdoh, 20, "Element is Not Display");
        if (osdoh.isDisplayed()) {
            osdoh.sendKeys(details);
            Allure.step("Enter Hospitalization Details  >"    + details);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonOthersymptomstwo() {
        wait.waitForElementToBeVisibleweb(getDriver(), ossBTN, 20, "Element is Not Display");
        if (ossBTN.isDisplayed()) {
            ossBTN.click();
            Allure.step("Clicked on Other Symptoms 1 as YES");
        } else {
            System.out.println("Other Symptoms 1 is not visible");
        }
    }
    public void EnterothersCurrentSymptomstwo(String currentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Other symptoms']")));
        wait.waitForElementToBeVisibleweb(getDriver(), ossncurrentsymtomsBTN, 20, "Element is Not Display");
        if (ossncurrentsymtomsBTN.isDisplayed()) {
            ossncurrentsymtomsBTN.sendKeys(currentsymptoms);
            Allure.step("Enter Current Symptoms  >"    + currentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }
    public void EnterothersDoctorDetailstwo(String doctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), ossDoctorDetailsBTN, 20, "Element is Not Display");
        if (ossDoctorDetailsBTN.isDisplayed()) {
            ossDoctorDetailsBTN.sendKeys(doctordetails);
            Allure.step("Enter Doctor Details  >"    + doctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterothersDateOfLastConsulttwo(String LCday, String LCmonth, String LCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), osslcday, 20, "Element is Not Display");
        osslcday.click();
        osslcday.sendKeys(LCday);
        wait.waitForElementToBeVisibleweb(getDriver(), osslcmonth, 20, "Element is Not Display");
        osslcmonth.clear();
        osslcmonth.sendKeys(LCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), osslcyear, 20, "Element is Not Display");
        osslcyear.clear();
        osslcyear.sendKeys(LCyear);
        Allure.step("Enter Date of Last Consult  >"    +LCday  +LCmonth  +LCyear);
    }

    public void EnterothersDateOfDiagnosistwo(String DDday, String DDmonth, String DDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), ossddday, 20, "Element is Not Display");
        ossddday.click();
        ossddday.sendKeys(DDday);
        wait.waitForElementToBeVisibleweb(getDriver(), ossddmonth, 20, "Element is Not Display");
        ossddmonth.clear();
        ossddmonth.sendKeys(DDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), ossddyear, 20, "Element is Not Display");
        ossddyear.clear();
        ossddyear.sendKeys(DDyear);
        Allure.step("Enter Date of Diagnosis  >"    +DDday  +DDmonth  +DDyear);
    }
    public void EnterothersDetailsofHospitalizationtwo(String details) {
        wait.waitForElementToBeVisibleweb(getDriver(), ossdoh, 20, "Element is Not Display");
        if (ossdoh.isDisplayed()) {
            ossdoh.sendKeys(details);
            Allure.step("Enter Hospitalization Details  >"    + details);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }









    }
