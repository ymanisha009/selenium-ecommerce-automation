
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.InputStream;
import java.util.Properties;

public class CheckoutTest extends BaseTest {

    @Test
    public void completeCheckoutFlow() throws Exception {
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

        ProductsPage products = new ProductsPage(driver);
        products.addFirstProductToCart();
        products.openCart();

        CartPage cart = new CartPage(driver);
        cart.checkout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillInformation("John","Doe","12345");
        checkout.finishCheckout();

        String msg = checkout.getCompleteMessage();
        Assert.assertTrue(msg.contains("THANK YOU"), "Expected completion message after finishing checkout");
    }
}
