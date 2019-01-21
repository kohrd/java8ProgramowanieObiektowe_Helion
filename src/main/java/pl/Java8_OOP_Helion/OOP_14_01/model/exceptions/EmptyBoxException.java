package pl.Java8_OOP_Helion.OOP_14_01.model.exceptions;

public class EmptyBoxException extends Exception {

    public EmptyBoxException(String nameOfProduct){
        super("Brak produktu" + nameOfProduct);

    }
}
