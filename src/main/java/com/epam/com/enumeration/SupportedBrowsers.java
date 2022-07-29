package com.epam.com.enumeration;

import com.epam.com.invoker.WebDriverInvoker;
import com.epam.com.invoker.implementation.LocalChromeInvoker;
import com.epam.com.invoker.implementation.LocalFirefoxInvoker;
import com.epam.com.invoker.implementation.RemoteChromeInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {

    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker()),
    REMOTE_CHROME(new RemoteChromeInvoker());

    private WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver(){
        return webDriverInvoker.invokeWebDriver();
    }
}
