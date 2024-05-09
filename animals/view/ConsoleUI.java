package animals.view;

import animals.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{

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
    public void print(String text)
        {
            System.out.println(text);
    }

    @Override
    public void start() {
        boolean x = true;
        while (x) {
            print("Введите: \n 1. Добавить животное \n 2. Вывести список команд  \n 3. Добавить команду \n " +
                    "4. Добавить команду \n 5. Выход \n ");
            int c = Integer.parseInt(read());
            switch (c) {
                case 1: {
                    print("Введите через пробел ID животного, имя животного");
                    presenter.addPet(parse(), read());
                    break;
                }
                case 2: {
                    presenter.;
                    break;
                }
                case 3: {
                    x = false;
                    break;
                }

            }

    }
}
