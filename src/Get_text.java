import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

//        GETTEXT METHOD BY PATH
        driver.get("https://www.amazon.in/RECORD-TRIVENI-MULTANI-Pandit-Jasraj/dp/B07CXWB47Y/ref=zg_bs_c_music_sccl_2/261-5853563-4802154?pd_rd_w=QxHPr&content-id=amzn1.sym.7dd29d48-66c1-486c-967d-2ed40101f2ea&pf_rd_p=7dd29d48-66c1-486c-967d-2ed40101f2ea&pf_rd_r=4WGXBRQ4AQMNNBTPJ8XG&pd_rd_wg=Crc9Z&pd_rd_r=a8a8a40b-01a0-4315-a916-dbbacb063ef4&pd_rd_i=B07CXWB47Y&psc=1");
        String s= driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText();
        System.out.println(s);



//        GETTEXT METHOD BY ID
//        driver.get("https://www.amazon.in/RECORD-TRIVENI-MULTANI-Pandit-Jasraj/dp/B07CXWB47Y/ref=zg_bs_c_music_sccl_2/261-5853563-4802154?pd_rd_w=QxHPr&content-id=amzn1.sym.7dd29d48-66c1-486c-967d-2ed40101f2ea&pf_rd_p=7dd29d48-66c1-486c-967d-2ed40101f2ea&pf_rd_r=4WGXBRQ4AQMNNBTPJ8XG&pd_rd_wg=Crc9Z&pd_rd_r=a8a8a40b-01a0-4315-a916-dbbacb063ef4&pd_rd_i=B07CXWB47Y&psc=1");
//        String s= driver.findElement(By.id("productTitle")).getText();
//        System.out.println(s);
    }
}
