package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlesCheckBoxs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.xpath("//div[@id='HTML33']//input[@value='Pen']")).click();
        Thread.sleep(2000);
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkBoxes.size());

//        for (int i = 0; i <= checkBoxes.size(); i++) {
//            checkBoxes.get(i).click();
//        }
//        for (WebElement chbox : checkBoxes) {
//            Thread.sleep(2000);        //here we can select one by one check box
//            chbox.click();
        for (WebElement chbox : checkBoxes) {
            String checkboxname = chbox.getAttribute("value");
            if (checkboxname.equals("Laptop:") || checkboxname.equals("Bag:")) {
                chbox.click();
            }


        }

    }

}




