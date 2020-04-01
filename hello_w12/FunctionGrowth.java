/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("ln n\tn\tn ln n\tn^2\tn^3");
        for (int i = 16; i <= 2048; i *= 2) {
            System.out.print((long) Math.log(i));
            System.out.print("\t" + i + "\t");
            System.out.print((long) i * Math.log(i));
            System.out.print("\t" + i * i + "\t " + i * i * i
                                     + "\t" + Math.pow(2, i) + "\n");
        }
    }
}
