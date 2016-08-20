package nik.test;

import java.io.*;

/**
 * Created by Nik on 8/20/16.
 */
public class BufferedReaderTest {

    public static void main(String[] args) {

        File file = new File("/Users/Nik/temp/Numbers.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String str = null;
            while((str = bufferedReader.readLine()) != null)
                System.out.println(str);
        }
        catch(FileNotFoundException e) {
            System.out.println("[ERROR] File was not found.");
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            System.out.println("There was an error reading from the file.");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                System.out.println("[INFO] Closeing bufferedReader and fileReader.");
                if(bufferedReader != null)
                    bufferedReader.close();
                if(fileReader != null)
                    fileReader.close();
            }
            catch(IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }



}
