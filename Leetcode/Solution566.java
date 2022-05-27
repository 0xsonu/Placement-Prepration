import java.util.Arrays;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution566 {
  public static void main(String[] args) {
    int[][] mat = { { 1, 2 }, { 3, 4 } };
    int r = 1, c = 4;
    int[][] res = matrixReshape(mat, r, c);
    System.out.println(Arrays.deepToString(res));
  }

  public static int[][] matrixReshape(int[][] mat, int r, int c) {
    if (r * c != mat.length * mat[0].length)
      return mat;
    int[][] res = new int[r][c];
    int row = 0, col = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        res[row][col] = mat[i][j];
        if (col < c) {
          col++;
        } else {
          col = 0;
          row++;
        }
      }

    }
    return res;
  }

}
