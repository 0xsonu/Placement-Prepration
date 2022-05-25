import java.util.Arrays;

public class Solution1 {
  public static void main(String[] args) {
    int[] input1 = { 2, 7, 11, 15 }, input2 = { 3, 2, 4 }, input3 = { 3, 3 };
    int target1 = 9, target2 = 6, target3 = 6;
    int[] res1 = twoSum(input1, target1);
    int[] res2 = twoSum(input2, target2);
    int[] res3 = twoSum(input3, target3);
    System.out.println(Arrays.toString(res1));
    System.out.println(Arrays.toString(res2));
    System.out.println(Arrays.toString(res3));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      if (findIndex(nums, i + 1, diff) >= 0) {
        res[0] = i;
        res[1] = findIndex(nums, i + 1, diff);
        break;
      }
    }
    return res;
  }

  public static int findIndex(int[] arr, int start, int value) {
    for (int i = start; i < arr.length; i++) {
      if (arr[i] == value)
        return i;
    }
    return -1;
  }
}
