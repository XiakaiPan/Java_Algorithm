/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        int length = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(length, height);
        StdDraw.setXscale(0, length);
        StdDraw.setYscale(0, height);
        while (StdIn.hasNextLine() && !StdIn.isEmpty()) {
            String name = StdIn.readString();
            int n = StdIn.readInt();
            double[] x = new double[n];
            double[] y = new double[n];
            for (int i = 0; i < n; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
    }
}
