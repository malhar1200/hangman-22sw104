import java.util.Scanner;
class Hangman extends Game {
    public Hangman(String wordToGuess, int maxAttempts) {
        super(wordToGuess, maxAttempts);
    }

    @Override
    public void play(Scanner scanner) {
        while (!isGameOver()) {
            System.out.println("Current progress: " + getCurrentProgress());
            System.out.println("Remaining attempts: " + getRemainingAttempts());

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);  // Convert input to lowercase
            guessLetter(guess);
            System.out.println();
        }

        if (getRemainingAttempts() > 0) {
            System.out.println("Congratulations! You guessed the word: " + getCurrentProgress());
        } else {
            System.out.println("You ran out of attempts. The word was: " + wordToGuess);
        }
    }
}
