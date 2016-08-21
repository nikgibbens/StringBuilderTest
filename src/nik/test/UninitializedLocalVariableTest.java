package nik.test;

/**
 * Created by Nik on 8/21/16.
 */
public class UninitializedLocalVariableTest {

    static void display() {

        int x=5;
        x = x+5;
        System.out.println(x);
    }

    public static void main(String[] args) {

        UninitializedLocalVariableTest u = new UninitializedLocalVariableTest();
        u.display();
        display();
        UninitializedLocalVariableTest.display();

    }
}
