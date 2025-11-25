
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsPage {
    private WebDriver driver;
    private By inventoryItems = By.cssSelector(".inventory_item");
    private By addToCartButtons = By.cssSelector("button.btn_inventory");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getProductsCount() {
        List<WebElement> items = driver.findElements(inventoryItems);
        return items.size();
    }

    public void addFirstProductToCart() {
        List<WebElement> buttons = driver.findElements(addToCartButtons);
        if (!buttons.isEmpty()) {
            buttons.get(0).click();
        }
    }

    public void openCart() {
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
    }
}
