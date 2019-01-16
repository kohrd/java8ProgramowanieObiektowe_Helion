package pl.Java8_OOP_Helion.OOP_08_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main08_04 {


    public static void main(String[] args) {
        int numberOfCoffes = 0;
        int tries = 0; // iterator prob podania zlej wartosci
        System.out.println("wybierz kawe: [M] - z mlekiem, [K] - czarna");
        Scanner myScanner = new Scanner(System.in);
        String coffeType = myScanner.next();
        if (coffeType.equalsIgnoreCase("m") || coffeType.equalsIgnoreCase("k")) {
            do {
                // pobranie lifczby kaw od uzytkownia
                System.out.println("podaj liczbe kaw");
//            Scanner myScanner = new Scanner(System.in);
                try {
                    tries++;  // zwiekszenie iteratora przy podaniu zlej wartosci
                    numberOfCoffes = myScanner.nextInt();

                } catch (InputMismatchException exception) {
                    System.out.println("Bledne dane");

                }

            } while (tries < 3 && numberOfCoffes <= 0);
            System.out.println("zamoiono :" + numberOfCoffes + " kaw");
            switch (coffeType) {
                case "M":
                case "m":
                    System.out.println("kaw z mlekiem");
                case "K":
                case "k":
                    System.out.println("kaw czarnych");
            }
        } else {
            System.out.println("nie ma takiej kawy");


        }
    }
}