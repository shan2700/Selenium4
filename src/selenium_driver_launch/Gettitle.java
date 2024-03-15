package selenium_driver_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gettitle {
    public static void main(String[] args) {

            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.in");
        driver.navigate().to("https://www.amazon.in/b?node=1968024031");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        String strPageSource = driver.getPageSource();
        System.out.println(strPageSource);
        driver.quit();
    }
}
