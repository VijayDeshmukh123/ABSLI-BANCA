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

public class ViewQuoteFactoryWealth_infinia {

    Dashboard dashboard;
    WaitUtils wait;
    LoginPage loginPage;
    CustomerProfile customerprofile;
    ViewQuote viewquote;

    public static PropertiesUtils prop;
    SoftAssert softassert;
    HealthAndPureTermsPage healthandpuretermspage;
  //  AssertionTest assertionTest;

    //------------------------------------------------------ WEALTH INFINIA ------------------------------------------------------------------//

    public void ViewPageinfinia(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        prop = new PropertiesUtils();
        softassert = new SoftAssert();
        healthandpuretermspage = new HealthAndPureTermsPage(getDriver());
       // assertionTest = new AssertionTest(getDriver());


        if (testData.get("IsPremiumAmountinfinia").equalsIgnoreCase("YES")) {
            viewquote.EnterPremiumAmountWeb(testData.get("premiumamountinfinia"));
        }
        if (testData.get("IsPPTinfinia").equalsIgnoreCase("YES")) {
            Thread.sleep(3000);
            viewquote.SelectPPTWeb(testData.get("pptinfinia"));
        }
        if (testData.get("IsPlanOptioninfinia").equalsIgnoreCase("YES")) {
            viewquote.SelectPlanOption(testData.get("planoptioninfinia"));
        }
        if(testData.get("planoptioninfinia").equalsIgnoreCase("Milestone Variant")){
            viewquote.EnterPolicytermWeb(testData.get("policyterminfinia"));
        }
        if (testData.get("IsSAmultiplierinfinia").equalsIgnoreCase("YES")) {
            viewquote.SelectisummultiplierWeb(testData.get("samultiplierinfinia"));
        }
        if (testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("YES")) {
            viewquote.selectInvestMentOptionaspireWeb(testData.get("InvestOptioninfinia"));
        }

        if (testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("Self Managed Option")||testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("Systematic Transfer Option")||testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("Return Optimiser Option")) {
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassinfinia"));
        }

        if (testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("Self Managed Option")||testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("Systematic Transfer Option")) {
            viewquote.SelectRiskProfileWeb(testData.get("RiskProfileinfinia"));
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassinfinia"));
        }
        if (testData.get("IsPaymodeinfinia").equalsIgnoreCase("YES")) {
            viewquote.SelectPaymodeWeb(testData.get("paymodeinfinia"));
        }


        if (testData.get("IsInvestmentOptioninfinia").equalsIgnoreCase("YES")) {
            if (testData.get("InvestOptioninfinia").equalsIgnoreCase("Self Managed Option")) {
                viewquote.MultiplierFund(testData.get("multiplierinfina"));
                viewquote.MagnifierFund(testData.get("magnifierinfina"));
                viewquote.MaximiserFund(testData.get("maximiserinfina"));
                viewquote.SuperFundinfinia(testData.get("superTwentyinfina"));
                viewquote.LiquidPlusFund(testData.get("liquidPlusinfina"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvinfina"));
                viewquote.AsssureFund(testData.get("assureFundinfina"));
                viewquote.Enhancer(testData.get("enhanceinfina"));
                viewquote.CappedNintyFund(testData.get("CappedNintyinfina"));
                viewquote.CreatorFund(testData.get("creatorFundinfina"));
                viewquote.valueFund(testData.get("valueFundinfina"));
                viewquote.ProtectorFund(testData.get("protectorinfina"));
                viewquote.BuilderFund(testData.get("builderinfina"));
                viewquote.PureEquityFund(testData.get("pureEquityinfina"));
                viewquote.AssetAllocationFundinfinia(testData.get("assetinfina"));
                viewquote.MncFund(testData.get("mnuinfina"));
            }
            if (testData.get("InvestOptioninfinia").equalsIgnoreCase("Systematic Transfer Option")) {
                viewquote.Enhancer(testData.get("enhanceinfina"));
                viewquote.MaximiserFund(testData.get("maximiserinfina"));
                viewquote.SuperFundinfinia(testData.get("superTwentyinfina"));
                viewquote.MncFund(testData.get("mnuinfina"));
                viewquote.CappedNintyFund(testData.get("CappedNintyinfina"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvinfina"));
                viewquote.CreatorFund(testData.get("creatorFundinfina"));
                viewquote.valueFund(testData.get("valueFundinfina"));
                viewquote.MultiplierFund(testData.get("multiplierinfina"));
            }

        }

        // Add riders //
        if (testData.get("IsAddRiderinfinia").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();

            TestUtil.scrollTillTOPOfPage(getDriver());
            if (testData.get("Iswavierofpremiuminfinia").equalsIgnoreCase("Waiver Of Premium")) {
                viewquote.addWOP();
            }
            if(testData.get("AddExtraRiderinfinia").equalsIgnoreCase("YES")) {
                if (testData.get("IsADDRiderinfinia").equalsIgnoreCase("Accidental Death Benefit Plus")) {
                    viewquote.addADB(testData.get("ADDMamountinfinia"));
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
        softassert.assertEquals(PayModeValueupdate[1], testData.get("paymodeWealth_aspire"));

        WebElement PlanOption = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[1]"));
        String PlanOptionValue = PlanOption.getText();
        softassert.assertEquals(PlanOptionValue, testData.get("InvestOptionWealth_aspire"));

        WebElement PT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[2]"));
        String PTValue = PT.getText();
        String[] PTValueupdate = PTValue.split(" ");
        softassert.assertEquals(PTValueupdate[0], testData.get("PolicyTermAWSWealth_aspire"));

        WebElement PPT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[4]"));
        String PPTValue = PPT.getText();
        softassert.assertEquals(PPTValue, testData.get("PayingTermWealth_aspire"));

        TestUtil.scrollTillEndOfPage(getDriver());
        viewquote.clickConfirmPlanBtn(); // Confirm Plan button QA
        dashboard.checkLoaderWeb();















    }
}
