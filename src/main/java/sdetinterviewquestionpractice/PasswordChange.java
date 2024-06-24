package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

public class PasswordChange {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ecommerce-playground.lambdatest.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement element = driver.findElement(By.xpath("//div[@id='entry_217834']//a//span[contains(text(),' My account')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        driver.findElement(By.xpath("//div[@class='info']/span[contains(text(),' Login')]")).click();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("narasgonda321@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Naresh@2021");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),' Change your password')]")).click();
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Naresh@2021");
        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Naresh@2021");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String confirmMsg = driver.findElement(By.xpath("//div[contains(text(),' Success: Your password has been successfully updated.')]")).getText();

        Assert.assertEquals(confirmMsg.trim(),"Success: Your password has been successfully updated.","password did not change");

        Thread.sleep(2000);
        driver.quit();




    }
}
