
package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.DriverFactory;

public class BaseTest {
    protected WebDriver driver;
    protected DriverFactory factory;

    @BeforeClass
    public void setUp() {
        factory = new DriverFactory();
        driver = factory.createDriver();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
