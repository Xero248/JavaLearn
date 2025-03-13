package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare variables

        // Get a choice from the user
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "Paper", "Scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {

            System.out.print("Enter your move (rock , paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }


            // Get a random choice for the computer

            computerChoice = choices[random.nextInt(3)];

            System.out.println("Computer choice: " + computerChoice.toLowerCase());


            // check win conditions

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie! ");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You win!");
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }


            // ask to play again

            System.out.println("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));


        // goodbye message
        System.out.println("Thanks for playing");





        scanner.close();
    }
}