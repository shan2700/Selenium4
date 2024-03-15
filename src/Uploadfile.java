import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();

        driver.get("https://blueimp.github.io/jQuery-File-Upload/");

        driver.manage().window().maximize();

        WebElement inputfile = driver.findElement(By.xpath(".//input[@type='file']"));

        inputfile.sendKeys("/Users/apple/Desktop/1676589113638.jpg");

        driver.findElement(By.xpath(".//span[text()='Start upload']")).click();

        driver.findElement(By.xpath("//*[@id=\"fileupload\"]/table/tbody/tr/td[4]/button[2]")).click();

        }
}

