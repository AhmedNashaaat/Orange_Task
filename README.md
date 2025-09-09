## 🔺 Triangle Test Automation

This project automates the testing of a Triangle Classification Application, where a user enters the three sides of a triangle, and the system determines whether the triangle is:

Equilateral

Isosceles

Scalene

Or Not a Triangle (invalid input)

The automation is built using Java, Selenium, TestNG, Faker, and Allure Reports.

![Selenium](https://img.shields.io/badge/Selenium-43B02A?logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-%23D94A26?logo=testng&logoColor=white)
![Allure Report](https://img.shields.io/badge/Allure_Report-%23E40026?logo=allure)
![Java](https://img.shields.io/badge/Java-007396?logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apache-maven&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?logo=git&logoColor=white)
![Faker](https://img.shields.io/badge/Fake%20Data-JavaFaker-blueviolet?style=flat&logo=databricks&logoColor=white)

🧪 Test Cases Covered

- ✅ Verify Scalene Triangle is displayed successfully

- ✅ Verify Equilateral Triangle is displayed successfully

- ✅ Verify Isosceles Triangle is displayed successfully

- ✅ Verify error message for Not a Triangle

  Using **Selenium WebDriver**, **TestNG**, and **Allure Reports**.

---
## ⚙️ Prerequisites

Ensure the following tools are installed:

- Java JDK 8+
- Maven 3.6+
- Chrome browser
- Git
- Allure command-line tools

---
## 🛠️ Installation
 Clone the Repository
```bash
git clone https://github.com/AhmedNashaaat/Orange_Task.git
cd Orange_Task
```
---
### ▶️Run the Tests
```bash
mvn clean test
```
---
## 📊 Generate Allure Report  
```bash
allure generate allure-results --clean -o allure-report  
allure open allure-report  
```
