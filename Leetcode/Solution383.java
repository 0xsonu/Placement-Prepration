
/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */
import java.util.HashMap;

public class Solution383 {
  public static void main(String[] args) {
    String ransomNote = "aa", magazine = "aab";
    System.out.println(canConstruct(ransomNote, magazine));
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    boolean res = true;
    HashMap<Character, Integer> magazineHash = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      char c = magazine.charAt(i);
      magazineHash.put(c, magazineHash.getOrDefault(c, 0) + 1);
    }
    for (int i = 0; i < ransomNote.length(); i++) {
      char c = ransomNote.charAt(i);
      if (magazineHash.containsKey(c)) {
        if (magazineHash.get(c) > 0)
          magazineHash.put(c, magazineHash.get(c) - 1);
        else
          return false;
      } else
        return false;
    }
    return res;
  }

}
