package Window_Handle;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_size {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        int inWidth = size.getWidth();
        int inHeight = size.getHeight();
        System.out.println("height :" +inHeight);
        System.out.println("width : " +inWidth);
    }
}