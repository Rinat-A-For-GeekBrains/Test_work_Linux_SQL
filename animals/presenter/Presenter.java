package animals.presenter;

import animals.model.service.Service;

public class Presenter {
    View consoleUI;
    Service service = new Service();

    public Presenter(View ui) {
        consoleUI = ui;
    }

    public void addAnimal( String name) {
        service.addAnimal(name);
    }


}
