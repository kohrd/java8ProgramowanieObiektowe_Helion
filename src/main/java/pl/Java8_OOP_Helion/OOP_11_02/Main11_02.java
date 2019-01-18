package pl.Java8_OOP_Helion.OOP_11_02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main11_02 {


    public static void main(String[] args) {

        mapSample();

    }


    private static void mapSample() {

        Map<String, Integer> mapOfNamesAndAge = new HashMap<>();
        mapOfNamesAndAge.put("Michal", 32);
        mapOfNamesAndAge.put("Gosia", 2);
        mapOfNamesAndAge.put("Artur", 34);
        mapOfNamesAndAge.put("Andrzej", 38);
        mapOfNamesAndAge.put("konrad", 92);
        mapOfNamesAndAge.put("Ala", 12);


        System.out.println(mapOfNamesAndAge.get("Michal"));
        System.out.println(mapOfNamesAndAge.remove("Ala"));
        System.out.println(mapOfNamesAndAge.size());
        System.out.println(mapOfNamesAndAge.isEmpty());
        System.out.println(mapOfNamesAndAge.containsKey("konrad"));
        System.out.println(mapOfNamesAndAge.containsKey("Ryszard"));
        System.out.println(mapOfNamesAndAge.containsValue(1234));
        for (String key :mapOfNamesAndAge.keySet()){
            Integer value = mapOfNamesAndAge.get(key);
            System.out.println(key+ " : "+value);
        }

    }
}
