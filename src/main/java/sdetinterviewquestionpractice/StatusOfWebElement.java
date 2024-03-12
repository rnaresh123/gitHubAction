package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //isDisplayed,isEnabled
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("element is dishplayed:" + element.isDisplayed());//true
        System.out.println("element is enabled:" + element.isEnabled());//true
        //isSelected
        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(male.isSelected());//false
        System.out.println(female.isSelected());//false
        male.click();
        System.out.println(male.isSelected());//true
        System.out.println(female.isSelected());//false
        driver.quit();


    }
}
