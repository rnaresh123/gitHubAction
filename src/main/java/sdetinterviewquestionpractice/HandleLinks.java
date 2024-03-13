package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleLinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Demo")).click();
       // driver.findElement(By.partialLinkText("Regis")).click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("total  number of links :"+links.size());
//        for (int i = 0; i <= links.size() ; i++) {
//            System.out.println(links.get(i).getText());
//            System.out.println(links.get(i).getAttribute("href"));
//
//        }
        for (WebElement link:links) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));

        }

        driver.quit();

    }
}
