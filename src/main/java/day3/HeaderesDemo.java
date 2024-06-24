package day3;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HeaderesDemo {
    @Test(priority = 1)
    void testHeaderes() {
        given()
                .when()
                .get("https://www.google.com/")
                .then()
                .header("Content-Type", "text/html; charset=ISO-8859-1")
                .and()
                .header("Content-Encoding", "gzip")
                .header("Server", "gws")
                .log().all();


    }

    @Test(priority = 2)
    void getHeaderes() {
        Response res = given()
                .when()
                .get("https://www.google.com/");
        Headers myheaderes = res.headers();
        for (Header hd : myheaderes) {
            System.out.println(hd.getName() + "    " + hd.getValue());
        }

    }
}
