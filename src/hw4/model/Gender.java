package hw4.model;

import lombok.Getter;
import lombok.Setter;
@Getter
public enum Gender {
    MALE(true),FEMALE(false);
    @Setter
    private boolean pipka;
    Gender(){

    }
    Gender(boolean pipka){
        this.pipka = pipka;
    }
}
