package pl.Java8_OOP_Helion.OOP_10_02.shapes;

public interface IShape {

    default int countArea(){
        return 0;
    }

    int countPerimeter();


}
