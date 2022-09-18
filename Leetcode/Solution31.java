import java.util.Arrays;

public class Solution31 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    System.out.println(Arrays.toString(arr));
    nextPermutation(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void nextPermutation(int[] nums) {
    int swapedIndex = -1;
    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i] > nums[i - 1]) {
        int minDifference = Integer.MAX_VALUE;
        int minInd = -1;
        for (int j = i; j < nums.length; j++) {
          int diff = nums[j] - nums[i - 1];
          if (diff > 0 && minDifference > diff) {
            minDifference = diff;
            minInd = j;
          }
        }
        swapedIndex = i;
        int temp = nums[minInd];
        nums[minInd] = nums[i - 1];
        nums[i - 1] = temp;
        break;
      }
    }
    if (swapedIndex >= 0) {
      Arrays.sort(nums, swapedIndex, nums.length);
    } else {
      Arrays.sort(nums);
    }

  }
}
