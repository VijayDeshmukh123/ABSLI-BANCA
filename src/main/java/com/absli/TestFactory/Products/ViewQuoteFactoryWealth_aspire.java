package com.absli.TestFactory.Products;
import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.absli.pageObjects.AddressDetalis;
import com.absli.pageObjects.BankDetails;
import com.absli.pageObjects.CommunicationDetails;
import com.absli.pageObjects.CompanyProfessionalDetails;
import com.absli.pageObjects.CustomerProfile;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.DocumentsPage;
import com.absli.pageObjects.ECCDPage;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.InsuProfessionalDetails;
import com.absli.pageObjects.InsurabilityDeclaration;
import com.absli.pageObjects.InsurerCovidDetails;
import com.absli.pageObjects.InsurerFamilyMedical;
import com.absli.pageObjects.InsurerLifestyle;
import com.absli.pageObjects.InsurerMedicalHistory;
import com.absli.pageObjects.InsurerNRIMandate;
import com.absli.pageObjects.InsurerPersonalHealth;
import com.absli.pageObjects.InsurerPersonalInfo;
import com.absli.pageObjects.JointlifePage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.MinorCovidDetails;
import com.absli.pageObjects.MinorPersonalHealth;
import com.absli.pageObjects.MinorPersonalInfo;
import com.absli.pageObjects.Nominee;
import com.absli.pageObjects.PaymentPage;
import com.absli.pageObjects.ProposerNRIMandate;
import com.absli.pageObjects.ProposerPersonalInfo;
import com.absli.pageObjects.ProposerProfessionalDetails;
import com.absli.pageObjects.RandAPage;
import com.absli.pageObjects.SalesDetails;
import com.absli.pageObjects.SpouseCovidDetails;
import com.absli.pageObjects.SpouseLifestyle;
import com.absli.pageObjects.SpouseMedicalHistory;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;
public class ViewQuoteFactoryWealth_aspire {
    Dashboard dashboard;
    WaitUtils wait;
    LoginPage loginPage;
    SalesDetails salesdetails;
    CustomerProfile customerprofile;
    ViewQuote viewquote;
    CommunicationDetails communicationdetails;
    BankDetails bankdetails;
    Nominee nominee;
    AddressDetalis address;
    CompanyProfessionalDetails companyprofdetails;
    InsurerPersonalInfo insurerpersonalinfo;
    InsuProfessionalDetails insuprofdetails;
    InsurerPersonalHealth insupersonalhealth;
    InsurerLifestyle insurerlifestyle;
    InsurerFamilyMedical insurerfamilymedical;
    InsurerCovidDetails insurercoviddetails;
    InsurerMedicalHistory insurermedicalhistory;
    ProposerPersonalInfo proposerpersonalinfo;
    ProposerProfessionalDetails proposerprofdetails;
    MinorPersonalInfo minorpersonalinfo;
    MinorPersonalHealth minorpersonalhealth;
    MinorCovidDetails minorcoviddetails;
    InsurabilityDeclaration insudecleration;
    ECCDPage eccd;
    ProposerNRIMandate nriMandate;
    InsurerNRIMandate insurerNriMandate;
    RandAPage rna;
    PaymentPage paymentpage;
    DocumentsPage documentpage;
    JointlifePage jointlife;
    SpouseLifestyle spouselifestyle;
    SpouseCovidDetails spousecovid;
    SpouseMedicalHistory spousemedicalhistory;
    public static PropertiesUtils prop;
    SoftAssert softassert;
    HealthAndPureTermsPage healthandpuretermspage;

    public void ViewPageWealth_aspire(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        salesdetails = new SalesDetails(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        communicationdetails = new CommunicationDetails(getDriver());
        bankdetails = new BankDetails(getDriver());
        nominee = new Nominee(getDriver());
        address = new AddressDetalis(getDriver());
        proposerpersonalinfo = new ProposerPersonalInfo(getDriver());
        proposerprofdetails = new ProposerProfessionalDetails(getDriver());
        insurerpersonalinfo = new InsurerPersonalInfo(getDriver());
        insuprofdetails = new InsuProfessionalDetails(getDriver());
        insupersonalhealth = new InsurerPersonalHealth((getDriver()));
        insurerlifestyle = new InsurerLifestyle(getDriver());
        insurerfamilymedical = new InsurerFamilyMedical((getDriver()));
        insurercoviddetails = new InsurerCovidDetails(getDriver());
        insurermedicalhistory = new InsurerMedicalHistory(getDriver());
        nriMandate = new ProposerNRIMandate(getDriver());
        insurerNriMandate = new InsurerNRIMandate(getDriver());
        insurerNriMandate = new InsurerNRIMandate(getDriver());
        rna = new RandAPage(getDriver());
        eccd = new ECCDPage(getDriver());
        paymentpage = new PaymentPage(getDriver());
        documentpage = new DocumentsPage(getDriver());
        prop = new PropertiesUtils();
        softassert = new SoftAssert();
        healthandpuretermspage = new HealthAndPureTermsPage(getDriver());

        if (testData.get("IsPremiumAmountWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.EnterPremiumAmountWeb(testData.get("premiumamountWealth_aspire"));
        }
        if (testData.get("IsPPTWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.EnterPolpayingtermmaspireWeb(testData.get("PayingTermWealth_aspire"));
        }
        if (testData.get("IsPTWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.EnterPolicytermASPWeb(testData.get("PolicyTermAWSWealth_aspire"));
        }
        if (testData.get("IsPlanOptionWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.SelectPlanoptWeb(testData.get("PlanOptionWealth_aspire"));
        }
        if (testData.get("IsInvestmentOptionWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.selectInvestMentOptionaspireWeb(testData.get("InvestOptionWealth_aspire"));

            if(testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Self-Managed")) {
                if(testData.get("IsUnderWritingClassWealth_aspire").equalsIgnoreCase("YES")){
                    viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassWealth_aspire"));
                }
            }
            if(testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Systematic Transfer")) {
                viewquote.transferfrequencyWeb(testData.get("transferFrequWealth_aspire"));
                if(testData.get("IsUnderWritingClassWealth_aspire").equalsIgnoreCase("YES")){
                    viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassWealth_aspire"));
                }
            }
            if (testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Smart Option")) {
                viewquote.SelectRiskProfileWeb(testData.get("RiskProfileWealth_aspire"));
                if(testData.get("IsUnderWritingClassWealth_aspire").equalsIgnoreCase("YES")){
                    viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassWealth_aspire"));
                }
            }
            if (testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Return Optimiser")) {
                if(testData.get("IsUnderWritingClassWealth_aspire").equalsIgnoreCase("YES")){
                    viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassWealth_aspire"));
                }
            }
        }

        if (testData.get("IsPaymodeWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.SelectPaymodeWeb(testData.get("paymodeWealth_aspire"));
        }

        if (testData.get("IsInvestmentOptionWealth_aspire").equalsIgnoreCase("YES")) {
            if (testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Self-Managed")) {
                viewquote.MagnifierFund(testData.get("magnifierWealth_aspire"));
                viewquote.MaximiserFund(testData.get("maximiserWealth_aspire"));
                viewquote.SuperFund(testData.get("superTwentyWealth_aspire"));
                viewquote.CappedNintyFund(testData.get("CappedNintyWealth_aspire"));
                viewquote.AssetAllocationFund(testData.get("assetWealth_aspire"));
                viewquote.LiquidPlusFund(testData.get("liquidPlusWealth_aspire"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvWealth_aspire"));
                viewquote.AsssureFund(testData.get("assureFundWealth_aspire"));
                viewquote.Enhancer(testData.get("enhanceWealth_aspire"));
                viewquote.MultiplierFund(testData.get("multiplierWealth_aspire"));
                viewquote.valueFund(testData.get("valueFundWealth_aspire"));
                viewquote.BuilderFund(testData.get("builderWealth_aspire"));
                viewquote.ProtectorFund(testData.get("protectorWealth_aspire"));
                viewquote.PureEquityFund(testData.get("pureEquityWealth_aspire"));
                viewquote.CreatorFund(testData.get("creatorFundWealth_aspire"));
                viewquote.MncFund(testData.get("mnuWealth_aspire"));
            }
            if (testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Systematic Transfer")) {
                viewquote.Enhancer(testData.get("enhanceWealth_aspire"));
                viewquote.MaximiserFund(testData.get("maximiserWealth_aspire"));
                viewquote.SuperFund(testData.get("superTwentyWealth_aspire"));
                viewquote.CappedNintyFund(testData.get("CappedNintyWealth_aspire"));
                viewquote.valueFund(testData.get("valueFundWealth_aspire"));
                viewquote.MncFund(testData.get("mnuWealth_aspire"));
                viewquote.IncomeAdvFund(testData.get("incomeAdvWealth_aspire"));
                viewquote.CreatorFund(testData.get("creatorFundWealth_aspire"));
                viewquote.MultiplierFund(testData.get("multiplierWealth_aspire"));
            }
            if (testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Smart Option")){
                System.out.println("By deafult it is 100%");
            }
            if (testData.get("InvestOptionWealth_aspire").equalsIgnoreCase("Return Optimiser Option")){
                System.out.println("By deafult it is 100%");
            }
        }

        // Add riders //
        if (testData.get("IsAddRiderWealth_aspire").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();
            if (testData.get("IswavierofpremiumWealth_aspire").equalsIgnoreCase("Waiver Of Premium")) {
                viewquote.addWOP();
            }
            if (testData.get("IsADDRiderWealth_aspire").equalsIgnoreCase("Accidental Death Benefit Plus")) {
                viewquote.addADB(testData.get("ADDMamountWealth_aspire"));
            }
            viewquote.addbutton();

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
        softassert.assertEquals(PayModeValueupdate[1], testData.get("paymode"));

        WebElement PlanOption = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[1]"));
        String PlanOptionValue = PlanOption.getText();
        softassert.assertEquals(PlanOptionValue, testData.get("benefitotion"));

        WebElement PT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[2]"));
        String PTValue = PT.getText();
        String[] PTValueupdate = PTValue.split(" ");
        softassert.assertEquals(PTValueupdate[0], testData.get("policyterm"));

        WebElement PPT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[4]"));
        String PPTValue = PPT.getText();
        softassert.assertEquals(PPTValue, testData.get("ppt"));

        TestUtil.scrollTillEndOfPage(getDriver());
        viewquote.clickConfirmPlanBtn(); // Confirm Plan button QA
        dashboard.checkLoaderWeb();

    }

    }
