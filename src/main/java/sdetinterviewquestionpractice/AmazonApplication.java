package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonApplication {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
        WebElement element = driver.findElement(By.xpath("//input[@aria-labelledby='OnePlus']/following-sibling::i"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView()", element);
        Thread.sleep(2000);
        element.click();
        driver.findElement(By.xpath("//div[@data-index='2']")).click();

        Thread.sleep(2000);
 //       JavascriptExecutor js1 = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView()", element);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"])[2]")).click();


    }
}
