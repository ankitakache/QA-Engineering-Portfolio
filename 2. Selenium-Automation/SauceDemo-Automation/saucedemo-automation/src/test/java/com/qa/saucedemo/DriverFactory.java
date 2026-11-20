
package com.qa.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver createDriver() {

        WebDriver driver = new ChromeDriver();

        // Wait after opening Chrome
        waitForSeconds(2);

        // Maximise browser
        driver.manage().window().maximize();

        // Wait after maximising
        waitForSeconds(2);

        return driver;
    }

    // Reusable pause method
    public static void waitForSeconds(int seconds) {

        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Browser wait was interrupted", e);
        }
    }
}
