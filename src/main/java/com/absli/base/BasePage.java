package com.absli.base;
import Utils.ExcelUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import Utils.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.slf4j.Logger;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.logging.LogManager;


import static com.absli.base.TestBase.prop;

public class BasePage {

    protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static String parameterName;

    static void setDriver() throws IOException {

        parameterName = ExcelUtils.getPlatformNameFromExcel(prop.getProperties("testExcelSheet"), "controller");

        switch(parameterName.toLowerCase()) {


                case "web":
                setDriver_Local();
                break;

                case "lambda":
                ChromeOptions  browserOptions = new ChromeOptions();
                String username = "robin.bhogal";
                String accesskey = "S65g9VlO0tz2gRkBUCJjb0dNJbNMy6PsgmIKzcOrzUNLxIKDqZ";
                String gridURL = "@hub.lambdatest.com/wd/hub";

                Date dt = new Date();
                browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 10");
                browserOptions.setBrowserVersion("121.0");
                HashMap<String, Object> ltOptions = new HashMap<String, Object>();
                ltOptions.put("username", "robin.bhogal");
                ltOptions.put("accessKey", "S65g9VlO0tz2gRkBUCJjb0dNJbNMy6PsgmIKzcOrzUNLxIKDqZ");
                ltOptions.put("project", "Leap-BOM");
                ltOptions.put("name", "Leap-BOM");
                ltOptions.put("build", "Automation-BOM-Framework"+" "+dt.getDate()+" "+ "Vijay");
                ltOptions.put("selenium_version", "4.11.0");
                ltOptions.put("w3c", true);
                browserOptions.setCapability("LT:Options", ltOptions);

                DesiredCapabilities capabilities = new DesiredCapabilities();
                HashSet<String> ab = new HashSet<>();
                ab.add("download.jpg");
                ab.add("download.jpg");
                capabilities.setCapability("platformName", "Windows 10");
                capabilities.setCapability("lambda:userFiles",ab);
                try {
                    driver.set(new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), browserOptions));
                } catch (MalformedURLException e) {
                    System.out.println("Invalid grid URL");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;

                default:
                System.out.println("Please Select Valid Platform");
        }
    }

    static void setDriver_Local() throws IOException {


             // Use WebDriverManager to download and manage the ChromeDriver binary //
            // WebDriverManager.chromedriver().setup(); //

        parameterName = ExcelUtils.getPlatformNameFromExcel(prop.getProperties("testExcelSheet"), "controller");
        if (parameterName.equalsIgnoreCase("FireFox")) {
            driver.set(new FirefoxDriver());
        } else if (parameterName.equalsIgnoreCase("web")) {
            driver.set(new ChromeDriver());
        } else if (parameterName.equalsIgnoreCase("Safari")) {
            WebDriverManager.safaridriver().setup();
            driver.set(new SafariDriver());
        }

        else {

            System.out.println("Invalid Browser Name ");
        }
    }


    public static WebDriver getDriver() {

        return driver.get();
    }

}