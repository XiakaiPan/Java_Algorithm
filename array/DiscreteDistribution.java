/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        int sum = 0;
        int[] sumArr = new int[n];

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(args[i + 1]);
            sumArr[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * sum);
            for (int j = 0; j < n; j++) {
                if (r < sumArr[j]) {
                    System.out.print((j + 1) + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
