import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
    public static String[] rowInfo = {"Name", "Birthdate", "Occupation"};
    public static String[][] database;
    public static void main(String[] args) {
        //2d array while loop n of inputs name birth occupation
        Scanner scan = new Scanner(System.in);
        int inputNumber;


        System.out.println("How many figures do you wish to input?");
        inputNumber = scan.nextInt();
        database = new String[inputNumber][3];
        scan.nextLine();

        for (int col = 0; col < inputNumber; col++) {
            System.out.println("\nFigure " + (col + 1));
            for (int row = 0; row < database[col].length; row++) {
                System.out.print("\t * " + rowInfo[row] + ": ");
                database[col][row] = scan.nextLine();
            }
        }
        System.out.println("Here are the values you have stored: ");
        printArray(database);

        System.out.println("\nWould you like to search by name? [Y]es / [N]o");
        String search = scan.nextLine();
        if (search.equals("Y")  || search.equals("y")) {
            System.out.println("\nPlease input the figures name: ");
            String searchName = scan.nextLine();
            for (int i = 0; i < database.length; i++) {
                if (database[i][0].equals(searchName)) {
                    System.out.println("\t" + rowInfo[0] + ": " + database[i][0]);
                    System.out.println("\t" + rowInfo[1] + ": " + database[i][1]);
                    System.out.println("\t" + rowInfo[2] + ": " + database[i][2]);
                }
            }
        }

        scan.close();
    }
    public static void printArray (String[][] database) {
        for (int col = 0; col < database.length; col++) {
            System.out.print((col +1) + "- ");
            for (int row = 0; row < database[col].length; row++){
                System.out.print("\t" + rowInfo[row] + ": " + database[col][row]);
            }
            System.out.println("\n");
        }
    }
}
