package com.epam.com;

import com.epam.com.pageobject.CalculatorPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{


    @Test
    public void isPageVisible()
    {
        smokePage.testGooglePageAvailability();
    }


    @Test
    public void isHeaderVisible()
    {
        boolean googlePageHeaderValue = smokePage.testGooglePageHeader();
        Assert.assertEquals(googlePageHeaderValue, true);

    }

    @Test
    public void isCalculatorPageTitleVisible() throws InterruptedException {
        boolean calculatorPageTitleVisibleValue = smokePage.testCalculatorPageTitle();
        Assert.assertEquals(calculatorPageTitleVisibleValue, true);
    }

    @Test
    public void isInstanceTitleVisible() throws InterruptedException {
        boolean instanceTitleVisibleValue = smokePage.testInstanceTitle();
        Assert.assertEquals(instanceTitleVisibleValue, true);
    }




}
