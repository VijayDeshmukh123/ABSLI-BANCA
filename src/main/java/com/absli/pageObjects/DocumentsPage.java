package com.absli.pageObjects;
import com.absli.base.BasePage;
import com.absli.base.ExtentFactory;
import com.absli.base.TestBase;
import com.absli.utils.WaitUtils;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DocumentsPage extends TestBase {

    public WebDriver driver;
    public WaitUtils wait;

    public DocumentsPage(WebDriver driver) {PageFactory.initElements(getDriver(), this);}

    @FindBy(xpath = "//span[contains(text(),'Identity Proof')]")
    private WebElement identityBTN;
    @FindBy(xpath = "//div[@aria-haspopup='listbox']")
    private WebElement SelectType;
    @FindBy(xpath = "//span[contains(text(),'NEXT')]")
    private WebElement NEXTBTN;
    @FindBy(xpath = "//button[@name='Save & Continue']")
    private WebElement SaveContinueBTN;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement SelectValUploadFileweb;

    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement DocSumit;
    
    @FindBy(xpath = "//div[contains(text(),'CANCELLED CHEQUE FOR NEFT')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement ChequeNFET;
    
    
    @FindBy(xpath = "(//div[contains(text(),'Photograph')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]")
    private WebElement ProPhoto;
    
    @FindBy(xpath = "(//div[contains(text(),'Photograph')]//parent::p//parent::div//parent::div/following-sibling::div//input)[2]")
    private WebElement insPhoto;
    
    @FindBy(xpath = "//div[contains(text(),'PEP Questionnaire')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement PEPQuestionnair;
    
    @FindBy(xpath = "//div[contains(text(),'Financial Transaction Form')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement FINANCIALTRANSACTIONFORMweb;
    
    
    @FindBy(xpath = "//div[contains(text(),'Financial justication endorsed by BH')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement finacialJ;
    
    
    @FindBy(xpath = "//div[contains(text(),'passport copy of pages (Entry and Exit details) for Proposer')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement PCOPproposer;
    
    @FindBy(xpath = "//div[contains(text(),'passport copy of pages (Entry and Exit details) for Life to be Insured')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement PCOPinsured;
    
    
    @FindBy(xpath = "//div[contains(text(),'Income Proof required')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement IncomeProof;
    
    @FindBy(xpath = "//div[contains(text(),'Bank statement showing Vintage Relationship')]//parent::p//parent::div//parent::div/following-sibling::div//input")
    private WebElement BANKSTATEMENTweb;
    
    
    
    
    
    public void BANKSTATEMENTweb() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), BANKSTATEMENTweb, 20, "Element is Not Display");
	      
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	BANKSTATEMENTweb.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
    	
    }
  
    
    public void FINANCIALTRANSACTIONFORMweb() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), FINANCIALTRANSACTIONFORMweb, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	FINANCIALTRANSACTIONFORMweb.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
     	
     }
   
	 public void UploadNonMedicalCustomerDeclarationFormProposerNotInsuredweb() throws InterruptedException{
		
      	 WebElement SelectVal= getDriver().findElement(By.xpath("//div[contains(text(),'Customer Declaration Form')]//parent::p//parent::div//parent::div/following-sibling::div//input"));
      	 wait.waitForElementToBeVisibleweb(getDriver(), FINANCIALTRANSACTIONFORMweb, 20, "Element is Not Display");
      	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
      		 SelectVal.sendKeys(destination);
      		
      }
	 public void UploadNonMedicalNEFTCancelChequeProposerNotInsuredweb() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), ChequeNFET, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	ChequeNFET.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }
	 
	 public void UploadNonMedicalPhotograph() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), ProPhoto, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	ProPhoto.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }

	 public void UploadNonMedicalInsuredPhotograph() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), insPhoto, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	insPhoto.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }
		public void UploadNonMedicalPEPQuestionnaireweb() throws InterruptedException {
			
			
			wait.waitForElementToBeVisibleweb(getDriver(), PEPQuestionnair, 20, "Element is Not Display");
	      
	        	String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
				Thread.sleep(1000);
				PEPQuestionnair.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
			
		}
    
    
    
    
    
    public void clickOnIdentityTileweb() {

        wait.waitForElementToBeVisibleweb(getDriver(), identityBTN, 20, "Element is Not Display");
        if (identityBTN.isDisplayed()) {
            identityBTN.click();
            Allure.step("Click On Identity Proof Tile ");
        } else {
            System.out.println("Identity Proof Tile is not display ");
        }
    }

    public void SelectTypeOfDocumentweb(String val) throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), SelectType, 20, "Element is Not Display");
        try {
            SelectType.click();
            WebElement SelectVal = getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
            wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 20, "Element is Not Display");
            SelectVal.click();
            Allure.step("Select Values As=====>" + val);
        }
        catch (Exception e){
            WebElement SelectVal = getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
            wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 20, "Element is Not Display");
            JavascriptExecutor js = (JavascriptExecutor) BasePage.getDriver();

            js.executeScript("arguments[0].click();", SelectVal);
            System.out.println("Address card waived off");
        }

    }
    public void UploadFileweb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), SelectValUploadFileweb, 10, "Element is Not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        //  wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 30, "Element is Not Display");
        try {
            //  if (SelectVal.isEnabled()) {
            SelectValUploadFileweb.sendKeys(destination);
            Allure.step("Successfully Uploaded File");
        }
        catch
        (Exception e) {
            System.out.println("Address card waived off");
        }
    }

    public void clickOnSumbitweb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), DocSumit, 20, "Element is Not Display");
        if (DocSumit.isDisplayed()) {
        	DocSumit.click();
            Allure.step("Click On Submit Button ");
        } else {
            System.out.println("Submit Button  is not display ");
        }
    }

    public void clickOnNEXTButtonweb() throws InterruptedException {
        wait.waitForElementToBeVisibleweb(getDriver(), NEXTBTN, 20, "Element is Not Display");
        if (NEXTBTN.isDisplayed()) {
            NEXTBTN.click();
            Allure.step("Click On Next Button ");
        } else {
            System.out.println("Next Button  is not display ");
        }
    }
    public void UploadNonMedicalNEFTCancelweb() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'CANCELLED CHEQUE FOR NEFT')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        SelectVal.sendKeys(destination);
        Allure.step("Successfully Uploaded NEFT Cancelled Cheque File");
    }
    public void UploadNonMedicalSignedCopyweb() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'Signed copy of Profiler')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        SelectVal.sendKeys(destination);
        Allure.step("Successfully Uploaded Signed Copy");
    }

    public void UploadNonMedicalPHOTOGRAPHProposerNotInsuredweb() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'Photograph')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        wait.WaitTime(2);
        SelectVal.sendKeys(destination);
        Allure.step("Successfully Uploaded PHOTOGRAPH File");
    }
    public void UploadNonMedicalFinancialProposerNotInsuredweb() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'Financial justication endorsed by BH')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        wait.WaitTime(2);
        SelectVal.sendKeys(destination);
        Allure.step("Successfully Uploaded PHOTOGRAPH File");
    }

    public void UploadNonMedicalPremiumProposerNotInsuredweb() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'HDFC premium exception approval')]//parent::p//parent::div//parent::div/following-sibling::div//input)[2]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        wait.WaitTime(2);
        SelectVal.sendKeys(destination);
        Allure.step("Successfully Uploaded PHOTOGRAPH File");
    }

    public void UploadNonMedicalPHOTOGRAPHPInsuredweb() throws InterruptedException { //    (//div[contains(text(),'Photograph')]//parent::p//parent::div//parent::div/following-sibling::div//input)[2]
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'Photograph')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        wait.WaitTime(2);
        SelectVal.sendKeys(destination);
        Allure.step("Successfully Uploaded PHOTOGRAPH File");

    }
    public void UploadNonMedicalStatementInsuredweb() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//div[contains(text(),'Bank statement showing Vintage Relationship')]//parent::p//parent::div//parent::div/following-sibling::div//input)[1]"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 0, "Element is not Display");
        String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
        wait.WaitTime(2);
        SelectVal.sendKeys(destination);
        Allure.step( "Successfully Uploaded PHOTOGRAPH File");

    }
    public void SelectTypeOfDocumentPanCard(String val) throws InterruptedException {
        WebElement SelectType = getDriver().findElement(By.xpath("//div[@aria-haspopup='listbox']"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectType, 20, "Element is Not Display");
        try {
            SelectType.click();
            Allure.step("Click On Select Type of document DropDown");
            wait.WaitTime(2);
            try {
                WebElement SelectVal = getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
                WaitUtils.waitForElementToBeVisibleweb(getDriver(),SelectVal,30,"unable to locate element");
                SelectVal.click();
                Allure.step("Select Values As=====>" + val);
            }catch (Exception e){
                WebElement SelectVal = getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
                WaitUtils.waitForElementToBeVisibleweb(getDriver(),SelectVal,30,"unable to locate element");
                //SelectVal.click();
                JavascriptExecutor js = (JavascriptExecutor) BasePage.getDriver();

                js.executeScript("arguments[0].click();", SelectVal);
                Allure.step("Select Values As=====>" + val);
            }

        }
        catch (Exception e){
            System.out.println("PAN card is waived off ");
        }
    }
    public void SelectTypeOfDocumentIncomePrrofweb(String val) throws InterruptedException {
        WebElement SelectType = getDriver().findElement(By.xpath("//div[@aria-haspopup='listbox']"));
        wait.waitforElementToBeClickable(getDriver(), SelectType, 20);
        SelectType.click();
        ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On Select Type of document DropDown");
        wait.WaitTime(2);
        try{
            WebElement SelectVal=getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),SelectVal,30,"unable to locate element");
            SelectVal.click();
            Allure.step("Select Values As=====>" + val);
        }catch (Exception e){
            WebElement SelectVal=getDriver().findElement(By.xpath("//ul/li/div/span[text()='"+val+"']"));
            WaitUtils.waitForElementToBeVisibleweb(getDriver(),SelectVal,30,"unable to locate element");
            //SelectVal.click();
            JavascriptExecutor js = (JavascriptExecutor) BasePage.getDriver();

            js.executeScript("arguments[0].click();", SelectVal);
            Allure.step("Select Values As=====>" + val);
        }

    }

    public void SelectTypeOfDocumentAgePrrofweb(String val) throws InterruptedException {
        WebElement SelectTypeprop = getDriver().findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]"));
        wait.waitforElementToBeClickable(getDriver(), SelectTypeprop, 20);
        try {
            SelectTypeprop.click();
            Allure.step("Click On Select Type of document DropDown");
            wait.WaitTime(2);

            WebElement SelectVal = getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
            SelectVal.click();
            Allure.step("Select Values As=====>" + val);
        }
        catch (Exception E)
        {
            System.out.println("Address proof is waived off ");
        }
    }

    public void SelectTypeOfDocumentinsuAgePrrofweb(String val) throws InterruptedException {
        WebElement SelectTypeinsu = getDriver().findElement(By.xpath("//div[@aria-haspopup='listbox']"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectTypeinsu, 20, "Element is Not Display");
        try {
            SelectTypeinsu.click();
            Allure.step("Click On Select Type of document DropDown");
            wait.WaitTime(2);
            WebElement SelectVal = getDriver().findElement(By.xpath("//ul/li/div/span[starts-with(text(),'"+val+"')]"));
            SelectVal.click();
            Allure.step("Select Values As=====>" + val);
        }
        catch (Exception e)
        {
            System.out.println("Address proof is waived off ");
        }
    }

    public void UploadFilewebinsuage() throws InterruptedException {
        WebElement SelectVal = getDriver().findElement(By.xpath("(//input[@type='file'])"));
        wait.waitForElementToBeVisibleweb(getDriver(), SelectVal, 20, "Element is Not Display");
        try {
            String destination = System.getProperty("user.dir") + "/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
            if (SelectVal.isDisplayed()) {
                SelectVal.sendKeys(destination);
                Allure.step("Successfully Uploaded File");
            } else {
                SelectVal.sendKeys(destination);
                System.out.println("Successfully Uploaded File");
            }
        } catch (Exception e) {
            System.out.println("Address proof is waived off ");
        }
    }
    public void clickOnSaveContinueButton() throws InterruptedException {

        wait.waitForElementToBeVisibleweb(getDriver(), SaveContinueBTN, 20, "Element is Not Display");
        if (SaveContinueBTN.isDisplayed()) {
            SaveContinueBTN.click();
            Allure.step("Click On Save and continue button");
        } else {
            System.out.println( "Save and continue button is not display ");
        }

    }
    //=============================
    
    public void clickOnAddressProofTileweb() throws InterruptedException {
        WebElement identityBTN=getDriver().findElement(By.xpath("//span[contains(text(),'Address Proof')]"));
        wait.waitForElementToBeVisibleweb(getDriver(), identityBTN, 20, "Element is Not Display");
        if(identityBTN.isDisplayed()) {
        	identityBTN.click();
           //// ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On Address Proof Tile ");
        }else {
        	ExtentFactory.getInstance().getExtent().log(Status.INFO, "Address Proof Tile is not display ");
        }
    }
    
    public void SelectTypeOfDocumentPermant(String val) throws InterruptedException {
		WebElement SelectType = getDriver().findElement(By.xpath("(//div[@aria-haspopup='listbox'])"));
		//wait.waitforElementToBeClickable(WebDriverFactoryStaticThreadLocal.getDriver(), SelectType, 20);
		SelectType.click();
		Thread.sleep(2000);
		ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On Select Type of document DropDown");

		WebElement SelectVal = getDriver()
				.findElement(By.xpath("//ul//li//span[contains(text(),'" + val + "')]"));
		//wait.waitforElementToBeClickable(WebDriverFactoryStaticThreadLocal.getDriver(), SelectVal, 20);
		Thread.sleep(2000);
		SelectVal.click();
		ExtentFactory.getInstance().getExtent().log(Status.INFO, "Select Values As=====>" + val);

	}
    
    
    public void UploadFilepermant() throws InterruptedException {
    	
  	  
    	//String   serverValue=  prop.getProperties("Server");

    
    	 WebElement SelectVal=getDriver().findElement(By.xpath("(//input[@type='file'])[2]"));
    	 //wait.waitForElementToBeVisibleweb(WebDriverFactoryStaticThreadLocal.getDriver(), SelectVal, 20, "Element is Not Display");
    	 String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
    	 SelectVal.sendKeys(destination);
    	 
    	
    	  
       
    }
    
    public void clickOnECSMAndateTileweb() throws InterruptedException {
        WebElement identityBTN=getDriver().findElement(By.xpath("//span[contains(text(),'ECS Mandate')]"));
      //  wait.waitForElementToBeVisibleweb(WebDriverFactoryStaticThreadLocal.getDriver(), identityBTN, 20, "Element is Not Display");
        if(identityBTN.isDisplayed()) {
        	identityBTN.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On ECS  Tile ");
        }else {
        	ExtentFactory.getInstance().getExtent().log(Status.INFO, "ECS Tile is not display ");
        }
    }
    
    public void clickOnENACHRegistrationTileweb() throws InterruptedException {
        WebElement identityBTN=getDriver().findElement(By.xpath("//span[contains(text(),'E-NACH Registration')]"));
       // wait.waitForElementToBeVisibleweb(WebDriverFactoryStaticThreadLocal.getDriver(), identityBTN, 20, "Element is Not Display");
        if(identityBTN.isDisplayed()) {
        	identityBTN.click();
           //// ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click On Income Proof Tile ");
        }else {
        	ExtentFactory.getInstance().getExtent().log(Status.INFO, "Income Proof Tile is not display ");
        }
    }
    
  
  public void ClickOnCSEAlertOKButton() {
       	
        WebElement SearchBTN=getDriver().findElement(By.xpath("//span[contains(text(),'OK')]"));
       // wait.waitforElementToBeClickable(WebDriverFactoryStaticThreadLocal.getDriver(), SearchBTN, 30);
        if(SearchBTN.isDisplayed()) {
        	SearchBTN.click();
            ExtentFactory.getInstance().getExtent().log(Status.INFO, "Click on Alert Ok Button");
        }else {
        	ExtentFactory.getInstance().getExtent().log(Status.FAIL, "Alert Ok Button is not display ");
        }
    }

	 public void UploadNonMedicalForm60ProposerNotInsuredweb() throws InterruptedException {
		
      	 WebElement SelectVal= getDriver().findElement(By.xpath("//div[contains(text(),'FORM60')]//parent::p//parent::div//parent::div/following-sibling::div//input"));
      	//wait.waitForElementToBeVisibleweb( WebDriverFactoryStaticThreadLocal.getDriver(), SelectVal, 0, "Element is not Display");
      	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
      		 SelectVal.sendKeys(destination);
      		ExtentFactory.getInstance().getExtent().log(Status.INFO, "Successfully Uploaded Form 60  File");
      	
         
	 }
	 
	 public void UploadNonMedicalFinacialJustcationweb() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), finacialJ, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	finacialJ.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }
	 
	 public void UploadNonMedicalProposerPassportCopyProposer() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), PCOPproposer, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	PCOPproposer.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }
	 
	 public void UploadNonMedicalProposerPassportCopyProposerInsured() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), PCOPinsured, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	PCOPinsured.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }
	 
	 public void UploadNonMedicalIncomeProof() throws InterruptedException{
		 wait.waitForElementToBeVisibleweb(getDriver(), ProPhoto, 20, "Element is Not Display");
	       
	        	String destination= System.getProperty("user.dir")+"/FileUpload/SRIDEVI_PARVATIKAR_DigiShield.pdf";
	        	ProPhoto.sendKeys(destination);
	            Allure.step("Click On Identity Proof Tile ");
	       
      	
      }
}