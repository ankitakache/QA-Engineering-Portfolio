
package com.qa.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.saucedemo.utils.WaitUtils;

public class CartPage {

    private WebDriver driver;
    private WaitUtils waitUtils;

    private By cartItems = By.className("cart_item");
    private By cartProductNames =
            By.className("inventory_item_name");

    private By removeButtons =
            By.xpath("//button[text()='Remove']");

    private By continueShoppingButton =
            By.id("continue-shopping");

    private By checkoutButton =
            By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public List<WebElement> getCartProductNames() {
        waitUtils.waitForElementVisible(cartItems);
        return driver.findElements(cartProductNames);
    }

    public void removeFirstProduct() {
        List<WebElement> buttons =
                driver.findElements(removeButtons);

        buttons.get(0).click();
    }

    public void waitForCartItemCount(int expectedCount) {
        waitUtils.waitForElementCount(cartItems, expectedCount);
    }

    public void clickContinueShopping() {
        waitUtils.waitForElementClickable(
                continueShoppingButton).click();
    }

    public void clickCheckout() {
    waitUtils.waitForElementClickable(checkoutButton).click();
}
}
