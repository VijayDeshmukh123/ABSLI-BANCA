package com.absli.pageObjects;

//import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuProfessionalDetails extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public InsuProfessionalDetails(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Insurer Professional Details tab // 8/6/2023=mayur
    @FindBy(xpath = "(//div[contains(@id,'mui-component-select-23')])[2]") // for same ='prop' diff='insu'
    private WebElement qualificationele;
    @FindBy(xpath = "(//div[contains(@id,'mui-component-select-24')])[2]")// for same ='prop'  diff='insu'
    private WebElement occupationele;
    @FindBy(xpath = "//input[@name='28']")// for same ='prop'
    private WebElement natureofbusinessele;
    @FindBy(xpath = "(//label[contains(text(),'Name of Business')]/following-sibling::div/input)[1]")// for same ='prop'
    private WebElement nameofbusinessele;
    @FindBy(xpath = "//div[contains(@id,'mui-component-select-29')]")// for same ='prop'
    private WebElement typeoforganisationsele;
    @FindBy(xpath = "(//input[@name='26'])")// for same ='prop'
    private WebElement nameofemployeeele;
    @FindBy(xpath = "//input[@name='30']")// for same ='prop'
    private WebElement Designationsele;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[10]")// for same ='prop'
    private WebElement GSTBtnWeb;
    @FindBy(xpath = "//input[contains(@name,'37')]")// for same ='prop'
    private WebElement gstnumber;
    @FindBy(xpath = "//span[contains(text(),'Save & Continue')]")
    private WebElement SaveContinueButton;

    @FindBy(xpath = "(//input[@name='28'])[2]")// diff='insu'
    private WebElement mdnaturebuss;
    @FindBy(xpath = "(//label[contains(text(),'Name of Business')]/following-sibling::div/input)[2]")// diff='insu'
    private WebElement mdnamebuss;
    @FindBy(xpath = "(//input[@class='MuiInputBase-input MuiFilledInput-input MuiInputBase-inputAdornedEnd MuiFilledInput-inputAdornedEnd'])[3]")// diff='insu'
    private WebElement mdemployee;
    @FindBy(xpath = "(//input[@name='30'])[2]")// diff='insu'
    private WebElement mddesign;
    @FindBy(xpath = "(//div[contains(@id,'mui-component-select-29')])[2]")// diff='insu'
    private WebElement mdtorg;
    @FindBy(xpath = "(//input[@name='31'])[1]")// diff='insu'
    private WebElement mdannme;
    @FindBy(xpath = "(//input[@name='32'])[1]")// diff='insu'
    private WebElement mdannmespouse;
    @FindBy(xpath = "(//input[@name='35'])[1]")// diff='insu'
    private WebElement mdannmecover;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[9]")// diff='insu'
    private WebElement mdgst;
    @FindBy(xpath = "(//input[contains(@name,'37')])[2]")// diff='insu'
    private WebElement mdgstnum;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[10]") //asp plan gst no same case  SAKSHI
    private  WebElement aspgstno;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[7]")//Are you holdng citizenship of any other country?
    private WebElement holding;
    @FindBy(xpath = "")//
    private WebElement holdingcountry;
    @FindBy(xpath = "(//div[contains(text(),'Yes')])[8]")//
    private WebElement taxres;
    @FindBy(xpath = "//input[@name='8']")//
    private WebElement taxnumber;
    
    @FindBy(xpath = "(//input[@name='33'])[1]")//
    private WebElement PatentIncome;
    
    @FindBy(xpath = "(//input[@name='34'])[1]")//
    private WebElement ParentIns;
    
    
    @FindBy(xpath = "(//input[@name='31'])[2]")//
    private WebElement AnnualInsured;
    
    
    public void ParentInsurerAnnualincomeweb(String AnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), PatentIncome, 10,"time out to find element on page");
        if (PatentIncome.isDisplayed()) {
        	PatentIncome.sendKeys(AnnualIncome);
            Allure.step( "Enter the parent Annual Income  >"   + AnnualIncome);

        } else {
            System.out.println("Annual Income button is not visible");
        }

    }
    public void ParentInsurerAnnualincome(String AnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ParentIns, 10,"time out to find element on page");
        if (ParentIns.isDisplayed()) {
        	ParentIns.sendKeys(AnnualIncome);
            Allure.step( "Enter the parent Insurance Annual Income  >"   + AnnualIncome);

        } else {
            System.out.println("Annual Income button is not visible");
        }

    }
    
    
    public void SelectQualificationweb(String qualification) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), qualificationele, 20,"time out to find element on page");
        if(qualificationele.isDisplayed()) {
            qualificationele.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+qualification+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select the qualification  >"   + qualification);

    }
    public void SelectOccupationweb(String occupationOption) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), occupationele, 20,"time out to find element on page");
        if(occupationele.isDisplayed()) {
            occupationele.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+occupationOption+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select the occupation Option  >"   + occupationOption);
    }
    public void EnterOccupationNatureofbusinessweb(String natureofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), natureofbusinessele, 20,"time out to find element on page");
        if (natureofbusinessele.isDisplayed()) {
            natureofbusinessele.sendKeys(natureofbusiness);
            Allure.step( "Enter the Nature Of Business  >"   + natureofbusiness);

        } else {
            System.out.println("Nature of Business button is not visible");
        }

    }
    public void EnterOccupationNameofbusinessweb(String nameofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nameofbusinessele, 20,"time out to find element on page");
        if (nameofbusinessele.isDisplayed()) {
            nameofbusinessele.sendKeys(nameofbusiness);
            Allure.step("Enter the Name Of Business  >"   + nameofbusiness);
        } else {
            System.out.println("Name of Business button is not visible");
        }
    }


    public void selectOccupationTypeofOrganisationweb(String typeoforganisation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), typeoforganisationsele, 20,"time out to find element on page");
        if(typeoforganisationsele.isDisplayed()) {
            typeoforganisationsele.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+typeoforganisation+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select Type of Organisation  >"   + typeoforganisation);
    }
    public void EnterOccupationNameofEmployeeweb(String nameofemployee) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nameofemployeeele, 20,"time out to find element on page");
        if (nameofemployeeele.isDisplayed()) {
            nameofemployeeele.sendKeys(nameofemployee);
            Allure.step( "Enter Name of Employee  >"   +nameofemployee);

        } else {
            System.out.println("Name of Employee button is not visible");
        }
    }
    public void EnterOccupationDesignationweb(String Designation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), Designationsele, 20,"time out to find element on page");
        if (Designationsele.isDisplayed()) {
            Designationsele.sendKeys(Designation);
            Allure.step( "Enter Designation  >"   +Designation);
        } else {
            System.out.println("Enter Designation button is not visible");
        }
    }
    public void ClickOnAreYouRegisterPersonaUnderGSTweb(String GSTnumber) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), GSTBtnWeb, 20,"time out to find element on page");
        if(GSTBtnWeb.isDisplayed()) {
            GSTBtnWeb.click();
        }
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), gstnumber, 20,"time out to find element on page");
        if (gstnumber.isDisplayed()) {
            gstnumber.sendKeys(GSTnumber);
            Allure.step( "Enter GST Number  >"   +GSTnumber);
        }
    }
    public void  ClickonSaveContinueButtonweb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), SaveContinueButton, 20,"time out to find element on page");
        if(SaveContinueButton.isDisplayed()) {
            SaveContinueButton.click();
            Allure.step( "Click On Save & Contiune Button");
        }else {
            System.out.println("GST number button is not visible");
        }
    }

    /////////////////////// major different isurer professional details ////////////////////

    public void InsurerNatureofbusinessweb(String natureofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdnaturebuss, 20,"time out to find element on page");
        if (mdnaturebuss.isDisplayed()) {
            mdnaturebuss.sendKeys(natureofbusiness);
            Allure.step( "Enter the Nature Of Business  >"   + natureofbusiness);

        } else {
            System.out.println("Nature of Business button is not visible");
        }

    }
    public void InsurerNameofbusinessweb(String nameofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdnamebuss, 20,"time out to find element on page");
        if (mdnamebuss.isDisplayed()) {
            mdnamebuss.sendKeys(nameofbusiness);
            Allure.step("Enter the Name Of Business  >"   + nameofbusiness);
        } else {
            System.out.println("Name of Business button is not visible");
        }
    }
    public void InsurerNameofEmployeeweb(String nameofemployee) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdemployee, 20,"time out to find element on page");
        if (mdemployee.isDisplayed()) {
            mdemployee.sendKeys(nameofemployee);
            Allure.step( "Enter Name of Employee  >"   +nameofemployee);

        } else {
            System.out.println("Name of Employee button is not visible");
        }
    }
    public void InsurerDesignationweb(String Designation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mddesign, 20,"time out to find element on page");
        if (mddesign.isDisplayed()) {
            mddesign.sendKeys(Designation);
            Allure.step( "Enter Designation  >"   +Designation);
        } else {
            System.out.println("Enter Designation button is not visible");
        }
    }
    public void InsurerTypeofOrganisationweb(String typeoforganisation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdtorg, 20,"time out to find element on page");
        if(mdtorg.isDisplayed()) {
            mdtorg.click();
        }
        Thread.sleep(1000);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+typeoforganisation+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select Type of Organisation  >"   + typeoforganisation);
    }
    public void InsurerAnnualincomeweb(String AnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdannme, 20,"time out to find element on page");
        if (mdannme.isDisplayed()) {
            mdannme.sendKeys(AnnualIncome);
            Allure.step( "Enter the Annual Income  >"   + AnnualIncome);

        } else {
            System.out.println("Annual Income button is not visible");
        }

    }
    public void InsurerRegisterPersonaUnderGSTweb(String insurerGSTnumber) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdgst, 20,"time out to find element on page");
        if(mdgst.isDisplayed()) {
            mdgst.click();
        }
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), mdgstnum, 20,"time out to find element on page");
        if (mdgstnum.isDisplayed()) {
            mdgstnum.sendKeys(insurerGSTnumber);
            Allure.step( "Enter GST Number  >"   +insurerGSTnumber);
        }
    }

    public void SelectSpouseQualificationweb(String Spousequalification) {
        wait.waitForElementToBeVisibleweb(getDriver(), qualificationele, 20,"time out to find element on page");
        if(qualificationele.isDisplayed()) {
            qualificationele.click();
        }
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Spousequalification+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select the spouse qualification  >"   + Spousequalification);

    }

    public void SelectSpouseOccupationweb(String SpouseoccupationOption) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), occupationele, 20,"time out to find element on page");
        if(occupationele.isDisplayed()) {
            occupationele.click();
        }
        wait.WaitTime(2);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+SpouseoccupationOption+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select the spouse occupation Option  >"   + SpouseoccupationOption);
    }

    public void EnterSpouseOccupationNameofEmployeeweb(String Spousenameofemployee) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nameofemployeeele, 20,"time out to find element on page");
        if (nameofemployeeele.isDisplayed()) {
            nameofemployeeele.sendKeys(Spousenameofemployee);
            Allure.step( "Enter Name of Employee  >"   +Spousenameofemployee);

        } else {
            System.out.println("Name of Employee button is not visible");
        }
    }

    public void SpouseNatureofbusinessweb(String Spousenatureofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdnaturebuss, 20,"time out to find element on page");
        if (mdnaturebuss.isDisplayed()) {
            mdnaturebuss.sendKeys(Spousenatureofbusiness);
            Allure.step( "Enter the Nature Of Business  >"   + Spousenatureofbusiness);

        } else {
            System.out.println("Nature of Business button is not visible");
        }

    }
    public void EnterSpouseOccupationNameofbusinessweb(String Spousenameofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), nameofbusinessele, 20,"time out to find element on page");
        if (nameofbusinessele.isDisplayed()) {
            nameofbusinessele.sendKeys(Spousenameofbusiness);
            Allure.step("Enter the Name Of Business  >"   + Spousenameofbusiness);
        } else {
            System.out.println("Name of Business button is not visible");
        }
    }


    public void SpouseTypeofOrganisationweb(String Spousetypeoforganisation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdtorg, 20,"time out to find element on page");
        if(mdtorg.isDisplayed()) {
            mdtorg.click();
        }
        wait.WaitTime(2);
        WebElement selecttext = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Spousetypeoforganisation+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), selecttext, 20,"time out to find element on page");
        selecttext.click();
        Allure.step( "Select Type of Organisation  >"   + Spousetypeoforganisation);
    }

    public void EnterSpouseOccupationDesignationweb(String SpouseDesignation) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), Designationsele, 20,"time out to find element on page");
        if (Designationsele.isDisplayed()) {
            Designationsele.sendKeys(SpouseDesignation);
            Allure.step( "Enter Designation  >"   +SpouseDesignation);
        } else {
            System.out.println("Enter Designation button is not visible");
        }
    }

    public void SpouseNameofbusinessweb(String Spousenameofbusiness) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdnamebuss, 20,"time out to find element on page");
        if (mdnamebuss.isDisplayed()) {
            mdnamebuss.sendKeys(Spousenameofbusiness);
            Allure.step("Enter the Name Of Business  >"   + Spousenameofbusiness);
        } else {
            System.out.println("Name of Business button is not visible");
        }
    }

    public void SpouseAnnualIncome(String SpouseAnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdannmespouse, 20,"time out to find element on page");
        if (mdannmespouse.isDisplayed()) {
            mdannmespouse.sendKeys(SpouseAnnualIncome);
            Allure.step( "Enter the Spouse Annual Income  >"   + SpouseAnnualIncome);

        } else {
            System.out.println("Spouse Annual Income button is not visible");
        }

    }
    public void SpouseCover(String SpouseCover) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mdannmecover, 20,"time out to find element on page");
        if (mdannmecover.isDisplayed()) {
            mdannmecover.sendKeys(SpouseCover);
            Allure.step( "Enter the Annual Income  >"   + SpouseCover);

        } else {
            System.out.println("Annual Income button is not visible");
        }

    }

    public void ClickOnAreYouRegisterPersonaUnderGSTwebASP(String GSTnumber) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), aspgstno, 20,"time out to find element on page");
        if(aspgstno.isDisplayed()) {
            aspgstno.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), gstnumber, 30);
        if (gstnumber.isDisplayed()) {
            gstnumber.sendKeys(GSTnumber);
            Allure.step( "Enter GST Number  >"   +GSTnumber);
        }
    }
///////////////////////////// NRI //////////////////////////////////////////////

    public void AreYouholdingothercitizenship(String OtherCitizenship) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), holding, 20,"time out to find element on page");
        if(holding.isDisplayed()) {
            holding.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), holdingcountry, 30);
        if (holdingcountry.isDisplayed()) {
            holdingcountry.sendKeys(OtherCitizenship);
            Allure.step( "Select other Country which you are Holdng Citizenship >"   +OtherCitizenship);
        }
    }

    public void AreYoutaxrescountry(String TaxResidentNumber) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), taxres, 20,"time out to find element on page");
        if(taxres.isDisplayed()) {
            taxres.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), taxnumber, 30);
        if (taxnumber.isDisplayed()) {
            taxnumber.sendKeys(TaxResidentNumber);
            Allure.step( "Enter Tax Resident Number Of Other Country  >"   +TaxResidentNumber);
        }
    }


    public void InsuredAnnualincomeweb(String args) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), AnnualInsured, 20,"time out to find element on page");
        if(AnnualInsured.isDisplayed()) {
        	AnnualInsured.click();
        }
        wait.WaitTime(2);
        wait.waitforElementToBeClickable(getDriver(), AnnualInsured, 30);
        if (AnnualInsured.isDisplayed()) {
        	AnnualInsured.sendKeys(args);
            Allure.step( "Enter Annual Income For Insured >"   +args);
        }
    }

    @FindBy(xpath = "(//input[@name='33'])[1]")// diff='insu'
    private WebElement parannual;
    @FindBy(xpath = "(//input[@name='34'])[1]")// diff='insu'
    private WebElement parcover;
    public void ParentsAnnualIncome(String ParentsAnnualIncome) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), parannual, 20,"time out to find element on page");
        if (parannual.isDisplayed()) {
            parannual.sendKeys(ParentsAnnualIncome);
            Allure.step( "Enter the Parent Annual Income  >"   + ParentsAnnualIncome);

        } else {
            System.out.println("Parent Annual Income button is not visible");
        }

    }
    public void ParentsInsuCover(String ParentsCover) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), parcover, 20,"time out to find element on page");
        if (parcover.isDisplayed()) {
            parcover.sendKeys(ParentsCover);
            Allure.step( "Enter the Parent Insurance cover  >"   + ParentsCover);

        } else {
            System.out.println("Parent Insurance Cover button is not visible");
        }

    }



}
