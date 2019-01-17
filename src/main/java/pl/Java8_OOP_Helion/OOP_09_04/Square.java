package pl.Java8_OOP_Helion.OOP_09_04;

public final class Square extends Shape {

    int size;

    public Square(){
       super(); // przy wylowywaniu konstruktora square wywolany zostanie kontruktor shape
        System.out.println("jestem kontruktorem square"); // ale to będzie uzyte tylko przy wywolaniu kontruktora bezargumentowego
    }

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
