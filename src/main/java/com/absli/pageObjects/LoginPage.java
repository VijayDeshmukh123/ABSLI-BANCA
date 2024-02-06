package com.absli.pageObjects;


import com.absli.Listner.AllureListener;
import com.absli.base.*;

import com.absli.utils.WaitUtils;

import com.aventstack.extentreports.Status;

import Utils.TestUtil;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	public WebDriver driver;
	public WaitUtils wait;


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(getDriver(), this);
	}


	// login page // 6/6/2023= Mayur Bhadane

	//Allure Report Generation //14-06-2023- Mithil Panchal
	@FindBy(xpath = "//input[@id='loginId']")
	private WebElement userNM;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement PassNM;
	@FindBy(xpath = "//span[text()='LOGIN']")
	private WebElement submit;
	@FindBy(xpath = "//div[text()='NEW APPLICATION']")
	private WebElement newapp;
	@FindBy(xpath = "//div[@class='header-content-no']")
	private WebElement appno;


	public void enterUserNameweb(String username) {
		wait.waitForElementToBeVisibleweb(getDriver(), userNM, 50,"time out to find element on page");
		if (userNM.isDisplayed()) {
			userNM.sendKeys(username);
			Allure.step("Enter the Username  >"   + username);
		} else {
			System.out.println("Username input box is not visible");
		}

	}

	public void enterpasswordweb(String password) {
		wait.waitForElementToBeVisibleweb(getDriver(), PassNM, 30,"time out to find element on page");
		if (PassNM.isDisplayed()) {
			PassNM.sendKeys(password);
			Allure.step("Enter the Password  >"   + password);
		} else {
			System.out.println("Username input box is not visible");
		}
	}

	public void loginButtonweb() {
		wait.waitForElementToBeVisibleweb(getDriver(), submit, 30,"time out to find element on page");
		if (submit.isDisplayed()) {
			submit.click();
			Allure.step("Clicked On Login Button");
		} else {
			System.out.println("LOGIN button is not visible");

		}

	}



	public void newapplication() {

		wait.waitForElementToBeVisibleweb(getDriver(), newapp, 30, "time out to find element on page");
		if (newapp.isDisplayed()) {
			newapp.click();
			Allure.step("Clicked On New Application");
		} else {
			System.out.println("New Application button is not visible");
		}
	}
	public String Applicationnumber() throws InterruptedException {
		wait.waitForElementToBeVisibleweb(getDriver(), appno, 30, "time out to find element on page");
		
			//appno.click();
			String ap= appno.getText();
			TestUtil.verifybgColor(appno, getDriver());
			Allure.step("The Application No is-->>"+ ap);
		return ap;
	}

	public WebElement ApplicationnumberWeb() throws InterruptedException {
		wait.waitForElementToBeVisibleweb(getDriver(), appno, 30, "time out to find element on page");
		
			//appno.click();
			
		return appno;
	}

}