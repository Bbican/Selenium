package selenium;

import com.github.javafaker.Faker;
import org.junit.Test;

public class Day05_JavaFaker {
    @Test
    public void fakerTest(){
        // Java faker can be used for genereting fake test data
        // name, lastname, job title, email, city, state, country,....
        // 1. Create a Faker object
        Faker faker = new Faker();

        // 2. Generate some fake data(mock data)
        String fakeName =  faker.name().firstName();
        String fakeLName = faker.name().lastName();
        String fullFullName = faker.name().fullName();
        String fakeUserName = faker.name().username();
        System.out.println("Name :" + fakeName);
        System.out.println("Last Name :" + fakeLName);
        System.out.println("Full Name : " + fullFullName);
        System.out.println("Username : " + fakeUserName);

        // title
        System.out.println(faker.name().title());
        // city
        System.out.println(faker.address().city());
        // state
        System.out.println(faker.address().state());
        // phone number
        System.out.println(faker.phoneNumber().cellPhone());
        // email
        System.out.println(faker.internet().emailAddress());
        // random5 digit number
        System.out.println(faker.number().digits(5)); // zip code
    }


}
