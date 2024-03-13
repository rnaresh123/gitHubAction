package sdetinterviewquestionpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //alert window with ok button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //alert window with ok and cancel button
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        //  driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        //alert window with input box
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Alert alertwindow = driver.switchTo().alert();
        System.out.println("the message displayed on alert :" + alertwindow.getText());
        alertwindow.sendKeys("WelCome");
        alertwindow.accept();
    }
}
