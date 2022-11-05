package VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continueBuying = 1;
        Item[][] items = new Item[][]{
                {
                  new Item("C-Cola", 2.5, 3),
                  new Item("Fanta", 2, 3),
                  new Item("Water", 1, 5)
                },
                {
                  new Item("Chips", 3, 5),
                  new Item("Gummy Bears", 5, 7),
                  new Item("Chocolate Bar", 2.2, 5)
                },
                {
                  new Item("Pepsi", 2.5, 3),
                  new Item("Snickers", 3.75, 1),
                  new Item("Orange Juice", 1.5, 5),
                }
        };

        Machine vendingMachine = new Machine(items);

        System.out.println("******************************************************************");
        System.out.println("*                   WELCOME TO JAVA DRINKS!                      *");
        System.out.println("******************************************************************");
        do {
            vendingMachine.toString();
            System.out.println("Please choose your desired item");
            System.out.println("Pick a row: ");
            int row = scan.nextInt() - 1;
            System.out.println("Pick a spot in the row: ");
            int spot = scan.nextInt() - 1;
            if (vendingMachine.dispense(row, spot)) {
                System.out.println("Enjoy your " + vendingMachine.getItem(row, spot).getName());
            } else if (!vendingMachine.dispense(row, spot)) {
                System.out.println("Sorry, that item is out of stock");
            }
            System.out.println("Would you like to make a new purchase? Press 1 to continue");
            continueBuying = scan.nextInt();
        } while (continueBuying == 1);
    }
}
