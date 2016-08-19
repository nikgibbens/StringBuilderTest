package nik.test;

/**
 * Created by Nik on 8/18/16.
 */
public class ObjectTest {

    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj1dup = obj1;

        System.out.println(obj1);
        System.out.println(obj2);


        // Test getClass()
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());


        // Test hashCode()
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1dup.hashCode());

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj1dup.hashCode());


        // Test equals(Object obj)
        if(obj1.equals(obj1dup))
            System.out.println("Obj1 equals Obj1dup");
        else
            System.out.println("Obj1 does not equal Obj1dup");

        if(obj1.equals(obj2))
            System.out.println("Obj1 equals Obj2");
        else
            System.out.println("Obj1 does not equal Obj2");





    }
}
