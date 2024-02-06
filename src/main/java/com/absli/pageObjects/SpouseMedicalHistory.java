package com.absli.pageObjects;
import com.absli.base.TestBase;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpouseMedicalHistory extends TestBase {

    public SpouseMedicalHistory(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "(//button[contains(@name,'8080')])[3]") // yes button//3
    private WebElement AbsentBTN;
    @FindBy(xpath = "(//input[contains(@name,'8087')])[2]") // current symptoms[2]
    private WebElement abcurrentsymtomsBTN;
    @FindBy(xpath = "(//input[contains(@name,'8088')])[2]") // doctor details[2]
    private WebElement abDoctorDetailsBTN;
    @FindBy(xpath = "(//input[contains(@name,'day8089')])[2]") // day LC
    private WebElement ablcday;
    @FindBy(xpath = "(//input[contains(@name,'month8089')])[2]") // month LC
    private WebElement ablcmonth;
    @FindBy(xpath = "(//input[contains(@name,'year8089')])[2]") // year LC
    private WebElement ablcyear;
    @FindBy(xpath = "(//input[contains(@name,'day8090')])[2]") // day DD
    private WebElement abddday;
    @FindBy(xpath = "(//input[contains(@name,'month8090')])[2]") // month DD
    private WebElement abddmonth;
    @FindBy(xpath = "(//input[contains(@name,'year8090')])[2]") // year DD
    private WebElement abddyear;
    @FindBy(xpath = "(//input[contains(@name,'8091')])[2]") // DOH afw
    private WebElement abdoh;

    ///////hospitalization//////////////////////////////////////////////////

    @FindBy(xpath = "(//button[contains(@name,'8081')])[3]") // yes button//3
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
    //-----------------------------------------------------------------------------------//
    @FindBy(xpath = "(//button[contains(@name,'8080')])[4]")
    private WebElement AbsentBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8081')])[4]") // no button
    private WebElement HospBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8083')])[4]") // no button
    private WebElement DsdrBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8084')])[4]") // no button
    private WebElement spBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8085')])[4]") // no button
    private WebElement osBTNno;
    @FindBy(xpath = "(//button[contains(@name,'8082')])[4]") // no button
    private WebElement alignBTNno;
    public void ClickonAbsentfromWorkNOSpouse() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTNno, 20, "Element is Not Display");
        if (AbsentBTNno.isDisplayed()) {
            AbsentBTNno.click();
            Allure.step("Clicked on Absent From Work as NO");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }


        // Absent from work //////////////////////////////////////////////////////////////////////////////////////////
    public void ClickonAbsentfromWorkSpouse() {
        wait.waitForElementToBeVisibleweb(getDriver(), AbsentBTN, 20, "Element is Not Display");
        if (AbsentBTN.isDisplayed()) {
            AbsentBTN.click();
            Allure.step("Clicked on Absent From Work as YES");
        } else {
            System.out.println("Absent from work is not visible");
        }
    }

    public void EnterAbsentfromWorkCurrentSymptomsSpouse(String AFWcurrentsymptoms) {
        wait.waitForElementToBeVisibleweb(getDriver(), abcurrentsymtomsBTN, 20, "Element is Not Display");
        if (abcurrentsymtomsBTN.isDisplayed()) {
            abcurrentsymtomsBTN.sendKeys(AFWcurrentsymptoms);
            Allure.step("Enter Current Symptoms  >" + AFWcurrentsymptoms);
        } else {
            System.out.println("Current Symptoms input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDoctorDetailsSpouse(String AFWdoctordetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abDoctorDetailsBTN, 20, "Element is Not Display");
        if (abDoctorDetailsBTN.isDisplayed()) {
            abDoctorDetailsBTN.sendKeys(AFWdoctordetails);
            Allure.step("Enter Doctor Details  >" + AFWdoctordetails);
        } else {
            System.out.println("Doctor details input box is not visible");
        }
    }

    public void EnterAbsentfromWorkDateOfLastConsultSpouse(String AFWLCday, String AFWLCmonth, String AFWLCyear) {
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

    public void EnterAbsentfromWorkDateOfDiagnosisSpouse(String AFWDDday, String AFWDDmonth, String AFWDDyear) {
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

    public void EnterAbsentfromWorkDetailsofHospitalizationSpouse(String AFWdetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), abdoh, 20, "Element is Not Display");
        if (abdoh.isDisplayed()) {
            abdoh.sendKeys(AFWdetails);
            Allure.step("Enter Hospitalization Details  >" + AFWdetails);
        } else {
            System.out.println("Hospitalization details input box is not visible");
        }
    }
}
