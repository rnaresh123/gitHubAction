package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementvsFindElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
//        //FindElement---->it will return the single element
//        //1
//        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//        searchStore.sendKeys("ABCD");
//        //2 it will fletch the first matching element
//        WebElement element = driver.findElement(By.xpath("//div[@class='footer-upper']//li"));
//        System.out.println(element.getText());
//        //if element is not present it will through nosuch element exception
//        WebElement searchBtn = driver.findElement(By.xpath("//button[text()='login']"));
//        System.out.println(searchBtn);
        //findElements--> it will return the multiple elements
        //1
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//li"));
        System.out.println("how much links are present "+links.size());
        for (WebElement ele:links)
        {
            System.out.println(ele.getText());
        }
        //2 it will return matching element
        List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.size());
        //3 it will through 0 element
        List<WebElement> elements = driver.findElements(By.xpath("//button[text()='login']"));
        System.out.println(elements);

    driver.quit();
    }
}
