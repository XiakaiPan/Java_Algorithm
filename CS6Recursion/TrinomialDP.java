/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class TrinomialDP {
    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k) {
        long[][] f = new long[n + 1][n + 2];
        f[0][0] = 1;
        // System.out.println(f[n][k]);
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j < -n || j > n) {
                    f[i][j] = 0;
                }
                else {
                    f[i][j] = f[i - 1][j - 1] + f[i - 1][j] + f[i - 1][j + 1];
                }
            }
        }
        return f[n][k];
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
