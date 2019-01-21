package pl.Java8_OOP_Helion.OOP_14.model;

class MilkBox extends  Box {

    private static final int MAX_MILK = 15;


    @Override
    void fillIt() {
        numberOfProduct = MAX_MILK;

    }



}
