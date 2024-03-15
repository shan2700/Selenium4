package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple_alert {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("simpletext :"+ text);
        alert.accept();

    }
}
