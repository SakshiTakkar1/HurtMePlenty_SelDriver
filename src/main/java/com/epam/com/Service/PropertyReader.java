package com.epam.com.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String readProperty(String key) throws IOException {
        FileReader fileReader= new FileReader(
                "C:\\Users\\Sakshi_Kumari\\IdeaProjects\\HurtMePlenty_SelDriver\\src\\test\\resources\\qa.properties");
        Properties properties= new Properties();
        properties.load(fileReader);
        return properties.getProperty(key);
    }

}
