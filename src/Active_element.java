import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Active_element {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
         WebElement elec = driver.findElement(By.id("search"));

        Actions act = new Actions(driver);
        act.moveToElement(elec).perform();

//        driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
//        driver.findElement(By.name("q")).click();


//        WebElement activeelement = driver.switchTo().activeElement();
//        activeelement.sendKeys("email",Keys.TAB,"pass",Keys.ENTER);









    }
}
