package Action_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_to_element {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
        WebElement elec = driver.findElement(By.xpath("//*[.='Electronics']"));
        Actions act = new Actions(driver);
        act.moveToElement(elec).perform();
        driver.findElement(By.linkText("Gaming")).click();
        driver.navigate().back();
       driver.findElement(By.name("q")).sendKeys("hplaptop");
        act.doubleClick().perform();
        act.contextClick(driver.findElement(By.name("q")));
    }
}
