package Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader(
                "C:\\Users\\Sakshi_Kumari\\IdeaProjects\\HurtMePlenty_SelDriver\\src\\test\\resources\\features\\browser.properties");
        Properties properties= new Properties();
        properties.load(fileReader);
        System.out.println(properties.getProperty("browser"));
    }

}
