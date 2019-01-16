package pl.Java8_OOP_Helion.OOP_06_02;

public class Main06_02 {

    public static void main(String[] args) {
        int[] array = {1, 3, 23, 3, 5, 6, 7, 8, 9, 0, 9, 8, 7, 5, 6, 67, 56, 45, 34, 345, 45, 46, 546, 5, 65, 6, 4, 64, 2, 435, 3, 5, 3, 53, 5, 35, 3, 5, 35, 3, 53, 5, 3, 53};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        // for each
        for (int value : array) {
            System.out.println(value);

        }

    }

}
