package com.epam.com.factory;

import com.epam.com.properties.converters.SupportedBrowserConverter;
import com.epam.com.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {

    public WebDriver getWebDriver() {
//        String propertyValue = new PropertyHolder().readProperty("browser");
//        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);
//
//        return browser.getWebDriver();
        return SupportedBrowserConverter.valueOfWebBrowser(
                        new PropertyHolder().readProperty("browser"))
                .getWebDriver();
    }
}
