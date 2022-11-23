package hw3.instruments;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(new Guitar(8));
        instrumentList.add(new Drum(15));
        instrumentList.add(new Trumpet(12));


        for(Instrument instrument: instrumentList){
            instrument.play();
        }
    }
}
