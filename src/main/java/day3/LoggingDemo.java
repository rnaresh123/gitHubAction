package day3;

import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoggingDemo {
    @Test(priority = 1)
    void testLogs() {
        given()
                .when()
                .get("https://regres.in/api/users?page=2")
                .then()
                //.log().body();
               // .log().cookies();
              //  .log().headers();
                .log().all();



    }
}

