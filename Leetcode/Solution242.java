import java.util.HashMap;

/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
public class Solution242 {
  public static void main(String[] args) {
    String s = "anagram", t = "nagaram";
    System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {
    boolean res = true;
    if (s.length() != t.length())
      return false;
    HashMap<Character, Integer> tHash = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      tHash.put(c, tHash.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (tHash.containsKey(c)) {
        if (tHash.get(c) > 0)
          tHash.put(c, tHash.get(c) - 1);
        else
          return false;
      } else
        return false;
    }
    return res;
  }
}
