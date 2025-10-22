# SauceDemo Automation Project

## Project Description
This is an **end-to-end Selenium WebDriver automation project** for the SauceDemo e-commerce site.  
It covers the full purchase flow including login, adding products to cart, validating cart items, checkout, and order confirmation.

---

## Technologies & Tools Used
- Java 8  
- Selenium WebDriver  
- TestNG (Data-driven using DataProvider)  
- Maven (for dependency management)  
- Eclipse/IntelliJ (IDE)  
- Git & GitHub (Version control)  

---

## Project Structure
```text
E_Commerce/
│
├── src/test/java/
│   ├── base_class/          → BasePage.java
│   ├── pageclasses/         → All page classes
│   ├── testclasses/         → All TestNG test classes
│   └── utilities/           → ExcelUtility.java, DataProvider classes
│
├── pom.xml                  → Maven dependencies
├── README.md                → Project documentation
└── test-output/             → TestNG console output (optional HTML reports can be generated)
```
---

## Key Features
1. **Login** – Validates login using data-driven approach from Excel.  
2. **Add to Cart** – Dynamically adds products to the cart.  
3. **Cart Validation** – Ensures selected products match items in the cart.  
4. **Checkout Flow** – Fills checkout information and validates order summary.  
5. **Order Confirmation** – Confirms “Thank you for your order!” message.  
6. **Logout** – Logs out securely after completing the order.  

---

## How to Run
**Clone the repository**

git clone https://github.com/Admin-MNR/SauceDemo-Automation.git
Open the project in Eclipse or IntelliJ as a Maven project.


Run Tests:
Using TestNG XML (testng.xml) or
Right-click on a Test class → Run as → TestNG Test

View Test Results:
Console logs are generated in Eclipse



