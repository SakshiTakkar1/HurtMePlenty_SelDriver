package com.epam.com;

import Service.CalculatorCreator;
import com.epam.com.model.Calculator;
import com.epam.com.model.CalculatorModel;
import com.epam.com.pageobject.CalculatorPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class HurtPlentyPOBTest extends BaseTest{



    @Test
    public void testWithPOM() throws InterruptedException, IOException {



        homePage.openCloudPage();
        homePage.clickOnSearch();
        homePage.googleSearch("Google Cloud Platform Pricing Calculator");
        searchResultGoogleCloudPage.clickOnGoogleCloudPlatformLink();
        calculatorPage.ComputeEngineFrame();
        calculatorPage.selectInstanceField(new CalculatorModel().getCalculatorData().getNumberOfInstances());

        calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();

    }
    @Test(dependsOnMethods = "testWithPOM")
    public void checkVMClassAssert()
    {
        SoftAssert softAssert = new SoftAssert();
        boolean regularActualValue = calculatorPage.clickOnCalculatorPageLink().checkInformationInVmClassIsRegular();
        boolean instanceTypeActualValue = calculatorPage.clickOnCalculatorPageLink().checkInformationInInstanceTypeIncludeN1Standard8();
        boolean frankfurtActualValue =  calculatorPage.clickOnCalculatorPageLink().checkRegionIsFrankfurt();
        boolean localSsdActualValue = calculatorPage.clickOnCalculatorPageLink().checkLocalSsdSpace2x375Gib();
        boolean commitmentTermActualValue = calculatorPage.clickOnCalculatorPageLink().checkCommitmentTermOneYear();
        softAssert.assertEquals(regularActualValue,true);
        softAssert.assertEquals(instanceTypeActualValue,true);
        softAssert.assertEquals(frankfurtActualValue,true);
        softAssert.assertEquals(localSsdActualValue, true);
        softAssert.assertEquals(commitmentTermActualValue, true);
        softAssert.assertAll();

    }

    // It will execute after every test execution
    @AfterMethod
    public void tearDown(ITestResult result) {
        // Here will compare if test is failing then only it will enter into if condition
        if(ITestResult.FAILURE==result.getStatus())
        {

            screenshotPage.captureScreenshot();
        }

    }


}



