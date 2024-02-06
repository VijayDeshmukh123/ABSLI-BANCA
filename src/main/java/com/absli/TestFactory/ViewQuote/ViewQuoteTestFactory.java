package com.absli.TestFactory.ViewQuote;

import static com.absli.base.BasePage.getDriver;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.absli.TestFactory.Products.ViewQuoteFactoryAIP;
import com.absli.TestFactory.Products.ViewQuoteFactoryASK;
import com.absli.TestFactory.Products.ViewQuoteFactoryASP;
import com.absli.TestFactory.Products.ViewQuoteFactoryAkshaya;
import com.absli.TestFactory.Products.ViewQuoteFactoryAssure_Plus;
import com.absli.TestFactory.Products.ViewQuoteFactoryAssured_flexi;
import com.absli.TestFactory.Products.ViewQuoteFactoryChild_future;
import com.absli.TestFactory.Products.ViewQuoteFactoryCriti;
import com.absli.TestFactory.Products.ViewQuoteFactoryDigi;
import com.absli.TestFactory.Products.ViewQuoteFactoryFMP;
import com.absli.TestFactory.Products.ViewQuoteFactoryFortune;
import com.absli.TestFactory.Products.ViewQuoteFactoryGMS;
import com.absli.TestFactory.Products.ViewQuoteFactoryN_Ayush;
import com.absli.TestFactory.Products.ViewQuoteFactoryN_Laabh;
import com.absli.TestFactory.Products.ViewQuoteFactoryN_Pension;
import com.absli.TestFactory.Products.ViewQuoteFactoryPSK;
import com.absli.TestFactory.Products.ViewQuoteFactoryPlatinum;
import com.absli.TestFactory.Products.ViewQuoteFactorySalaried;
import com.absli.TestFactory.Products.ViewQuoteFactoryVision_Endo;
import com.absli.TestFactory.Products.ViewQuoteFactoryVision_lifeincome;
import com.absli.TestFactory.Products.ViewQuoteFactoryVision_lifeincomeplus;
import com.absli.TestFactory.Products.ViewQuoteFactoryVision_star;
import com.absli.TestFactory.Products.ViewQuoteFactoryWealth_Max;
import com.absli.TestFactory.Products.ViewQuoteFactoryWealth_aspire;
import com.absli.TestFactory.Products.ViewQuoteFactoryWealth_infinia;
import com.absli.TestFactory.Products.ViewQuoteFactoryWealth_secure;
import com.absli.pageObjects.Dashboard;
import com.absli.pageObjects.HealthAndPureTermsPage;
import com.absli.pageObjects.LoginPage;
import com.absli.pageObjects.ViewQuote;
import com.absli.utils.PropertiesUtils;
import com.absli.utils.WaitUtils;

import Utils.TestUtil;

public class ViewQuoteTestFactory {
	Dashboard dashboard;
	WaitUtils wait;
	LoginPage loginPage;
	ViewQuote viewquote;

	public static PropertiesUtils prop;
	SoftAssert softassert;
	HealthAndPureTermsPage healthandpuretermspage;

	//------------------------------------------------------View Quote Page---------------------------------------//
	public void Select_ProductTestFactory(WebDriver driver, HashMap<String, String> testData) throws InterruptedException, IOException, ParseException {

		dashboard = new Dashboard(getDriver());
		viewquote = new ViewQuote(getDriver());
		prop = new PropertiesUtils();
		softassert = new SoftAssert();
		healthandpuretermspage = new HealthAndPureTermsPage(getDriver());
		//dashboard.checkLoaderWeb();


		switch (testData.get("ChannelName")) {

		case "AXIS":
			// PSM Page
			wait.WaitTime2();
				System.out.println("User Navigate to Direct View qoute page");
			break;
		 //2)
			case "DBS":
				// PSM Page
				wait.WaitTime2();
				dashboard.checkLoaderWeb();
				healthandpuretermspage.selectPlanJourneyRecommendPlansWeb(testData.get("PlanSelectionJourney"));
				wait.WaitTime2();
				dashboard.checkLoaderWeb();
				healthandpuretermspage.SelectRecommendedPlanList(testData.get("SelectPlan"));
				dashboard.checkLoaderWeb();
				//String appNO1 = loginPage.Applicationnumber();
				break;
		 
			case "BOM","DCB":
				healthandpuretermspage.selectPlanJourneyRecommendPlansWeb(testData.get("PlanSelectionJourney"));
				wait.WaitTime2();

				// PSM Need Analysis //
				TestUtil.scrollTillTOPOfPage(driver);
				if(testData.get("ChannelName").equalsIgnoreCase("DBS")||testData.get("ChannelName").equalsIgnoreCase("BOM")||testData.get("ChannelName").equalsIgnoreCase("DCB")&& testData.get("bank_customer_income").isEmpty()) {
				healthandpuretermspage.enterPremiumValueRecommendPlanWeb(testData.get("premiumValue"));
				}
				if(testData.get("ChannelName").equalsIgnoreCase("DBS")||testData.get("ChannelName").equalsIgnoreCase("BOM")||testData.get("ChannelName").equalsIgnoreCase("DCB")&& testData.get("bank_customer_occupation").isEmpty()) {
				healthandpuretermspage.OccupationdropdownSelectionONRecommendPlanWeb(testData.get("occupationOption"));
				}
				healthandpuretermspage.lifeStageSelectionONRecommendPlanWeb(testData.get("lifeStageValue"));
				healthandpuretermspage.investmentGoalSelectionONRecommendPlanWeb(testData.get("investmentGoalValue"));
				healthandpuretermspage.RiskprofileSelectionONRecommendPlanWeb(testData.get("riskProfileFieldValue"));
				TestUtil.scrollTillEndOfPage(driver);
				if (testData.get("AddExistingPolicies").equalsIgnoreCase("YES")) {
					healthandpuretermspage.ClickonAddExistingPoliciesWeb();
					healthandpuretermspage.EnterAllSumAssuredAmountweb(testData.get("SAAmount"));

				}
				TestUtil.scrollTillEndOfPage(driver);
				healthandpuretermspage.clickonViewPlansBtnWeb();
				dashboard.checkLoaderWeb();
				healthandpuretermspage.SelectRecommendedPlanList(testData.get("SelectPlan"));
				dashboard.checkLoaderWeb();
				break;

		}

		String PlanSelectionJourney = testData.get("PlanSelectionJourney");
		String SelectPlan = testData.get("SelectPlan");
		

		switch (PlanSelectionJourney) {

			case "Recommend Plans":

				switch (SelectPlan) {
					case "BSLI Guaranteed Milestone Plan":
						new ViewQuoteFactoryGMS().ViewPageGMS(getDriver(), testData);
						break;
					case "ABSLI Fixed Maturity Plan":
						new ViewQuoteFactoryFMP().ViewPageFMP(getDriver(), testData);
						break;
					case "ABSLI Assured Income Plus":
						new ViewQuoteFactoryAIP().ViewPageAIP(getDriver(), testData);
						break;
					case "ABSLI Nishchit Aayush Plan":
						new ViewQuoteFactoryN_Ayush().ViewPageNischitAyush(getDriver(), testData);
						break;
					case "ABSLI Akshaya Plan":
						new ViewQuoteFactoryAkshaya().ViewPageAkshaya(getDriver(), testData);
						break;
					case "ABSLI Nishchit Laabh Plan":
						new ViewQuoteFactoryN_Laabh().ViewPageNischitLaabh(getDriver(), testData);
						break;
					case "ABSLI Assured Savings Plan":
						new ViewQuoteFactoryASP().ViewPageASP(getDriver(), testData);
						break;
					case "BSLI Vision Endowment Plus":
						new ViewQuoteFactoryVision_Endo().ViewPageVision_Endo(getDriver(), testData);
						break;
					case "BSLI Fortune Elite":
						new ViewQuoteFactoryFortune().ViewPageFortune(getDriver(), testData);
						break;
					case "ABSLI Nishchit Pension Plan":
						new ViewQuoteFactoryN_Pension().ViewPageNischitPension(getDriver(), testData);
						break;
					case "ABSLI Poorna Suraksha Kawach":
						new ViewQuoteFactoryPSK().ViewPagePSK(getDriver(), testData);
						break;
					case "BSLI Wealth Secure Plan":
						new ViewQuoteFactoryWealth_secure().ViewPageWealth_secure(getDriver(), testData);
						break;
					case "BSLI Wealth Aspire Plan":
						new ViewQuoteFactoryWealth_aspire().ViewPageWealth_aspire(getDriver(), testData);
						break;
					case "ABSLI Anmol Suraksha Kawach":
						new ViewQuoteFactoryASK().ViewPageASK(getDriver(), testData);
						break;
					case "ABSLI Childs Future Assured Plan":
						new ViewQuoteFactoryChild_future().ViewPageChild_future(getDriver(), testData);
						break;
					case "ABSLI Digishield Plan":
						new ViewQuoteFactoryDigi().ViewPageDigi(getDriver(), testData);
						break;
					case "BSLI Cancer Shield Plan":
						new ViewQuoteFactorySalaried().ViewPageSalaried(getDriver(), testData);
						break;
					case "ABSLI Salaried Term Plan":
						new ViewQuoteFactoryAIP().ViewPageAIP(getDriver(), testData);
						break;
					case "BSLI Vision Life Income Plan":
						new ViewQuoteFactoryVision_lifeincome().ViewPageVision_lifeincome(getDriver(), testData);
						break;
					case "ABSLI Vision Life Income Plus Plan":
						new ViewQuoteFactoryVision_lifeincomeplus().ViewPageVision_lifeincomeplus(getDriver(), testData);
						break;
					case "BSLI Vision Star Plan":
						new ViewQuoteFactoryVision_star().ViewPageVision_star(getDriver(), testData);
						break;
					case "ABSLI Assured FlexiSavings Plan":
						new ViewQuoteFactoryAssured_flexi().ViewPageAssured_flexi(getDriver(), testData);
						break;
					case "BSLI CritiShield Plan":
						new ViewQuoteFactoryCriti().ViewPageCritishield(getDriver(), testData);
						break;
					case "ABSLI Platinum Gain Plan":
						new ViewQuoteFactoryPlatinum().ViewPagePlatinum_gain(getDriver(), testData);
						break;
					case "ABSLI Wealth Infinia":
						new ViewQuoteFactoryWealth_infinia().ViewPageinfinia(getDriver(), testData);
						break;
					case "BSLI Wealth Assure Plus Plan":
						new ViewQuoteFactoryAssure_Plus().ViewPageAssureplus(getDriver(), testData);
						break;
					case "BSLI Wealth Max Plan":
						new ViewQuoteFactoryWealth_Max().ViewPageWealthMax(getDriver(), testData);
						break;
					default:
						// Default case for unknown planName
						break;

				}
				break;


			case "Health & Pure Term Plans":

				switch (SelectPlan) {

					case "ABSLI Assured Savings Plan":
						new ViewQuoteFactoryASP().ViewPageASP(getDriver(), testData);
						break;
					case "ABSLI Nishchit Pension Plan":
						new ViewQuoteFactoryN_Pension().ViewPageNischitPension(getDriver(), testData);
						break;
					case "ABSLI Assured Income Plus":
						new ViewQuoteFactoryAIP().ViewPageAIP(getDriver(), testData);
						break;
					case "ABSLI Digishield Plan":
						new ViewQuoteFactoryDigi().ViewPageDigi(getDriver(), testData);
						break;
					case "ABSLI Nishchit Laabh Plan":
						new ViewQuoteFactoryN_Laabh().ViewPageNischitLaabh(getDriver(), testData);
						break;
					case "ABSLI Salaried Term Plan":
						new ViewQuoteFactoryAIP().ViewPageAIP(getDriver(), testData);
						break;
					case "ABSLI Akshaya Plan":
						new ViewQuoteFactoryAkshaya().ViewPageAkshaya(getDriver(), testData);
						break;
					case "BSLI Guaranteed Milestone Plan":
						new ViewQuoteFactoryGMS().ViewPageGMS(getDriver(), testData);
						break;
					case "ABSLI Poorna Suraksha Kawach":
						new ViewQuoteFactoryPSK().ViewPagePSK(getDriver(), testData);
						break;
					case "BSLI Vision Life Income Plan":
						new ViewQuoteFactoryVision_lifeincome().ViewPageVision_lifeincome(getDriver(), testData);
						break;
				}
		}
	}
}
