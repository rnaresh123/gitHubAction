package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class FlipCartApp {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.flipkart.com/");
        WebElement element = driver.findElement(By.xpath("//span[text()='Fashion']"));
        Actions act=new Actions(driver);
        act.moveToElement(element).build().perform();
        WebElement element1 = driver.findElement(By.xpath("//a[text()='Men Footwear']"));
        element1.click();
        WebElement element2 = driver.findElement(By.xpath("(//a[text()='Premium Comfortable Regular Wear Walking Shoes For Men'])[1]"));
        element2.click();

        Thread.sleep(2000);

//        String windowHandle = driver.getWindowHandle();
//        driver.switchTo().window(windowHandle);

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        // js.executeScript("arguments[0].scrollIntoView()", element);
        Thread.sleep(2000);
        WebElement element3 = driver.findElement(By.xpath("(//li[@class=\"col col-6-12\"])[1]"));
         JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView()", element3);
        element3.click();
    }

    public  void switchToParentWindow(String parentpaString) {
        driver.switchTo().window(parentpaString);
    }

    public void closeAllWindow(String parentWiondow, List<String>hlist) {
        for (String string : hlist) {
            if(!string.equalsIgnoreCase(parentWiondow)) {
                driver.switchTo().window(string).close();
            }
        }
    }

    public boolean switchToRightWindow(String windowTitle, List<String> hlist) {
        for (String string : hlist) {
            String title = driver.switchTo().window(string).getTitle();
            if(title.contains(windowTitle)) {
                return true;
            }
        }
        return false;
    }
}
