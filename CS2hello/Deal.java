/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Deal {
    public static void main(String[] args) {
        int PLAYERS = Integer.parseInt(args[0]);
        int CARDS_PER_PLAYER = 5;

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };
        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };
        int n = SUITS.length * RANKS.length;

        if (CARDS_PER_PLAYER * PLAYERS > n)
            throw new RuntimeException("Too many players");

        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
                System.out.println();
        }
    }
}
