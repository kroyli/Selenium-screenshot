import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.Logger;

public class ScreenshotTest {
    private static final Logger logger = Logger.getLogger(ScreenshotTest.class.getName());

    public static void main(String[] args) {
        // Set the path to chromedriver if it’s not in the system PATH // Укажи путь к chromedriver, если он не в PATH
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            // Open the website // Открываем сайт
            driver.get("https://www.google.com");

            // Take a screenshot // Делаем скриншот
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Save a screenshot // Сохраняем скриншот
            File destinationFile = new File("screenshot.png");
            Files.copy(screenshot.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

            logger.info("Скриншот сохранен " + destinationFile.getAbsolutePath());

            System.out.println("Скриншот сохранён: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка при сохранении скриншота", e);
        } finally {
            // Close the browser // Закрываем браузер
            driver.quit();
        }
    }
}

