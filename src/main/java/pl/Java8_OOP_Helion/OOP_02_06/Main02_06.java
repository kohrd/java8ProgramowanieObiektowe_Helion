package pl.Java8_OOP_Helion.OOP_02_06;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main02_06 {


    public static void main(String[] args) {

        float a = 0.9f;
        float b = 0.3f;
        System.out.println("a/b = "+ a / b); // wynik a/b = 2.9999998

        // do finansow wykorzystuje sie BigDecimal
        BigDecimal myA = new BigDecimal("0.9");
        BigDecimal myB = new BigDecimal("0.3");
        System.out.println("a/b = " + myA.divide(myB));

        BigInteger myBigInteger = new BigInteger("232234234324234234234234");


    }
}
