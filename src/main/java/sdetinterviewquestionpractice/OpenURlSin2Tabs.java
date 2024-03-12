package sdetinterviewquestionpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenURlSin2Tabs {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");   //same window different tabs
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        driver.get("https://demo.nopcommerce.com/");   //different window different tabs
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
    }
}
