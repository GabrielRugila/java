package arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String[] lang = {"Java", "Cobol", "Python", "Kotlin"};
        /*/
        System.out.println(lang[0]);
        System.out.println(lang[1]);
        System.out.println(lang[2 - 2]);
        System.out.println(lang[0 + 1]);
        */

        for (int i = 0; i < lang.length; i++) {
            System.out.println(lang[i]);
        }

        lang[1] = "C#";

        System.out.println(Arrays.toString(lang));

        //cannot change array length

        String[] langExpanded = new String[8];
        for (int i = 0; i < lang.length; i++) {
            langExpanded[i] = lang[i];
        }
        System.out.println(Arrays.toString(langExpanded));
       
        langExpanded[4] = "JavaScript";
        langExpanded[5] = "Golang";
        langExpanded[6] = "Rust";
        langExpanded[7] = "C/C++";

        System.out.println(Arrays.toString(langExpanded));
    }

}
