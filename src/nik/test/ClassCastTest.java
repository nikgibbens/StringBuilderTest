package nik.test;

/**
 * Created by Nik on 8/21/16.
 */
public class ClassCastTest {

    static class A {
        public String methodA() {
            return "a";
        }
    }

    static class B extends A {
        public String methodA() {
            return "b";
        }
    }

    static class C extends B {
        public String methodA(){
            return "c";
        }
    }

    public static void main(String[] args) {
        A a1 = new C();
        B b1 = (B)a1;
        System.out.println(b1.methodA());


        A a2 = new B();
        C c2 = new C();
        B b2 = (B)c2;

        A a3 = new A();
        // B b3 = (B)a3; // <-- Class cast exception. A referent for A a1 reference cannot be cast down


    }
}
