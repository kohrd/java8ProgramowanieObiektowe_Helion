package pl.Java8_OOP_Helion.OOP_14.model;

import pl.Java8_OOP_Helion.OOP_14.model.exceptions.EmptyBoxException;

public class Storage {
    // jest to api
    // w tym magazynku zdefiniowany jest kazdy z boxow

    CoffeBox coffeBox;
    MilkBox milkBox;
    ChocolateBox chocolateBox;

    private Storage(){
        milkBox = new MilkBox();
        coffeBox = new CoffeBox();
        chocolateBox = new ChocolateBox();
        fillAll();
    }

    public void fillAll() {
        milkBox.fillIt();
        chocolateBox.fillIt();
        coffeBox.fillIt();

    }

    public void getCoffe() throws EmptyBoxException {
        if (!coffeBox.takeProduct()){
            throw new EmptyBoxException ("kawa");

        }
    }

    public void getMilk() throws EmptyBoxException {
        if (!coffeBox.takeProduct()){
            throw new EmptyBoxException ("mleko");

        }
    }

    public void getChocolate() throws EmptyBoxException {
        if (!coffeBox.takeProduct()){
            throw new EmptyBoxException ("czekolada");

        }
    }


}
