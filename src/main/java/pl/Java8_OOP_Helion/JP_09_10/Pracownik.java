package pl.Java8_OOP_Helion.JP_09_10;

public class Pracownik {

    String imie;
    String nazwisko;
    int wyplata;

    public Pracownik() {
        imie = "";
        nazwisko = "";
        wyplata = 0;
    }

    public Pracownik (String imie, String nazwisko, int wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }


    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
}
