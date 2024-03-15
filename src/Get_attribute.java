import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
     String value = driver.findElement(By.name("login_source")).getAttribute("value");
driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        System.out.println(value);

    }
}
