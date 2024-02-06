package com.absli.pageObjects;

import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyProfessionalDetails extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public CompanyProfessionalDetails(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // company professional details tab //
    @FindBy(xpath = "//input[@name='businessDuties']")
    private WebElement cnob;
    @FindBy(xpath = "//div[@id='typeOfOrganisation']")
    private WebElement typorgcomp;
    @FindBy(xpath = "//div//span[text()='YES']")
    private WebElement GSTBtncmpWeb;
    @FindBy(xpath = "//input[@name='gstNumber']")
    private WebElement gstnumbercmp;

    public void entercompanyNOBweb(String CompanyNatureofbuss) {
        wait.waitForElementToBeVisibleweb(getDriver(), cnob, 50,"time out to find element on page");
        if (cnob.isDisplayed()) {
            cnob.sendKeys(CompanyNatureofbuss);
            Allure.step("Enter the Company Nature of Business  >"   + CompanyNatureofbuss);
        } else {
            System.out.println("Company Nature of Business/Duties input box is not visible");
        }
    }
    public void selectOccupationTypeofOrganisationweb(String Orgtypecompany) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), typorgcomp, 100);
        if(typorgcomp.isDisplayed()) {
            typorgcomp.click();
        }
        Thread.sleep(2000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Orgtypecompany+"']"));
        wait.waitforElementToBeClickable(getDriver(), selecttext, 100);
        selecttext.click();
        Allure.step("Select the Company Type of Organisation  >"   + Orgtypecompany);
    }

    public void Isgstrehisterdcompany(String IsGSTregistered){
        WebElement cgstreg=getDriver().findElement(By.xpath("//span[contains(text(),'"+IsGSTregistered+"')]"));
        if(cgstreg.isDisplayed()){
            cgstreg.click();
            Allure.step("Select Are you registered under the GST Law?  >"   + IsGSTregistered);
        }else {
            System.out.println("Are you registered under the GST Law? radio button is not visible");
        }
    }
    public void ClickOnAreYouRegisterPersonaUnderGSTcompweb(String CompanyGSTnumber) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), GSTBtncmpWeb, 20,"time out to find element on page");
        if(GSTBtncmpWeb.isDisplayed()) {
            GSTBtncmpWeb.click();
        }
        wait.WaitTime(1);
        wait.waitforElementToBeClickable(getDriver(), gstnumbercmp, 30);
        if (gstnumbercmp.isDisplayed()) {
            gstnumbercmp.sendKeys(CompanyGSTnumber);
            Allure.step("Enter the Company GST Number  >"   + CompanyGSTnumber);
        }
    }



















}
