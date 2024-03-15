package Action_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class key_up_down {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement input1 = driver.findElement(By.id("email"));
       WebElement input2 = driver.findElement(By.name("pass"));

         input1.sendKeys("shan");

        Actions act= new Actions(driver);

        // command + a action performed
        act.keyDown(Keys.COMMAND);
        act.sendKeys("a");
        act.keyUp(Keys.COMMAND);
        act.perform();

        // command + c action performed
        act.keyDown(Keys.COMMAND);
        act.sendKeys("c");
        act.keyUp(Keys.COMMAND);
        act.perform();

        act.sendKeys(Keys.TAB);
        act.perform();

        // command + v action performed
        act.keyDown(Keys.COMMAND);
        act.sendKeys("v");
        act.keyUp(Keys.COMMAND);
        act.perform();

        //compare text
        if (input1.getAttribute("value").equals(input2.getAttribute("value")))

            System.out.println("pass");
        else
            System.out.println("fail");
    }
}
