package hw3.instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Trumpet implements Instrument{

    private int diameter;

    @Override
    public void play() {
       System.out.println("Play Trumpet with diameter: "+ this.diameter + " diameter");
    }
}
