package com.absli.testcases;
import java.util.HashMap;

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
import io.qameta.allure.Story;

public class TestRunner extends TestBase{
	
	
	public TestRunner() {
		super();
	}

	@Severity (SeverityLevel.NORMAL)
	@Description ("Test to verify the End to End proposer Same Scenario")
	@Story ("GMS")
	@Test(groups = {"Sanity" }, dataProvider = "EndtoEndProposerSame", dataProviderClass = DataProviders.class, description = "Proposer same Scenario")

	public void CompletesameGMSA(HashMap<String, String> testData) throws Exception {
		
		new EndtoEndProposerSame().CompletesameScenarioJourney(testData);
		
	}
	
	
	@Severity (SeverityLevel.NORMAL)
	@Description ("Test to verify the End to End proposer Same Scenario")
	@Story ("GMS")
	@Test(groups = {"Sanity" }, dataProvider = "EndtoEndProposerSame", dataProviderClass = DataProviders.class, description = "Proposer same Scenario")

	public void CompletesameGMSB(HashMap<String, String> testData) throws Exception {
		
		new EndtoEndProposerSame().CompletesameScenarioJourney(testData);
		
	}
	
	
	
	@Severity (SeverityLevel.NORMAL)
	@Description ("Test to verify the End to End proposer Same Scenario")
	@Story ("GMS")
	@Test(groups = {"Sanity" }, dataProvider = "EndtoEndProposerSame", dataProviderClass = DataProviders.class, description = "Proposer same Scenario")

	public void CompletesameGMSC(HashMap<String, String> testData) throws Exception {
		
		new EndtoEndProposerSame().CompletesameScenarioJourney(testData);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Test(groups = {"web" }, dataProvider = "EndtoEndMajorDataProvider", dataProviderClass = DataProviders.class, description = "Major Different Scenario")

	public void CompleteMajorDifferentGMSA(HashMap<String, String> testData) throws Exception {

		new EndtoEndProposerDiff_Major().CompleteMajorScenarioJourney(testData);
	}
	
	@Test(groups = {
	"web" }, dataProvider = "EndtoEndMinorDataProvider", dataProviderClass = DataProviders.class, description = "Proposer Same GMS Scenario")

public void CompletesminorGMSA(HashMap<String, String> testData) throws Exception {
		new EndtoEndProposerDiff_Minor().CompleteMinorScenarioJourney(testData);

}
	@Test(groups = {
	"web" }, dataProvider = "EndtoEndMinorDataProvider", dataProviderClass = DataProviders.class, description = "Proposer Same GMS Scenario")

public void CompletesminorGMSB(HashMap<String, String> testData) throws Exception {
		new EndtoEndProposerDiff_Minor().CompleteMinorScenarioJourney(testData);

}

}
