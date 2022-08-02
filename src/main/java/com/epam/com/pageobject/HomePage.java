package com.epam.com.pageobject;

import com.epam.com.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {



    public static final String PAGE_URL = "https://cloud.google.com/";

    @FindBy(className = "devsite-search-form")
    WebElement devSiteSearch;
    //private By devSiteSearch = By.className("devsite-search-form");



    @FindBy(xpath = "//input[@class='devsite-search-field devsite-search-query']")
    WebElement googleSearch;
    //private By googleSearch = By.xpath("//input[@class='devsite-search-field devsite-search-query']");


    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void openCloudPage(){
        driver.get(PAGE_URL);
    }

    public void clickOnSearch(){
        devSiteSearch.click();
        //driver.findElement(devSiteSearch).click();
    }

    public void googleSearch(String keyForGoogleCloud) throws InterruptedException {

        WebElement textForGoogleSearch = googleSearch;
        textForGoogleSearch.click();
        textForGoogleSearch.sendKeys(keyForGoogleCloud);
        textForGoogleSearch.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
}
