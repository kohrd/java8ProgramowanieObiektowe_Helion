package pl.Java8_OOP_Helion.OOP_08_01;

public class Main08_01 {


    public static void main(String[] args) {

        System.out.println("a + b" + sum(2, 3));

    }

    static int sum (int a, int b){
        return a + b;
    }

    static double sum (double a, double b){
        // metodas przeciążając ainny typ zwracany i inne parametry
        return a + b;
    }
}
