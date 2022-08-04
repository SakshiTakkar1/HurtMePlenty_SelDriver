package com.epam.com.invoker.implementation;

import com.epam.com.invoker.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalEdgeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.edgedriver().setup();
        return new ChromeDriver();
    }
}
