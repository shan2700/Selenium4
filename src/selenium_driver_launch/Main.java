package selenium_driver_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com/s?k=Dresses&_encoding=UTF8&content-id=amzn1.sym.b4114be9-6d3d-4aed-8b31-fcbf38a83486&crid=1PW0S93CC85GY&pd_rd_r=67e7a0e3-179b-4cb4-b8ad-35a87371646f&pd_rd_w=uXc3x&pd_rd_wg=9xZ9N&pf_rd_p=b4114be9-6d3d-4aed-8b31-fcbf38a83486&pf_rd_r=C3SN69PWYFCZNHQN0WHQ&sprefix=dresses%2Caps%2C146&ref=pd_gw_unk");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
