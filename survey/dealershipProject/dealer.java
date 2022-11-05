package dealershipProject;
import java.util.Locale;
import java.util.Scanner;


public class dealer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Welcome to the Java Dealership");
        System.out.println(" What are you looking for? \n Want to buy a new pair of wheels or sell your old ones? \n Type (B) for BUY or type (S) for SELL");

        String option = scan.nextLine();
        switch (option) {
            case "B": 
            System.out.println("What is your current budget?");
            int budget = scan.nextInt();
            if (budget >= 10000) {
                System.out.println("Well, with that budget, you can get a Nissan Altima");

                System.out.println("\nWe just need to know, do you have insurance?\n(Y)YES or (N)NO ");
                String insurance = scan.next();

                System.out.println("\nWhat about a driver's license?\n(Y)YES or (N)NO");
                String license = scan.next();

                System.out.println("\nPlease input your credit score: ");
                int creditScore = scan.nextInt();

                if (insurance.equals("Y") && license.equals("Y") && creditScore > 660) {
                   System.out.println("Great, all done then, here's the keys");
                } else {
                    System.out.println("Sorry, can't sell to you");
                }

            } else {
                System.out.println("Sorry, but we don't have anything within that budget");
            }
            break;
            case "S":
            System.out.println("What is your car valued at?");
            double value = scan.nextDouble();

            System.out.println("What is your selling price?");
            double sellPrice = scan.nextDouble();

            if (value > sellPrice && sellPrice < 50000) {
                System.out.println("Great, we'll buy your car for that price!");
                System.out.println("You have recieved $" + sellPrice);
            } else if (value <= sellPrice || sellPrice > 50000) {
                System.out.println("Sorry, but we can't pay you that much on your car");
            } 
            break;
        }
        scan.close();
    }
}
