package animals.presenter;

import animals.model.service.Service;
import animals.view.View;

import java.time.LocalDate;

public class Presenter {
    View consoleUI;
    Service service = new Service();

    public Presenter(View ui)
    {
        consoleUI = ui;
    }

    public void addPet( String name, LocalDate dateOfBirth)
    {
        service.addPet(name, dateOfBirth);
    }
    public void addDog( String name, LocalDate dateOfBirth)
    {
        service.addDog(name, dateOfBirth);
    }
    public void addHamster( String name, LocalDate dateOfBirth)
    {
        service.addHamster(name, dateOfBirth);
    }
    public void addCamel( String name, double cargo, LocalDate dateOfBirth)
    {
        service.addCamel(name, cargo, dateOfBirth);
    }
    public void addHorse( String name, double cargo, LocalDate dateOfBirth)
    {
        service.addHorse(name, cargo, dateOfBirth);
    }
}
