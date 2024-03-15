package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tag_name_check {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String s1 = driver.findElement(By.cssSelector("#email")).getTagName();
        System.out.println(s1);
    }
}
