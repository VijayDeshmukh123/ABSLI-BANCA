package com.absli.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import io.qameta.allure.Allure;
import com.aventstack.extentreports.Status;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.absli.base.BasePage.getDriver;


public class ProposerNRIMandate extends TestBase{

    public ProposerNRIMandate(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='nriIndianOriginQstCountryPRQst']")
    private WebElement permanentResidenceNri;
    @FindBy(xpath = "//input[@name='prDate']")
    private WebElement pResidenceDate;
    @FindBy(xpath = "//input[@name='lastVisitIndiaDate']")
    private WebElement dateLastVisitedIndia;
    @FindBy(xpath = "//input[@name='nriIndianOriginPassportNumber']")
    private WebElement passportNum;

    @FindBy(xpath = "//input[@name='nriStayNature']")
    private WebElement stuAbroad;
    @FindBy(xpath = "//input[@name='nriStayNatureSpecificReason2']")
    private WebElement reasonStayAbroad;
    @FindBy(xpath = "//input[@name='nriIntendedStayYears']")
    private WebElement intendedDurationYr;
    @FindBy(xpath = "//input[@name='nriIntendedStayMonths']")
    private WebElement intendedDurationMon;
    @FindBy(xpath = "//input[@name='nriAbroadAddress1Qst']")
    private WebElement nriAddress1;
    @FindBy(xpath = "//input[@name='nriAbroadAddress2Qst']")
    private WebElement nriAddress2;
    @FindBy(xpath = "//input[@name='nriAbroadAddress3Qst']")
    private WebElement nriAddress3;
    @FindBy(xpath = "//input[@name='nriAbroadAreaQst']")
    private WebElement nriArea;
    @FindBy(xpath = "//input[@name='nriAbroadCityQst']")
    private WebElement nriCity;
    @FindBy(xpath = "//input[@name='nriAbroadStateQst']")
    private WebElement nriState;
    @FindBy(xpath = "//input[@name='nriAbroadPinCodeQst']")
    private WebElement nriPinCode;
    @FindBy(xpath = "//input[@name='nriAbroadTelMobileQst']")
    private WebElement nrimobnum;
    @FindBy(xpath = "//input[@name='nriAbroadTelResidenceQst']")
    private WebElement nriTeleNumberResidence;
    @FindBy(xpath = "//input[@name='nriAbroadTelOfficeQst']")
    private WebElement nriTeleNumberOffice;
    @FindBy(xpath = "//input[@id='country']")
    private WebElement lastTravelled12Months;
    @FindBy(xpath = "//input[@id='city']")
    private WebElement lastTravelled12MonthsCity;
    @FindBy(xpath = "//input[@name='55[0].dateOfDeparture']")
    private WebElement lastTravelledDepartDate;
    @FindBy(xpath = "//input[@name='55[0].dateOfArrival']")
    private WebElement lastTravelledArrivalDate;
    @FindBy(xpath = "//div[@id='visa']")
    private WebElement visaType;
    @FindBy(xpath = "//div[@name='2038[0].country']//input")
    private WebElement travelCountryNext12Months;
    @FindBy(xpath = "//input[@name='2038[0].city']")
    private WebElement travelCityNext12Months;
    @FindBy(xpath = "//input[@name='2038[0].dateOfDeparture']")
    private WebElement nextTravelledDepartDate;
    @FindBy(xpath = "//input[@name='2038[0].dateOfArrival']")
    private WebElement nextTravelledArrivalDate;
    @FindBy(xpath = "//input[@name='2038[0].visaType']/preceding-sibling::div")
    private WebElement next12MonthVisaType;
    @FindBy(xpath = "//input[@name='nriBankMICRCode']")
    private WebElement nriMicroCod;
    @FindBy(xpath = "//input[@name='nriExchangeRBIPermitNumber']")
    private WebElement rbiPermitNO;
    @FindBy(xpath = "//input[@name='nriExchangeRBIPermitDetails']")
    private WebElement rbiPermitDetails;
    @FindBy(xpath = "//input[@name='nriExchangeRBIOfficeDetails']")
    private WebElement rbiOffice;
    @FindBy(xpath = "//input[@name='nriPaymentTypeOthersDetails']")
    private WebElement providePaymentDetails;
    @FindBy(xpath = "//button[@name='Continue']")
    private WebElement submit;
    @FindBy(xpath = "//span[text()='Next']")
    private WebElement next;
    @FindBy(xpath = "//button[@name='Add Insured details']")
    private WebElement addInsured;
    @FindBy(xpath = "//input[@name='nriStayInIndiaYears']")
    private WebElement stayInYrs;
    @FindBy(xpath = "//input[@name='nriStayInIndiaMonths']")
    private WebElement stayInMonths;
    @FindBy(xpath = "//div[@id='mui-component-select-natureOfVisaHeld']")
    private WebElement natureOfVisa;
    @FindBy(xpath = "//input[@name='nriStayNatureSpecificReason']")
    private WebElement specificReasonFNIO;

    @FindBy(xpath = "//span[text()='SAVE']/parent::button")
    private WebElement save;
   
    @FindBy(xpath = "//input[@name='nriIndianAddress1Qst']")
    private WebElement validAddressOne;

    @FindBy(xpath = "//input[@name='nriIndianCityQst']")
    private WebElement NRIcity;
   
    @FindBy(xpath = "//input[@id='nriIndianStateQst']")
    private WebElement state1;
   
    @FindBy(xpath = "//input[@name='nriIndianPinCodeQst']")
    private WebElement pincode;
   
    @FindBy(xpath = "(//div[text()='Yes'])[2]")
    private WebElement yesbtn;
   
    
    @FindBy(xpath = "(//div[text()='Yes'])[2]")
    private WebElement stayIndia;

    public void clickOnAreYouIndianOrigin(String isIndianOrigin){
        WebElement indianOrigin=getDriver().findElement(By.xpath("//button[@name='nriIndianOriginQst']//span/div[text()='"+isIndianOrigin+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),indianOrigin,30,"TimeOut to find element on page");
        if (indianOrigin.isDisplayed()) {
            indianOrigin.click();
            Allure.step("Selected isIndianOrigin As  >"   + indianOrigin);
        } else {
            System.out.println("isIndianOrigin Button is not displayed");
        }
    }

    public void enterCountryOfPermanentResidence(String pResidence) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),permanentResidenceNri,30,"TimeOut to find element on page");
        if (permanentResidenceNri.isDisplayed()) {
            permanentResidenceNri.sendKeys(pResidence);
            wait.WaitTime(2);
            permanentResidenceNri.sendKeys(Keys.ARROW_DOWN);
            permanentResidenceNri.sendKeys(Keys.ARROW_DOWN);
            permanentResidenceNri.sendKeys(Keys.ENTER);
            Allure.step("Select Country of PermanentResidence As  >"   + permanentResidenceNri);
        } else {
            System.out.println("Country of permanent residence is not displayed");
        }
    }

    public void enterDateFromWhichBecamePR(String datePR){
        WaitUtils.waitforElementToBeClickable(getDriver(),pResidenceDate,30);
        if (pResidenceDate.isDisplayed()) {
            pResidenceDate.click();
            pResidenceDate.sendKeys(datePR);
            Allure.step("Entered Date from which became PR AS  >"   + datePR);
        } else {
            System.out.println("Date from which becamePR is not Visible");
        }
    }

    public void enterDateLastVisitedIndia(String lastVisitedIndiaDate){
        WaitUtils.waitforElementToBeClickable(getDriver(),dateLastVisitedIndia,30);
        if (dateLastVisitedIndia.isDisplayed()) {
            dateLastVisitedIndia.click();
            dateLastVisitedIndia.sendKeys(lastVisitedIndiaDate);
            Allure.step("Entered date of last visited India AS  >"   + lastVisitedIndiaDate);
        } else {
            System.out.println("Date of Last visited India is not Displayed");
        }
    }

    public void enterPassportNumber(String passportNumber){
        WaitUtils.waitforElementToBeClickable(getDriver(),passportNum,30);
        if (passportNum.isDisplayed()) {
            passportNum.click();
            passportNum.sendKeys(passportNumber);
            Allure.step("Entered Passport Number AS  >"   + passportNumber);
        } else {
            System.out.println("Passport number is not Displayed");
        }
    }

    public void clickOnPlaceForSigningApplication(String placeOfSigningApplication){
        WebElement place=getDriver().findElement(By.xpath("//button[@name='nriAppSignQst']/span/div[text()='"+placeOfSigningApplication+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),place,30,"TimeOut to find element on page");
        if (place.isDisplayed()) {
            place.click();
            Allure.step("Selected Place Of Signing Application As >"  +placeOfSigningApplication);
        } else {
            System.out.println("Place of Signing Application is not Displayed");
        }
    }

    public void clickOnPurposeOfStayAbroad(String purposeOfStayAbroad){
        WebElement abroad=getDriver().findElement(By.xpath("//button[@name='nriPurposeOfStayQst']/span/div[text()='"+purposeOfStayAbroad+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),abroad,30,"TimeOut to find element on page");
        if (abroad.isDisplayed()) {
            abroad.click();
            Allure.step("Selected Purpose Of stay Abroad As >"  +purposeOfStayAbroad);
        } else {
            System.out.println("Purpose of Stay Abroad is not Displayed");
        }
    }

    public void enterStudentNatureOfStay(String studentNatureOfStayAbroad){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),stuAbroad,30,"TimeOut to find element on page");
        if (stuAbroad.isDisplayed()) {
            stuAbroad.click();
            stuAbroad.sendKeys(studentNatureOfStayAbroad);
            Allure.step("Enter Nature of stayAbroad for Student As>"  +studentNatureOfStayAbroad);
        } else {
            System.out.println("Nature of stayAbroad for Student is not Displayed");
        }
    }

    public void enterSpecificNatureOfStayAbroad(String stayAbroadSpecificReason){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),reasonStayAbroad,30,"TimeOut to find element on page");
        if (reasonStayAbroad.isDisplayed()) {
            reasonStayAbroad.click();
            reasonStayAbroad.sendKeys(stayAbroadSpecificReason);
            Allure.step("Enter Specific Reason Of stayAbroad>"  +stayAbroadSpecificReason);
        } else {
            System.out.println("Specific Reason Of stayAbroad is not Displayed");
        }
    }

    public void enterIntendedDurationOfStayAbroad(String intendedDurationYear, String intendedDurationMonth) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),intendedDurationYr,30,"TimeOut to find element on page");
        if (intendedDurationYr.isDisplayed()) {
            intendedDurationYr.click();
            intendedDurationYr.sendKeys(intendedDurationYear);
            wait.WaitTime(5);
            intendedDurationMon.click();
            intendedDurationMon.sendKeys(intendedDurationMonth);
            Allure.step("Enter Intended duration Of StayAbroad As>"  +intendedDurationYear +intendedDurationMonth);
        } else {
            System.out.println("Intended duration Of StayAbroad is not Displayed");
        }
    }

    //Residence Address While in Abroad

    public void addTypeNri(String nriAddressType){
        WebElement type=getDriver().findElement(By.xpath("//button[@name='nriAbroadAddressTypeQst']/span/div[text()='"+nriAddressType+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),type,30,"TimeOut to find element on page");
        if (type.isDisplayed()) {
            type.click();
            Allure.step("Selected Residence Add While in Abroad As >"  +nriAddressType);
        } else {
            System.out.println("Residence Add While in Abroad is not Displayed");
        }
    }

    public void enterNriAddress1(String address1Nri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriAddress1,30,"TimeOut to find element on page");
        if (nriAddress1.isDisplayed()) {
            nriAddress1.click();
            nriAddress1.sendKeys(address1Nri);
            Allure.step("Enter Nri Address1 As>"  +address1Nri);
        } else {
            System.out.println("Nri Address1 is not Displayed");
        }
    }

    public void enterNriAddress2(String address2Nri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriAddress2,30,"TimeOut to find element on page");
        if (nriAddress2.isDisplayed()) {
            nriAddress2.click();
            nriAddress2.sendKeys(address2Nri);
            Allure.step("Enter Nri Address2 As>"  +address2Nri);
        } else {
            System.out.println("Nri Address2 is not Displayed");
        }
    }

    public void enterNriAddress3(String address3Nri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriAddress3,30,"TimeOut to find element on page");
        if (nriAddress3.isDisplayed()) {
            nriAddress3.click();
            nriAddress3.sendKeys(address3Nri);
            Allure.step("Enter Nri Address3 As>"  +address3Nri);
        } else {
            System.out.println("Nri Address3 is not Displayed");
        }
    }

    public void enterNriArea(String areaNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriArea,30,"TimeOut to find element on page");
        if (nriArea.isDisplayed()) {
            nriArea.click();
            nriArea.sendKeys(areaNri);
            Allure.step("Enter Nri Area As>"  +areaNri);
        } else {
            System.out.println("Nri Area is not Displayed");
        }
    }

    public void enterNriCity(String cityNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriCity,30,"TimeOut to find element on page");
        if (nriCity.isDisplayed()) {
            nriCity.click();
            nriCity.sendKeys(cityNri);
            Allure.step("Enter Nri City As>"  +cityNri);
        } else {
            System.out.println("Nri City is not Displayed");
        }
    }

    public void enterNriState(String stateNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriState,30,"TimeOut to find element on page");
        if (nriState.isDisplayed()) {
            nriState.click();
            nriState.sendKeys(stateNri);
            Allure.step("Enter Nri State As>"  +stateNri);
        } else {
            System.out.println("Nri State is not Displayed");
        }
    }

    public void enterNriPinCode(String pinCodeNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriPinCode,30,"TimeOut to find element on page");
        if (nriPinCode.isDisplayed()) {
            nriPinCode.click();
            nriPinCode.sendKeys(pinCodeNri);
            Allure.step("Enter Nri PinCode As>"  +pinCodeNri);
        } else {
            System.out.println("Nri PinCode is not Displayed");
        }
    }
    public void enterNrimobilenumber(String mobilenumberNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nrimobnum,30,"TimeOut to find element on page");
        if (nrimobnum.isDisplayed()) {
            nrimobnum.click();
            nrimobnum.sendKeys(mobilenumberNri);
            Allure.step("Enter Nri Mobile Number As>"  +mobilenumberNri);
        } else {
            System.out.println("Nri Mobile number is not Displayed");
        }
    }

    public void enterNriTeleNumberResidence(String teleNumberResidenceNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriTeleNumberResidence,30,"TimeOut to find element on page");
        if (nriTeleNumberResidence.isDisplayed()) {
            nriTeleNumberResidence.click();
            nriTeleNumberResidence.sendKeys(teleNumberResidenceNri);
            Allure.step("Enter Nri teleNumberResidence As>"  +teleNumberResidenceNri);
        } else {
            System.out.println("Nri teleNumberResidence is not Displayed");
        }
    }

    public void enterNriTeleNumberOffice(String teleNumberOfficeNri) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriTeleNumberOffice,30,"TimeOut to find element on page");
        if (nriTeleNumberOffice.isDisplayed()) {
            nriTeleNumberOffice.click();
            nriTeleNumberOffice.sendKeys(teleNumberOfficeNri);
            Allure.step("Enter Nri TeleNumberOffice As>"  +teleNumberOfficeNri);
        } else {
            System.out.println("Nri TeleNumberOffice is not Displayed");
        }
    }

    //TravelDetails last 12Month

    public void clickOnTravelledLast12MonthButton(String travelledOverLast12Months){
        WebElement travelled=getDriver().findElement(By.xpath("//button[@name='nriTravelDetailsPastYears']//span/div[text()='"+travelledOverLast12Months+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),travelled,30,"TimeOut to find element on page");
        if (travelled.isDisplayed()) {
            travelled.click();
            Allure.step("Selected travelledOverLast12Months As >"  +travelledOverLast12Months);
        } else {
            System.out.println("travelledOverLast12Months is not Displayed");
        }
    }

    public void enterCountryTravelledOverLast12Months(String countryTravelledLast12Months) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),lastTravelled12Months,30,"TimeOut to find element on page");
        if (lastTravelled12Months.isDisplayed()) {
            lastTravelled12Months.sendKeys(countryTravelledLast12Months);
            wait.WaitTime(2);
            lastTravelled12Months.sendKeys(Keys.ARROW_DOWN);
            lastTravelled12Months.sendKeys(Keys.ARROW_DOWN);
            lastTravelled12Months.sendKeys(Keys.ENTER);
            Allure.step("Enter CountryTravelled Over last 12Months As  >"   + countryTravelledLast12Months);
        } else {
            System.out.println("CountryTravelled Over last 12Months is not displayed");
        }
    }

    public void enterLast12MonthCity(String last12MonthCity) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),lastTravelled12MonthsCity,30,"TimeOut to find element on page");
        if (lastTravelled12MonthsCity.isDisplayed()) {
            lastTravelled12MonthsCity.click();
            lastTravelled12MonthsCity.sendKeys(last12MonthCity);
            Allure.step("Enter last12MonthsTravelled City As>"  +last12MonthCity);
        } else {
            System.out.println("Nri last12MonthsTravelled City is not Displayed");
        }
    }
    public void enterLast12MonthsDepartDate(String lastTravelled12MonthsDepartDate) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),lastTravelledDepartDate,30,"TimeOut to find element on page");
        if (lastTravelledDepartDate.isDisplayed()) {
            lastTravelledDepartDate.click();
            lastTravelledDepartDate.sendKeys(lastTravelled12MonthsDepartDate);
            Allure.step("Enter last12MonthsTravelled Departure Date As>"  +lastTravelled12MonthsDepartDate);
        } else {
            System.out.println("Nri last12MonthsTravelled Departure is not Displayed");
        }
    }

    public void enterLast12MonthsArrivalDate(String lastTravelled12MonthsArrivalDate) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),lastTravelledArrivalDate,30,"TimeOut to find element on page");
        if (lastTravelledArrivalDate.isDisplayed()) {
            lastTravelledArrivalDate.click();
            lastTravelledArrivalDate.sendKeys(lastTravelled12MonthsArrivalDate);
            Allure.step("Enter last12MonthsTravelled Arrival Date As>"  +lastTravelled12MonthsArrivalDate);
        } else {
            System.out.println("Nri last12MonthsTravelled Arrival Date is not Displayed");
        }
    }

    public void selectVisaType(String lastTravelled12MonthsVisaType) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),visaType,30,"TimeOut to find element on page");
        if (visaType.isDisplayed()) {
            visaType.click();
            wait.WaitTime(2);
            WebElement visa=getDriver().findElement(By.xpath("//ul/li[@data-value='"+lastTravelled12MonthsVisaType+"']"));
            WaitUtils.waitforElementToBeClickable(getDriver(),visa,30);
            visa.click();
            Allure.step("Enter last12MonthsTravelled VisaType As>"  +lastTravelled12MonthsVisaType);
        } else {
            System.out.println("Nri last12MonthsTravelled VisaType is not Displayed");
        }
    }

    //Travel Details next12Months

    public void clickOnTravelledNext12MonthButton(String travelledOverNext12Months){
        WebElement travelled=getDriver().findElement(By.xpath("//button[@name='nriTravelDetails']/span/div[text()='"+travelledOverNext12Months+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),travelled,30,"TimeOut to find element on page");
        if (travelled.isDisplayed()) {
            travelled.click();
            Allure.step("Selected travelledOverNext12Months As >"  +travelledOverNext12Months);
        } else {
            System.out.println("travelledOverNext12Months is not Displayed");
        }
    }
    public void enterCountryTravelledOverNext12Months(String countryTravelledNext12Months) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),travelCountryNext12Months,30,"TimeOut to find element on page");
        if (travelCountryNext12Months.isDisplayed()) {
            travelCountryNext12Months.sendKeys(countryTravelledNext12Months);
            wait.WaitTime(2);
            travelCountryNext12Months.sendKeys(Keys.ARROW_DOWN);
            travelCountryNext12Months.sendKeys(Keys.ARROW_DOWN);
            travelCountryNext12Months.sendKeys(Keys.ENTER);
            Allure.step("Enter CountryTravelled Over Next 12Months As  >"   + countryTravelledNext12Months);
        } else {
            System.out.println("CountryTravelled Over Next 12Months is not displayed");
        }
    }

    public void enterNext12MonthCity(String Next12MonthCity) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),travelCityNext12Months,30,"TimeOut to find element on page");
        if (travelCityNext12Months.isDisplayed()) {
            travelCityNext12Months.click();
            travelCityNext12Months.sendKeys(Next12MonthCity);
            Allure.step("Enter Next12MonthsTravelled City As>"  +Next12MonthCity);
        } else {
            System.out.println("Nri Next12MonthsTravelled City is not Displayed");
        }
    }

    public void enterNext12MonthsDepartDate(String nextTravelled12MonthsDepartDate) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nextTravelledDepartDate,30,"TimeOut to find element on page");
        if (nextTravelledDepartDate.isDisplayed()) {
            nextTravelledDepartDate.click();
            nextTravelledDepartDate.sendKeys(nextTravelled12MonthsDepartDate);
            Allure.step("Enter next12MonthsTravelled Departure Date As>"  +nextTravelled12MonthsDepartDate);
        } else {
            System.out.println("Nri next12MonthsTravelled Departure is not Displayed");
        }
    }

    public void enterNext12MonthsArrivalDate(String nextTravelled12MonthsArrivalDate) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nextTravelledArrivalDate,30,"TimeOut to find element on page");
        if (nextTravelledArrivalDate.isDisplayed()) {
            nextTravelledArrivalDate.click();
            nextTravelledArrivalDate.sendKeys(nextTravelled12MonthsArrivalDate);
            Allure.step("Enter next12MonthsTravelled Arrival Date As>"  +nextTravelled12MonthsArrivalDate);
        } else {
            System.out.println("Nri next12MonthsTravelled Arrival Date is not Displayed");
        }
    }

    public void selectNext12MonthsVisaType(String nextTravelled12MonthsVisaType) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),next12MonthVisaType,30,"TimeOut to find element on page");
        if (next12MonthVisaType.isDisplayed()) {
            next12MonthVisaType.click();
            wait.WaitTime(2);
            WebElement visa=getDriver().findElement(By.xpath("//ul/li[@data-value='"+nextTravelled12MonthsVisaType+"']"));
            WaitUtils.waitforElementToBeClickable(getDriver(),visa,30);
            visa.click();
            Allure.step("Enter next12MonthsTravelled VisaType As>"  +nextTravelled12MonthsVisaType);
        } else {
            System.out.println("Nri next12MonthsTravelled VisaType is not Displayed");
        }
    }

    //Bank Details

    public void enterNRIMicrCode(String nriMicrCode) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriMicroCod,30,"TimeOut to find element on page");
        if (nriMicroCod.isDisplayed()) {
            nriMicroCod.click();
            nriMicroCod.sendKeys(nriMicrCode);
            Allure.step("Enter nriMicr Code As>"  +nriMicrCode);
        } else {
            System.out.println("nriMicr is not Displayed");
        }
    }

    public void doYouHaveNriAccount(String haveNriAccount){
        WebElement nriAccount=getDriver().findElement(By.xpath("//button[@name='nriBankDetailsQst']/span/div[text()='"+haveNriAccount+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriAccount,30,"TimeOut to find element on page");
        if (nriAccount.isDisplayed()) {
            nriAccount.click();
            Allure.step("Selected nriAccount As >"  +haveNriAccount);
        } else {
            System.out.println("nriAccount is not Displayed");
        }
    }

    public void typeOfNriAccount(String nriAccountType){
        WebElement AccountType=getDriver().findElement(By.xpath("//button[@name='nriBankDetailsTypeOfAccount']//span/div[text()='"+nriAccountType+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),AccountType,30,"TimeOut to find element on page");
        if (AccountType.isDisplayed()) {
            AccountType.click();
            Allure.step("Selected nriAccountType As >"  +AccountType);
        } else {
            System.out.println("nriAccountType is not Displayed");
        }
    }



    //Exchange Facility

    public void clickOnExchangeFacilityButton(String exchangeFacility){
        WebElement exchange=getDriver().findElement(By.xpath("//button[@name='nriExchangeDetailsQst']/span/div[text()='"+exchangeFacility+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),exchange,30,"TimeOut to find element on page");
        if (exchange.isDisplayed()) {
            exchange.click();
            Allure.step("Selected exchangeFacility As >"  +exchangeFacility);
        } else {
            System.out.println("exchangeFacility is not Displayed");
        }
    }

    public void enterRBIPermitNumber(String rbiPermitNumber){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),rbiPermitNO,30,"TimeOut to find element on page");
        if (rbiPermitNO.isDisplayed()) {
            rbiPermitNO.click();
            rbiPermitNO.sendKeys(rbiPermitNumber);
            Allure.step("Entered RBI PermitNo. As >"  +rbiPermitNumber);
        } else {
            System.out.println("RBI PermitNo. is not Displayed");
        }
    }
    public void enterRBIPermitDetails(String rbiPermitDetail){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),rbiPermitDetails,30,"TimeOut to find element on page");
        if (rbiPermitDetails.isDisplayed()) {
            rbiPermitDetails.click();
            rbiPermitDetails.sendKeys(rbiPermitDetail);
            Allure.step("Entered RBI PermitDetails As >"  +rbiPermitDetail);
        } else {
            System.out.println("RBI PermitDetails is not Displayed");
        }
    }

    public void enterRBIOfficeName(String rbiOfficeName){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),rbiOffice,30,"TimeOut to find element on page");
        if (rbiOffice.isDisplayed()) {
            rbiOffice.click();
            rbiOffice.sendKeys(rbiOfficeName);
            Allure.step("Entered RBI OfficeName As >"  +rbiOfficeName);
        } else {
            System.out.println("RBI OfficeName is not Displayed");
        }
    }

    //paymentDetails
    public void clickOnPaymentDetails(String nriPaymentDetails){
        WebElement nriPayment=getDriver().findElement(By.xpath("//button[@name='nriPaymentTypeDetails']/span/div[text()='"+nriPaymentDetails+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriPayment,30,"TimeOut to find element on page");
        if (nriPayment.isDisplayed()) {
            nriPayment.click();
            Allure.step("Selected paymentDetails As >"  +nriPaymentDetails);
        } else {
            System.out.println("paymentDetails is not Displayed");
        }
    }

    public void enterProvideDetails(String providePaymentDetail){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),providePaymentDetails,30,"TimeOut to find element on page");
        if (providePaymentDetails.isDisplayed()) {
            providePaymentDetails.click();
            providePaymentDetails.sendKeys(providePaymentDetail);
            Allure.step("Entered ProvidePayment Details As >"  +providePaymentDetail);
        } else {
            System.out.println("ProvidePayment Details is not Displayed");
        }
    }

    public void clickOnContinue(){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),submit,30,"TimeOut to find element on page");
        if (submit.isDisplayed()) {
            submit.click();
            Allure.step("Clicked On Continue Button As >"  );
        } else {
            System.out.println("Continue button is not Displayed");
        }
    }
    public void clickOnNext(){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),next,30,"TimeOut to find element on page");
        if (next.isDisplayed()) {
            next.click();
            Allure.step("Clicked On Continue Button As >"  );
        } else {
            System.out.println("Continue button is not Displayed");
        }
    }

    public void clickOnAddInsuredDetails(){
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),addInsured,30,"TimeOut to find element on page");
        if (addInsured.isDisplayed()) {
            addInsured.click();
            Allure.step("Clicked On addInsured Button As >"  );
        } else {
            System.out.println("addInsured button is not Displayed");
        }
    }

    // FNIO/PIO

 
    public void clickOnFNIOPIOYESButtonInsured(){
        
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),stayIndia,30,"TimeOut to find element on page");
        if (stayIndia.isDisplayed()) {
            stayIndia.click();
            Allure.step("Selected Do you Stay In India FNIO/PIO As >");
        } else {
            System.out.println("Do you Stay In India FNIO/PIO is not Displayed");
        }
    }

    public void durationOfStayIndiaFNIO(String durationInYrs, String durationInMonths) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),stayInYrs,30,"TimeOut to find element on page");
        if (stayInYrs.isDisplayed()) {
            stayInYrs.click();
            stayInYrs.sendKeys(durationInYrs);
            wait.WaitTime(2);
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),stayInMonths,30,"TimeOut to find element on page");
            stayInMonths.click();
            stayInMonths.sendKeys(durationInMonths);
            Allure.step("Entered stay duration in India FNIO,PIO As >" +durationInYrs +durationInMonths );
        } else {
            System.out.println("addInsured button is not Displayed");
        }
    }

    public void selectNatureOfVisa(String natureOfVisaHeld) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),natureOfVisa,30,"TimeOut to find element on page");
        if (natureOfVisa.isDisplayed()) {
            natureOfVisa.click();
            wait.WaitTime(2);
            WebElement value=getDriver().findElement(By.xpath("//ul/li/div/span[text()='"+natureOfVisaHeld+"']"));
            WaitUtils.waitforElementToBeClickable(getDriver(),value,30);
            value.click();
            Allure.step("Entered stay duration in India FNIO,PIO As >" +natureOfVisaHeld );
        } else {
            System.out.println("addInsured button is not Displayed");
        }
    }

    public void selectPurposeOfStayIndiaFNIO(String purposeOfStayFNIO_PIO) throws InterruptedException {
        WebElement value=getDriver().findElement(By.xpath("//button[@name='nriPurposeOfStayIndiaQst']/span/div[text()='"+purposeOfStayFNIO_PIO+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),value,30,"TimeOut to find element on page");
        if (value.isDisplayed()) {
            value.click();
            Allure.step("Selected PurposeOfStayIndiaFNIO_PIO >" +purposeOfStayFNIO_PIO );
        } else {
            System.out.println("PurposeOfStayIndiaFNIO_PIO is not Displayed");
        }
    }

    public void enterNatureOfStayIndiaFNIO(String natureOfStayFNIO_PIO) throws InterruptedException {
        WebElement natureStay=getDriver().findElement(By.xpath("//input[@name='nriStayNatureDetails']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),natureStay,30,"TimeOut to find element on page");
        if (natureStay.isDisplayed()) {
            natureStay.click();
            natureStay.sendKeys(natureOfStayFNIO_PIO);
            Allure.step("Enter NatureOfStayIndiaFNIO_PIO >" +natureOfStayFNIO_PIO );
        } else {
            System.out.println("NatureOfStayIndiaFNIO_PIO is not Displayed");
        }
    }

    public void enterSpecificReasonFNIO_PIO(String specificReasonFNIO_PIO) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),specificReasonFNIO,30,"TimeOut to find element on page");
        if (specificReasonFNIO.isDisplayed()) {
            specificReasonFNIO.click();
            specificReasonFNIO.sendKeys(specificReasonFNIO_PIO);
            Allure.step("Enter specificReasonFNIO_PIO As >" +specificReasonFNIO_PIO );
        } else {
            System.out.println("specificReasonFNIO_PIO is not Displayed");
        }
    }

    public void selectPIO_OCICard(String selectPIO_OCICard) throws InterruptedException {
        WebElement pio_ociCard=getDriver().findElement(By.xpath("//button[@name='nriPioOciCardQst']/span/div[text()='"+selectPIO_OCICard+"']"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),pio_ociCard,30,"TimeOut to find element on page");
        if (pio_ociCard.isDisplayed()) {
            pio_ociCard.click();
            Allure.step("Select PIO_OCICard As >" +selectPIO_OCICard );
        } else {
            System.out.println("PIO_OCICard is not Displayed");
        }
    }

    public void clickSaveButton() throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),save,30,"TimeOut to find element on page");
        if (save.isDisplayed()) {
            save.click();
            Allure.step("Clicked On Save Button >" );
        } else {
            System.out.println("Save Button is not Displayed");
        }
        //================================
    }
        public void EnterResidantAddressOneWhileInIndiaWeb(String addressOne){
          
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),validAddressOne,10,"TimeOut to find element on page");
            if(validAddressOne.isDisplayed()){
            	validAddressOne.sendKeys(addressOne);
            	 Allure.step("Enter Residence Address1 while in India  Value As =====>"+addressOne);
               }
            else {
            	 Allure.step("Residence Address1 while in India is not displayed");
            }
        }
        
        public void EnterResidantAddressCityWhileInIndiaWeb(String nriTravelCity){
         
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),NRIcity,5,"TimeOut to find element on page");
            if(NRIcity.isDisplayed()){
         	   NRIcity.sendKeys(nriTravelCity);
         	  Allure.step("Enter Residence Address  while in India  Value As =====>"+nriTravelCity);
               }
            else {
            	 Allure.step ("Residence Address city while in India is not displayed");
            }
        }
        
        public void EnterResidantAddressStateWhileInIndiaWeb(String State){
           
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),state1,5,"TimeOut to find element on page");
            if(state1.isDisplayed()){
         	   //state1.sendKeys(State);
         	   if(state1.isDisplayed()) {
         		   state1.sendKeys(State);
             	   state1.sendKeys(Keys.ARROW_DOWN);
             	   state1.sendKeys(Keys.ARROW_DOWN);
             	   state1.sendKeys(Keys.ENTER);
             	  Allure.step ("Enter Residence Address state while in India  Value As =====>"+State);
               }
            else {
            	 Allure.step ("Residence Address state while in India is not displayed");
            }
        }}
        
        public void EnterResidantAddressPinCodeWhileInIndiaWeb(String PinCodeTwo){
          
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),pincode,5,"TimeOut to find element on page");
            if(pincode.isDisplayed()){
         	   pincode.sendKeys(PinCodeTwo);
         	  Allure.step("Enter Residence Address Pincode while in India  Value As =====>"+PinCodeTwo);
               }
            else {
            	 Allure.step("Residence Address Pincode while in India is not displayed");
            }
        }
        
    


        public void ClickDoYouStayInIndiaYesBtnWeb(){
          
        	   WaitUtils.waitForElementToBeVisibleweb(getDriver(),yesbtn,5,"TimeOut to find element on page");
            if(yesbtn.isDisplayed()){
            	yesbtn.click();
            	 Allure.step ("Click On Do You Stay In India Yes Button");
            }else {
            	 Allure.step("Yes Button Is Not Display");
            }
        }













}
