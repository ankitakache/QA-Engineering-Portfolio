
package com.qa.saucedemo.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.InventoryPage;

public class InventoryTest extends BaseTest {

    @Test
    public void verifyInventoryProducts() {

        // Login to SauceDemo
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

        // Create InventoryPage object
        InventoryPage inventoryPage = new InventoryPage(driver);

        // Verify inventory page title
        Assert.assertEquals(
                inventoryPage.getInventoryTitle(),
                "Products",
                "Inventory page title is incorrect"
        );

        // Retrieve product names
        List<WebElement> products = inventoryPage.getProductNames();

        // Retrieve product prices
        List<WebElement> prices = inventoryPage.getProductPrices();

        // Print product names and prices
        System.out.println("----- INVENTORY PRODUCTS -----");

        for (int i = 0; i < products.size(); i++) {

            System.out.println(
                    products.get(i).getText()
                    + " - "
                    + prices.get(i).getText()
            );
        }

        // Verify products are displayed
        Assert.assertTrue(
                products.size() > 0,
                "No products are displayed in the inventory"
        );

        // Verify product and price counts match
        Assert.assertEquals(
                products.size(),
                prices.size(),
                "Product and price counts do not match"
        );

        System.out.println("Inventory validation successful!");
    }
}
