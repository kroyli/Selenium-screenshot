# Selenium Screenshot Project

A simple Java project using Selenium WebDriver to take a screenshot of a webpage (Google in this example) and save it locally.

## Features

- Opens Chrome browser via Selenium WebDriver.
- Navigates to [Google](https://www.google.com).
- Takes a screenshot and saves it in `screenshots/`.

## Setup

1. Ensure `drivers/chromedriver.exe` exists in the project.
2. Update the path in `ScreenshotTest.java` if needed:

```java
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
