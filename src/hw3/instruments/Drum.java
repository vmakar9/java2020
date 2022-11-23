package hw3.instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Drum implements Instrument{

    private int size;

    @Override
    public void play() {
      System.out.println("Play Drums with size: " + this.size + " size");
    }
}
