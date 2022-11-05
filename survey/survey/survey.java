package survey;
import java.util.Locale;
import java.util.Scanner;

public class survey {
    public static void main(String[] args) {
        //scan

        Scanner scan = new Scanner (System.in).useLocale(Locale.CANADA);
        System.out.println("Welcome, please answer the following questions.");
        System.out.println("Name: ");
        String name = scan.nextLine();
        System.out.println("Money for coffee: ");
        double moneyForCoffee = scan.nextDouble();
        System.out.println("Money for lunch: ");
        double lunch = scan.nextDouble();
        System.out.println("Meals a day: ");
        int mealsDay = scan.nextInt();

        System.out.println("Your name is: " + name + ".");
        System.out.println("You spend " + moneyForCoffee + " on coffee and " + lunch + " on lunch");
        System.out.println("You do " + mealsDay + " meals a day.");
        scan.close();
    }

}
