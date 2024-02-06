package com.absli.TestFactory.GotoEndtoEnd;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
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

import Utils.SelectChannel_TestFactory;
import Utils.TestUtil;

public class GoToPSMpageJourneyCompany {
    Dashboard dashboard;
    WaitUtils wait;
    CustomerProfile customerprofile;

    public static PropertiesUtils prop;

    //------------------------------------------------------Same GMS------------------------------------------------------------------//

    public void gotoPSMpageCompany(WebDriver driver, HashMap<String, String> testData) throws Exception {

        dashboard = new Dashboard(getDriver());
        customerprofile = new CustomerProfile(getDriver());
        prop = new PropertiesUtils();

      






        //Select Channel
        new SelectChannel_TestFactory().Select_Channel( testData);
        dashboard.checkLoaderWeb();


        // Customer Profile Page //
        customerprofile.EnterAdvisorStateWeb(testData.get("AdvisorState"));
        customerprofile.ClickOnSelectTypeOfProposer(testData.get("proposertype"));
        customerprofile.Ispropandinsusame(testData.get("Ispropsame"));
        customerprofile.SelectPolicyTypeWeb(testData.get("CompanyPolicyType"));
        if(testData.get("CompanyPolicyType").equalsIgnoreCase("Employer-Employee")){
            customerprofile.SelectEntityEmp_emp(testData.get("Entity"));
        }
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();
        customerprofile.EnterCompanyPANWeb(testData.get("CompanyPAN"));
        customerprofile.companyagreecheckbox();
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();

        //customerprofile.EnterCompanyNameWeb(testData.get("CompanyName"));
        customerprofile.EnterCompanyDOIWeb(testData.get("CompanyDOI"));
        customerprofile.cdnextbutton(); // customer details NEXT button(QA)
        dashboard.checkLoaderWeb();
        customerprofile.IsinsurerNRI(testData.get("InsuNRI"));
        customerprofile.IsinsurerNRI("NO");
        customerprofile.IsinsurerNRI(testData.get("InsuNRI"));


        customerprofile.IsinsurerNRI(testData.get("InsuNRI"));
        if(testData.get("InsuNRI").equalsIgnoreCase("YES")){
            customerprofile.selectTypeOfNRI(testData.get("insurNriType"));
            customerprofile.enterCountryOfNRIResidence(testData.get("insurNriCountryResidence"));
            dashboard.checkLoaderWeb();
        }

        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();
        customerprofile.EnterDOBInsuredweb(testData.get("InsurerDOB"));
        customerprofile.clickOnGenderBtnWeb(testData.get("InsuredGender"));
        customerprofile.SalutationTitleInsuredWeb(testData.get("InsuredTitle"));
        WaitUtils.WaitTime(2000);
        customerprofile.EnterFirstNameInsuredweb(testData.get("InsuredFirstname"));
        customerprofile.EnterLastNameInsuredweb(testData.get("InsuredLastname"));
        customerprofile.cpnextbutton(); // customer profile Next Button(QA)
        dashboard.checkLoaderWeb();

    }
}