package Window_Handle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class new_window {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.switchTo().newWindow(WindowType.WINDOW);




    }
}
