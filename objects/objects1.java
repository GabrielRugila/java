package objects;

import java.util.Arrays;
import java.util.Scanner;

public class objects1 {
    public static void main(String[] args) {

        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] {"Tires", "Keys"}),
                new Car("Dodge",11000,2019,"blue", new String[] {"Tires", "Keys"}),
                new Car("Nissan", 5000, 2022, "yellow", new String[] {"tires", "filter"}),
                new Car("Honda", 7000, 2019, "black", new String[] {"tires", "filter"}),
                new Car("Mercedes", 20000, 2020, "white", new String[] {"tires", "filter", "transmission"}),
        };


        Dealership dealership = new Dealership(cars);

        Scanner scan = new Scanner(System.in);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String carMake = scan.nextLine();
        System.out.print("Enter your budget: ");
        int carBudget = scan.nextInt();
        int index = dealership.search(carMake, carBudget);
        switch (index) {
            case 404:
                System.out.println("Please do take a look at our current collection: \n");
                System.out.println(dealership);
                break;
            default: scan.nextLine();
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("yes")){
                dealership.sell(index);
            }
        }

        scan.close();

    }
}
