package nik.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Nik on 8/18/16.
 */
public class SystemTest {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.list(System.out);

        System.setProperty("niks.property", "niks-prop-val");

        props = System.getProperties();
        props.list(System.out);


        // Test getenv()
        System.out.println();
        System.out.println();
        Map<String, String> envMap = System.getenv();
        for(Map.Entry<String, String> entry: envMap.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());


        // Test console()
        System.out.printf("%x%n", 32);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        System.out.println(sdf.format(c.getTime()));

    }
}
