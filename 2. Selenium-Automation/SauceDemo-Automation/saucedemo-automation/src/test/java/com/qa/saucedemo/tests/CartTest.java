
package com.qa.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.InventoryPage;

public class CartTest extends BaseTest {

    @Test
    public void verifyAddingProductsToCart() {

        // Login to SauceDemo
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        // Create InventoryPage object
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Add first product
        inventoryPage.addFirstProductToCart();

        // Verify cart count is 1
        Assert.assertEquals(
                inventoryPage.getShoppingCartCount(),
                "1",
                "Cart count should be 1 after adding the first product"
        );

        System.out.println("First product added successfully!");

        // Add second product
        inventoryPage.addSecondProductToCart();

        // Verify cart count is 2
        Assert.assertEquals(
                inventoryPage.getShoppingCartCount(),
                "2",
                "Cart count should be 2 after adding the second product"
        );

        System.out.println("Second product added successfully!");

        System.out.println("Shopping cart validation successful!");
    }
}
