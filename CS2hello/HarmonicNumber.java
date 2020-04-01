/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println(sum);
    }
}
