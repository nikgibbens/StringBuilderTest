package nik.test;

/**
 * Created by Nik on 8/18/16.
 */
public class ByteTest {

    public static void main(String[] args) {

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.TYPE);


        byte b1 = 113;
        byte b2 = 126;
        // byte b3 = b1+b2; // <-- Lost of precision because bytes convert to ints for math


    }
}
