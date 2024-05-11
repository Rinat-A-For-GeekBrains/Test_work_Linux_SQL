package animals.view;

import animals.model.PackAnimalType;
import animals.model.Pet;
import animals.model.PetAnimalType;
import animals.presenter.Presenter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {

    private final Scanner scanner;
    Presenter presenter = new Presenter(this);

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        boolean x = true;
        while (x) {
            print("""
                    Введите:\s
                     1. Добавить животное\s
                     2. Вывести список команд \s
                     3. Добавить команду\s
                     4. Добавить команду\s
                     5. Выход\s
                    \s""");
            int c = Integer.parseInt(read());
            switch (c) {
                case 1: {
                    boolean y = true;
                    while (y) {
                        print("""
                                Введите:\s
                                 1. Добавить кота\s
                                 2. Добавить собаку \s
                                 3. Добавить хомяка\s
                                 4. Добавить лошадь\s
                                 5. Добавить верблюда\s
                                 6. Добавить осла\s
                                 7. Выход\s
                                \s""");
                        int a = Integer.parseInt(read());
                        switch (a) {
                            case 1: {
                                print("Введите через пробел имя животного, его день рождения");
                                presenter.addPet(PetAnimalType.CAT, read(), LocalDate.parse(read()));
                                break;
                            }
                            case 2: {
                                print("Введите через пробел имя животного, его день рождения");
                                presenter.addPet(PetAnimalType.DOG, read(), LocalDate.parse(read()));
                                break;
                            }
                            case 3: {
                                print("Введите через пробел имя животного, его день рождения");
                                presenter.addPet(PetAnimalType.HAMSTER, read(), LocalDate.parse(read()));
                                break;
                            }
                            case 4: {
                                print("Введите через пробел имя животного, грузоподъемность, его день рождения");
                                presenter.addPackAnimal(PackAnimalType.HORSE, read(), Double.parseDouble(read()), LocalDate.parse(read()));
                                break;
                            }
                            case 5: {
                                print("Введите через пробел имя животного, грузоподъемность, его день рождения");
                                presenter.addPackAnimal(PackAnimalType.CAMEL,read(), Double.parseDouble(read()), LocalDate.parse(read()));
                                break;
                            }
                            case 6: {
                                print("Введите через пробел имя животного, грузоподъемность, его день рождения");
                                presenter.addPackAnimal(PackAnimalType.DONKEY,read(), Double.parseDouble(read()), LocalDate.parse(read()));
                                break;
                            }
                            case 7: {
                                y = false;
                                break;
                            }

                        }
                    }


                }

            case 2: {
                presenter.printCommandList;

                Pet.printCommmandList;
                break;
            }
            case 3: {
                x = false;
                break;
            }

        }

    }
}
