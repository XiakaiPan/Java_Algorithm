/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class lg {
    public static int lg2(int n) {
        int k = 0;
        int s = 1;
        while (s <= n) {
            s *= 2;
            k++;
        }
        /*
        for (int i = 0; i < n / 2; i++) {
            int s = 1;
            for (int j = 0; j < i; j++) {
                if (j != 0) s *= 2;
            }
            if (s > n) {
                k = i - 1;
                System.out.println(k);
                break;
            }
        }*/
        return k - 1;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = lg2(n);
        StdOut.printf("The largest intrger number of base-2"
                              + " logarithm of %d is: %d\n", n, x);
    }
}
