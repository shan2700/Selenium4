package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html/body/input")).sendKeys("shan");
        driver.switchTo().frame(0);
        driver.findElement(By.id("a")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("/html/body/input")).clear();
        driver.findElement(By.xpath("/html/body/input")).sendKeys("rajj");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/ol/li[1]/a/b")).click();
    }
}