
/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Solution350 {
  public static void main(String[] args) {
    int[] nums11 = { 1, 2, 2, 1 }, nums12 = { 2, 2 }, nums21 = { 4, 9, 5 }, nums22 = { 9, 4, 9, 8, 4 };

    System.out.println(Arrays.toString(intersect(nums11, nums12)));
    System.out.println(Arrays.toString(intersect(nums21, nums22)));
  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0;
    int j = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        arrayList.add(nums1[i]);
        i++;
        j++;
      }
    }
    return arrayList.stream().mapToInt(e -> e).toArray();
  }
}
