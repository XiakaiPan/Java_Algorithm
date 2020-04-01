/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MaxMin {
    public static void main(String[] args) {

        int max = StdIn.readInt();
        int min = max;
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value < min) min = value;
            if (value > max) max = value;
        }
        StdOut.println("maximum = " + max + ", minimum = " + min);


        /*
        // first value read initialized min and max
        int max = StdIn.readInt();
        int min = max;

        // read in the data, keep track of min and max
        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            if (value > max) max = value;
            if (value < min) min = value;
        }

        // output
        StdOut.println("maximum  = " + max + ", minimum = " + min);
        */
    }
}
