package com.absli.utils;

import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.absli.Listner.CustomListner;


import java.time.Duration;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;

import static com.absli.base.BasePage.getDriver;

public class WaitUtils {


    public static void waitforElementToBeClickable(WebDriver driver, WebElement element, int timeout){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public static void WaitTime2() throws InterruptedException {
         Thread.sleep(1000);
        //  getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

      }

    public static void waitForElementToBeClickableAndroid(AndroidDriver driver1, WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void waitforchildwindowdissapear(WebDriver driver, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.numberOfWindowsToBe(1));
    }
    public  static void VerifyloadingWait() {
        try {
            WebElement Loading=getDriver().findElement(By.xpath("//img[contains(@style,'padding: 1.5rem;')]"));
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(120));
            wait.until(ExpectedConditions.invisibilityOf(Loading)); // wait for loader to disappear
        }catch(NoSuchElementException e){
            System.out.println("Loading Element is not display");
        }


    }


    public  static void WaitTime(int args) throws InterruptedException {
      // getDriver().manage().timeouts().implicitlyWait(args, TimeUnit.SECONDS);
    }

    private static WebElement element = null;

    public static WebElement Endofcheckloader(WebDriver driver) {
        element = (new WebDriverWait(driver, Duration.ofSeconds(10))).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@style,'padding: 1.5rem;')]")));
        element = driver.findElement(By.xpath("//img[contains(@style,'padding: 1.5rem;')]"));
        return element;

    }


    public static void waitForElementToBeVisibleAndroid(AndroidDriver driver1, WebElement element, int timeOut, String message) {
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (NoSuchElementException e) {
            CustomListner.test.log(Status.FAIL, message);
        } catch (TimeoutException e) {
            CustomListner.test.log(Status.FAIL, message);
        }
    }

    public static void waitForElementToBeVisibleweb(WebDriver driver, WebElement element, int timeOut, String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (NoSuchElementException e) {
            CustomListner.test.log(Status.FAIL, message);
        } catch (TimeoutException e) {
            CustomListner.test.log(Status.FAIL, message);
        }
    }


//-===============shubham=================//

    public static void sleep(int args ) throws InterruptedException {

        Thread.sleep(args);
    }




    public  void waitForElementToBeVisibleIos(IOSDriver driver2, WebElement element, int timeOut, String message) {
        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (NoSuchElementException e) {
            CustomListner.test.log(Status.FAIL, message);
        } catch (TimeoutException e) {
            CustomListner.test.log(Status.FAIL, message);
        }
    }

    public static void waitForElementToBeVisibleIOS(IOSDriver driver2, WebElement element, int timeOut, String message) {
        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            CustomListner.test.log(Status.FAIL, message);
        } catch (TimeoutException e) {
            CustomListner.test.log(Status.FAIL, message);
        }
    }

    public static void scrollTillEndOfPageWeb(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");



    }

}
