
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.io.InputStream;
import java.util.Properties;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() throws Exception {
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
        int count = products.getProductsCount();
        Assert.assertTrue(count > 0, "Expected at least one product on products page");

        products.addFirstProductToCart();
        products.openCart();

        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.isProductInCart("Sauce"), "Expected product name to be present in cart page");
    }
}
