package pl.Java8_OOP_Helion.OOP_14.logic;

import pl.Java8_OOP_Helion.OOP_14.logic.view.UserInterface;

public interface CoffeMachine {

    // lista metod dostepnych z poziomu UI

    void makeCoffe();

    void addSugar();

    void setUserInterface(UserInterface userInterface);


}
