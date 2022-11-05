import java.util.Arrays;
import java.util.Scanner;

public class hangman {
    public static char[] secretWordArray;
    public static String[] secret;
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra"
    };
    public static String[] gallows =
            {"+---+\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
            "|   |\n" +
            "O   |\n" +
            "    |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            "+---+\n" +
            "|   |\n" +
            "O   |\n" +
            "|   |\n" +
            "    |\n" +
            "    |\n" +
            "=========\n",

            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|   |\n" +
            "     |\n" +
            "     |\n" +
            " =========\n",

            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\ |\n" +
            "     |\n" +
            "     |\n" +
            " =========\n",

            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" +
            "/    |\n" +
            "     |\n" +
            " =========\n",

            " +---+\n" +
            " |   |\n" +
            " O   |\n" +
            "/|\\  |\n" +
            "/ \\  |\n" +
            "     |\n" +
            " =========\n"};

    public static void main(String[] args) {
        //random word picker OK
        // _ must reflect number of letters ok
        // use [i] gallows array base on number of mistakes
        // show missed guesses (array)
        // change _ with correct guess

        //game start setup
        Scanner scan = new Scanner(System.in);

        char[] secretWordArray = wordCaller(words).toCharArray();
        System.out.println(Arrays.toString(secretWordArray));
        String[] secret = new String[secretWordArray.length];
        for (int i = 0; i < secret.length; i++) {
            secret[i] = "_ ";
        }

        gameEngine();

        scan.close();
    }

    public static String wordCaller(String[] words) {
        int wordSelector = (int)(Math.random() * words.length) + 1;
        return words[wordSelector];

    }

    public static void gameEngine() {
        Scanner scan = new Scanner(System.in);
        //game mechanics
        int gallowsCheck = 0;
        System.out.println(gallows[gallowsCheck]);
        System.out.print("Word: ");

        char[] wrongLetters = new char[6];
        System.out.print("Wrong: ");
        System.out.print(wrongLetters);

        System.out.println("\nYour Guess: ");
        String playerGuessString = scan.nextLine();
        char playerGuess = playerGuessString.charAt(0);
        // for compares guess[i] against secretwordarray[i]

        for (int i = 0; i < secretWordArray.length; i++) {
            int wrongGuessLetters = 0;
            if (playerGuess == secretWordArray[i]) {
                secret[i] = Character.toString(secretWordArray[i]);
            } else if (playerGuess != secretWordArray[i]) {
                wrongGuessLetters++;
                if (wrongGuessLetters == secretWordArray.length) {
                    wrongLetters[gallowsCheck] = secretWordArray[i];
                    gallowsCheck++;

                }
            }
        }

        scan.close();
    }
}
