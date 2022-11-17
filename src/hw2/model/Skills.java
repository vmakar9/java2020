package hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data

public class Skills {
    private String title;
    private int exp;

    public Skills(String title,int exp){
        this.title = title;
        this.exp = exp;
    }
}
