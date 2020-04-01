/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = Math.max(a, Math.max(b, c));
        boolean isRT = (a != 0 && b != 0 && c != 0) && ((max * max - a * a - b * b == 0) ||
                (max * max - a * a - c * c == 0) ||
                (max * max - b * b - c * c == 0));
        System.out.println(isRT);
    }
}
