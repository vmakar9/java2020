package hw4.model;


import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<User> users = new HashSet<>();
//        users.add(new User(1,"vasya","pupkin","dfgreas@gmail.com",31,Gender.MALE,
//                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10)),
//                new Car("toyota",2020,300)));
//        users.add(new User(2,"kokos","kokosov","fgtrsdf@gmail.com",24,Gender.MALE,
//                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10),new Skills("c",11)),
//                new Car("kia",2010,180)));
//        users.add(new User(3,"Mona","Monoon","Sweqasd@gmail.com",35,Gender.FEMALE,
//                Arrays.asList(new Skills("js",10),new Skills("c++",10)),
//                new Car("bmw",2015,310)));
//        users.add(new User(4,"Moon","skoadji","bhgmtk@gmail.com",21,Gender.FEMALE,
//                Arrays.asList(new Skills("java",10)),
//                new Car("lanos",2006,150)));
//        users.add(new User(5,"Lady","SDwqeasd","bgty@gmail.com",36,Gender.FEMALE,
//                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10),new Skills("html",10),new Skills("React",12)),
//                new Car("maserati",2019,280)));
//        users.add(new User(6,"Denis","Vgfgr","Frsewq@gmail.com",18,Gender.MALE,
//                Arrays.asList(new Skills("java",2),new Skills("js",5)),
//                new Car("zhiguli",2002,100)));
//        users.add(new User(7,"Dr","Dre","gtdfqw@gmail.com",50,Gender.MALE,
//                Arrays.asList(new Skills("java",10),new Skills("c++",10)),
//                new Car("fgpjring",2022,300)));
//        users.add(new User(8,"Vlad","Qwerty","dffrsqwe@gmail.com",20,Gender.MALE,
//                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10),new Skills("React",10),new Skills("Angular",10)),
//                new Car("shevrole",2010,200)));
//        users.add(new User(9,"qwe","qwe","weq@gmail.com",45,Gender.MALE,
//                Arrays.asList(new Skills("assembler",10),new Skills("c++",10)),
//                new Car("nissan",2005,140)));
//        users.add(new User(10,"bti","pin","grefqwe@gmail.com",22,Gender.FEMALE,
//                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10)),
//                new Car("lanos",2001,100)));
//        users.removeIf(user -> user.getGender().isPipka());
//        System.out.println(users);

        TreeSet<User>users1 = new TreeSet<>();

        users1.add(new User(1,"vasya","pupkin","dfgreas@gmail.com",31,Gender.MALE,
                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10)),
                new Car("toyota",2020,300)));
        users1.add(new User(2,"kokos","kokosov","fgtrsdf@gmail.com",24,Gender.MALE,
                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10),new Skills("c",11)),
                new Car("kia",2010,180)));
        users1.add(new User(3,"Mona","Monoon","Sweqasd@gmail.com",35,Gender.FEMALE,
                Arrays.asList(new Skills("js",10),new Skills("c++",10)),
                new Car("bmw",2015,310)));
        users1.add(new User(4,"Moon","skoadji","bhgmtk@gmail.com",21,Gender.FEMALE,
                Arrays.asList(new Skills("java",10)),
                new Car("lanos",2006,150)));
        users1.add(new User(5,"Lady","SDwqeasd","bgty@gmail.com",36,Gender.FEMALE,
                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10),new Skills("html",10),new Skills("React",12)),
                new Car("maserati",2019,280)));
        users1.add(new User(6,"Denis","Vgfgr","Frsewq@gmail.com",18,Gender.MALE,
                Arrays.asList(new Skills("java",2),new Skills("js",5)),
                new Car("zhiguli",2002,100)));
        users1.add(new User(7,"Dr","Dre","gtdfqw@gmail.com",50,Gender.MALE,
                Arrays.asList(new Skills("java",10),new Skills("c++",10)),
                new Car("fgpjring",2022,300)));
        users1.add(new User(8,"Vlad","Qwerty","dffrsqwe@gmail.com",20,Gender.MALE,
                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10),new Skills("React",10),new Skills("Angular",10)),
                new Car("shevrole",2010,200)));
        users1.add(new User(9,"qwe","qwe","weq@gmail.com",45,Gender.MALE,
                Arrays.asList(new Skills("assembler",10),new Skills("c++",10)),
                new Car("nissan",2005,140)));
        users1.add(new User(10,"bti","pin","grefqwe@gmail.com",22,Gender.FEMALE,
                Arrays.asList(new Skills("java",10),new Skills("js",10),new Skills("c++",10)),
                new Car("lanos",2001,100)));

        System.out.println(users1);
    }
}
