
# DETAILED TEST CASES
## SauceDemo E-commerce Application

| Document Details | Information |
|---|---|
| Project | SauceDemo E-commerce Testing |
| Document Type | Detailed Test Cases |
| Version | 1.0 |
| Prepared By | QA Tester |

---

# MODULE 1: LOGIN FUNCTIONALITY

## Preconditions

1. SauceDemo application is accessible.
2. Google Chrome browser is available.
3. User is on the login page.
4. Required test data is available.

---

## TC_001: Verify login with valid credentials

| Field | Details |
|---|---|
| Test Case ID | TC_001 |
| Scenario ID | TS_001 |
| Priority | High |
| Test Type | Positive |
| Preconditions | User is on the login page |

**Test Steps**

1. Open https://www.saucedemo.com/
2. Enter valid username.
3. Enter valid password.
4. Click the Login button.

**Test Data**

- Username: standard_user
- Password: secret_sauce

**Expected Result**

User should successfully log in and navigate to the Products inventory page.

**Actual Result**

Login successful. Inventory page opened successfully.

**Execution Status: PASS**

---

## TC_002: Verify login with invalid username

| Field | Details |
|---|---|
| Test Case ID | TC_002 |
| Scenario ID | TS_002 |
| Priority | High |
| Test Type | Negative |

**Test Steps**

1. Open the SauceDemo login page.
2. Enter an invalid username.
3. Enter a valid password.
4. Click Login.

**Test Data**

- Username: invalid_user
- Password: secret_sauce

**Expected Result**

Application should prevent login and display an appropriate error message.

**Actual Result**

Login was rejected. The application displayed:
"Epic sadface: Username and password do not match any user in this service."

**Execution Status: PASS**

---

## TC_003: Verify login with invalid password

| Field | Details |
|---|---|
| Test Case ID | TC_003 |
| Scenario ID | TS_003 |
| Priority | High |
| Test Type | Negative |

**Test Steps**

1. Open the SauceDemo login page.
2. Enter a valid username.
3. Enter an invalid password.
4. Click Login.

**Test Data**

- Username: standard_user
- Password: wrong_password

**Expected Result**

Application should prevent login and display an appropriate error message.

**Actual Result**

Login was rejected. The application displayed:
"Epic sadface: Username and password do not match any user in this service."

**Execution Status: PASS**

---

## TC_004: Verify login with both fields empty

| Field | Details |
|---|---|
| Test Case ID | TC_004 |
| Scenario ID | TS_004 |
| Priority | High |
| Test Type | Negative |

**Test Steps**

1. Open the SauceDemo login page.
2. Leave the username field empty.
3. Leave the password field empty.
4. Click Login.

**Test Data**

- Username: Empty
- Password: Empty

**Expected Result**

Application should prevent login and display an appropriate validation message.

**Actual Result**

Login was prevented. The application displayed:
"Epic sadface: Username is required"

**Execution Status: PASS**

---

## TC_005: Verify login with empty username

| Field | Details |
|---|---|
| Test Case ID | TC_005 |
| Scenario ID | TS_005 |
| Priority | High |
| Test Type | Negative |

**Test Steps**

1. Open the SauceDemo login page.
2. Leave the username field empty.
3. Enter a valid password.
4. Click Login.

**Test Data**

- Username: Empty
- Password: secret_sauce

**Expected Result**

Application should prevent login and display an appropriate validation message.

**Actual Result**

Login was prevented. The application displayed:
"Epic sadface: Username is required"

**Execution Status: PASS**

---

## TC_006: Verify login with empty password

| Field | Details |
|---|---|
| Test Case ID | TC_006 |
| Scenario ID | TS_006 |
| Priority | High |
| Test Type | Negative |

**Test Steps**

1. Open the SauceDemo login page.
2. Enter a valid username.
3. Leave the password field empty.
4. Click Login.

**Test Data**

- Username: standard_user
- Password: Empty

**Expected Result**

Application should prevent login and display an appropriate validation message.

**Actual Result**

Login was prevented. The application displayed:
"Epic sadface: Password is required"

**Execution Status: PASS**

---

## TC_007: Verify error message for unsuccessful login

| Field | Details |
|---|---|
| Test Case ID | TC_007 |
| Scenario ID | TS_007 |
| Priority | Medium |
| Test Type | Negative |

**Test Steps**

1. Open the SauceDemo login page.
2. Enter invalid login credentials.
3. Click Login.
4. Observe the error message.
5. Verify that the error message is visible and understandable.
6. Check whether the user remains on the login page.

**Test Data**

- Username: invalid_user
- Password: wrong_password

**Expected Result**

An appropriate error message should be displayed and the user should remain on the login page.

**Actual Result**

The application displayed the error message:
"Epic sadface: Username and password do not match any user in this service"

The error message was visible to the user.

**Execution Status: PASS**

---

## LOGIN MODULE SUMMARY

| Test Case ID | Description | Status |
|---|---|---|
| TC_001 | Valid login | PASS |
| TC_002 | Invalid username | PASS |
| TC_003 | Invalid password | PASS |
| TC_004 | Both fields empty | PASS |
| TC_005 | Empty username | PASS |
| TC_006 | Empty password | PASS |
| TC_007 | Error message validation | PASS |

Total Test Cases: 7

Executed: 7

Passed: 7

Failed: 0

Not Executed: 0


# MODULE 2: PRODUCT INVENTORY

## TC_008: Verify product listing

| Field | Details |
|---|---|
| Test Case ID | TC_008 |
| Scenario ID | TS_008 |
| Priority | High |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is displayed.

**Test Steps**

1. Log in using valid credentials.
2. Observe the Products page.
3. Count the displayed products.
4. Verify product names and images.
5. Verify product prices.
6. Verify Add to cart buttons.

**Test Data**

- Username: standard_user
- Password: secret_sauce

**Expected Result**

The inventory page should display six products with their names, images, prices and Add to cart buttons.

**Actual Result**

Six products were displayed with their prices and Add to cart buttons.

**Execution Status: PASS**


## TC_009: Verify product names, descriptions and prices

| Field | Details |
|---|---|
| Test Case ID | TC_009 |
| Scenario ID | TS_009 |
| Priority | Medium |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is displayed.

**Test Steps**

1. Open the Products inventory page.
2. Observe all displayed products.
3. Verify each product name.
4. Verify each product description.
5. Verify each product price.

**Expected Result**

All six products should display their correct names, descriptions and prices clearly.

**Actual Result**

All six products displayed their names, descriptions and prices clearly.

**Execution Status: PASS**



## TC_010: Verify product images

| Field | Details |
|---|---|
| Test Case ID | TC_010 |
| Scenario ID | TS_010 |
| Priority | Medium |
| Test Type | UI / Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is displayed.

**Test Steps**

1. Open the Products inventory page.
2. Observe all six product images.
3. Verify that each image loads successfully.
4. Check for broken or missing images.
5. Verify that each image corresponds to its product.

**Expected Result**

All six product images should load successfully and correspond to their respective products.

**Actual Result**

All six product images were displayed correctly. No missing or broken images were observed.

**Execution Status: PASS**

## TC_011: Verify product sorting by name (A–Z)

| Field | Details |
|---|---|
| Test Case ID | TC_011 |
| Scenario ID | TS_011 |
| Priority | Medium |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is displayed.

**Test Steps**

1. Open the Products inventory page.
2. Locate the product sorting dropdown.
3. Select Name (A to Z).
4. Observe the displayed product order.
5. Verify that products are arranged alphabetically.

**Expected Result**

Products should be displayed in alphabetical ascending order (A–Z).

**Actual Result**

Products were displayed in alphabetical order after selecting Name (A–Z).

**Execution Status: PASS**


## TC_012: Verify product sorting by price (Low to High)

| Field | Details |
|---|---|
| Test Case ID | TC_012 |
| Scenario ID | TS_012 |
| Priority | Medium |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is displayed.

**Test Steps**

1. Open the Products inventory page.
2. Locate the product sorting dropdown.
3. Select Price (low to high).
4. Observe the displayed product order.
5. Verify that products are arranged from lowest to highest price.

**Expected Result**

Products should be displayed in ascending order of price.

**Actual Result**

Products were displayed in low-to-high price order after selecting the sorting option.

**Execution Status: PASS**


## TC_013: Verify navigation to individual product details

| Field | Details |
|---|---|
| Test Case ID | TC_013 |
| Scenario ID | TS_013 |
| Priority | Medium |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is displayed.

**Test Steps**

1. Open the Products inventory page.
2. Select Sauce Labs Backpack.
3. Click the product name.
4. Verify the product details page.
5. Verify product name, description, image and price.
6. Verify Add to cart button.
7. Verify Back to products navigation.

**Expected Result**

The individual product details page should display the correct product information and provide the required navigation options.

**Actual Result**

The product details page opened successfully. All six checks were completed successfully.

**Execution Status: PASS**

# MODULE 3: SHOPPING CART

## TC_014: Verify adding a product to the shopping cart

| Field | Details |
|---|---|
| Test Case ID | TC_014 |
| Scenario ID | TS_014 |
| Priority | High |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is accessible.
3. Product details page is displayed.

**Test Steps**

1. Open the Sauce Labs Backpack details page.
2. Click the Add to cart button.
3. Observe the button text.
4. Check the shopping cart badge.

**Test Data**

Product: Sauce Labs Backpack

**Expected Result**

1. Product should be added to the shopping cart.
2. Add to cart button should change to Remove.
3. Shopping cart badge should display 1.

**Actual Result**

Product was added successfully. The button changed to Remove and the shopping cart badge displayed 1.

**Execution Status: PASS**


## TC_015: Verify removing a product from the shopping cart

| Field | Details |
|---|---|
| Test Case ID | TC_015 |
| Scenario ID | TS_015 |
| Priority | High |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Sauce Labs Backpack is added to the cart.

**Test Steps**

1. Open the Sauce Labs Backpack details page.
2. Click the Remove button.
3. Observe the button text.
4. Check the shopping cart badge.
5. Open the shopping cart.
6. Verify that the product is no longer displayed.

**Expected Result**

1. Product should be removed from the cart.
2. Button should change back to Add to cart.
3. Cart badge should display 0 or disappear.
4. Shopping cart should be empty.

**Actual Result**

Product was removed successfully. Button changed to Add to cart, cart badge changed to 0, and the shopping cart was empty.

**Execution Status: PASS**


## TC_016: Verify cart badge updates after adding products

| Field | Details |
|---|---|
| Test Case ID | TC_016 |
| Scenario ID | TS_016 |
| Priority | Medium |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Shopping cart is empty.

**Test Steps**

1. Navigate to the Products page.
2. Add Sauce Labs Backpack to the cart.
3. Observe the cart badge.
4. Add Sauce Labs Bike Light.
5. Observe the cart badge.
6. Add Sauce Labs Bolt T-Shirt.
7. Observe the cart badge after each addition.

**Expected Result**

Cart badge should update correctly:
- After first product: 1
- After second product: 2
- After third product: 3

**Actual Result**

The cart badge updated after each product addition.

**Execution Status: PASS**


## TC_017: Verify selected products appear in the shopping cart

| Field | Details |
|---|---|
| Test Case ID | TC_017 |
| Scenario ID | TS_017 |
| Priority | High |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Three products have been added to the cart.

**Test Steps**

1. Add Sauce Labs Backpack to the cart.
2. Add Sauce Labs Bike Light to the cart.
3. Add Sauce Labs Bolt T-Shirt to the cart.
4. Click the shopping cart icon.
5. Verify all selected products are displayed.
6. Verify product names, descriptions and prices.
7. Verify product quantities.

**Expected Result**

All three selected products should appear in the cart with their correct names, descriptions, prices and quantities.


**Actual Result**

All three products were displayed in the cart with their descriptions and prices.

The quantity displayed for each product was 1.

**Execution Status: PASS**



# MODULE 4: CHECKOUT FUNCTIONALITY

## TC_019: Verify navigation from Cart to Checkout

| Field | Details |
|---|---|
| Test Case ID | TC_019 |
| Scenario ID | TS_019 |
| Priority | High |
| Test Type | Functional |

**Preconditions**

1. User is logged in successfully.
2. Products have been added to the shopping cart.
3. Shopping cart page is displayed.

**Test Steps**

1. Open the shopping cart.
2. Verify that selected products are displayed.
3. Click the Checkout button.
4. Observe the checkout information page.
5. Verify First Name, Last Name and Postal Code fields.

**Expected Result**

Application should navigate to the Checkout: Your Information page and display all three required fields.

**Actual Result**

Checkout: Your Information page opened successfully. First Name, Last Name and Postal Code fields were displayed.

**Execution Status: PASS**


## TC_020: Verify checkout with valid customer information

| Field | Details |
|---|---|
| Test Case ID | TC_020 |
| Scenario ID | TS_020 |
| Priority | High |
| Test Type | Positive |

**Preconditions**

1. User is logged in successfully.
2. Products are available in the shopping cart.
3. Checkout information page is displayed.

**Test Steps**

1. Enter First Name: Ankita.
2. Enter Last Name: Tester.
3. Enter Postal Code: WV1 1AA.
4. Click Continue.
5. Observe the next page.

**Expected Result**

Application should accept valid customer information and navigate to the Checkout Overview page.

**Actual Result**

Application accepted the customer information and navigated to the Checkout Overview page successfully.

**Execution Status: PASS**

## TC_024: Verify order overview and price calculations

| Field | Details |
|---|---|
| Test Case ID | TC_024 |
| Scenario ID | TS_024 |
| Priority | High |
| Test Type | Functional / Calculation Validation |

**Preconditions**

1. User is logged in successfully.
2. Three products are added to the shopping cart.
3. Customer information has been submitted.
4. Checkout Overview page is displayed.

**Test Steps**

1. Open the Checkout Overview page.
2. Verify that all three selected products are displayed.
3. Verify individual product prices.
4. Observe the Item Total.
5. Observe the Tax amount.
6. Observe the Final Total.
7. Independently calculate Item Total + Tax.
8. Compare the calculated amount with the displayed Total.

**Expected Result**

1. All selected products should be displayed correctly.
2. Item Total should be $55.97.
3. Tax should be $4.48.
4. Final Total should be $60.45.
5. Final Total should equal Item Total + Tax.

**Actual Result**

All three products were displayed in the Checkout Overview.

Item Total: $55.97

Tax: $4.48

Displayed Total: $60.45

Calculated Total: $55.97 + $4.48 = $60.45

The displayed total matched the independently calculated amount.

**Execution Status: PASS**

## TC_021: Verify checkout with missing First Name

| Field | Details |
|---|---|
| Test Case ID | TC_021 |
| Scenario ID | TS_021 |
| Priority | High |
| Test Type | Negative |

**Preconditions**

1. User is logged in successfully.
2. Products are available in the shopping cart.
3. Checkout information page is displayed.

**Test Steps**

1. Leave First Name empty.
2. Enter Last Name: Tester.
3. Enter Postal Code: WV1 1AA.
4. Click Continue.
5. Observe the validation message.

**Expected Result**

Application should prevent checkout and display an appropriate First Name validation message.

**Actual Result**

Application prevented checkout and displayed:
"Error: First Name is required"

**Execution Status: PASS**


## TC_022: Verify checkout with missing Last Name

| Field | Details |
|---|---|
| Test Case ID | TC_022 |
| Scenario ID | TS_022 |
| Priority | High |
| Test Type | Negative |

**Preconditions**

1. User is logged in successfully.
2. Products are available in the shopping cart.
3. Checkout information page is displayed.

**Test Steps**

1. Enter First Name: Ankita.
2. Leave Last Name empty.
3. Enter Postal Code: WV1 1AA.
4. Click Continue.
5. Observe the validation message.

**Expected Result**

Application should prevent checkout and display an appropriate Last Name validation message.

**Actual Result**

Application prevented checkout and displayed:
"Error: Last Name is required"

**Execution Status: PASS**


## TC_023: Verify checkout with missing Postal Code

| Field | Details |
|---|---|
| Test Case ID | TC_023 |
| Scenario ID | TS_023 |
| Priority | High |
| Test Type | Negative |

**Preconditions**

1. User is logged in successfully.
2. Products are available in the shopping cart.
3. Checkout information page is displayed.

**Test Steps**

1. Enter First Name: Ankita.
2. Enter Last Name: Tester.
3. Leave Postal Code empty.
4. Click Continue.
5. Observe the validation message.

**Expected Result**

Application should prevent checkout and display an appropriate Postal Code validation message.

**Actual Result**

Application prevented checkout and displayed:
"Error: Postal Code is required"

**Execution Status: PASS**


## TC_025: Verify successful order completion

| Field | Details |
|---|---|
| Test Case ID | TC_025 |
| Scenario ID | TS_025 |
| Priority | High |
| Test Type | End-to-End |

**Preconditions**

1. User is logged in successfully.
2. Products are added to the shopping cart.
3. Valid customer information is submitted.
4. Checkout Overview page is displayed.

**Test Steps**

1. Verify selected products in Checkout Overview.
2. Verify item total, tax and final total.
3. Click Finish.
4. Observe the order confirmation page.
5. Verify the confirmation message.
6. Verify the order dispatch message.

**Expected Result**

The application should complete the order successfully and display an order confirmation message indicating successful completion and dispatch.

**Actual Result**

The application displayed a green confirmation tick and the message:

"Thank you for your order!"

The following dispatch message was displayed:

"Your order has been dispatched, and will arrive just as fast as the pony can get there!"

**Execution Status: PASS**


## TC_026: Verify Logout functionality

| Field | Details |
|---|---|
| Test Case ID | TC_026 |
| Scenario ID | TS_026 |
| Priority | High |
| Test Type | Functional / Security Validation |

**Preconditions**

1. User is logged in successfully.
2. Products inventory page is accessible.

**Test Steps**

1. Open the application menu.
2. Click Logout.
3. Verify that the login page is displayed.
4. Enter the inventory page URL directly in the browser.
5. Verify whether the application allows access without authentication.

**Expected Result**

1. User should be logged out successfully.
2. Application should navigate to the login page.
3. Access to the inventory page should be restricted until the user logs in again.

**Actual Result**

Logout successfully returned the user to the login page.

Direct access to the inventory page without logging in was not allowed.

**Execution Status: PASS**


