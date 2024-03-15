package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
       boolean b1=driver.findElement(By.id("email")).isDisplayed();
        System.out.println("answer :"+ b1);
       boolean b2= driver.findElement(By.name("login")).isEnabled();
        System.out.println(b2);
       boolean b3= driver.findElement(By.id("email")).isSelected();
        System.out.println(b3);

    }
}
