package com.epam.com;

import com.epam.com.pageobject.CalculatorPage;
import com.epam.com.pageobject.HomePage;
import com.epam.com.pageobject.SearchResultGoogleCloudPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    private static WebDriver driver;
    protected static HomePage homePage;
    protected static SearchResultGoogleCloudPage searchResultGoogleCloudPage;
    protected static CalculatorPage calculatorPage;

    @BeforeTest
    public static void driverSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        searchResultGoogleCloudPage = new SearchResultGoogleCloudPage(driver);
        calculatorPage = new CalculatorPage(driver);

    }

    public static WebDriver getDriver () {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
