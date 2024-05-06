package animals.model.pets;

import animals.model.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pet extends Animal {

protected ArrayList <String> commandList = new ArrayList<>(){{add ("Сидеть"); add("Лежать"); add("Голос");}};


    public Pet (String name, LocalDate dateOfBirth)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

}
