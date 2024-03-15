package image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class download_image2 {
    public static void main(String[] args) {
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", "/Users/apple/eclipse-workspace/Selenium4/src/image");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://omayo.blogspot.com/p/page7.html?m=1");
        driver.findElement(By.linkText("ZIP file")).click();
    }
}
