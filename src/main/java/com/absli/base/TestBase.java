package com.absli.base;

//import static com.absli.base.BasePage.getDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Utils.CommonUtils;
import Utils.ExcelUtils;

import com.absli.APIData.ApiData_DCB;
import com.absli.pageObjects.*;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import com.absli.utils.PropertiesUtils;

public class TestBase extends BasePage {
    public static String parameterName;
    static PropertiesUtils prop;
    public ExtentReports extent;

    public Dashboard dashboard;
    public LoginPage loginPage;
    public SalesDetails salesdetails;
    public CustomerProfile customerprofile;
    public ViewQuote viewquote;
    public CommunicationDetails communicationdetails;
    public BankDetails bankdetails;
    public Nominee nominee;
    public AddressDetalis address;
    public InsurerPersonalInfo insurerpersonalinfo;
    public InsuProfessionalDetails insuprofdetails;
    public InsurerPersonalHealth insupersonalhealth;
    public InsurerPersonalHealth insurerpersonalhealth;
    public InsurerLifestyle insurerlifestyle;
    public InsurerFamilyMedical insurerfamilymedical;
    public InsurerCovidDetails insurercoviddetails;
    public InsurerMedicalHistory insurermedicalhistory;
    public ProposerPersonalInfo proposerpersonalinfo;
    public ProposerProfessionalDetails proposerprofdetails;
    public MinorPersonalInfo minorpersonalinfo;
    public MinorPersonalHealth minorpersonalhealth;
    public MinorCovidDetails minorcoviddetails;
    public InsurabilityDeclaration insudecleration;
    public ECCDPage eccd;
    public RandAPage rna;
    public PaymentPage paymentpage;
    public DocumentsPage documentpage;
    public CompanyProfessionalDetails companyprofdetails;
    public ProposerNRIMandate nriMandate;
    public InsurerNRIMandate insurerNriMandate;
    public CommonUtils commonUtils;
    public static WaitUtils wait;
    ApiData_DCB api;
    IARPage IARpage;

    public TestBase() {
        try {
            prop = new PropertiesUtils();
            prop.getProperties("testExcelSheet");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @BeforeMethod
    public void setUp() {
        loginPage = new LoginPage(getDriver());
        dashboard = new Dashboard(getDriver());
        dashboard = new Dashboard(getDriver());
        loginPage = new LoginPage(getDriver());
        salesdetails = new SalesDetails(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        viewquote = new ViewQuote(getDriver());
        communicationdetails = new CommunicationDetails(getDriver());
        bankdetails = new BankDetails(getDriver());
        nominee = new Nominee(getDriver());
        address = new AddressDetalis(getDriver());
        insurerpersonalinfo = new InsurerPersonalInfo(getDriver());
        insuprofdetails = new InsuProfessionalDetails(getDriver());
        insupersonalhealth = new InsurerPersonalHealth((getDriver()));
        insurerlifestyle = new InsurerLifestyle(getDriver());
        insurerfamilymedical = new InsurerFamilyMedical((getDriver()));
        insurercoviddetails = new InsurerCovidDetails(getDriver());
        insurermedicalhistory = new InsurerMedicalHistory(getDriver());
        rna = new RandAPage(getDriver());
        eccd = new ECCDPage(getDriver());
        paymentpage = new PaymentPage(getDriver());
        documentpage = new DocumentsPage(getDriver());
        nriMandate = new ProposerNRIMandate(getDriver());
        insurerNriMandate = new InsurerNRIMandate(getDriver());
        commonUtils = new CommonUtils();
        IARpage = new IARPage(getDriver());

        wait = new WaitUtils();
        api = new ApiData_DCB();
    }


//	@BeforeTest
//    public void setExtent() {
//        ExtentSparkReporter reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/index.html");
//        reporter.config().setReportName("ABSLI-LEAP Report");
//        reporter.config().setDocumentTitle("TestResults");
//
//        extent = new ExtentReports();
//        extent.attachReporter(reporter);
//        extent.setSystemInfo("QA", "MAYUR BHADANE");
//    }
//


//    public static void initialization() throws IOException, InterruptedException {
//
//        BasePage.setDriver();
//        Thread.sleep(6000);
//        System.out.println("Browser setup by Thread " + Thread.currentThread().getId() + " and Driver reference is : " + BasePage.getDriver());
//        getDriver().get(prop.getProperties("Url"));
//        Thread.sleep(6000);
//        System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + BasePage.getDriver().getTitle() + " on driver reference " + BasePage.getDriver());
//        BasePage.getDriver().manage().deleteAllCookies();
//        BasePage.getDriver().manage().window().maximize();
//        Thread.sleep(3000);
//
//    }


    @BeforeClass
    public void preSetup() throws IOException, InterruptedException {
        BasePage.setDriver();
        System.out.println("Browser launch successfully");
        Thread.sleep(6000);
        System.out.println("Browser setup by Thread " + Thread.currentThread().getId() + " and Driver reference is : " + BasePage.getDriver());
        getDriver().get(prop.getProperties("Url"));
        Thread.sleep(6000);
        System.out.println("Title printed by Thread " + Thread.currentThread().getId() + " - " + BasePage.getDriver().getTitle() + " on driver reference " + BasePage.getDriver());
        BasePage.getDriver().manage().deleteAllCookies();
        BasePage.getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }


//    @AfterTest
//    public void endReport() {
//        extent.flush();
//
//    }
/////*
//        @AfterMethod public void tearDown() {
//            BasePage.getDriver().quit();
//        }
//*/

//    public  String failedWeb(String screenshotName) throws IOException {
//        //this.driver=driver;
//        String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        File scrFile=((TakesScreenshot)BasePage.getDriver()).getScreenshotAs(OutputType.FILE);
//        String destination= System.getProperty("user.dir")+"/FailedTestsScreenshots/"+ screenshotName +
//                dateName+".png";
//        FileUtils.copyFile(scrFile, new File(destination));
//
//        return destination;
//    }}
}