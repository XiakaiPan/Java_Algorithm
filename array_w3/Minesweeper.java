/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int[][] grid = new int[m][n];
        for (int i = 0; i < k; i++) {
            int index = (int) (Math.random() * (m * n));
            int row = index / n;
            int col = index % n;
            if (grid[row][col] == -1) {
                k++;
            }
            else {
                grid[row][col] = -1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    continue;
                }
                else {
                    for (int x = i - 1; x < i + 1; x++) {
                        if (x < 0 || x > m - 1) {
                            continue;
                        }
                        else {
                            for (int y = j - 1; y < j + 1; y++) {
                                if (y < 0 || y > n - 1) {
                                    continue;
                                }
                                else {
                                    if (grid[x][y] == -1) {
                                        grid[i][j]++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == -1) {
                    System.out.print("*  ");
                }
                else {
                    System.out.print(grid[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
