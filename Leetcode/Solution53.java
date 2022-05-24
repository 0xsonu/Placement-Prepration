/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */

public class Solution53 {
  public static void main(String[] args) {
    int input1[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int input2[] = { 1 };
    int input3[] = { 5, 4, -1, 7, 8 };
    System.out.println(maxSubArray(input1));
    System.out.println(maxSubArray(input2));
    System.out.println(maxSubArray(input3));
  }

  public static int maxSubArray(int[] nums) {
    int max = nums[0];
    int current = nums[0];
    for (int i = 1; i < nums.length; i++) {
      current = Math.max(nums[i], current + nums[i]);
      max = Math.max(max, current);
    }
    return max;
  }
}
