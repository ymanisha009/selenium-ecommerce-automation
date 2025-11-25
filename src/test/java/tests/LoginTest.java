
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.InputStream;
import java.util.Properties;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginShouldSucceed() throws Exception {
        // load config
        Properties props = new Properties();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            props.load(is);
        }
        String url = props.getProperty("base.url");
        String user = props.getProperty("username");
        String pass = props.getProperty("password");

        LoginPage login = new LoginPage(driver);
        login.open(url);
        login.login(user, pass);

        // after login, inventory page should show products
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Expected to be on inventory page after login");
    }

    @Test
    public void invalidLoginShouldShowError() throws Exception {
        Properties props = new Properties();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            props.load(is);
        }
        String url = props.getProperty("base.url");

        LoginPage login = new LoginPage(driver);
        login.open(url);
        login.login("baduser","badpass");

        String err = login.getError();
        Assert.assertNotNull(err, "Expected an error message for invalid login");
    }
}
