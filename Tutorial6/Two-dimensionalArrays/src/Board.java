import javax.naming.PartialResultException;
import java.util.Random;

public class Board {
    int ar[][];

    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
        // fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = generator.nextInt(101);
            }
        }
    }

    // display the contents of the board
    public void print() {
        for (int[] r : ar) { // for all rows
            for (int c : r) { // for every element in current row
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }

    //Finding the maximum value in a row
    public int findMaxInRow(int row) {
        int max;
        int[] r = ar[row];
        max = r[0];

        for (int i : r) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    //find maximum value in a column
    public int findMaxInColumn(int column) {
        int max = 0;

        for (int[] ints : ar) {
            if (max < ints[column]) {
                max = ints[column];
            }
        }
        return max;
    }

    //find maximum value in the diagonal
    public int findMaxInDiagonal() {
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i][i]) {
                max = ar[i][i];
            }
        }

        return max;
    }

}
