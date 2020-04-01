/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Beckett {
    /* The way from textbook
    public static void moves(int n, boolean forward) {
        if (n == 0) return;
        moves(n - 1, true);
        if (forward) StdOut.println("enter: " + n);
        else StdOut.println("exit: " + n);
        moves(n - 1, false);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        moves(n, true);
    }
    It's a little confusing.
     */
    // I consider it's time to discard the recursion chapter...
    public static void grayCode(int n, String[] code) {
        if (n == 1) {
            code[0] = "0";
            code[code.length / 2] = "1";
            return;
        }
        grayCode(n - 1, code);
        int len = code.length / 2;
        for (int i = 0; i < len; i++) {
            code[i] = "1" + code[i];
            code[i + len] = "0" + code[i + len];
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] code = new String[(int) Math.pow(2, n)];
        grayCode(n, code);
        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i]);
        }
    }
}
