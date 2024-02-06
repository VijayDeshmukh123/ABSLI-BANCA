package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CustomerProfile extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public CustomerProfile(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }


    // Customer Details page // 6/6/2023=mayur

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement cpnext;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement propbox;
    @FindBy(xpath = "//span[text()='NEXT']")
    private WebElement cdnext;
    @FindBy(xpath = "//div[@id='salutation']")
    private WebElement prpttl;
    @FindBy(xpath = "//div[contains(@aria-haspopup,'listbox')]")
    private WebElement relinsured;
    @FindBy(xpath = "(//input[contains(@id,'firstname')])[1]")
    private WebElement insufirstname;
    @FindBy(xpath = "(//input[contains(@id,'lastname')])[1]")
    private WebElement insulastname;
    @FindBy(xpath = "(//div[@id='salutation'])[1]")
    private WebElement insutitle;
    @FindBy(xpath = "(//button[@name='PROCEED'])[1]")
    private WebElement proppop;
    @FindBy(xpath = "(//button[@name='PROCEED'])[1]")
    private WebElement insupop;
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement insudob;
    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-filled MuiInputBase-input MuiFilledInput-input']")
    private WebElement cpol;
    @FindBy(xpath = "//input[@name='panNumber']")
    private WebElement cpan;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement compbox;
    @FindBy(xpath = "//input[@id='companyName']")
    private WebElement cname;
    @FindBy(xpath = "//input[@name='dob']")
    private WebElement cdoi;
    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-filled MuiInputBase-input MuiFilledInput-input']")
    private WebElement typeOfNRI;
    @FindBy(xpath = "//input[@id='nriCountry']")
    private WebElement nriCountry;
    @FindBy(xpath = "//input[@name='middleName']")
    private WebElement propmiddlename;
    @FindBy(xpath = "//input[@id='advisorState']")
    private WebElement advstate;

//===================================Done By Vijay NetBanking==============
    
    @FindBy(xpath = "(//input[@name='isHDFCAssistedJourneyQst'])[1]")
    private WebElement yesBNT;
    @FindBy(xpath = "(//input[@name='isHDFCAssistedJourneyQst'])[2]")
    private WebElement noBNT;

    @FindBy(xpath = "(//input[@name='isProposerInsuredSameQst'])[1]")
    private WebElement PropoerInsuredsameYes;
    @FindBy(xpath = "(//input[@name='isProposerInsuredSameQst'])[2]")
    private WebElement PropoerInsuredsameNo;

    @FindBy(xpath = "(//input[@name='isProposerRelationshipWithBankMoreThan7MonthsQst'])[1]")
    private WebElement PropoerRelnWithBankYes;
    @FindBy(xpath = "(//input[@name='isProposerRelationshipWithBankMoreThan7MonthsQst'])[1]")
    private WebElement PropoerRelnWithBankNo;
    @FindBy(xpath = "//div[contains(@aria-haspopup,'listbox')]")
    private WebElement RelationEle1;
   
    @FindBy(xpath = "//input[@name='panNumber']")
    private WebElement PanNum;

    @FindBy(xpath = "(//input[@type='checkbox'])")
    private WebElement termAndCondition1;
    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement termAndCondition;
    
    @FindBy(xpath = "//input[contains(@inputmode,'numeric')]")
    private WebElement DOBEle;
    
    @FindBy(xpath = "(//div[@id='salutation'])[1]")
    private WebElement salution;
    
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement firstName;
    
    @FindBy(xpath = "//input[@id='middlename']")
    private WebElement MiddenName;
    
    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement LastName;
    
   
    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    private WebElement ChechboxEle;

    
    

    @FindBy(xpath = "//span[text()='YES']")
    private WebElement yesbtn;
    

    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
    private WebElement NRIDrpdown;
    

    @FindBy(xpath = "//input[contains(@id,'nriCountry')]")
    private WebElement ele1;
    
    
    @FindBy(xpath = "//input[@name='panNumber']")
    private WebElement panNumberWeb;
    
    @FindBy(xpath = "(//input[contains(@id,'middlename')])[1]")
    private WebElement MIDDENNAME;
    
    @FindBy(xpath = "(//input[contains(@id,'hdfcBankEmpCode')])[1]")
    private WebElement EMPCODE;
    
    
    @FindBy(xpath = "(//input[contains(@name,'gstWaiver')])[1]")
    private WebElement NRIGSTwavierYES;
    
    @FindBy(xpath = "(//input[contains(@name,'gstWaiver')])[2]")
    private WebElement NRIGSTwavierNO;
    
    
    
    
    
    //===============DBS NET BANKING========================
    
    
    
    @FindBy(xpath = "(//input[contains(@id,'DBSSpCode')])[1]")
    private WebElement spCODE;
    @FindBy(xpath = "//div[contains(text(),'Review and Confirm Details')]")
    private WebElement Ele;
    @FindBy(xpath = "//button[@name='EDIT']")
    private WebElement EditBtn;
    @FindBy(xpath = "(//button[contains(@name,'OK')])[1]")
    private WebElement AlertPopUpEle;
    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement ClearEditEle;
    @FindBy(xpath = "//span[contains(text(),'CONFIRM')]")
    private WebElement ConfirmBtn;
    @FindBy(xpath = "//span[contains(text(),'Enter Manually')]")
    private WebElement EnterManullyTab;
    @FindBy(xpath = "//span[contains(text(),'Aadhaar Card')]")
    private WebElement EnterEkycTab;
    @FindBy(xpath = "//input[contains(@inputmode,'numeric')]")
    private WebElement DOBEle1;
    @FindBy(xpath = "//input[@id='aadharCard']")
    private WebElement aadharcardEle;
    
    @FindBy(xpath = "//input[@inputmode='numeric']")
    private WebElement InsuredDOBEle;
    
    //===========BOM=============
    
    
    @FindBy(xpath = "//input[@name='bankCustomerId']")
    private WebElement bankCustID;
    
    @FindBy(xpath = "//span[text()='Continue']")
    private WebElement continuee;
    
    
    @FindBy(xpath = "//input[@name='caRefA']")
    private WebElement leadisbom;
   
    @FindBy(xpath = "//label[contains(text(),'CA Ref B')]//parent::div//child::input")
    private WebElement CARefB;
    
    @FindBy(xpath = "//label[contains(text(),'SP Code of CA ')]//parent::div//child::input")
    private WebElement SPcodeCA;
    @FindBy(xpath = "//label[contains(text(),'CA Branch Code ')]//parent::div//child::input")
    private WebElement CABranch;
    
    @FindBy(xpath = "//input[contains(@name,'supervisorCode')]//parent::div//child::input")
    private WebElement USMcode;
    
    @FindBy(xpath = "//input[@id='leadId']")
    private WebElement leadIdInputWeb;
    
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])")
    private WebElement AssignTo;
    
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[2]")
    private WebElement AdviserState;
    
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])")
    private WebElement StateForAdviser;
    @FindBy(xpath = "//label[contains(text(),'CA Ref A')]//parent::div//child::input")
    private WebElement CAREFA;
    
    @FindBy(xpath = "//label[contains(text(),'USM / SSM / ASM / ZSM Code ')]//parent::div//child::input")
    private WebElement USMSSMASM;
    
    @FindBy(xpath = "//label[contains(text(),'Tele Caller Code')]//parent::div//child::input")
    private WebElement TeleCallerCode;
    
    @FindBy(xpath = "//label[contains(text(),'Verifier Code')]//parent::div//child::input")
    private WebElement VerifierCode;
    
    
    
    public void EnterVerifierCodeWeb(String Val) {
    	 wait.waitForElementToBeVisibleweb(getDriver(), VerifierCode, 2,"time out to find element on page");
		if (VerifierCode.isDisplayed()) {
			VerifierCode.clear();
			VerifierCode.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter Verifier Code Value As =====>" + Val);
		}
	}

    
    
    public void EnterTeleCallerCodeWeb(String Val) {
    	 wait.waitForElementToBeVisibleweb(getDriver(), TeleCallerCode, 2,"time out to find element on page");
		if (TeleCallerCode.isDisplayed()) {
			TeleCallerCode.clear();
			TeleCallerCode.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter Tele Caller Code Value As =====>" + Val);
		}
	}
    
    
    
    public void EnterAuthorizeCodeWeb(String Val) {
    	 wait.waitForElementToBeVisibleweb(getDriver(), USMSSMASM, 2,"time out to find element on page");
		if (USMSSMASM.isDisplayed()) {
			USMSSMASM.clear();
			USMSSMASM.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter USM / SSM / ASM / ZSM Code   Value As =====>" + Val);
		}
	}
    
    
    
    
    public void EnterCARefAWeb(String Val) {
    	 wait.waitForElementToBeVisibleweb(getDriver(), CAREFA, 2,"time out to find element on page");
		if (CAREFA.isDisplayed()) {
			CAREFA.clear();
			CAREFA.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step  ("Enter CA Ref A  Value As =====>" + Val);
		}
	}
    
    
    
    public void  SelectAdviserStateForAdviser(String val) throws InterruptedException {
    	 wait.waitForElementToBeVisibleweb(getDriver(), StateForAdviser, 2,"time out to find element on page");
    	StateForAdviser.click();
		 if(StateForAdviser.isDisplayed()) {
			 
			 for (int i = 0; i < 10; i++) {
				 StateForAdviser.sendKeys(Keys.BACK_SPACE);
				 StateForAdviser.sendKeys(" ");
				 StateForAdviser.sendKeys(Keys.DELETE);
				 StateForAdviser.sendKeys(Keys.CLEAR);


	            }  
			 StateForAdviser.click();
			 StateForAdviser.sendKeys("m");
			 Thread.sleep(2000);
			 StateForAdviser.clear();
			 StateForAdviser.sendKeys(val);
			 Thread.sleep(2000);
			 StateForAdviser.sendKeys(Keys.ARROW_DOWN);
			 StateForAdviser.click();
			
			 StateForAdviser.sendKeys(Keys.ENTER);
			
			 // CustomListner.test.log(LogStatus.INFO, "Enter place Of Birth (State) Values As=====>"+val);
		 }else {
			 // CustomListner.test.log(LogStatus.FAIL, "place Of Birth (State) Dropdown Is Not Display");
		 }
	 }
    public void  SelectAdviserState(String val) throws InterruptedException {
    	 wait.waitForElementToBeVisibleweb(getDriver(), AdviserState, 2,"time out to find element on page");
    	AdviserState.click();
		 if(AdviserState.isDisplayed()) {
			 AdviserState.sendKeys(val);
			 Thread.sleep(2000);
			 AdviserState.sendKeys(Keys.ARROW_DOWN);
			 AdviserState.sendKeys(Keys.ENTER);
			 // CustomListner.test.log(LogStatus.INFO, "Enter place Of Birth (State) Values As=====>"+val);
		 }else {
			 // CustomListner.test.log(LogStatus.FAIL, "place Of Birth (State) Dropdown Is Not Display");
		 }
	 }
    public void  SelectAssignTo(String val) throws InterruptedException {
    	 wait.waitForElementToBeVisibleweb(getDriver(), AssignTo, 2,"time out to find element on page");
    	AssignTo.click();
		 if(AssignTo.isDisplayed()) {
			 AssignTo.sendKeys(val);
			 Thread.sleep(2000);
			 AssignTo.sendKeys(Keys.ARROW_DOWN);
			 AssignTo.sendKeys(Keys.ENTER);
			 // CustomListner.test.log(LogStatus.INFO, "Enter place Of Birth (State) Values As=====>"+val);
		 }else {
			 // CustomListner.test.log(LogStatus.FAIL, "place Of Birth (State) Dropdown Is Not Display");
		 }
	 }
    
    public void enterLeadIDWeb(String args) {
    	 wait.waitForElementToBeVisibleweb(getDriver(), leadIdInputWeb, 2,"time out to find element on page");
        if (leadIdInputWeb.isDisplayed()) {
            leadIdInputWeb.sendKeys(args);
            Allure.step  ("Enter Lead Value As =====>"+args);
        } else {
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "Failed to Enter  Lead Value As =====>"+args);
            System.out.println("leadId input box is not visible");
        }
    }
    
    
    
    
    public void ClickOncustomerProfileContinueButton() {
    	// wait.waitForElementToBeVisibleweb(getDriver(), bankCustID, 2,"time out to find element on page");
		 wait.waitForElementToBeVisibleweb(getDriver(), continuee, 2,"time out to find element on page");
		if (continuee.isDisplayed()) {
			continuee.click();
			
			 Allure.step ("Click On Contiue Button");
		}
	}
    
    public void EnterBankCustomerIDWeb(String Val) {
		
		 wait.waitForElementToBeVisibleweb(getDriver(), bankCustID, 2,"time out to find element on page");
		if (bankCustID.isDisplayed()) {
			bankCustID.clear();
			bankCustID.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter Bank Customer ID  Value As =====>" + Val);
		}
	}
    public void ClickOnIsProposerWithBank(String Val) {
     	 WebElement ProWithBank=getDriver().findElement(By.xpath("//div[contains(text(),'"+Val+"')]"));
     	 wait.waitForElementToBeVisibleweb(getDriver(), ProWithBank, 2,"time out to find element on page");
         if(ProWithBank.isDisplayed()) {
        	 ProWithBank.click();
        	 Allure.step  ("Click on Is Proposer with the bank for more than 7 months?  Button As=====>"+Val);
         }else {
        	 Allure.step  (Val+"Button For Is Proposer with the bank for more than 7 months?  is not visible");
         }
     }
  public void EnterleadidWeb(String Val) {
	  wait.waitForElementToBeVisibleweb(getDriver(), leadisbom, 2,"time out to find element on page");
		if (leadisbom.isDisplayed()) {
            leadisbom.clear();
            leadisbom.sendKeys(Val);
			 Allure.step ("Enter Lead ID for BOM =====>" + Val);
		}
	}

  public void EnterCARefBWeb(String Val) {
	  wait.waitForElementToBeVisibleweb(getDriver(), CARefB, 2,"time out to find element on page");
		if (CARefB.isDisplayed()) {
			CARefB.clear();
			CARefB.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter CA Ref B  Value As =====>" + Val);
		}
	}
  public void  SelectSPCodeForCA(String val) throws InterruptedException {

		 wait.waitForElementToBeVisibleweb(getDriver(), SPcodeCA, 2,"time out to find element on page");
		 SPcodeCA.click();
		 Allure.step  ("Enter SP Code For CA DropDown");
		 if(SPcodeCA.isDisplayed()) {
			 SPcodeCA.sendKeys(val);
			 Thread.sleep(2000);
			 SPcodeCA.sendKeys(Keys.ARROW_DOWN);
			 SPcodeCA.sendKeys(Keys.ENTER);
			 Allure.step  ("Select SP Code For CA Values As=====>"+val);
		 }else {
			 Allure.step  ("SP Code For CA Dropdown Is Not Display");
		 }
	 }
  public void  SelectCAbranchCode(String val) throws InterruptedException {
	
	  wait.waitForElementToBeVisibleweb(getDriver(), CABranch, 2,"time out to find element on page");
	  CABranch.click();
	  Allure.step ("Enter SP Code For CA DropDown");
	  if(CABranch.isDisplayed()) {
		  CABranch.sendKeys(val);
	 	 Thread.sleep(2000);
	 	CABranch.sendKeys(Keys.ARROW_DOWN);
	 	CABranch.sendKeys(Keys.ENTER);
	 	 Allure.step ("Select SP Code For CA Values As=====>"+val);
	  }else {
		  Allure.step ("SP Code For CA Dropdown Is Not Display");
	  }
	 }
  public void  SelectUSMCode(String val) throws InterruptedException {
		
	  wait.waitForElementToBeVisibleweb(getDriver(), USMcode, 2,"time out to find element on page");
	  USMcode.click();
	
	  if(USMcode.isDisplayed()) {
		  USMcode.sendKeys(val);
	 	 Thread.sleep(2000);
	 	
	 	 Allure.step ("Select USM Code Values As=====>"+val);
	  }else {
		  Allure.step ("USM Code Fliled Is Not Display");
	  }
	 }

  //==============
	
    
    
    
    public void IsElementPresent() {
    	 wait.waitForElementToBeVisibleweb(getDriver(), Ele, 2,"time out to find element on page");
		if (Ele.isDisplayed()) {
		boolean b=	Ele.isDisplayed();
			Assert.assertTrue(b);
		    Allure.step("Successfully Display Details Element on Page" );
		}
		else {
			 System.out.println("Element is nor Displyed");
		}
	}
    
    
    
    public void ClickOnEditButton() {
    	 wait.waitForElementToBeVisibleweb(getDriver(), aadharcardEle, 2,"time out to find element on page");
  		if (EditBtn.isDisplayed()) {
  			EditBtn.click();
  			 Allure.step ("Click on Edit Button" );
  		}
  		else {
  			 Allure.step ("Edit Button Is Not Display" );
  		}
  	}
    
    public void ClickOnEditAlerPopUp() {
    	 wait.waitForElementToBeVisibleweb(getDriver(), AlertPopUpEle, 2,"time out to find element on page");
         if(AlertPopUpEle.isDisplayed()) {
       	  AlertPopUpEle.click();
       	 Allure.step ("Click on Alert Pop Up OK Button ");
         }else {
        	 Allure.step("Alert Pop Up OK Button  is not Display");
         }
     }
    
    public void ClearEditPanNameWeb() throws InterruptedException {
	
    	 wait.waitForElementToBeVisibleweb(getDriver(), ClearEditEle, 2,"time out to find element on page");
		if (ClearEditEle.isDisplayed()) {
			ClearEditEle.click();
			 for (int i = 0; i < 2; i++) {
				 ClearEditEle.sendKeys(Keys.BACK_SPACE);
				 ClearEditEle.sendKeys(Keys.DELETE);
	            }
			 Allure.step  ("Remove Last Two Character In Name");
		
		} else {
			 Allure.step("Failed To Display Proposer Name TextField");
		}
	}
    
    
    public void ClickOnConfirmButton() {
    	 wait.waitForElementToBeVisibleweb(getDriver(), aadharcardEle, 2,"time out to find element on page");
		if (ConfirmBtn.isDisplayed()) {
			ConfirmBtn.click();
			 Allure.step  ("Click on Confirm Button" );
		}
		else {
			 Allure.step ("Confirm Button Is Not Display" );
		}
	}
    public void ClickOnEnterManualButton() {
    	 wait.waitForElementToBeVisibleweb(getDriver(), EnterManullyTab, 2,"time out to find element on page");
		if (EnterManullyTab.isDisplayed()) {
			EnterManullyTab.click();
			 Allure.step ("Click on Enter Manually Button" );
		}
		else {
			 Allure.step ("Enter Manually Button Is Not Display" );
		}
	}
    public void ClickOnAadharCardButton() {
    	 wait.waitForElementToBeVisibleweb(getDriver(), EnterEkycTab, 2,"time out to find element on page");
		if (EnterEkycTab.isDisplayed()) {
			EnterEkycTab.click();
			 Allure.step ("Click on Aadhaar Card Button" );
		}
		else {
			 Allure.step("Aadhaar Card Button Is Not Display" );
		}
	}
    
    public void enterProposerDOBWeb(String Val) {
    	 wait.waitForElementToBeVisibleweb(getDriver(), DOBEle1, 2,"time out to find element on page");
		if (DOBEle1.isDisplayed()) {
			DOBEle1.clear();
			DOBEle1.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter Proposer DOB  Value As =====>" + Val);
		}
	}
    
    public void EnterProposerAadharCardNoWeb(String Val) {
    	  wait.waitForElementToBeVisibleweb(getDriver(), aadharcardEle, 2,"time out to find element on page");
		if (aadharcardEle.isDisplayed()) {
			aadharcardEle.clear();
			aadharcardEle.sendKeys(Val);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step ("Enter Proposer Aadhar Card No Value As =====>" + Val);
		}
	}
    
    
    
    
    
    
    
    
    
    
  //===========================================================================================================  
    
    
    public void ClickOnSelectTypeOfProposer(String proposertype) {
        WebElement custtype=getDriver().findElement(By.xpath("(//span[contains(text(),'"+proposertype+"')])[1]"));
        if (custtype.isDisplayed()) {
            custtype.click();
            Allure.step("Select the Proposer Type  >"   + proposertype);
        } else {
            System.out.println("Type of proposer Radio button is not visible");
        }
    }

    public void Ispropandinsusame(String Ispropsame) {
        WebElement propsame=getDriver().findElement(By.xpath("//span[contains(text(),'"+Ispropsame+"')]"));
        if (propsame.isDisplayed()) {
            propsame.click();
            Allure.step("Select Proposer Insured Same  >"   + Ispropsame);
        } else {
            System.out.println("Is proposer same Radio button is not visible");
        }
    }

    public void cpnextbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), cpnext, 30,"time out to find element on page");
        if (cpnext.isDisplayed()) {
            cpnext.click();
            Allure.step("Clicked On Customer Profile Next Button");
        } else {
            System.out.println("Next button is not visible");
        }
    }

    public void IspropNRI(String propNRI) {
        WebElement propnri=getDriver().findElement(By.xpath("//div//label//span[contains(text(),'"+propNRI+"')]"));
        if (propnri.isDisplayed()) {
            propnri.click();
            Allure.step("Select Is Proposer NRI  >"   + propNRI);
        } else {
            System.out.println("Is proposer NRI radio button is not visible");
        }
    }

    public void propagreecheckbox() {
       // wait.waitForElementToBeVisibleweb(getDriver(), propbox, 2,"time out to find element on page");
        if (propbox.isEnabled()) {
            propbox.click();
            Allure.step("Clicked On Agree Check BoX");
        } else {
            System.out.println("PAN agreement check box is not visible");
        }
    }
    public void cdnextbutton() {
        wait.waitForElementToBeVisibleweb(getDriver(), cdnext, 30,"time out to find element on page");
        if (cdnext.isDisplayed()) {
            cdnext.click();
            Allure.step("Clicked On Customer Detail Next Button");
        } else {
            System.out.println("NEXT button is not visible");
        }
    }
    public void SelectPropTitleweb(String PropTitle) {
        wait.waitForElementToBeVisibleweb(getDriver(),prpttl,20,"time out to find the element");
        if(prpttl.isDisplayed()) {
            prpttl.click();
        }
        WebElement prp = getDriver().findElement(By.xpath("//ul//li//span[text()='"+PropTitle+"']"));
        wait.waitForElementToBeVisibleweb(getDriver(),prp,20,"time out to find the element");
        prp.click();
        Allure.step("Select the Proposer Type  >"   + PropTitle);
    }
    public void Relationwithinsured(String Relationwithinsured) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(),relinsured,20,"time out to find the element");
        relinsured.click();
        Allure.step( "Click on  Relation With Insured DropDown");
        wait.WaitTime(1);

        WebElement reltype= getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+Relationwithinsured+"')]"));
        if(reltype.isDisplayed()) {
            wait.waitForElementToBeVisibleweb(getDriver(), reltype, 30,"time out to find element on page");
            reltype.click();
            Allure.step( "Select relation With To Be Insured Values As=====>"+Relationwithinsured);
        }else {
            Allure.step( "Relation With The To Be Insured DropDown Value Is Not Displayed");
        }
    }

    public void Isinsurerminor(String IsMinor) {
        WebElement minor=getDriver().findElement(By.xpath("(//span[contains(text(),'"+IsMinor+"')])[2]"));
        if (minor.isDisplayed()) {
            minor.click();
            Allure.step("Select Is to be insured a minor?  >"   + IsMinor);
        } else {
            System.out.println("Is to be insured a minor? Radio button is not visible");
        }
    }
    public void IsinsurerNRI(String InsuNRI){
        WebElement insnri=getDriver().findElement(By.xpath("//span[contains(text(),'"+InsuNRI+"')]"));
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),insnri,30,"Unable to locate Element");
        if(insnri.isDisplayed()){
            insnri.click();
            Allure.step("Select Is Insurer NRI  >"   + InsuNRI);
        }else {
            System.out.println("Is Insurer NRI radio button is not visible");
        }
    }
    public void EnterFirstNameInsuredweb(String InsuredFirstname) {
            wait.waitForElementToBeVisibleweb( getDriver(), insufirstname, 20,"time out to find element on page");
            if(insufirstname.isDisplayed()) {
                insufirstname.sendKeys(InsuredFirstname);
                Allure.step( "Enter FirstName of Insurer   >"   +InsuredFirstname);
            }else {
                System.out.println("First Name TextField Is Not Display");
            }
        }

    public void EnterLastNameInsuredweb(String InsuredLastname) {
            wait.waitForElementToBeVisibleweb( getDriver(), insulastname, 20,"time out to find element on page");
            if(insulastname.isDisplayed()) {
                insulastname.sendKeys(InsuredLastname);
                Allure.step( "Enter Last Name of Insurer   >"   +InsuredLastname);
            }else {
                System.out.println( "Last Name TextField Is Not Display");
            }
        }

    public void clickOnGenderBtnWeb(String InsuredGender) {
        WebElement GenderEle =  getDriver().findElement(By.xpath("//span[text()='"+InsuredGender+"']"));
       // wait.waitForElementToBeVisibleweb( getDriver(), GenderEle, 30,"Element is Not Display");
        if (GenderEle.isDisplayed()) {
            GenderEle.click();
            Allure.step( "Click on Insurer Gender Button As  "   +InsuredGender);
        } else {
            System.out.println(" Insurer Gender Button is not Visible");
        }
    }

    public void SalutationTitleInsuredWeb(String InsuredTitle) throws InterruptedException {
        if (insutitle.isDisplayed()) {
            insutitle.click();
            Allure.step( "click on  Salutation Title DropDown");
            wait.WaitTime(2);
            WebElement Titlevalue =  getDriver().findElement(By.xpath("//ul//li//span[text()='"+InsuredTitle+"']"));
            if (Titlevalue.isDisplayed()) {
                Titlevalue.click();
                Allure.step("Select Salutation Title for Insurer  "  +InsuredTitle);
            } else {
                System.out.println( " Salutation Title for insurer DropDown value is not visible");
            }
        }
    }

    public void PropDobmatchpopup() {
        wait.waitForElementToBeVisibleweb(getDriver(), proppop, 30,"time out to find element on page");
        if (proppop.isDisplayed()) {
            proppop.click();
            Allure.step("Clicked On Unable to verify Date of Birth pop up as PROCEED");
        } else {
            System.out.println("Proceed button is not visible");
        }
    }

    public void insuDobmatchpopup() {
        wait.waitForElementToBeVisibleweb(getDriver(), insupop, 30,"time out to find element on page");
        if (insupop.isDisplayed()) {
            insupop.click();
            Allure.step("Clicked On Unable to verify Date of Birth pop up as PROCEED");
        } else {
            System.out.println("Proceed button is not visible");
        }
    }


    public void EnterDOBInsuredweb(String InsurerDOB) {
        wait.waitForElementToBeVisibleweb( getDriver(), insudob, 30,"time out to find element on page");
        if(insudob.isDisplayed()) {
            insudob.sendKeys(InsurerDOB);
            Allure.step( "Enter FirstName Values As  >"   +InsurerDOB);
        }else {
            System.out.println( "Insurer dob filed is no visible");
        }
    }

    public void SelectPolicyTypeWeb(String CompanyPolicyType) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cpol, 30,"time out to find element on page");
        if(cpol.isDisplayed()) {
            cpol.click();
        }
        wait.WaitTime(1);
        WebElement PtypeWebSelection=getDriver().findElement(By.xpath("//ul//li//span[text()='"+CompanyPolicyType+"']"));
        if(PtypeWebSelection.isDisplayed()) {
            PtypeWebSelection.click();
            Allure.step( "Select the Policy Type  >"   + CompanyPolicyType);
        }
    }
    public void EnterCompanyPANWeb(String CompanyPAN){
        wait.waitForElementToBeVisibleweb(getDriver(), cpan, 50, "time out to find element on page");
        if(cpan.isDisplayed()){
            cpan.click();

            for (int i = 0; i < 11; i++) {
                cpan.sendKeys(Keys.BACK_SPACE);
                cpan.sendKeys(" ");
                cpan.sendKeys(Keys.DELETE);
            }
            cpan.sendKeys(CompanyPAN);
            Allure.step( "Enter the PAN of Company  >"   + CompanyPAN);
        }
    }
    public void companyagreecheckbox() {
        // wait.waitForElementToBeVisibleweb(getDriver(), propbox, 2,"time out to find element on page");
        if (compbox.isEnabled()) {
            compbox.click();
            Allure.step("Clicked On Agree Check BoX");
        } else {
            System.out.println("PAN agreement check box is not visible");
        }
    }
    public void EnterCompanyNameWeb(String CompanyName){
        wait.waitForElementToBeVisibleweb(getDriver(), cname, 50, "time out to find element on page");
        if(cname.isDisplayed()){
            cname.click();

            for (int i = 0; i < 2; i++) {
                cname.sendKeys(Keys.BACK_SPACE);
                cname.sendKeys(" ");
                cname.sendKeys(Keys.DELETE);
            }
            cname.sendKeys(CompanyName);
            Allure.step( "Enter the Name of Company  >"   + CompanyName);
        }
    }
    public void EnterCompanyDOIWeb(String CompanyDOI){
        wait.waitForElementToBeVisibleweb(getDriver(), cdoi, 10, "time out to find element on page");
        if(cdoi.isDisplayed()){
            cdoi.click();

            for (int i = 0; i < 11; i++) {
                cdoi.sendKeys(Keys.BACK_SPACE);
                cdoi.sendKeys(" ");
                cdoi.sendKeys(Keys.DELETE);
            }
            cdoi.sendKeys(CompanyDOI);
            Allure.step( "Enter the Date of Incorporation (DD/MM/YYYY) of Company  >"   + CompanyDOI);
        }
    }

    public void selectTypeOfNRI(String nriType){
        wait.waitForElementToBeVisibleweb(getDriver(), typeOfNRI, 10, "time out to find element on page");
        if(typeOfNRI.isDisplayed()){
            typeOfNRI.click();
            WebElement nrType=getDriver().findElement(By.xpath("//ul/li/div/span[text()='"+nriType+"']"));
            WaitUtils.waitforElementToBeClickable(getDriver(),nrType,30);
            nrType.click();
            Allure.step( "Selected NRIType As  >"   +nriType);
        }
    }

    public void enterCountryOfNRIResidence(String nriCountryResidence) throws InterruptedException {
        WaitUtils.waitForElementToBeVisibleweb(getDriver(),nriCountry,10,"TimeOut to find element on page");
        if (nriCountry.isDisplayed()) {
            nriCountry.sendKeys(nriCountryResidence);
            wait.WaitTime(2);
            nriCountry.sendKeys(Keys.ARROW_DOWN);
            nriCountry.sendKeys(Keys.ENTER);
            Allure.step("Select Country of nriResidence As  >"   + nriCountryResidence);
        } else {
            System.out.println("Country of nriResidence is not displayed");
        }
    }

    //-------------------------SAKSHI-------------------------------------------//

    public void EnterProposerMiddlenameweb(String ProposerMiddlename) {
        wait.waitForElementToBeVisibleweb( getDriver(), propmiddlename, 20,"time out to find element on page");
        if(propmiddlename.isDisplayed()) {
            propmiddlename.sendKeys(ProposerMiddlename);
            Allure.step( "Enter Middle Name of Proposer   >"   +ProposerMiddlename);
        }else {
            System.out.println( "Middle Name TextField Is Not Display");
        }
    }

    @FindBy(xpath = "//input[@name='panNumber']")
    private WebElement majorpan;
    public void EntermajorPancard(String MajorPAN) {
        wait.waitForElementToBeVisibleweb( getDriver(), majorpan, 20,"time out to find element on page");
        if(majorpan.isDisplayed()) {
            majorpan.sendKeys(MajorPAN);
            Allure.step( "Enter PAN of Major insured   >"   +MajorPAN);
        }else {
            System.out.println( "PAN of major insured Is Not Display");
        }
    }

    public void EnterAdvisorStateWeb(String AdvisorState) throws InterruptedException {
        wait.waitForElementToBeVisibleweb( getDriver(), advstate, 50,"time out to find element on page");
        if(advstate.isDisplayed()){
            advstate.click();
            advstate.sendKeys(AdvisorState);
            advstate.sendKeys(Keys.BACK_SPACE);
            advstate.sendKeys(Keys.ARROW_DOWN);
            advstate.sendKeys(Keys.ENTER);
            Allure.step( "Select Advisor/Partner/Banker's State  >"   + AdvisorState);
        }
    }

    public void IsNRIradio(String propNRI) {
        WebElement radionri=getDriver().findElement(By.xpath("(//span[contains(text(),'"+propNRI+"')])"));
        if (radionri.isDisplayed()) {
            radionri.click();
            Allure.step("Select Is prop nri radio button as no  >"   + propNRI);
        } else {
            System.out.println("Is prop nri Radio button is not visible");
        }
    }
    @FindBy(xpath = "(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-filled MuiInputBase-input MuiFilledInput-input'])[2]")
    private WebElement entitytype;
    public void SelectEntityEmp_emp(String Entity) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), entitytype, 30,"time out to find element on page");
        if(entitytype.isDisplayed()) {
            entitytype.click();
        }
        wait.WaitTime(1);
        WebElement PtypeWebSelection=getDriver().findElement(By.xpath("//ul//li//span[text()='"+Entity+"']"));
        if(PtypeWebSelection.isDisplayed()) {
            PtypeWebSelection.click();
            Allure.step( "Select the Policy Type  >"   + Entity);
        }
    }


/////=================VIJAY BY NETBANKING==========================
    
    public void SelectAssistedbyHDFCBankEmployeeYESWeb() throws InterruptedException {
       // wait.waitForElementToBeVisibleweb(getDriver(), cpol, 5,"time out to find element on page");
       
        if(yesBNT.isEnabled()) {
        	yesBNT.click();
            Allure.step( "Select the assisted by HDFC Bank employee is YES");
        }
    }
    public void EnterAssistedbyHDFCBankEmployee() throws InterruptedException {
       // wait.waitForElementToBeVisibleweb(getDriver(), cpol, 5,"time out to find element on page");
       
        if(yesBNT.isEnabled()) {
        	yesBNT.click();
            Allure.step( "Select the assisted by HDFC Bank employee is YES");
        }
    }
    public void SelectRelationWithInsured(String val) throws InterruptedException {
    	 wait.waitForElementToBeVisibleweb(getDriver(), RelationEle1, 5,"time out to find element on page");
		RelationEle1.click();
		  Allure.step( "Click on Relation With Insured DropDown");
	
		Thread.sleep(3000);
		WebElement RelationEle2= getDriver().findElement(By.xpath("//ul//li//span[contains(text(),'"+val+"')]"));
		 wait.waitForElementToBeVisibleweb(getDriver(), RelationEle2, 3,"time out to find element on page");
		String text=RelationEle2.getText();
		if(text.equalsIgnoreCase(val)) {
			RelationEle2.click();
			 Allure.step( "Select relation With The To Be Insured Values As=====>"+val);
			
		}else {
			//ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Relation With The To Be Insured DropDown Value Is Not Display");
		}
	
	}
    public void SelectAssistedbyHDFCBankEmployeeNOWeb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cpol, 3,"time out to find element on page");
       
        if(noBNT.isEnabled()) {
        	noBNT.click();
            Allure.step( "Select the assisted by HDFC Bank employee is NO");
        }
    }

   



    public void SelectRelationshipWithBankmorethan7YESWeb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), PropoerRelnWithBankYes, 3,"time out to find element on page");
       
        if(PropoerRelnWithBankYes.isEnabled()) {
        	PropoerRelnWithBankYes.click();
            Allure.step( "Select Proposer's relationship with bank more than 7 month");
        }
    }
    public void SelectRelationshipWithBankmorethan7NOWeb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), cpol, 3,"time out to find element on page");
       
        if(PropoerRelnWithBankNo.isEnabled()) {
        	PropoerRelnWithBankNo.click();
            Allure.step( "Select Proposer's relationship with bank less than 7 month");
        }
    }


  


    public void clickOnProposerIAgreeCheckboxWeb() {
    	
    	 wait.waitForElementToBeVisibleweb(getDriver(), termAndCondition, 1,"time out to find element on page");
		if (termAndCondition.isEnabled()) {
			termAndCondition.click();
			 Allure.step( "Click on Proposer I Agree Checkbox");
			// ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Proposer I Agree Checkbox");
		} else {
			 ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Proposer I Agree Checkbox is Not Enable");
		}

	}

    public void clickOnProposerIAgreeCheckboxWeb1() {
    	
   	// wait.waitForElementToBeVisibleweb(getDriver(), termAndCondition1, 1,"time out to find element on page");
		if (termAndCondition1.isEnabled()) {
			termAndCondition1.click();
			 Allure.step( "Click on Proposer I Agree Checkbox");
			// ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Proposer I Agree Checkbox");
		} else {
			termAndCondition1.click();
			 ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Proposer I Agree Checkbox is Not Enable");
		}

	}
    
    
    
    
    public void ClearEditProposerDOBWeb(String Val) throws InterruptedException {
    	 wait.waitForElementToBeVisibleweb(getDriver(), DOBEle, 5,"time out to find element on page");
		if (DOBEle.isDisplayed()) {
			DOBEle.click();
			 for (int i = 0; i < 10; i++) {
				 DOBEle.sendKeys(Keys.BACK_SPACE);
				 DOBEle.sendKeys(Keys.DELETE);
	            }
			 Allure.step( "Remove Proposer DOB");
			DOBEle.sendKeys(Val);
			Thread.sleep(2000);
			//mobileInputWeb.sendKeys(Keys.TAB);
			 Allure.step( "Enter Proposer DOB  Value As =====>" + Val);
		}
		else {
			 Allure.step( "Proposer DOB  Is Not Display");
		}
	}
    
    
    
    public void ChangeSalutionTitleInsuredWeb(String Title) throws InterruptedException {
		 
    	 wait.waitForElementToBeVisibleweb(getDriver(), salution, 5,"time out to find element on page");
		if (salution.isDisplayed()) {
			salution.click();
			 Allure.step( "click on  Salution Title DropDown");
			Thread.sleep(2000);
			WebElement Titlevalue = getDriver().findElement(By.xpath("//ul//li//span[text()='" + Title + "']"));
			if (Titlevalue.isDisplayed()) {

				Titlevalue.click();
				 Allure.step( "Select  Salution Title DropDown value As====>"+Title);
			} else {
				 Allure.step( " Salution Title DropDown value is not display");
			}
			
		}
		else {
			 Allure.step("Salution Title DropDown is not display");
		}
	}
    
    public void ChangeSalutionTitleInsuredDCB() throws InterruptedException {
		 
   	 wait.waitForElementToBeVisibleweb(getDriver(), salution, 5,"time out to find element on page");
		if (salution.isDisplayed()) {
			salution.click();
			 Allure.step( "click on  Salution Title DropDown");
			Thread.sleep(2000);
			WebElement Titlevalue = getDriver().findElement(By.xpath("//span[text()='Ms.']"));
			if (Titlevalue.isDisplayed()) {

				Titlevalue.click();
				// Allure.step( "Select  Salution Title DropDown value As====>"+Title);
			} else {
				 Allure.step( " Salution Title DropDown value is not display");
			}
			
		}
		else {
			 Allure.step("Salution Title DropDown is not display");
		}
	}

    public void ChangeSalutionTitleInsured_MALE_DCB() throws InterruptedException {
		 
   	 wait.waitForElementToBeVisibleweb(getDriver(), salution, 5,"time out to find element on page");
		if (salution.isDisplayed()) {
			salution.click();
			 Allure.step( "click on  Salution Title DropDown");
			Thread.sleep(2000);
			WebElement Titlevalue = getDriver().findElement(By.xpath("//span[text()='Mr.']"));
			if (Titlevalue.isDisplayed()) {

				Titlevalue.click();
				// Allure.step( "Select  Salution Title DropDown value As====>"+Title);
			} else {
				 Allure.step( " Salution Title DropDown value is not display");
			}
			
		}
		else {
			 Allure.step("Salution Title DropDown is not display");
		}
	}
    public void ClearEditPanNameWeb(String args) throws InterruptedException {
    	 wait.waitForElementToBeVisibleweb(getDriver(), firstName, 5,"time out to find element on page");
		if (firstName.isDisplayed()) {
			firstName.click();
			 for (int i = 0; i < 2; i++) {
				 firstName.sendKeys(Keys.BACK_SPACE);
				 firstName.sendKeys(Keys.DELETE);
	            }
			 Allure.step ("Remove Last Two Character In Name AS====>>"+args);
		
		} else {
			 Allure.step ("Failed To Display Proposer Name TextField");
		}
	}
    
    
 public void ClearEditProMiddleNameWeb(String args) throws InterruptedException {
	 wait.waitForElementToBeVisibleweb(getDriver(), MiddenName, 5,"time out to find element on page");
		if (MiddenName.isDisplayed()) {
			MiddenName.click();
			 for (int i = 0; i < 2; i++) {
				 MiddenName.sendKeys(Keys.BACK_SPACE);
				 MiddenName.sendKeys(Keys.DELETE);
	            }
			 Allure.step ("Remove Last Two Character In Name AS>>>>"+args);
		
		} else {
			 Allure.step ("Failed To Display Proposer Name TextField");
		}
	}
    
    
    
 public void ClearEditProLastNameWeb(String args) throws InterruptedException {
	 wait.waitForElementToBeVisibleweb(getDriver(), LastName, 5,"time out to find element on page");
		if (LastName.isDisplayed()) {
			LastName.click();
			 for (int i = 0; i < 2; i++) {
				 LastName.sendKeys(Keys.BACK_SPACE);
				 LastName.sendKeys(Keys.DELETE);
	            }
			 Allure.step ("Remove Last Two Character In Name AS====>"+args);
		
		} else {
			 Allure.step ("Failed To Display Proposer Name TextField");
		}
	}
    
    
    
    
    public void clickOnGenderBtn(String val) {
    	// wait.waitForElementToBeVisibleweb(getDriver(), GenderEle, 5,"time out to find element on page");
		WebElement GenderEle = getDriver().findElement(By.xpath("//button[@value='"+val+"']"));
		//waitUtils.waitForElementToBeVisibleweb( WebDriverFactoryStaticThreadLocal.getDriver(), GenderEle, 30,"Element is Not Display");
		if (GenderEle.isDisplayed()) {
			GenderEle.click();
			 Allure.step( "Click on Gender Button As====> "+val);
		} else {
			 Allure.step(" Gender Button is not display");
		}
	}
    
    
	 public void ClickOnProposerCheckBox() {
		 wait.waitForElementToBeVisibleweb(getDriver(), ChechboxEle, 5,"time out to find element on page");
	       if(ChechboxEle.isEnabled()) {
	    	   ChechboxEle.click();
	    	   Allure.step("Click on ChechBox ");
	       
	       }else {
	    	   Allure.step ("ChechBox is not Enable");
	       }
	   }
	 public void ClickOnAlerPopUp() {
		 wait.waitForElementToBeVisibleweb(getDriver(), AlertPopUpEle, 5,"time out to find element on page");
          if(AlertPopUpEle.isDisplayed()) {
        	  AlertPopUpEle.click();
        	  Allure.step  ("Click on Alert Pop Up OK Button ");
          }else {
        	  Allure.step  ("Alert Pop Up OK Button  is not Display");
          }
      }
	 public void ClickOnYesBtnWeb(){
		 wait.waitForElementToBeVisibleweb(getDriver(), yesbtn, 5,"time out to find element on page");
	        if(yesbtn.isDisplayed()){
	        	yesbtn.click();
	        	Allure.step  ("Click On NRI Yes Button");
	        }else {
	        	Allure.step  ("Yes Button Is Not Display");
	        }
	    }
	    
	    public void selectTypeOfNRIWeb(String TypeOfNRI){
	    	 wait.waitForElementToBeVisibleweb(getDriver(), NRIDrpdown, 5,"time out to find element on page");
	        NRIDrpdown.click();
	        WebElement NRIOpt= getDriver().findElement(By.xpath("//span[text()='"+TypeOfNRI+"']"));
	        wait.waitForElementToBeVisibleweb(getDriver(), cpol, 5,"time out to find element on page");
	        NRIOpt.click();
	        Allure.step ("Select NRI Option  As=====>"+TypeOfNRI);
	    }
	    
	    public void  SelectNRICountryWeb(String val) throws InterruptedException {
	    	 wait.waitForElementToBeVisibleweb(getDriver(), cpol, 5,"time out to find element on page");
	       if(ele1.isDisplayed()) {
	    	   ele1.sendKeys(val);
	    	   Thread.sleep(2000);
	    	   ele1.sendKeys(Keys.ARROW_DOWN);
	    	   ele1.sendKeys(Keys.ARROW_DOWN);
	    	   ele1.sendKeys(Keys.ENTER);
	    	   Allure.step  ("Enter NRI Country Values As=====>"+val);
	       }else {
	    	   Allure.step  ("NRI Country TextBox Is Not Display");
	       }	 	      
	  }

	    public void IspropNRIgstwavier(String args) {
	      
	    	wait.waitForElementToBeVisibleweb(getDriver(), NRIGSTwavierYES, 5,"time out to find element on page");
	    	if(args.equalsIgnoreCase("YES")) {
	        if (NRIGSTwavierYES.isDisplayed()) {
	        	NRIGSTwavierYES.click();
	            Allure.step("Do you want GST Waiver ? YES ");
	        } 
	        }else {
	        	NRIGSTwavierNO.click();
	        	 Allure.step("Do you want GST Waiver ? NO ");
	        }
	    }

	    public void ClickOnIsToBeInsuredAMinorRadioButton(String val) throws InterruptedException {
	    	WebElement IsInsuredproposer=getDriver().findElement(By.xpath("(//input[contains(@value,'"+val+"')])[2]"));
			if(IsInsuredproposer.isEnabled()) {
				IsInsuredproposer.click();
				  Allure.step  ("Click On Is To Be Insured A Minor As=====>"+val);
			}else {
				  Allure.step  ("Is To Be Insured A Minor Element Is Not Display");
			}
			
		}
	    
	    public void ClickOnIsToBeInsuredAMinorRadioButton_DBS(String val) throws InterruptedException {
	    	WebElement IsInsuredproposer=getDriver().findElement(By.xpath("(//input[contains(@value,'"+val+"')])[3]"));
			if(IsInsuredproposer.isEnabled()) {
				IsInsuredproposer.click();
				  Allure.step  ("Click On Is To Be Insured A Minor As=====>"+val);
			}else {
				  Allure.step  ("Is To Be Insured A Minor Element Is Not Display");
			}
			
		}
	    
	    public void enterInsuredpanNumberWeb(String panNumber) {
	    	 wait.waitForElementToBeVisibleweb(getDriver(), panNumberWeb, 2,"time out to find element on page");
			if (panNumberWeb.isDisplayed()) {
				panNumberWeb.clear();
				panNumberWeb.sendKeys(panNumber);
				
				Allure.step  ("Enter EmployeeCode  Value As =====>" + panNumber);
			} else {
				Allure.step ( "EmployeeCode TextBox Is Not Display");
			}
		}

	    
	    public void EnterMiddleNameInsuredweb(String val) throws InterruptedException {
	     	try {
	     		 wait.waitForElementToBeVisibleweb(getDriver(), MIDDENNAME, 2,"time out to find element on page");
	             if(MIDDENNAME.isDisplayed()) {
	            	 MIDDENNAME.sendKeys(val);
	            	 Allure.step ( "Enter Middle Name Values As=====>"+val);
	             }else {
	            	 Allure.step ("Middle Name TextFields Is Not Display");
	             }
	     	}catch(NoSuchElementException e) {
	     		ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Unable To Locate Element  Middle TextField");
	    	}
	    	
	    }
	    
	    
	    public void enterEmployeeCodeWeb(String args) {
	    	 wait.waitForElementToBeVisibleweb(getDriver(), EMPCODE, 2,"time out to find element on page");
			if (EMPCODE.isDisplayed()) {
				EMPCODE.clear();
				EMPCODE.sendKeys(args);
				
				Allure.step  ("Enter Insured PAN  Value As =====>" + args);
			} else {
				Allure.step ( "Insured PAN Number TextBox Is Not Display");
			}
		} 
	    
	    //==================VIJAY=======================================
	    
	    public void EnterSPCodeweb(String args) {
	        wait.waitForElementToBeVisibleweb( getDriver(), spCODE, 5,"time out to find element on page");
	        if(spCODE.isDisplayed()) {
	        	spCODE.sendKeys(args);
	            Allure.step( "Enter Sp Code Values As  >"   +args);
	        }else {
	            System.out.println( "Sp code  filed is no visible");
	        }
	    }

//	    public void ClickOnIsproposerInsuredSameNOButton() throws InterruptedException {
//	    	 wait.waitForElementToBeVisibleweb(getDriver(), PropoerInsuredsameNo, 3,"time out to find element on page");
//			if(PropoerInsuredsameNo.isEnabled()) {
//				PropoerInsuredsameNo.click();
//	            Allure.step( "Click On Is proposer And Insured Are Diffrent");
//				
//			}else {
//				ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Is Proposer And Insured Are Same Element Is Not Display");
//			}
//			
//		}
//	    public void enterpanNumberQAWeb(String panNumber) throws InterruptedException {
//	        wait.waitForElementToBeVisibleweb(getDriver(), PanNum, 5,"time out to find element on page");
//	       
//	        if(PanNum.isEnabled()) {
//	        	PanNum.click();
//	        	PanNum.sendKeys(panNumber);
//	            Allure.step( "Enter PAN  Value As =====>"+panNumber);
//	        }
//	    }
	    @Step("Enter Proposer Pan No As==> ")
	    public WebElement enterpanNumberQAWeb() throws InterruptedException {
	    	return PanNum;
	    }
	    
	    @Step("Click On Is To Be Insured Proposer YES Button")
	    public WebElement ClickOnIsproposerInsuredSameYESButton() throws InterruptedException {
	    	return PropoerInsuredsameYes;
		}
	    

	    public void ClickOnIsproposerInsuredSameNOButton() throws InterruptedException {
	    	//WebElement PropoerInsuredsameNo=getDriver().findElement(By.xpath("(//input[contains(@value,'"+val+"')])[3]"));
			if(PropoerInsuredsameNo.isEnabled()) {
				PropoerInsuredsameNo.click();
				  Allure.step  ("Click On Is To Be Insured Proposer NO Button");
			}else {
				  Allure.step  ("Is To Be Insured A Minor Element Is Not Display");
			}
	    	
			
		}
	    public void enterInsuredDOBWeb(String Val) {
	    	  wait.waitForElementToBeVisibleweb( getDriver(), InsuredDOBEle, 5,"time out to find element on page");
			if (InsuredDOBEle.isDisplayed()) {
				InsuredDOBEle.clear();
				InsuredDOBEle.sendKeys(Val);
				//mobileInputWeb.sendKeys(Keys.TAB);
				   Allure.step("Enter Insured DOB  Value As =====>" + Val);
			}
		}
	    
	    
}
