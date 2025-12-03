# Selenium Screenshot Project

This is a simple Java project that uses Selenium WebDriver to take a screenshot of a webpage (Google in this case) and save it locally.

## Features

- Launches Chrome browser using Selenium WebDriver.
- Navigates to [Google](https://www.google.com).
- Takes a screenshot of the page.
- Saves the screenshot to a specified folder in the project.

## Prerequisites

- Java JDK 24 or later installed.
- Chrome browser installed.
- ChromeDriver compatible with your Chrome version. Download from: [ChromeDriver Downloads](https://chromedriver.chromium.org/downloads).

## Setup

1. Place the `chromedriver.exe` in the `drivers` folder of the project (or update the path in `ScreenshotTest.java` accordingly).
2. Ensure the path in the code points to the correct location of ChromeDriver:

```java
System.setProperty("webdriver.chrome.driver", "C:\\Users\\...\\drivers\\chromedriver.exe");
