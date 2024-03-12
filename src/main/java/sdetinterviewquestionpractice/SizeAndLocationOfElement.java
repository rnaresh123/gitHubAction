package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SizeAndLocationOfElement {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        //location--method1(X,Y)
        System.out.println("location(X,Y) :"+logo.getLocation());
        System.out.println("location(X):"+logo.getLocation().getX());
        System.out.println("location(y):"+logo.getLocation().getY());

        //location Method2
        System.out.println("location(X):"+logo.getRect().getX());
        System.out.println("location(Y):"+logo.getRect().getY());

        //size method1(width*height)
        System.out.println("size(Width,height):"+logo.getSize());
        System.out.println("size(Width):"+logo.getSize().getWidth());
        System.out.println("size(height):"+logo.getSize().getHeight());
        //size method2(width*height)
        System.out.println("size(Width,height):"+logo.getRect().getDimension().getWidth());
        System.out.println("size(Width,height):"+logo.getRect().getDimension().getHeight());


        driver.quit();
    }
}
