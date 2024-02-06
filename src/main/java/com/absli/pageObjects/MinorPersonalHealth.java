package com.absli.pageObjects;

import com.absli.base.TestBase;
import io.qameta.allure.Allure;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MinorPersonalHealth extends TestBase {

    public MinorPersonalHealth(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Minor Personal Health Details tab // 21/6/2023=mayur
    @FindBy(xpath = "//input[@id='height-feet-joint']")
    private WebElement FeetEle;
    @FindBy(xpath = "//input[@id='height-inches-joint']")
    private WebElement InchEle;
    @FindBy(xpath = "(//input[@name='10'])[2]")
    private WebElement WeightEle;
    @FindBy(xpath = "(//button[@name='11'])[3]")
    private WebElement WeightChangesYesBtn;
    @FindBy(xpath = "(//label[text()='Enter No. of Kgs (gained/lost)']//parent::div//input)[1]")//2
    private WebElement wghtgl;
    @FindBy(xpath = "//label[text()='Enter No. of Kgs (gained/lost)']//parent::div//input")
    private WebElement wghtglfmpA;

    public void EnterMinorHeightFeet(String MinorHeightFeet) {
        wait.waitForElementToBeVisibleweb(getDriver(), FeetEle, 20, "Element is Not Display");
        if (FeetEle.isDisplayed()) {
            FeetEle.click();
            for (int i = 0; i < 2; i++) {
                FeetEle.sendKeys(Keys.BACK_SPACE);
                FeetEle.sendKeys(" ");
                FeetEle.sendKeys(Keys.DELETE);
            }
            FeetEle.sendKeys(MinorHeightFeet);
            Allure.step( "Enter Height Feet   >"   +MinorHeightFeet );
        } else {
            System.out.println("Enter Height in Feet input box is not visible");
        }
    }

    public void EnterMinorHeightInch(String MinorHeightInch) {
        wait.waitForElementToBeVisibleweb(getDriver(),InchEle , 20, "Element is Not Display");
        if (InchEle.isDisplayed()) {
            InchEle.click();
            for (int i = 0; i < 2; i++) {
                InchEle.sendKeys(Keys.BACK_SPACE);
                InchEle.sendKeys(" ");
                InchEle.sendKeys(Keys.DELETE);
            }
            InchEle.sendKeys(MinorHeightInch);
            Allure.step( "Enter Height Inch   >"   +MinorHeightInch );
        } else {
            System.out.println("Enter Height in Inch input box is not visible");
        }
    }

    public void EnterMinorWeight(String Minorweight) {
        wait.waitForElementToBeVisibleweb(getDriver(), WeightEle, 20, "Element is Not Display");
        if (WeightEle.isDisplayed()) {
            WeightEle.sendKeys(Minorweight);
            Allure.step( "Enter Weight KG   >"   +Minorweight );
        } else {
            System.out.println("Enter Weight input box is not visible");
        }
    }
    public void ClickOnIsThereAnyWeightChangesMinorYESBtnWeb(String MinorWeightgainlost) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), WeightChangesYesBtn, 30);
        if (WeightChangesYesBtn.isDisplayed()) {
            WeightChangesYesBtn.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), wghtgl, 30);
        if (wghtgl.isDisplayed()) {
            wghtgl.click();
            wghtgl.sendKeys(MinorWeightgainlost);
            Allure.step( "Enter Weight Gain lost KG   >"   +MinorWeightgainlost );
        }
    }
    public void ClickOnIsThereAnyWeightChangesMinorYESfmpABtnWeb(String MinorWeightgainlost) throws InterruptedException {
        wait.waitforElementToBeClickable(getDriver(), WeightChangesYesBtn, 30);
        if (WeightChangesYesBtn.isDisplayed()) {
            WeightChangesYesBtn.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), wghtglfmpA, 30);
        if (wghtglfmpA.isDisplayed()) {
            wghtglfmpA.click();
            wghtglfmpA.sendKeys(MinorWeightgainlost);
            Allure.step( "Enter Weight Gain lost KG   >"   +MinorWeightgainlost );
        }
    }




}
