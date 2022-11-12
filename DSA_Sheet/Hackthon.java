import java.util.Arrays;
import java.util.HashMap;

public class Hackthon {
  public static void main(String[] args) {
    int[] arr = { -11, 8, 10, 9, -19, -8, 19, -14 };
    System.out.println(maximumMultiple(arr.length, arr));
  }

  public static long maximumMultiple(int N, int[] A) {
    Arrays.sort(A);
    int mid = N / 2;
    return A[mid - 1] * A[mid];
  }

  public static int kthMex(int n, int k, int arr[]) {
    // add your code here
    int res = 0;
    HashMap<Integer, Integer> hmap = new HashMap<>();
    int max = -1;
    for (int i = 0; i < n; i++) {
      if (!hmap.containsKey(arr[i]))
        hmap.put(arr[i], arr[i]);
      if (arr[i] > max)
        max = arr[i];
    }

    for (int i = 0; i < max; i++) {
      if (res >= k) {
        return i - 1;
      }
      if (!hmap.containsKey(i))
        res++;
    }
    if (res < k) {
      for (int i = res; i < k; i++) {
        max++;
      }
      return max;
    }
    return -1;
  }
}
