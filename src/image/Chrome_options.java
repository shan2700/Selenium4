package image;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Arrays;

public class Chrome_options {
    public static void main(String[] args) {

        ChromeOptions options= new ChromeOptions();

        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobars"));

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.co.in/");


    }
}
