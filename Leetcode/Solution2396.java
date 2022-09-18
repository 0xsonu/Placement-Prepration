public class Solution2396 {
  public static void main(String[] args) {
    System.out.println(isStrictlyPalindromic(4));
    System.out.println(isStrictlyPalindromic(9));
    System.out.println(isStrictlyPalindromic(16));
  }

  public static boolean isStrictlyPalindromic(int n) {
    for (int i = 2; i < n - 1; i++) {
      if (!isPalindrom(Integer.toString(n, i)))
        return false;
    }
    return true;

  }

  public static boolean isPalindrom(String str) {
    int l = 0;
    int r = str.length() - 1;
    while (l <= r) {

      if (str.charAt(l) != str.charAt(r)) {

        return false;
      }
      l++;
      r--;
    }
    return true;
  }
}
