/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] x = new int[m];
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value >= 1 && value <= m) {
                x[value - 1]++;
                //System.out.println("ReadIn: " + value + " " + x[value - 1]);
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += x[i];
            //System.out.println("The sum is : " + sum);
        }
        double H = 0.0;
        double h;
        for (int i = 0; i < m; i++) {
            if (x[i] == 0) h = 0.0;
            else {
                // The queation is there！！！
                double p = (double) x[i] / sum;
                //System.out.println("p:" + p);
                h = -p * (Math.log(p) / Math.log(2));
                //System.out.println("h:" + h);
            }
            //StdOut.printf("The h of %d is : %f\n", i + 1, h);
            H += h;
            //StdOut.printf("The H is : %f\n", H);
        }
        StdOut.printf("%.4f\n", H);
    }
}
