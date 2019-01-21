package pl.Java8_OOP_Helion.OOP_14.model;

public abstract class Box {

    int numberOfProduct = 0; //inofrmacja o liczbie produktu

    boolean takeProduct() {
        /**
         * infoprmuje czy udalo się pobrac określoną ilosc produktu
         */

        if (isEmpty()) {
            return  false;
        }
        numberOfProduct --;

        return true;

    }

    boolean isEmpty() {
        /**
         * informuje czy pojemnik jest pusty
         */
        return numberOfProduct <= 0;
    }

    abstract void fillIt();

}
