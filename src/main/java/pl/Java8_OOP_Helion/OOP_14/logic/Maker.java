package pl.Java8_OOP_Helion.OOP_14.logic;

import pl.Java8_OOP_Helion.OOP_14.logic.components.ChocolateComponent;
import pl.Java8_OOP_Helion.OOP_14.logic.components.CoffeComponent;
import pl.Java8_OOP_Helion.OOP_14.logic.components.MilkComponent;
import pl.Java8_OOP_Helion.OOP_14.logic.view.UserInterface;
import pl.Java8_OOP_Helion.OOP_14.model.Storage;

abstract class Maker implements  CoffeMachine{

    UserInterface userInterface;
    ChocolateComponent chocolateComponent;
    CoffeComponent coffeComponent;
    MilkComponent milkComponent;

    private boolean sugar;

    Maker(UserInterface userInterface){
        this.userInterface = userInterface;
    }

     @Override
     public void makeCoffe() {
         Storage storage = Storage.getInstance(); // singleton
         coffeComponent = new CoffeComponent(storage, userInterface);
         milkComponent = new MilkComponent(storage, userInterface);
         chocolateComponent = new ChocolateComponent(storage, userInterface);

         

     }

     @Override
     public void addSugar() {
         sugar = true;
         userInterface.showStep("dodano cukier");

     }

     @Override
     public void setUserInterface(UserInterface userInterface) {
         userInterface = userInterface;

     }
 }
