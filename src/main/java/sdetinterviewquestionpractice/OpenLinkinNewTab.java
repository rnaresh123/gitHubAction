package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenLinkinNewTab {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        String tab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Register")).sendKeys(tab);
        driver.quit();


    }
}
