import java.util.Arrays;

public class Solution88 {
  public static void main(String[] args) {
    int[] nums11 = { 1, 2, 3, 0, 0, 0 }, nums12 = { 2, 5, 6 }, nums21 = { 1 }, nums22 = {},
        nums31 = { 0 }, nums32 = { 1 };
    int m1 = 3, n1 = 3, m2 = 1, n2 = 0, m3 = 0, n3 = 1;
    merge(nums11, m1, nums12, n1);
    merge(nums21, m2, nums22, n2);
    merge(nums31, m3, nums32, n3);
    System.out.println(Arrays.toString(nums11));
    System.out.println(Arrays.toString(nums21));
    System.out.println(Arrays.toString(nums31));
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int idx = nums1.length - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[idx] = nums1[i];
        i--;
      } else {
        nums1[idx] = nums2[j];
        j--;
      }
      idx--;
    }
    while (i >= 0) {
      nums1[idx] = nums1[i];
      i--;
      idx--;
    }
    while (j >= 0) {
      nums1[idx] = nums2[j];
      j--;
      idx--;
    }
  }
}
