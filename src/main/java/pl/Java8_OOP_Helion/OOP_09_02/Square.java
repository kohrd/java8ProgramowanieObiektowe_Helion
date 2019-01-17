package pl.Java8_OOP_Helion.OOP_09_02;

public class Square extends Shape{

    int size;

    public Square(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // napisanie metody
    @Override
    int countArea(){
        return size*size;
    }

    // napisanie metody
    @Override
    int countPerimeter(){
        return 4*size;
    }
}
