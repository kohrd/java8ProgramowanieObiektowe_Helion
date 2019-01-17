package pl.Java8_OOP_Helion.OOP_10_02.shapes;


public abstract class Shape {

    public Shape() {
        System.out.println("Jestem kontruktorem shape");

    }

    abstract int countPerimeter();

    abstract int countArea();

    public String getName() {
        return getClass().getSimpleName();
    }
}
