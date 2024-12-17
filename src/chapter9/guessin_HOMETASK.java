package chapter9;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;
    private int noOfGuesses;
    private int inputNumber;

    // Constructor to initialize the random number
    public Game() {
        Random rand = new Random();
        this.number = rand.nextInt(1000) + 1; // Random number between 1 and 1000
    }

    // Getter for number of guesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for number of guesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Method to take user input
    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number:");
        inputNumber = scanner.nextInt();
    }

    // Method to check if the guessed number is correct
    public boolean isCorrect() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println("Congratulations! You guessed the correct number.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("The number is higher.");
        } else {
            System.out.println("The number is lower.");
        }
        return false;
    }
}

public class guessin_HOMETASK {
    public static void main(String[] args) {
        Game game = new Game();
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            game.takeUserInput();
            hasGuessedCorrectly = game.isCorrect();
        }

        System.out.println("You guessed the number in " + game.getNoOfGuesses() + " attempts.");
    }
}
