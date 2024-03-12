package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ToolTip {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://jqueryui.com/tooltip/");
        driver.switchTo().frame(0);
        WebElement inputBox = driver.findElement(By.xpath("//input[@id='age']"));
        String toolTip = inputBox.getAttribute("title");
        System.out.println(toolTip);
    }
}
