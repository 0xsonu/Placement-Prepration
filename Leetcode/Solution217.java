
/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
import java.util.HashSet;

public class Solution217 {
  public static void main(String[] args) {
    int input1[] = { 1, 2, 3, 1 };
    int input2[] = { 1, 2, 3, 4 };
    int input3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
    System.out.println(containsDuplicate(input1));
    System.out.println(containsDuplicate(input2));
    System.out.println(containsDuplicate(input3));

  }

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> h = new HashSet<>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      if (h.contains(nums[i]))
        return true;
      else
        h.add(nums[i]);
    }
    return false;
  }
}
