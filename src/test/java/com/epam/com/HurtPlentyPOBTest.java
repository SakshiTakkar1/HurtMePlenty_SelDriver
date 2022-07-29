package com.epam.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HurtPlentyPOBTest extends BaseTest{

//    WebDriver driver;

//    @BeforeTest
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        // System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://cloud.google.com/");
//
//    }



    @Test
    public void testWithPOM() throws InterruptedException {

//        HomePage homePage = new HomePage(getDriver());
//        SearchResultGoogleCloudPage searchResultGoogleCloudPage = new SearchResultGoogleCloudPage(getDriver());
//        CalculatorPage calculatorPage = new CalculatorPage(getDriver());


        homePage.openCloudPage();
        homePage.clickOnSearch();
        homePage.googleSearch("Google Cloud Platform Pricing Calculator");
        searchResultGoogleCloudPage.clickOnGoogleCloudPlatformLink();
        calculatorPage.ComputeEngineFrame();
        calculatorPage.selectInstanceField("4");
        calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();

        calculatorPage.checkInformationInVmClassIsRegular();
        calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
        calculatorPage.checkRegionIsFrankfurt();
        calculatorPage.checkLocalSsdSpace2x375Gib();
        calculatorPage.checkCommitmentTermOneYear();



    }
}
