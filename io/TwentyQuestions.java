/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TwentyQuestions {
    public static void main(String[] args) {
        // Generate a number and answer questions
        // while the user tries to guess the value.
        int secret = 1 + (int) (Math.random() * 100000);
        StdOut.print("I'm thinking of a number ");
        StdOut.println("between 1 and 1,000,000");
        int guess = 0;
        while (guess != secret) {
            // Solicit one guess and provide one answer
            StdOut.print("What's your guess?");
            guess = StdIn.readInt();
            if (guess == secret) StdOut.println("You win!");
            if (guess < secret) StdOut.println("Too low ");
            if (guess > secret) StdOut.println("Too high");
        }
    }
}
