
# selenium-ecommerce

Selenium + Java + TestNG example automation project for an e-commerce flow using the **SauceDemo** demo site (https://www.saucedemo.com/).

## What is included
- Maven-based Java project
- Page Object Model (POM) implementation
- TestNG tests (login, add to cart, checkout)
- WebDriverManager usage (automatic driver management)
- `testng.xml` to run suites

## How to run
1. Install Java 11+ and Maven.
2. Clone repo and run:
```bash
mvn clean test
```
To run headless, pass a system property:
```bash
mvn clean test -Dheadless=true
```

## Demo site
We use https://www.saucedemo.com/ as the target demo site. Use the sample credentials on that site (standard_user / secret_sauce).

