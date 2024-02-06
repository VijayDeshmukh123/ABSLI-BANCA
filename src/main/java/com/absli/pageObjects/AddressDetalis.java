package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetalis extends TestBase {


    public WebDriver driver;
    public WaitUtils wait;

    public AddressDetalis(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    // Address Details page // 8/6/2023=mayur

    @FindBy(xpath = "//div[@id='addTypeID']")
    private WebElement commaddtyp;
    @FindBy(xpath = "//input[@id='add3Id']")
    private WebElement coma;
    @FindBy(xpath = "//input[@id='landmark']")
    private WebElement comlnd;
    @FindBy(xpath = "//button[@name='CONFIRM']")
    private WebElement addconf;
    @FindBy(xpath = "//input[@id='isSameAsComAdd']")
    private WebElement permanentaddchkbox;

    @FindBy(xpath = "//div[@id='perAddTypeID']")
    private  WebElement permanentaddtype;

    @FindBy(xpath = "//input[@id='perAddPinId']")
    private  WebElement permanentpincode;

    @FindBy(xpath = "//input[@id='perAdd1Id']")
    private WebElement permanentadd1;

    @FindBy(xpath = "//input[@id='perAdd2Id']")
    private WebElement permanentadd2;

    @FindBy(xpath = "//input[@id='perAdd3Id']")
    private WebElement permanentadd3;

    @FindBy(xpath = "//input[@id='perLandmark']")
    private WebElement permanentlandmark;

    @FindBy(xpath = "//input[@id='perCity']")
    private WebElement permanentcity;

//======================
    @FindBy(xpath = "//input[contains(@name,'isSameAsComAdd')]")
    private WebElement permanentAddCheckBox;
    
    @FindBy(xpath = "(//input[@name='perAddPinId'])[1]")
    private WebElement pinCodeInputWeb;
    
    @FindBy(xpath = "(//input[@id='perAdd1Id'])[1]")
    private WebElement validAddressOne;
    
    @FindBy(xpath = "(//*[@id='perAddTypeID'])")
    private WebElement perAddDroupDown;
    

    @FindBy(xpath = "(//*[@id='perCity'])")
    private WebElement CityName;
    
    //DBS_NetBanking=========================
    
    @FindBy(xpath = "(//*[@id='addTypeID'])[1]")
    private WebElement AddressDropdown;
    
    @FindBy(xpath = "(//input[@name='pinCodeId'])[1]")
    private WebElement pinCodeInput;
    @FindBy(xpath = "//input[@id='add1Id']")
    private WebElement pinCodeInput1;
   
    
  
    @FindBy(xpath = "(//input[contains(@id,'perState')])")
    private WebElement PreState;
    @FindBy(xpath = "//input[@id='add1Id']")
    private WebElement PreCountry;
   
    @FindBy(xpath = "//span[text()='SUBMIT']")
    private WebElement next;
    
    @FindBy(xpath = "//input[contains(@id,'city')]")
    private WebElement city;
   
    @FindBy(xpath = "//input[contains(@id,'state')]")
    private WebElement state;
    
    @FindBy(xpath = "(//button[contains(@name,'Okay')])[1]")
    private WebElement AlertPopUpEle;
    
    
    @FindBy(xpath = "(//input[@name='pinCodeId'])[1]")
    private WebElement ClearPinCode;
    
	public void clickAddressDropdownWeb() {
		wait.waitForElementToBeVisibleweb(getDriver(), AddressDropdown, 5, "time out to find element on page");
		if (AddressDropdown.isDisplayed()) {

			wait.waitForElementToBeVisibleweb(getDriver(), AddressDropdown, 5, "time out to find element on page");
			AddressDropdown.click();
			 Allure.step ("click on Address Dropdown");
		} else {
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Address Dropdown is not displayed");
		}

	}
    
	 public void selectAddressWeb(String args) {
	    	WebElement  dropdownvalue = getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+args+"')]"));
	    	wait.waitForElementToBeVisibleweb(getDriver(), commaddtyp, 5,"time out to find element on page");
	    	String value= dropdownvalue.getText();
	    	 if(value.equalsIgnoreCase(args)) {
	    		 dropdownvalue.click();
	    		 Allure.step ("Select Type Of Address Value As =====>"+args);
	    	 }else {
	    		 ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Type Of Address value is Not Display");
	    	 }
	    	
	    	
	    
	      
	    }
	  public void enterPinWeb(String pinCode){
	       
	        if(pinCodeInput.isDisplayed()){
	        	
	        	for (int i = 0; i < 10; i++) {
	        		pinCodeInput.sendKeys(Keys.BACK_SPACE);
	        		pinCodeInput.sendKeys(" ");
	        		pinCodeInput.sendKeys(Keys.DELETE);
	        		pinCodeInput.sendKeys(Keys.CLEAR);

		            } 
	        	pinCodeInput.sendKeys(pinCode);
	        	 Allure.step ("Enter Pincode  Value As =====>"+pinCode);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "pincide is not displayed");
	        }
	    }
	    
	  public void validationAddressOneWeb(String addressOne){
	       
	        if(pinCodeInput1.isDisplayed()){
	        	pinCodeInput1.sendKeys(addressOne);
	        	 Allure.step("Enter Addeass1  Value As =====>"+addressOne);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Address1 is not displayed");
	        }
	    }
	   
	  public void EnterCityAddress(String Val){
	        
	        if(validAddressOne.isDisplayed()){
	        	validAddressOne.sendKeys(Val);
	        	 Allure.step ("Enter City  Value As =====>"+Val);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "City is not displayed");
	        }
	    }
	    
	    public void EnterStateAddress(String Val){
	      
	        if(PreState.isDisplayed()){
	        	PreState.sendKeys(Val);
	        	 Allure.step ("Enter State   Value As =====>"+Val);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "State is not displayed");
	        }
	    }
	    
	    public void EnterCountryAddress(String Val) throws InterruptedException{
	       
	        if(PreCountry.isDisplayed()){
	        	PreCountry.sendKeys(Val);
	        	Thread.sleep(2000);
	        	PreCountry.sendKeys(Keys.ARROW_DOWN);
	        	PreCountry.sendKeys(Keys.ARROW_DOWN);
	     	  // ele1.sendKeys(Keys.ENTER);
	        	 Allure.step("Enter Country  Value As =====>"+Val);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Country is not displayed");
	        }
	    }

	    public void ClickAddressEditSubmitWeb() {

			if(next.isDisplayed()) {
				next.click();
				
				ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Address SUBMIT BTN ");
			}
			else {
				ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Address SUBMIT BTN is Not Display");
			}
	    }
	    public void EnterCityAddressWeb(String Val){
	       
	        if(city.isDisplayed()){
	        	city.sendKeys(Val);
	            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Enter City  Value As =====>"+Val);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "City is not displayed");
	        }
	    }
	    
	    public void EnterStateAddressWeb(String Val){
	        
	        if(state.isDisplayed()){
	        	state.sendKeys(Val);
	            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Enter State   Value As =====>"+Val);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "State is not displayed");
	        }
	    }
	    
	    public void ClickOnEditAlerOkayPopUp() {
	      	
	          if(AlertPopUpEle.isDisplayed()) {
	        	  AlertPopUpEle.click();
	          ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Alert Pop Up Okay Button ");
	          }else {
	          ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Alert Pop Up Okay Button  is not Display");
	          }
	      }
	    
	    public void ClearEditPinWeb(String pinCode) throws InterruptedException{

	        if(ClearPinCode.isDisplayed()){
	        	ClearPinCode.click();
	        	 for (int i = 0; i < 8; i++) {
	        		 ClearPinCode.sendKeys(Keys.BACK_SPACE);
	        		 ClearPinCode.sendKeys(Keys.DELETE);
		            }
				ExtentFactory.getInstance().getExtent().log(Status.INFO, "Remove Proposer PinCode");
				ClearPinCode.sendKeys(pinCode);
	        	Thread.sleep(2000);
	            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Enter Pincode  Value As =====>"+pinCode);
	           }
	        else {
	        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "pincide is not displayed");
	        }
	    }
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    
    //===================================================================================================
    public void SelectcommaddtypeWeb(String CommAddressType) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), commaddtyp, 5,"time out to find element on page");
        if(commaddtyp.isDisplayed()) {
            commaddtyp.click();
        }
        wait.WaitTime(1);
        WebElement Selectaddresstype =getDriver().findElement(By.xpath("//ul/li//span[text()='"+CommAddressType+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(), Selectaddresstype, 50,"time out to find element on page");
        if(Selectaddresstype.isDisplayed()){
            Selectaddresstype.click();
            Allure.step("Select Communication Address type  >"  + CommAddressType);
        }else {
            System.out.println("Communication Type of Address DropDown is not visible");
        }
    }

    public void entercommadd3(String CommAddress3) {
        wait.waitForElementToBeVisibleweb(getDriver(), coma, 50,"time out to find element on page");
        if (coma.isDisplayed()) {
            coma.sendKeys(CommAddress3);
            Allure.step("Enter Communication Address 3  >"  + CommAddress3);
        } else {
            System.out.println("Communication Address Line 3 input box is not visible");

        }
    }
    public void entercommlandmark(String CommLandmark) {
        wait.waitForElementToBeVisibleweb(getDriver(), comlnd, 50,"time out to find element on page");
        if (comlnd.isDisplayed()) {
            comlnd.sendKeys(CommLandmark);
            Allure.step("Enter the Landmark In communication Address  >"  + CommLandmark);
        } else {
            System.out.println("Communication Address Landmark input box is not visible");
        }
    }

    public void clickConfirmcapital(){
        wait.waitForElementToBeVisibleweb(getDriver(), addconf, 30,"time out to find element on page");
        if (addconf.isDisplayed()) {
            addconf.click();
            Allure.step("Clicked On Confirm Button");
        } else {
            System.out.println("CONFIRM button is not visible");

        }
    }

    public void PermanentAddresschkbox() {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentaddchkbox, 10, "Element is Not Display");
        if (permanentaddchkbox.isEnabled()) {
            permanentaddchkbox.click();
            Allure.step("Clicked on permanent address checkbox");
        } else {
            System.out.println("permanent address checkbox not visible");
        }
    }

    public void SelectpermanentaddtypeWeb(String PermanentAddress) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentaddtype, 50,"time out to find element on page");
        if(permanentaddtype.isDisplayed()) {
            permanentaddtype.click();
        }
        wait.WaitTime(1);
        WebElement Selectaddresstype =getDriver().findElement(By.xpath("//ul/li[@data-value='"+PermanentAddress+"']"));
        wait.waitforElementToBeClickable(getDriver(), Selectaddresstype, 100);
        if(Selectaddresstype.isDisplayed()){
            Selectaddresstype.click();
            Allure.step("Select Communication Address type  >"  + PermanentAddress);
        }else {
            System.out.println("Permanent Type of Address DropDown is not visible");
        }
    }

    public void enterpermanentpincode(String PermanentPincode) {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentpincode, 50,"time out to find element on page");
        if (permanentpincode.isDisplayed()) {
            permanentpincode.sendKeys(PermanentPincode);
            Allure.step("Enter the Pincode in permanent Address  >"  + PermanentPincode);
        } else {
            System.out.println("Pincode in permanent Address is not visible");
        }
    }

    public void enterpermanentadd1(String PermanentAddress1) {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentadd1, 50,"time out to find element on page");
        if (permanentadd1.isDisplayed()) {
            permanentadd1.sendKeys(PermanentAddress1);
            Allure.step("Enter the PermanentAddress1 in permanent Address  >"  + PermanentAddress1);
        } else {
            System.out.println("PermanentAddress1 in permanent Address is not visible");
        }
    }

    public void enterpermanentadd2(String PermanentAddress2) {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentadd2, 50,"time out to find element on page");
        if (permanentadd2.isDisplayed()) {
            permanentadd2.sendKeys(PermanentAddress2);
            Allure.step("Enter the PermanentAddress2 in permanent Address  >"  + PermanentAddress2);
        } else {
            System.out.println("PermanentAddress2 in permanent Address is not visible");
        }
    }
    public void enterpermanentadd3(String PermanentAddress3) {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentadd3, 50,"time out to find element on page");
        if (permanentadd3.isDisplayed()) {
            permanentadd3.sendKeys(PermanentAddress3);
            Allure.step("Enter the PermanentAddress3 in permanent Address  >"  + PermanentAddress3);
        } else {
            System.out.println("PermanentAddress3 in permanent Address is not visible");
        }
    }
    public void enterpermanentlandmark(String PermanentLandmark) {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentlandmark, 50,"time out to find element on page");
        if (permanentlandmark.isDisplayed()) {
            permanentlandmark.sendKeys(PermanentLandmark);
            Allure.step("Enter the Landmark in permanent Address  >"  + PermanentLandmark);
        } else {
            System.out.println("Landmark in permanent Address is not visible");
        }
    }

    public void enterpermanentcity(String PermanentCity) {
        wait.waitForElementToBeVisibleweb(getDriver(), permanentcity, 50,"time out to find element on page");
        if (permanentcity.isDisplayed()) {
            permanentcity.sendKeys(PermanentCity);
            Allure.step("Enter the city in permanent Address  >"  + PermanentCity);
        } else {
            System.out.println("city in permanent Address is not visible");
        }
    }

//NET BANKING DONE BY VIJAY===
    public void ClickOnPermanentAddress() {
   	
       if(permanentAddCheckBox.isEnabled()) {
    	   permanentAddCheckBox.click();
    	   Allure.step ("UnSelect Permanent Address ChechBox ");
       }else {
    	   Allure.step("Permanent Address ChechBox  Is Not Enabled");
       }
   }

    public void EnterPinCodeWeb(String pinCode){
        
        if(pinCodeInputWeb.isDisplayed()){
        	pinCodeInputWeb.sendKeys(pinCode);
        	  Allure.step ("Enter Permanent Address Pincode  Value As =====>"+pinCode);
           }
        else {
        	  Allure.step ("Permanent Address pincide is not displayed");
        }
    }
    public void EnterPermanentAddressOneWeb(String addressOne){
       
        if(validAddressOne.isDisplayed()){
        	validAddressOne.sendKeys(addressOne);
        	  Allure.step ("Enter Permanent Addeass1  Value As =====>"+addressOne);
           }
        else {
        	  Allure.step("Permanent Address1 is not displayed");
        }
    }
    public void EnterPermanentCityAddressOneWeb(String addressOne){
        
        if(CityName.isDisplayed()){
        	CityName.sendKeys(addressOne);
        	  Allure.step ("Enter Permanent Addeass1  Value As =====>"+addressOne);
           }
        else {
        	  Allure.step("Permanent Address1 is not displayed");
        }
    }
    public void ClickOnAddressLocationDropDownButton() {
		
		if(perAddDroupDown.isDisplayed()) {
			perAddDroupDown.click();
			
			 Allure.step ("Click on prement address dropdown Button");
		}
		else {
			// Allure.step( val+" Button is Not Display");
		}
    }


    public void ClickOnAddressLocation2Button(String val) {
		WebElement next = getDriver().findElement(By.xpath("(//div[contains(text(),'"+val+"')])[2]"));
		if(next.isEnabled()) {
			next.click();
			
			 Allure.step ("Click on "+val+" Button");
		}
		else {
			next.click();
			Allure.step ("Click on "+val+" Button");
		}
    }

    public void ClickOnAddressLocationButton(String val) {
		WebElement next = getDriver().findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
		if(next.isDisplayed()) {
			next.click();
			
			ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on "+val+" Button");
		}
		else {
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, val+" Button is Not Display");
		}
    }



    public void ClickOnAddressLocationBTN(String val) {
		WebElement next = getDriver().findElement(By.xpath("(//span[contains(text(),'"+val+"')])[2]"));
		if(next.isDisplayed()) {
			next.click();
			
			ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on "+val+" Button");
		}
		else {
			ExtentFactory.getInstance().getExtent().log(Status.FAIL, val+" Button is Not Display");
		}
    }






}
