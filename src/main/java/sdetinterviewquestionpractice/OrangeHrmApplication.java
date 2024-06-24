package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class OrangeHrmApplication {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//input[@name='firstName']"));
        element.click();
        Thread.sleep(2000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Naresh");
        driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Gonda");


        WebElement element1 = driver.findElement(By.xpath("//input[@name='lastName']"));
        element1.click();
        Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_CONTROL);
        robot1.keyPress(KeyEvent.VK_A);
        robot1.keyPress(KeyEvent.VK_BACK_SPACE);
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raipalle");

        WebElement element2 = driver.findElement(By.xpath("//label[normalize-space()='Employee Id']/../following-sibling::div/input[@class='oxd-input oxd-input--active']"));
        element2.click();
        Robot robot3 = new Robot();
        robot3.keyPress(KeyEvent.VK_CONTROL);
        robot3.keyPress(KeyEvent.VK_A);
        robot3.keyPress(KeyEvent.VK_BACK_SPACE);
        robot3.keyRelease(KeyEvent.VK_CONTROL);
        robot3.keyRelease(KeyEvent.VK_A);
        robot3.keyRelease(KeyEvent.VK_BACK_SPACE);
        element2.sendKeys("123654");
        Thread.sleep(3000);
        WebElement element3 = driver.findElement(By.xpath("//label[normalize-space()='Other Id']/../following-sibling::div/input[@class='oxd-input oxd-input--active']"));
        element3.sendKeys("456789");
        WebElement element4 = driver.findElement(By.xpath("//label[normalize-space()='Employee Id']/../../../../following-sibling::div[1]/div[1]/div/div[2]/input"));
        element4.sendKeys("98980");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[normalize-space()='License Expiry Date']/../following-sibling::div//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//ul[@class='oxd-calendar-selector']/li[2]/div/p")).click();
        String year = "2022";
        String xpathOfYearDropdown = String.format("//ul[@class='oxd-calendar-dropdown']/li[normalize-space()='%s']", year);
        driver.findElement(By.xpath(xpathOfYearDropdown)).click();
        driver.findElement(By.xpath("//ul[@class='oxd-calendar-selector']/li/div//p")).click();
        String month = "August";
        String xpathOfMonthDropDown = String.format("//ul[@class='oxd-calendar-dropdown']/li[normalize-space()='%s']", month);



        driver.findElement(By.xpath(xpathOfMonthDropDown)).click();
        String enterDayInDD="15";
        String xpathOdDay = String.format("//div[@class='oxd-calendar-dates-grid']/div/div[normalize-space()='%s']", enterDayInDD);
        driver.findElement(By.xpath(xpathOdDay)).click();
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//div[@class='oxd-toast-container oxd-toast-container--bottom']//p[2]")).getText();

        Assert.assertEquals(text,"Successfully Updated","test cases fail");
        Thread.sleep(5000);
        driver.quit();
    }
}
