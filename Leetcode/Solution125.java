public class Solution125 {
  public static void main(String[] args) {
    String s = "ab_a";
    System.out.println(isPalindrome(s));
    System.out.println(isPalindromeOld(s));
  }

  public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int l = 0, r = s.length() - 1;
    while (l <= r) {
      if ((s.charAt(l) < 48 || s.charAt(l) > 57) && (s.charAt(l) <= 96 || s.charAt(l) > 122)) {
        l++;
        continue;
      }
      if ((s.charAt(r) < 48 || s.charAt(r) > 57) && (s.charAt(r) <= 96 || s.charAt(r) > 122)) {
        r--;
        continue;
      }
      if (s.charAt(l) != s.charAt(r))
        return false;

      l++;
      r--;
    }
    return true;

  }

  public static boolean isPalindromeOld(String s) {
    s = s.toLowerCase();
    String resultStr = "";
    for (int i = 0; i < s.length(); i++) {
      if ((s.charAt(i) > 47 && s.charAt(i) <= 57) || (s.charAt(i) > 96 &&
          s.charAt(i) <= 122)) {
        resultStr = resultStr + s.charAt(i);
      }
    }

    int i = 0, j = resultStr.length() - 1;
    while (i <= j) {
      if (resultStr.charAt(i) != resultStr.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
