package pl.Java8_OOP_Helion.OOP_14_01.model;

public class EmptyBoxException extends Throwable {

    EmptyBoxException (String nameOfProduct){
        super("Brak produktu" + nameOfProduct);

    }
}
