/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class FourierSpikes {
    public static double[] func(double[] x, double[] y, int n) {
        for (int i = 0; i <= 500; i++) {
            for (int j = 0; j < n; j++) {
                y[i] += Math.cos((j + 1) * x[i]);
            }
            y[i] /= n;
        }
        return y;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] x = new double[501];
        double[] y = new double[501];
        x[0] = -10.0 * Math.PI;
        for (int i = 1; i <= 500; i++) {
            x[i] = x[i - 1] + 20.0 * Math.PI / 500;
        }
        y = func(x, y, n);
        StdDraw.setXscale(-10.0 * Math.PI, 10.0 * Math.PI);
        StdDraw.setYscale(-1, 1);
        for (int i = 0; i < 500; i++)
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
    }
}
