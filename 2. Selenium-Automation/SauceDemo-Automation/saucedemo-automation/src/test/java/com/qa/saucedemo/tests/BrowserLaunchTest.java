
package com.qa.saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.saucedemo.BaseTest;

public class BrowserLaunchTest extends BaseTest {

    @Test
    public void verifySauceDemoPageTitle() {

        // Get the page title
        String actualTitle = driver.getTitle();

        // Print the page title
        System.out.println("Page Title: " + actualTitle);

        // Verify the page title
        Assert.assertEquals(
                actualTitle,
                "Swag Labs",
                "SauceDemo login page title is incorrect"
        );
    }
}

