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

public class ViewQuoteFactoryAssure_Plus {

    Dashboard dashboard;
    WaitUtils wait;
    LoginPage loginPage;
    CustomerProfile customerprofile;
    ViewQuote viewquote;

    public static PropertiesUtils prop;
    SoftAssert softassert;
    HealthAndPureTermsPage healthandpuretermspage;


    public void ViewPageAssureplus(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        prop = new PropertiesUtils();
        softassert = new SoftAssert();
        healthandpuretermspage = new HealthAndPureTermsPage(getDriver());


        if (testData.get("IsPremiumAmountassureplus").equalsIgnoreCase("YES")) {
            viewquote.EnterPremiumAmountWeb(testData.get("premiumamountassureplus"));
        }
        if (testData.get("IsPPTOptionassureplus").equalsIgnoreCase("YES")) {
            viewquote.SelectPPTWeb(testData.get("pptassureplus"));
        }
        if (testData.get("IsPoltermOptionassureplus").equalsIgnoreCase("YES")) {
            viewquote.SelectPoltermWeb(testData.get("policytermassureplus"));
        }
        if(testData.get("Isplanoptionassureplus").equalsIgnoreCase("YES")){
            viewquote.SelectPlanoptWeb(testData.get("planoptionassureplus"));
        }
        if (testData.get("IsInvestmentOptionassureplus").equalsIgnoreCase("YES")) {
            viewquote.selectInvestMentOptionaspireWeb(testData.get("InvestOptionassureplus"));
        }
        if (testData.get("InvestOptionassureplus").equalsIgnoreCase("Self-Managed Option")||testData.get("InvestOptionassureplus").equalsIgnoreCase("Return Optimiser Option")) {
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassassureplus"));
        }
        if (testData.get("InvestOptionassureplus").equalsIgnoreCase("Systematic Transfer Option")) {
            viewquote.transferfrequencyWeb(testData.get("Transferassureplus"));
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassassureplus"));
        }
        if (testData.get("InvestOptionassureplus").equalsIgnoreCase("Smart Option")) {
            viewquote.SelectRiskProfileWeb(testData.get("RiskProfileassureplus"));
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassassureplus"));
        }
        if (testData.get("IsPaymodeassureplus").equalsIgnoreCase("YES")) {
            viewquote.SelectPaymodeWeb(testData.get("paymodeassureplus"));
        }


        if (testData.get("IsInvestmentOptionassureplus").equalsIgnoreCase("YES")) {
            if (testData.get("InvestOptionassureplus").equalsIgnoreCase("Self-Managed Option")) {
                viewquote.LiquidPlusFund(testData.get("liquidPlusassureplus"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvassureplus"));
                viewquote.AsssureFund(testData.get("assureFundassureplus"));
                viewquote.Enhancer(testData.get("enhanceassureplus"));
                viewquote.MagnifierFund(testData.get("magnifierassureplus"));
                viewquote.CreatorFund(testData.get("creatorFundassureplus"));
                viewquote.MultiplierFund(testData.get("multiplierassureplus"));
                viewquote.ProtectorFund(testData.get("protectorassureplus"));
                viewquote.BuilderFund(testData.get("builderassureplus"));
                viewquote.MaximiserFund(testData.get("maximiserassureplus"));
                viewquote.SuperFundinfinia(testData.get("superTwentyassureplus"));
                viewquote.CappedNintyFund(testData.get("CappedNintyassureplus"));
                viewquote.AssetAllocationFundinfinia(testData.get("assetassureplus"));
                viewquote.PureEquityFund(testData.get("pureEquityassureplus"));
                viewquote.valueFund(testData.get("valueFundassureplus"));
                viewquote.MncFundassureplus(testData.get("mnuassureplus"));
            }
            if (testData.get("InvestOptionassureplus").equalsIgnoreCase("Systematic Transfer Option")) {
                viewquote.IncomeAdvFund(testData.get("incomeAdvassureplus"));
                viewquote.Enhancer(testData.get("enhanceassureplus"));
                viewquote.CreatorFund(testData.get("creatorFundassureplus"));
                viewquote.MultiplierFund(testData.get("multiplierassureplus"));
                viewquote.MaximiserFund(testData.get("maximiserassureplus"));
                viewquote.SuperFundinfinia(testData.get("superTwentyassureplus"));
                viewquote.valueFund(testData.get("valueFundassureplus"));
                viewquote.MncFundassureplus(testData.get("mnuassureplus"));
            }
        }

        // Add riders //
        if (testData.get("IsAddRiderassureplus").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();

            TestUtil.scrollTillTOPOfPage(getDriver());
            if (testData.get("Iswavierofpremiumassureplus").equalsIgnoreCase("Waiver Of Premium")) {
                viewquote.addWOP();
            }
            if(testData.get("AddExtraRiderassureplus").equalsIgnoreCase("YES")) {
                if (testData.get("IsADDRiderassureplus").equalsIgnoreCase("Accidental Death Benefit Plus")) {
                    viewquote.addADB(testData.get("ADDMamountassureplus"));
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
