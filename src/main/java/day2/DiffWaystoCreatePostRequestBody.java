package day2;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import java.util.HashMap;

public class DiffWaystoCreatePostRequestBody {
    @Test
    void testPostUsingHashMap(){
        HashMap data=new HashMap();
        data.put("name","Scott");
        data.put("location","France");
        data.put("phone","123456");
        data.put("name","Scott");
        String coursesArr[]={"C","C++"};
        data.put("courses",coursesArr);

        given()
                .contentType("application/json")
                .body(data)
                .when()
                .post("https://reqres.in/api/users/2")
                .then()
                .statusCode(200);

    }

}
