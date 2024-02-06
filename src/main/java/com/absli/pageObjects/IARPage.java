package com.absli.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.absli.base.TestBase;

import io.qameta.allure.Allure;

public class IARPage extends TestBase {
	
	 public IARPage(WebDriver driver) {PageFactory.initElements(getDriver(), this);}
	  
	 
	 @FindBy(xpath="(//button[@name='6000'])[2]")
	 WebElement selectplanWeb;
	 
	 
	 @FindBy(xpath="//input[@name='6015']")
	 WebElement EnterHaveYouPersonallyMet;
	 
	 @FindBy(xpath="//input[@name='6016']")
	 WebElement EnterAreYouPersonallySatisfy;
	 
	 
	 
	 @FindBy(xpath="(//button[@name='6001'])[2]")
	 WebElement PersonallySatisfy;
	 
	 @FindBy(xpath="//input[contains(@name,'6003')]")
	 WebElement HowDoyouKnow;
	 
	 @FindBy(xpath="(//button[contains(@name,'6007')])[1]")
	 WebElement AnyPhysicalDefect;
	 
	 @FindBy(xpath="//input[contains(@name,'6011')]")
	 WebElement EnterAnyPhysicalDefect;
	 
	 @FindBy(xpath="(//button[contains(@name,'6008')])[1]")
	 WebElement IsAwareOfAnyInformation;
	 
	 @FindBy(xpath="//input[contains(@name,'6012')]")
	 WebElement EnterAwareOfAnyinformation;
	 
	 @FindBy(xpath="(//button[contains(@name,'6009')])[1]")
	 WebElement HasAnyApplication;
	 
	 @FindBy(xpath="//input[contains(@name,'6013')]")
	 WebElement EnterHasAnyApplication;
	 
	 @FindBy(xpath="(//button[contains(@name,'6010')])[1]")
	 WebElement IsthereAnySpecific;
	 
	 @FindBy(xpath="//input[contains(@name,'6014')]")
	 WebElement EnterIsThereAnySpecific;
	 
	 @FindBy(xpath="//label[contains(text(),'Months')]//parent::div//input")
	 WebElement lifeInsuredMONTH;
	 
	 @FindBy(xpath="//label[contains(text(),'Years')]//parent::div//input")
	 WebElement lifeInsuredYEAR;


	 @FindBy(xpath="//input[contains(@type,'image')]")
	 WebElement image;

	 @FindBy(xpath="//span[contains(text(),'SAVE & CONTINUE')]")
	 WebElement SaveandConnue;
	 
	 @FindBy(xpath="//span[contains(text(),'OK')]")
	 WebElement okbutton;
	 
	  public void ClickOnCSEAlertOKButton() {
	       	
	       
	        if(okbutton.isDisplayed()) {
	        	okbutton.click();
	        	 Allure.step  ("Click on Alert Ok Button");
	        }else {
	        	 Allure.step  ("Alert Ok Button is not display ");
	        }
	    }
	 
	 public void ClickSaveAndContinueButtonIARweb() {
	      
	        if(SaveandConnue.isDisplayed()) {
	        	SaveandConnue.click();
	        	 Allure.step ("Click on Save And Continue Button");
	        }else {
	        	 Allure.step  ("Save And Continue Button is not Display");
	        }
	    }
	 
	 
	 public void ClickOnSearchImageBtn() {
		 
	     if(image.isDisplayed()) {
	    	 image.click();
	    	 Allure.step  ("Click on Top Right Logo");
	     }else {
	    	 Allure.step  ("Top Right Logo is not display ");
	     }
	 }
	 
	 
	    public void EnterLifeToBeINSUREDPROPOSERyeardWeb(String args) {
	    	
	        if(lifeInsuredYEAR.isDisplayed()) {
	        	lifeInsuredYEAR.sendKeys(args);
	        	 Allure.step  ("Enter  LIFE to be INSURED / PROPOSER YEAR As=====>"+args);
	        }else {
	        	 Allure.step  (" LIFE to be INSURED / PROPOSER  YAER Filed is not display ");
	        }
	    }

	    public void EnterLifeToBeINSUREDPROPOSERmonthWeb(String args) {

	        if(lifeInsuredMONTH.isDisplayed()) {
	        	lifeInsuredMONTH.sendKeys(args);
	        	 Allure.step  ("Enter  LIFE to be INSURED / PROPOSER MONTH As=====>"+args);
	        }else {
	        	 Allure.step  (" LIFE to be INSURED / PROPOSER MONTH Filed is not display ");
	        }
	    }

public void ClickOnHowDoyouKnowweb(String val) throws InterruptedException {
 	
	 
 	WebElement YesEle=getDriver().findElement(By.xpath("//div[contains(text(),'"+val+"')]"));
 	        
    if(YesEle.isDisplayed()) {
    	YesEle.click();
    	 Allure.step ( "Click on How do you know the LIFE to be INSURED / PROPOSER / NATURAL / REFERENCE MARKET Button As=====>"+val);
    }else {
    	
    }
 
} 
	 
	 
	 
	 
	 
	 
	   public void clickonHaveYouPersonallyMetNOWeb() {
		   wait.waitForElementToBeVisibleweb(getDriver(), selectplanWeb, 5,"time out to find element on page");
	        if (selectplanWeb.isDisplayed()) {
	            selectplanWeb.click();
	            Allure.step  ("Click on Have you personally met the life to be insured for this application NO Button");
	        } else {
	        	 Allure.step  ("Have you personally met the life to be insured for this application? NO Button is not display");

	        }
	    }
	   public void EnterHaveYouPersonallyMetWeb(String val) {
		   wait.waitForElementToBeVisibleweb(getDriver(), EnterHaveYouPersonallyMet, 5,"time out to find element on page");
	        if (EnterHaveYouPersonallyMet.isDisplayed()) {
	        	EnterHaveYouPersonallyMet.sendKeys(val);
	            Allure.step  ("Enter Values As====>"+val);
	        } else {
	        	 Allure.step  ("Please Specify textBox is Not Display");

	        }
	    }
	   public void clickonAreYouPersonallySatisfyNOWeb() {
		   wait.waitForElementToBeVisibleweb(getDriver(), PersonallySatisfy, 5,"time out to find element on page");
	        if (PersonallySatisfy.isDisplayed()) {
	        	PersonallySatisfy.click();
	            Allure.step  ("Click on Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer? NO Button");
	        } else {
	        	 Allure.step ("Are you personally satisfied about the financial standing and insurability of the life to be insured / proposer? NO Button is not display");

	        }
	    }
	   public void EnterAreYouPersonallySatisfyWeb(String val) {
		   wait.waitForElementToBeVisibleweb(getDriver(), EnterAreYouPersonallySatisfy, 5,"time out to find element on page");
	        if (EnterAreYouPersonallySatisfy.isDisplayed()) {
	        	EnterAreYouPersonallySatisfy.sendKeys(val);
	        	 Allure.step   ("Enter Values As====>"+val);
	        } else {
	        	 Allure.step   ("Please Specify textBox is Not Display");

	        }
	    }
	    public void EnterOtherHowDoyouKnowweb(String val) throws InterruptedException {
			   wait.waitForElementToBeVisibleweb(getDriver(), HowDoyouKnow, 5,"time out to find element on page");
			
			if (HowDoyouKnow.isDisplayed()) {
				HowDoyouKnow.sendKeys(val);
				 Allure.step  ("Enter Other Field As=====>" + val);
			} else {
				 Allure.step  ("Failed to verified other Field");
			}

		}
	    public void clickonIsThereAnyPhysicalDefectWeb() {
			   wait.waitForElementToBeVisibleweb(getDriver(), AnyPhysicalDefect, 5,"time out to find element on page");
	        if (AnyPhysicalDefect.isDisplayed()) {
	        	AnyPhysicalDefect.click();
	        	 Allure.step  ("Click on Is there any physical defects, impairment, deformities and / or any condition affecting mobility, sight and / or hearing? YES Button");
	        } else {
	        	 Allure.step   ("Is there any physical defects, impairment, deformities and / or any condition affecting mobility, sight and / or hearing? YES Button is not display");

	        }
	    }
	    public void EnterIsThereAnyPhysicalDefectweb(String val) throws InterruptedException {
			   wait.waitForElementToBeVisibleweb(getDriver(), EnterAnyPhysicalDefect, 5,"time out to find element on page");
			
			if (EnterAnyPhysicalDefect.isDisplayed()) {
				EnterAnyPhysicalDefect.sendKeys(val);
				 Allure.step   ("Enter Values  As=====>" + val);
			} else {
				 Allure.step   ("Please Specify textField Is Not Display");
			}

		}
	    public void clickonIsAwareOfAnyInformationWeb() {
			   wait.waitForElementToBeVisibleweb(getDriver(), IsAwareOfAnyInformation, 5,"time out to find element on page");
	        if (IsAwareOfAnyInformation.isDisplayed()) {
	        	IsAwareOfAnyInformation.click();
	        	 Allure.step  ("Click on Are you aware of any information that would have an adverse effect on insurability? YES Button");
	        } else {
	        	 Allure.step   ("Are you aware of any information that would have an adverse effect on insurability? YES Button is not display");

	        }
	    }
	    public void EnterAreYouAwareOfAnyinformationweb(String val) throws InterruptedException {
			   wait.waitForElementToBeVisibleweb(getDriver(), EnterAwareOfAnyinformation, 5,"time out to find element on page");
			
			if (EnterAwareOfAnyinformation.isDisplayed()) {
				EnterAwareOfAnyinformation.sendKeys(val);
				 Allure.step   ("Enter Values  As=====>" + val);
			} else {
				 Allure.step   ("Please Specify textField Is Not Display");
			}

		}
	    public void clickonHasAnyApplicationWeb() {
			   wait.waitForElementToBeVisibleweb(getDriver(), HasAnyApplication, 5,"time out to find element on page");
	        if (HasAnyApplication.isDisplayed()) {
	        	HasAnyApplication.click();
	        	 Allure.step   ("Click on Has any application or revival of Life / Health insurance on the proposed life ever been Declined / Deffered / Postponed / Accepted at special terms? YES Button");
	        } else {
	        	 Allure.step ("Has any application or revival of Life / Health insurance on the proposed life ever been Declined / Deffered / Postponed / Accepted at special terms? YES Button is not display");

	        }
	    }
	    public void EnterHasAnyApplicationweb(String val) throws InterruptedException {
			   wait.waitForElementToBeVisibleweb(getDriver(), EnterHasAnyApplication, 5,"time out to find element on page");
			
			if (EnterHasAnyApplication.isDisplayed()) {
				EnterHasAnyApplication.sendKeys(val);
				 Allure.step   ("Enter Values  As=====>" + val);
			} else {
				 Allure.step  ("Please Specify textField Is Not Display");
			}

		}
	    public void clickonIsthereAnySpecificWeb() {
			   wait.waitForElementToBeVisibleweb(getDriver(), IsthereAnySpecific, 5,"time out to find element on page");
	        if (IsthereAnySpecific.isDisplayed()) {
	        	IsthereAnySpecific.click();
	        	 Allure.step  ("Click on Is there any ‘Specific Suspicious Activity’ observed / reported? YES Button");
	        } else {
	        	 Allure.step  ("Is there any ‘Specific Suspicious Activity’ observed / reported? YES Button is not display");

	        }
	    }
	    public void EnterIsThereAnySpecificweb(String val) throws InterruptedException {
			   wait.waitForElementToBeVisibleweb(getDriver(), EnterIsThereAnySpecific, 5,"time out to find element on page");
		
			if (EnterIsThereAnySpecific.isDisplayed()) {
				EnterIsThereAnySpecific.sendKeys(val);
				 Allure.step   ("Enter Values  As=====>" + val);
			} else {
				 Allure.step  ("Please Specify textField Is Not Display");
			}

		}
	 
	 
	 
}
