package DSAAlgo;

import java.util.HashSet;

public class Solution1695 {
  public static void main(String[] args) {
    int[] nums = { 4, 2, 4, 5, 6 };
    System.out.println(maximumUniqueSubarray(nums));
  }

  public static int maximumUniqueSubarray(int[] nums) {
    int res = 0, accum = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.add(nums[i])) {
        accum += nums[i];
        res = (res > accum) ? res : accum;
      } else {
        set.remove(nums[i]);
        accum = 0;
        set.clear();
      }
    }

    return res;
  }
}
