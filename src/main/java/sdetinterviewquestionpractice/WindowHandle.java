package sdetinterviewquestionpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //get WindowHandle
        String windowID = driver.getWindowHandle();
        System.out.println(windowID);
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
        //get window handles
        Set<String> windowIDs = driver.getWindowHandles();
        //FirstMethod-->iterator()
        Iterator<String> it = windowIDs.iterator();
        String parentWindowID = it.next();
        String childWindowID = it.next();
        System.out.println("parent window Id:" + parentWindowID);
        System.out.println("child window ID:" + childWindowID);
        //second method--->using List/ArrayList()
        List<String> windowIDsList = new ArrayList<>(windowIDs);//converting Set--->List
//        String parentWindowId = windowIDsList.get(0);
//        String childWindowList = windowIDsList.get(1);
//        System.out.println("parent window id: "+parentWindowId);
//        System.out.println("child window id :"+childWindowList);
//
//        driver.switchTo().window(parentWindowId);
//        System.out.println("parent window title :"+driver.getTitle());
//        driver.switchTo().window(childWindowID);
//        System.out.println("child window title :"+driver.getTitle());
//        for (String winID : windowIDsList) {
//            // System.out.println(winID);
//            String title = driver.switchTo().window(winID).getTitle();
//            System.out.println(title);
//        }
        // driver.close();//close single browser window which pining driver
        //  driver.quit(); // close the browser windows
        for (String winID : windowIDsList) {
            // System.out.println(winID);
            String title = driver.switchTo().window(winID).getTitle();
            System.out.println(title);

        }
        for (String winID : windowIDsList) {
            // System.out.println(winID);
            String title = driver.switchTo().window(winID).getTitle();
            if (title.equals("Human Resources Management Software | OrangeHRM")||title.equals("OrangeHRM"))
            {
                driver.close();
            }
            System.out.println(title);

        }
    }
}
