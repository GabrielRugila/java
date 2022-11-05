package arrays;

import java.util.Arrays;

public class referenceTrap {

    public static void main(String[] args) {
        
        String[] staffLastYear = {"Tommy", "Joel", "Bob"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffThisYear[1] = "Abby";

        /* 
        String[] staffThisYear = new String[3];
        for (int i = 0; i < staffThisYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
        }
        */
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}