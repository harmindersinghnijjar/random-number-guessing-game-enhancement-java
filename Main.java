
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generate a random number
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();
        int counter = 0;

        // Loop until user guesses the random number
        while (guess != randomNumber) {
            if (guess > randomNumber) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            counter++;
        }

        // User guessed the random number - display number of guesses
        System.out.println("You guessed the number! It was " + randomNumber);
        System.out.println("It took you " + counter + " guesses.");
    }
}