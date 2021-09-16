package FileWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\FileWorks\\config.data"));

        String BaseUrl = properties.getProperty("BaseUrl");
        String parameter = properties.getProperty("parameter");
        String value = properties.getProperty("value");

        System.out.println(BaseUrl + "/?" + parameter + "=" + value);

    }
}
