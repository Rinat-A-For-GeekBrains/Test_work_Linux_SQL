package animals.presenter;

import animals.model.PackAnimalType;
import animals.model.Pet;
import animals.model.PetAnimalType;
import animals.model.service.Service;
import animals.view.ConsoleUI;
import animals.view.View;

import java.time.LocalDate;

public class Presenter {
    View consoleUI;
    Service service = new Service();

    public Presenter(View ui)
    {
        consoleUI = ui;
    }

    public void addPet(PetAnimalType type, String name, LocalDate dateOfBirth)
    {
        service.addPet( type, name, dateOfBirth);
    }

    public void addPackAnimal(PackAnimalType type, String name, double cargo, LocalDate dateOfBirth)
    {
        service.addPackAnimal(type, name, cargo, dateOfBirth);
    }


    Pet.get
}
