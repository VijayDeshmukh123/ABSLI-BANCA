package com.absli.pageObjects;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JointlifePage extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public JointlifePage(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    //-------------------SAKSHI Jointlife page ASP-------------------------------//
    @FindBy(xpath = "(//span[contains(text(),'ADD')])[2]")
    private WebElement jointlifeaddbtn;
    @FindBy(xpath = "//input[@name='panNumber']")
    private WebElement panjointlife;
    @FindBy(xpath = "//div[contains(text(),'VERIFY')]")
    private WebElement verifybtn;
    @FindBy(xpath = "//input[@name='day']")
    private WebElement jlday;
    @FindBy(xpath = "//input[@name='month']")
    private WebElement jlmonth;
    @FindBy(xpath = "//input[@name='year']")
    private WebElement jlyear;
    @FindBy(xpath = "//div[contains(text(),'SAVE')]")
    private WebElement savebtn;


    public void clickOnAddbuttonjointlifeweb() {

        wait.waitForElementToBeVisibleweb(getDriver(), jointlifeaddbtn, 20, "Element is Not Display");
        if (jointlifeaddbtn.isDisplayed()) {
            jointlifeaddbtn.click();
            Allure.step("Clicked on jointlife add button ");
        } else {
            System.out.println("Jointlife add button is not display ");
        }
    }

    public void enterPANcardjointlife(String JointlifePAN) {
        wait.waitForElementToBeVisibleweb(getDriver(), panjointlife, 50,"time out to find element on page");
        if (panjointlife.isDisplayed()) {
            panjointlife.sendKeys(JointlifePAN);
            Allure.step( "Enter PAN card of jointlife   >" +JointlifePAN);
        } else {
            System.out.println("PAN card of jointlife is not visible");
        }
    }

    public void clickOnVerifybuttonjointlifeweb() {

        wait.waitForElementToBeVisibleweb(getDriver(), verifybtn, 20, "Element is Not Display");
        if (verifybtn.isDisplayed()) {
            verifybtn.click();
            Allure.step("Clicked on jointlife verify button ");
        } else {
            System.out.println("Jointlife verify button is not display ");
        }
    }

    public void fillDOBdetailsJointlifeWeb(String Jointlifeday, String Jointlifemonth, String Jointlifeyear) {
        wait.waitForElementToBeVisibleweb(getDriver(), jlday, 50,"time out to find element on page");
        jlday.click();
        jlday.sendKeys(Jointlifeday);
        Allure.step( "Enter Day For DOB of Jointlife  >"   +Jointlifeday);

        wait.waitForElementToBeVisibleweb(getDriver(), jlmonth, 50,"time out to find element on page");
        jlmonth.clear();
        jlmonth.sendKeys(Jointlifemonth);
        Allure.step( "Enter Month For DOB of Jointlife  >"   +Jointlifemonth);

        wait.waitForElementToBeVisibleweb(getDriver(), jlyear, 50,"time out to find element on page");
        jlyear.clear();
        jlyear.sendKeys(Jointlifeyear);
        Allure.step( "Enter Year For DOB of Jointlife >"   +Jointlifeyear);

    }

    public void ClickOnGenderJointlife(String Jointlifegender) {
        WebElement jlgender=getDriver().findElement(By.xpath("//div[contains(text(),'"+Jointlifegender+"')]"));
        if (jlgender.isDisplayed()) {
            jlgender.click();
            Allure.step("Select the Gender of Jointlife  >"   + Jointlifegender);
        } else {
            System.out.println("Gender of Jointlife is not visible");
        }
    }

    public void clickOnsavebuttonjointlifeweb() {
        wait.waitForElementToBeVisibleweb(getDriver(), savebtn, 20, "Element is Not Display");
        if (savebtn.isDisplayed()) {
            savebtn.click();
            Allure.step("Clicked on jointlife save button ");
        } else {
            System.out.println("Jointlife save button is not display ");
        }
    }
}
