package page_object;
import org.openqa.selenium.By;
import static page_object.driver_setup.driver;


public class signin_page{
      public void username() {
        driver.findElement(By.id("ap_email")).sendKeys("8825916026");
        driver.findElement(By.id("continue")).click();

    }
}