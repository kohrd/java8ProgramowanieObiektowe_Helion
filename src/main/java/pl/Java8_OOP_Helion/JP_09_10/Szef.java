package pl.Java8_OOP_Helion.JP_09_10;

public class Szef extends Pracownik {
    int premia; // dodatkowe pole


    public Szef (int premia){
        this.premia =premia;
    }

    public Szef (String imie, String nazwisko, int wyplata, int premia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
        this.premia = premia;
    }

}
