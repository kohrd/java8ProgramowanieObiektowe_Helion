package pl.Java8_OOP_Helion.JP_09;

public class Dane {

    public String imie;
    public int wiek;

    public Dane (){
        this.imie = "brak imienia";
        this.wiek = -1;
    }
    public Dane(String imie, int wiek){
        //konstruktor
        // najpierw wywwoływany automatycznie jest konstruktor nadklasy
        this.imie = imie;
        this.wiek = wiek;
    }

    public Dane(String imie){
        this.wiek = 99;
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
