package pl.Java8_OOP_Helion.JP_09_10;

public class Firma {


    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 3000);
        System.out.println("pracownik.toString() = " + pracownik.toString());

        Szef szef = new Szef(123);

        szef.imie = "Franek";
        szef.nazwisko = "nowak";
        szef.wyplata = 3;
        szef.premia = 1;

        System.out.println("szef.toString(); = " + szef.toString());
    }
}
