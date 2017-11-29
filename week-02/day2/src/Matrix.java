// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] ma = new int[4][4];

        for (int row = 0; row < ma.length; row++) {
            for (int col = 0; col < ma[row].length; col++) {
                if (row == col){
                    ma[row][col] = 1;
                }
            }
        }
        for (int row = 0; row < ma.length; row++) {
            System.out.println(Arrays.toString(ma[row]));
        }
    }
}
