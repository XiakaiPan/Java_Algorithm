/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class IntegerToBinaryString {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = "";

        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }
}
