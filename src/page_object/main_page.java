package page_object;

import org.openqa.selenium.By;

import static page_object.driver_setup.driver;

public class main_page {

    public void coupons_click(){
       // driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[1]/ul/li[1]/span/span/span/input")).click();

        driver.findElement(By.className("nav-a")).click();
    }
}
