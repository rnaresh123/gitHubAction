package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class GilLabQuestion {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://about.gitlab.com/events/");
        Map<String, List<String>>map = new HashMap<>();
        List<WebElement> webElements = driver.findElements(By.xpath("//h3[@class=\"slp-text-align-left slp-mb-16 slp-text-heading4-bold\"]"));
        for (WebElement element : webElements){
            String text = element.getText();
            if(!map.containsKey(text)){
                map.put(text,new ArrayList<>());
            }
            String xpath = "//h3[text()='%replaceable%']//parent::div/following-sibling::div/h3";
            String dynamicXpath = getDynamicXpath(xpath, text);
            List<WebElement> webElements1 = driver.findElements(By.xpath(dynamicXpath));
            if(webElements1.size() == 1){
                map.get(text).add(webElements1.get(0).getText());
            }else if(webElements1.size() == 2) {
                map.get(text).add(webElements1.get(0).getText());
//                map.get(text).add(webElements1.get(1).getText());
                String text1 = webElements1.get(1).getText();
                text1 = text1.substring(text1.indexOf('-')+2);
                map.get(text).add(text1);
            }
        }
        for(Map.Entry<String,List<String>>entry : map.entrySet()){
            if(entry.getValue().size() == 2){
                String startDateStr = entry.getValue().get(0);
                String endDateStr = entry.getValue().get(1);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
                // Parse the strings to LocalDate objects using the defined format
                LocalDate startDate = LocalDate.parse(startDateStr, formatter);
                LocalDate endDate = LocalDate.parse(endDateStr, formatter);

                // Calculate the difference in days
                long differenceInDays = ChronoUnit.DAYS.between(startDate, endDate);
                //System.out.println(differenceInDays);
                if(differenceInDays == 1){
                    //System.out.println(entry.getKey());
                    String key = entry.getKey();
                    String xpath = "//h3[text()='%replaceable%']/../../following-sibling::div/a";
                    String dynamicXpath = getDynamicXpath(xpath, key);
                    System.out.println(dynamicXpath);
                    WebElement element = driver.findElement(By.xpath(dynamicXpath));
                    scrollToElement(element);
                    Thread.sleep(5000);
                    element.click();
                }

            }
        }
    }
    public static String getDynamicXpath(String xpath, String value){
       return xpath.replace("%replaceable%",value);
    }
    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
    }
}
