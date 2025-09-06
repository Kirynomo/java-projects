import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);


        System.out.println("Welcome to the Number Guessing Game!");

        while(true) {

            int randomNumber = r.nextInt(101);
            int userInput = 0;
            int attempts = 0;

            System.out.println("Guess a number between 0 and 100");

            try {
                while(randomNumber != userInput) {
                    System.out.print("Enter your number: ");
                    userInput = s.nextInt();

                    if (userInput > 100 || userInput < 0){
                        // Doesn't count invalid guesses.
                        System.out.println("Guess must be between 0 and 100.");
                        continue;
                    }

                    attempts++;

                    if (randomNumber < userInput) {
                        System.out.println("Your guess is on the higher side, guess lower!");
                    } else if (randomNumber > userInput) {
                        System.out.println("Your guess is on the lower side, guess higher!");
                    }
                }

                System.out.println("Your guess is right!");
                System.out.println("Attempts required: " + attempts);

                System.out.println("Do you want to play again? (y/n)");
                String choice = s.next();

                if (choice.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for Playing! Goodbye");
                    break;
                }

            }
            catch (Exception e) {
                System.out.println("Please enter a valid number between 0 and 100.");
                s.nextLine();
            }
        }

        s.close();
    }
}