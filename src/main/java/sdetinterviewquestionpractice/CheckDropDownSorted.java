package sdetinterviewquestionpractice;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckDropDownSorted {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.bing.com/");
        driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("selenium");
        List<WebElement> webElements = driver.findElements(By.xpath("//span[@class='sa_tm_text']"));
        System.out.println(webElements.size());
        String text="selenium ide";
        autoSuggestiomDropDown(webElements,text);

//        for (WebElement webElement : webElements) {
//            if (webElement.getText().equalsIgnoreCase("selenium ide")) {
//                webElement.click();
//                break;
//            }
//
//        }
        //driver.quit();
    }
    public static void autoSuggestiomDropDown(List<WebElement> elements,String value){
        for (WebElement element:elements) {
            if (element.getText().equalsIgnoreCase(value)){
                element.click();
                break;
            }

        }

    }
}
