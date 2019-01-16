package pl.Java8_OOP_Helion.OOP_06_03;

public class Main_06_03 {


    public static void main(String[] args) {
        int[] array = {12, 23, 34, 45, 56, 67, 78, 89, 90, 234};

        int i = 0;

        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    i=0;
        do { // warunek while sprawdzany jest na koncu
            System.out.println("z petla do while: "+array[i]);
            i++;
        } while (i < array.length);


        System.out.println(metoda("aaaaaa"));
    }

    public static String metoda (String napis){
        if (napis.length() == 5){
            System.out.println("ma 5");
            return napis;
        }else if (napis.length()==1){
            System.out.println("ma jeden");
            return napis;
        }
        return null;
    }
}
