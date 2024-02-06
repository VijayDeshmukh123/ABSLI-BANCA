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
public class ViewQuoteFactoryFortune {
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

    public void ViewPageFortune (WebDriver driver, HashMap < String, String > testData) throws
            InterruptedException, IOException {

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

        if (testData.get("IsPremiumAmountFortune").equalsIgnoreCase("YES")) {
            viewquote.EnterPremiumAmountWeb(testData.get("premiumamountFortune"));

        }
        if (testData.get("IspolicytermFortune").equalsIgnoreCase("YES")) {
            viewquote.SelectPoltermWeb(testData.get("policytermFortune"));

        }
        if (testData.get("IsPPTOptionFortune").equalsIgnoreCase("YES")) {
            viewquote.SelectPPTWeb(testData.get("pptFortune"));

        }
        if(testData.get("IsInvestMentOptionFortune").equalsIgnoreCase("YES")){
            viewquote.selectInvestMentOptionWeb(testData.get("investMentOptionFortune"));

        }
        if(testData.get("investMentOptionFortune").equalsIgnoreCase("Self Managed")){
            if(testData.get("IsUnderWritingClassFortune").equalsIgnoreCase("YES")){
                viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassFortune"));
            }
        }else if(testData.get("investMentOptionFortune").equalsIgnoreCase("Systematic Transfer")) {
            viewquote.transferfrequencyWeb(testData.get("transferFrequ"));
            if (testData.get("IsUnderWritingClassFortune").equalsIgnoreCase("YES")) {
                viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassFortune"));
            }
        }else if (testData.get("investMentOptionFortune").equalsIgnoreCase("Return Optimiser")) {
            if (testData.get("IsUnderWritingClassFortune").equalsIgnoreCase("YES")) {
                viewquote.selectUnderWritingClassWeb(testData.get("underWritingClassFortune"));
            }
        }
        if (testData.get("IsPaymodeFortune").equalsIgnoreCase("YES")) {
            viewquote.SelectPaymodeWeb(testData.get("paymodeFortune"));

        }
        if(testData.get("investMentOptionFortune").equalsIgnoreCase("Self Managed")){
            viewquote.MultiplierFund(testData.get("multiplierFortune"));
            viewquote.MagnifierFund(testData.get("magnifierFortune"));
            viewquote.MaximiserFund(testData.get("maximiserFortune"));
            viewquote.SuperFund(testData.get("superTwentyFortune"));
            viewquote.LiquidPlusFund(testData.get("liquidPlusFortune"));
            viewquote.IncomeAdvFund(testData.get("incomeAdvFortune"));
            viewquote.AsssureFund(testData.get("assureFundFortune"));
            viewquote.Enhancer(testData.get("enhanceFortune"));
            viewquote.CappedNintyFund(testData.get("CappedNintyFortune"));
            viewquote.CreatorFund(testData.get("creatorFundFortune"));
            viewquote.valueFund(testData.get("valueFundFortune"));
            viewquote.ProtectorFund(testData.get("protectorFortune"));
            viewquote.BuilderFund(testData.get("builderFortune"));
            viewquote.PureEquityFund(testData.get("pureEquityFortune"));
            viewquote.AssetAllocationFund(testData.get("assetFortune"));
            viewquote.MncFund(testData.get("mnuFortune"));
        }
        if(testData.get("investMentOptionFortune").equalsIgnoreCase("Systematic Transfer")){
            viewquote.Enhancer(testData.get("enhanceFortune"));
            viewquote.MaximiserFund(testData.get("maximiserFortune"));
            viewquote.SuperFund(testData.get("superTwentyFortune"));
            viewquote.MncFund(testData.get("mnuFortune"));
            viewquote.IncomeAdvFund(testData.get("incomeAdvFortune"));
            viewquote.CreatorFund(testData.get("creatorFundFortune"));
            viewquote.valueFund(testData.get("valueFundFortune"));
            viewquote.MultiplierFund(testData.get("multiplierFortune"));
        }

        // Add riders //
        if (testData.get("IsAddRiderFortune").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();
            if (testData.get("IswavierofpremiumFortune").equalsIgnoreCase("Waiver Of Premium")) {
                viewquote.addWOP();
            }
            if (testData.get("IsADBRiderFortune").equalsIgnoreCase("Accidental Death Benefit Plus")) {
                viewquote.addADB(testData.get("ADMamountFortune"));
            }
            viewquote.addbutton();
            TestUtil.scrollTillEndOfPage(getDriver());
        }

        // Profiler Download //
        //viewquote.profilerdownload();
        //wait.WaitTime2();

        // Illustration Download //
        //viewquote.illustrationdownload();
        //wait.WaitTime2();

        String SumAssuredValue = getDriver().findElement(By.xpath("(//p[@id='Initial-premium-amount'])[3]")).getText();

        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();


        // Plan Info Page //
        // Assertion for policy tab , all riders and ABG //
        loginPage.Applicationnumber(); // printing of application number in report //

        WebElement PayMode = getDriver().findElement(By.xpath("//div[contains(@class,'payment-cycle-text')]"));
        String PayModeValue = PayMode.getText();
        TestUtil.verifybgColor(PayMode, driver);
        String[] PayModeValueupdate = PayModeValue.split(": ");
        softassert.assertEquals(PayModeValueupdate[1], testData.get("paymode"));

        WebElement PlanOption = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[1]"));
        String PlanOptionValue = PlanOption.getText();
        TestUtil.verifybgColor(PlanOption, driver);
        softassert.assertEquals(PlanOptionValue, testData.get("benefitotion"));

        WebElement PT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[2]"));
        String PTValue = PT.getText();
        TestUtil.verifybgColor(PT, driver);
        String[] PTValueupdate = PTValue.split(" ");
        softassert.assertEquals(PTValueupdate[0], testData.get("policyterm"));

        WebElement PPT = getDriver().findElement(By.xpath("(//div[contains(@class,'quote-plan-option')])[4]"));
        String PPTValue = PPT.getText();
        TestUtil.verifybgColor(PPT, driver);
        softassert.assertEquals(PPTValue, testData.get("ppt"));

        TestUtil.scrollTillEndOfPage(getDriver());
        viewquote.clickConfirmPlanBtn(); // Confirm Plan button QA
        dashboard.checkLoaderWeb();

    }
}