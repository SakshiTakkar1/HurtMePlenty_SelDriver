package com.epam.com.pageobject;

import com.epam.com.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultGoogleCloudPage extends BasePage {


    private By switchToCalculator = By.xpath("//b[text()='Google Cloud Pricing Calculator']");


    public SearchResultGoogleCloudPage(WebDriver driver) {

        super(driver);
    }

    public void clickOnGoogleCloudPlatformLink() throws InterruptedException {

        driver.findElement(switchToCalculator).click();
        Thread.sleep(5000);
    }
}
