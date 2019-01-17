package pl.Java8_OOP_Helion.OOP_09_05;


import pl.Java8_OOP_Helion.OOP_09_05.shapes.Rectangle;
import pl.Java8_OOP_Helion.OOP_09_05.shapes.Square;

public class Main09_05 {

    public static void main(String[] args) {


        Rectangle myRectangle = new Rectangle(4, 2);
        Square mySquare = new Square(5);
        Square mySquare2 = new Square();


        System.out.println("mySquare = " + mySquare.countArea());
        System.out.println("myRectangle = " + myRectangle.countArea());

        System.out.println("mySquareName = " + mySquare.getName());
        System.out.println("myRectangleName = " + myRectangle.getName());


    }
}
