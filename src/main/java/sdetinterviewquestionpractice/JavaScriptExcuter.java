package sdetinterviewquestionpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.bidi.Script;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class JavaScriptExcuter {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript(Script,args);

        //flash
        //drawing title of the page &take screenshot
        //click action
        //generate the alert
        //refresh the page
        //scrolling down the page
        // scrollup the page
        //zoom page
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        JavaScriptUtil.drawBoarder(logo,driver);
        //drawing title of the page &take screenshot
        String title = JavaScriptUtil.getTitleByJS(driver);
        System.out.println(title);
        //click action
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        JavaScriptUtil.clickElementByJS(registerLink,driver);
        //generate the alert
       // JavaScriptUtil.generateAlert(driver,"This is my alert");
        //refresh the page
        JavaScriptUtil.scrollPageDown(driver);
        Thread.sleep(2000);
        JavaScriptUtil.scrollPageUp(driver);
        driver.quit();


    }
}
