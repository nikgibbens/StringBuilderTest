package nik.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Nik on 8/20/16.
 */
public class FileInputStreamTest {

    public static void main(String[] args) {

        String fileName = "/Users/Nik/temp/Numbers.txt";
        FileInputStream fis = null;

        try {

            fis = new FileInputStream(fileName);

            int i;
            long l;

            i = fis.read();
            System.out.println("First byte: " + i);

            i = fis.read();
            System.out.println("Second byte: " + i);

            System.out.println("Mark supported: " + fis.markSupported());

            l = fis.skip(2);

            System.out.println(l);


            while((i = fis.read()) != -1) {
                System.out.println(i);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("[ERROR] Unable to open file " + fileName);
            System.out.println(e.getMessage());
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        finally {
            try {
                fis.close();
            }
            catch(NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
            catch(IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }


}
