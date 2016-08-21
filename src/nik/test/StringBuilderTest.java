package nik.test;

/**
 * Created by Nik on 8/17/16.
 */
public class StringBuilderTest {

    static StringBuilder sb1 = new StringBuilder("This is a string");

    public static void main(String[] args) {

        System.out.println("sb1 = " + sb1);


        // Test indexOf(String str)
        int index1 = sb1.indexOf("is");
        System.out.println("Index of \"is\" in sb1: " + index1);


        // Test indexOf(String str, int fromIndex)
        int fromIndex1 = sb1.indexOf("is", index1);
        System.out.println("Index of \"is\" from index 2 in sb1: " + fromIndex1);

        int fromIndex2 = sb1.indexOf("is", index1 + "is".length());
        System.out.println("Index of \"is\" from index 2 in sb1: " + fromIndex2);


        // Test insert(int offset, boolean b)
        sb1.insert(0, true);
        System.out.println("Inserted boolean 'true' at index 0: " + sb1);

        sb1.insert(sb1.indexOf("is", 7), false);
        System.out.println("Inserted boolean 'false' at index second \"is\": " + sb1);


        // Test insert(int offset, char c)
        sb1.insert(4, ' ');
        System.out.println("Inserted char ' ' at index 4: " + sb1);


        char[] charArray1 = {'c', 'h', 'a', 'r'};
        sb1.insert(sb1.length(), charArray1);
        System.out.println("Inserted char array \"char\" at end of line: " + sb1);


        // Test insert(int index, char[] str, int offset, int len)
        char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
        sb1.insert(15, charArray2, 1, 2);
        System.out.println("Inserted subset \"bc\" after \"false\": " + sb1);


        // Test insert(int dstOffset, CharSequence s)
        CharSequence cs1 = new StringBuilder("New CharacterSequence");
        sb1.insert(sb1.length(), cs1);
        System.out.println("Inserting CharacterSequence at end of line:" + sb1);


        // Test insert(int dstOffset, CharSequence s, int start, int end)
        sb1.insert(0, cs1, 0, 4);
        System.out.println("Insert subsequence of CharSequence: " + sb1);


        // Test insert(int offset, double d)
        sb1.insert(0, 2.0d);
        System.out.println("Inserting a double: " + sb1);


        // Test insert(int offset, float f)
        sb1.insert(0, 3.14f);
        System.out.println("Inserting a float: " + sb1);


        // Test insert(int offset, int i)
        sb1.insert(0, 10);
        System.out.println("Inserting an int: " + sb1);


        // Test insert(int offset, long l)
        sb1.insert(0, 100000L);
        System.out.println("Inserting an long: " + sb1);


        // Test insert(int offset, Object obj)
        Object obj1 = new Object();
        sb1.insert(sb1.length(), obj1);
        System.out.println("Inserting a String representation of Object: " + sb1);


        // Test insert(int offset, String str)
        sb1.insert(0, "New String Object ");
        System.out.println("Inserting a String object: " + sb1);


        // Test lastIndexOf(String str)
        int lastIndexOf1 = sb1.lastIndexOf("New");
        System.out.println("Last index of \"New\": " + lastIndexOf1);


        // Test lastIndexOf(String str, int fromIndex)
        int lastIndexOf2 = sb1.lastIndexOf("New", lastIndexOf1);
        System.out.println("Last index of \"New\" from index " + lastIndexOf1 + ": " + lastIndexOf1);

        lastIndexOf2 = sb1.lastIndexOf("New", lastIndexOf1 - 1);
        System.out.println("Last index of \"New\" from index " + lastIndexOf1 + " - 1: " + lastIndexOf1);


        // Test length()
        System.out.println("Length: " + sb1.length());


        // Test offsetByCodePoints(int index, int codePointOffset)
        System.out.println("CodePointOffset of '@': " + sb1.offsetByCodePoints(1, '\u0049'));

        System.out.println("CodePointOffset char: " + sb1.charAt(74));


        // Test replace(int start, int end, String str)
        sb1 = sb1.replace(4, 10, "Replaced");
        System.out.println("Replaced: " + sb1);


        // Test reverse()
        StringBuilder sbReverse = sb1.reverse();
        System.out.println("Reversed: " + sbReverse);
        System.out.println("sb1 after reversed: " + sb1);


        // Test setCharAt(int index, char ch)
        sb1.setCharAt(0, 'n');
        System.out.println("Set first char to 'n': " + sb1);

        sbReverse.setCharAt(0, 'x');
        System.out.println("sbReverse after set char 'x' at 0: " + sbReverse);
        System.out.println("sb1 after set char 'x' at 0: " + sb1);


        // Test setLength(int newLength)
        sb1.setLength(10);
        System.out.println("Set length to 10: " + sb1);


        // Test subSequence(int start, int end)
        CharSequence cs2 = sb1.subSequence(2, 4);
        System.out.println("CharSequence (2,4): " + cs2);


        // Test substring(int start)
        String str1 = sb1.substring(5);
        System.out.println("Substring starting at 5: " + str1);


        // Test substring(int start, int end)
        String str2 = sb1.substring(5, 7);
        System.out.println("Substring (5, 7): " + str2);


        // Test toString()
        String str3 = sb1.toString();
        System.out.println("Converted to string: " + str3);


        // Test trimToSize()
        System.out.println("Capacity before trimToSize(): " + sb1.capacity());
        sb1.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb1.capacity());



        StringBuilder sb99 = new StringBuilder("               ");
        StringBuilder sb98 = new StringBuilder();
        StringBuilder sb97 = new StringBuilder("class");

    }
}
