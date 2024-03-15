package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_alert {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        Alert alert1 = driver.switchTo().alert();
        alert1.sendKeys("shan1");
        alert1.accept();
        String name = driver.findElement(By.id("demo1")).getText();
        System.out.println(name);





    }
}
