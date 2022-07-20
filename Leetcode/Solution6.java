/**
 * Sonu Kumar (https://github.com/SonuKumar81800)
 */

public class Solution6 {
  public static void main(String[] args) {
    // String s = "PAYPALISHIRING";
    String s = "abcdefghijklmnopqrstuv";
    int numRows = 5;
    System.out.println(convert(s, numRows));
  }

  public static String convert(String s, int numRows) {

    StringBuilder[] sb = new StringBuilder[numRows];
    for (int i = 0; i < numRows; i++) {
      sb[i] = new StringBuilder();
    }
    char[] arr = s.toCharArray();
    int n = arr.length;
    int index = 0;
    while (index < n) {
      for (int j = 0; j < numRows && index < n; j++) {
        sb[j].append(arr[index++]);
      }

      for (int j = numRows - 2; j > 0 && index < n; j--) {
        sb[j].append(arr[index++]);
      }
    }
    StringBuilder res = sb[0];
    for (int i = 1; i < numRows; i++) {
      res.append(sb[i].toString());
    }
    return res.toString();
  }
}
