package hw4.Users;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users =new ArrayList<>();

        users.add(new User(18, "kokos"));
        users.add(new User(25, "Vergil"));
        users.add(new User(20, "Dante"));
        users.add(new User(17, "Nero"));
        users.add(new User(30, "Vasyl"));
        users.add(new User(28, "Carl Jonson"));

        users.sort((u1,u2) -> u1.getAge()-u2.getAge());
        System.out.println(users);

        users.sort((u1,u2)-> u2.getAge()-u1.getAge());
        System.out.println(users);

        users.sort((u1, u2) -> u1.getName().length() - u2.getName().length());
        System.out.println(users);

        users.sort((u1,u2)->  u2.getName().length() - u1.getName().length());
        System.out.println(users);

    }
}
