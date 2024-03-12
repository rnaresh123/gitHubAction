package sdetinterviewquestionpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLunch {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        System.out.println(driver.getCurrentUrl());
//        Thread.sleep(5000);
//        driver.quit();

        //getCurrentUrl,getPagetitle,getPageSource

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("current url the webpage :"+driver.getCurrentUrl());
        System.out.println("title of webpage :" + driver.getTitle());
        System.out.println(driver.getPageSource());
        Thread.sleep(5000);
        driver.quit();


    }
}
