package pl.Java8_OOP_Helion.OOP_12_03;

public class Main12_03 {


    public static void main(String[] args) {

        String a = "ala";
        String b = "ala";
        String c = new String("ala");

        System.out.println("string1 = "+ a.equalsIgnoreCase(b));
        System.out.println("string1 = "+ (a==b));

        System.out.println("string1 = "+ a.equalsIgnoreCase(c));
        System.out.println("string1 = "+ (a==c));


        //łączenie porownanie czasow
        stringBuilderSample();
        stringSample();




    }

    private static  void stringBuilderSample(){
        String s = "a";
        long start = System.nanoTime();
        StringBuilder sB = new StringBuilder(s);

        for (int i=0; i<1000000; i++){
            sB.append("a");
        }

        s = sB.toString();
        System.out.println("time for stringbuilder: "+ (System.nanoTime()-start));
    }

    private static void stringSample(){
        String s = "a";
        long start = System.nanoTime();
        for (int i=0; i<1000000; i++){
            s = s+"a";
        }
        System.out.println("time for string: "+ (System.nanoTime()-start));
    }
}
