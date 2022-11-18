package hw2.model;


import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {


     Car car = new Car("lotus",2022,300);
     User user = new User(1,
             "vasya",
             "pupkin",
             "asd@asd.com",
             31,
             Gender.MALE,
             Arrays.asList(new Skills("java",10),new Skills("js",10))
             ,car);
     System.out.println(user);
    }
}
