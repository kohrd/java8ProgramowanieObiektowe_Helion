package pl.Java8_OOP_Helion.OOP_04_02;

public class Main_04_02 {

    public static void main(String[] args) {

        int a = 4;

        if (a % 2 == 0  && a > 0) { // && ||
            System.out.println("jest parzyste i dodatni");
        } else if (a % 3 == 0) {
            System.out.println("ale dzieli sie rpozez 3");
        } else {
            System.out.println("nie jest");
        }
    }
}


