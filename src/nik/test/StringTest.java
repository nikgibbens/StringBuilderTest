package nik.test;

/**
 * Created by Nik on 8/17/16.
 */
public class StringTest {

    public static void main(String[] args) {

        // Test split(String regex, int limit)
        String str1 = "This|this|this.";
        String[] str2 = str1.split("\\|");
        for(String str : str2) {
            System.out.println(str);
        }

        String[] str3 = str1.split("\\|", 2);
        for(String str : str3) {
            System.out.println(str);
        }


        // Test valueOf(Object obj)
        Object obj1 = new Double(3.0d);
        String str4 = String.valueOf(obj1);
        System.out.println(str4);
    }

}
