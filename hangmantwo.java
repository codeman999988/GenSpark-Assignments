import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hangmantwo {
    public static void main(String[] args) {
        // ESTABLISH ALL VARIABLES
        Random rand = new Random();
        String[] wordsArray = { "cat", "happy", "prince", "dragon", "phone", "jeep", "dinosaur", "kangaroo", "sun",
                "gyroscope", "podcast" };
        int index = rand.nextInt(wordsArray.length);
        String word = wordsArray[index];
        String blank = "";
        for (int i = 0; i < word.length(); i++) {
            blank = blank + "_";
        }
        ;
        char[] charDisplay = new char[word.length()];
        Set<Character> wrongGuesses = new HashSet<>();

        int game = 0;
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Welcome to Hangman!  Guess a letter!");
        System.out.println("H A N G M A N");
        StringBuffer displayAnswer = new StringBuffer(blank);

        while (game < 7) {

            System.out.println("+---+");
            if (game < 1) {
                System.out.println("      |");
            } else {
                System.out.println(" O    |");
            }
            if (game < 2) {
                System.out.println("      |");
            } else if (game == 2) {
                System.out.println(" \\    |");
            } else if (game == 3) {
                System.out.println('\\' + "|    |");
            } else if (game >= 4) {
                System.out.println("-|-");
            }
            if (game < 5) {
                System.out.println("      |");
            } else if (game == 5) {
                System.out.println("/     |");
            } else if (game == 6) {
                System.out.println(" ^" + "    |");
            }
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("    ===");
            System.out.println("Missed letters:" + wrongGuesses);
            System.out.println(displayAnswer);
            if (game == 6) {
                System.out.println("Oh no!  You lost!  Would you like to play again?  (y or n)");
                char playAgain = playerInput.next().charAt(0);
                if (playAgain == 'y') {
                    index = rand.nextInt(wordsArray.length);
                    word = wordsArray[index];
                    game = 0;
                    blank = "";
                    for (int i = 0; i < word.length(); i++) {
                        blank = blank + " _";
                    }
                    ;
                    charDisplay = new char[word.length()];
                    wrongGuesses = new HashSet<>();
                    displayAnswer = new StringBuffer(blank);

                    continue;
                }
            }
            char guess = playerInput.next().charAt(0);

            if (!wrongGuesses.contains(guess) && word.indexOf(guess) == -1) {
                wrongGuesses.add(guess);
                game++;
            } else if (word.indexOf(guess) != -1) {
                displayAnswer.setCharAt(word.indexOf(guess), guess);
            } else {
                System.out.println("You already guessed that, guess again");
            }
            ;

            System.out.println(Arrays.toString(charDisplay));

            System.out.println("");
            System.out.println("Guess a letter.");
        }

    }
}

// PRINT Hangman
// SYSTEM INPUT
// GUESSED IF
// GUESS IS
// RIGHT
// SET
// INDEX OF
// ANSWER TO
// RIGHT answer
// IF INDEX
// IS WRONG
// ADD WRONG
// GUESS TO
// HASHLIST
// PRINT
// HANGMAN