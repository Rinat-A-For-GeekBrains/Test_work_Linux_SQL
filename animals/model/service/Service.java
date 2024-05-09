package animals.model.service;

import animals.model.Animal;
import animals.model.pack_animal.Camel;
import animals.model.pack_animal.Donkey;
import animals.model.pack_animal.Horse;
import animals.model.pack_animal.PackAnimal;
import animals.model.pets.Cat;
import animals.model.pets.Dog;
import animals.model.pets.Hamster;
import animals.model.pets.Pet;

import java.time.LocalDate;

public class Service {


    public void addPet (String name, LocalDate dateOfBirth) {
        Animal cat = new Pet (name, dateOfBirth);

    }
    public void addDog(String name, LocalDate dateOfBirth) {
        Animal dog = new Pet (name, dateOfBirth);

    }
    public void addHamster(String name, LocalDate dateOfBirth) {
        Animal hamster = new Pet (name, dateOfBirth);
    }
    public void addHorse(String name,double cargo, LocalDate dateOfBirth) {
        Animal horse = new PackAnimal(name, cargo, dateOfBirth) {
        };
    }

    public void addCamel (String name,double cargo, LocalDate dateOfBirth) {
        Animal camel = new PackAnimal(name, cargo, dateOfBirth);
    }

    public void addDonkey(String name, double cargo, LocalDate dateOfBirth) {
        Animal donkey = new PackAnimal(name, cargo, dateOfBirth);
    }

}



