package sdetinterviewquestionpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import javax.swing.plaf.FileChooserUI;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

public class CaptureTheScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String photo = "./photos";
        Date d = new Date(0);
        String s = d.toString();
        String d2 = s.replace(":", "_");
        //Full page ScreenShot
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        TakesScreenshot tss = (TakesScreenshot) driver;
        File src = tss.getScreenshotAs(OutputType.FILE);
        File dst = new File("C:\\Users\\SANAKH\\Desktop\\nbk\\rnb23.jpg");
        FileHandler.copy(src, dst);
    //Screenshot for potion/section of the page
        WebElement element = driver.findElement(By.xpath("//form[@method='post']"));
        File src1 = element.getScreenshotAs(OutputType.FILE);
        File dst1 = new File("C:\\Users\\SANAKH\\Desktop\\nbk\\homepage.jpg");
        FileHandler.copy(src1, dst1);
        //Screenshot for potion/section of the page
        WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src2 = ele.getScreenshotAs(OutputType.FILE);
        File dst2 = new File("C:\\Users\\SANAKH\\Desktop\\nbk\\logo.jpg");
        FileHandler.copy(src2, dst2);


    }
}
