public class Solution33 {
  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    System.out.println(search(nums, target));
  }

  public static int search(int[] nums, int target) {
    int leftLength = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1])
        leftLength++;
      else {
        break;
      }
    }
    int lastHalf = binarySearch(nums, leftLength + 1, nums.length - 1, target);

    return lastHalf == -1 ? binarySearch(nums, 0, leftLength, target) : lastHalf;
  }

  public static int binarySearch(int[] nums, int left, int right, int target) {
    if (left > right)
      return -1;
    int mid = left + (right - left) / 2;
    if (nums[mid] == target)
      return mid;
    else if (nums[mid] > target)
      return binarySearch(nums, left, mid - 1, target);
    else if (nums[mid] < target)
      return binarySearch(nums, mid + 1, right, target);
    return -1;
  }
}
