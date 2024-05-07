package animals.model.service;

import animals.model.Animal;
import animals.model.pets.Cat;
import animals.model.pets.Dog;
import animals.model.pets.Hamster;

import java.time.LocalDate;

public class Service {


    public void addCat(String name, LocalDate dateOfBirth) {
        Animal cat = new Cat (name, dateOfBirth);

    }
    public void addDog(String name, LocalDate dateOfBirth) {
        Animal dog = new Dog(name, dateOfBirth);

    }
    public void addHamster(String name, LocalDate dateOfBirth) {
        Animal hamster = new Hamster(name, dateOfBirth);

    }

}



