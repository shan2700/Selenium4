package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_name {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in/");
      int sliders = driver.findElements(By.className("a-carousel-card")).size();
        System.out.println(sliders);
    }
    }
















