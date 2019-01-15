package pl.Java8_OOP_Helion.OOP_03_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main03_05 {


    public static void main(String[] args) {
        int numberOfCoffes = 0;
        System.out.println("Zamówiono: " + numberOfCoffes + " kaw");
        System.out.println("podaj liczbe kaw");
        Scanner myScanner = new Scanner(System.in);
        try{
             numberOfCoffes =  myScanner.nextInt();

        }catch (InputMismatchException exception){
            System.out.println("Bledne dane");
        }
        System.out.println("zamoiono :" + numberOfCoffes + " kaw");


    }
}
