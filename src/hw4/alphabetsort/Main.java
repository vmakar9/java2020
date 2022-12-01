package hw4.alphabetsort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add("fkljbkjefddsjfwfgtrsdf");
        strings.add("kmflbkeglskdmqwedmlkdsmlkvq");
        strings.add("wqioeujrthiosdlknvffkksdjfhwrklg");
        strings.add("qwertyuiopaasdfghjkl");
        strings.add("zxcvbnmasdfghjklpoiuytreqd");
        strings.add("dertyuiopfghjklcvbnmswed");

        strings.sort(String::compareToIgnoreCase);
        System.out.println(strings);
    }
}
