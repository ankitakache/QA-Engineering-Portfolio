
package com.qa.saucedemo.pages;
import org.openqa.selenium.WebElement;
import com.qa.saucedemo.utils.WaitUtils;
import com.qa.saucedemo.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.saucedemo.DriverFactory;

public class LoginPage {

    // WebDriver reference
    private WebDriver driver;
    private WaitUtils waitUtils;


    // Locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    private By errorMessage = By.cssSelector("[data-test='error']");

    // Constructor
    public LoginPage(WebDriver driver) {
    this.driver = driver;
    this.waitUtils = new WaitUtils(driver);
}

    // Enter username
    public void enterUsername(String username) {

    WebElement usernameElement =
            waitUtils.waitForElementVisible(usernameField);

    usernameElement.sendKeys(username);
}

    // Enter password
   public void enterPassword(String password) {

    WebElement passwordElement =
            waitUtils.waitForElementVisible(passwordField);

    passwordElement.sendKeys(password);
}

    // Click login button
   public void clickLoginButton() {

    WebElement button =
            waitUtils.waitForElementClickable(loginButton);

    button.click();
}

    // Complete login action
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
    // Get login error message
public String getErrorMessage() {

    WebElement error =
            waitUtils.waitForElementVisible(errorMessage);

    return error.getText();
}
}

