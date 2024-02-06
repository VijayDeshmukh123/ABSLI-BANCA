package com.absli.TestFactory.Products;

import com.absli.pageObjects.*;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.HashMap;

import static com.absli.base.BasePage.getDriver;

public class ViewQuoteFactoryPlatinum {
    Dashboard dashboard;
    WaitUtils wait;
    LoginPage loginPage;
    CustomerProfile customerprofile;
    ViewQuote viewquote;

    public static PropertiesUtils prop;
    SoftAssert softassert;
    HealthAndPureTermsPage healthandpuretermspage;

    public void ViewPagePlatinum_gain(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        prop = new PropertiesUtils();
        softassert = new SoftAssert();
        healthandpuretermspage = new HealthAndPureTermsPage(getDriver());


        if (testData.get("IsPremiumAmountplatinum").equalsIgnoreCase("YES")) {
            viewquote.EnterPremiumAmountWeb(testData.get("premiumamountplatinum"));
        }
        if (testData.get("IsPPTOptionplatinum").equalsIgnoreCase("YES")) {
            viewquote.SelectPPTWeb(testData.get("pptplatinum"));
        }
        if (testData.get("IsPolicytermplatinum").equalsIgnoreCase("YES")) {
            viewquote.EnterPolicytermWeb(testData.get("poltermplatinum"));
        }
        if (testData.get("IsSAMultiplierplatinum").equalsIgnoreCase("YES")) {
            viewquote.SelectisummultiplierWeb(testData.get("SAmultiplatinum"));
        }
        if (testData.get("Isinvestmentoptplatinum").equalsIgnoreCase("YES")) {
            viewquote.selectInvestMentOptionaspireWeb(testData.get("Invoptionplatinum"));
        }
        if (testData.get("Invoptionplatinum").equalsIgnoreCase("Self-Managed Option") || testData.get("Invoptionplatinum").equalsIgnoreCase("Systematic Transfer Option") || testData.get("Invoptionplatinum").equalsIgnoreCase("Return Optimiser Option")) {
            viewquote.selectUnderWritingClassWeb(testData.get("uclassplatinum"));
        }
        if (testData.get("Invoptionplatinum").equalsIgnoreCase("Life Cycle Option") || testData.get("Invoptionplatinum").equalsIgnoreCase("Smart Option")) {
            viewquote.SelectRiskProfileWeb(testData.get("ProfilePlatinum"));
            viewquote.selectUnderWritingClassWeb(testData.get("uclassplatinum"));
        }
        if (testData.get("IsPaymodeplatinum").equalsIgnoreCase("YES")) {
            viewquote.SelectPaymodeWeb(testData.get("paymodeplatinum"));
        }

        if (testData.get("Isinvestmentoptplatinum").equalsIgnoreCase("YES")) {
            if (testData.get("Invoptionplatinum").equalsIgnoreCase("Self-Managed Option")) {
                viewquote.MagnifierFund(testData.get("magnifierplatinum"));
                viewquote.MaximiserFund(testData.get("maximiserplatinum"));
                viewquote.SuperFund(testData.get("superTwentyplatinum"));
                viewquote.CappedNintyFund(testData.get("CappedNintyplatinum"));
                viewquote.AssetAllocationFund(testData.get("assetplatinum"));
                viewquote.LiquidPlusFund(testData.get("liquidPlusplatinum"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvplatinum"));
                viewquote.AsssureFund(testData.get("assureFundplatinum"));
                viewquote.Enhancer(testData.get("enhanceplatinum"));
                viewquote.MultiplierFund(testData.get("multiplierplatinum"));
                viewquote.valueFund(testData.get("valueFundplatinum"));
                viewquote.BuilderFund(testData.get("builderplatinum"));
                viewquote.ProtectorFund(testData.get("protectorplatinum"));
                viewquote.PureEquityFund(testData.get("pureEquityplatinum"));
                viewquote.CreatorFund(testData.get("creatorFundplatinum"));
                viewquote.MncFund(testData.get("mnuplatinum"));
            }
            if (testData.get("Invoptionplatinum").equalsIgnoreCase("Systematic Transfer Option")) {
                viewquote.Enhancer(testData.get("enhanceplatinum"));
                viewquote.MaximiserFund(testData.get("maximiserplatinum"));
                viewquote.SuperFund(testData.get("superTwentyplatinum"));
                viewquote.CappedNintyFund(testData.get("CappedNintyplatinum"));
                viewquote.valueFund(testData.get("valueFundplatinum"));
                viewquote.MncFund(testData.get("mnuplatinum"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvplatinum"));
                viewquote.CreatorFund(testData.get("creatorFundplatinum"));
                viewquote.MultiplierFund(testData.get("multiplierplatinum"));
            }
        }

        // Add riders //
        if (testData.get("IsAddRiderplatinum").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();

            TestUtil.scrollTillTOPOfPage(getDriver());
            if (testData.get("Iswavierofpremiumplatinum").equalsIgnoreCase("Waiver Of Premium")) {
                viewquote.addWOP();
            }
            if(testData.get("AddExtraRiderplatinum").equalsIgnoreCase("YES")) {
                if (testData.get("IsADDRiderplatinum").equalsIgnoreCase("Accidental Death Benefit Plus")) {
                    viewquote.addADB(testData.get("ADDMamountplatinum"));
                }
            }
            viewquote.addbutton();
            Thread.sleep(3000);

        }

        // Profiler Download //
        //viewquote.profilerdownload();

        // Illustration Download //
        //viewquote.illustrationdownload();

        TestUtil.scrollTillEndOfPage(getDriver());
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();

        // Plan Info Page //
        // Assertion for policy tab , all riders and ABG //
        loginPage.Applicationnumber(); // printing of application number in report //

        WebElement PayMode = getDriver().findElement(By.xpath("//div[contains(@class,'payment-cycle-text')]"));
        String PayModeValue = PayMode.getText();
        String[] PayModeValueupdate = PayModeValue.split(": ");
        softassert.assertEquals(PayModeValueupdate[1], testData.get("paymodeplatinum"));

        WebElement PlanOption = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[1]"));
        String PlanOptionValue = PlanOption.getText();
        softassert.assertEquals(PlanOptionValue, testData.get("Invoptionplatinum"));

        WebElement PT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[2]"));
        String PTValue = PT.getText();
        String[] PTValueupdate = PTValue.split(" ");
        softassert.assertEquals(PTValueupdate[0], testData.get("poltermplatinum"));

        WebElement PPT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[4]"));
        String PPTValue = PPT.getText();
        softassert.assertEquals(PPTValue, testData.get("pptplatinum"));

        TestUtil.scrollTillEndOfPage(getDriver());
        viewquote.clickConfirmPlanBtn(); // Confirm Plan button QA
        dashboard.checkLoaderWeb();

    }
}
