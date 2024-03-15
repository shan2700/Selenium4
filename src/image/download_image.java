package image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class download_image {
    public static void main(String[] args) {
        String downloadDire ="/Users/apple/eclipse-workspace/Selenium4/src/image";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("download.default_directory" , downloadDire);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://omayo.blogspot.com/p/page7.html?m=1");
        driver.findElement(By.linkText("ZIP file")).click();
    }
}
