# SauceDemo Selenium Automation Framework

## Project Overview

This project is an automated UI testing framework developed using Selenium WebDriver, Java, TestNG and Maven.

The framework automates key user journeys on the SauceDemo e-commerce application, including login, product inventory, shopping cart operations and checkout functionality.

The project follows the Page Object Model (POM) design pattern to improve code reusability, maintainability and readability.

## Tools and Technologies

| Technology | Purpose |
|---|---|
| Java 25 | Programming language |
| Selenium WebDriver 4.52.0 | Browser automation |
| TestNG 7.12.0 | Test execution and assertions |
| Maven 3.10.1 | Build and dependency management |
| Chrome | Browser under test |
| VS Code | Development environment |
| Git and GitHub | Version control and project hosting |

## Framework Architecture

The project follows the Page Object Model (POM).

```text
saucedemo-automation
│
├── pom.xml
├── README.md
│
└── src
    └── test
        ├── java
        │   └── com.qa.saucedemo
        │       │
        │       ├── pages
        │       │   ├── LoginPage.java
        │       │   ├── InventoryPage.java
        │       │   ├── CartPage.java
        │       │   └── CheckoutPage.java
        │       │
        │       ├── tests
        │       │   ├── BrowserLaunchTest.java
        │       │   ├── LoginTest.java
        │       │   ├── InventoryTest.java
        │       │   ├── CartTest.java
        │       │   ├── CartValidationTest.java
        │       │   ├── CheckoutTest.java
        │       │   └── CheckoutValidationTest.java
        │       │
        │       ├── utils
        │       │   └── WaitUtils.java
        │       │
        │       ├── BaseTest.java
        │       └── DriverFactory.java
        │
        └── resources
            └── config.properties
```

## Test Scenarios Covered

### 1. Browser Launch Testing
- Verify that the SauceDemo application launches successfully.
- Validate the application page title.

### 2. Login Testing
- Verify successful login with valid credentials.
- Verify login failure with invalid credentials.
- Validate appropriate error messages.

### 3. Inventory Testing
- Verify inventory page navigation.
- Validate product names and prices.
- Verify product information is displayed correctly.

### 4. Shopping Cart Testing
- Add products to the shopping cart.
- Verify cart item count.
- Validate products displayed in the cart.
- Remove products from the cart.

### 5. Checkout Testing
- Complete the checkout process successfully.
- Verify order confirmation.
- Validate checkout behaviour when the first name is missing.
- Validate checkout behaviour when the postal code is missing.

## Framework Features

- Page Object Model (POM) implementation.
- Reusable browser driver management.
- Centralised test setup and teardown using TestNG annotations.
- Explicit waits using Selenium WebDriverWait.
- Reusable wait utility methods.
- External application configuration using `config.properties`.
- Maven-based test execution.
- HTML test execution reporting using Maven Surefire Report Plugin.

## Prerequisites

Ensure the following are installed:

- Java JDK
- Apache Maven
- Google Chrome
- Git

## How to Run the Tests

Clone the repository:

```bash
git clone https://github.com/ankitakache/QA-Engineering-Portfolio.git
```

Navigate to the Selenium project directory:

```bash
cd "QA-Engineering-Portfolio/2. Selenium-Automation/SauceDemo-Automation/saucedemo-automation"
```

Execute the complete test suite:

```bash
mvn clean test
```

## Generate HTML Test Report

Run the following command:

```bash
mvn surefire-report:report
```

The generated report is available at:

```text
target/reports/surefire.html
```

## Test Execution Results

**Latest successful full test execution:**

| Metric | Result |
|---|---:|
| Total Tests | 9 |
| Passed | 9 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Success Rate | 100% |

All nine automated tests passed in the latest successful full-suite execution.

## Application Under Test

SauceDemo: https://www.saucedemo.com/

## Author

QA Automation Portfolio Project

Created as part of a practical QA Engineering portfolio to demonstrate UI automation, test design, framework development and test reporting skills.