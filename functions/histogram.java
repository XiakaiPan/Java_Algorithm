/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import java.util.Arrays;

public class histogram {
    public static int[] count(int[] a, int m) {
        int[] res = new int[m];
        for (int i = 0; i < a.length; i++) {
            res[a[i]]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }
        StdOut.println(Arrays.toString(count(a, m)));
    }
}
