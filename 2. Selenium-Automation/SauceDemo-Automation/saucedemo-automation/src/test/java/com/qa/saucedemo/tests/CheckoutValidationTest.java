
package com.qa.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.InventoryPage;
import com.qa.saucedemo.pages.CartPage;
import com.qa.saucedemo.pages.CheckoutPage;

public class CheckoutValidationTest extends BaseTest {

    @Test
    public void verifyCheckoutWithoutFirstName() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        System.out.println("URL after login: " + driver.getCurrentUrl());
System.out.println("Page title after login: " + driver.getTitle());

        // Add product to cart
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addFirstProductToCart();
        inventoryPage.openShoppingCart();

        // Open checkout
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        // Leave all customer fields empty
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickContinue();

        



        // Verify validation error
        String error = checkoutPage.getErrorMessage();

        Assert.assertEquals(
                error,
                "Error: First Name is required",
                "First name validation message is incorrect"
        );

        System.out.println("First name validation successful!");
    }

    @Test
    public void verifyCheckoutWithoutPostalCode() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Add product to cart
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addFirstProductToCart();
        inventoryPage.openShoppingCart();

        // Open checkout
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        // Enter first and last name, leave postal code empty
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterFirstName("Ankita");
        checkoutPage.enterLastName("Tester");

        checkoutPage.clickContinue();

        // Verify validation error
        String error = checkoutPage.getErrorMessage();

        Assert.assertEquals(
                error,
                "Error: Postal Code is required",
                "Postal code validation message is incorrect"
        );

        System.out.println("Postal code validation successful!");
    }
}
