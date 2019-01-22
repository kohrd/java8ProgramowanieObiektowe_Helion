package pl.Java8_OOP_Helion.JP_09;

public class UstawDane {

    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setImie("konrad");
        dane.setWiek(4);

        System.out.println("dane.imie + \" \"+ dane.wiek = " + dane.getImie() + " "+ dane.getWiek());
        
    }
}
