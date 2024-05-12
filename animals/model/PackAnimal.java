package animals.model;

import animals.model.Animal;

import java.time.LocalDate;

public class PackAnimal extends Animal {
    PackAnimalType type;
    protected double cargo;

    public PackAnimal(PackAnimalType type, String name, double cargo, LocalDate dateOfBirth) {
        this.type = type;
        this.name = name;
        this.cargo = cargo;
        this.dateOfBirth = dateOfBirth;
    }

}
