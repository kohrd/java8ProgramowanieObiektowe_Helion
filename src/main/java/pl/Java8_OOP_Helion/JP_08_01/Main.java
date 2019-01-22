package pl.Java8_OOP_Helion.JP_08_01;

import pl.Java8_OOP_Helion.JP_09.Dane;

public class Main {


    static int dodajLiczby(int a, int... lista) {
        //metpoda ze zmienną liczba argumentów
        int wynik = a;
        for (int i = 0; i < lista.length;
             i++) {
            wynik += lista[i];
        }
        return wynik;
    }

    static int dodajLiczbyWieleArgumentow(int... lista) {
        //metpoda ze zmienną liczba argumentów
        int wynik = 0;
        for (int i = 0; i < lista.length;
             i++) {
            wynik += lista[i];
        }
        return wynik;
    }

    static void imiona(String... imiona) {
        int i = 0;
        for (String imie : imiona) {
            i++;
            System.out.println("imie " + i + " to: " + imie);

        }

    }

    static void imiona2(String... imiona) {
        int i = 0;
        for (String imie : imiona) {
            i++;
            System.out.println("imie " + i + " to: " + imie);
        }

    }

    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setWiek(7);
        dane.setImie("Artur");

        System.out.println("dane.wiek = " + dane.wiek);
        Test.zmien(dane);
        System.out.println("dane.wiek po zmianie= " + dane.wiek);

        System.out.println("dodajLiczbe(2, 4,5,6,7,8,56,45,45,45,45,4,54) = " + dodajLiczby(2, 4, 45, 45, 45, 4, 54));
        System.out.println("dodajLiczbyWieleArgumentow() = " + dodajLiczbyWieleArgumentow());

        imiona("konrad", "Artur", "Andrzej", "Błażek");

        Dane dane2 = new Dane();
        System.out.println(dane2.getImie()+" "+dane2.getWiek());
    }
}
