package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class KeyBoardActoinMultipleKeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        WebElement inputText1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement inputText2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        inputText1.sendKeys("Welcome to selenium");
        Actions act = new Actions(driver);
        //control+A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();
        //copy ctrl+c
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();
        //shift second input2 press tab
        act.sendKeys(Keys.TAB);
        //paste ctrl+v
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();
        if (inputText1.getAttribute("value").equalsIgnoreCase(inputText2.getAttribute("value")))
            System.out.println("text copied");
        else
            System.out.println("text not copied");


    }
}
