package animals.model.service;

import animals.model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Service {
Counter counter = new Counter();
    public void addPet(PetAnimalType type, String name, LocalDate dateOfBirth) {
        Animal pet = new Pet(type, name, dateOfBirth);

        try  {
            counter.addAnimal();
        } catch (Exception e) {
            System.out.println("Неправильный ввод данных");
        }
    }

    public void addPackAnimal(PackAnimalType type, String name, double cargo, LocalDate dateOfBirth) {
        Animal packAnimal = new PackAnimal(type, name, cargo, dateOfBirth);
        try {
            counter.addAnimal();
        } catch (Exception e) {
            System.out.println("Неправильный ввод данных");
        }
    }

    public ArrayList<String> getCommandList() {
        return Pet.getListCommand();
    }
    public void addCommand (String command)
    {
    Pet.addCommand(command);
    }

}



