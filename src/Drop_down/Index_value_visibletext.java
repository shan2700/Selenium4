package Drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Index_value_visibletext {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select S1 = new Select(oldSelectMenu);
        S1.selectByVisibleText("Blue");
        S1.selectByValue("4");
        WebElement oldSelectMenu1 = S1.getFirstSelectedOption();
        System.out.println(oldSelectMenu1.getText());
        WebElement cars = driver.findElement(By.id("cars"));
        Select S2 = new Select(cars);
        boolean mul = S2.isMultiple();
        System.out.println("is multiple?" + mul);
        S2.selectByIndex(3);
        List<WebElement> S3 = S2.getOptions();
        S3.forEach(i-> System.out.println(i.getText()));
        }
    }

