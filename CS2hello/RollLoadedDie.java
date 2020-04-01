/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RollLoadedDie {
    public static void main(String[] args) {
        int n;
        double r = Math.random();

        if (r < 1.0 / 8.0) n = 1;
        else if (r < 2.0 / 8.0) n = 2;
        else if (r < 3.0 / 8.0) n = 3;
        else if (r < 4.0 / 8.0) n = 4;
        else if (r < 5.0 / 8.0) n = 5;
        else n = 6;

        System.out.println(n);
    }
}
