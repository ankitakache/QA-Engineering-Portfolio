
package com.qa.saucedemo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.saucedemo.utils.WaitUtils;

public class InventoryPage {

    private WebDriver driver;
    private WaitUtils waitUtils;

    // Locators
    private By inventoryTitle = By.className("title");

    private By productNames =By.className("inventory_item_name");

    private By productPrices =By.className("inventory_item_price");

    private By addToCartButtons =By.xpath("//button[text()='Add to cart']");

    private By shoppingCartBadge =By.className("shopping_cart_badge");
    private By shoppingCartLink = By.className("shopping_cart_link");

    // Constructor
    public InventoryPage(WebDriver driver) {

        this.driver = driver;

        this.waitUtils = new WaitUtils(driver);
    }

    // Get inventory page title
    public String getInventoryTitle() {

        WebElement title =
                waitUtils.waitForElementVisible(inventoryTitle);

        return title.getText();
    }

    // Get all product names
    public List<WebElement> getProductNames() {

        waitUtils.waitForElementVisible(productNames);

        return driver.findElements(productNames);
    }

    // Get all product prices
    public List<WebElement> getProductPrices() {

        waitUtils.waitForElementVisible(productPrices);

        return driver.findElements(productPrices);
    }

    // Add first product to cart
   
// Add first product to cart
public void addFirstProductToCart() {
    waitUtils.waitForElementClickable(addToCartButtons).click();
}

// Add second product to cart
public void addSecondProductToCart() {

    List<WebElement> buttons =
            driver.findElements(addToCartButtons);

    buttons.get(1).click();
}


    // Get shopping cart count
    public String getShoppingCartCount() {

        WebElement badge =
                waitUtils.waitForElementVisible(shoppingCartBadge);

        return badge.getText();
    }

    // Open shopping cart
public void openShoppingCart() {

    waitUtils.waitForElementClickable(shoppingCartLink).click();
}
}
