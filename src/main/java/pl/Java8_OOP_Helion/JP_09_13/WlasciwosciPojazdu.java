package pl.Java8_OOP_Helion.JP_09_13;

public abstract class WlasciwosciPojazdu {

    //metoda abstrakcyjne bez implementacji
    public void nieZaSzybko(int predkosc, int predkoscMaxymalna){
        if (predkosc*2 == predkoscMaxymalna){
            System.out.println("nie jedziesz za szybko?");
        }

    }

    // metoda abstracyjna bez implementacji - musza ja okreslic klasy dzidziczace po tej klasie
    // tylko metoda abstrakcyjna musi byc obowaizkowo implementowana w klasie rozszerzającej
    public abstract void skrec (int kat);
}
