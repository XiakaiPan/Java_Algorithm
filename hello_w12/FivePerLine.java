/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class FivePerLine {
    public static void main(String[] args) {
        for (int i = 1; i <= 1001; i++) {
            System.out.print(1000 + i - 1 + " ");
            if (i % 5 == 0) System.out.println();
        }
        System.out.println();
    }
}
