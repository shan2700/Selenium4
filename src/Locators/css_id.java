package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_id {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("#email")).sendKeys("shan2701");
        driver.findElement(By.cssSelector(".inputtext")).sendKeys("1234");
        driver.findElement(By.cssSelector("[name=login]")).click();

 //       xpath example
//        driver.findElement(By.xpath("//button[text()='Log in']")).click();
//       another option for tag id and class and attribute.
//        driver.findElement(By.cssSelector("input#email")).sendKeys("shan2701");
//        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("1234");
//        driver.findElement(By.cssSelector("[name=login]")).click();

    }
}
