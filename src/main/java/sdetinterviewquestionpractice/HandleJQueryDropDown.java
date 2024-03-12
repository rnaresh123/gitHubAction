package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleJQueryDropDown {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
        //select choicesValues(driver,"choice1")
       //select choicesValues(driver,"choice1","choice2","choice3")
      // select choicesValues(driver,"all")

    }
    public static void selectChoiceValues(WebDriver driver,String...value){

    }
}
