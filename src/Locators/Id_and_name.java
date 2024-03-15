package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Id_and_name {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.id("email")).sendKeys("shan2701");
        driver.findElement(By.name("login")).click();
        driver.quit();

//      WebElement btnlogin =  driver.findElement(By.xpath("document.querySelector(\"#loginbutton\")"));
//      JavascriptExecutor executor = (JavascriptExecutor) driver;
//      executor.executeScript("arguments[0].click()",btnlogin ;
//      btnlogin.click();
//      driver.findElement(By.name("login")).click();
//      driver.wait(30);
//      driver.quit();

    }
}
