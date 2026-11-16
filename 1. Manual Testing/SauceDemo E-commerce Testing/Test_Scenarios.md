
# TEST SCENARIOS
## SauceDemo E-commerce Application

| Document Details | Information |
|---|---|
| Project Name | SauceDemo E-commerce Testing |
| Document Type | Test Scenarios |
| Version | 1.0 |
| Prepared By | QA Tester |
| Application | https://www.saucedemo.com/ |

---

## 1. Login Functionality

| Scenario ID | Test Scenario | Priority |
|---|---|---|
| TS_001 | Verify login using valid credentials | High |
| TS_002 | Verify login using an invalid username | High |
| TS_003 | Verify login using an invalid password | High |
| TS_004 | Verify login with empty username and password | High |
| TS_005 | Verify login with empty username | High |
| TS_006 | Verify login with empty password | High |
| TS_007 | Verify appropriate error messages for unsuccessful login | Medium |
| TC_026 | Verify Logout functionality | High |

## 2. Product Inventory

| Scenario ID | Test Scenario | Priority |
|---|---|---|
| TS_008 | Verify that the inventory page displays available products | High |
| TS_009 | Verify product names, descriptions and prices | Medium |
| TS_010 | Verify product images are displayed correctly | Medium |
| TS_011 | Verify product sorting by name | Medium |
| TS_012 | Verify product sorting by price | Medium |
| TS_013 | Verify navigation to individual product details | Medium |

## 3. Shopping Cart

| Scenario ID | Test Scenario | Priority |
|---|---|---|
| TS_014 | Verify adding a product to the shopping cart | High |
| TS_015 | Verify removing a product from the shopping cart | High |
| TS_016 | Verify the cart badge updates after adding products | Medium |
| TS_017 | Verify selected products appear in the cart | High |
| TS_018 | Verify the cart remains accessible while navigating the application | Medium |

## 4. Checkout Functionality

| Scenario ID | Test Scenario | Priority |
|---|---|---|
| TS_019 | Verify navigation from cart to checkout | High |
| TS_020 | Verify checkout with valid customer information | High |
| TS_021 | Verify checkout with missing first name | High |
| TS_022 | Verify checkout with missing last name | High |
| TS_023 | Verify checkout with missing postal code | High |
| TS_024 | Verify order overview and price calculations | High |
| TS_025 | Verify successful order completion | High |

---

## 5. Additional Testing Considerations

The following areas will also be considered during detailed test execution:

- Navigation between application pages
- Appropriate error and validation messages
- Cart quantity and product consistency
- Checkout price calculations
- Logout and session behaviour
- Browser compatibility observations

## 6. Test Scenario Summary

| Module | Number of Scenarios |
|---|---:|
| Login and Logout Functionality | 8 |
| Product Inventory | 6 |
| Shopping Cart | 5 |
| Checkout Functionality | 7 |
| **Total** | **26** |

Note: Additional scenarios may be identified during exploratory testing.

## 7. Document Status

Document Version: 1.0

Status: Initial Draft

Prepared By: QA Tester
