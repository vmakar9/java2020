package hw2.model;


import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
     Skills skills = new Skills("java",10);

     Car car = new Car("lotus",2022,300);
     User user = new User(1,"vasya","pupkin","asd@asd.com",31,Gender.MALE,skills,car);
    }
}
