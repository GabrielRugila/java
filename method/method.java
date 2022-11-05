package method;

public class method {
    
    public static void main(String[] args) {

        // players
        int alez = 1500;
        int bob = 900;
        int carlos = 400;
        int dannyboy = 50;

        highscorePosition("Alez", calculateScore(alez));
        highscorePosition("Bob", calculateScore(bob));
        highscorePosition("Carlos", calculateScore(carlos));
        highscorePosition("Danny Boy", calculateScore(dannyboy));

    }
    public static int calculateScore(int score) {
        /* 
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
        */
        int position = 4; 
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    };
    
    public static void highscorePosition (String playerName, int position) {
            System.out.println(playerName + " has achieved a new highscore, and now is " + position + "# on the leaderboard");
    };
}
