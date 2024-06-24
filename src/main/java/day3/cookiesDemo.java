package day3;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import java.util.Map;

public class cookiesDemo {
    @Test
    void testCookies() {
        given()
                .when()
                .get("https://www.google.com")
                .then()
                .log().all();


    }

    @Test
    void getCookiesInfo() {
        Response rep = given()
                .when()
                .get("https://www.google.com");
        // get single cookie information
        // String cookie_value=rep.getCookie("AEC");
        // System.out.println("value of cookie is=========>"+
        // get all cookies information
        Map<String, String> cookies_values = rep.getCookies();
        System.out.println(cookies_values.keySet());
        for (String k : cookies_values.keySet()) {
            String cookie = rep.getCookie(k);
            System.out.println(k + "" + cookie);
        }

    }

}
