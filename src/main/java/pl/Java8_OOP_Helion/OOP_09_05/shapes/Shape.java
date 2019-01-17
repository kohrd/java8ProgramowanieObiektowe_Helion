package pl.Java8_OOP_Helion.OOP_09_05.shapes;


class Shape {

    Shape(){
        System.out.println("Jestem kontruktorem shape");

    }

    int countPerimeter(){
       return 0;
    }

    int countArea(){
        return 0;
    }

    public String getName(){
        return getClass().getSimpleName();
    }
}
