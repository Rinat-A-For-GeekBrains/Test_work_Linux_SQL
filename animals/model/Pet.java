package animals.model;
import animals.model.Animal;
import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.System.out;

public class Pet extends Animal {
PetAnimalType type;
protected static ArrayList <String> commandList = new ArrayList<>(){{add ("Сидеть"); add("Лежать"); add("Голос");}};

    public Pet (PetAnimalType type, String name, LocalDate dateOfBirth)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.type = type;

    }
public static ArrayList<String> getListCommand(){
        return commandList;
}
public static void addCommand(String command){
        commandList.add(command);
}
}
