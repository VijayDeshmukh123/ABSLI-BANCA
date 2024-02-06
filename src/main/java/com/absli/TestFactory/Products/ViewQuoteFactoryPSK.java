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
public class ViewQuoteFactoryPSK {
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

    public void ViewPagePSK(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException {

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

        if (testData.get("IsSmokingStatusPSK").equalsIgnoreCase("YES")) {
            viewquote.SelectSmokingStatus(testData.get("IssmokerPSK"));
        }
        if (testData.get("IsSumAssuredPSK").equalsIgnoreCase("YES")) {
            viewquote.EnterSumAssuredWeb(testData.get("SumAssuredPSK"));
        }
        if (testData.get("IsSelectPlanOptionsPSK").equalsIgnoreCase("YES")) {
            viewquote.SelectPlanOption(testData.get("planOptionPSK"));
        }
        if (testData.get("IsPolicyTermPSK").equalsIgnoreCase("YES")) {
            viewquote.EnterPolicytermASPWeb(testData.get("PolicyTermPSK"));
        }
        if (testData.get("IsPPTOptionPSK").equalsIgnoreCase("YES")) {
            viewquote.SelectPPTWeb(testData.get("pptPSK"));
        }
        if (testData.get("IsPaymodePSK").equalsIgnoreCase("YES")) { // For Single pay only Annual is there.
            viewquote.SelectPaymodeWeb(testData.get("paymodePSK"));
        }
        if (testData.get("IsACIPSK").equalsIgnoreCase("YES")) {
            viewquote.EnterACIAmountWeb(testData.get("ACIumAssuredamountPSK"));
        }

        // Add riders //
        if (testData.get("IsAddRiderPSK").equalsIgnoreCase("YES")) {
            viewquote.addriderbutton();

            if (testData.get("IswavierofpremiumPSK").equalsIgnoreCase("Waiver Of Premium")) {
                viewquote.addWOP();
            }
            TestUtil.scrollTillTOPOfPage(driver);
            if (testData.get("IsADDRiderPSK").equalsIgnoreCase("Accidental Death and Disability")) {
                viewquote.addADD(testData.get("ADDMamountPSK"));
            }
            if (testData.get("IsCIRiderPSK").equalsIgnoreCase("Critical Illness")) {
                viewquote.addCI(testData.get("CIamountPSK"));
                TestUtil.scrollTillEndOfPage(getDriver());
            }
            if (testData.get("IsSCRiderPSK").equalsIgnoreCase("Surgical Care")) {
                viewquote.addSC(testData.get("SCamountPSK"));
            }
            if (testData.get("IsHSRiderPSK").equalsIgnoreCase("Hospital Care")) {
                viewquote.addHC(testData.get("HCamountPSK"));
                TestUtil.scrollTillEndOfPage(getDriver());
            }
            if ((testData.get("IsADBRiderPSK")).equalsIgnoreCase("Accidental Death Benefit Plus")) {
                viewquote.addADB(testData.get("ADBamountPSK"));
            }
            TestUtil.scrollTillEndOfPage(getDriver());
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

