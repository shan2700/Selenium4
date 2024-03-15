package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_text {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.amazon.com/blackfriday?deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%252207A70A321FD4643438052FBBE71BDE5D%2522%252C%2522departments%2522%253A%255B%25227141123011%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D&pf_rd_p=3a10a255-a7e8-452a-b2ff-88e2dd2c76c1&pf_rd_r=RXFM16NKA2AV5M624C6S&pd_rd_wg=pq3F9&ref_=pd_gw_unk&pd_rd_w=rZw5B&content-id=amzn1.sym.3a10a255-a7e8-452a-b2ff-88e2dd2c76c1&ie=UTF8&pd_rd_r=45ecd807-6dae-4700-9488-869fb7666677");
        driver.findElement(By.linkText("Raycon Wireless Earbuds and Headphones")).click();

    }
}
