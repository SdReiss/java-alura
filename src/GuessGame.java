import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static final int MIN_GUESS = 1;
    private static final int MAX_GUESS = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int userGuess = 0;

        System.out.format("Guess a number between %d and %d!\n", MIN_GUESS, MAX_GUESS);

        for (int i = 0; i < 5; i++) {
           userGuess = input.nextInt();

            if (userGuess == randomNumber) {
                System.out.format("You guessed right! (Answer = %d)\n", randomNumber);
                break;
            } else if (i != 4){
                isGuessClose(userGuess, randomNumber);
            } else {
                System.out.format("Game over!\nThe answer was: %d.\n", randomNumber);
            }
        }
    }

    private static void isGuessClose(int userInput, int randomNumber) {
        if (userInput < randomNumber) {
            System.out.println("You guessed too low! Try again.");
        } else {
            System.out.println("You guessed too high! Try again.");
        }
    }
}
