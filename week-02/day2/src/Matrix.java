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
        System.out.println(Arrays.deepToString(ma));
    }
}
