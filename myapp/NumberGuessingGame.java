package myapp;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private Scanner scanner = new Scanner(System.in);
    private Random rand = new Random();

    private int input;
    private int randomNumber;
    private int attempts = 0;
    private int min = 1;
    private int max = 10;
    private boolean status = false;

    public NumberGuessingGame() {

        System.out.printf(
                "Number Guessing Game\n"
                + "Guess a number between %d-%d\n",
                min, max
        );

        randomNumber = rand.nextInt(min, max + 1);

        while (status == false) {
            System.out.print("Enter a guess: ");
            input = scanner.nextInt();
            if (invalidInputCheck(input) == false) {
                status = guessingCheck(input, randomNumber);
                attempts++;
            }
        }

        scanner.close();
        System.out.printf("Your total attempts is %d", attempts);

    }

    private boolean invalidInputCheck(int input) {

        if (input > 100 || input < 1) {
            System.out.printf("You entered %d. Please enter a number between 1-100\n", input);
            return true;
        } else {
            return false;
        }

    }

    private boolean guessingCheck(int input, int randomNumber) {

        if (input == randomNumber) {
            System.out.printf("Correct!! Random number is %d\n", randomNumber);
            return true;
        } else if (input > randomNumber) {
            System.out.println("Too High! Try again");
            return false;
        } else {
            System.out.println("Too Low! Try again");
            return false;
        }

    }

}
