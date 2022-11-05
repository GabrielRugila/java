package JavaFunctions.builtin;
import java.util.Scanner;


public class JavaBuiltins {
    static int diceRoll = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * dice format: XdY
         * X = number of dice
         * Y = number of sides
         * d = should be ignored
         * guava string utils
         * divide and conquer
         *  int'String'int
         * String will always be d/D
         * [(int dices), (String = d/D), (int sides)]
        */
        System.out.println("Input dice sides: ");
        int sides = scan.nextInt();

        System.out.println("Input number of dices: ");
        int nDices = scan.nextInt();

        randomRoll(sides, nDices);

        scan.close();
    }
    public static void randomRoll (int sides, int dices){
        int i;
        System.out.println("You rolled: ");
        for (i = 0; i < dices; i++) {
        diceRoll = (int)(Math.random() * sides) + 1;
        System.out.print(" " + diceRoll + " ");
        }
    }
}
