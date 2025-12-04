
package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DriverFactory {

    public WebDriver createDriver() {
        try {
            Properties props = new Properties();
            InputStream is = getClass().getClassLoader().getResourceAsStream("config.properties");
            props.load(is);
            boolean headless = Boolean.parseBoolean(props.getProperty("headless","false"));

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--headless=new");   // IMPORTANT FOR GITHUB ACTIONS

return new ChromeDriver(options);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
