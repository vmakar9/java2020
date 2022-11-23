package hw3.reading;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Printable> printableList = new ArrayList<>();
      printableList.add(new Magazine());
      printableList.add(new Book());
    }
}
