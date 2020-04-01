/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int sum = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                steps += 1;
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
            }
            // System.out.print(steps + " ");
            sum += steps;
        }
        System.out.println("average number of steps = "
                                   + sum / (double) trials);
    }
}
