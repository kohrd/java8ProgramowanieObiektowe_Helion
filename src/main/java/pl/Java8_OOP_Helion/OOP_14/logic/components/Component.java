package pl.Java8_OOP_Helion.OOP_14.logic.components;

import pl.Java8_OOP_Helion.OOP_14.logic.view.UserInterface;
import pl.Java8_OOP_Helion.OOP_14.model.Storage;
import pl.Java8_OOP_Helion.OOP_14.model.exceptions.EmptyBoxException;

abstract class Component {

   Storage storage;
    UserInterface userInterface;

    public Component(Storage storage, UserInterface userInterface) {
        //wstrzykiwanie zalezności do storage i userInterface
        this.storage = storage;
        this.userInterface = userInterface;
    }


    public final boolean addComponent() {
        boolean status = false;

        try {
            tryAddComponent();
            status = true;
        } catch (EmptyBoxException ebe) {
            userInterface.showError("Brak produktu " + ebe.getMessage());

        } finally {
            userInterface.playSound();
        }
        return status;
    }

    abstract void tryAddComponent() throws EmptyBoxException;


}

