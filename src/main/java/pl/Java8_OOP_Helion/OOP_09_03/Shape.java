package pl.Java8_OOP_Helion.OOP_09_03;

public class Shape {

    Shape(){
        System.out.println("Jestem kontruktorem shape");

    }

    int countPerimeter(){
       return 0;
    }

    int countArea(){
        return 0;
    }

    String getName(){
        return getClass().getSimpleName();
    }
}
