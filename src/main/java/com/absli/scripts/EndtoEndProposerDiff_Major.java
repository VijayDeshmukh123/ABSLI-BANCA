package com.absli.scripts;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import com.absli.Major_Diff_modules.ContactInfo_ProDiff_Module;
import com.absli.Major_Diff_modules.CustomerPhoto_ProDiff_Module;
import com.absli.Major_Diff_modules.CustomerProfileMajor_MinorModule;
import com.absli.Major_Diff_modules.Documents_ProDiff_Module;
import com.absli.Major_Diff_modules.HealthInfo_ProDiff_Module;
import com.absli.Major_Diff_modules.PersonalInfo_ProDiff_Module;
import com.absli.Minor_modules.NRIMandate_Major_Minor_Module;
import com.absli.TestFactory.ViewQuote.ViewQuoteTestFactory;
import com.absli.base.TestBase;
import com.absli.modules.AddressModule;
import com.absli.modules.BankDetailsModule;
import com.absli.modules.ContactInfoModule;
import com.absli.modules.CustomerPhotoModule;
import com.absli.modules.CustomerProfileModule;
import com.absli.modules.DocumentsModule;
import com.absli.modules.HealthInfoModule;
import com.absli.modules.NomineeModule;
import com.absli.modules.PaymentModule;
import com.absli.modules.PersonalInfoModule;
import com.absli.modules.ReviewAndAcceptanceModule;
import com.absli.modules.e_CDFModule;

import Utils.SelectChannel_TestFactory;

public class EndtoEndProposerDiff_Major extends TestBase {

	
	public static void CompleteMajorScenarioJourney(HashMap<String, String> testData) throws Exception {


		
	     new SelectChannel_TestFactory().Select_Channel( testData);
	     
	     switch (testData.get("ChannelName")) {

			
			case "BOM":
	     
				new CustomerProfileMajor_MinorModule().CustomerProfileMajor_Minormodule(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				new ContactInfo_ProDiff_Module().ContactInfo_ProDiff_module(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				new PersonalInfo_ProDiff_Module().PersonalInfo_ProDiff_module(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				new AddressModule().Addressmodule(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				new HealthInfoModule().HealthInfomodule(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				if(testData.get("IsNRI").equalsIgnoreCase("YES")) {
					new NRIMandate_Major_Minor_Module().NRIMandate_Major_Minor_module(getDriver(),testData);
				}
				new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				new PaymentModule().Paymentmodule(getDriver(),testData);
				new e_CDFModule().e_CDFmodule(getDriver(),testData);
				getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				new Documents_ProDiff_Module().Documents_ProDiff_module(getDriver(),testData);
//				new CustomerPhoto_ProDiff_Module().CustomerPhoto_ProDiff_module(getDriver(),testData);
//				getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				
				break;
				
		

		case "DBS":
		      
			new CustomerProfileMajor_MinorModule().CustomerProfileMajor_Minormodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new ContactInfo_ProDiff_Module().ContactInfo_ProDiff_module(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new CustomerPhoto_ProDiff_Module().CustomerPhoto_ProDiff_module(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new AddressModule().Addressmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new PaymentModule().Paymentmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new PersonalInfo_ProDiff_Module().PersonalInfo_ProDiff_module_DBS(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new HealthInfoModule().HealthInfomodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(testData.get("IsNRI").equalsIgnoreCase("YES")) {
				new NRIMandate_Major_Minor_Module().NRIMandate_Major_Minor_module(getDriver(),testData);
			}
			new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new Documents_ProDiff_Module().Documents_ProDiff_module(getDriver(),testData);
		
			break;
			
		case "DCB":
		      
			new CustomerProfileMajor_MinorModule().CustomerProfileMajor_Minormodule_DCB(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new ViewQuoteTestFactory().Select_ProductTestFactory(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new ContactInfo_ProDiff_Module().ContactInfo_ProDiff_module(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new BankDetailsModule().BankDetailsmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new PersonalInfo_ProDiff_Module().PersonalInfo_ProDiff_module_DCB(getDriver(),testData);//CHANGE
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new AddressModule().Addressmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			new HealthInfoModule().HealthInfomodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(testData.get("IsNRI").equalsIgnoreCase("YES")) {
				new NRIMandate_Major_Minor_Module().NRIMandate_Major_Minor_module(getDriver(),testData);
			}
			new ReviewAndAcceptanceModule().ReviewAndAcceptancemodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new PaymentModule().Paymentmodule(getDriver(),testData);
			new e_CDFModule().e_CDFmodule(getDriver(),testData);
			getDriver().manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			new Documents_ProDiff_Module().Documents_ProDiff_module(getDriver(),testData);
			break;
			
		case "Axis":
		      
			
			break;
			
			
	}
	     
	     
	}
}
