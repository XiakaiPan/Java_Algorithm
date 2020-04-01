/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RulerN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        String ruler = " ";
        for (int i = 1; i <= n; i++) {
            ruler = ruler + i + ruler;
            System.out.println(ruler);
        }
    }
}
