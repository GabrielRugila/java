package booleans;

import java.util.Scanner;
import java.util.Locale;

public class bool {
    public static void main(String[] args) {
        /* 
        int grade = 65;

        if (grade == 60) {
            System.out.println("Bearly Passed, do better next time.");
        } else if (grade >= 61) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        String sentence = "Lorem";
     
        if (!sentence.equals("Lorem")) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
        */
        /*
        double wallet = 100;
        double toyCar = 5.99;
        double nike = 95.99;

        System.out.println("Can I get this car?");
        if (wallet >= toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
        } else {
            System.out.println("Sorry buddy, I only have $" + wallet + " left");
        }

        System.out.println("Can I get these nike shoes");
        if (wallet >= nike) {
            System.out.println("Sure kiddo!");
            wallet -= nike;
        } else {
            System.out.println("Sorry buddy, I only have $" + wallet + " left");
        }
        */
        /*
        // OR ||
        // AND &&

        int chemGrade = 78;
        int engGrade = 65;

        if (chemGrade > 75 || engGrade < 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        if (chemGrade >= 75 && engGrade >= 75) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        */
        /*
        // switch
        int monthNumb = 5;

        switch (monthNumb) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Not a valid month, try again"); break;
        }
        */
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        
        System.out.println("Enter two int in the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter three big numbers in the same line");
        long lNum1 = scan.nextLong();
        long lNum2 = scan.nextLong();
        long lNum3 = scan.nextLong();

        System.out.println("Enter two decimal numbers in the same line");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        System.out.println("Enter two text values in the same line");
        String txt1 = scan.next();
        String txt2 = scan.next();

        scan.close();

        System.out.println("\n " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("\n " + lNum1 + " * " + lNum2 + " / " + lNum3 + " = " + ((lNum1 * lNum2) / lNum3));
        System.out.println("\n " + d1 + " " + d2);
        System.out.println("\n " + txt1 + " " + txt2);
    }
}
