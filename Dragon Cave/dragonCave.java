import java.util.Scanner;
public class dragonCave {
public static void main(String[] args) {
    System.out.println("You are in a land full of dragons. In front of you,");
    System.out.println("you see two caves. In one cave, the dragon is friendly");
    System.out.println("and will share his treasure with you. The other dragon");
    System.out.println("is greedy and hungry and will eat you on sight.");
    System.out.println("Which cave will you go into? (1 or 2)");
    Scanner playerInput = new Scanner(System.in);
    String input = playerInput.next();

    if(input.equals("1")){
        System.out.println("You approach the cave...");
        System.out.println("It is dark and spooky...");
        System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
        System.out.println("Gobbles you down in one bite!");
    }
    else if (input.equals("2")) {
        System.out.println("You approach the cave...");
        System.out.println("It is dark and spooky...");
        System.out.println("But luckily you picked option 2...");
        System.out.println("so the dragon shares his treasure with you!  You got lucky!");
    }
    else {
        System.out.println("That wasn't an option...");
    }

}
}