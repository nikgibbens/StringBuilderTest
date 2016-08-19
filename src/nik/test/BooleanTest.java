package nik.test;

/**
 * Created by Nik on 8/18/16.
 */
public class BooleanTest {

    public static void main(String[] args) {
        if(Boolean.TRUE)
            System.out.println(Boolean.TRUE);
        else
            System.out.println(Boolean.FALSE);

        if(Boolean.FALSE)
            System.out.println(Boolean.TRUE);
        else
            System.out.println(Boolean.FALSE);

        System.out.println(Boolean.TYPE);

        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean(true);
        Boolean bool3 = new Boolean(false);


        // Test equals(Object obj)
        System.out.println("bool1 equals bool2: " + bool1.equals(bool2));
        System.out.println("bool1 equals bool3: " + bool1.equals(bool3));


        // Test compare(boolean x, boolean y)
        System.out.println("bool1 == bool2: " + Boolean.compare(bool1, bool2));
        System.out.println("bool1 == bool3: " + Boolean.compare(bool1, bool3));


        // Test compareTo(Boolean b)
        System.out.println("bool1 compareTo bool2: " + bool1.compareTo(bool2));
        System.out.println("bool1 compareTo bool3: " + bool1.compareTo(bool3));


        // Test parseBoolean(String s)
        String s1 = "true";
        String s2 = "True";
        String s3 = "TRUE";
        String s4 = "false";
        String s5 = "False";
        String s6 = "FALSE";

        Boolean bool4 = Boolean.parseBoolean(s1);
        Boolean bool5 = Boolean.parseBoolean(s2);
        Boolean bool6 = Boolean.parseBoolean(s3);
        Boolean bool7 = Boolean.parseBoolean(s4);
        Boolean bool8 = Boolean.parseBoolean(s5);
        Boolean bool9 = Boolean.parseBoolean(s6);

        System.out.println("String \"true\" parses to: " + bool4);
        System.out.println("String \"true\" parses to: " + bool5);
        System.out.println("String \"true\" parses to: " + bool6);
        System.out.println("String \"true\" parses to: " + bool7);
        System.out.println("String \"true\" parses to: " + bool8);
        System.out.println("String \"true\" parses to: " + bool9);



    }
}
