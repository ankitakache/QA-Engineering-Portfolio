
package com.qa.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;
import com.qa.saucedemo.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifySuccessfulLogin() {

        // Create LoginPage object
        LoginPage loginPage = new LoginPage(driver);

        // Enter username and password and click Login
        loginPage.login("standard_user", "secret_sauce");

        // Verify successful login
        Assert.assertTrue(
                driver.getCurrentUrl().contains("inventory.html"),
                "Login failed! User was not redirected to the inventory page."
        );

        System.out.println("Login successful!");
    }


@Test
public void verifyInvalidLogin() {

    // Create LoginPage object
    LoginPage loginPage = new LoginPage(driver);

    // Attempt login with invalid credentials
    loginPage.login("invalid_user", "wrong_password");

    // Capture the error message
    String actualErrorMessage = loginPage.getErrorMessage();

    // Expected error message
    String expectedErrorMessage =
            "Epic sadface: Username and password do not match any user in this service";

    // Verify the error message
    Assert.assertEquals(
            actualErrorMessage,
            expectedErrorMessage,
            "Incorrect error message displayed"
    );

    System.out.println("Invalid login validation successful!");
}

}



