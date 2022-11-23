package hw3.instruments;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar(8),new Drum(16),new Trumpet(12)};

        for (int i = 0; i <instruments.length ; i++) {
             instruments[i].play();
        }

    }
}
