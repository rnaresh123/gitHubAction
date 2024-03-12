package sdetinterviewquestionpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.Script;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExcuter {
    private static String Script;

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(Script,args);
        //flash
        //drawing title of the page &take screenshot
        //click action
        //generate the alert
        //refresh the page
        //scrolling down the page
        // scrollup the page
        //zoom page

    }
}
