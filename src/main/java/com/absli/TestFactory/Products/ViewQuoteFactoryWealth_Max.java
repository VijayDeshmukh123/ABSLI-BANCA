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

public class ViewQuoteFactoryWealth_Max {

    Dashboard dashboard;
    WaitUtils wait;
    LoginPage loginPage;
    CustomerProfile customerprofile;
    ViewQuote viewquote;

    public static PropertiesUtils prop;
    SoftAssert softassert;
    HealthAndPureTermsPage healthandpuretermspage;

    public void ViewPageWealthMax(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        prop = new PropertiesUtils();
        softassert = new SoftAssert();
        healthandpuretermspage = new HealthAndPureTermsPage(getDriver());

        if (testData.get("IsPremiumAmountwealthmax").equalsIgnoreCase("YES")) {
            viewquote.EnterPremiumAmountWeb(testData.get("premiumamountwealthmax"));
        }
        if (testData.get("IsPoltermOptionwealthmax").equalsIgnoreCase("YES")) {
            viewquote.SelectPoltermWeb(testData.get("policytermwealthmax"));
        }
        if (testData.get("IsInvestmentOptionwealthmax").equalsIgnoreCase("YES")) {
            viewquote.selectInvestMentOptionaspireWeb(testData.get("InvestOptionwealthmax"));
        }
        if (testData.get("InvestOptionwealthmax").equalsIgnoreCase("Self-Managed")) {
            viewquote.SelectisummultiplierWeb(testData.get("SumAssuredMultiplierwealthmax"));
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClasswealthmax"));
        }
        if (testData.get("InvestOptionwealthmax").equalsIgnoreCase("Systematic Transfer")) {
            viewquote.SelectitransferfundWeb(testData.get("TransferFundwealthmax"));
            viewquote.SelectisummultiplierWeb(testData.get("SumAssuredMultiplierwealthmax"));
            viewquote.selectUnderWritingClassWeb(testData.get("underWritingClasswealthmax"));
        }

        if (testData.get("IsInvestmentOptionwealthmax").equalsIgnoreCase("YES")) {
            if (testData.get("InvestOptionwealthmax").equalsIgnoreCase("Self-Managed")) {
                viewquote.CreatorFund(testData.get("creatorFundwealthmax"));
                viewquote.MagnifierFund(testData.get("magnifierwealthmax"));
                viewquote.MaximiserFund(testData.get("maximiserwealthmax"));
                viewquote.MultiplierFund(testData.get("multiplierwealthmax"));
                viewquote.SuperFund(testData.get("superTwentywealthmax"));
                viewquote.PureEquityFund(testData.get("pureEquitywealthmax"));
                viewquote.valueFund(testData.get("valueFundwealthmax"));
                viewquote.CappedNintyFund(testData.get("CappedNintywealthmax"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvwealthmax"));
                viewquote.AsssureFund(testData.get("assureFundwealthmax"));
                viewquote.Enhancer(testData.get("enhancewealthmax"));
                viewquote.MncFund(testData.get("mnuwealthmax"));

            }
        }


        if (testData.get("IsAddRiderwealthmax").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();
            TestUtil.scrollTillTOPOfPage(getDriver());
                if (testData.get("IsADDRiderwealthmax").equalsIgnoreCase("Accidental Death Benefit Plus")) {
                    viewquote.addADB(testData.get("ADDMamountwealthmax"));
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

