package pl.Java8_OOP_Helion.OOP_10_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main10_05 {


    public static void main(String[] args) {
        listSample();


    }


    private static void listSample() {
        List<String> listNames = new ArrayList<>();
        listNames.add("Tomek");
        listNames.add("Marian");

        List<String> secondListNames = new LinkedList<>();
        secondListNames.add("Grazyna");
        secondListNames.addAll(listNames); // dodanie całej listy do listy
        secondListNames.add("Ala");

        System.out.println(secondListNames.contains("dupa"));
        System.out.println(secondListNames.get(0));
        System.out.println(secondListNames.isEmpty());
        System.out.println(secondListNames.indexOf("Marian"));
        System.out.println(secondListNames.lastIndexOf("Ala"));
        for (String name : secondListNames) {
            System.out.println("imiona w secondListNames: " + name);
        }

    }
}
