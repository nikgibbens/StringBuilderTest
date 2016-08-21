package nik.test;

/**
 * Created by Nik on 8/21/16.
 */
public class Shape2 {

    public Shape2() {
        StaticClassInstantiateTest.Square p = new StaticClassInstantiateTest.Square();
    }

    public static void main(String[] args) {
        Shape2 s2 = new Shape2();

        System.out.println(StaticClassInstantiateTest.Square.class);
    }
}
