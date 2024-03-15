package page_object;
import org.openqa.selenium.By;

import static page_object.driver_setup.driver;

public class login_page {

    public void login() {
        driver.findElement(By.id("ap_password")).sendKeys("Shan@2701");
        driver.findElement(By.id("signInSubmit")).click();

    }
}


