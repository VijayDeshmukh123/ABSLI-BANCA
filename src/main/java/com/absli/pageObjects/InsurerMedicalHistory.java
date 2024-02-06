package com.absli.pageObjects;

import com.absli.base.TestBase;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurerMedicalHistory extends TestBase {

    public InsurerMedicalHistory(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // Insurer Medical History tab // 16/6/2023=mayur

    @FindBy(xpath = "(//button[contains(@name,'8080')])[1]") // yes button
    private WebElement AbsentBTN;
    @FindBy(xpath = "//input[contains(@name,'8087')]") // current symptoms
    private WebElement abcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8088')]") // doctor details
    private WebElement abDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8089')]") // day LC
    private WebElement ablcday;
    @FindBy(xpath = "//input[contains(@name,'month8089')]") // month LC
    private WebElement ablcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8089')]") // year LC
    private WebElement ablcyear;
    @FindBy(xpath = "//input[contains(@name,'day8090')]") // day DD
    private WebElement abddday;
    @FindBy(xpath = "//input[contains(@name,'month8090')]") // month DD
    private WebElement abddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8090')]") // year DD
    private WebElement abddyear;
    @FindBy(xpath = "//input[contains(@name,'8091')]") // DOH afw
    private WebElement abdoh;
    //------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8081')])[1]") // yes button
    private WebElement HospBTN;
    @FindBy(xpath = "//input[contains(@name,'8092')]") // current symptoms
    private WebElement hoscurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8093')]") // doctor details
    private WebElement hosDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8095')]") // day LC
    private WebElement hoslcday;
    @FindBy(xpath = "//input[contains(@name,'month8095')]") // month LC
    private WebElement hoslcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8095')]") // year LC
    private WebElement hoslcyear;
    @FindBy(xpath = "//input[contains(@name,'day8096')]") // day DD
    private WebElement hosddday;
    @FindBy(xpath = "//input[contains(@name,'month8096')]") // month DD
    private WebElement hosddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8096')]") // year DD
    private WebElement hosddyear;
    @FindBy(xpath = "//input[contains(@name,'8094')]") // DOH afw
    private WebElement hosdoh;
    //------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8083')])[1]") // yes button
    private WebElement DsdrBTN;
    @FindBy(xpath = "//input[contains(@name,'8097')]") // current symptoms
    private WebElement dsdrcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8098')]") // doctor details
    private WebElement dsdrDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8099')]") // day LC
    private WebElement dsdrlcday;
    @FindBy(xpath = "//input[contains(@name,'month8099')]") // month LC
    private WebElement dsdrlcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8099')]") // year LC
    private WebElement dsdrlcyear;
    @FindBy(xpath = "//input[contains(@name,'day8100')]") // day DD
    private WebElement dsdrddday;
    @FindBy(xpath = "//input[contains(@name,'month8100')]") // month DD
    private WebElement dsdrddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8100')]") // year DD
    private WebElement dsdrddyear;
    @FindBy(xpath = "//input[contains(@name,'8101')]") // DOH afw
    private WebElement dsdrdoh;
    //------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8084')])[1]") // yes button
    private WebElement spBTN;
    @FindBy(xpath = "//input[contains(@name,'8102')]") // current symptoms
    private WebElement spcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8103')]") // doctor details
    private WebElement spDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8104')]") // day LC
    private WebElement splcday;
    @FindBy(xpath = "//input[contains(@name,'month8104')]") // month LC
    private WebElement splcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8104')]") // year LC
    private WebElement splcyear;
    @FindBy(xpath = "//input[contains(@name,'day8105')]") // day DD
    private WebElement spddday;
    @FindBy(xpath = "//input[contains(@name,'month8105')]") // month DD
    private WebElement spddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8105')]") // year DD
    private WebElement spddyear;
    @FindBy(xpath = "//input[contains(@name,'8106')]") // DOH afw
    private WebElement spdoh;
    //-----------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8085')])[1]") // yes button
    private WebElement osBTN;
    @FindBy(xpath = "//input[contains(@name,'8107')]") // current symptoms
    private WebElement oscurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8108')]") // doctor details
    private WebElement osDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8109')]") // day LC
    private WebElement oslcday;
    @FindBy(xpath = "//input[contains(@name,'month8109')]") // month LC
    private WebElement oslcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8109')]") // year LC
    private WebElement oslcyear;
    @FindBy(xpath = "//input[contains(@name,'day8110')]") // day DD
    private WebElement osddday;
    @FindBy(xpath = "//input[contains(@name,'month8110')]") // month DD
    private WebElement osddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8110')]") // year DD
    private WebElement osddyear;
    @FindBy(xpath = "//input[contains(@name,'8111')]") // DOH afw
    private WebElement osdoh;
    @FindBy(xpath = "//input[contains(@name,'noToAll')]") // no to all
    private WebElement ntall;
    //---------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8080')])[2]") // no button
    private WebElement AbsentBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8081')])[2]") // no button
    private WebElement HospBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8083')])[2]") // no button
    private WebElement DsdrBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8084')])[2]") // no button
    private WebElement spBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8085')])[2]") // no button
    private WebElement osBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8082')])[2]") // no button
    private WebElement alignBTNno;
    //---------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8144')])[1]") // yes button
    private WebElement AbsentBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8145')]") // current symptoms
    private WebElement abcurrentsymtomsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8146')]") // doctor details
    private WebElement abDoctorDetailsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8147')]") // day LC
    private WebElement ablcdayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8147')]") // month LC
    private WebElement ablcmonthfmp;
    @FindBy(xpath = "//input[contains(@name,'year8147')]") // year LC
    private WebElement ablcyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8148')]") // day DD
    private WebElement abdddayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8148')]") // month DD
    private WebElement abddmonthfmpa;
    @FindBy(xpath = "//input[contains(@name,'year8148')]") // year DD
    private WebElement abddyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'8149')]") // DOH afw
    private WebElement abdohfmpa;
    //---------------------------------------------------------------------------------------------------------------//

    @FindBy(xpath = "(//button[contains(@name,'8150')])[1]") // yes button
    private WebElement trtmntBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8151')]") // current symptoms
    private WebElement trtcurrentsymtomsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8152')]") // doctor details
    private WebElement trtDoctorDetailsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8153')]") // day LC
    private WebElement trtlcdayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8153')]") // month LC
    private WebElement trtlcmonthfmp;
    @FindBy(xpath = "//input[contains(@name,'year8153')]") // year LC
    private WebElement trtlcyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8154')]") // day DD
    private WebElement trtdddayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8154')]") // month DD
    private WebElement trtddmonthfmpa;
    @FindBy(xpath = "//input[contains(@name,'year8154')]") // year DD
    private WebElement trtdyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'8155')]") // DOH afw
    private WebElement trtdohfmpa;
    //-------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8084')])[1]") // yes button
    private WebElement sphltBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8102')]") // current symptoms
    private WebElement sphlcurrentsymtomsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'8103')]") // doctor details
    private WebElement sphlDoctorDetailsBTNfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8104')]") // day LC
    private WebElement sphllcdayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8104')]") // month LC
    private WebElement sphllcmonthfmp;
    @FindBy(xpath = "//input[contains(@name,'year8104')]") // year LC
    private WebElement sphllcyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'day8105')]") // day DD
    private WebElement sphldddayfmpa;
    @FindBy(xpath = "//input[contains(@name,'month8105')]") // month DD
    private WebElement sphlddmonthfmpa;
    @FindBy(xpath = "//input[contains(@name,'year8105')]") // year DD
    private WebElement sphldyearfmpa;
    @FindBy(xpath = "//input[contains(@name,'8106')]") // DOH afw
    private WebElement sphldohfmpa;
    //---------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8144')])[2]") // Hosp No fmp A
    private WebElement AbsentBTNfmpaNO;
    @FindBy(xpath = "(//button[contains(@name,'8150')])[2]") // Treat No fmp A
    private WebElement trtmntBTNfmpaNO;
    @FindBy(xpath = "(//button[contains(@name,'8084')])[2]") // Sp health No fmp A
    private WebElement sphltBTNfmpaNO;
    //--------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8086')])[1]") // yes button
    private WebElement pregnantBTN;
    @FindBy(xpath = "//input[contains(@name,'8133')]") // No. of weeks button
    private WebElement prgntweek;
    @FindBy(xpath = "//input[contains(@name,'8134')]") // current symptoms
    private WebElement prgntcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8135')]") // doctor details
    private WebElement prgntDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8136')]") // day LC
    private WebElement prgntlcday;
    @FindBy(xpath = "//input[contains(@name,'month8136')]") // month LC
    private WebElement prgntlcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8136')]") // year LC
    private WebElement prgntlcyear;
    @FindBy(xpath = "//input[contains(@name,'day8137')]") // day DD
    private WebElement prgntddday;
    @FindBy(xpath = "//input[contains(@name,'month8137')]") // month DD
    private WebElement prgntddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8137')]") // year DD
    private WebElement prgntddyear;
    @FindBy(xpath = "//input[contains(@name,'8138')]") // DOH afw
    private WebElement prgntdoh;
    //--------------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8132')])[1]") // yes button
    private WebElement gynoBTN;
    @FindBy(xpath = "//input[contains(@name,'8139')]") // current symptoms
    private WebElement gytnocurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8140')]") // doctor details
    private WebElement gynoDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'day8141')]") // day LC
    private WebElement gynolcday;
    @FindBy(xpath = "//input[contains(@name,'month8141')]") // month LC
    private WebElement gynolcmonth;
    @FindBy(xpath = "//input[contains(@name,'year8141')]") // year LC
    private WebElement gynolcyear;
    @FindBy(xpath = "//input[contains(@name,'day8142')]") // day DD
    private WebElement gynoddday;
    @FindBy(xpath = "//input[contains(@name,'month8142')]") // month DD
    private WebElement gynoddmonth;
    @FindBy(xpath = "//input[contains(@name,'year8142')]") // year DD
    private WebElement gynoddyear;
    @FindBy(xpath = "//input[contains(@name,'8143')]") // DOH afw
    private WebElement gynodoh;
    //-----------------------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8086')])[2]") // No button
    private WebElement pregnantNOBTN;
    @FindBy(xpath = "(//button[contains(@name,'8132')])[2]") // No button
    private WebElement gynoNOBTN;

    // Absent from work //////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonAbsentfromWork() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTN, 20, "Element is Not Display");
        if (AbsentBTN.isDisplayed()) {
            AbsentBTN.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptoms(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), abcurrentsymtomsBTN, 20, "Element is Not Display");
        if (abcurrentsymtomsBTN.isDisplayed()) {
            abcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abDoctorDetailsBTN, 20, "Element is Not Display");
        if (abDoctorDetailsBTN.isDisplayed()) {
            abDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsult(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), ablcday, 20, "Element is Not Display");
        ablcday.click();
        ablcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcmonth, 20, "Element is Not Display");
        ablcmonth.clear();
        ablcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcyear, 20, "Element is Not Display");
        ablcyear.clear();
        ablcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosis(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), abddday, 20, "Element is Not Display");
        abddday.click();
        abddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), abddmonth, 20, "Element is Not Display");
        abddmonth.clear();
        abddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), abddyear, 20, "Element is Not Display");
        abddyear.clear();
        abddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdoh, 20, "Element is Not Display");
        if (abdoh.isDisplayed()) {
            abdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////// hospitalization ////////////////////////////////////////////////////////////////////////
    public void Clickonhospitalization() {
        wait.waitForElementToBeVisibleweb(getDriver(), HospBTN, 20, "Element is Not Display");
        if (HospBTN.isDisplayed()) {
            HospBTN.click();
            Allure.step("Clicked on Hospitalization as YES");
        } else {
            System.out.println("Hospitalization is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomhos(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Ailments']")));
        wait.waitForElementToBeVisibleweb(getDriver(), hoscurrentsymtomsBTN, 20, "Element is Not Display");
        if (hoscurrentsymtomsBTN.isDisplayed()) {
            hoscurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailshos(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), hosDoctorDetailsBTN, 20, "Element is Not Display");
        if (hosDoctorDetailsBTN.isDisplayed()) {
            hosDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsulthos(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), hoslcday, 20, "Element is Not Display");
        hoslcday.click();
        hoslcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), hoslcmonth, 20, "Element is Not Display");
        hoslcmonth.clear();
        hoslcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), hoslcyear, 20, "Element is Not Display");
        hoslcyear.clear();
        hoslcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosishos(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), hosddday, 20, "Element is Not Display");
        hosddday.click();
        hosddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), hosddmonth, 20, "Element is Not Display");
        hosddmonth.clear();
        hosddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), hosddyear, 20, "Element is Not Display");
        hosddyear.clear();
        hosddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationhos(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), hosdoh, 20, "Element is Not Display");
        if (hosdoh.isDisplayed()) {
            hosdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////// Disorder ///////////////////////////////
    public void ClickonDisorder() {
        wait.waitForElementToBeVisibleweb(getDriver(), DsdrBTN, 20, "Element is Not Display");
        if (DsdrBTN.isDisplayed()) {
            DsdrBTN.click();
            Allure.step("Clicked on Disorder as YES");
        } else {
            System.out.println("Disorder is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomdsdr(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Spouse Health']")));
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrcurrentsymtomsBTN, 20, "Element is Not Display");
        if (dsdrcurrentsymtomsBTN.isDisplayed()) {
            dsdrcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsdsdr(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrDoctorDetailsBTN, 20, "Element is Not Display");
        if (dsdrDoctorDetailsBTN.isDisplayed()) {
            dsdrDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultdsdr(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrlcday, 20, "Element is Not Display");
        dsdrlcday.click();
        dsdrlcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrlcmonth, 20, "Element is Not Display");
        dsdrlcmonth.clear();
        dsdrlcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrlcyear, 20, "Element is Not Display");
        dsdrlcyear.clear();
        dsdrlcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosisdsdr(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrddday, 20, "Element is Not Display");
        dsdrddday.click();
        dsdrddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrddmonth, 20, "Element is Not Display");
        dsdrddmonth.clear();
        dsdrddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrddyear, 20, "Element is Not Display");
        dsdrddyear.clear();
        dsdrddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationdsdr(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), dsdrdoh, 20, "Element is Not Display");
        if (dsdrdoh.isDisplayed()) {
            dsdrdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////Spouse health /////////////
    public void ClickonSpouseHealth() {
        wait.waitForElementToBeVisibleweb(getDriver(), spBTN, 20, "Element is Not Display");
        if (spBTN.isDisplayed()) {
            spBTN.click();
            Allure.step("Clicked on Spouse Health as YES");
        } else {
            System.out.println("Spouse Health is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomspouse(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Other symptoms']")));
        wait.waitForElementToBeVisibleweb(getDriver(), spcurrentsymtomsBTN, 20, "Element is Not Display");
        if (spcurrentsymtomsBTN.isDisplayed()) {
            spcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsspouse(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), spDoctorDetailsBTN, 20, "Element is Not Display");
        if (spDoctorDetailsBTN.isDisplayed()) {
            spDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultdspouse(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), splcday, 20, "Element is Not Display");
        splcday.click();
        splcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), splcmonth, 20, "Element is Not Display");
        splcmonth.clear();
        splcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), splcyear, 20, "Element is Not Display");
        splcyear.clear();
        splcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosisspouse(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), spddday, 20, "Element is Not Display");
        spddday.click();
        spddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), spddmonth, 20, "Element is Not Display");
        spddmonth.clear();
        spddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), spddyear, 20, "Element is Not Display");
        spddyear.clear();
        spddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationspouse(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), spdoh, 20, "Element is Not Display");
        if (spdoh.isDisplayed()) {
            spdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////// other sympotms //////////////////////
    public void Clickonothersymp() {
        wait.waitForElementToBeVisibleweb(getDriver(), osBTN, 20, "Element is Not Display");
        if (osBTN.isDisplayed()) {
            osBTN.click();
            Allure.step("Clicked on Other Symptoms as YES");
        } else {
            System.out.println("Other Symptoms is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomother(String AFWcurrentsymptoms) {
        TestUtil.scrollTillEndOfPage(getDriver());
        wait.waitForElementToBeVisibleweb(getDriver(), oscurrentsymtomsBTN, 20, "Element is Not Display");
        if (oscurrentsymtomsBTN.isDisplayed()) {
            oscurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsother(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), osDoctorDetailsBTN, 20, "Element is Not Display");
        if (osDoctorDetailsBTN.isDisplayed()) {
            osDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultdother(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), oslcday, 20, "Element is Not Display");
        oslcday.click();
        oslcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), oslcmonth, 20, "Element is Not Display");
        oslcmonth.clear();
        oslcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), oslcyear, 20, "Element is Not Display");
        oslcyear.clear();
        oslcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAbsentfromWorkDateOfDiagnosisother(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), osddday, 20, "Element is Not Display");
        osddday.click();
        osddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), osddmonth, 20, "Element is Not Display");
        osddmonth.clear();
        osddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), osddyear, 20, "Element is Not Display");
        osddyear.clear();
        osddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAbsentfromWorkDetailsofHospitalizationother(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), osdoh, 20, "Element is Not Display");
        if (osdoh.isDisplayed()) {
            osdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Clickononotoall() {
        wait.waitForElementToBeVisibleweb(getDriver(), ntall, 20, "Element is Not Display");
        if (ntall.isEnabled()) {
            ntall.click();
            Allure.step("Clicked on No To All check box");
        } else {
            System.out.println("No to All check box is not visible");
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ClickonAbsentfromWorkNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNno, 20, "Element is Not Display");
        if (AbsentBTNno.isDisplayed()) {
            AbsentBTNno.click();
            Allure.step("Clicked on Absent From Work as NO");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void ClickonhospitalizationNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), HospBTNno, 20, "Element is Not Display");
        if (HospBTNno.isDisplayed()) {
            HospBTNno.click();
            Allure.step("Clicked on Hospitalization as NO");
        } else {
            System.out.println("Hospitalization is not visible");
        }
    }

    public void ClickonDisorderNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), DsdrBTNno, 20, "Element is Not Display");
        if (DsdrBTNno.isDisplayed()) {
            DsdrBTNno.click();
            Allure.step("Clicked on Disorder as NO");
        } else {
            System.out.println("Disorder is not visible");
        }
    }

    public void ClickonSpouseHealthNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), spBTNno, 20, "Element is Not Display");
        if (spBTNno.isDisplayed()) {
            spBTNno.click();
            Allure.step("Clicked on Spouse Health as NO");
        } else {
            System.out.println("Spouse Health is not visible");
        }
    }

    public void ClickonothersympNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), osBTNno, 20, "Element is Not Display");
        if (osBTNno.isDisplayed()) {
            osBTNno.click();
            Allure.step("Clicked on Other Symptoms as NO");
        } else {
            System.out.println("Other Symptoms is not visible");
        }
    }

    public void ClickonAilmentsNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), alignBTNno, 20, "Element is Not Display");
        if (alignBTNno.isDisplayed()) {
            alignBTNno.click();
            Allure.step("Clicked on Ailments as NO");
        } else {
            System.out.println("Ailments is not visible");
        }
    }

    //////////////////////////////////////// fmp A plan //////////////////
    public void ClickonHospitalizationfmpa() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNfmpa, 20, "Element is Not Display");
        if (AbsentBTNfmpa.isDisplayed()) {
            AbsentBTNfmpa.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterHospitalizationCurrentSymptomsfmpa(String currentsymptomsA) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), abcurrentsymtomsBTNfmpa, 20, "Element is Not Display");
        if (abcurrentsymtomsBTNfmpa.isDisplayed()) {
            abcurrentsymtomsBTNfmpa.sendKeys(currentsymptomsA);
            Allure.step("Enter Current Symptoms  >" + currentsymptomsA);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterHospitalizationDoctorDetailsfmpa(String doctordetailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), abDoctorDetailsBTNfmpa, 20, "Element is Not Display");
        if (abDoctorDetailsBTNfmpa.isDisplayed()) {
            abDoctorDetailsBTNfmpa.sendKeys(doctordetailsA);
            Allure.step("Enter Doctor Details  >" + doctordetailsA);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterHospitalizationDateOfLastConsultfmpa(String LCdayA, String LCmonthA, String LCyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), ablcdayfmpa, 20, "Element is Not Display");
        ablcdayfmpa.click();
        ablcdayfmpa.sendKeys(LCdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcmonthfmp, 20, "Element is Not Display");
        ablcmonthfmp.clear();
        ablcmonthfmp.sendKeys(LCmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), ablcyearfmpa, 20, "Element is Not Display");
        ablcyearfmpa.clear();
        ablcyearfmpa.sendKeys(LCyearA);
        Allure.step("Enter Date of Last Consult  >" + LCdayA + LCmonthA + LCyearA);
    }

    public void EnterHospitalizationDateOfDiagnosisfmpa(String DDdayA, String DDmonthA, String DDyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdddayfmpa, 20, "Element is Not Display");
        abdddayfmpa.click();
        abdddayfmpa.sendKeys(DDdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), abddmonthfmpa, 20, "Element is Not Display");
        abddmonthfmpa.clear();
        abddmonthfmpa.sendKeys(DDmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), abddyearfmpa, 20, "Element is Not Display");
        abddyearfmpa.clear();
        abddyearfmpa.sendKeys(DDyearA);
        Allure.step("Enter Date of Diagnosis  >" + DDdayA + DDmonthA + DDyearA);
    }

    public void EnterHospitalizationDetailsofHospitalizationfmpa(String detailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdohfmpa, 20, "Element is Not Display");
        if (abdohfmpa.isDisplayed()) {
            abdohfmpa.sendKeys(detailsA);
            Allure.step("Enter Hospitalization Details  >" + detailsA);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonTreatmentfmpa() {
        wait.waitForElementToBeVisibleweb(getDriver(), trtmntBTNfmpa, 20, "Element is Not Display");
        if (trtmntBTNfmpa.isDisplayed()) {
            trtmntBTNfmpa.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterTreatmentCurrentSymptomsfmpa(String currentsymptomsA) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), trtcurrentsymtomsBTNfmpa, 20, "Element is Not Display");
        if (trtcurrentsymtomsBTNfmpa.isDisplayed()) {
            trtcurrentsymtomsBTNfmpa.sendKeys(currentsymptomsA);
            Allure.step("Enter Current Symptoms  >" + currentsymptomsA);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterTreatmentDoctorDetailsfmpa(String doctordetailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtDoctorDetailsBTNfmpa, 20, "Element is Not Display");
        if (trtDoctorDetailsBTNfmpa.isDisplayed()) {
            trtDoctorDetailsBTNfmpa.sendKeys(doctordetailsA);
            Allure.step("Enter Doctor Details  >" + doctordetailsA);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterTreatmentDateOfLastConsultfmpa(String LCdayA, String LCmonthA, String LCyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtlcdayfmpa, 20, "Element is Not Display");
        trtlcdayfmpa.click();
        trtlcdayfmpa.sendKeys(LCdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtlcmonthfmp, 20, "Element is Not Display");
        trtlcmonthfmp.clear();
        trtlcmonthfmp.sendKeys(LCmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtlcyearfmpa, 20, "Element is Not Display");
        trtlcyearfmpa.clear();
        trtlcyearfmpa.sendKeys(LCyearA);
        Allure.step("Enter Date of Last Consult  >" + LCdayA + LCmonthA + LCyearA);
    }

    public void EnterTreatmentDateOfDiagnosisfmpa(String DDdayA, String DDmonthA, String DDyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtdddayfmpa, 20, "Element is Not Display");
        trtdddayfmpa.click();
        trtdddayfmpa.sendKeys(DDdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtddmonthfmpa, 20, "Element is Not Display");
        trtddmonthfmpa.clear();
        trtddmonthfmpa.sendKeys(DDmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), trtdyearfmpa, 20, "Element is Not Display");
        trtdyearfmpa.clear();
        trtdyearfmpa.sendKeys(DDyearA);
        Allure.step("Enter Date of Diagnosis  >" + DDdayA + DDmonthA + DDyearA);
    }

    public void EnterTreatmentDetailsofHospitalizationfmpa(String detailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), trtdohfmpa, 20, "Element is Not Display");
        if (trtdohfmpa.isDisplayed()) {
            trtdohfmpa.sendKeys(detailsA);
            Allure.step("Enter Hospitalization Details  >" + detailsA);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ClickonSphealthmentfmpa() {
        wait.waitForElementToBeVisibleweb(getDriver(), sphltBTNfmpa, 20, "Element is Not Display");
        if (sphltBTNfmpa.isDisplayed()) {
            sphltBTNfmpa.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterSphealthCurrentSymptomsfmpa(String currentsymptomsA) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='Hospitalization']")));
        wait.waitForElementToBeVisibleweb(getDriver(), sphlcurrentsymtomsBTNfmpa, 20, "Element is Not Display");
        if (sphlcurrentsymtomsBTNfmpa.isDisplayed()) {
            sphlcurrentsymtomsBTNfmpa.sendKeys(currentsymptomsA);
            Allure.step("Enter Current Symptoms  >" + currentsymptomsA);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterSphealthDoctorDetailsfmpa(String doctordetailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphlDoctorDetailsBTNfmpa, 20, "Element is Not Display");
        if (sphlDoctorDetailsBTNfmpa.isDisplayed()) {
            sphlDoctorDetailsBTNfmpa.sendKeys(doctordetailsA);
            Allure.step("Enter Doctor Details  >" + doctordetailsA);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterSphealthDateOfLastConsultfmpa(String LCdayA, String LCmonthA, String LCyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphllcdayfmpa, 20, "Element is Not Display");
        sphllcdayfmpa.click();
        sphllcdayfmpa.sendKeys(LCdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphllcmonthfmp, 20, "Element is Not Display");
        sphllcmonthfmp.clear();
        sphllcmonthfmp.sendKeys(LCmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphllcyearfmpa, 20, "Element is Not Display");
        sphllcyearfmpa.clear();
        sphllcyearfmpa.sendKeys(LCyearA);
        Allure.step("Enter Date of Last Consult  >" + LCdayA + LCmonthA + LCyearA);
    }

    public void EnterSphealthDateOfDiagnosisfmpa(String DDdayA, String DDmonthA, String DDyearA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphldddayfmpa, 20, "Element is Not Display");
        sphldddayfmpa.click();
        sphldddayfmpa.sendKeys(DDdayA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphlddmonthfmpa, 20, "Element is Not Display");
        sphlddmonthfmpa.clear();
        sphlddmonthfmpa.sendKeys(DDmonthA);
        wait.waitForElementToBeVisibleweb(getDriver(), sphldyearfmpa, 20, "Element is Not Display");
        sphldyearfmpa.clear();
        sphldyearfmpa.sendKeys(DDyearA);
        Allure.step("Enter Date of Diagnosis  >" + DDdayA + DDmonthA + DDyearA);
    }

    public void EnterSphealthDetailsofHospitalizationfmpa(String detailsA) {
        wait.waitForElementToBeVisibleweb(getDriver(), sphldohfmpa, 20, "Element is Not Display");
        if (sphldohfmpa.isDisplayed()) {
            sphldohfmpa.sendKeys(detailsA);
            Allure.step("Enter Hospitalization Details  >" + detailsA);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////


    public void ClickonHospitalizationfmpaNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNfmpaNO, 20, "Element is Not Display");
        if (AbsentBTNfmpaNO.isDisplayed()) {
            AbsentBTNfmpaNO.click();
            Allure.step("Clicked on Absent From Work as NO");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void ClickonTreatmentfmpaNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), trtmntBTNfmpaNO, 20, "Element is Not Display");
        if (trtmntBTNfmpaNO.isDisplayed()) {
            trtmntBTNfmpaNO.click();
            Allure.step("Clicked on Treatment as NO");
        } else {
            System.out.println("Treatment is not visible");
        }
    }

    public void ClickonSphealthmentfmpaNO() {
        wait.waitForElementToBeVisibleweb(getDriver(), sphltBTNfmpaNO, 20, "Element is Not Display");
        if (sphltBTNfmpaNO.isDisplayed()) {
            sphltBTNfmpaNO.click();
            Allure.step("Clicked on Spouse Health as NO");
        } else {
            System.out.println("Spouse Health is not visible");
        }
    }
//////////////////////////////////////////// for female lives only ////////////////////////////////////////////

    public void ClickonAreyoupregnant() {
        wait.waitForElementToBeVisibleweb(getDriver(), pregnantBTN, 20, "Element is Not Display");
        if (pregnantBTN.isDisplayed()) {
            pregnantBTN.click();
            Allure.step("Clicked on Are you pregnant? as YES");
        } else {
            System.out.println("Are you pregnant? is not visible");
        }
    }
    public void EnterAreyoupregnantnumberofweeks(String NoofWeeeks) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntweek, 20, "Element is Not Display");
        if (prgntweek.isDisplayed()) {
            prgntweek.sendKeys(NoofWeeeks);
            Allure.step("Enter No. of Weeks  >" + NoofWeeeks);
        } else {
            System.out.println("No. of Weeks details input box is not visible");
        }
    }

    public void EnterAreyoupregnantCurrentSymptoms(String AFWcurrentsymptoms) {
        TestUtil.scrollToElement(getDriver(), getDriver().findElement(By.xpath("//div[text()='For Females lives only']")));
        wait.waitForElementToBeVisibleweb(getDriver(), prgntcurrentsymtomsBTN, 20, "Element is Not Display");
        if (prgntcurrentsymtomsBTN.isDisplayed()) {
            prgntcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAreyoupregnantDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntDoctorDetailsBTN, 20, "Element is Not Display");
        if (prgntDoctorDetailsBTN.isDisplayed()) {
            prgntDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAreyoupregnantDateOfLastConsult(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntlcday, 20, "Element is Not Display");
        prgntlcday.click();
        prgntlcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntlcmonth, 20, "Element is Not Display");
        prgntlcmonth.clear();
        prgntlcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntlcyear, 20, "Element is Not Display");
        prgntlcyear.clear();
        prgntlcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EnterAreyoupregnantDateOfDiagnosis(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntddday, 20, "Element is Not Display");
        prgntddday.click();
        prgntddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntddmonth, 20, "Element is Not Display");
        prgntddmonth.clear();
        prgntddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), prgntddyear, 20, "Element is Not Display");
        prgntddyear.clear();
        prgntddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EnterAreyoupregnantDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), prgntdoh, 20, "Element is Not Display");
        if (prgntdoh.isDisplayed()) {
            prgntdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

///////////////////////////////////////////////////////gyno////////////////////////////////////////////////////////

    public void Clickongynaecological() {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoBTN, 20, "Element is Not Display");
        if (gynoBTN.isDisplayed()) {
            gynoBTN.click();
            Allure.step("Clicked on Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? as YES");
        } else {
            System.out.println("Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? is not visible");
        }
    }
    public void EntergynaecologicalCurrentSymptoms(String AFWcurrentsymptoms) {
        TestUtil.scrollTillEndOfPage(getDriver());
        wait.waitForElementToBeVisibleweb(getDriver(), gytnocurrentsymtomsBTN, 20, "Element is Not Display");
        if (gytnocurrentsymtomsBTN.isDisplayed()) {
            gytnocurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EntergynaecologicalDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoDoctorDetailsBTN, 20, "Element is Not Display");
        if (gynoDoctorDetailsBTN.isDisplayed()) {
            gynoDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EntergynaecologicalDateOfLastConsult(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynolcday, 20, "Element is Not Display");
        gynolcday.click();
        gynolcday.sendKeys(AFWLCday);
        wait.waitForElementToBeVisibleweb(getDriver(), gynolcmonth, 20, "Element is Not Display");
        gynolcmonth.clear();
        gynolcmonth.sendKeys(AFWLCmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), gynolcyear, 20, "Element is Not Display");
        gynolcyear.clear();
        gynolcyear.sendKeys(AFWLCyear);
        Allure.step("Enter Date of Last Consult  >" + AFWLCday + AFWLCmonth + AFWLCyear);
    }

    public void EntergynaecologicalDateOfDiagnosis(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoddday, 20, "Element is Not Display");
        gynoddday.click();
        gynoddday.sendKeys(AFWDDday);
        wait.waitForElementToBeVisibleweb(getDriver(), gynoddmonth, 20, "Element is Not Display");
        gynoddmonth.clear();
        gynoddmonth.sendKeys(AFWDDmonth);
        wait.waitForElementToBeVisibleweb(getDriver(), gynoddyear, 20, "Element is Not Display");
        gynoddyear.clear();
        gynoddyear.sendKeys(AFWDDyear);
        Allure.step("Enter Date of Diagnosis  >" + AFWDDday + AFWDDmonth + AFWDDyear);
    }

    public void EntergynaecologicalDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), gynodoh, 20, "Element is Not Display");
        if (gynodoh.isDisplayed()) {
            gynodoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

//////////////////////////////////////////////////////////////////////////////

    public void ClickonAreyoupregnantNo() {
        wait.waitForElementToBeVisibleweb(getDriver(), pregnantNOBTN, 20, "Element is Not Display");
        if (pregnantNOBTN.isDisplayed()) {
            pregnantNOBTN.click();
            Allure.step("Clicked on Are you pregnant? as NO");
        } else {
            System.out.println("Are you pregnant? is not visible");
        }
    }
    public void ClickongynaecologicalNo() {
        wait.waitForElementToBeVisibleweb(getDriver(), gynoNOBTN, 20, "Element is Not Display");
        if (gynoNOBTN.isDisplayed()) {
            gynoNOBTN.click();
            Allure.step("Clicked on Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? as NO");
        } else {
            System.out.println("Have you suffered from or do you have any gynaecological problems or illness related to uterus/ovaries or breasts? is not visible");
        }
    }


// Ailments //

    @FindBy(xpath = "(//button[contains(@name,'8082')])[1]") // yes button
    private WebElement AilmentBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[1]") // Heart Issue Check Box
    private WebElement AilmentHeartrBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[2]") // Breath Issue Check Box
    private WebElement AilmentBreathBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[3]") // Diabetes Check Box
    private WebElement AilmentDiabetesBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[4]") // Ulcer Check Box
    private WebElement AilmentUlcerBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[5]") // Paralysis Check Box
    private WebElement AilmentParalysisBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[6]") // Kidney Check Box
    private WebElement AilmentKidneyBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[7]") // Arthritis Check Box
    private WebElement AilmentArthritisBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[8]") // Eye/Ear Check Box
    private WebElement AilmentEyeEarBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[9]") // Tumor Check Box
    private WebElement AilmentTumorBTN;
    @FindBy(xpath = "(//div//input[@id='accordian-checkbox']/parent::span)[10]") // Others Check Box
    private WebElement AilmentOthersBTN;

    public void ClickonAilments() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentBTN, 20, "Element is Not Display");
        if (AilmentBTN.isDisplayed()) {
            AilmentBTN.click();
            Allure.step("Clicked on Ailments as YES");
        } else {
            System.out.println("Ailments is not visible");
        }
    }
    public void ClickonAilmentsHeartIssue() {
        TestUtil.scrollToElement(getDriver(),AilmentHeartrBTN);
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentHeartrBTN, 20, "Element is Not Display");
        if (AilmentHeartrBTN.isDisplayed()) {
            AilmentHeartrBTN.click();
            Allure.step("Clicked on Ailments- Heart Issue as YES");
        } else {
            System.out.println("Ailments-Heart Issue is not visible");
        }
    }

    public void ClickonAilmentsbreathIssue() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentBreathBTN, 20, "Element is Not Display");
        if (AilmentBreathBTN.isDisplayed()) {
            AilmentBreathBTN.click();
            Allure.step("Clicked on Ailments- Breath Issue as YES");
        } else {
            System.out.println("Ailments-Breath Issue is not visible");
        }
    }
    public void ClickonAilmentsDiabetes() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentDiabetesBTN, 20, "Element is Not Display");
        if (AilmentDiabetesBTN.isDisplayed()) {
            AilmentDiabetesBTN.click();
            Allure.step("Clicked on Ailments- Diabetes as YES");
        } else {
            System.out.println("Ailments-Diabetes is not visible");
        }
    }

    public void ClickonAilmentsUlcer() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentUlcerBTN, 20, "Element is Not Display");
        if (AilmentUlcerBTN.isDisplayed()) {
            AilmentUlcerBTN.click();
            Allure.step("Clicked on Ailments- Ulcer as YES");
        } else {
            System.out.println("Ailments-Ulcer is not visible");
        }
    }
    public void ClickonAilmentsParalysis() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentParalysisBTN, 20, "Element is Not Display");
        if (AilmentParalysisBTN.isDisplayed()) {
            AilmentParalysisBTN.click();
            Allure.step("Clicked on Ailments- Paralysis as YES");
        } else {
            System.out.println("Ailments-Paralysis is not visible");
        }
    }
    public void ClickonAilmentsKidney() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentKidneyBTN, 20, "Element is Not Display");
        if (AilmentKidneyBTN.isDisplayed()) {
            AilmentKidneyBTN.click();
            Allure.step("Clicked on Ailments- Kidney as YES");
        } else {
            System.out.println("Ailments-Kidney is not visible");
        }
    }

    public void ClickonAilmentsArthritis() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentArthritisBTN, 20, "Element is Not Display");
        if (AilmentArthritisBTN.isDisplayed()) {
            AilmentArthritisBTN.click();
            Allure.step("Clicked on Ailments- Arthritis as YES");
        } else {
            System.out.println("Ailments-Arthritis is not visible");
        }
    }
    public void ClickonAilmentsEyeEar() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentEyeEarBTN, 20, "Element is Not Display");
        if (AilmentEyeEarBTN.isDisplayed()) {
            AilmentEyeEarBTN.click();
            Allure.step("Clicked on Ailments- Eye/Ear as YES");
        } else {
            System.out.println("Ailments-Eye/Ear is not visible");
        }
    }
    public void ClickonAilmentsTumor() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentTumorBTN, 20, "Element is Not Display");
        if (AilmentTumorBTN.isDisplayed()) {
            AilmentTumorBTN.click();
            Allure.step("Clicked on Ailments- Tumor as YES");
        } else {
            System.out.println("Ailments-Tumor is not visible");
        }
    }
    public void ClickonAilmentsOthers() {
        wait.waitForElementToBeVisibleweb(getDriver(), AilmentOthersBTN, 20, "Element is Not Display");
        if (AilmentOthersBTN.isDisplayed()) {
            AilmentOthersBTN.click();
            Allure.step("Clicked on Ailments- Others as YES");
        } else {
            System.out.println("Ailments-Others is not visible");
        }
    }

    // Heart issue //
    @FindBy(xpath = "//input[contains(@name,'8121.0.currentSymptoms')]") // current symptoms
    private WebElement hicurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8121.0.doctorDetails')]") // doctor details
    private WebElement hiDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8121.0.dateOfConsultation')]") // Last Consultant
    private WebElement hilastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8121.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement hiDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8121.0.hospitalizationDetails')]") // DOH
    private WebElement hidoh;
    public void Clickonheartissuetypeweb(String HeartIssueType) throws InterruptedException {
        WebElement hitype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+HeartIssueType+"']"));
        if(hitype.isDisplayed()) {
            hitype.click();
            Allure.step( "Select Heart Issue Type  >"   +HeartIssueType);
        }else {
            System.out.println("Heart Issue types Button is not visible");
        }
    }
    public void EnterHeartIssueCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), hicurrentsymtomsBTN, 20, "Element is Not Display");
        if (hicurrentsymtomsBTN.isDisplayed()) {
            hicurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterHeartissueDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), hiDoctorDetailsBTN, 20, "Element is Not Display");
        if (hiDoctorDetailsBTN.isDisplayed()) {
            hiDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterHeartissueLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), hilastconsultant, 20, "Element is Not Display");
        if (hilastconsultant.isDisplayed()) {
            hilastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterHeartissueDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), hiDiagnosis, 20, "Element is Not Display");
        if (hiDiagnosis.isDisplayed()) {
            hiDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterHeartIssueDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), hidoh, 20, "Element is Not Display");
        if (hidoh.isDisplayed()) {
            hidoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Breath Issue //
    @FindBy(xpath = "//input[contains(@name,'8122.0.currentSymptoms')]") // current symptoms
    private WebElement bicurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8122.0.doctorDetails')]") // doctor details
    private WebElement biDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8122.0.dateOfConsultation')]") // Last Consultant
    private WebElement bilastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8122.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement biDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8122.0.hospitalizationDetails')]") // DOH
    private WebElement bidoh;

    public void Clickonbreathissuetypeweb(String BreathIssueType) throws InterruptedException {
        WebElement bitype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+BreathIssueType+"']"));
        if(bitype.isDisplayed()) {
            bitype.click();
            Allure.step( "Select Breath Issue Type  >"   +BreathIssueType);
        }else {
            System.out.println("Breath Issue types Button is not visible");
        }
    }

    public void EnterBreathIssueCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), bicurrentsymtomsBTN, 20, "Element is Not Display");
        if (bicurrentsymtomsBTN.isDisplayed()) {
            bicurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterBreathissueDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), biDoctorDetailsBTN, 20, "Element is Not Display");
        if (biDoctorDetailsBTN.isDisplayed()) {
            biDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterBreathissueLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), bilastconsultant, 20, "Element is Not Display");
        if (bilastconsultant.isDisplayed()) {
            bilastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterBreathissueDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), biDiagnosis, 20, "Element is Not Display");
        if (biDiagnosis.isDisplayed()) {
            biDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterBreathIssueDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), bidoh, 20, "Element is Not Display");
        if (bidoh.isDisplayed()) {
            bidoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Ulcer //
    @FindBy(xpath = "//input[contains(@name,'8125.0.currentSymptoms')]") // current symptoms
    private WebElement ulcercurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8125.0.doctorDetails')]") // doctor details
    private WebElement ulcerDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8125.0.dateOfConsultation')]") // Last Consultant
    private WebElement ulcerlastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8125.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement ulcerDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8125.0.hospitalizationDetails')]") // DOH
    private WebElement ulcerdoh;
    public void Clickonulcertypeweb(String UlcerType) throws InterruptedException {
        WebElement ulcertype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+UlcerType+"']"));
        if(ulcertype.isDisplayed()) {
            ulcertype.click();
            Allure.step( "Select Ulcer Type  >"   +UlcerType);
        }else {
            System.out.println("Ulcer types Button is not visible");
        }
    }

    public void EnterUlcerCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), ulcercurrentsymtomsBTN, 20, "Element is Not Display");
        if (ulcercurrentsymtomsBTN.isDisplayed()) {
            ulcercurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterUlcerDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), ulcerDoctorDetailsBTN, 20, "Element is Not Display");
        if (ulcerDoctorDetailsBTN.isDisplayed()) {
            ulcerDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterUlcerLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), ulcerlastconsultant, 20, "Element is Not Display");
        if (ulcerlastconsultant.isDisplayed()) {
            ulcerlastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterUlcerDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), ulcerDiagnosis, 20, "Element is Not Display");
        if (ulcerDiagnosis.isDisplayed()) {
            ulcerDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterUlcerDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), ulcerdoh, 20, "Element is Not Display");
        if (ulcerdoh.isDisplayed()) {
            ulcerdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Paralysis //
    @FindBy(xpath = "//input[contains(@name,'8127.0.currentSymptoms')]") // current symptoms
    private WebElement paralysiscurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8127.0.doctorDetails')]") // doctor details
    private WebElement paralysisDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8127.0.dateOfConsultation')]") // Last Consultant
    private WebElement paralysislastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8127.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement paralysisDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8127.0.hospitalizationDetails')]") // DOH
    private WebElement paralysisdoh;
    public void Clickonparalysistypeweb(String ParalysisType) throws InterruptedException {
        WebElement paralysistype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+ParalysisType+"']"));
        if(paralysistype.isDisplayed()) {
            paralysistype.click();
            Allure.step( "Select Paralysis Type  >"   +ParalysisType);
        }else {
            System.out.println("Paralysis types Button is not visible");
        }
    }

    public void EnterParalysisCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), paralysiscurrentsymtomsBTN, 20, "Element is Not Display");
        if (paralysiscurrentsymtomsBTN.isDisplayed()) {
            paralysiscurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterParalysisDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), paralysisDoctorDetailsBTN, 20, "Element is Not Display");
        if (paralysisDoctorDetailsBTN.isDisplayed()) {
            paralysisDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterParalysisLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), paralysislastconsultant, 20, "Element is Not Display");
        if (paralysislastconsultant.isDisplayed()) {
            paralysislastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterParalysisDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), paralysisDiagnosis, 20, "Element is Not Display");
        if (paralysisDiagnosis.isDisplayed()) {
            paralysisDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterParalysisDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), paralysisdoh, 20, "Element is Not Display");
        if (paralysisdoh.isDisplayed()) {
            paralysisdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Kidney //
    @FindBy(xpath = "//input[contains(@name,'8128.0.currentSymptoms')]") // current symptoms
    private WebElement kidneycurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8128.0.doctorDetails')]") // doctor details
    private WebElement kidneyDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8128.0.dateOfConsultation')]") // Last Consultant
    private WebElement kidneylastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8128.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement kidneyDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8128.0.hospitalizationDetails')]") // DOH
    private WebElement kidneydoh;
    public void Clickonkidneytypeweb(String KidneyType) throws InterruptedException {
        WebElement paralysistype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+KidneyType+"']"));
        if(paralysistype.isDisplayed()) {
            paralysistype.click();
            Allure.step( "Select Kidney Type  >"   +KidneyType);
        }else {
            System.out.println("Kidney types Button is not visible");
        }
    }
    public void EnterKidneyCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), kidneycurrentsymtomsBTN, 20, "Element is Not Display");
        if (kidneycurrentsymtomsBTN.isDisplayed()) {
            kidneycurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterKidneyDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), kidneyDoctorDetailsBTN, 20, "Element is Not Display");
        if (kidneyDoctorDetailsBTN.isDisplayed()) {
            kidneyDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterKidneyLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), kidneylastconsultant, 20, "Element is Not Display");
        if (kidneylastconsultant.isDisplayed()) {
            kidneylastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterKidneyDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), kidneyDiagnosis, 20, "Element is Not Display");
        if (kidneyDiagnosis.isDisplayed()) {
            kidneyDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterKidneyDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), kidneydoh, 20, "Element is Not Display");
        if (kidneydoh.isDisplayed()) {
            kidneydoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Arthritis //

    @FindBy(xpath = "//input[contains(@name,'8129.0.currentSymptoms')]") // current symptoms
    private WebElement arthcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8129.0.doctorDetails')]") // doctor details
    private WebElement arthDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8129.0.dateOfConsultation')]") // Last Consultant
    private WebElement arthlastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8129.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement arthDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8129.0.hospitalizationDetails')]") // DOH
    private WebElement arthdoh;

    public void Clickonarthritistypeweb(String ArthritisType) throws InterruptedException {
        WebElement artritistype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+ArthritisType+"']"));
        if(artritistype.isDisplayed()) {
            artritistype.click();
            Allure.step( "Select Kidney Type  >"   +ArthritisType);
        }else {
            System.out.println("Arthritis types Button is not visible");
        }
    }
    public void EnterArthritisCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), arthcurrentsymtomsBTN, 20, "Element is Not Display");
        if (arthcurrentsymtomsBTN.isDisplayed()) {
            arthcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterArtritisDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), arthDoctorDetailsBTN, 20, "Element is Not Display");
        if (arthDoctorDetailsBTN.isDisplayed()) {
            arthDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterArthritisLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), arthlastconsultant, 20, "Element is Not Display");
        if (arthlastconsultant.isDisplayed()) {
            arthlastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterArthritisDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), arthDiagnosis, 20, "Element is Not Display");
        if (arthDiagnosis.isDisplayed()) {
            arthDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterArthritisDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), arthdoh, 20, "Element is Not Display");
        if (arthdoh.isDisplayed()) {
            arthdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }


    // Eye/Ear //
    @FindBy(xpath = "//input[contains(@name,'8130.0.currentSymptoms')]") // current symptoms
    private WebElement eyecurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8130.0.doctorDetails')]") // doctor details
    private WebElement eyeDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8130.0.dateOfConsultation')]") // Last Consultant
    private WebElement eyelastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8130.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement eyeDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8130.0.hospitalizationDetails')]") // DOH
    private WebElement eyedoh;

    public void Clickoneyeeartypeweb(String EyeEarType) throws InterruptedException {
        WebElement eyetype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+EyeEarType+"']"));
        if(eyetype.isDisplayed()) {
            eyetype.click();
            Allure.step( "Select Eye/Ear Type  >"   +EyeEarType);
        }else {
            System.out.println("Eye/Ear types Button is not visible");
        }
    }

    public void EnterEyeEarCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), eyecurrentsymtomsBTN, 20, "Element is Not Display");
        if (eyecurrentsymtomsBTN.isDisplayed()) {
            eyecurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterEyeEarDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), eyeDoctorDetailsBTN, 20, "Element is Not Display");
        if (eyeDoctorDetailsBTN.isDisplayed()) {
            eyeDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterEyeEarLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), eyelastconsultant, 20, "Element is Not Display");
        if (eyelastconsultant.isDisplayed()) {
            eyelastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterEyeEarDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), eyeDiagnosis, 20, "Element is Not Display");
        if (eyeDiagnosis.isDisplayed()) {
            eyeDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterEyeEarDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), eyedoh, 20, "Element is Not Display");
        if (eyedoh.isDisplayed()) {
            eyedoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Tumor //
    @FindBy(xpath = "//input[contains(@name,'8126.0.currentSymptoms')]") // current symptoms
    private WebElement tumorcurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8126.0.doctorDetails')]") // doctor details
    private WebElement tumorDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8126.0.dateOfConsultation')]") // Last Consultant
    private WebElement tumorlastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8126.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement tumorDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8126.0.hospitalizationDetails')]") // DOH
    private WebElement tumordoh;
    public void Clickontumortypeweb(String TumorType) throws InterruptedException {
        WebElement tumortype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+TumorType+"']"));
        if(tumortype.isDisplayed()) {
            tumortype.click();
            Allure.step( "Select Tumor Type  >"   +TumorType);
        }else {
            System.out.println("Tumor types Button is not visible");
        }
    }

    public void EnterTumorCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), tumorcurrentsymtomsBTN, 20, "Element is Not Display");
        if (tumorcurrentsymtomsBTN.isDisplayed()) {
            tumorcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterTumorDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), tumorDoctorDetailsBTN, 20, "Element is Not Display");
        if (tumorDoctorDetailsBTN.isDisplayed()) {
            tumorDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterTumorLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), tumorlastconsultant, 20, "Element is Not Display");
        if (tumorlastconsultant.isDisplayed()) {
            tumorlastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterTumorDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), tumorDiagnosis, 20, "Element is Not Display");
        if (tumorDiagnosis.isDisplayed()) {
            tumorDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterTumorDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), tumordoh, 20, "Element is Not Display");
        if (tumordoh.isDisplayed()) {
            tumordoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Others //
    @FindBy(xpath = "//input[contains(@name,'8131.0.currentSymptoms')]") // current symptoms
    private WebElement othercurrentsymtomsBTN;
    @FindBy(xpath = "//input[contains(@name,'8131.0.doctorDetails')]") // doctor details
    private WebElement otherDoctorDetailsBTN;
    @FindBy(xpath = "//input[contains(@name,'8131.0.dateOfConsultation')]") // Last Consultant
    private WebElement otherlastconsultant;
    @FindBy(xpath = "//input[contains(@name,'8131.0.dateOfDiagnosis')]") // Diagnosis
    private WebElement otherDiagnosis;
    @FindBy(xpath = "//input[contains(@name,'8131.0.hospitalizationDetails')]") // DOH
    private WebElement otherdoh;

    public void Clickonothertypeweb(String OtherType) throws InterruptedException {
        WebElement otherype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+OtherType+"']"));
        if(otherype.isDisplayed()) {
            otherype.click();
            Allure.step( "Select Others Type  >"   +OtherType);
        }else {
            System.out.println("Others types Button is not visible");
        }
    }

    public void EnterothersCurrentSymptoms(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), othercurrentsymtomsBTN, 20, "Element is Not Display");
        if (othercurrentsymtomsBTN.isDisplayed()) {
            othercurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterothersDoctorDetails(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), otherDoctorDetailsBTN, 20, "Element is Not Display");
        if (otherDoctorDetailsBTN.isDisplayed()) {
            otherDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }
    public void EnterothersLastConsultant(String LastConsultantDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), otherlastconsultant, 20, "Element is Not Display");
        if (otherlastconsultant.isDisplayed()) {
            otherlastconsultant.sendKeys(LastConsultantDate);
            Allure.step("Enter Last Consultant Date  >" + LastConsultantDate);
        } else {
            System.out.println("Last Consultant Date input box is not visible");
        }
    }
    public void EnterothersDignosis(String DiagnosisDate) {
        wait.waitForElementToBeVisibleweb(getDriver(), otherDiagnosis, 20, "Element is Not Display");
        if (otherDiagnosis.isDisplayed()) {
            otherDiagnosis.sendKeys(DiagnosisDate);
            Allure.step("Enter Diagnosis Date  >" + DiagnosisDate);
        } else {
            System.out.println("Diagnosis Date input box is not visible");
        }
    }
    public void EnterothersDetailsofHospitalization(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), otherdoh, 20, "Element is Not Display");
        if (otherdoh.isDisplayed()) {
            otherdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }

    // Diabetes //

    @FindBy(xpath = "//input[contains(@name,'day1501')]") // day DD
    private WebElement diabetesday;
    @FindBy(xpath = "//input[contains(@name,'month1501')]") // month DD
    private WebElement diabetesmonth;
    @FindBy(xpath = "//input[contains(@name,'year1501')]") // year DD
    private WebElement diabetesyear;

    @FindBy(xpath = "//input[contains(@name,'day501')]") // day DD
    private WebElement diabetesdaysp;
    @FindBy(xpath = "//input[contains(@name,'month501')]") // month DD
    private WebElement diabetesmonthsp;
    @FindBy(xpath = "//input[contains(@name,'year501')]") // year DD
    private WebElement diabetesyearsp;
    public void Clickondiabetestypeweb(String DiabetesType) throws InterruptedException {
        WebElement diabetestype=getDriver().findElement(By.xpath("//div[@role='button']//span[text()='"+DiabetesType+"']"));
        if(diabetestype.isDisplayed()) {
            diabetestype.click();
            Allure.step( "Select Diabetes Type  >"   +DiabetesType);
        }else {
            System.out.println("Diabetes types Button is not visible");
        }
    }

    public void Clickondiabetessuffering(){
        WebElement Option1 = getDriver().findElement(By.xpath("//span[text()='IDDM']"));
        wait.waitforElementToBeClickable(getDriver(), Option1, 100);
        Option1.click();
        Allure.step( "Type of Diabetes you are suffering from= IDDM");

        WebElement Option2 = getDriver().findElement(By.xpath("//span[text()='NIDDM']"));
        wait.waitforElementToBeClickable(getDriver(), Option2, 100);
        Option2.click();
        Allure.step( "Type of Diabetes you are suffering from= NIDDM");

        WebElement Option3 = getDriver().findElement(By.xpath("//span[text()='IGT/IFG']"));
        wait.waitforElementToBeClickable(getDriver(), Option3, 100);
        Option3.click();
        Allure.step( "Type of Diabetes you are suffering from= IGT/IFG");

        WebElement Option4 = getDriver().findElement(By.xpath("//span[text()='Gestational Diabetes']"));
        wait.waitforElementToBeClickable(getDriver(), Option4, 100);
        Option4.click();
        Allure.step( "Type of Diabetes you are suffering from= Gestational Diabetes");
    }

    public void EnterdiabetesDateOfDiagnosis(String DiabDay, String DiabMonth, String DiabYear) {
        wait.waitForElementToBeVisibleweb(getDriver(), diabetesday, 20, "Element is Not Display");
        diabetesday.click();
        diabetesday.sendKeys(DiabDay);
        wait.waitForElementToBeVisibleweb(getDriver(), diabetesmonth, 20, "Element is Not Display");
        diabetesmonth.clear();
        diabetesmonth.sendKeys(DiabMonth);
        wait.waitForElementToBeVisibleweb(getDriver(), diabetesyear, 20, "Element is Not Display");
        diabetesyear.clear();
        diabetesyear.sendKeys(DiabYear);
        Allure.step("Enter Date on which your diabetes was diagnosed? >" + DiabDay + DiabMonth + DiabYear);
    }

    public void EnterdiabetesDateOfDiagnosisspouse(String DiabDay, String DiabMonth, String DiabYear) {
        wait.waitForElementToBeVisibleweb(getDriver(), diabetesdaysp, 20, "Element is Not Display");
        diabetesdaysp.click();
        diabetesdaysp.sendKeys(DiabDay);
        wait.waitForElementToBeVisibleweb(getDriver(), diabetesmonthsp, 20, "Element is Not Display");
        diabetesmonthsp.clear();
        diabetesmonthsp.sendKeys(DiabMonth);
        wait.waitForElementToBeVisibleweb(getDriver(), diabetesyearsp, 20, "Element is Not Display");
        diabetesyearsp.clear();
        diabetesyearsp.sendKeys(DiabYear);
        Allure.step("Enter Date on which your diabetes was diagnosed? >" + DiabDay + DiabMonth + DiabYear);
    }







}

