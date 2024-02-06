package com.absli.Listner;

import java.io.IOException;

import com.absli.base.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

import com.absli.base.BasePage;
import com.absli.base.ExtentFactory;


public class CustomListner extends TestBase implements ITestListener{


	public static ExtentTest test;
	ExtentReports extent = ExtentReporterNG.extentReportGenerator();

	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());;
		//extentTest.set(test);
		ExtentFactory.getInstance().setExtent(test);

	}

	@Override
	public void onTestSuccess(ITestResult result) {


		ExtentFactory.getInstance().getExtent().log(Status.PASS, "Test Case Successfully Passed");
		ExtentFactory.getInstance().removeExtentObject();
		//extentTest.get().log(Status.PASS, "Test Case passed Sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentFactory.getInstance().getExtent().fail(result.getThrowable());
		//extentTest.get().fail(result.getThrowable());
		System.out.println("FAILED test");
		System.out.println("**************************************");

		System.out.println("******* TEST FAIL: "+result.getMethod().getMethodName()+" - "+result.getMethod().getDescription());
		//System.out.println("******* TEST FAIL: "+result.getTestClass().getRealClass()+" - "+result.getMethod().getDescription());
		System.out.println("**************************************");

		try {
      /* String screenshotPath = failedWeb(result.getMethod().getMethodName());
         result.getMethod().getDescription();
         extentTest.get().log(LogStatus.FAIL, test.addScreenCaptureFromPath(screenshotPath));
         //extentTest.get().addScreenCaptureFromPath(screenshotPath);*/
			ExtentFactory.getInstance().getExtent().addScreenCaptureFromPath(failedWeb(result.getMethod().getMethodName()));
			ExtentFactory.getInstance().removeExtentObject();


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentFactory.getInstance().getExtent().log(Status.SKIP, result.getMethod().getMethodName()+"Test Case Skipped");
		ExtentFactory.getInstance().removeExtentObject();


	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {


	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();

	}



}
