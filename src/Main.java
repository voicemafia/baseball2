
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int numGuesses = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("Too low, try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations, you guessed the secret number in " + numGuesses + " guesses!");
                break;
            }
        }


        scanner.close();
    }
}
