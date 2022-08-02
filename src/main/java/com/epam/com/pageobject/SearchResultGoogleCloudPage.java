package com.epam.com.pageobject;

import com.epam.com.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultGoogleCloudPage extends BasePage {


    @FindBy(xpath = "//b[text()='Google Cloud Pricing Calculator']")
    WebElement switchToCalculator;
    //private By switchToCalculator = By.xpath("//b[text()='Google Cloud Pricing Calculator']");


    public SearchResultGoogleCloudPage(WebDriver driver) {

        super(driver);
    }

    public void clickOnGoogleCloudPlatformLink() throws InterruptedException {
        switchToCalculator.click();
        Thread.sleep(5000);
    }
}
