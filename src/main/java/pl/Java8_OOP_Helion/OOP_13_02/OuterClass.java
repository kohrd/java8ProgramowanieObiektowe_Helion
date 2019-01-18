package pl.Java8_OOP_Helion.OOP_13_02;

public class OuterClass {


    public class InnerClass {

    }


    public static class StaticInnerClass {


    }


    public InnerClass instantiate() {
        return new InnerClass();
    }

    //klasa lokalna
    public void method() {
        class LocalClass {
            //klasa widoczna tylko wewnątrz metody

        }


    }

}
