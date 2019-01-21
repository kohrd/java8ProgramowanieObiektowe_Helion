package pl.Java8_OOP_Helion.JP_08_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main08_01 {


    public static void main(String[] args) throws FileNotFoundException {
        // mimo porad ze stacka nie wczytuje poprawnie sciezek
        File plik = new File("/home/gosiakonrad/IdeaProjects/java8ProgramowanieObiektowe_Helion/src/main/resources/plikiTxt/plikTxt_08_01.txt");
        System.out.println("plik.length() = " + plik.length());
        System.out.println("plik.canRead() = " + plik.canRead());
        System.out.println("plik.exists() = " + plik.exists());
        System.out.println("plik.getFreeSpace() = " + plik.getFreeSpace());
        System.out.println("plik.getPath() = " + plik.getPath());
        System.out.println("plik.getAbsolutePath() = " + plik.getAbsolutePath());


        // odczyt pliku
        Scanner scannerOdczyt = new Scanner(plik);
        String textPliku = scannerOdczyt.nextLine();
        System.out.println(textPliku);

        if (plik.length() > 0){
            while (scannerOdczyt.hasNextLine()) {
                System.out.println(scannerOdczyt.nextLine());
            }
        }else{
            System.out.println("plik jest pusty");
        }


    }
}
