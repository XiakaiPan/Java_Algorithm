/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Markov {
    // Compute page ranks after trials moves
    public static void main(String[] args) {
        int trails = Integer.parseInt(args[0]);     // number of moves
        int n = StdIn.readInt();                    // number of pages
        StdIn.readInt();

        // Read transition matrix.
        double[][] p = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = StdIn.readDouble();
            }
        }

        // Use the power method to compute page ranks.
        double[] ranks = new double[n];
        ranks[0] = 1.0;
        for (int t = 0; t < trails; t++) {
            // Compute effect of next move on page ranks.
            double[] newRanks = new double[n];
            for (int j = 0; j < n; j++) {
                // New rank of page j is dot product of old ranks and column j of p[][]
                for (int k = 0; k < n; k++)
                    newRanks[j] += ranks[k] * p[k][j];
            }
            // Update ranks[].
            for (int j = 0; j < n; j++)
                ranks[j] = newRanks[j];
        }
        // Print new ranks.
        for (int i = 0; i < n; i++)
            StdOut.printf("%8.5f", ranks[i]);
        StdOut.println();
    }
}
