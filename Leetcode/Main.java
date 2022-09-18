
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int n = 5;
    List<Integer> parcels = new ArrayList<>();
    parcels.add(6);
    parcels.add(5);
    parcels.add(4);
    parcels.add(1);
    parcels.add(3);
    int k = 7;
    System.out.println(getMinimumCost(parcels, n, k));
  }

  public static int getMinimumCost(List<Integer> parcels, int n, int k) {
    Collections.sort(parcels);
    int missing = k - n;
    int sum = 0;
    for (Integer i = 1; i <= k; i++) {
      if (parcels.indexOf(i) < 0 && missing > 0) {
        sum += i;
        missing--;
      }
    }
    return sum;
  }

  public static int longestNiceSubarray(int[] nums) {
    int res = 1;
    for (int i = 0; i < nums.length - 1; i++) {

      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] & nums[j]) != 0)
          break;

        for (int k = i; k < j; k++) {
          for (int l = k + 1; l <= j; l++) {
            if ((nums[k] & nums[l]) == 0) {

              if (l - i > res)
                res = l - i + 1;
            } else {
              res = k - i;
              break;
            }
          }
        }
      }

    }

    return res;
  }

  public static boolean findSubarrays(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length - 1; i++) {
      int sum = nums[i] + nums[i + 1];
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    for (Integer val : map.values()) {
      if (val > 1)
        return true;
    }

    return false;

  }

  public static boolean checkDistances(String s, int[] distance) {
    int[][] map = new int[26][2];

    for (int i = 0; i < s.length(); i++) {
      int index = s.charAt(i) - 97;
      if (map[index][0] > 0) {
        map[index][1] = i;
      } else {
        map[index][0] = i;
      }
    }

    for (int i = 0; i < map.length; i++) {
      int val = Math.abs(map[i][0] - map[i][1]) - 1;
      if (val != distance[i] && val >= 0)
        return false;
    }

    return true;

  }
}
