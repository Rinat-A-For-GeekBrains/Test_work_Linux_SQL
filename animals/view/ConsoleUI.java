package animals.view;

import java.util.Scanner;

public class ConsoleUI implements View{

    private final Scanner scanner;

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
            print("Введите: \n 1. Добавить животное \n 2. Определить животное в класс \n 3. Вывести список команд \n " +
                    "4. Добавить команду \n 5. Выход \n ");
            int c = Integer.parseInt(read());
            switch (c) {
                case 1: {
                    print("Введите через пробел ID животного, имя животного");
                    presenter.addAnimal(.parseInt(read()), read());
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
