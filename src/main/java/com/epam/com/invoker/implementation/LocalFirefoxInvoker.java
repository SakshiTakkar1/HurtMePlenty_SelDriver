package com.epam.com.invoker.implementation;

import com.epam.com.invoker.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class LocalFirefoxInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.firefoxdriver().setup();
//        File pathBinary = new File("C:\\Users\\Sakshi_Kumari\\Downloads\\firefox.exe");
//        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//        FirefoxOptions options = new FirefoxOptions();
//        options.setBinary(firefoxBinary);
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sakshi_Kumari\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver(options);
        return new FirefoxDriver();
    }
}
