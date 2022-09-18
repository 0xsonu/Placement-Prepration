import java.util.Arrays;

class Solution48 {
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    System.out.println(Arrays.deepToString(arr));
    rotate(arr);
    System.out.println(Arrays.deepToString(arr));

  }

  public static void rotate(int[][] matrix) {
    for (int i = 0; i < matrix.length / 2; i++) {
      int[] arr = matrix[i];
      matrix[i] = matrix[matrix.length - i - 1];
      matrix[matrix.length - i - 1] = arr;
    }

    for (int i = 0; i < matrix.length; i++) {
      int j = 0;
      while (j < i) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
        j++;
      }
    }
  }
}