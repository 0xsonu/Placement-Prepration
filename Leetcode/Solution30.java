import java.util.*;

public class Solution30 {
  public static void main(String[] args) {
    String s = "barfoothefoobarman";
    String[] words = { "foo", "bar" };
    System.out.println(findSubstring(s, words));

  }

  public static List<Integer> findSubstring(String s, String[] words) {
    List<Integer> res = new ArrayList<>();
    HashMap<String, Integer> set = new HashMap<>();
    int wordLength = words[0].length();
    int totalWords = words.length;

    for (int i = 0; i < words.length; i++) {
      set.put(words[i], set.getOrDefault(words[i], 0) + 1);
    }
    int matchCount = 0;
    int currentIndex = -1;
    for (int i = 0; i < s.length() - wordLength; i++) {
      String subString = s.substring(i, i + wordLength);
      if (set.getOrDefault(subString, -1) != -1) {
        currentIndex = i;
        matchCount++;
        i += wordLength - 1;
      }
      if (matchCount == totalWords) {
        res.add(currentIndex);
        matchCount = 0;
      }
    }

    return res;
  }
}
