package pl.Java8_OOP_Helion.JP_08_01;

import pl.Java8_OOP_Helion.JP_09.Dane;

public class Main {


    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setWiek(7);
        dane.setImie("Artur");

        System.out.println("dane.wiek = " + dane.wiek);
        Test.zmien(dane);
        System.out.println("dane.wiek po zmianie= " + dane.wiek);
    }
}
