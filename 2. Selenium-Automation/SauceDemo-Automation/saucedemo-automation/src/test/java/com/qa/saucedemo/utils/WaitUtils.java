
package com.qa.saucedemo.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private WebDriverWait wait;

    // Constructor
    public WaitUtils(WebDriver driver) {

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }

    // Wait until element is visible
    public WebElement waitForElementVisible(By locator) {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    // Wait until element is clickable
    public WebElement waitForElementClickable(By locator) {

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }
    // Wait until element becomes invisible
public void waitForElementInvisible(By locator) {

    wait.until(
            ExpectedConditions.invisibilityOfElementLocated(locator)
    );
}
// Wait until cart item count matches expected count
public void waitForElementCount(By locator, int expectedCount) {

    wait.until(driver ->
            driver.findElements(locator).size() == expectedCount
    );
}
}
