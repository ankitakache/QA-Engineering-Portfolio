
# TEST EXECUTION REPORT
## SauceDemo E-commerce Application

| Document Details | Information |
|---|---|
| Project Name | SauceDemo E-commerce Testing |
| Document Type | Test Execution Report |
| Version | 1.0 |
| Prepared By | QA Tester |
| Application | https://www.saucedemo.com/ |
| Testing Type | Manual Testing |
| Test Environment | Windows 11 / Google Chrome |

---

## 1. Executive Summary

Manual testing was performed on the SauceDemo
e-commerce web application.

The testing covered login functionality, product
inventory, shopping cart operations and checkout
functionality.

A total of 26 test cases were executed based on
the planned test scenarios.

The test results were recorded by comparing actual
application behaviour against expected results.

## 2. Test Execution Summary

| Metric | Result |
|---|---:|
| Total Test Cases | 26 |
| Executed | 26 |
| Passed | 26 |
| Failed | 0 |
| Blocked | 0 |
| Not Executed | 0 |
| Execution Rate | 100% |
| Pass Rate | 100% |

Note: Results reflect the execution observations
recorded during this testing exercise.

## 3. Module-wise Execution Results

| Module | Test Cases | Executed | Passed | Failed |
|---|---:|---:|---:|---:|
| Login and Logout Functionality | 8 | 8 | 8 | 0 |
| Product Inventory | 6 | 6 | 6 | 0 |
| Shopping Cart | 5 | 5 | 5 | 0 |
| Checkout Functionality | 7 | 7 | 7 | 0 |
| **Total** | **26** | **26** | **26** | **0** |

## 4. Detailed Test Execution Results

| Test Case ID | Test Description | Status |
|---|---|---|
| TC_001 | Valid login | PASS |
| TC_002 | Invalid username | PASS |
| TC_003 | Invalid password | PASS |
| TC_004 | Both login fields empty | PASS |
| TC_005 | Empty username | PASS |
| TC_006 | Empty password | PASS |
| TC_007 | Login error message validation | PASS |
| TC_008 | Verify product listing | PASS |
| TC_009 | Verify product names, descriptions and prices | PASS |
| TC_010 | Verify product images | PASS |
| TC_011 | Sort products by name A-Z | PASS |
| TC_012 | Sort products by price low-to-high | PASS |
| TC_013 | Individual product details | PASS |
| TC_014 | Add product to cart | PASS |
| TC_015 | Remove product from cart | PASS |
| TC_016 | Cart badge updates | PASS |
| TC_017 | Selected products displayed in cart | PASS |
| TC_018 | Cart accessibility while navigating | PASS |
| TC_019 | Cart to checkout navigation | PASS |
| TC_020 | Valid checkout information | PASS |
| TC_021 | Missing first name validation | PASS |
| TC_022 | Missing last name validation | PASS |
| TC_023 | Missing postal code validation | PASS |
| TC_024 | Order overview and price calculation | PASS |
| TC_025 | Successful order completion | PASS |
| TC_026 | Verify Logout functionality | PASS |

## 5. Key Testing Observations

The following behaviours were verified:

### Login

- Valid login was successful.
- Invalid credentials were rejected.
- Mandatory field validation worked correctly.
- Appropriate error messages were displayed.

### Product Inventory

- Six products were displayed.
- Product names, descriptions and prices were visible.
- Product images loaded correctly.
- Sorting by name and price worked correctly.
- Individual product details were accessible.

### Shopping Cart

- Products could be added and removed.
- Cart badge updated after product additions.
- Selected products appeared in the cart.
- Cart contents remained available during navigation.

### Checkout

- Checkout navigation worked correctly.
- Valid customer information was accepted.
- Missing mandatory fields generated validation messages.
- Order overview displayed the selected products.
- Price calculations were verified.

### Order Completion

- Order completion was successful.
- Confirmation message was displayed.
- Order dispatch message was displayed.

## 6. Defect Summary

| Metric | Result |
|---|---:|
| Total Defects Identified | 0 |
| Critical Defects | 0 |
| High Severity Defects | 0 |
| Medium Severity Defects | 0 |
| Low Severity Defects | 0 |

No confirmed defects were recorded during the
26 test cases executed.

## 7. Test Execution Conclusion

All 26 planned test cases were recorded as passed.

The tested application functionalities behaved
as expected during the manual testing exercise.

No confirmed defects were identified in the
executed test cases.

Further exploratory, regression, security and
cross-browser testing may be performed to increase
test coverage.

## 8. Final Status

Overall Test Execution Status: COMPLETED

Test Execution Rate: 100%

Test Pass Rate: 100%

Prepared By: QA Tester

Document Version: 1.0
