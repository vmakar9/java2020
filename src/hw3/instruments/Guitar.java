package hw3.instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Guitar implements Instrument{

    private int avgStrings;


    @Override
    public void play() {
      System.out.println("Play Guitar with number of strings: " + this.avgStrings + " strings");
    }
}
