package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;

public class EcommercePlayGround {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://ecommerce-playground.lambdatest.io/");

        String prod = "";
        String model = "";
        String prodPrice="";

        WebElement element1 = driver.findElement(By.xpath("//div[@id='entry_217834']//a//span[contains(text(),' Mega Menu')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element1).perform();
        driver.findElement(By.xpath("//div[@id='entry_217831']//a[text()=' Shop by Category']")).click();
        driver.findElement(By.xpath("//div[@id='entry_217841']//a//span[contains(text(),' Phone, Tablets & Ipod')]")).click();

        driver.findElement(By.xpath("//h4//a[contains(text(),'HTC Touch HD')]")).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://ecommerce-playground.lambdatest.io/index.php?route=product/product&path=57&product_id=28","pro");
        Assert.assertTrue(currentUrl.contains("product_id=28"),"product url mismatch");

        driver.findElement(By.xpath("//div[@id=\"entry_216842\"]/button[@title='Add to Cart']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'View Cart ')]")).click();

        String productName = driver.findElement(By.xpath("//td[@class='text-left']/a[contains(text(),'HTC Touch HD')]")).getText();
        String productModel = driver.findElement(By.xpath("//td[@class='text-left']/a[contains(text(),'HTC Touch HD') ]/../following-sibling::td[1]")).getText();
        String productPrice = driver.findElement(By.xpath("//td[@class='text-left']/a[contains(text(),'HTC Touch HD') ]/../following-sibling::td[3]")).getText();

        Assert.assertEquals(productName, "HTC Touch HD", "product does not added");
        Assert.assertEquals(productModel, "Product 1", "productmodel does not match");
        Assert.assertEquals(productPrice, "$146.00", "productprice mismatch");

        Thread.sleep(5000);
        driver.quit();
//
//
//        WebElement element = driver.findElement(By.xpath("//li[@class='nav-item dropdown dropdown-hoverable'][2]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
//        driver.findElement(By.xpath("//div[@id=\"entry_217834\"]//a//span[contains(text(),'Register')]")).click();
//        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Naresh");
//        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("raiaplle");
//        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naras123@gmail.com");
//        driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("1234567567");
//        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("naresh@123");
//        driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("naresh@123");
//        driver.findElement(By.xpath("//label[@for='input-agree']")).click();
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        String text = driver.findElement(By.xpath("//h1")).getText();
//        Assert.assertEquals(text, "Congratulations! Your new account has been successfully created!", "your account is not registered");
//
//
//        Thread.sleep(2000);
//        driver.quit();
    }
}
