/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class WordCount {
    public static void main(String[] args) {
        /*
        String text = StdIn.readAll();
        String[] words = text.split(" ");
        StdOut.println("The number of words is :" + words.length);
         */
        int count = 0;
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
        }
        StdOut.println("number of words = " + count);
    }
}
