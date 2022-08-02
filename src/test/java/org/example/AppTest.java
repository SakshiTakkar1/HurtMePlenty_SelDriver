package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.time.Duration;


public class AppTest
{
    @Test
    public void HurtMePlenty() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cloud.google.com/");

        //private By devSiteSearch = By.className("devsite-search-form");
        //driver.findElement(devSiteSearch).click();

        driver.findElement(By.className("devsite-search-form")).click();
        Thread.sleep(5000);

        WebElement textForGoogleSearch = driver.findElement(By.xpath("//input[@class='devsite-search-field devsite-search-query']"));
        textForGoogleSearch.click();
        Thread.sleep(5000);
        textForGoogleSearch.sendKeys("Google Cloud Platform Pricing Calculator");
        textForGoogleSearch.sendKeys(Keys.ENTER);
       Thread.sleep(5000);

        WebElement linkGoogleCloudCalculator = driver.findElement(By.xpath("//b[text()='Google Cloud Pricing Calculator']"));
        linkGoogleCloudCalculator.click();

        Thread.sleep(5000);

        WebElement newFirstFrame = driver.findElement(By.xpath("//iframe[contains(@name,'goog_')]"));
        driver.switchTo().frame(newFirstFrame);
        driver.switchTo().frame("myFrame");

        Thread.sleep(5000);
       WebElement instancesField =
                driver.findElement(By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']"));

       instancesField.sendKeys("4");

       Thread.sleep(5000);

        WebElement seriesOfMachine = driver.findElement(By.xpath("//md-select[@name='series']/parent::md-input-container"));
        seriesOfMachine.click();

        Thread.sleep(5000);

        WebElement seriesOfMachineModel = driver.findElement(By.xpath("//md-option[@value='n1']"));
        seriesOfMachineModel.click();

        Thread.sleep(5000);

        WebElement machineType = driver.findElement(By.xpath("//label[text()='Machine type']/parent::md-input-container"));
        machineType.click();

        Thread.sleep(5000);


        WebElement computeEngine = driver.findElement(By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']"));
        computeEngine.click();

//        WebElement machineType = driver.findElement(By.xpath("//label[text()='Machine type']/parent::md-input-container"));
//        machineType.click();

        Thread.sleep(5000);


        WebElement gpusCheckBox = driver.findElement(By.xpath("//md-checkbox[@aria-label='Add GPUs']"));
        gpusCheckBox.click();
        Thread.sleep(5000);



        WebElement gpuType =driver.findElement(By.xpath("//md-select[@placeholder='GPU type']"));
        gpuType.click();
        Thread.sleep(3000);

        WebElement gpuTypeModel = driver.findElement(By.xpath("//md-option[@value='NVIDIA_TESLA_V100']"));
        gpuTypeModel.click();
        Thread.sleep(3000);

        WebElement numberOfGpus = driver.findElement(By.xpath("//md-select[@placeholder='Number of GPUs']"));
        numberOfGpus.click();
        Thread.sleep(3000);

       WebElement numberOfGpusModel = driver.findElement(By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]"));
        numberOfGpusModel.click();
        Thread.sleep(3000);


        WebElement localSsd = driver.findElement(By.xpath("//md-select[@placeholder='Local SSD']"));
        localSsd.click();

        Thread.sleep(3000);

        WebElement localSsdModel = driver.findElement(By.cssSelector("md-option[value='2'][ng-value='item.value'][ng-repeat='item in listingCtrl.dynamicSsd.computeServer']"));
        localSsdModel.click();


        Thread.sleep(3000);

        WebElement dataCenterLocation = driver.findElement(By.xpath("//md-select[@placeholder='Datacenter location']"));
        dataCenterLocation.click();

        Thread.sleep(3000);

        WebElement dataCenterLocationInFrankfurt = driver.findElement(By.cssSelector("md-select-menu[class='md-overflow']" +
                " md-option[value='europe-west3'][ng-repeat*='fullRegionList']"));
        dataCenterLocationInFrankfurt.click();

        WebElement committedUsage = driver.findElement(By.xpath("//md-select[@placeholder='Committed usage']"));
       committedUsage.click();

       Thread.sleep(3000);

        WebElement oneYearUsage = driver.findElement(By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" +
                " md-option[value='1'][class='md-ink-ripple']"));
        oneYearUsage.click();

        Thread.sleep(3000);



        WebElement addToEstimateButton = driver.findElement(By.xpath("//button[@aria-label='Add to Estimate']"));
        addToEstimateButton.click();
        Thread.sleep(3000);


//        String actualValue =
//        WebElement informationInVmClassIsRegular = driver.findElement(By.xpath("//div[contains(text(),'VM class: Regular')]"));

    }
}
