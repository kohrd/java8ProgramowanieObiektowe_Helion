package pl.Java8_OOP_Helion.OOP_11_01;

import java.util.*;

public class Main11_01 {


    public static void main(String[] args) {

        setSample();

    }


    private static void setSample() {

        Set<String> mySet = new HashSet<>();
        mySet.add("Ala");
        mySet.add("Ania");
        mySet.add("Maria");
        System.out.println("PRZED: ");
        for (String name:mySet){
            System.out.println("name przed" +name);
        }
        mySet.add("WACEK");
        mySet.add("Ala"); // dodajemy drugi raz takie samo imie
        System.out.println("PO:");
        for(String name:mySet){
            System.out.println("name po: "+name);
        }

        System.out.println(mySet.isEmpty());
        System.out.println(mySet.size());
        System.out.println(mySet.contains("Mariusz"));
        System.out.println(mySet.remove("Janusz"));
    }
}
