import java.util.Random;

public class Guesser {
    private final int min;
    private final int max;
    private final int maxGuesses;

    private int number;
    private int guessesLeft;
    private boolean isOn;

    public Guesser(int min, int max, int maxGuesses) {
        this.min = min;
        this.max = max;
        this.maxGuesses = maxGuesses;

        restartGame();
    }

    public int getGuessesLeft() {
        return guessesLeft;
    }

    public boolean isOn() {
        return isOn;
    }

    public void restartGame(){
        // Reset the game flag, and guess count.
        isOn = true;
        guessesLeft = maxGuesses;

        // Generate a new number in the given range.
        Random rand = new Random();
        number = rand.nextInt(max - min + 1) + min;
    }

    public void makeGuess(int num){
        if(guessesLeft <= 0 || !isOn){
            isOn = false; // Just in case isOn is true, despite there being no guesses left
        }

        if(!(num >= min && num <= max)){
            System.out.println("The number is out of the range " + min + " - " + max + " inclusive.");
            System.out.println("Try again.");
            return;
        }

        // The guess must be a valid input now. We can deduct a guess.
        guessesLeft--;

        if(num == number){
            win();
            isOn = false;
        } else if(num < number) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was too high.");
        }

        if(guessesLeft == 0) {
            lost();
            isOn = false;
        }
    }

    private void win(){
        System.out.println("You have won! The winning number was " + number + ".");
        System.out.println("You guessed it with " + guessesLeft + " guesses remaining.");
        System.out.println("With " + (max - min + 1) + " possible solutions, you had a " + ((double) maxGuesses / (max-min + 1)) * 100 + "% chance of success.");
    }

    private void lost(){
        System.out.println("You have lost this time! The winning number was actually " + number + ".");
        System.out.println("With " + (max - min + 1) + " possible solutions, you had a " + ((double) maxGuesses / (max-min + 1)) * 100 + "% chance of success.");
    }
}
