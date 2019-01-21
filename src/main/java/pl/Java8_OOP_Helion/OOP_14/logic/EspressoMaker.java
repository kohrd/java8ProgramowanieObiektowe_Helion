package pl.Java8_OOP_Helion.OOP_14.logic;

import pl.Java8_OOP_Helion.OOP_14.logic.view.UserInterface;

public class EspressoMaker extends Maker {


    EspressoMaker(UserInterface userInterface) {
        super(userInterface);
    }


    @Override
    public void makeCoffe() {
        super.makeCoffe();
        boolean status = coffeComponent.addComponent();
        if (status){
            userInterface.showCoffeeReady("Espresso gotowe");
        }

    }
}
