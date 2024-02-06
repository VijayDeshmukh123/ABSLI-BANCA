package com.absli.pageObjects;

import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dashboard extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;


    public Dashboard(WebDriver driver)
    {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(@name,'LOGIN')]")
    private WebElement loader;
//=============================VIJAY=====================================
    @FindBy(xpath = "//span[text()='YES']")
    private WebElement yesbtn;
    
    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
    private WebElement NRIDrpdown;
    
    @FindBy(xpath = "//input[contains(@id,'nriCountry')]")
    private WebElement ele1;
    
    @FindBy(xpath = "//div[text()='NEW APPLICATION']")
    private WebElement newCustomerBtn;
    
    public void waitforButtonDisappearWeb() throws InterruptedException {
        try {

            wait.VerifyloadingWait();
        } catch (NoSuchElementException e) {
            System.out.println("Loading Is Not Display");
        }

    }

    public void checkLoaderWeb() throws InterruptedException {
        try {

            wait.VerifyloadingWait();
            Thread.sleep(2000);

        } catch (NoSuchElementException e) {
            System.out.println("Loading Is Not Display");
        }

    }
    public void clickNewCustomerButton(){
       
        wait.waitForElementToBeVisibleweb(getDriver(), newCustomerBtn, 30, "Element is Not Visible");
        if(newCustomerBtn.isDisplayed()){
            newCustomerBtn.click();
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On New Customer Button");
        }else {
        	 ExtentFactory.getInstance().getExtent().log(Status.FAIL, "New Customer Button is Not Display");
        }
    }

//    public void verifyLoaderWeb() throws InterruptedException {
//
//        WebElement Loading=getDriver().findElement(By.xpath("//img[contains(@style,'padding: 1.5rem;')]"));
//            if (Loading.isDisplayed()) {
//                WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
//                wait.until(ExpectedConditions.invisibilityOf(Loading)); // wait for loader to disappear
//            }
//           else {
//               System.out.println("Loading Element is not display");
//        }
//    }

//    public void checkLoaderWeb() throws InterruptedException {
//        try {
//            WebElement loader = getDriver().findElement(By.xpath("//img[contains(@style,'padding: 1.5rem;')]"));
//            WaitUtils.loadingWait(getDriver());
//        } catch (NoSuchElementException e) {
//            System.out.println("Loading Is Not Display");
//        }
//    }

//======================NETBANKING CODE DONE BY VIJAY======================
    
    
    
    public void ClickOnYesBtnWeb(){
      
        if(yesbtn.isDisplayed()){
        yesbtn.click();
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On NRI Yes Button");
        }else {
       ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Yes Button Is Not Display");
        }
    }
    public void selectTypeOfNRIWeb(String TypeOfNRI){
        
        NRIDrpdown.click();
        WebElement NRIOpt= getDriver().findElement(By.xpath("//span[text()='"+TypeOfNRI+"']"));
        //waitUtils.waitforElementToBeClickable(WebDriverFactoryStaticThreadLocal.getDriver(), NRIOpt, 100);
        NRIOpt.click();
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select NRI Option  As=====>"+TypeOfNRI);
    }
   public void SelectNRICountryWeb(String val) throws InterruptedException {
	  
       if(ele1.isDisplayed()) {
    	   ele1.sendKeys(val);
    	   Thread.sleep(2000);
    	   ele1.sendKeys(Keys.ARROW_DOWN);
    	   ele1.sendKeys(Keys.ARROW_DOWN);
    	   ele1.sendKeys(Keys.ENTER);
    	   ExtentFactory.getInstance().getExtent().log(Status.INFO, "Enter NRI Country Values As=====>"+val);
       }else {
    	   ExtentFactory.getInstance().getExtent().log(Status.FAIL, "NRI Country TextBox Is Not Display");
       }
	
}










}
