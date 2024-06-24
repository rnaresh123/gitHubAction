package day4;

import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ParsingJSONResponseData {
    void testJsonResponse() {
        //approach
        given()
                .contentType("ContentType.JSON")

                .when()
                .get("http://localhost:3000/store")

                .then()
                .statusCode(200)
                .header("Content-Type", "application/json; charset=utf-8");


    }
}
