package hw2.PC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Laptop extends PC{
    private int battery;
    private boolean touchpad;
}
