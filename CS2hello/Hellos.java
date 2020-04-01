/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            if (i + 1 == 1) System.out.println(i + 1 + "st Hello");
            else if (i + 1 == 2) System.out.println(i + 1 + "nd Hello");
            else if (i + 1 == 3) System.out.println(i + 1 + "rd Hello");
            else System.out.println(i + 1 + "th Hello");
        }
    }
}
