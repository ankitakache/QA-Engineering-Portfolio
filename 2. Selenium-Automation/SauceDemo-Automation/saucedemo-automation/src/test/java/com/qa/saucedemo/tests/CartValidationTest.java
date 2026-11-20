
package com.qa.saucedemo.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.InventoryPage;
import com.qa.saucedemo.pages.CartPage;

public class CartValidationTest extends BaseTest {

    @Test
    public void verifyCartProductsAndRemoval() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Create InventoryPage object
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Add first and second products
        inventoryPage.addFirstProductToCart();
        inventoryPage.addSecondProductToCart();

        // Open shopping cart
        inventoryPage.openShoppingCart();

        // Create CartPage object
        CartPage cartPage = new CartPage(driver);

        // Verify two products are in cart
        List<WebElement> products = cartPage.getCartProductNames();

        Assert.assertEquals(
                products.size(),
                2,
                "Shopping cart should contain two products"
        );

        System.out.println("Two products verified in shopping cart!");

        // Print product names
        for (WebElement product : products) {
            System.out.println("Cart Product: " + product.getText());
        }

        // Remove first product
cartPage.removeFirstProduct();
System.out.println("Current cart URL: " + driver.getCurrentUrl());
System.out.println("Cart items after removal: "
        + driver.findElements(By.className("cart_item")).size());
System.out.println("Remove buttons after removal: "
        + driver.findElements(By.xpath("//button[text()='Remove']")).size());
// Wait until only one product remains
//cartPage.waitForCartItemCount(1);

// Verify one product remains
List<WebElement> remainingProducts =
        cartPage.getCartProductNames();
    }
}
