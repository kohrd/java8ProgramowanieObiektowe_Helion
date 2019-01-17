package pl.Java8_OOP_Helion.OOP_09_06;

public class Main09_06 {

    public static void main(String[] args) {
        Object myObject = new Object();
        Object mySring = "string";

        if(myObject instanceof String){
      // tu spradzamy czy sa sie rzutowac - jezeli myObject jest instancją String daje true
            System.out.println(((String) myObject).length());

        }

        System.out.println(((String) mySring).length());

    }
}
