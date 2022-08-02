package com.epam.com.pageobject;

import Service.CalculatorCreator;
import com.beust.ah.A;
import com.epam.com.model.Calculator;
import com.epam.com.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CalculatorPage extends BasePage {

    @FindBy(xpath = "//div[@class= \"md-toolbar-tools flex-gt-sm-50\"]")
    WebElement Calc;



    @FindBy(xpath = "//iframe[contains(@name,'goog_')]")
    WebElement newFirstFrame;
   // private By newFirstFrame = By.xpath("//iframe[contains(@name,'goog_')]");


     @FindBy(xpath = "//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']")
    WebElement instancesField;
    //private By instancesField = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");

    @FindBy(xpath = "//md-select[@name='series']/parent::md-input-container")
    WebElement seriesOfMachine;
   // private By seriesOfMachine = By.xpath("//md-select[@name='series']/parent::md-input-container");

    @FindBy(xpath = "//md-option[@value='n1']")
    WebElement seriesOfMachineModel;
    //private By seriesOfMachineModel = By.xpath("//md-option[@value='n1']");

    @FindBy(xpath = "//label[text()='Machine type']/parent::md-input-container")
    WebElement machineType;
    //private By machineType = By.xpath("//label[text()='Machine type']/parent::md-input-container");


    @FindBy(xpath = "//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']")
    WebElement computeEngine;
    //private By computeEngine = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");

   @FindBy(xpath = "//md-checkbox[@aria-label='Add GPUs']")
   WebElement gpusCheckBox;
    //private By gpusCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");


    @FindBy (xpath = "//md-select[@placeholder='GPU type']")
    WebElement gpuType;
   // private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");

    @FindBy(xpath = "//md-option[@value='NVIDIA_TESLA_V100']")
    WebElement gpuTypeModel;
    //private By gpuTypeModel = By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");

    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    WebElement numberOfGpus;
   // private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");


    @FindBy(css = "md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]")
    WebElement numberOfGpusModel;
   // private By numberOfGpusModel = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");


    @FindBy(xpath = "//md-select[@placeholder='Local SSD']")
    WebElement localSsd;
    //private By localSsd = By.xpath("//md-select[@placeholder='Local SSD']");


    @FindBy(css = "md-option[value='2'][ng-value='item.value'][ng-repeat='item in listingCtrl.dynamicSsd.computeServer']")
    WebElement localSsdModel;
    //private By localSsdModel = By.cssSelector("md-option[value='2'][ng-value='item.value'][ng-repeat='item in listingCtrl.dynamicSsd.computeServer']");


    @FindBy(xpath = "//md-select[@placeholder='Datacenter location']")
    WebElement dataCenterLocation;
    //private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");

   @FindBy(css = "md-select-menu[class='md-overflow']" +
           " md-option[value='europe-west3'][ng-repeat*='fullRegionList']")
   WebElement dataCenterLocationInFrankfurt;
    //    private By dataCenterLocationInFrankfurt = By.cssSelector("md-select-menu[class='md-overflow']" +
    //            " md-option[value='europe-west3'][ng-repeat*='fullRegionList']");


    @FindBy(xpath = "//md-select[@placeholder='Committed usage']")
    WebElement committedUsage;
    //private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");

    @FindBy(css = "div[class='md-select-menu-container md-active md-clickable']" +
            " md-option[value='1'][class='md-ink-ripple']")
    WebElement oneYearUsage;
    //private By oneYearUsage = By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" +
    //       " md-option[value='1'][class='md-ink-ripple']");


    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    WebElement addToEstimateButton;
    //private By addToEstimateButton = By.xpath("//button[@aria-label='Add to Estimate']");

    //private By informationInVmClassIsRegular = By.xpath("//md-select[@aria-label='VM Class: Regular']");


    @FindBy(xpath = "//div[contains (text(),'Provisioning model: Regular')]")
    WebElement informationInVmClassIsRegular;
   // private By informationInVmClassIsRegular = By.xpath("//div[contains (text(),'Provisioning model: Regular')]");


    @FindBy(xpath = "//div[contains (text(),'Instance type: n1-standard-8')]")
    WebElement InformationInInstanceTypeIncludeN1Standard8;
//    private By InformationInInstanceTypeIncludeN1Standard8 =
//            By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");


    @FindBy(xpath = "//div[contains (text(),'Region: Frankfurt')]")
    WebElement regionIsFrankfurt;
    //private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");


    @FindBy(xpath = "//div[contains (text(),'Local SSD: 2x375 GiB')]")
    WebElement localSsdSpace2x375Gib;
    //private By localSsdSpace2x375Gib = By.xpath("//div[contains (text(),'Local SSD: 2x375 GiB')]");


    @FindBy(xpath = "//div[contains (text(),'Commitment term: 1 Year')]")
    WebElement commitmentTermOneYear;
    //private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }




    public CalculatorPage clickOnCalculatorPageLink()
    {
        WebElement calc = Calc;
        return new CalculatorPage(driver);
    }

    public void ComputeEngineFrame() throws InterruptedException {
        WebElement elem = newFirstFrame;
        elem.click();
        driver.switchTo().frame(elem);
        driver.switchTo().frame("myFrame");
        Thread.sleep(5000);
    }

    public void selectInstanceField(String numberOfInstances) throws InterruptedException {
        //WebElement numberOfInstancesField = driver.findElement(instancesField);
        instancesField.sendKeys(numberOfInstances);
        Thread.sleep(5000);
        //numberOfInstancesField.sendKeys(numberOfInstances);
    }

    public void selectSeriesOfMachine() throws InterruptedException {

        seriesOfMachine.click();
        Thread.sleep(5000);
        seriesOfMachineModel.click();
        Thread.sleep(5000);
    }

    public void selectMachineType() throws InterruptedException {
        machineType.click();
        Thread.sleep(5000);
        computeEngine.click();
        Thread.sleep(5000);
    }

    public void clickAddGpusCheckBox() throws InterruptedException {

        gpusCheckBox.click();
        Thread.sleep(5000);
    }

    public void selectGpuType() throws InterruptedException {
        gpuType.click();
        Thread.sleep(5000);
        gpuTypeModel.click();
        Thread.sleep(5000);
    }

    public void selectNumberOfGpus() throws InterruptedException {
        numberOfGpus.click();
        Thread.sleep(5000);
        numberOfGpusModel.click();
        Thread.sleep(5000);
    }

    public void selectLocalSsd() throws InterruptedException {
        localSsd.click();
        Thread.sleep(5000);
        localSsdModel.click();
        Thread.sleep(5000);
    }

    public void selectDataCenterLocation() throws InterruptedException {
        dataCenterLocation.click();
        Thread.sleep(5000);
        dataCenterLocationInFrankfurt.click();
        Thread.sleep(5000);
    }

    public void selectCommittedUsage() throws InterruptedException {
        committedUsage.click();
        Thread.sleep(5000);
        oneYearUsage.click();
        Thread.sleep(5000);
    }

    public void pushAddToEstimate() throws InterruptedException {

        //driver.findElement(addToEstimateButton).click();
        addToEstimateButton.click();
        Thread.sleep(5000);
    }

    public boolean checkInformationInVmClassIsRegular(){

        //driver.findElement(informationInVmClassIsRegular);
        System.out.println(informationInVmClassIsRegular.isDisplayed());
        return informationInVmClassIsRegular.isDisplayed();

    }

    public boolean checkInformationInInstanceTypeIncludeN1Standard8(){
        //driver.findElement(InformationInInstanceTypeIncludeN1Standard8);
        System.out.println(InformationInInstanceTypeIncludeN1Standard8.isDisplayed());
       return InformationInInstanceTypeIncludeN1Standard8.isDisplayed();

    }

    public boolean checkRegionIsFrankfurt(){

       // driver.findElement(regionIsFrankfurt);
        //WebElement regionIsFrankfurt1 = regionIsFrankfurt;
        System.out.println(regionIsFrankfurt.isDisplayed());
        return regionIsFrankfurt.isDisplayed();
    }


    public boolean checkLocalSsdSpace2x375Gib(){

        //driver.findElement(localSsdSpace2x375Gib);
        System.out.println(localSsdSpace2x375Gib.isDisplayed());
        return localSsdSpace2x375Gib.isDisplayed();

    }

    public boolean checkCommitmentTermOneYear(){

        //driver.findElement(commitmentTermOneYear);
        System.out.println(commitmentTermOneYear.isDisplayed());
        return commitmentTermOneYear.isDisplayed();
    }


}
