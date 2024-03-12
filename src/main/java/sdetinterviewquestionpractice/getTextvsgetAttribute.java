package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextvsgetAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        WebElement element = driver.findElement(By.id("Email"));
        // element.clear();
        //   element.sendKeys("narasgonda123@gmail.com");

        System.out.println(element.getAttribute("type"));
        System.out.println(element.getText());
        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        System.out.println(loginBtn.getAttribute("type"));
        System.out.println(loginBtn.getAttribute("class"));
        System.out.println(loginBtn.getText());

        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
        System.out.println(pageTitle.getText());
        driver.quit();

        //getText-->it will give inbuilt text
        //getAttribute------->it will give element value

    }
}