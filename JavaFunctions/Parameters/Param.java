package JavaFunctions.Parameters;

import java.util.Scanner;
import java.util.Locale;

public class Param {
    static double length;
    static double width;
    static String option;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("Choose option: area or perimeter");
        option = scan.next();

        System.out.println("Insert lenght: ");
        length = scan.nextDouble();

        System.out.println("Insert width: ");
        width = scan.nextDouble();

        double result = calcRectangle(length, width, option);
        System.out.println(result);
        if (result == 404) {
            System.out.println("Error occurred");
        }

        scan.close();
    }
    public static double calcRectangle(double length, double width, String option) {
        if (length < 0 || width <0) {
            return 404;
        } else {
            switch (option) {
                case "area": return length * width;
                case "perimeter": return 2 * (length + width);
                default: return 404;
            }
        }
    }
}
