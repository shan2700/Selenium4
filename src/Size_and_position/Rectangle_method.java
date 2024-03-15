package Size_and_position;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rectangle_method {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Rectangle r1= driver.findElement(By.cssSelector("[name=login]")).getRect();
        System.out.println("Height :" +  r1.getHeight());
        System.out.println("Width  :" + r1.getWidth());
        System.out.println("X Value:" + r1.getX());
        System.out.println("Y Value:" + r1.getY());










    }


}
