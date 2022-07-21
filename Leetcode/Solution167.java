/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
import java.util.Arrays;

public class Solution167 {
  public static void main(String[] args) {
    int[] numbers = { -1, -1, 1, 1 };
    int target = -2;
    System.out.println(Arrays.toString(twoSum(numbers, target)));
  }

  public static int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    for (int i = numbers.length - 1; i >= 0; i--) {
      if (numbers[i] <= target) {
        int diff = target - numbers[i];
        int j = 0;
        while (numbers[j] < diff) {
          j++;
        }
        if (numbers[j] == diff) {
          res[0] = j + 1;
          res[1] = i + 1;
          break;
        }
      }
    }
    return res;
  }
}
