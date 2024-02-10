package com.absli.testcases;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import Utils.ExcelUtils;
import com.absli.base.BasePage;
import com.absli.scripts.Inilazation;
import com.absli.utils.PropertiesUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.absli.TestFactory.GotoEndtoEnd.EndToEndProMajorJourney;
import com.absli.TestFactory.GotoEndtoEnd.GoToPMSpage_Major_Minor_Journey;
import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.scripts.EndtoEndProposerDiff_Major;
import com.absli.scripts.EndtoEndProposerDiff_Minor;
import com.absli.scripts.EndtoEndProposerSame;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
//import static com.absli.base.TestBase.prop;
public class TestRunner extends TestBase{





	public TestRunner() {
		super();
	}


	@Test(groups = {"Sanity" }, dataProvider = "EndtoEndProposerSame", dataProviderClass = DataProviders.class, description = "Proposer same Scenario")

	public void CompletesameGMSA(HashMap<String, String> testData) throws Exception {

		new EndtoEndProposerSame().CompletesameScenarioJourney(testData);

	}
	

}
