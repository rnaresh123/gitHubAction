package restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import java.util.HashMap;

public class HTTPRequests {
    int id;

    @Test(priority = 1)
    void getUsers() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page", equalTo(2))
                .log().all();
    }

    @Test(priority = 2)
    void creatUser() {
        HashMap data = new HashMap();
        data.put("name", "naresh");
        data.put("job", "learner");
        id = given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users/2")
                .jsonPath().getInt("id");
//               .then()
//                .statusCode(201)
//                .log().all();

    }

    @Test(priority = 3,dependsOnMethods = "creatUser")
    void updateUser() {
        HashMap data = new HashMap();
        data.put("name", "khaja");
        data.put("job", "teacher");
        given()
                .contentType("application/json")
                .body(data)
                .when()
                .put("https://reqres.in/api/users/2"+id)
                .then()
                .statusCode(200)
                .log().all();

    }
    @Test(priority=4)
    void deleteUser(){
        given()
                .when()
                .delete("https://reqres.in/api/users/"+id)
                .then()
                .statusCode(204)
                .log().all();
    }


}
