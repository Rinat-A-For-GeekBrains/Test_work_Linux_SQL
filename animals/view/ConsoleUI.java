package animals.view;

import animals.model.PackAnimalType;
import animals.model.Pet;
import animals.model.PetAnimalType;
import animals.presenter.Presenter;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
                     4. Выход\s
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
                                print("Введите имя животного");
                                String name = read();
                                print("Введите его день рождения в формате ГГГГ-ММ-ДД");
                                LocalDate date = LocalDate.parse(read());
                                presenter.addPet(PetAnimalType.CAT, name, date);
//                                presenter.addPet(PetAnimalType.CAT, read(), LocalDate.parse(read()));
                                break;
                            }
                            case 2: {
                                print("Введите имя животного");
                                String name = read();
                                print("Введите его день рождения в формате ГГГГ-ММ-ДД");
                                LocalDate date = LocalDate.parse(read());
                                presenter.addPet(PetAnimalType.DOG, name, date);

                                break;
                            }
                            case 3: {
                                print("Введите имя животного");
                                String name = read();
                                print("Введите его день рождения в формате ГГГГ-ММ-ДД");
                                LocalDate date = LocalDate.parse(read());
                                presenter.addPet(PetAnimalType.HAMSTER, name, date);

                                break;
                            }
                            case 4: {
                                print("Введите имя животного");
                                String name = read();
                                print("Введите грузоподъемность животного в кг");
                                double cargo = Double.parseDouble(read());
                                print("Введите его день рождения в формате ГГГГ-ММ-ДД");
                                LocalDate date = LocalDate.parse(read());
                                presenter.addPackAnimal(PackAnimalType.HORSE, name, cargo, date);

//                                print("Введите через пробел имя животного, грузоподъемность, его день рождения");
//                                presenter.addPackAnimal(PackAnimalType.HORSE, read(), Double.parseDouble(read()), LocalDate.parse(read()));
                                break;
                            }
                            case 5: {
                                print("Введите имя животного");
                                String name = read();
                                print("Введите грузоподъемность животного в кг");
                                double cargo = Double.parseDouble(read());
                                print("Введите его день рождения в формате ГГГГ-ММ-ДД");
                                LocalDate date = LocalDate.parse(read());
                                presenter.addPackAnimal(PackAnimalType.CAMEL, name, cargo, date);

                                break;
                            }
                            case 6: {
                                print("Введите имя животного");
                                String name = read();
                                print("Введите грузоподъемность животного в кг");
                                double cargo = Double.parseDouble(read());
                                print("Введите его день рождения в формате ГГГГ-ММ-ДД");
                                LocalDate date = LocalDate.parse(read());
                                presenter.addPackAnimal(PackAnimalType.DONKEY, name, cargo, date);

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
                    List<String> commandList = presenter.getListCommand();

                    for (String s : commandList) {
                        System.out.println(s);
                    }
                }


                break;

                case 3: {
                    print("Введите новую команду для домашних животных");
                    String command = read();
                    presenter.addCommand(command);
                    break;
                }

                case 4: {
                    x = false;
                    break;
                }

            }

        }
    }
}

