package pl.Java8_OOP_Helion.OOP_14.model;

class ChocolateBox extends Box {

    private static final int MAX_CHOCOLATE = 10;


    @Override
    void fillIt() {
        numberOfProduct = MAX_CHOCOLATE;

    }
}
