package com.absli.scripts;

import Utils.*;

import com.absli.TestFactory.GotoEndtoEnd.EndToEndProSameJourney;
import com.absli.TestFactory.GotoEndtoEnd.GoToPSMpageJourney;
import com.absli.TestFactory.ViewQuote.ViewQuoteTestFactory;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.modules.AddressModule;
import com.absli.modules.BankDetailsModule;
import com.absli.modules.ContactInfoModule;
import com.absli.modules.CustomerPhotoModule;
import com.absli.modules.CustomerProfileModule;
import com.absli.modules.DocumentsModule;
import com.absli.modules.HealthInfoModule;
import com.absli.modules.NRIMandateModule;
import com.absli.modules.NomineeModule;
import com.absli.modules.PaymentModule;
import com.absli.modules.PersonalInfoModule;
import com.absli.modules.ReviewAndAcceptanceModule;
import com.absli.modules.e_CDFModule;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class EndtoEndProposerSame extends TestBase {


	// ===================Proposer Same Scenario==========================//

	
	public static void CompletesameScenarioJourney(HashMap<String, String> testData) throws Exception {

		
		
     new SelectChannel_TestFactory().Select_Channel( testData);
     
     switch (testData.get("ChannelName")) {

		
		case "BOM":
     
			new CustomerProfileModule().CustomerProfilemodule(testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new ContactInfoModule().ContactInfomodule(testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new CustomerPhotoModule().CustomerPhotomodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new PersonalInfoModule().PersonalInfomodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new AddressModule().Addressmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new NomineeModule().Nomineemodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new HealthInfoModule().HealthInfomodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(testData.get("IsNRI").equalsIgnoreCase("YES")) {
				new NRIMandateModule().NRIMandatemodule(getDriver(),testData);
			}
			new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new PaymentModule().Paymentmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new e_CDFModule().e_CDFmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new DocumentsModule().Documentsmodule(getDriver(),testData);
			break;
			
	

	case "DBS":
	      
		new CustomerProfileModule().CustomerProfilemodule(testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new ContactInfoModule().ContactInfomodule(testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new CustomerPhotoModule().CustomerPhotomodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new AddressModule().Addressmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new PaymentModule().Paymentmodule(getDriver(),testData);                //incomplet
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new NomineeModule().Nomineemodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new PersonalInfoModule().PersonalInfomodule_DBS(getDriver(),testData);//change
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new HealthInfoModule().HealthInfomodule(getDriver(),testData);
		if(testData.get("IsNRI").equalsIgnoreCase("YES")) {
			new NRIMandateModule().NRIMandatemodule(getDriver(),testData);
		}
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new DocumentsModule().Documentsmodule(getDriver(),testData);
	
		break;
		
	case "DCB":
	      
		new CustomerProfileModule().CustomerProfilemodule_DCB(testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new ContactInfoModule().ContactInfomodule(testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new CustomerPhotoModule().CustomerPhotomodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new PersonalInfoModule().PersonalInfomodule(getDriver(),testData);//change
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new AddressModule().Addressmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new NomineeModule().Nomineemodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new HealthInfoModule().HealthInfomodule(getDriver(),testData);
		if(testData.get("IsNRI").equalsIgnoreCase("YES")) {
			new NRIMandateModule().NRIMandatemodule(getDriver(),testData);
		}
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new PaymentModule().Paymentmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new e_CDFModule().e_CDFmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new DocumentsModule().Documentsmodule(getDriver(),testData);
		break;
		
	case "AXIS"://hold
	      
		new CustomerProfileModule().CustomerProfilemodule_AXIS(testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new e_CDFModule().e_CDFmodule(getDriver(),testData);//This is seller declearation page
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new ContactInfoModule().ContactInfomodule(testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new PersonalInfoModule().PersonalInfomodule(getDriver(),testData);
//		new CustomerPhotoModule().CustomerPhotomodule(getDriver(),testData);
//		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new AddressModule().Addressmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new NomineeModule().Nomineemodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new HealthInfoModule().HealthInfomodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new PaymentModule().Paymentmodule(getDriver(),testData);
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		new DocumentsModule().Documentsmodule(getDriver(),testData);
		break;
		
		
}
     
     
     
     
     
     
	}
	
}
