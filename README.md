# Setup Process

To get started with the project, follow the steps below:

## Prerequisites

Ensure the following dependencies are installed on your system:

1. **Maven**
    - Used for managing dependencies and building the project.
    - [Installation Guide](https://maven.apache.org/install.html)

2. **Java 17**
    - Ensure you have Java Development Kit (JDK) 17 installed.

3. **Cucumber Plugin for IntelliJ IDEA**
    - Provides support for Cucumber feature files and step definitions.
    - Install it via IntelliJ:  
      `File > Settings > Plugins > Marketplace > Search for "Cucumber for Java"`

4. **Appium (Latest Version)**
    - Automation framework for mobile applications.
      ```bash
      npm i --location=global appium
      ```

5. **Appium Driver: UiAutomator2**
    - Install UiAutomator2 driver using Appium:
      ```bash
      appium driver install uiautomator2
      ```

---

## Project Setup

1. **Clone the Repository**  
   Clone this project from the repository:
   ```bash
   git clone https://github.com/IbadurrahmanZia/bibit.git
   
## Running the Tests
- Appium capabilities are located in src/test/resources/Capabilities
- Start appium in separate terminal
```bash
  appium -p 4724 --base-path /wd/hub --allow-insecure chromedriver_autodownload
  ````
-Run the test using the following command:
```bash
  mvn test -Dtest=Runner -Dplatform={platform type} -Dcucumber.filter.tags="{tags}"
```
sample command:
```bash
mvn test -Dtest=Runner -Dplatform=api -Dcucumber.filter.tags="@API and @DELETE"
```