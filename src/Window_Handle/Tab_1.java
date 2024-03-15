package Window_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tab_1 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        String windowhandle=driver.getWindowHandle();
        System.out.println("firstwindow : "+ windowhandle);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"stayIcon\"]/a/span")).click();
       Set<String> windowhandles=driver.getWindowHandles();
        System.out.println(windowhandles);
        List<String> list= new ArrayList<String>(windowhandles);
        driver.switchTo().window(list.get(1));
        driver.findElement(By.xpath("/html/body/app-root/homeheader/nav/div/div[2]/div/ul/li[2]/a")).click();
        driver.quit();

        // to get current url
        // String currenturl = driver.getCurrentUrl();
       // System.out.println(currenturl);















    }
}
