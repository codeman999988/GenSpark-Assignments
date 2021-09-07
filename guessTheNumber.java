import java.util.Scanner;
import java.util.Random;
public class guessTheNumber {
public static void main(String[] args) {
Random rand = new Random();
int answer = rand.nextInt(20) + 1;
System.out.println("Hello!  What is your name?");
Scanner playerInput = new Scanner(System.in);
String playerName = playerInput.next();
System.out.println("Well, " + playerName + ", I am thinking of a number between 1 and 20.");
System.out.println("Take a guess");

int guesses = 0;
int game = 0;
while(game < 1){
int guess = playerInput.nextInt();
if(guess < answer){
    System.out.println("Too low");
    System.out.println("Guess again.");
    guesses++;
} else if (guess > answer){
    System.out.println("Too high");
    System.out.println("Guess again.");
    guesses++;
} else {
    System.out.println("That's right!  You win!");
    System.out.println("You guessed my number in " + guesses + " guesses!");
    System.out.println("Would you like to play again? (y or n)");
    char yesOrNo = playerInput.next().charAt(0);
    if(yesOrNo == 'y'){
        answer = rand.nextInt(20) + 1;
        guesses = 0;
        System.out.println("Take a guess");
    } else if(yesOrNo == 'n'){
        System.out.println("Thanks for playing!");
        game++;
    }
}



}
}
}