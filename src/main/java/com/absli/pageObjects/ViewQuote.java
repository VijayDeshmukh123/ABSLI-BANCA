package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;

import Utils.TestUtil;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class ViewQuote extends TestBase {
    public WebDriver driver;
    public WaitUtils wait;

    public ViewQuote(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // View Quote page // 6/6/2023=mayur ===================> AIP

    @FindBy(xpath = "//div[text()='MNC Fund']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement mncFaplus;
    @FindBy(xpath = "//input[@id='premiumAmount']") // aip+fmp
    private WebElement premium;
    @FindBy(xpath = "//div[@id='mui-component-select-premiumPayTermQst']")
    private WebElement polpt;
    @FindBy(xpath = "//button[@name='CLOSE']")
    private WebElement popppt;
    @FindBy(xpath = "//div[@id='mui-component-select-policyTermYearsQst']")
    private WebElement term;
    @FindBy(xpath = "//div[@id='mui-component-select-benefitOptionQst']")
    private WebElement beneo;
    @FindBy(xpath = "//div[@id='mui-component-select-benefitPayoutFrequencyQst']")
    private WebElement benef;
    @FindBy(xpath = "//div[@id='mui-component-select-benefitPeriodQst']")
    private WebElement benep;
    @FindBy(xpath = "//button[@id='rider-btn']")
    private WebElement addrdr;
    @FindBy(xpath = "//div[text()='Waiver Of Premium']")
    private WebElement wop;
    @FindBy(xpath = "//div[text()='Accidental Death Benefit Plus']")
    private WebElement adb;
    @FindBy(xpath = "//input[@name='ADB Plus']")
    private WebElement adbamt;
    @FindBy(xpath = "//div[text()='Critical Illness']")
    private WebElement ci;
    @FindBy(xpath = "//input[@name='Critical Illness']")
    private WebElement ciamt;
    @FindBy(xpath = "//div[text()='Surgical Care']")
    private WebElement sc;
    @FindBy(xpath = "//input[@name='Surgical Care']")
    private WebElement scamt;
    @FindBy(xpath = "//div[text()='Hospital Care']")
    private WebElement hc;
    @FindBy(xpath = "//input[@name='Hospital Care']")
    private WebElement hcamt;
    @FindBy(xpath = "//div[text()='Accidental Death and Disability']")
    private WebElement addisb;
    @FindBy(xpath = "//input[@name='Accidental Death and Disability']")
    private WebElement addamt;
    @FindBy(xpath = "//button[@name='ADD']")
    private WebElement addfinal;
    @FindBy(xpath = "//input[@name='employeeIdQst']")
    private WebElement abg;
    @FindBy(xpath = "//button[@name='PROFILER']")
    private WebElement profiler;
    @FindBy(xpath = "//button[@name='ILLUSTRATION']")
    private WebElement illustration;
    @FindBy(xpath = "//button[@name='Confirm Plan']")
    private WebElement confirmpln;
    //---------------------------------------------------FMP-----------------------------------------------------------------------//
    @FindBy(xpath = "//div[@id='mui-component-select-productNameOptionQst']")
    private WebElement plnopt;
    @FindBy(xpath = "//input[@name='policyTermYearsQst']")
    private WebElement polterminp;
    //---------------------------------------------------BVI-----------------------------------------------------------------------//
    @FindBy(xpath = "//input[@id='sumAssuredQst']")
    private WebElement smasrd;
    @FindBy(xpath = "//input[@id='premiumPayTermQst']")
    private WebElement pptpol;
    @FindBy(xpath = "//input[@name='premiumPayTermQst']")
    private WebElement pptpolaspire;

    //---------------------------------------------------BFE-----------------------------------------------------------------------//
    @FindBy(xpath = "//div[@id='mui-component-select-productNameOptionQst']")
    private WebElement investMentOption;
    @FindBy(xpath = "//div[@id='mui-component-select-investmentOptionQst']")
    private WebElement investMentOptionaspire;
    @FindBy(xpath = "//div[@id='mui-component-select-underwritingClassQst']")
    private WebElement underWritingClass;
    @FindBy(xpath = "//div[@id='mui-component-select-stpTransferFrequencyQst']")
    private WebElement stptransferFreq;
    @FindBy(xpath = "//div[text()='Multiplier']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement PassNM;
    @FindBy(xpath = "//div[text()='Magnifier']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement magni;
    @FindBy(xpath = "//div[text()='Maximiser']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement maxi;
    @FindBy(xpath = "//div[text()='Super 20']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement supertw;
    @FindBy(xpath = "//div[text()='Liquid Plus']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement liquid;
    @FindBy(xpath = "//div[text()='Income Adv.']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement incomeAd;
    @FindBy(xpath = "//div[text()='Assure']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement assur;
    @FindBy(xpath = "//div[text()='Enhancer']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement enhanc;
    @FindBy(xpath = "//div[text()='Capped Nifty Index']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement capped;
    @FindBy(xpath = "//div[text()='Creator']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement creator;
    @FindBy(xpath = "//div[text()='Value & Momentum']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement valueF;
    @FindBy(xpath = "//div[text()='Builder']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement builderF;
    @FindBy(xpath = "//div[text()='Protector']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement protectorF;
    @FindBy(xpath = "//div[text()='Pure Equity']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement equity;
    @FindBy(xpath = "//div[text()='Asset Allocation']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement assetAll;
    @FindBy(xpath = "//div[text()='MNC']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement mncF;
    @FindBy(xpath = "//div[text()='Assest Allocation']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement assetAllinfinia;
    @FindBy(xpath = "//input[@id='term']") //mithil (CANCERSHIELD)
    private WebElement termADG;
    @FindBy(xpath = "//div[@id='mui-component-select-productNameOptionQst']") //mithil
    private WebElement optionPlan;
    @FindBy(xpath = "//div[@id='mui-component-select-retirementAgeQst']")
    private WebElement retire;
    @FindBy(xpath = "//div[@id='mui-component-select-sumAssuredReductionFactor']")
    private WebElement reductionFcator;
    @FindBy(xpath = "//div[@id='mui-component-select-increasingLevelQst']")
    private WebElement coverincreasing;
    @FindBy(xpath = "//input[@id='sumAssuredQst']") // digishield
    private WebElement sumassured;
    @FindBy(xpath = "//div[@id='mui-component-select-transferFund']") // ANP
    private WebElement tfund;
    @FindBy(xpath = "//div[@id='mui-component-select-incomeVariantQst']") // ANP
    private WebElement incvar;
    @FindBy(xpath = "//div[@id='mui-component-select-defermentPeriodQst']") // ANP
    private WebElement deferpero;
    @FindBy(xpath = "//div[@id='mui-component-select-sumAssuredMultipleQst']") // ANP
    private WebElement summult;

    @FindBy(xpath = "//div[@id='mui-component-select-riskOptions']") // AWS
    private WebElement riskprof;

    @FindBy(xpath = "//div[text()='Super20']/parent::div/following-sibling::div//following-sibling::div/div/div/div/div/input")
    private WebElement supertwinf;
    
    public void EnterPremiumAmountWeb(String premiumamount){
        wait.waitForElementToBeVisibleweb(getDriver(), premium, 50, "time out to find element on page");
        if(premium.isDisplayed()){
            premium.click();
            for (int i = 0; i < 12; i++) {
                premium.sendKeys(Keys.BACK_SPACE);
                premium.sendKeys(" ");
                premium.sendKeys(Keys.DELETE);
            }
            premium.sendKeys(premiumamount);
            Allure.step( "Enter the Premium Amount  >"   + premiumamount);
        }
    }
    public void SelectPPTWeb(String ppt) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), polpt, 30,"time out to find element on page");
        if(polpt.isDisplayed()) {
            polpt.click();
        }
        Thread.sleep(1000);
        WebElement PPTWebSelection=getDriver().findElement(By.xpath("//ul//li//span[text()='"+ppt+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), PPTWebSelection, 30,"time out to find element on page");
        if(PPTWebSelection.isDisplayed()) {
            PPTWebSelection.click();
            Allure.step( "Select the PPT  >"   + ppt);
        }
    }
    public void PopupPPTWeb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), popppt, 30, "time out to find element on page");
        if (popppt.isDisplayed()) {
            popppt.click();
        }
    }
    public void SelectPoltermWeb(String policyterm) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), term, 40,"time out to find element on page");
        if(term.isDisplayed()) {
            term.click();
        }
        Thread.sleep(1000);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+policyterm+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + policyterm);
        }
    }
    public void SelectPaymodeWeb(String paymode){
        WebElement mode=getDriver().findElement(By.xpath("//div[text()='"+paymode+"']"));
        if(mode.isDisplayed()) {
            mode.click();
            Allure.step( "Select the Paymode  >"   + paymode);
        }
    }
    public void SelectbeneoptWeb(String benefitotion) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), beneo, 30,"time out to find element on page");
        if(beneo.isDisplayed()) {
            beneo.click();
        }
        Thread.sleep(1000);
        WebElement benefit=getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+benefitotion+"')]"));
        if(benefit.isDisplayed()) {
            benefit.click();
            Allure.step( "Select the Benefit Option  >"   + benefitotion);
        }
    }
    public void SelectbenefreqWeb(String benefitfreq) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), benef, 30,"time out to find element on page");
        if(benef.isDisplayed()) {
            benef.click();
        }
        Thread.sleep(1000);
        WebElement benefitf=getDriver().findElement(By.xpath("(//ul//li//span[contains(text(),'"+benefitfreq+"')])[1]"));
        if(benefitf.isDisplayed()) {
            benefitf.click();
            Allure.step( "Enter the Benefit Frequency  >"   + benefitfreq);
        }
    }
    public void SelectbeneperiodWeb(String benefitperiod) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), benep, 30,"time out to find element on page");
        if(benep.isDisplayed()) {
            benep.click();
        }
        Thread.sleep(1000);
        WebElement benefitp=getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+benefitperiod+"')]"));
        if(benefitp.isDisplayed()) {
            benefitp.click();
            Allure.step( "Select the Benefit Period  >" + benefitperiod);
        }
    }
    public void addriderbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), addrdr, 30,"time out to find element on page");
        if (addrdr.isDisplayed()) {
            addrdr.click();
            Allure.step( "Clicked On Add Rider Button");

        } else {
            System.out.println("Add Rider button is not visible");
        }
    }
    public void addWOP() {
        wait.waitForElementToBeVisibleweb(getDriver(), wop, 30,"time out to find element on page");
        if (wop.isDisplayed()) {
            wop.click();
            Allure.step( "Selected rider as Wavier Of Premium");

        } else {
            System.out.println("Wavier Of Premium check box is not visible");
        }
    }
    public void addADB(String ADMamount) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), adb, 30,"time out to find element on page");
        if (adb.isDisplayed()) {
            adb.click();
            Allure.step( "Selected Rider as Accidental Death Benefit Plus");
        } else {
            System.out.println("ADB Plus check box is not visible");
        }
        Thread.sleep(1000);
        wait.waitForElementToBeVisibleweb(getDriver(), adbamt, 30,"time out to find element on page");
        adbamt.click();
        for (int i = 0; i < 6; i++) {
            adbamt.sendKeys(Keys.BACK_SPACE);
            adbamt.sendKeys(" ");
            adbamt.sendKeys(Keys.DELETE);
        }
        adbamt.sendKeys(ADMamount);
        Allure.step( "Enter the ADB Amount  >"  + ADMamount);
    }
    public void addCI(String CIamount) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ci, 30,"time out to find element on page");
        if (ci.isDisplayed()) {
            ci.click();
            Allure.step( "Selected Rider as Critical Illness");
        } else {
            System.out.println("Critical Illness check box is not visible");
        }
        Thread.sleep(1000);
        wait.waitForElementToBeVisibleweb(getDriver(), ciamt, 30,"time out to find element on page");
        ciamt.click();
        for (int i = 0; i < 6; i++) {
            ciamt.sendKeys(Keys.BACK_SPACE);
            ciamt.sendKeys(" ");
            ciamt.sendKeys(Keys.DELETE);
        }
        ciamt.sendKeys(CIamount);
        Allure.step( "Enter the Critical Illness Amount  >"  + CIamount);
    }
    public void addSC(String SCamount) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), sc, 30,"time out to find element on page");
        if (sc.isDisplayed()) {
            sc.click();
            Allure.step( "Selected Rider as Surgical Care");
        } else {
            System.out.println("Surgical Care check box is not visible");
        }
        Thread.sleep(1000);
        wait.waitForElementToBeVisibleweb(getDriver(), scamt, 30,"time out to find element on page");
        scamt.click();
        for (int i = 0; i < 6; i++) {
            scamt.sendKeys(Keys.BACK_SPACE);
            scamt.sendKeys(" ");
            scamt.sendKeys(Keys.DELETE);
        }
        scamt.sendKeys(SCamount);
        Allure.step( "Enter the Surgical Care Amount  >"  + SCamount);
    }
    public void addHC(String HCamount) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), hc, 30,"time out to find element on page");
        if (hc.isDisplayed()) {
            hc.click();
            Allure.step( "Selected Rider as Hospital Care");
        } else {
            System.out.println("Hospital Care check box is not visible");
        }
        Thread.sleep(1000);
        wait.waitForElementToBeVisibleweb(getDriver(), hcamt, 30,"time out to find element on page");
        hcamt.click();
        for (int i = 0; i < 6; i++) {
            hcamt.sendKeys(Keys.BACK_SPACE);
            hcamt.sendKeys(" ");
            hcamt.sendKeys(Keys.DELETE);
        }
        hcamt.sendKeys(HCamount);
        Allure.step( "Enter the Hospital Care Amount  >"  + HCamount);
    }
    public void addbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), addfinal, 30,"time out to find element on page");
        if (addfinal.isDisplayed()) {
            addfinal.click();
            Allure.step( "Cicked On Add Button");

        } else {
            System.out.println("ADD button is not visible");
        }
    }
    public void addABG(String EmployeeID) {
        wait.waitForElementToBeVisibleweb(getDriver(), abg, 30,"time out to find element on page");
        if (abg.isDisplayed()) {
            abg.click();
            abg.sendKeys(EmployeeID);
            Allure.step( "Enter Employee ID  >" +EmployeeID);
        } else {
            System.out.println("Enter Employee ID input box is not visible");
        }
    }
    public void profilerdownload() {
        wait.waitForElementToBeVisibleweb(getDriver(), profiler, 30,"time out to find element on page");
        if (profiler.isDisplayed()) {
            profiler.click();
            Allure.step( "PSM Profiler is downloaded");
        } else {
            System.out.println("Profiler button is not visible");
        }
    }
    public void illustrationdownload() {
        wait.waitForElementToBeVisibleweb(getDriver(), illustration, 30,"time out to find element on page");
        if (illustration.isDisplayed()) {
            illustration.click();
            Allure.step( "Illustration is downloaded");
        } else {
            System.out.println("Illustration button is not visible");
        }
    }
    public void clickConfirmPlanBtn(){
        wait.waitForElementToBeVisibleweb(getDriver(), confirmpln, 30,"time out to find element on page");
        if (confirmpln.isDisplayed()) {
            confirmpln.click();
            Allure.step( "Clicked On Confirm Plan Button");
        } else {
            System.out.println("Confirm Plan button is not visible");
        }
    }

    public void addADD(String ADDMamount) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), addisb, 30,"time out to find element on page");
        if (addisb.isDisplayed()) {
            addisb.click();
            Allure.step( "Selected Rider as Accidental Death and Disability");
        } else {
            System.out.println("ADD Plus check box is not visible");
        }
        Thread.sleep(1000);
        wait.waitForElementToBeVisibleweb(getDriver(), addamt, 30,"time out to find element on page");
        addamt.click();
        for (int i = 0; i < 6; i++) {
            addamt.sendKeys(Keys.BACK_SPACE);
            addamt.sendKeys(" ");
            addamt.sendKeys(Keys.DELETE);
        }
        addamt.sendKeys(ADDMamount);
        Allure.step( "Enter the ADD Amount  >"  + ADDMamount);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // View Quote page // 23/6/2023=mayur ===================> FMP

    public void SelectPlanoptWeb(String PlanOption) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), plnopt, 30,"time out to find element on page");
        if(plnopt.isDisplayed()) {
            plnopt.click();
        }
        Thread.sleep(1000);
        WebElement benefit=getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+PlanOption+"')]"));
        if(benefit.isDisplayed()) {
            benefit.click();
            Allure.step( "Select the Plan Option  >"   + PlanOption);
        }
    }
    public void EnterPolicytermWeb(String PolicyTerm){
        wait.waitForElementToBeVisibleweb(getDriver(), polterminp, 50, "time out to find element on page");
        if(polterminp.isDisplayed()){
            polterminp.click();

            for (int i = 0; i < 3; i++) {
                polterminp.sendKeys(Keys.BACK_SPACE);
                polterminp.sendKeys(" ");
                polterminp.sendKeys(Keys.DELETE);
            }
            polterminp.sendKeys(PolicyTerm);
            Allure.step( "Enter the Policy Term  >"   + PolicyTerm);
        }
    }

    // View Quote page // 20/7/2023=mayur ===================> BVI

    public void EnterSumAssuredWeb(String val){
        wait.waitForElementToBeVisibleweb(getDriver(), smasrd, 50, "time out to find element on page");
        if(smasrd.isDisplayed()){
            smasrd.click();

            for (int i = 0; i < 10; i++) {
                smasrd.sendKeys(Keys.BACK_SPACE);
                smasrd.sendKeys(" ");
                smasrd.sendKeys(Keys.DELETE);
            }
            smasrd.sendKeys(val);
            Allure.step( "Enter the Sum Assured Amount  >"   + val);
        }
    }

    public void EnterPolpayingtermmWeb(String PayingTerm) {
        wait.waitForElementToBeVisibleweb(getDriver(), pptpol, 50, "time out to find element on page");
        if (pptpol.isDisplayed()) {
            pptpol.click();

            for (int i = 0; i < 2; i++) {
                pptpol.sendKeys(Keys.BACK_SPACE);
                pptpol.sendKeys(" ");
                pptpol.sendKeys(Keys.DELETE);
            }
            pptpol.sendKeys(PayingTerm);
            Allure.step("Enter the Premium Paying Term  >" + PayingTerm);
        }
    }

    public void EnterPolpayingtermmaspireWeb(String PayingTerm) {
        wait.waitForElementToBeVisibleweb(getDriver(), pptpolaspire, 50, "time out to find element on page");
        if (pptpolaspire.isDisplayed()) {
            pptpolaspire.click();

            for (int i = 0; i < 2; i++) {
                pptpolaspire.sendKeys(Keys.BACK_SPACE);
                pptpolaspire.sendKeys(" ");
                pptpolaspire.sendKeys(Keys.DELETE);
            }
            pptpolaspire.sendKeys(PayingTerm);
            Allure.step("Enter the Premium Paying Term  >" + PayingTerm);
        }
    }
    //--------------------------SAKSHI-------------------------ASP------------------------------------------------------//

    @FindBy(xpath = "//input[@name='policyTermYearsQst']")
    private WebElement PTasp;

    public void EnterPolicytermASPWeb(String val){
        wait.waitForElementToBeVisibleweb(getDriver(), PTasp, 50, "time out to find element on page");
        if(PTasp.isDisplayed()){
            PTasp.click();

            for (int i = 0; i < 3; i++) {
                PTasp.sendKeys(Keys.BACK_SPACE);
                PTasp.sendKeys(" ");
                PTasp.sendKeys(Keys.DELETE);
            }
            polterminp.sendKeys(val);
            Allure.step( "Enter the Premium Amount  >"   + val);
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------------//
    //BFE Anushka vyas 20/07/2022


    public void selectInvestMentOptionWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), investMentOption, 30, "Element is Not Display On Page");
        if (investMentOption.isDisplayed()) {
            investMentOption.click();
            Thread.sleep(1000);
            WebElement investMentValue = getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (investMentValue.isDisplayed()) {
                investMentValue.click();
                Allure.step( "Select Investment Option  >"   + val);
            } else {
                Allure.step( "Select Investment Option is not visible");
            }
        }
        }
    public void selectInvestMentOptionaspireWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), investMentOptionaspire, 30, "Element is Not Display On Page");
        if (investMentOptionaspire.isDisplayed()) {
            investMentOptionaspire.click();
            Thread.sleep(1000);
            WebElement investMentValue = getDriver().findElement(By.xpath("(//ul//li//span[contains(text(),'"+val+"')])[1]"));
            if (investMentValue.isDisplayed()) {
                investMentValue.click();
                Allure.step( "Select Investment Option  >"   + val);
            } else {
                Allure.step( "Select Investment Option is not visible");
            }
        }
    }

    public void selectUnderWritingClassWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb( getDriver(), underWritingClass, 30, "Element is Not Display On Page");
        if (underWritingClass.isDisplayed()) {
            underWritingClass.click();
            Thread.sleep(1000);
            WebElement underWritingValue =  getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (underWritingValue.isDisplayed()) {
                underWritingValue.click();
                Allure.step( "Select UnderWriting Class Option  >"   + val);
            } else {
                Allure.step( "Select UnderWriting Class Option is not visible");
            }
        }
    }

    public void transferfrequencyWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), stptransferFreq, 30, "Element is Not Display On Page");
        if (stptransferFreq.isDisplayed()) {
            stptransferFreq.click();
            Thread.sleep(1000);
            WebElement transferfreqValue = getDriver().findElement(By.xpath("//li[@role='option']/div/span[text()='"+val+"']"));
            if (transferfreqValue.isDisplayed()) {
                transferfreqValue.click();
                Allure.step( "Select Transfer frequency Option  >"   + val);
            }
            else {
                Allure.step( "Select Transfer frequency Option is not visible");
            }
        }
    }
    public void MultiplierFund(String multiplier){
        wait.waitForElementToBeVisibleweb(getDriver(), PassNM, 30,"time out to find element on page");
        PassNM.sendKeys(multiplier);
        Allure.step( "Enter Multiplier  >"   + multiplier);

    }
    public void MagnifierFund(String magnifier){
        wait.waitForElementToBeVisibleweb(getDriver(), magni, 30,"time out to find element on page");
        magni.sendKeys(magnifier);
        Allure.step( "Enter Magnifier  >"   + magnifier);

    }

    public void MaximiserFund(String maximiser){
        wait.waitForElementToBeVisibleweb(getDriver(), maxi, 30,"time out to find element on page");
        maxi.sendKeys(maximiser);
        Allure.step( "Enter Maximiser  >"   + maximiser);

    }
    public void SuperFundinfinia(String superTwenty) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), supertwinf, 30,"time out to find element on page");
        Thread.sleep(500);
        supertwinf.sendKeys(superTwenty);
        Allure.step( "Enter SuperTwenty  >"   + superTwenty);

    }
    public void SuperFund(String superTwenty){
        wait.waitForElementToBeVisibleweb(getDriver(), supertw, 30,"time out to find element on page");
        supertw.sendKeys(superTwenty);
        Allure.step( "Enter SuperTwenty  >"   + superTwenty);

    }
    public void LiquidPlusFund(String liquidPlus){
        wait.waitForElementToBeVisibleweb(getDriver(), liquid, 30,"time out to find element on page");
        liquid.sendKeys(liquidPlus);
        Allure.step( "Enter LiquidPlus  >"   + liquidPlus);

    }
    public void IncomeAdvFund(String incomeAdv){
        wait.waitForElementToBeVisibleweb(getDriver(), incomeAd, 30,"time out to find element on page");
        incomeAd.sendKeys(incomeAdv);
        Allure.step( "Enter Income ADV Fund  >"   + incomeAdv);

    }
    public void AsssureFund(String assureFund){
        wait.waitForElementToBeVisibleweb(getDriver(), assur, 30,"time out to find element on page");
        assur.sendKeys(assureFund);
        Allure.step( "Enter Assured Fund  >"   + assureFund);

    }
    public void Enhancer(String enhance){
        wait.waitForElementToBeVisibleweb(getDriver(), enhanc, 30,"time out to find element on page");
        enhanc.sendKeys(enhance);
        Allure.step( "Enter Enhancer  >"   + enhance);

    }
    public void CappedNintyFund(String CappedNinty){
        wait.waitForElementToBeVisibleweb(getDriver(), capped, 30,"time out to find element on page");
        capped.sendKeys(CappedNinty);
        Allure.step( "Enter Capped Nifty Index  >"   + CappedNinty);

    }
    public void AssetAllocationFundinfinia(String asset) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), assetAllinfinia, 30,"time out to find element on page");
        Thread.sleep(500);
        assetAllinfinia.sendKeys(asset);
        Allure.step( "Enter Asset Allocation  >"   + asset);
    }
    public void CreatorFund(String creatorFund){
        wait.waitForElementToBeVisibleweb(getDriver(), creator, 30,"time out to find element on page");
        creator.sendKeys(creatorFund);
        Allure.step( "Enter Creator  >"   + creatorFund);

    }
    public void MncFundassureplus(String mnu) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mncFaplus, 30,"time out to find element on page");
        Thread.sleep(500);
        mncFaplus.sendKeys(mnu);
        Allure.step( "Enter MNC  >"   + mnu);

    }
    public void valueFund(String valueFund){
        wait.waitForElementToBeVisibleweb(getDriver(), valueF, 30,"time out to find element on page");
        valueF.sendKeys(valueFund);
        Allure.step( "Enter Value & Momentum  >"   + valueFund);

    }
    public void BuilderFund(String builder){
        wait.waitForElementToBeVisibleweb(getDriver(), builderF, 30,"time out to find element on page");
        builderF.sendKeys(builder);
        Allure.step( "Enter Builder  >"   + builder);

    }
    public void ProtectorFund(String protector){
        wait.waitForElementToBeVisibleweb(getDriver(), protectorF, 30,"time out to find element on page");
        protectorF.sendKeys(protector);
        Allure.step( "Enter Protector  >"   + protector);

    }
    public void PureEquityFund(String pureEquity){
        wait.waitForElementToBeVisibleweb(getDriver(), equity, 30,"time out to find element on page");
        equity.sendKeys(pureEquity);
        Allure.step( "Enter Pure Equity  >"   + pureEquity);

    }
    public void AssetAllocationFund(String asset){
        wait.waitForElementToBeVisibleweb(getDriver(), assetAll, 30,"time out to find element on page");
        assetAll.sendKeys(asset);
        Allure.step( "Enter Asset Allocation  >"   + asset);

    }
    public void MncFund(String mnu){
        wait.waitForElementToBeVisibleweb(getDriver(), mncF, 30,"time out to find element on page");
        mncF.sendKeys(mnu);
        Allure.step( "Enter MNC  >"   + mnu);

    }

    //////////////////////////////// ADG ////////////////////

    public void SelectPolicytermADG(String policyterm) throws InterruptedException { //mithil
        wait.waitForElementToBeVisibleweb(getDriver(), termADG, 30,"time out to find element on page");
        if(termADG.isDisplayed()) {
            termADG.click();
        }
        Thread.sleep(1000);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+policyterm+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + policyterm);
        }
    }

    public void SelectPlanOption(String planOption) throws InterruptedException { //mithil
        wait.waitForElementToBeVisibleweb(getDriver(), optionPlan, 30,"time out to find element on page");
        if(optionPlan.isDisplayed()) {
            optionPlan.click();
        }
        Thread.sleep(1000);
        WebElement planOpti=getDriver().findElement(By.xpath("//ul//li//span[text()='"+planOption+"']"));
        if(planOpti.isDisplayed()) {
            planOpti.click();
            Allure.step( "Select the Plan Option  >"   + planOption);
        }
    }

    public void RetirementAge(String retiredAge) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), polpt, 30,"time out to find element on page");
        if(retire.isDisplayed()) {
            retire.click();
        }
        Thread.sleep(1000);
        WebElement retireAge=getDriver().findElement(By.xpath("//ul//li//div//span[text()='"+retiredAge+"']"));
        if(retireAge.isDisplayed()) {
            retireAge.click();
            Allure.step( "Select the PPT  >"   + retiredAge);
        }
    }

    public void SumAssuredReductionFactor(String reductionFactor) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), polpt, 30,"time out to find element on page");
        if(reductionFcator.isDisplayed()) {
            retire.click();
        }
        Thread.sleep(1000);
        WebElement retireAge=getDriver().findElement(By.xpath("//ul//li//div//span[text()='"+reductionFactor+"']"));
        if(retireAge.isDisplayed()) {
            retireAge.click();
            Allure.step( "Select the PPT  >"   + reductionFactor);
        }
    }

    public void SelectIncreasingCover(String increasingCover) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), coverincreasing, 30,"time out to find element on page");
        if(coverincreasing.isDisplayed()) {
            coverincreasing.click();
        }
        Thread.sleep(1000);
        WebElement increasingCo=getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+increasingCover+"')]"));
        if(increasingCo.isDisplayed()) {
            increasingCo.click();
            Allure.step( "Select the Benefit Option  >"   + increasingCover);
        }
    }

    public void EnterSumAssuredAmountWeb(String sumAssuredamount){
        wait.waitForElementToBeVisibleweb(getDriver(), sumassured, 50, "time out to find element on page");
        if(sumassured.isDisplayed()){
            sumassured.click();
            for (int i = 0; i < 12; i++) {
                sumassured.sendKeys(Keys.BACK_SPACE);
                sumassured.sendKeys(" ");
                sumassured.sendKeys(Keys.DELETE);
            }
            sumassured.sendKeys(sumAssuredamount);
            Allure.step( "Enter the Premium Amount  >"   + sumAssuredamount);
        }
    }

    ////////////////////////////////////ANP////////////////////////////////////////////////////////////////////////////////////////
    public void SelectincomevarWeb(String IncomeVariant) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), incvar, 30,"time out to find element on page");
        if(incvar.isDisplayed()) {
            incvar.click();
        }
        Thread.sleep(1000);
        WebElement benefitf=getDriver().findElement(By.xpath("(//ul//li//span[contains(text(),'"+IncomeVariant+"')])[1]"));
        if(benefitf.isDisplayed()) {
            benefitf.click();
            Allure.step( "Select the Income Varient  >"   + IncomeVariant);
        }
    }

    public void SelectidefermentperiodWeb(String DefermentPeriod) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), deferpero, 30,"time out to find element on page");
        if(deferpero.isDisplayed()) {
            deferpero.click();
        }
        Thread.sleep(1000);
        WebElement benefitf=getDriver().findElement(By.xpath("(//ul//li//span[contains(text(),'"+DefermentPeriod+"')])[1]"));
        if(benefitf.isDisplayed()) {
            benefitf.click();
            Allure.step( "Select the Deferment Period  >"   + DefermentPeriod);
        }
    }

    public void SelectisummultiplierWeb(String SumAssuredMultiplier) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), summult, 30,"time out to find element on page");
        if(summult.isDisplayed()) {
            summult.click();
        }
        Thread.sleep(1000);
        WebElement benefitf=getDriver().findElement(By.xpath("(//ul//li//span[contains(text(),'"+SumAssuredMultiplier+"')])[1]"));
        if(benefitf.isDisplayed()) {
            benefitf.click();
            Allure.step( "Select the Sum Assured Multiplier  >"   + SumAssuredMultiplier);
        }
    }
    public void SelectitransferfundWeb(String TransferFund) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), tfund, 30,"time out to find element on page");
        if(tfund.isDisplayed()) {
            tfund.click();
        }
        Thread.sleep(1000);
        WebElement benefitf=getDriver().findElement(By.xpath("(//ul//li//span[contains(text(),'"+TransferFund+"')])[1]"));
        if(benefitf.isDisplayed()) {
            benefitf.click();
            Allure.step( "Select the Transfer Fund  >"   + TransferFund);
        }
    }

    public void SelectRiskProfileWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), riskprof, 30, "Element is Not Display On Page");
        if (riskprof.isDisplayed()) {
            riskprof.click();
            Thread.sleep(1000);
            WebElement transferfreqValue = getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (transferfreqValue.isDisplayed()) {
                transferfreqValue.click();
                Allure.step( "Select Risk Profile Option  >"   + val);
            }
            else {
                Allure.step( "Select Risk Profile option is not visible");
            }
        }
    }

    ///sakshi digi changes

    @FindBy(xpath = "//div[@class='smoke-category']")
    private WebElement smokecategory;

    public void Smokecategory(String SmokerCategory) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), smokecategory, 30,"time out to find element on page");
        if(smokecategory.isDisplayed()) {
            smokecategory.click();
        }
        Thread.sleep(1000);
    }

    //Anushka digi

    @FindBy(xpath = "//div[@id='mui-component-select-increaseMonthlyIncomeQst']")
    private WebElement incomebenifitopt;
    @FindBy(xpath = "//div[@id='mui-component-select-incomeBenefitPeriodQst']")
    private WebElement incomeBeniPeriod;



    public void IncomeBenifitOpt(String incomeBeOpt) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), polpt, 30,"time out to find element on page");
        if(incomebenifitopt.isDisplayed()) {
            incomebenifitopt.click();
        }
        Thread.sleep(1000);
        WebElement incomeBeni=getDriver().findElement(By.xpath("//ul//li//div//span[text()='"+incomeBeOpt+"']"));
        if(incomeBeni.isDisplayed()) {
            incomeBeni.click();
            Allure.step( "Select the PPT  >"   + incomeBeOpt);
        }
    }

    //div[@id='mui-component-select-incomeBenefitPeriodQst']
    public void IncomeBenifitPer(String incomeper) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), polpt, 30,"time out to find element on page");
        if(incomeBeniPeriod.isDisplayed()) {
            incomeBeniPeriod.click();
        }
        Thread.sleep(1000);
        WebElement incomebenifitPe=getDriver().findElement(By.xpath("//ul//li//div//span[text()='"+incomeper+"']"));
        if(incomebenifitPe.isDisplayed()) {
            incomebenifitPe.click();
            Allure.step( "Select the PPT  >"   + incomeper);
        }
    }

// ASK Mayur 6-9-23 //

    @FindBy(xpath = "//div[@id='mui-component-select-sumAssuredQst']")
    private WebElement sauresask;
    @FindBy(xpath = "//input[@name='isACI']")
    private WebElement acisum;
    @FindBy(xpath = "//input[@name='aciSumAssured']")
    private WebElement acisumount;
    @FindBy(xpath = "//div[@id='mui-component-select-optionQst']")
    private WebElement gmsoption;
    public void SelectSmokingStatus(String Issmoker){
        WebElement NonSmoker=getDriver().findElement(By.xpath("//div[@class='non-smoker-selected']"));
        wait.waitforElementToBeClickable(getDriver(), NonSmoker, 30);

        WebElement Smoker= getDriver().findElement(By.xpath("//div[@class='smoker-not-selected']"));
        wait.waitforElementToBeClickable(getDriver(), Smoker, 30);

        if(Issmoker.equalsIgnoreCase("smoker")){
            Smoker.click();
            Allure.step( "Select Smoking Status  >"   + Issmoker);

        }else if(Issmoker.equalsIgnoreCase("Non smoker")){
            NonSmoker.click();
            Allure.step( "Select Smoking Status  >"   + Issmoker);
        }
    }

    public void SelectSumAssuredWeb(String SumAssuredASK) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), sauresask, 30,"time out to find element on page");
        if(sauresask.isDisplayed()) {
            sauresask.click();
        }
        Thread.sleep(1000);
        WebElement assuredselect=getDriver().findElement(By.xpath("//ul//li//span[text()='"+SumAssuredASK+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), assuredselect, 30,"time out to find element on page");
        if(assuredselect.isDisplayed()) {
            assuredselect.click();
            Allure.step( "Select the Sum Assured  >"   + SumAssuredASK);
        }
    }

    public void EnterACIAmountWeb(String ACIumAssuredamount) throws InterruptedException {
       // TestUtil.scrollTillEndOfPage(getDriver());
        //wait.waitForElementToBeVisibleweb(getDriver(), acisum, 50, "time out to find element on page");
        if(acisum.isEnabled()){
            acisum.click();
            Thread.sleep(500);
            for (int i = 0; i < 10; i++) {
                wait.waitForElementToBeVisibleweb(getDriver(), acisumount, 50, "time out to find element on page");
                acisumount.sendKeys(Keys.BACK_SPACE);
                acisumount.sendKeys(" ");
                acisumount.sendKeys(Keys.DELETE);
            }
            acisumount.sendKeys(ACIumAssuredamount);
            Allure.step( "Enter the ACCELERATED CRITICAL ILLNESS (ACI) Amount  >"   + ACIumAssuredamount);
        }
    }

    public void SelectoptionGMSWeb(String OptionGMS) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), gmsoption, 30,"time out to find element on page");
        if(gmsoption.isDisplayed()) {
            gmsoption.click();
        }
        Thread.sleep(1000);
        WebElement assuredselect=getDriver().findElement(By.xpath("//ul//li//span[text()='"+OptionGMS+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), assuredselect, 30,"time out to find element on page");
        if(assuredselect.isDisplayed()) {
            assuredselect.click();
            Allure.step( "Select the Sum Assured  >"   + OptionGMS);
        }
    }

    @FindBy(xpath = "//div[@id='term']")
    private WebElement ptaap;

    public void SelectPoltermAAPWeb(String policyterm) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ptaap, 40,"time out to find element on page");
        if(ptaap.isDisplayed()) {
            ptaap.click();
        }
        wait.WaitTime(2);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+policyterm+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + policyterm);
        }
    }

 //-----------------------------//

    @FindBy(xpath = "//div[@id='mui-component-select-basedOnQst']")
    private WebElement pbased;

    @FindBy(xpath = "//div[@id='mui-component-select-assuredBenefitOptionQst']")
    private WebElement aboption;
    @FindBy(xpath = "//div[@id='mui-component-select-educationMilestoneBenefitPeriodQst']")
    private WebElement eduperiod;
    @FindBy(xpath = "//input[@id='educationAssuredBenefitStartAge']")
    private WebElement assbterm;
    @FindBy(xpath = "//input[@id='marriageAssuredBenefitStartAge']")
    private WebElement massgage;
    @FindBy(xpath = "//div[@id='mui-component-select-saMultipleForMarriage']")
    private WebElement mrgmult;
    @FindBy(xpath = "//input[@id='marriageAssureBenefitPayTermQst']")
    private WebElement mrrgebene;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement elc;

    public void SelectPlanBasedOnWeb(String PlanBasedOn) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), pbased, 40,"time out to find element on page");
        if(pbased.isDisplayed()) {
            pbased.click();
        }
        wait.WaitTime(2);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+PlanBasedOn+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + PlanBasedOn);
        }
    }

    public void SelectChildNominee(String val) throws InterruptedException{
        wait.waitForElementToBeVisibleweb(getDriver(),elc,10,"unable to locate Element");
        elc.click();
        wait.WaitTime(2);
        WebElement AgeOfChild = getDriver().findElement(By.xpath("//label[text()='Age Of Child']/parent::div//div/input"));
        if (AgeOfChild.isDisplayed()) {
            AgeOfChild.click();

            for (int i = 0; i < 3; i++) {
                AgeOfChild.sendKeys(Keys.BACK_SPACE);
                AgeOfChild.sendKeys(" ");
            }
            AgeOfChild.sendKeys(val);
            Allure.step( "Enter Age Of Child  >"   + val);
        }
    }


    public void SelectAssuredBeneoptionWeb(String AssuredBeneOption) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), aboption, 40,"time out to find element on page");
        if(aboption.isDisplayed()) {
            aboption.click();
        }
        wait.WaitTime(2);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+AssuredBeneOption+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + AssuredBeneOption);
        }
    }

    public void SelectEdumsbeneperiodWeb(String EduBenePeriod) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), eduperiod, 40,"time out to find element on page");
        if(eduperiod.isDisplayed()) {
            eduperiod.click();
        }
        wait.WaitTime(2);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+EduBenePeriod+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + EduBenePeriod);
        }
    }

    public void SelectassuredbenepaymenttermWeb(String AssuredBeneTerm) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), assbterm, 40, "time out to find element on page");
        if (assbterm.isDisplayed()) {
            for (int i = 0; i < 3; i++) {
                assbterm.sendKeys(Keys.BACK_SPACE);
                assbterm.sendKeys(" ");
            }
            assbterm.sendKeys(AssuredBeneTerm);
        }
    }
    public void SelectassuredmarriageassuredageWeb(String MarraigeAssuredAge) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), massgage, 40, "time out to find element on page");
        if (massgage.isDisplayed()) {
            for (int i = 0; i < 3; i++) {
                massgage.sendKeys(Keys.BACK_SPACE);
                massgage.sendKeys(" ");
            }
            massgage.sendKeys(MarraigeAssuredAge);
        }
    }

    public void SelectSumassuredmultmarrgWeb(String MarraigeMultiple) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mrgmult, 40,"time out to find element on page");
        if(mrgmult.isDisplayed()) {
            mrgmult.click();
        }
        wait.WaitTime(2);
        WebElement polterm=getDriver().findElement(By.xpath("//ul//li//span[text()='"+MarraigeMultiple+"']"));
        if(polterm.isDisplayed()) {
            polterm.click();
            Allure.step( "Select the Policy Term  >"   + MarraigeMultiple);
        }
    }

    public void SelectassuredmarriagebenetermWeb(String MarraigeBeneTerm) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mrrgebene, 40, "time out to find element on page");
        if (mrrgebene.isDisplayed()) {
            mrrgebene.sendKeys(MarraigeBeneTerm);
        }
    }


    @FindBy(xpath = "//input[@id='term']")
    private WebElement ptnpp;
    public void SelectPoltermNPPWeb(String policyterm) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ptnpp, 40,"time out to find element on page");
        if(ptnpp.isDisplayed()) {
            ptnpp.sendKeys("policyterm");
            Allure.step( "enter the Policy Term  >"   + policyterm);
        }
    }

    ////------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[@class=\"non-smoker-selected\"]")
    public WebElement isNonSmoker;
    @FindBy(xpath = "//div[@class=\"non-smoker-selected\"]")
    public WebElement isSmoker;
    public void isSmokeropt(String value){

        wait.waitforElementToBeClickable(getDriver(), isNonSmoker, 30);
        wait.waitforElementToBeClickable(getDriver(), isSmoker, 30);

        if(value.equalsIgnoreCase("smoker")){
            isSmoker.click();
            Allure.step( "Click on Smoker Button");
        }else if(value.equalsIgnoreCase("Non smoker")){
            isNonSmoker.click();
            Allure.step( "Click on Non-Smoker Button");
        }
    }

    @FindBy(xpath = "(//div[@aria-haspopup=\"listbox\"])[1]")
    public WebElement plancoverdrpdwn;
    public void selectPlanOptionsWeb(String planOpt){
        wait.waitforElementToBeClickable(getDriver(), plancoverdrpdwn, 100);
        plancoverdrpdwn.click();
        WebElement planOptions= getDriver().findElement(By.xpath("//li//span[text()=\""+planOpt+"\"]"));
        wait.waitforElementToBeClickable(getDriver(), planOptions, 100);
        planOptions.click();
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select on plan Option  As=====>"+planOpt);
    }

    /////////salaried
    @FindBy(xpath = "//div[text()='Smoker']")
    public WebElement smokersalaried;
    @FindBy(xpath = "//div[text()='Non Smoker']")
    public WebElement nonsmokersalaried;
    public void isSmokerSalariedTerm(String value){
        if(value.equalsIgnoreCase("Smoker")){
            wait.waitforElementToBeClickable(getDriver(), smokersalaried, 30);
            smokersalaried.click();
            Allure.step("Click on Smoker Button");

        }else if(value.equalsIgnoreCase("Non Smoker")){
            wait.waitforElementToBeClickable(getDriver(), nonsmokersalaried, 30);
            nonsmokersalaried.click();
            Allure.step( "Click on Non-Smoker Button");
        }
    }
    @FindBy(xpath = "//input[@name='sumAssuredQst']")
    public WebElement sumassuredsalaried;
    public void enterSumAssuredWeb(String args){
        wait.waitforElementToBeClickable(getDriver(), sumassuredsalaried, 100);
        if(sumassuredsalaried.isDisplayed()){
            sumassuredsalaried.click();
            for (int i = 0; i < 10; i++) {
                sumassuredsalaried.sendKeys(Keys.BACK_SPACE);
                sumassuredsalaried.sendKeys(" ");
                sumassuredsalaried.sendKeys(Keys.DELETE);
            }  sumassuredsalaried.sendKeys(args);
            Allure.step( "Enter Sum Assured As====>"+args);
        }
    }

    @FindBy(xpath = "//div[contains(@id,'mui-component-select-productNameOptionQst')]")
    public WebElement planoptsalaried;
    public void SelectPlanOptionweb(String val) throws InterruptedException {
        try {
            wait.waitforElementToBeClickable(driver, planoptsalaried, 30);
            planoptsalaried.click();
            Thread.sleep(1000);
            WebElement ele2 =  getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (ele2.isDisplayed()) {
                ele2.click();
            } else {
                //ExtentFactory.getInstance().getExtent().log(LogStatus.FAIL, "Failed To Display=====>"+val);
            }
        }catch(NoSuchElementException e) {
            //ExtentFactory.getInstance().getExtent().log(LogStatus.FAIL, "Unable To Locate Element On Page");
        }
    }
//    @FindBy(xpath = "//div[contains(@id,'mui-component-select-productNameOptionQst')]")
//    public WebElement planoptsalaried;
    public void SelectPlanOption1(String val) throws InterruptedException {
        try {
            //wait.waitforElementToBeClickable(driver, planoptsalaried, 30);
            planoptsalaried.click();
            Thread.sleep(1000);
            WebElement ele2 =  getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (ele2.isDisplayed()) {
                ele2.click();
            } else {
                //ExtentFactory.getInstance().getExtent().log(LogStatus.FAIL, "Failed To Display=====>"+val);
            }
        }catch(NoSuchElementException e) {
            //ExtentFactory.getInstance().getExtent().log(LogStatus.FAIL, "Unable To Locate Element On Page");
        }
    }
    @FindBy(xpath = "//div[contains(@id,'mui-component-select-incomeBenefitPeriodQst')]")
    public WebElement benefitsalaried;
    public void SelectIncomeBenefitPeriodWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb( getDriver(), benefitsalaried, 30, "Element is Not Display On Page");
        if (benefitsalaried.isDisplayed()) {
            benefitsalaried.click();
           Allure.step("click on PT DropDown");
            Thread.sleep(2000);
            WebElement ptvalue =  getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (ptvalue.isDisplayed()) {
                ptvalue.click();
               Allure.step( "Select PT DropDown value As====>"+val);
            } else {
                Allure.step( "PT DropDown value is not display");
            }
        }
        else {
            Allure.step("PT DropDown is not display");
        }
    }
    @FindBy(xpath = "//div[contains(@id,'mui-component-select-increasingLevelQst')]")
    public WebElement escalationsalaried;
    public void SelectIncomeEscalationRateWeb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb( getDriver(), escalationsalaried, 30, "Element is Not Display On Page");
        if (escalationsalaried.isDisplayed()) {
            escalationsalaried.click();
            Allure.step( "click on PT DropDown");
            Thread.sleep(2000);
            WebElement ptvalue =  getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
            if (ptvalue.isDisplayed()) {
                ptvalue.click();
                Allure.step( "Select PT DropDown value As====>"+val);
            } else {
                Allure.step( "PT DropDown value is not display");
            }
        }
        else {
            Allure.step( "PT DropDown is not display");
        }
    }
    @FindBy(xpath = "(//span[@class='MuiIconButton-label'])[1]")
    public WebElement acisalaried;
    public void AddACIRiderWeb() throws InterruptedException{
        wait.waitforElementToBeClickable(getDriver(), acisalaried, 100);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click();", acisalaried);
       Allure.step( "Click on Add Rider Button");

    }
    @FindBy(xpath = "//input[@name='aciSumAssured']")
    public WebElement acisumassuredsalaried;
    public void enterSumAssuredACIWeb(String args){
        wait.waitforElementToBeClickable(getDriver(), acisumassuredsalaried, 100);
        if(acisumassuredsalaried.isDisplayed()){
            acisumassuredsalaried.click();
            for (int i = 0; i < 10; i++) {
                acisumassuredsalaried.sendKeys(Keys.BACK_SPACE);
                acisumassuredsalaried.sendKeys(" ");
                acisumassuredsalaried.sendKeys(Keys.DELETE);
            }  acisumassuredsalaried.sendKeys(args);
            Allure.step("Enter Sum Assured As====>"+args);
        }}

    @FindBy(xpath = "//button[@id='rider-btn']")
    public WebElement addrider;
    public void AddRiderWeb(String val,String riderAmount) throws InterruptedException{
        wait.waitforElementToBeClickable(getDriver(), addrider, 30);
        addrider.click();
       Allure.step("Click on Add Rider Button");
        wait.WaitTime2();
        WebElement addRiderPage = getDriver().findElement(By.xpath("//span[text()='Add Riders']"));
        wait.waitforElementToBeClickable(getDriver(), addRiderPage, 30);
        Assert.assertEquals(addRiderPage.getText(), "Add Riders");
        Allure.step( "Successfully Display  Add Riders Title");
        WebElement selectRiderValue = getDriver().findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
        if (selectRiderValue.isDisplayed()) {
            selectRiderValue.click();
            Allure.step("Click On Rider As=====>"+val);
        }else {
            Allure.step( "Failed To Display Rider As=====>"+val);
        }
        TestUtil.scrollTillEndOfPage(driver);
        wait.WaitTime2();
        WebElement clickAddButton = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        clickAddButton.click();
        wait.WaitTime2();
    }

    public void CloseAlertPopUp(){

        WebElement CloseBTN= getDriver().findElement(By.xpath("//button[@name='CLOSE']"));
        wait.waitforElementToBeClickable(getDriver(), CloseBTN, 100);
        if(CloseBTN.isDisplayed()) {
            CloseBTN.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Close Button");
        }else {
            ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Close Button is Not Display");
        }

    }

    public void selectBenifitOptionWeb(String val) throws InterruptedException {

        WebElement benifitOption =  getDriver().findElement(By.xpath("//div[contains(@id,'mui-component-select-benefitOptionQst')]"));
        wait.waitForElementToBeVisibleweb( getDriver(), benifitOption, 30, "Element is Not Display On Page");
        if (benifitOption.isDisplayed()) {
            benifitOption.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "click on investMentOption DropDown");
            Thread.sleep(3000);
            WebElement benifitOptionValue =  getDriver().findElement(By.xpath("//ul//li//div//span[contains(text(),'"+val+"')]"));
            if (benifitOptionValue.isDisplayed()) {

                benifitOptionValue.click();
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select Investment DropDown value As====>"+val);
            } else {
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Investment DropDown value is not display");
            }

        }
        else {
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "PT DropDown is not display");
        }
    }
    public void selectBenifitPayoutPeriodWeb(String val) throws InterruptedException {

        WebElement benifitPayoutPeriod =  getDriver().findElement(By.xpath("//div[contains(@id,'mui-component-select-benefitPayoutPeriodQst')]"));
        wait.waitForElementToBeVisibleweb( getDriver(), benifitPayoutPeriod, 30, "Element is Not Display On Page");
        if (benifitPayoutPeriod.isDisplayed()) {
            benifitPayoutPeriod.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "click on investMentOption DropDown");
            Thread.sleep(3000);
            WebElement benifitPayoutPeriodValue =  getDriver().findElement(By.xpath("//ul//li//div//span[contains(text(),'"+val+"')]"));
            if (benifitPayoutPeriodValue.isDisplayed()) {

                benifitPayoutPeriodValue.click();
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select Investment DropDown value As====>"+val);
            } else {
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Investment DropDown value is not display");
            }

        }
        else {
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "PT DropDown is not display");
        }
    }

    public void selectBenifitPayoutWeb(String val) throws InterruptedException {

        WebElement benifitPayout =  getDriver().findElement(By.xpath("//div[contains(@id,'mui-component-select-benefitPayoutFrequencyQst')]"));
        wait.waitForElementToBeVisibleweb( getDriver(), benifitPayout, 30, "Element is Not Display On Page");
        if (benifitPayout.isDisplayed()) {
            benifitPayout.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "click on investMentOption DropDown");
            Thread.sleep(3000);
            WebElement benifitPayoutValue =  getDriver().findElement(By.xpath("//ul//li//div//span[contains(text(),'"+val+"')]"));
            if (benifitPayoutValue.isDisplayed()) {

                benifitPayoutValue.click();
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select Investment DropDown value As====>"+val);
            } else {
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Investment DropDown value is not display");
            }

        }
        else {
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "PT DropDown is not display");
        }
    }
    public void selectBonusUtilizationOptionWeb(String val) throws InterruptedException {

        WebElement bonusUtilizationOption =  getDriver().findElement(By.xpath("//div[contains(@id,'mui-component-select-bonusUtilization')]"));
        wait.waitForElementToBeVisibleweb( getDriver(), bonusUtilizationOption, 30, "Element is Not Display On Page");
        if (bonusUtilizationOption.isDisplayed()) {
            bonusUtilizationOption.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "click on investMentOption DropDown");
            Thread.sleep(3000);
            WebElement bonusUtilizationOptionValue =  getDriver().findElement(By.xpath("//ul//li//div//span[contains(text(),'"+val+"')]"));
            if (bonusUtilizationOptionValue.isDisplayed()) {

                bonusUtilizationOptionValue.click();
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select Investment DropDown value As====>"+val);
            } else {
                ExtentFactory.getInstance().getExtent().log(Status.INFO, "Investment DropDown value is not display");
            }

        }
        else {
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "PT DropDown is not display");
        }
    }
    public void payMode(String paymode){


        if(paymode.equalsIgnoreCase("annual")){

            WebElement PayModeAnnual= getDriver().findElement(By.xpath("//div[text()='Annual']"));
            wait.waitforElementToBeClickable(getDriver(), PayModeAnnual, 100);

            PayModeAnnual.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select on Pay Mode    As=====>"+paymode);
        }else if(paymode.equalsIgnoreCase("Semi-Annual")){


            WebElement PayModeSemiAnnual= getDriver().findElement(By.xpath("//div[text()='Semi-Annual']"));
            wait.waitforElementToBeClickable(getDriver(), PayModeSemiAnnual, 100);

            PayModeSemiAnnual.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select on Pay Mode    As=====>"+paymode);
        }else if(paymode.equalsIgnoreCase("Quarterly")){


            WebElement PayModeQuarterly= getDriver().findElement(By.xpath("//div[text()='Quarterly']"));
            wait.waitforElementToBeClickable(getDriver(), PayModeQuarterly, 100);

            PayModeQuarterly.click();

            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select on Pay Mode    As=====>"+paymode);
        }else{

            WebElement PayModeMonthly= getDriver().findElement(By.xpath("//div[text()='Monthly']"));
            wait.waitforElementToBeClickable(getDriver(), PayModeMonthly, 100);

            PayModeMonthly.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select on Pay Mode    As=====>"+paymode);
        }}
}
