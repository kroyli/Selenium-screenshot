import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotTest {
    public static void main(String[] args) throws IOException {
        // Set path to ChromeDriver executable
        // Make sure chromedriver.exe is placed in the 'drivers' folder
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\kisa_\\IdeaProjects\\2_QA_Engineer_Portfolio\\Selenium-screenshot\\drivers\\chromedriver.exe");

        // Initialize Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

            // Take screenshot of the page
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Specify destination path for the screenshot
            Path destination = Path.of("C:\\Users\\kisa_\\IdeaProjects\\2_QA_Engineer_Portfolio\\Selenium-screenshot\\google_screenshot.png");

            // Copy the screenshot to destination
            Files.copy(screenshot.toPath(), destination);

            System.out.println("Screenshot saved at: " + destination.toString());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
