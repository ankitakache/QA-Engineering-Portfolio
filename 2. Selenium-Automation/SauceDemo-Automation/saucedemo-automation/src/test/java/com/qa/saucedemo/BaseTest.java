
package com.qa.saucedemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest {

    // Shared browser driver
    protected WebDriver driver;
    protected Properties properties;


public void loadConfig() {

    properties = new Properties();

    try {
        FileInputStream file = new FileInputStream(
                "src/test/resources/config.properties"
        );

        properties.load(file);

        file.close();

    } catch (IOException e) {
        throw new RuntimeException("Could not load config.properties", e);
    }
}

    // Runs before each test method
    @BeforeMethod
public void setUp() {

    loadConfig();

driver = DriverFactory.createDriver();

    driver.get(properties.getProperty("baseUrl"));

DriverFactory.waitForSeconds(3);
}


    // Runs after each test method
    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
