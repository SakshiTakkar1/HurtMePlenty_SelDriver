package com.epam.com.pageobject;

import com.epam.com.pageobject.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotPage extends BasePage {

    public ScreenshotPage(WebDriver driver) {

        super(driver);
    }

    public void captureScreenshot()
    {



            // Create refernce of TakesScreenshot
            TakesScreenshot ts=(TakesScreenshot)driver;



            // Copy method  specific location here it will save all screenshot in our project home directory and
            // result.getName() will return name of test case so that screenshot name will be same
            try {
                FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(".//tfolder/screenshots/" + timestamp() + ".png"));
            } catch (WebDriverException e) {

            } catch (IOException e) {

            }
            }



    public static String timestamp() {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

}
