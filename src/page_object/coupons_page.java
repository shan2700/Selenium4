package page_object;

import org.openqa.selenium.By;

import static page_object.driver_setup.driver;

public class coupons_page {
    public void electronics() {

        driver.findElement(By.linkText("sl-sobe-carousel-sub-card-title")).click();

    }



}
