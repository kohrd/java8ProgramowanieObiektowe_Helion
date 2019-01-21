package pl.Java8_OOP_Helion.OOP_14_01.model;

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

    private void fillAll() {
        milkBox.fillIt();
        chocolateBox.fillIt();
        coffeBox.fillIt();

    }

    public void getCoffe() throws EmptyBoxException {
        if (!coffeBox.takeProduct()){
            throw new EmptyBoxException ("kawa");

        }
    }



}
