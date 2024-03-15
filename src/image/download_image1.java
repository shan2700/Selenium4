package image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class download_image1 {
    public static void main(String[] args) {

        String downloadDirec = "/Users/apple/eclipse-workspace/Selenium4/src/image";
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.dir", downloadDirec);
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://omayo.blogspot.com/p/page7.html?m=1");
        driver.findElement(By.linkText("ZIP file")).click();
    }
}
