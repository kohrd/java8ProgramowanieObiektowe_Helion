package pl.Java8_OOP_Helion.OOP_14.model;

class CoffeBox extends Box {

    private static final int MAX_COFFEE = 30;


    @Override
    void fillIt() {
        numberOfProduct = MAX_COFFEE;

    }


}
