package com.epam.com;

import com.epam.com.factory.WebDriverFactory;
import com.epam.com.pageobject.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    public static WebDriver driver;
    protected static HomePage homePage;
    protected static SearchResultGoogleCloudPage searchResultGoogleCloudPage;
    protected static CalculatorPage calculatorPage;

    protected static ScreenshotPage screenshotPage;

    protected static SmokePage smokePage;

    @BeforeTest
    public static void driverSetup() {
        // WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = new WebDriverFactory().getWebDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.openCloudPage();
        searchResultGoogleCloudPage = new SearchResultGoogleCloudPage(driver);
        calculatorPage = new CalculatorPage(driver);
        screenshotPage = new ScreenshotPage(driver);
        smokePage = new SmokePage(driver);


    }

//    public static WebDriver getDriver () {
//        if (driver == null) {
//            driver = new ChromeDriver();
//        }
//        return driver;
//    }



    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
