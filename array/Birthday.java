/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trails = Integer.parseInt(args[1]);
        int[] count = new int[n + 1];

        for (int i = 0; i < trails; i++) {
            int[] birthday = new int[n + 1];
            int j = 0;
            boolean isRepeated;
            do {
                birthday[j] = (int) (Math.random() * n);
                isRepeated = false;
                for (int k = 0; k < j; k++) {
                    if (birthday[j] == birthday[k]) {
                        isRepeated = true;
                        count[j]++;
                        break;
                    }
                }
                j++;
            } while (!isRepeated);
        }

        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += count[i];
            double fraction = (double) sum / trails;
            System.out.println((i + 1) + "\t" + count[i] + "\t" + fraction);
            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
