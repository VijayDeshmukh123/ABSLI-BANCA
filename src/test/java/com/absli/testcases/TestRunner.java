package com.absli.testcases;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.absli.base.TestBase;
import com.absli.dataproviders.DataProviders;
import com.absli.scripts.EndtoEndProposerSame;

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
