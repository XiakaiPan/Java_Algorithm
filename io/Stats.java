/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Stats {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        double[] value = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            value[i] = StdIn.readDouble();
            sum += value[i];
        }
        double ave = sum / n;
        double sumOfdif = 0;
        for (int i = 0; i < n; i++) {
            sumOfdif += Math.pow(value[i] - ave, 2);
        }
        double ssd = Math.sqrt(sumOfdif / (n - 1));
        StdOut.printf("Average = %f, SSD = %f", ave, ssd);
    }
}
