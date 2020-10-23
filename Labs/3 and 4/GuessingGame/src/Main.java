import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Guesser. You have 10 chances to guess a number between 1 and 100.");
        Guesser guesser = new Guesser(1, 100, 10);

        int guess;
        while(guesser.isOn()){
            System.out.println("You have " + guesser.getGuessesLeft() + " guesses left.");
            System.out.print("Take a guess: ");
            Scanner read = new Scanner(System.in);

            guess = read.nextInt();
            guesser.makeGuess(guess);
        }

        System.out.println("Thanks for playing.");
    }
}
