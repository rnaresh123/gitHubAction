package sdetinterviewquestionpractice;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingCookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("size of the cookies :" + cookies.size());
        //how to print cookies from browser??
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ":" + cookie.getValue());
        }
        //how to add cookies to the browser
        Cookie cookieobj = new Cookie("MyCookie123", "123456");
        driver.manage().addCookie(cookieobj);
        cookies = driver.manage().getCookies();
        System.out.println("size of the cookie after adding :" + cookies.size());
        //how to delete specific cookie from the browser??
//        driver.manage().deleteCookie(cookieobj);
//        cookies = driver.manage().getCookies();
//        System.out.println("size of the cookie after deleting :" + cookies.size());
        driver.manage().deleteCookieNamed("MyCookie123");
        cookies = driver.manage().getCookies();
        System.out.println("size of the cookie after deleting :" + cookies.size());
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("size of the cookie after deleting all cookies :" + cookies.size());
        driver.quit();


    }
}
