
package com.qa.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.saucedemo.utils.WaitUtils;

public class CheckoutPage {

    private WebDriver driver;
    private WaitUtils waitUtils;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By confirmationMessage = By.className("complete-header");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public void enterFirstName(String firstName) {
        waitUtils.waitForElementVisible(firstNameField)
                .sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        waitUtils.waitForElementVisible(lastNameField)
                .sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        waitUtils.waitForElementVisible(postalCodeField)
                .sendKeys(postalCode);
    }

    public void clickContinue() {
        waitUtils.waitForElementClickable(continueButton).click();
    }

    public void clickFinish() {
        waitUtils.waitForElementClickable(finishButton).click();
    }

    public String getConfirmationMessage() {
        return waitUtils.waitForElementVisible(confirmationMessage)
                .getText();
    }
    public String getErrorMessage() {
    return waitUtils.waitForElementVisible(errorMessage).getText();
}
}
