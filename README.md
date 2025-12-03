# Selenium Screenshot Project

This is a simple Java project that uses Selenium WebDriver to take a screenshot of a webpage (Google in this example) and save it locally.

## Features

- Launches Chrome browser using Selenium WebDriver.
- Navigates to [Google](https://www.google.com).
- Takes a screenshot of the page.
- Saves the screenshot to a specified folder in the project (`screenshots`).

## Prerequisites

- Java JDK 24 or later installed.
- Chrome browser installed.
- ChromeDriver included in the project under the `drivers` folder (no need to download separately).

## Setup

1. Make sure the `drivers` folder contains `chromedriver.exe`.
2. Ensure the path in the code points to the ChromeDriver location:

```java
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
