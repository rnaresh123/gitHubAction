package sdetinterviewquestionpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil{
    public static void drawBoarder(WebElement element, WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("argument[0].style.border='3px solid red'",element);
    }
    public static String getTitleByJS(WebElement element, WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String title = js.executeScript("return decument.title;").toString();
        return title;
    }
    public static void clickElementByJS(WebElement element,WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);

    }

}
