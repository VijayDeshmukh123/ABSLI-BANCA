package com.absli.pageObjects;

import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MinorPersonalInfo extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public MinorPersonalInfo(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Minor Personal Details tab // 20/6/2023=mayur
    @FindBy(xpath = "(//input[@name='fatherSpouseName'])[2]")
    private WebElement father;
    @FindBy(xpath = "(//input[@name='motherName'])[2]")
    private WebElement mother;
    @FindBy(xpath = "(//div[contains(@aria-haspopup,'listbox')])[7]")
    private WebElement live;
    @FindBy(xpath = "//input[contains(@id,'birthPlace')]")
    private WebElement ele1 ;
    @FindBy(xpath ="(//button[@name='146'])[1]")
    private WebElement school;
    @FindBy(xpath ="//div[@id='mui-component-select-147']")
    private WebElement study;
    @FindBy(xpath ="(//button[@name='146'])[2]")
    private WebElement clg;
    @FindBy(xpath ="//div[@id='mui-component-select-148']")
    private WebElement clstudy;
    //-----------------------------------------------------------------------------------------------------------------------------//

    @FindBy(xpath ="(//div[@class='MuiButtonBase-root MuiIconButton-root MuiAccordionSummary-expandIcon MuiIconButton-edgeEnd'])[1]")
    private WebElement famhis;
    @FindBy(xpath = "//input[@id='numberOfBrothers']")
    private WebElement brother;
    @FindBy(xpath = "//input[@id='numberOfSisters']")
    private WebElement sister;
    @FindBy(xpath ="(//button[@value='false'])[1]")
    private WebElement noinsu;
    @FindBy(xpath ="//input[@id='childrenInsuredDetails']")
    private WebElement detchild;
    @FindBy(xpath ="(//button[@value='true'])[1]")
    private WebElement yupinsu;
    //------------------------------------------------------------------------------------------------------------------------//
    @FindBy(xpath ="(//button[@value='true'])[2]")
    private WebElement fatyes;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.insurer']")
    private WebElement fatinsuname;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.sumAssured']")
    private WebElement fatSA;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.policyNumber']")
    private WebElement fatpol;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.day']")
    private WebElement fatdd;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.month']")
    private WebElement fatmm;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.year']")
    private WebElement fatyy;
    @FindBy(xpath ="//input[@name='fathersPolicy.0.policyIssueYear']")
    private WebElement fatissueyy;
    @FindBy(xpath ="//button//span[text()='Save']")
    private WebElement fathersave;
    @FindBy(xpath ="(//button[@value='false'])[2]")
    private WebElement fatno;

    @FindBy(xpath ="(//button[@value='true'])[3]")
    private WebElement matyes;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.insurer']")
    private WebElement matinsuname;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.sumAssured']")
    private WebElement matSA;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.policyNumber']")
    private WebElement matpol;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.day']")
    private WebElement matdd;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.month']")
    private WebElement matmm;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.year']")
    private WebElement matyy;
    @FindBy(xpath ="//input[@name='mothersPolicy.0.policyIssueYear']")
    private WebElement matissueyy;
    @FindBy(xpath ="(//span[text()='Save'])[2]")
    private WebElement mathersave;
    @FindBy(xpath ="(//button[@value='false'])[3]")
    private WebElement matno;

    @FindBy(xpath ="(//button[@value='true'])[4]")
    private WebElement broyes;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.insurer']")
    private WebElement broinsuname;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.sumAssured']")
    private WebElement broSA;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.policyNumber']")
    private WebElement bropol;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.day']")
    private WebElement brodd;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.month']")
    private WebElement bromm;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.year']")
    private WebElement broyy;
    @FindBy(xpath ="//input[@name='brothersPolicy.0.policyIssueYear']")
    private WebElement broissueyy;
    @FindBy(xpath ="(//span[text()='Save'])[3]")
    private WebElement brosave;
    @FindBy(xpath ="(//button[@value='false'])[4]")
    private WebElement brono;

    @FindBy(xpath ="(//button[@value='true'])[5]")
    private WebElement sisyes;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.insurer']")
    private WebElement sisinsuname;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.sumAssured']")
    private WebElement sisSA;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.policyNumber']")
    private WebElement sispol;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.day']")
    private WebElement sisdd;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.month']")
    private WebElement sismm;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.year']")
    private WebElement sisyy;
    @FindBy(xpath ="//input[@name='sistersPolicy.0.policyIssueYear']")
    private WebElement sisissueyy;
    @FindBy(xpath ="(//span[text()='Save'])[4]")
    private WebElement sissave;
    @FindBy(xpath ="(//button[@value='false'])[5]")
    private WebElement sisno;


    public void EnterMinorFatherNameweb(String MinorFatherName) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), father, 50, "time out to find element on page");
        if (father.isDisplayed()) {
            father.sendKeys(MinorFatherName);
            Allure.step("Enter the Father name  >"   + MinorFatherName);
        } else {
            System.out.println("Father name input box is not visible");
        }
    }
    public void EnterMinorMotherNameweb(String MinorMotherName) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), mother, 50, "time out to find element on page");
        if (mother.isDisplayed()) {
            mother.sendKeys(MinorMotherName);
            Allure.step("Enter the Mother name  >"   + MinorMotherName);
        } else {
            System.out.println("Mother name input box is not visible");
        }
    }
    public void selectminorliving(String MinorLivingWith) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), live, 50, "time out to find element on page");
        if (live.isDisplayed()) {
            live.click();
        }
        wait.WaitTime(2);
        WebElement OptionEle = getDriver().findElement(By.xpath("//ul//li//span[text()='"+MinorLivingWith+"']"));
        wait.waitforElementToBeClickable(getDriver(), OptionEle, 100);
        OptionEle.click();
    }
    public void SelectBirthPlaceweb(String MinorBirthPlace) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), ele1, 50, "time out to find element on page");
        if (ele1.isDisplayed()) {
            ele1.sendKeys(MinorBirthPlace);
            wait.WaitTime(2);
            ele1.sendKeys(Keys.ARROW_DOWN);
            ele1.sendKeys(Keys.ARROW_DOWN);
            ele1.sendKeys(Keys.ENTER);
            Allure.step("Select Minor Birth Place  >" + MinorBirthPlace);
        } else {
            System.out.println("Minor Birth Place Dropdown is not visible");
        }

    }
    public void selectEducationStage(String Stage, String Studying, String CollegeStudy) throws InterruptedException {
        if (Stage.equalsIgnoreCase("School")) {
            TestUtil.scrollTillEndOfPage(getDriver());
            wait.waitForElementToBeVisibleweb(getDriver(), school, 20, "time out to find element on page");
            school.click();
            wait.WaitTime(2);

            wait.waitForElementToBeVisibleweb(getDriver(), study, 50, "time out to find element on page");
            study.click();
            wait.WaitTime(2);

            WebElement OptionEle = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Studying+"']"));
            wait.waitforElementToBeClickable(getDriver(), OptionEle, 100);
            OptionEle.click();
        }
        else if (Stage.equalsIgnoreCase("College")) {
            wait.waitForElementToBeVisibleweb(getDriver(), clg, 20, "time out to find element on page");
            clg.click();
            wait.WaitTime(2);

            wait.waitForElementToBeVisibleweb(getDriver(), clstudy, 50, "time out to find element on page");
            clstudy.click();

            WebElement OptionEle = getDriver().findElement(By.xpath("//ul//li//span[text()='"+CollegeStudy+"']"));
            wait.waitforElementToBeClickable(getDriver(), OptionEle, 100);
            OptionEle.click();
        }
        Allure.step("Select Minor Educational Stage  >" + Stage);
        Allure.step("Select Class in which Minor Studying  >" + Studying);
        Allure.step("Select Class in which Minor Studying  >" + CollegeStudy);
    }

    ///////////////////////// family insurance history ////////////////////////////////////////////////////////////////
    public void familyinsuhistory() throws InterruptedException {
        TestUtil.scrollTillTOPOfPage(getDriver());
        wait.WaitTime(2);
        wait.waitForElementToBeVisibleweb(getDriver(), famhis, 50, "time out to find element on page");
        if (famhis.isDisplayed()) {
            famhis.click();
            Allure.step("Clicked on Family Insurance History Tab");
        }
        else{
            System.out.println("Family Insurance History Tab is not visible");
        }
    }
    public void enterbrothernumber(String BrotherSibling) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), brother, 50, "time out to find element on page");
        if (brother.isDisplayed()) {
            brother.click();
        }
        wait.WaitTime(2);
        brother.sendKeys(BrotherSibling);
        Allure.step("Enter number of Brother Siblings   >"   +BrotherSibling);
    }
    public void entersisternumber(String SisterSibling) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), sister, 50, "time out to find element on page");
        if (sister.isDisplayed()) {
            sister.click();
        }
        wait.WaitTime(2);
        sister.sendKeys(SisterSibling);
        Allure.step("Enter number of Sister Siblings   >"   +SisterSibling);
    }

    public void selectchildreninsured(String AreChildrenInsured, String childrenDetails) throws InterruptedException {
        if (AreChildrenInsured.equalsIgnoreCase("No")) {
            wait.waitForElementToBeVisibleweb(getDriver(), noinsu, 20, "time out to find element on page");
            noinsu.click();
            wait.WaitTime(2);
            wait.waitForElementToBeVisibleweb(getDriver(), detchild, 50, "time out to find element on page");
            detchild.click();
            wait.waitForElementToBeVisibleweb(getDriver(), detchild, 50, "time out to find element on page");
            detchild.sendKeys(childrenDetails);
        } else if (AreChildrenInsured.equalsIgnoreCase("Yes")) {
            wait.waitForElementToBeVisibleweb(getDriver(), yupinsu, 20, "time out to find element on page");
            yupinsu.click();

        }

    }
    public void selectexistingpolicyfather(String EXistingFather, String FinurerName, String Fsumassured, String Fpolnumber, String Fdate, String Fmonth, String Fyear, String Fissueyear) throws InterruptedException {
        if (EXistingFather.equalsIgnoreCase("Yes")) {
            wait.waitForElementToBeVisibleweb(getDriver(), fatyes, 20, "time out to find element on page");
            fatyes.click();
            wait.WaitTime(2);
            TestUtil.scrollToElement(getDriver(),fatinsuname);
            wait.waitForElementToBeVisibleweb(getDriver(), fatinsuname, 50, "time out to find element on page");
            fatinsuname.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatinsuname, 50, "time out to find element on page");
            fatinsuname.sendKeys(FinurerName);
            wait.waitForElementToBeVisibleweb(getDriver(), fatSA, 50, "time out to find element on page");
            fatSA.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatSA, 50, "time out to find element on page");
            fatSA.sendKeys(Fsumassured);
            wait.waitForElementToBeVisibleweb(getDriver(), fatpol, 50, "time out to find element on page");
            fatpol.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatpol, 50, "time out to find element on page");
            fatpol.sendKeys(Fpolnumber);
            wait.waitForElementToBeVisibleweb(getDriver(), fatdd, 50, "time out to find element on page");
            fatdd.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatdd, 50, "time out to find element on page");
            fatdd.sendKeys(Fdate);
            wait.waitForElementToBeVisibleweb(getDriver(), fatmm, 50, "time out to find element on page");
            fatmm.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatmm, 50, "time out to find element on page");
            fatmm.sendKeys(Fmonth);
            wait.waitForElementToBeVisibleweb(getDriver(), fatyy, 50, "time out to find element on page");
            fatyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatyy, 50, "time out to find element on page");
            fatyy.sendKeys(Fyear);
            wait.waitForElementToBeVisibleweb(getDriver(), fatissueyy, 50, "time out to find element on page");
            fatissueyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), fatissueyy, 50, "time out to find element on page");
            fatissueyy.sendKeys(Fissueyear);
            Allure.step("Clicked on Family Member as   >  Father as YES");
            Allure.step("Enter Name Of Insurer   >"   +FinurerName);
            Allure.step("Enter Sum Assured   >"   +Fsumassured);
            Allure.step("Enter Application / Policy Number   >"   +Fpolnumber);
            Allure.step("Enter Date of Application   >"   +Fdate);
            Allure.step("Enter Month of Application   >"   +Fmonth);
            Allure.step("Enter Year of Application   >"   +Fyear);
            Allure.step("Enter Year of Issue(YYYY)   >"   +Fissueyear);

            TestUtil.scrollToElement(getDriver(),fathersave);
            wait.waitForElementToBeVisibleweb(getDriver(), fathersave, 50, "time out to find element on page");
            fathersave.click();
            Allure.step("Clicked on Family Details Save Button");
        } else if (EXistingFather.equalsIgnoreCase("No")){
            wait.waitForElementToBeVisibleweb(getDriver(), fatno, 20, "time out to find element on page");
            fatno.click();
            Allure.step("Clicked on Family Member as   >  Father as NO");
        }
    }

    public void selectexistingpolicymother(String EXistingMother, String MinurerName, String Msumassured, String Mpolnumber, String Mdate, String Mmonth, String Myear, String Missueyear) throws InterruptedException {
        if (EXistingMother.equalsIgnoreCase("Yes")) {
            wait.waitForElementToBeVisibleweb(getDriver(), matyes, 20, "time out to find element on page");
            matyes.click();
            wait.WaitTime(2);
            TestUtil.scrollToElement(getDriver(),matinsuname);
            wait.waitForElementToBeVisibleweb(getDriver(), matinsuname, 50, "time out to find element on page");
            matinsuname.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matinsuname, 50, "time out to find element on page");
            matinsuname.sendKeys(MinurerName);
            wait.waitForElementToBeVisibleweb(getDriver(), matSA, 50, "time out to find element on page");
            matSA.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matSA, 50, "time out to find element on page");
            matSA.sendKeys(Msumassured);
            wait.waitForElementToBeVisibleweb(getDriver(), matpol, 50, "time out to find element on page");
            matpol.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matpol, 50, "time out to find element on page");
            matpol.sendKeys(Mpolnumber);
            wait.waitForElementToBeVisibleweb(getDriver(), matdd, 50, "time out to find element on page");
            matdd.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matdd, 50, "time out to find element on page");
            matdd.sendKeys(Mdate);
            wait.waitForElementToBeVisibleweb(getDriver(), matmm, 50, "time out to find element on page");
            matmm.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matmm, 50, "time out to find element on page");
            matmm.sendKeys(Mmonth);
            wait.waitForElementToBeVisibleweb(getDriver(), matyy, 50, "time out to find element on page");
            matyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matyy, 50, "time out to find element on page");
            matyy.sendKeys(Myear);
            wait.waitForElementToBeVisibleweb(getDriver(), matissueyy, 50, "time out to find element on page");
            matissueyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), matissueyy, 50, "time out to find element on page");
            matissueyy.sendKeys(Missueyear);
            Allure.step("Clicked on Family Member as   >  Mother as YES");
            Allure.step("Enter Name Of Insurer   >"   +MinurerName);
            Allure.step("Enter Sum Assured   >"   +Msumassured);
            Allure.step("Enter Application / Policy Number   >"   +Mpolnumber);
            Allure.step("Enter Date of Application   >"   +Mdate);
            Allure.step("Enter Month of Application   >"   +Mmonth);
            Allure.step("Enter Year of Application   >"   +Myear);
            Allure.step("Enter Year of Issue(YYYY)   >"   +Missueyear);

            TestUtil.scrollToElement(getDriver(),mathersave);
            wait.waitForElementToBeVisibleweb(getDriver(), mathersave, 50, "time out to find element on page");
            mathersave.click();
            Allure.step("Clicked on Family Details Save Button");

        } else if (EXistingMother.equalsIgnoreCase("No")) {
            wait.waitForElementToBeVisibleweb(getDriver(), matno, 20, "time out to find element on page");
            matno.click();
            Allure.step("Clicked on Family Member as   >  Mother as NO");
        }
    }
    public void selectexistingpolicybrother(String EXistingBrother, String BinurerName, String Bsumassured, String Bpolnumber, String Bdate, String Bmonth, String Byear, String Bissueyear) throws InterruptedException {
        if (EXistingBrother.equalsIgnoreCase("Yes")) {
            wait.waitForElementToBeVisibleweb(getDriver(), broyes, 20, "time out to find element on page");
            broyes.click();
            wait.WaitTime(2);
            TestUtil.scrollToElement(getDriver(),broinsuname);
            wait.waitForElementToBeVisibleweb(getDriver(), broinsuname, 50, "time out to find element on page");
            broinsuname.click();
            wait.waitForElementToBeVisibleweb(getDriver(), broinsuname, 50, "time out to find element on page");
            broinsuname.sendKeys(BinurerName);
            wait.waitForElementToBeVisibleweb(getDriver(), broSA, 50, "time out to find element on page");
            broSA.click();
            wait.waitForElementToBeVisibleweb(getDriver(), broSA, 50, "time out to find element on page");
            broSA.sendKeys(Bsumassured);
            wait.waitForElementToBeVisibleweb(getDriver(), bropol, 50, "time out to find element on page");
            bropol.click();
            wait.waitForElementToBeVisibleweb(getDriver(), bropol, 50, "time out to find element on page");
            bropol.sendKeys(Bpolnumber);
            wait.waitForElementToBeVisibleweb(getDriver(), brodd, 50, "time out to find element on page");
            brodd.click();
            wait.waitForElementToBeVisibleweb(getDriver(), brodd, 50, "time out to find element on page");
            brodd.sendKeys(Bdate);
            wait.waitForElementToBeVisibleweb(getDriver(), bromm, 50, "time out to find element on page");
            bromm.click();
            wait.waitForElementToBeVisibleweb(getDriver(), bromm, 50, "time out to find element on page");
            bromm.sendKeys(Bmonth);
            wait.waitForElementToBeVisibleweb(getDriver(), broyy, 50, "time out to find element on page");
            broyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), broyy, 50, "time out to find element on page");
            broyy.sendKeys(Byear);
            wait.waitForElementToBeVisibleweb(getDriver(), broissueyy, 50, "time out to find element on page");
            broissueyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), broissueyy, 50, "time out to find element on page");
            broissueyy.sendKeys(Bissueyear);
            Allure.step("Clicked on Family Member as   >  Brother as YES");
            Allure.step("Enter Name Of Insurer   >"   +BinurerName);
            Allure.step("Enter Sum Assured   >"   +Bsumassured);
            Allure.step("Enter Application / Policy Number   >"   +Bpolnumber);
            Allure.step("Enter Date of Application   >"   +Bdate);
            Allure.step("Enter Month of Application   >"   +Bmonth);
            Allure.step("Enter Year of Application   >"   +Byear);
            Allure.step("Enter Year of Issue(YYYY)   >"   +Bissueyear);

            TestUtil.scrollToElement(getDriver(),brosave);
            wait.waitForElementToBeVisibleweb(getDriver(), brosave, 50, "time out to find element on page");
            brosave.click();
            Allure.step("Clicked on Family Details Save Button");

        } else if (EXistingBrother.equalsIgnoreCase("No")) {
            wait.waitForElementToBeVisibleweb(getDriver(), brono, 20, "time out to find element on page");
            brono.click();
            Allure.step("Clicked on Family Member as   >  Brother as NO");
        }
    }
    public void selectexistingpolicysister(String EXistingSister, String SinurerName, String Ssumassured, String Spolnumber, String Sdate, String Smonth, String Syear, String Sissueyear) throws InterruptedException {
        if (EXistingSister.equalsIgnoreCase("Yes")) {
            wait.waitForElementToBeVisibleweb(getDriver(), sisyes, 20, "time out to find element on page");
            sisyes.click();
            wait.WaitTime(2);
            TestUtil.scrollToElement(getDriver(),sisinsuname);
            wait.waitForElementToBeVisibleweb(getDriver(), sisinsuname, 50, "time out to find element on page");
            sisinsuname.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sisinsuname, 50, "time out to find element on page");
            sisinsuname.sendKeys(SinurerName);
            wait.waitForElementToBeVisibleweb(getDriver(), sisSA, 50, "time out to find element on page");
            sisSA.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sisSA, 50, "time out to find element on page");
            sisSA.sendKeys(Ssumassured);
            wait.waitForElementToBeVisibleweb(getDriver(), sispol, 50, "time out to find element on page");
            sispol.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sispol, 50, "time out to find element on page");
            sispol.sendKeys(Spolnumber);
            wait.waitForElementToBeVisibleweb(getDriver(), sisdd, 50, "time out to find element on page");
            sisdd.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sisdd, 50, "time out to find element on page");
            sisdd.sendKeys(Sdate);
            wait.waitForElementToBeVisibleweb(getDriver(), sismm, 50, "time out to find element on page");
            sismm.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sismm, 50, "time out to find element on page");
            sismm.sendKeys(Smonth);
            wait.waitForElementToBeVisibleweb(getDriver(), sisyy, 50, "time out to find element on page");
            sisyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sisyy, 50, "time out to find element on page");
            sisyy.sendKeys(Syear);
            wait.waitForElementToBeVisibleweb(getDriver(), sisissueyy, 50, "time out to find element on page");
            sisissueyy.click();
            wait.waitForElementToBeVisibleweb(getDriver(), sisissueyy, 50, "time out to find element on page");
            sisissueyy.sendKeys(Sissueyear);

            Allure.step("Clicked on Family Member as   >  Sister as YES");
            Allure.step("Enter Name Of Insurer   >"   +SinurerName);
            Allure.step("Enter Sum Assured   >"   +Ssumassured);
            Allure.step("Enter Application / Policy Number   >"   +Spolnumber);
            Allure.step("Enter Date of Application   >"   +Sdate);
            Allure.step("Enter Month of Application   >"   +Smonth);
            Allure.step("Enter Year of Application   >"   +Syear);
            Allure.step("Enter Year of Issue(YYYY)   >"   +Sissueyear);

            TestUtil.scrollToElement(getDriver(),sissave);
            wait.waitForElementToBeVisibleweb(getDriver(), sissave, 50, "time out to find element on page");
            sissave.click();
            Allure.step("Clicked on Family Details Save Button");

        } else if (EXistingSister.equalsIgnoreCase("No")) {
            wait.waitForElementToBeVisibleweb(getDriver(), sisno, 20, "time out to find element on page");
            sisno.click();
            Allure.step("Clicked on Family Member as   >  Sister as NO");
        }
    }





















}
