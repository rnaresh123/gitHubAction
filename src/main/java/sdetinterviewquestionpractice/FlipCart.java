package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlipCart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.flipkart.com/");
//        WebElement element = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//img[@alt='Electronics']"));
//        Actions act = new Actions(driver);
//        act.moveToElement(element).build().perform();
//        List<WebElement> webElements = driver.findElements(By.xpath("//div[@id='toast-ctn']//following-sibling::div//a"));
//        List<String> list = new ArrayList<>();
//        for (WebElement element1 : webElements) {
//            //System.out.println(element1.getText());
//            list.add(element1.getText());
//        }
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        // driver.quit();
        WebElement element1 = driver.findElement(By.xpath("//div[@class='_2GaeWJ']//img[@alt='Fashion']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
        List<WebElement> webElements1 = driver.findElements(By.xpath("//div[@id='toast-ctn']//following-sibling::div//a"));
        List<String> list1 = new ArrayList<>();
        for (WebElement ele : webElements1) {
            list1.add(ele.getText());
        }
        Collections.sort(list1);
        System.out.println(list1);

    }

    public static void moveToElemnt(WebElement element, WebDriver driver) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static List<String> getTextOfElements(List<WebElement> webElements) {
        List<String> webElementText = new ArrayList<>();
        for (WebElement element : webElements) {
            webElementText.add(element.getText());
        }
        return webElementText;
    }
}
