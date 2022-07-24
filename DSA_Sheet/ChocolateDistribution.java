import java.util.Arrays;

public class ChocolateDistribution {
  public static void main(String[] args) {
    int[] arr = { 7, 3, 2, 4, 9, 12, 56 };
    int m = 3;
    System.out.println(ChocolateDistributionFunction(arr, m));

  }

  public static int ChocolateDistributionFunction(int[] arr, int m) {
    int res = Integer.MAX_VALUE;
    Arrays.sort(arr);
    for (int i = 0; i + m - 1 < arr.length; i++) {
      int diff = arr[i + m - 1] - arr[i];
      if (res > diff)
        res = diff;
    }
    return res;
  }
}