package animals.model.service;

import animals.model.Animal;
import animals.model.pets.Cat;

import java.time.LocalDate;
import java.time.Month;

public class Service {


    public void addCat(int animal_id, String name) {
        Animal cat = new Cat("Vasya", LocalDate.parse("24.12.2020"));

    }
}



