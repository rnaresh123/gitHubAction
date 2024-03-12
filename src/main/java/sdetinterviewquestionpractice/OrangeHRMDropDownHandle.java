package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class OrangeHRMDropDownHandle {
    //bootstrap dropdown
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
        WebElement employeStatusDrp = driver.findElement(By.xpath("//label[text()='Employment Status']//parent::div//following-sibling::div//i"));
        employeStatusDrp.click();
        
        List<WebElement> webElements = driver.findElements(By.xpath("//div[@role='option']//span"));
        String value="Part-Time Contract";
        selectByOption(webElements,value);


        WebElement includeDrp = driver.findElement(By.xpath("//label[text()='Include']//parent::div//following-sibling::div//i"));
        includeDrp.click();
        List<WebElement> webElements1 = driver.findElements(By.xpath("//div[@role='option']//span"));
        String value1="Past Employees Only";
        selectByOption(webElements1,value1);
//        for (WebElement product : webElements) {
//
//            if (product.getText().equalsIgnoreCase("Part-Time Contract")) {
//                product.click();
//                break;
//            }
//
//        }


    }
    public static void selectByOption(List<WebElement> webElements,String value){
        for (WebElement element:webElements) {
           if (element.getText().equalsIgnoreCase(value)){
               element.click();
               break;
           }


           //select class dropdown
           //bootstrap dropdown
           // jquery dropdown

        }

    }
}
