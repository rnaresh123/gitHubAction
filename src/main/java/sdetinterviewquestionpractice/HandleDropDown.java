package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        WebElement dayElement = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//        Select dropDown=new Select(element);
//        dropDown.selectByVisibleText("3");
//        dropDown.selectByValue("7");
//        dropDown.selectByIndex(7);
        String day = "7";
       // selectByVisibleText(dayElement,day);
        selectByOption(dayElement,day);
        WebElement monthElement = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        String month = "April";
       // selectByVisibleText(monthElement,month);
        selectByOption(monthElement,month);
        WebElement yearElement = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        String year = "1995";
       // selectByVisibleText(yearElement,year);
        selectByOption(yearElement,year);
        // driver.quit();
    }

    public static void selectByVisibleText(WebElement element,String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public static void selectByOption(WebElement element,String value){
        Select select=new Select(element);
        List<WebElement> webElements = select.getOptions();
        for (WebElement ele:webElements) {
            if (ele.getText().equalsIgnoreCase(value)){
                ele.click();
                break;
            }

        }
    }

}
