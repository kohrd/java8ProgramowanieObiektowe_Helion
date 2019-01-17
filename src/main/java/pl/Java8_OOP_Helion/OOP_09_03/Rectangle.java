package pl.Java8_OOP_Helion.OOP_09_03;

public class Rectangle extends Shape {

    int height;
    int width;

    Rectangle() {
        //konstruktor domyslny
        width = 0;
        height = 0;
    }

    Rectangle(int size) {
//        /kontruktor dla kwadratu
        this.height = size;
    }

    Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    int countArea(){
        return height*width;
    }

    @Override
    int countPerimeter(){
        return 2*width+2*height;
    }
}
