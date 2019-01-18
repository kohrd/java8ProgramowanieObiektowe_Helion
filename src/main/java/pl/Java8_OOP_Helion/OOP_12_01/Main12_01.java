package pl.Java8_OOP_Helion.OOP_12_01;

public class Main12_01 {
    // Exception in thread "main" java.lang.StackOverflowError

    public static String stackOverflow1(String napis){
        stackOverflow1(napis);
        return napis;
    }

    public static String stackOverflow2(String napis){
        stackOverflow1(napis);
        return napis;
    }

    public static void main(String[] args) {
        System.out.println(stackOverflow1("a"));
        int size = -4;
        try {

            System.out.println(countArea(size));
        } catch (IllegalArgumentException iae) {

            System.out.println("niepoprawne dane " + iae.getMessage());
        } finally {
            // blok finally wykonuje się gdy poleci wyjątek lub nie bedzie wyjątku
            // dla operacji które zawsze musza byc wykonane
            // np zamkniecie pliku
            System.out.println("blok finally");
        }

        System.gc(); // uruchomienie garbage collectora
    }

    public static int countArea(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("bok musi byc dodatni");
        }
        return size * size;
    }

}
