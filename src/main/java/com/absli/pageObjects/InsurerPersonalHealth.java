package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurerPersonalHealth extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public InsurerPersonalHealth(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Insurer Personal Health Details tab // 8/6/2023=mayur

    @FindBy(xpath = "//input[@id='height-feet']")
    private WebElement FeetEle;
    @FindBy(xpath = "//input[@id='height-inches']")
    private WebElement InchEle;
    @FindBy(xpath = "//input[@name='10']")
    private WebElement WeightEle;
    @FindBy(xpath = "(//button[@name='11'])[1]")
    private WebElement WeightChangesYesBtn;
    @FindBy(xpath = "//label[text()='Enter No. of Kgs (gained/lost)']//parent::div//input")
    private WebElement wghtgl;
    @FindBy(xpath = "//span[text()='SAVE & CONTINUE']")
    private WebElement saveContinueEle1;
    @FindBy(xpath = "(//span[text()='SAVE & CONTINUE'])[2]")
    private WebElement saveContinueEle2;
    @FindBy(xpath = "(//span[text()='SAVE & CONTINUE'])[1]")
    private WebElement savecountinuejointlife;

    public void EnterHeightFeet(String HeightFeet) {
        wait.waitForElementToBeVisibleweb(getDriver(), FeetEle, 20, "Element is Not Display");
        if (FeetEle.isDisplayed()) {
            FeetEle.click();
            for (int i = 0; i < 2; i++) {
                FeetEle.sendKeys(Keys.BACK_SPACE);
                FeetEle.sendKeys(" ");
                FeetEle.sendKeys(Keys.DELETE);
            }
            FeetEle.sendKeys(HeightFeet);
            Allure.step( "Enter Height Feet   >"   +HeightFeet );
        } else {
            System.out.println("Enter Height in Feet input box is not visible");
        }
    }

    public void EnterHeightInch(String HeightInch) {
        wait.waitForElementToBeVisibleweb(getDriver(),InchEle , 20, "Element is Not Display");
        if (InchEle.isDisplayed()) {
            InchEle.click();
            for (int i = 0; i < 2; i++) {
                InchEle.sendKeys(Keys.BACK_SPACE);
                InchEle.sendKeys(" ");
                InchEle.sendKeys(Keys.DELETE);
            }
            InchEle.sendKeys(HeightInch);
            Allure.step( "Enter Height Inch   >"   +HeightInch );
        } else {
            System.out.println("Enter Height in Inch input box is not visible");
        }
    }

    public void EnterWeight(String weight) {
        wait.waitForElementToBeVisibleweb(getDriver(), WeightEle, 20, "Element is Not Display");
        if (WeightEle.isDisplayed()) {
            WeightEle.sendKeys(weight);
            Allure.step( "Enter Weight KG   >"   +weight );
        } else {
            System.out.println("Enter Weight input box is not visible");
        }
    }

    public void ClickOnIsThereAnyWeightChangesYESBtnWeb(String Weightgainlost) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), WeightChangesYesBtn, 30);
        if (WeightChangesYesBtn.isDisplayed()) {
            WeightChangesYesBtn.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), wghtgl, 30);
        if (wghtgl.isDisplayed()) {
            wghtgl.click();
            wghtgl.sendKeys(Weightgainlost);
            Allure.step( "Enter Weight Gain lost KG   >"   +Weightgainlost );
        }
    }
    public void ClickSaveContinuecapitalBtn() {
        wait.waitForElementToBeVisibleweb(getDriver(), saveContinueEle1, 20, "Element is Not Display");
        if (saveContinueEle1.isDisplayed()) {
            saveContinueEle1.click();
            Allure.step( "Clicked on Save And Continue Button- > ");
        } else {
            System.out.println("Save & Continue button is not visible");
        }
    }
    public void ClickSaveContinuecapitalminorBtn() {
        wait.waitForElementToBeVisibleweb(getDriver(), saveContinueEle2, 20, "Element is Not Display");
        if (saveContinueEle2.isDisplayed()) {
            saveContinueEle2.click();
            Allure.step( "Clicked on Save And Continue Button- > ");
        } else {
            System.out.println("Save & Continue button is not visible");
        }
    }
    public void ClickSaveContinuejointlifeBtn() {
        wait.waitForElementToBeVisibleweb(getDriver(), savecountinuejointlife, 20, "Element is Not Display");
        if (savecountinuejointlife.isDisplayed()) {
            savecountinuejointlife.click();
            Allure.step( "Clicked on Save And Continue Button- > ");
        } else {
            System.out.println("Save & Continue button is not visible");
        }
    }


    }
