package animals.model.service;

import animals.model.*;

import java.time.LocalDate;

public class Service {

    public void addPet (PetAnimalType type, String name, LocalDate dateOfBirth)
    {
        Animal pet = new Pet (type, name, dateOfBirth) ;
    }
    public void addPackAnimal (PackAnimalType type, String name, double cargo, LocalDate dateOfBirth)
    {
        Animal packAnimal = new PackAnimal (type, name, cargo, dateOfBirth) ;
    }
    public void printCommandList(){
        Pet.printCommandList();
}
}



