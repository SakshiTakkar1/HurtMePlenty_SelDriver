package com.epam.com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmokePage extends BasePage{

    public static final String PAGE_CALCULATORURL = HomePage.PAGE_URL+"products/calculator";

    @FindBy(xpath = "//div[@class='devsite-top-logo-row-wrapper-wrapper']")
    WebElement header;



    @FindBy(xpath = "//iframe[contains(@name,'goog_')]")
    WebElement newFirstFrame;

    @FindBy(xpath = "//h2[text()='Google Cloud Pricing Calculator']")
    WebElement calculatorPageTitle;

    @FindBy(xpath = "//form[@name='ComputeEngineForm']//h2[@class='md-title']")
    WebElement instanceTitle;





    public SmokePage(WebDriver driver) {

        super(driver);
    }


        public void testGooglePageAvailability() {

            driver.getTitle().contains("Google Cloud");
            System.out.println(driver.getTitle().contains("Google Cloud"));


    }


    public boolean testGooglePageHeader(){
        WebElement head = header;
        System.out.println(head.isDisplayed());
        return head.isDisplayed();
    }

    public void testFrameCalculatorPage() throws InterruptedException {
        driver.get(PAGE_CALCULATORURL);
        WebElement elem = newFirstFrame;
        elem.click();
        driver.switchTo().frame(elem);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);
    }

    public boolean testCalculatorPageTitle() throws InterruptedException {
        testFrameCalculatorPage();
        WebElement cPageTitle = calculatorPageTitle;
        System.out.println(cPageTitle.isDisplayed());
        return cPageTitle.isDisplayed();
    }

    public boolean testInstanceTitle() throws InterruptedException {
        testFrameCalculatorPage();
        WebElement inTitle = instanceTitle;
        String a = instanceTitle.getText();
        System.out.println(a);
        System.out.println(instanceTitle.isDisplayed());
        return instanceTitle.isDisplayed();
    }

}
