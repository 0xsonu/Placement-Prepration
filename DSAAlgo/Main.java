package DSAAlgo;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }
    };
    System.out.println(squralTraversal(matrix));

  }

  public static ArrayList<Integer> squralTraversal(int[][] matrix) {
    ArrayList<Integer> res = new ArrayList<>();
    int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
    int dir = 0;
    while (left <= right && top <= bottom) {
      if (dir == 0) {
        for (int i = left; i <= right; i++) {
          res.add(matrix[top][i]);
        }
        top++;
        dir++;
      } else if (dir == 1) {
        for (int i = top; i <= bottom; i++) {
          res.add(matrix[i][right]);
        }
        right--;
        dir++;
      } else if (dir == 2) {
        for (int i = right; i >= left; i--) {
          res.add(matrix[bottom][i]);
        }
        bottom--;
        dir++;

      } else if (dir == 3) {
        for (int i = bottom; i >= top; i--) {
          res.add(matrix[i][left]);
        }
        left++;
        dir++;

      }
      dir = dir % 4;

    }
    return res;
  }

}
