/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int t = 0;
        System.out.println("(" + x + "," + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            t += 1;
            double n = Math.random();
            if (n < 0.25) {
                y += 1;
            }
            else if (n < 0.5) {
                x += 1;
            }
            else if (n < 0.75) {
                y -= 1;
            }
            else {
                x -= 1;
            }
            System.out.println("(" + x + "," + y + ")");
        }
        System.out.println("steps = " + t);
    }
}
