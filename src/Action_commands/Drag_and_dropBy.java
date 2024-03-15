package Action_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_dropBy {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement web = driver.findElement(By.id("draggable"));
        Actions builder = new Actions(driver);
       int x=web.getLocation().getX();
       int y=web.getLocation().getY();
       builder.dragAndDropBy(web, x+30, y+45).perform();















    }
}
