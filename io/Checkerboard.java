/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        double row = 0.5;
        double col = 0.5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                        StdDraw.filledSquare(row + i, col + j, 0.5);
                    }
                    else {
                        StdDraw.setPenColor(StdDraw.BLUE);
                        StdDraw.filledSquare(row + i, col + j, 0.5);
                    }
                }
                else {
                    if (j % 2 == 0) {
                        StdDraw.setPenColor(StdDraw.BLUE);
                        StdDraw.filledSquare(row + i, col + j, 0.5);
                    }
                    else {
                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                        StdDraw.filledSquare(row + i, col + j, 0.5);
                    }
                }
            }
        }
    }
}