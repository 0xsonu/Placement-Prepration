
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    Integer[] arr = { 4, 3, 2, 1 };
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
    // System.out.println(list);
    // list.remove(1);
    // System.out.println(list);

    System.out.println(solve_kaushal(list));
  }

  public static int solve_kaushal(ArrayList<Integer> arr) {
    int res = 0;
    while (!arr.isEmpty()) {
      if (arr.size() >= 3) {
        int a = arr.get(0);
        int b = arr.get(1);
        int c = arr.get(2);
        int minV = findMin(a, b, c);
        res += minV;
        int minI = arr.indexOf(minV);
        if (minI + 1 < arr.size()) {
          arr.remove(minI + 1);
        }
        arr.remove(minI);
        if (minI - 1 >= 0) {
          arr.remove(minI - 1);
        }
      } else if (arr.size() == 2) {
        res += Math.min(arr.get(0), arr.get(1));
        arr.clear();
      } else {
        res += arr.get(0);
        arr.clear();
      }

    }
    return res;
  }

  public static int findMin(int a, int b, int c) {
    return Math.min(a, Math.min(b, c));
  }

  public static String reversWords1(String s) {
    char[] ch = s.toCharArray();
    int i = 0, j = s.length() - 1;
    while (j >= i) {
      char temp = ch[i];
      ch[i] = ch[j];
      ch[j] = temp;
      i++;
      j--;
    }
    String res = new String(ch);
    System.out.println(res);
    String[] resArr = res.split(" ");
    String result = "";
    for (int k = resArr.length - 1; k >= 0; k--) {
      result += resArr[k];
      if (k != 0)
        result += " ";
    }
    return result;
  }

  public static String reverseWords(String s) {
    int len = s.length();
    Stack<Character> stack = new Stack<>();
    String res = "";
    for (int i = 0; i < len; i++) {
      char c = s.charAt(i);
      if (c == ' ') {
        while (!stack.empty()) {
          res += stack.pop();
        }
        res += c;
      } else {
        stack.push(c);
      }
    }
    while (!stack.isEmpty())
      res += stack.pop();
    return res;
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
