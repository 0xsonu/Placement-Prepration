
/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
import java.util.HashMap;

public class Solution387 {
  public static void main(String[] args) {
    String s = "leetcode";
    System.out.println(firstUniqChar(s));
  }

  public static int firstUniqChar(String s) {
    int index = -1;
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.get(c) == 1) {
        index = i;
        break;
      }
    }
    return index;
  }

}
