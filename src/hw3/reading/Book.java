package hw3.reading;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Book implements Printable{
    @Override
    public void print() {
        System.out.println("sus");
    }
}
