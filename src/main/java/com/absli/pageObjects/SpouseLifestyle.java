package com.absli.pageObjects;

import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpouseLifestyle extends TestBase {
	   public static WaitUtils wait;
    public SpouseLifestyle(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "(//button[@name='13'])[3]")
    private WebElement narcoticsElespouse;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement narcoticsReasonEle;
    @FindBy(xpath = "(//button[@name='14'])[3]")// SPOUSE
    private WebElement alcoyes;
    @FindBy(xpath = "//input[@name='7123']")
    private WebElement alcoholReasonEle;
    @FindBy(xpath = "(//input[@name='19'])[1]")
    private WebElement BeerEle;
    @FindBy(xpath = "//input[@id='quantity']")
    private WebElement quantityEleAlc;
    @FindBy(xpath = "//div[@id='frequency']")
    private WebElement frequencyEleAlc;
    @FindBy(xpath = "(//input[@name='19'])[2]")
    private WebElement wineEle;
    @FindBy(xpath = "(//input[@name='19'])[3]")
    private WebElement liquorEle;
    @FindBy(xpath = "(//button[@name='20'])[1]")
    private WebElement yesbtnadv;
    @FindBy(xpath = "//input[@name='2023[0].hospitalName']")
    private WebElement hosname;
    @FindBy(xpath = "//input[@name='2023[0].reason']")
    private WebElement reason;
    @FindBy(xpath = "//input[@name='2023[0].dateOfVisit.day']")
    private WebElement visitdd;
    @FindBy(xpath = "//input[@name='2023[0].dateOfVisit.month']")
    private WebElement visitmm;
    @FindBy(xpath = "//input[@name='2023[0].dateOfVisit.year']")
    private WebElement visityy;
    @FindBy(xpath = "//span[text()='SAVE']")
    private WebElement savevisit;
    @FindBy(xpath = "(//button[@name='21'])[1]")
    private WebElement addict;
    @FindBy(xpath = "(//button[@name='22'])[1]")
    private WebElement addinfo;
    @FindBy(xpath = "//input[@name='39']")
    private WebElement infoinp;
    @FindBy(xpath = "(//button[@name='15'])[3]")//SPOUSE
    private WebElement tbncele;
    @FindBy(xpath = "//input[@value='{\"optionId\":\"Q2027.1A1\",\"text\":\"Cigarette\"}']")
    private WebElement cigaretteEle;
    @FindBy(xpath = "//input[@value='{\"optionId\":\"Q2027.1A2\",\"text\":\"Bidi\"}']")
    private WebElement bidiEle;
    @FindBy(xpath = "//input[@value='{\"optionId\":\"Q2027.1A3\",\"text\":\"Paan\"}']")
    private WebElement paanEle;
    @FindBy(xpath = "//input[@value='{\"optionId\":\"Q2027.1A4\",\"text\":\"Tobacco\"}']")
    private WebElement tobacoEle;
    @FindBy(xpath = "//input[@placeholder='No. of Units']")
    private WebElement quantityEleTobac;
    @FindBy(xpath = "//input[@placeholder='No. of years']")
    private WebElement NoOfYearEleTobac;
    @FindBy(xpath = "(//button[@name='2028'])[1]")
    private WebElement speres;
    @FindBy(xpath = "//input[@name='54']")
    private WebElement resn;
    @FindBy(xpath = "(//button[@name='16'])[3]")//SPOUSE
    private WebElement HazardousenarcoticsEle;
    @FindBy(xpath = "//div[@id='mui-component-select-2029']")
    private WebElement HazardousSelect;
    @FindBy(xpath = "//input[@name='2030']")
    private WebElement hzyr;
    @FindBy(xpath = "//div[@id='mui-component-select-2031']")
    private WebElement Hazardou;
    @FindBy(xpath = "(//button[@name=17])[3]")//SPOUSE
    private WebElement trvot;
    @FindBy(xpath = "(//input[@id='country'])[1]")
    private WebElement cntry;
    @FindBy(xpath = "(//input[@id='city'])[1]")
    private WebElement city;
    @FindBy(xpath = "(//input[@name='2038[0].dateOfDeparture'])[1]")
    private WebElement depart;
    @FindBy(xpath = "(//input[@name='2038[0].dateOfArrival'])[1]")
    private WebElement arrvl;
    @FindBy(xpath = "(//div[@id='visa'])[1]")
    private WebElement visa;
    @FindBy(xpath = "(//span[text()='SAVE'])[1]")
    private WebElement visasave;
    @FindBy(xpath = "(//button[@name='Save & Continue'])[2]")//SPOUSE
    private WebElement saveContEle2;

    public void selectNarcoticsYESButtonSpouse() {
        wait.waitForElementToBeVisibleweb(getDriver(), narcoticsElespouse, 20, "Element is Not Display");
        if (narcoticsElespouse.isDisplayed()) {
            narcoticsElespouse.click();
            Allure.step("Select Narcotics Button   > Yes");
        } else {
            System.out.println("Narcotics button is not visible");
        }
    }

    public void EnterReasonForNarcotics(String ProvideDetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), narcoticsReasonEle, 20, "Element is Not Display");
        if (narcoticsReasonEle.isDisplayed()) {
            narcoticsReasonEle.sendKeys(ProvideDetails);
            Allure.step( "Enter Reason For Narcotics   >"   +ProvideDetails);
        } else {
            System.out.println("Narcotics Details button is not visible");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void selectAlcohalConsumptionYESButton() {
        wait.waitForElementToBeVisibleweb(getDriver(), alcoyes, 20, "Element is Not Display");
        if (alcoyes.isDisplayed()) {
            alcoyes.click();
            Allure.step( " Select Alcohol Consumption   > Yes ");
        } else {
            System.out.println("Alcohol Consumption button is not visible");
        }
    }
    public void EnterReasonForalcohol(String ProvideDetails) {
        wait.waitForElementToBeVisibleweb(getDriver(), alcoholReasonEle, 20, "Element is Not Display");
        if (alcoholReasonEle.isDisplayed()) {
            alcoholReasonEle.sendKeys(ProvideDetails);
            Allure.step( "Enter Reason For Alcohol Consumption   >"   +ProvideDetails);
        } else {
            System.out.println("Alcohol Mention Details button is not visible");
        }
    }

    public void TypeofAlcoholConsume(String val, String quantity, String frequency) throws InterruptedException {
        if (val.equalsIgnoreCase("Beer")) {
            wait.waitForElementToBeVisibleweb(getDriver(), BeerEle, 20, "Element is Not Display");
            BeerEle.click();
            Allure.step( " Selected Type of Alcohol  > BEER ");
            if (quantityEleAlc.isDisplayed()) {
                quantityEleAlc.sendKeys(quantity);
                Allure.step( " Quantity of Alcohol  >"  +quantity );
            } else {
                System.out.println("Quantity button is not visible");
            }
            if (frequencyEleAlc.isDisplayed()) {
                frequencyEleAlc.click();
                wait.WaitTime(2);
                WebElement frequencydropdownEle = getDriver().findElement(By.xpath("//ul//li//span[text()='"+frequency+"']"));
                frequencydropdownEle.click();
                Allure.step( " Frequency of Alcohol  >"    +quantity );
            } else {
                System.out.println("Frequency button is not visible");
            }
        }

        if (val.equalsIgnoreCase("Wine")) {
            wait.waitForElementToBeVisibleweb(getDriver(), wineEle, 20, "Element is Not Display");
            wineEle.click();
            Allure.step( " Selected Type of Alcohol  > WINE ");
            if (quantityEleAlc.isDisplayed()) {
                quantityEleAlc.sendKeys(quantity);
                Allure.step( " Quantity of Alcohol  >"    +quantity );
            } else {
                System.out.println("Quantity button is not visible");
            }
            if (frequencyEleAlc.isDisplayed()) {
                frequencyEleAlc.click();
                wait.WaitTime(2);
                WebElement frequencydropdownEle = getDriver().findElement(By.xpath("//ul//li//span[text()='"+frequency+"']"));
                frequencydropdownEle.click();
                Allure.step( " Frequency of Alcohol  >"    +quantity );
            } else {
                System.out.println("Frequency button is not visible");
            }
        }

        if (val.equalsIgnoreCase("Liquor")) {
            wait.waitForElementToBeVisibleweb(getDriver(), wineEle, 20, "Element is Not Display");
            liquorEle.click();
            Allure.step( " Selected Type of Alcohol  > LIQUOR ");
            if (quantityEleAlc.isDisplayed()) {
                quantityEleAlc.sendKeys(quantity);
                Allure.step( " Quantity of Alcohol  >"     +quantity );
            } else {
                System.out.println("Quantity button is not visible");
            }
            if (frequencyEleAlc.isDisplayed()) {
                frequencyEleAlc.click();
                wait.WaitTime(2);
                WebElement frequencydropdownEle = getDriver().findElement(By.xpath("//ul//li//span[text()='"+frequency+"']"));
                frequencydropdownEle.click();
                Allure.step( " Frequency of Alcohol  >"     +quantity );
            } else {
                System.out.println("Frequency button is not visible");
            }
        }
        Allure.step( "Select Type of Alcohol Consume   >"  +val   +quantity   +frequency);

    }

    public void selectAdvicealcoholYESButton(String Hospital, String Reason, String VisitDate, String VisitMonth, String VisitYear) {

        wait.waitForElementToBeVisibleweb(getDriver(), yesbtnadv, 20, "Element is Not Display");
        if (yesbtnadv.isDisplayed()) {
            yesbtnadv.click();
        }
        wait.waitForElementToBeVisibleweb(getDriver(), hosname, 20, "Element is Not Display");
        if (hosname.isDisplayed()) {
            hosname.click();
            hosname.sendKeys(Hospital);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), reason, 20, "Element is Not Display");
        if (reason.isDisplayed()) {
            reason.click();
            reason.sendKeys(Reason);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), visitdd, 20, "Element is Not Display");
        if (visitdd.isDisplayed()) {
            visitdd.click();
            visitdd.sendKeys(VisitDate);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), visitmm, 20, "Element is Not Display");
        if (visitmm.isDisplayed()) {
            visitmm.click();
            visitmm.sendKeys(VisitMonth);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), visityy, 20, "Element is Not Display");
        if (visityy.isDisplayed()) {
            visityy.click();
            visityy.sendKeys(VisitYear);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), savevisit, 20, "Element is Not Display");
        if (savevisit.isDisplayed()) {
            savevisit.click();
        }
        Allure.step( "Select Advice alcohol YES Button   > Yes" +Hospital  +Reason  +VisitDate  +VisitMonth  +VisitYear);

    }
    public void selectAlcohalAddictsYESButton() {
        wait.waitForElementToBeVisibleweb(getDriver(), addict, 20, "Element is Not Display");
        if (addict.isDisplayed()) {
            addict.click();
            Allure.step( "Select Alcohol Addict Button  > Yes");
        } else {
            System.out.println("Alcohol Addicts button is not visible");
        }
    }
    public void selectAlcohalAddinfoYESButton(String Addinfo) {
        wait.waitForElementToBeVisibleweb(getDriver(), addinfo, 20, "Element is Not Display");
        if (addinfo.isDisplayed()) {
            addinfo.click();
        } else {
            System.out.println("Add additional info input box is not visible");
        }
        wait.waitForElementToBeVisibleweb(getDriver(), infoinp, 20, "Element is Not Display");
        if (infoinp.isDisplayed()) {
            infoinp.click();
            infoinp.sendKeys(Addinfo);
            Allure.step( "Select Alcohol Add Info Button   > Yes"    +Addinfo);
        } else {
            System.out.println("Add additional info input box is not visible");
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void selectTobacconicotinYESButton() {
        wait.waitForElementToBeVisibleweb(getDriver(), tbncele, 20, "Element is Not Display");
        if (tbncele.isDisplayed()) {
            tbncele.click();
            Allure.step( "Select Tobacco nicotine   > Yes" );
        } else {
            System.out.println("Tobacco button is not visible");
        }
    }

    public void Clickdurationmonthweb(String MonthDuration) {
        WebElement dur=getDriver().findElement(By.xpath("//button[contains(@value,'"+MonthDuration+"')]"));
        if(dur.isDisplayed()) {
            dur.click();
            Allure.step( "Select Duration Month   >"   +MonthDuration );
        }else {
            System.out.println("Duration Of Month Button is not visible");
        }
    }

    public void TypeofTobacco(String Tobaccotype, String quantity, String noofyear) throws InterruptedException {
        if (Tobaccotype.equalsIgnoreCase("Cigarette")) {
            wait.waitForElementToBeVisibleweb(getDriver(), cigaretteEle, 20, "Element is Not Display");
            cigaretteEle.click();
            wait.waitForElementToBeVisibleweb(getDriver(), quantityEleTobac, 20, "Element is Not Display");
            if (quantityEleTobac.isDisplayed()) {
                quantityEleTobac.sendKeys(quantity);
            } else {
                System.out.println("Quantity button is not visible");
            }
            wait.waitForElementToBeVisibleweb(getDriver(), NoOfYearEleTobac, 20, "Element is Not Display");
            if (NoOfYearEleTobac.isDisplayed()) {
                NoOfYearEleTobac.sendKeys(noofyear);
            } else {
                System.out.println("Duration button is not visible");
            }
        }
        if (Tobaccotype.equalsIgnoreCase("Bidi")) {
            wait.waitForElementToBeVisibleweb(getDriver(), bidiEle, 20, "Element is Not Display");
            bidiEle.click();
            wait.waitForElementToBeVisibleweb(getDriver(), quantityEleTobac, 20, "Element is Not Display");
            if (quantityEleTobac.isDisplayed()) {
                quantityEleTobac.sendKeys(quantity);
            } else {
                System.out.println("Quantity button is not visible");
            }
            wait.waitForElementToBeVisibleweb(getDriver(), NoOfYearEleTobac, 20, "Element is Not Display");
            if (NoOfYearEleTobac.isDisplayed()) {
                NoOfYearEleTobac.sendKeys(noofyear);
            } else {
                System.out.println("Duration button is not visible");
            }
        }
        if (Tobaccotype.equalsIgnoreCase("Paan")) {
            wait.waitForElementToBeVisibleweb(getDriver(), paanEle, 20, "Element is Not Display");
            paanEle.click();
            wait.waitForElementToBeVisibleweb(getDriver(), quantityEleTobac, 20, "Element is Not Display");
            if (quantityEleTobac.isDisplayed()) {
                quantityEleTobac.sendKeys(quantity);
            } else {
                System.out.println("Quantity button is not visible");
            }
            wait.waitForElementToBeVisibleweb(getDriver(), NoOfYearEleTobac, 20, "Element is Not Display");
            if (NoOfYearEleTobac.isDisplayed()) {
                NoOfYearEleTobac.sendKeys(noofyear);
            } else {
                System.out.println("Duration button is not visible");
            }
        }
        if (Tobaccotype.equalsIgnoreCase("Tobacco")) {
            wait.waitForElementToBeVisibleweb(getDriver(), tobacoEle, 20, "Element is Not Display");
            tobacoEle.click();
            wait.waitForElementToBeVisibleweb(getDriver(), quantityEleTobac, 20, "Element is Not Display");
            if (quantityEleTobac.isDisplayed()) {
                quantityEleTobac.sendKeys(quantity);
            } else {
                System.out.println("Quantity button is not visible");
            }
            wait.waitForElementToBeVisibleweb(getDriver(), NoOfYearEleTobac, 20, "Element is Not Display");
            if (NoOfYearEleTobac.isDisplayed()) {
                NoOfYearEleTobac.sendKeys(noofyear);
            } else {
                System.out.println("Duration button is not visible");
            }
        }
        Allure.step( "Select Type of Tobacco Consume    >"    +Tobaccotype   +quantity   +noofyear);

    }
    public void selectAdvisetostopYESButton(String SpecifyReason) {
        wait.waitForElementToBeVisibleweb(getDriver(), speres, 20, "Element is Not Display");
        if (speres.isDisplayed()) {
            speres.click();
        } else {
            System.out.println("Advise to stop button is not visible");
        }
        wait.waitForElementToBeVisibleweb(getDriver(), resn, 20, "Element is Not Display");
        if (resn.isDisplayed()) {
            resn.click();
            resn.sendKeys(SpecifyReason);
            Allure.step( "Select Advise to stop     > Yes"    +SpecifyReason);
        } else {
            System.out.println("Advise to stop button is not visible");
        }

    }

/////////////////////////////////////////////////////////////////////////////////////////

    public void selectHazardousActivityYESButton() {
        wait.waitForElementToBeVisibleweb(getDriver(), HazardousenarcoticsEle, 20, "Element is Not Display");
        if (HazardousenarcoticsEle.isDisplayed()) {
            HazardousenarcoticsEle.click();
            Allure.step( " Select Hazardous Activity Button    > YES");
        } else {
            System.out.println("Hazardous Activity button is not visible");
        }
    }
    public void HazardousSelectOption1(String Hazardactivity) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), HazardousSelect, 20, "Element is Not Display");
        if (HazardousSelect.isDisplayed()) {
            HazardousSelect.click();
            wait.WaitTime(2);
            WebElement Select1Option = getDriver().findElement(By.xpath("//ul//li//span[text()='"+Hazardactivity+"']"));
            if (Select1Option.isDisplayed()) {
                Select1Option.click();
                Allure.step( " Select Hazardous Select Option1    >"    +Hazardactivity);
            } else {
                System.out.println("Hazardous Activity option 1 button is not visible");
            }
        }
    }
    public void enteryerashazard(String MentionYears){
        wait.waitForElementToBeVisibleweb(getDriver(), hzyr, 30, "time out to find element on page");
        if (hzyr.isDisplayed()) {
            hzyr.sendKeys(MentionYears);
            Allure.step( " Enter Year For Hazard   >"    +MentionYears);
        } else {
            System.out.println("Username input box is not visible");
        }
    }
    public void HazardousSelectOption2(String HazardActivityBy) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), Hazardou, 20, "Element is Not Display");
        if (Hazardou.isDisplayed()) {
            Hazardou.click();
            wait.WaitTime(2);
            WebElement Select11ption = getDriver().findElement(By.xpath("//ul//li//span[text()='"+HazardActivityBy+"']"));
            if (Select11ption.isDisplayed()) {
                Select11ption.click();
                Allure.step( "Select Hazardous Select Option2   >"    +HazardActivityBy);
            } else {
                System.out.println("Hazardous Activity option 2 button is not visible");
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void selectTraveloutsideYESButton() {
        wait.waitForElementToBeVisibleweb(getDriver(), trvot, 20, "Element is Not Display");
        if (trvot.isDisplayed()) {
            trvot.click();
            Allure.step( "Select Travel outside Button    >Yes" );

        } else {
            System.out.println("Travel Outside button is not visible");
        }
    }
    public void TravelDetailstwelvemonth(String Country, String City, String DateofDept, String DateofArrvl, String Visatype) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cntry, 20, "Element is Not Display");
        if (cntry.isDisplayed()) {
            cntry.click();
            cntry.sendKeys(Country);
            cntry.sendKeys(Keys.ARROW_DOWN);
            cntry.sendKeys(Keys.ENTER);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), city, 20, "Element is Not Display");
        if (city.isDisplayed()) {
            city.click();
            city.sendKeys(City);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), depart, 20, "Element is Not Display");
        if (depart.isDisplayed()) {
            depart.click();
            depart.sendKeys(DateofDept);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), arrvl, 20, "Element is Not Display");
        if (arrvl.isDisplayed()) {
            arrvl.click();
            arrvl.sendKeys(DateofArrvl);
        }
        wait.waitForElementToBeVisibleweb(getDriver(), visa, 20, "Element is Not Display");
        if (visa.isDisplayed()) {
            visa.click();
        }
        wait.WaitTime(2);
        WebElement selectvisa = getDriver().findElement(By.xpath("//ul//li//span[text()='" + Visatype + "']"));
        if (selectvisa.isDisplayed()) {
            selectvisa.click();
        }
        wait.waitForElementToBeVisibleweb(getDriver(), visasave, 20, "Element is Not Display");
        if (visasave.isDisplayed()) {
            visasave.click();
        }
        Allure.step( "Enter Travel Details In twelve month    > "   +Country   +City   +DateofDept  +DateofArrvl   +Visatype);

    }

    public void ClickSaveContinueminorBtn() {
        wait.waitForElementToBeVisibleweb(getDriver(), saveContEle2, 20, "Element is Not Display");
        if (saveContEle2.isDisplayed()) {
            saveContEle2.click();
            Allure.step( "Clicked On Save & Continue Button ");
        } else {
            System.out.println("Save & Continue button is not visible");
        }
    }
}
