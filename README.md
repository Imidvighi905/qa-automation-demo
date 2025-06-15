# QA Automation Demo Framework

This is a demo project for UI test automation using **Java 24**, **Selenium WebDriver**, **Cucumber BDD (Gherkin)**, and **Maven**.

---

## 🔧 Technologies Used

- Java 24.0.1
- Maven 3.9.x
- Selenium WebDriver 4.20.x
- Cucumber JVM 7.14.0
- JUnit 4.13.2
- Gherkin for BDD scenarios

---

## 📂 Project Structure
ProjectG/
├── .idea/                             # Setări specifice IDE-ului (IntelliJ IDEA)
├── apache-maven-3.9.10/              # Maven local (nu recomandat în repo)
├── drivers/
│   └── chromedriver.exe              # Executabilul ChromeDriver pentru Selenium
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/                # Page Object Model classes (ex: LoginPage.java)
│       │   │   └── LoginPage.java
│       │   ├── runners/              # Cucumber test runners
│       │   │   └── TestRunner.java
│       │   └── stepdefinitions/      # Cucumber step definitions
│       │       └── LoginSteps.java
│       └── resources/
│           └── features/             # Gherkin .feature files
│               └── login.feature
├── target/                           # Folder generat de Maven (build/test output)
├── .gitignore                        # Fisiere/ directoare ignorate de Git
├── pom.xml                           # Fișierul Maven cu dependențe și build config
├── ProjectG.iml                      # Config IntelliJ

