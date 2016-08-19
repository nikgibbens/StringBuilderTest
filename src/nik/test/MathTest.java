package nik.test;

/**
 * Created by Nik on 8/18/16.
 */
public class MathTest {

    public static void main(String[] args) {

        double d1 = 3.14d;
        double d2 = Math.rint(d1);
        System.out.println("Round 3.14d to closest int: " + d2);

        double d3 = 3.51d;
        double d4 = Math.rint(d3);
        System.out.println("Round 3.51d to closest int: " + d4);
    }
}
