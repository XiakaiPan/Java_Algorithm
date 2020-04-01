/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Closest {
    public static void main(String[] args) {
        /*
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        double xs = StdIn.readDouble();
        double ys = StdIn.readDouble();
        double zs = StdIn.readDouble();
        double shortestDistance = (xs - x) * (xs - x) +
                (ys - y) * (ys - y) + (zs - z) * (zs - z);

        while (!StdIn.isEmpty()) {
            double xi = StdIn.readDouble();
            double yi = StdIn.readDouble();
            double zi = StdIn.readDouble();
            double dis = (xi - x) * (xi - x) +
                    (yi - y) * (yi - y) + (zi - z) * (zi - z);
            if (dis < shortestDistance) {
                xs = xi;
                ys = yi;
                zs = zi;
            }
        }
        StdOut.printf("The closest point of (%f, %f, %f) is (%f, %f, %f)",
                      x, y, z, xs, ys, zs);
        */
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double xs = Double.NaN;
        double ys = Double.NaN;
        double zs = Double.NaN;
        double bestDis = Double.POSITIVE_INFINITY;

        while (!StdIn.isEmpty()) {
            double xi = StdIn.readDouble();
            double yi = StdIn.readDouble();
            double zi = StdIn.readDouble();
            double dist2 = (x - xi) * (x - xi) + (y - yi) * (y - yi) + (z - zi) * (z - zi);
            if (dist2 < bestDis) {
                xs = xi;
                ys = yi;
                zs = zi;
                bestDis = dist2;
            }
        }

        StdOut.printf("Closest point = (%f, %f, %f)\n", xs, ys, zs);
    }
}
