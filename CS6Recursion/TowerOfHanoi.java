/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TowerOfHanoi {
    /*
    public static void moves(int n, boolean left) {
        // It's so difficult to understand by this program!
        if (n == 0) return;
        // First move n-1 discs to another pole(!left)
        moves(n - 1, !left);
        // then move the nth disc to the other pole
        if (left) StdOut.println(n + " left");
        else StdOut.println(n + " right");
        // move the n-1 discs to
        moves(n - 1, !left);
    }*/
    public static void moves(int n, String start, String mid, String end) {
        if (n == 1) StdOut.println("Move from " + start + " to " + end);
        else {
            moves(n - 1, start, end, mid);
            moves(1, start, mid, end);
            moves(n - 1, mid, start, end);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        moves(n, "A", "B", "C");
    }
}
