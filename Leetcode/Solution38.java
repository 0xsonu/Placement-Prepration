
public class Solution38 {
  public static void main(String[] args) {
    countAndSay(1);
  }

  public static String countAndSay(int n) {
    String res = "";
    String num = "13322251";
    int c = 1;
    while (c <= n) {
      int count = 0;
      char curr;
      char prev = '-';
      String temp = "";

      for (int i = 0; i < num.length(); i++) {
        curr = num.charAt(i);
        if (curr != prev) {
          prev = curr;
          count = 1;
        } else {
          count++;

        }

      }

      c++;
    }

    return res;
  }
}
