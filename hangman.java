import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hangman {
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
        StringBuffer blankBuff = new StringBuffer(blank);

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
            System.out.println(blankBuff);
            if (game == 6) {
                System.out.println("Oh no!  You lost!  Would you like to play again?  (y or n)");
                char playAgain = playerInput.next().charAt(0);
                if (playAgain == 'y') {
                    index = rand.nextInt(wordsArray.length);
                    word = wordsArray[index];
                    game = 0;
                    blank = "";
                    for (int i = 0; i < word.length(); i++) {
                        blank = blank + "_ ";
                    }
                    ;
                    charDisplay = new char[word.length()];
                    wrongGuesses = new HashSet<>();
                    continue;
                }
            }
            char guess = playerInput.next().charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (guess == word.charAt(i)) {
                    blankBuff.setCharAt(i, guess);
                    break;
                } else if (!wrongGuesses.contains(guess) && guess != word.charAt(i)) {
                    wrongGuesses.add(guess);
                    game++;
                }
            }
            System.out.println(Arrays.toString(charDisplay));

            System.out.println("");
            System.out.println("Guess a letter.");
        }

    }
}
// O
// \/
// |
// /
