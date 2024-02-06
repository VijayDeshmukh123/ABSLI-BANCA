package com.absli.dataproviders;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

import org.testng.annotations.DataProvider;

import com.absli.utils.PropertiesUtils;

import Utils.ExcelUtils;

public class DataProviders {

	PropertiesUtils prop = new PropertiesUtils();




	@DataProvider(name = "EndtoEndProposerSame")
	public Iterator<Object[]> EndtoEndProposerSame(Method method) throws IOException {
		ArrayList<HashMap<String, String>> testDataList = new ExcelUtils().getEndtoEndProposerSame(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("EndtoEndProposerSameSheet"));
		List<Object[]> testDataArray = new ArrayList<>();
		for (HashMap<String, String> testData : testDataList) {
			testDataArray.add(new Object[]{testData});
		}
		return testDataArray.iterator();
	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------//
	@DataProvider(name = "EndtoEndMajorDataProvider")
	public Iterator<Object[]> EndtoEndProposerMajorTestData(Method method) throws IOException {
		ArrayList<HashMap<String, String>> testDataList = new ExcelUtils().getEndtoEndMajorDiffTestFromExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("EndtoEndProposerMajorSheetName"));
		List<Object[]> testDataArray = new ArrayList<>();
		for (HashMap<String, String> testData : testDataList) {
			testDataArray.add(new Object[]{testData});
		}
		return testDataArray.iterator();
	}
	//---------------------------------------------------------------------------------------------------------
	@DataProvider(name = "EndtoEndMinorDataProvider")
	public Iterator<Object[]> EndtoEndMinorTestData(Method method) throws IOException {
		ArrayList<HashMap<String, String>> testDataList = new ExcelUtils().getEndtoEndMinorTestFromExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("EndtoEndMinorSheetName"));
		List<Object[]> testDataArray = new ArrayList<>();
		for (HashMap<String, String> testData : testDataList) {
			testDataArray.add(new Object[]{testData});
		}
		return testDataArray.iterator();
	}

	//-------------------------------------------------------------------------------------------------------------------------------------------------//
	@DataProvider(name = "EndtoEndCompanyDataProvider")
	public Iterator<Object[]> EndtoEndCompanyTestData(Method method) throws IOException {
		ArrayList<HashMap<String, String>> testDataList = new ExcelUtils().getEndtoEndCompanyTestFromExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("EndtoEndCompanySheetName"));
		List<Object[]> testDataArray = new ArrayList<>();
		for (HashMap<String, String> testData : testDataList) {
			testDataArray.add(new Object[]{testData});
		}
		return testDataArray.iterator();
	}

	//------------------------------------------------------------------------------------------------------//
	@DataProvider(name = "EndtoEndJointLifeDataProvider")
	public Iterator<Object[]> EndtoEndJointlifeTestData(Method method) throws IOException {
		ArrayList<HashMap<String, String>> testDataList = new ExcelUtils().getEndtoEndJointLifeTestFromExcel(prop.getProperties("testExcelSheet"),
				method.getName(), prop.getProperties("EndtoEndJointLifeSheetName"));
		List<Object[]> testDataArray = new ArrayList<>();
		for (HashMap<String, String> testData : testDataList) {
			testDataArray.add(new Object[]{testData});
		}
		return testDataArray.iterator();
	}



}

