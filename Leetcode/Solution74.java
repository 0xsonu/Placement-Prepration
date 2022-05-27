/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution74 {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    int target = 3;
    System.out.println(searchMatrix(matrix, target));
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
    int row = -1;
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
        row = i;
        break;
      }
    }
    if (row == -1)
      return false;
    int res = binarySearch(matrix[row], target);
    if (res >= 0)
      return true;
    else
      return false;
  }

  public static int binarySearch(int[] arr, int target) {
    if (arr[0] > target || arr[arr.length - 1] < target)
      return -1;
    return recursiveBinarySearch(arr, target, 0, arr.length - 1);
  }

  public static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
    if (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == target)
        return mid;
      if (arr[mid] > target)
        return recursiveBinarySearch(arr, target, start, mid - 1);
      return recursiveBinarySearch(arr, target, mid + 1, end);
    }
    return -1;
  }
}
