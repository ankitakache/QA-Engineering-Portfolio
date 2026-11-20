
package com.qa.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;
import com.qa.saucedemo.pages.LoginPage;
import com.qa.saucedemo.pages.InventoryPage;
import com.qa.saucedemo.pages.CartPage;
import com.qa.saucedemo.pages.CheckoutPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifySuccessfulCheckout() {

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Step 2: Add product to cart
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addFirstProductToCart();

        // Step 3: Open shopping cart
        inventoryPage.openShoppingCart();

        // Step 4: Click checkout
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();



        

        // Step 5: Enter customer details
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        checkoutPage.enterFirstName("Ankita");
        checkoutPage.enterLastName("Tester");
        checkoutPage.enterPostalCode("WV1 1AA");

        checkoutPage.clickContinue();




        // Step 6: Finish checkout
        checkoutPage.clickFinish();

        // Step 7: Verify order confirmation
        String confirmation = checkoutPage.getConfirmationMessage();

        Assert.assertEquals(
                confirmation,
                "Thank you for your order!",
                "Order confirmation message is incorrect"
        );

        System.out.println("Checkout completed successfully!");
    }
}
