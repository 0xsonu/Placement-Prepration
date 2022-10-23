import java.util.Arrays;

public class Solution42 {
  public static void main(String[] args) {
    // int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    int[] arr = { 4, 2, 0, 3, 2, 5 };
    System.out.println(trap(arr));
  }

  public static int trap(int[] h) {
    int[] ltr = new int[h.length];
    int[] rtl = new int[h.length];
    int l = h.length;
    for (int i = 0; i < l; i++) {
      if (i == 0)
        ltr[i] = h[i];
      else {
        if (ltr[i - 1] >= h[i])
          ltr[i] = ltr[i - 1];
        else
          ltr[i] = h[i];
      }
    }
    System.out.println("ltr " + Arrays.toString(ltr));
    for (int i = l - 1; i >= 0; i--) {
      if (i == l - 1)
        rtl[i] = h[i];
      else {
        if (rtl[i + 1] >= h[i])
          rtl[i] = rtl[i + 1];
        else
          rtl[i] = h[i];
      }
    }
    System.out.println("rtl " + Arrays.toString(rtl));
    int res = 0;
    boolean rtlCheck = false;
    for (int i = 0; i < h.length; i++) {
      int c = h[i];
      if (ltr[i] == rtl[i])
        rtlCheck = true;
      if (rtlCheck) {

        res += rtl[i] - c;
      } else {
        res += ltr[i] - c;
      }
    }

    return res;
  }
}
