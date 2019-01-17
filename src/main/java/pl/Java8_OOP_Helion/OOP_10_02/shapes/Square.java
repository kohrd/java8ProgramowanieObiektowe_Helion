package pl.Java8_OOP_Helion.OOP_10_02.shapes;

public final class Square extends Shape {

    private int size;

    public Square(){
       super(); // przy wylowywaniu konstruktora square wywolany zostanie kontruktor shape
        System.out.println("jestem kontruktorem square"); // ale to będzie uzyte tylko przy wywolaniu kontruktora bezargumentowego
    }

    public Square(int size){
        this.size = size;
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    // napisanie metody
    @Override
    public int countArea(){
        return size*size;
    }

    // napisanie metody
    @Override
    int countPerimeter(){
        return 4*size;
    }
}
