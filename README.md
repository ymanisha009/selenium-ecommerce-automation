# 🛒 Selenium E-Commerce Automation (Java + TestNG)

A complete automation framework built using **Selenium WebDriver**, **Java**, **Maven**, and **TestNG** to test an e-commerce workflow on the **SauceDemo** demo website.

---

## 🚀 Features Included

* ✔️ **Maven-based Java project**
* ✔️ **Page Object Model (POM)** for clean code structure
* ✔️ TestNG test cases for:

  * Login
  * Add to Cart
  * Checkout
* ✔️ **WebDriverManager** for automatic browser driver handling
* ✔️ **testng.xml** to run complete suites
* ✔️ Headless execution support

---

## 📁 Project Structure

```
src
 └── main/java
 └── test/java
     ├── pages      # Page Object Model classes
     ├── tests      # Test scripts
     └── utils      # Helper methods
```

---

## 🛠️ How to Run the Project

### **1. Clone the repository**

```
git clone https://github.com/ymanisha009/selenium-ecommerce-automation.git
```

### **2. Install dependencies**

Run inside the project folder:

```
mvn clean install
```

### **3. Execute the TestNG suite**

```
mvn test
```

### **Run in headless mode (optional)**

```
mvn test -Dheadless=true
```

---

## 🧪 Demo Website Used

This project uses the public demo site **SauceDemo** for testing:
🔗 [https://www.saucedemo.com/](https://www.saucedemo.com/)

Use default test credentials:

* **Username:** standard_user
* **Password:** secret_sauce

---

## 📸 Sample Test Flow

* Launch browser
* Login to site
* Add product to cart
* Proceed to checkout
* Complete purchase
* Validate success message

---

## 🤝 Contribution Guidelines

Pull requests are welcome. For major changes, please open an issue first.

---

## 📄 License

This project is open-source and free to use.

---
