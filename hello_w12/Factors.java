/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        System.out.println("The prime factor of " + n + "is: ");

        for (long factor = 2; factor * factor <= n; factor++) {
            while (n % factor == 0) {
                System.out.print(factor + " ");
                n /= factor;
            }
        }
        if (n > 1) System.out.println(n);
        else System.out.println();
    }
}
