package pl.Java8_OOP_Helion.OOP_02_04;

public class Main02_04 {


    public static void main(String[] args) {

        int a = 4;
        int b = 2;

        int c = a + b;
        System.out.println(c);
        c = a -b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);

        int d = a++;
        System.out.println("a: " + a + "  a++:" +d);

        d = ++a;
        System.out.println("a: " + a + "  ++a:" +d);

        System.out.println("MOJE");

        int z = 2;

        int y = ++z;
        System.out.println(++z);
        int x = z++;
        System.out.println(z++); // w zapisie z = a++ chodzi o to ze d = a a potem dopiero a jest inkrementowane ale nie ma to wpływu na d
                                // w zapisie d = ++a
        a = a + 3; // mozna te z zapisac a+= 3
    }
}
