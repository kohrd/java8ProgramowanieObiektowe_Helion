package pl.Java8_OOP_Helion.OOP_10_02;


import pl.Java8_OOP_Helion.OOP_10_02.shapes.Rectangle;
import pl.Java8_OOP_Helion.OOP_10_02.shapes.Shape;
import pl.Java8_OOP_Helion.OOP_10_02.shapes.Square;

public class Main10_02 {

    public static void main(String[] args) {


        Rectangle myRectangle = new Rectangle(4, 2);
        Square mySquare = new Square(5);
        Square mySquare2 = new Square();


        System.out.println("mySquare = " + mySquare.countArea());
        System.out.println("myRectangle = " + myRectangle.countArea());

//        System.out.println("mySquareName = " + mySquare.getName());
////        System.out.println("myRectangleName = " + myRectangle.getName());
//
//        Shape shape = new Shape() {
//            @Override
//            public String getName() {
//                return super.getName();
//            }
//        };



    }
}
