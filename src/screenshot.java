

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class screenshot {

        public static void main(String[] args) throws IOException {
            ChromeDriver driver= new ChromeDriver();
            driver.get("https://www.facebook.com");

            File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File d = new File("/Users/apple/Downloads/png");
            FileHandler.copy(f, d);

            WebElement element = driver.findElement(By.id("email"));
            File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                File d1 = new File("/Users/apple/Downloads/png");
                FileHandler.copy(f1, d1);

        }
    }

