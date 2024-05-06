package animals.model.pack_animal;

import animals.model.Animal;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PackAnimal extends Animal {

    protected  double cargo;

    public PackAnimal (String name, double cargo, LocalDate dateOfBirth)
    {
        this.name =name;
        this.cargo = cargo;
        this.dateOfBirth = dateOfBirth;
    }

}
