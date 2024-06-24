package Day7;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FakerDataGenerator {
    @Test
    void testGenerateDummyData() {

        Faker faker = new Faker();
        String fullname = faker.name().fullName();
        String firstname = faker.name().lastName();
        String lastname = faker.name().lastName();
        String username = faker.name().username();
        String password = faker.internet().password();
        String mobileno = faker.phoneNumber().cellPhone();
        String email = faker.internet().safeEmailAddress();

        System.out.println("fullname:"+fullname);
        System.out.println("firstname:"+firstname);
        System.out.println("lastname:"+lastname);
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        System.out.println("mobileno:"+mobileno);
        System.out.println("email:"+email);


    }
}
