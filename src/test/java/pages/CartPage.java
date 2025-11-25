
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By checkoutBtn = By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductInCart(String name) {
        return driver.getPageSource().contains(name);
    }

    public void checkout() {
        driver.findElement(checkoutBtn).click();
    }
}
