package utils;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by kamilwrobel on 08.09.2016.
 */
public class FakerTest {

    @Test
    public void test_name(){
        String name = Faker.name();
        System.out.println(name);
        assertTrue(name.length() > 0);
    }

    @Test
    public void test_lastName(){
        String lastname = Faker.lastName();
        System.out.println(lastname);
        assertTrue(lastname.length() > 0);
    }

    @Test
    public void test_city(){
        String city = Faker.city();
        System.out.println(city);
        assertTrue(city.length() > 0);
    }

    @Test
    public void test_phone1(){
        String phone = Faker.phone(9);
        System.out.println(phone);
        assertTrue(phone.length() == 9);
    }

    @Test
    public void test_phone2(){
        String phone = Faker.phone("xxx xxx xxx", ' ');
        System.out.println(phone);
        assertTrue(phone.matches("^\\d{3} \\d{3} \\d{3}$"));
    }

    @Test
    public void test_postalCode1(){
        String postal = Faker.postalCode();
        System.out.println(postal);
        assertTrue(postal.matches("^\\d{2}-\\d{3}$"));
    }

    @Test
    public void test_postalCode2(){
        String postal = Faker.postalCode("xxx%xxx",'%');
        System.out.println(postal);
        assertTrue(postal.matches("^\\d{3}%\\d{3}$"));
    }

    @Test
    public void test_stringFromPattern(){
        String postal = Faker.stringFromPattern("LLNNSS");
        System.out.println(postal);
    }
}