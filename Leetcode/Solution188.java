import java.util.Arrays;

public class Solution188 {
  public static void main(String[] args) {
    int[][] arr = { { 2, 4, 1 }, { 3, 2, 6, 5, 0, 3 }, { 1, 2, 4, 2, 5, 7, 2, 4, 9, 0 }, { 1, 2, 4 },
        { 6, 1, 3, 2, 4, 7 } }; // 2 7 13 3 7
    for (int[] ar : arr)
      System.out.println(maxProfit1(2, ar));
  }

  public static int maxProfit1(int k, int[] prices) {

    int n = prices.length;
    int[][][] dp = new int[2][2][k + 1]; // for storing curr(ith) and prev((i+1)th)
    for (int i = n - 1; i >= 0; i--) {
      for (int buy = 0; buy < 2; buy++) {
        for (int cap = 1; cap < k + 1; cap++) {
          // if buy = 1 then you can buy, else you can sell
          if (buy == 1) {
            dp[i % 2][buy][cap] = Math.max(-prices[i] + dp[(i + 1) % 2][0][cap], 0 + dp[(i + 1) % 2][1][cap]);
          } else {
            dp[i % 2][buy][cap] = Math.max(prices[i] + dp[(i + 1) % 2][1][cap - 1], 0 + dp[(i + 1) % 2][0][cap]);
          }
        }
      }
    }
    System.out.println(Arrays.deepToString(dp));
    return dp[0][1][k];
  }

  public static int maxProfit(int k, int[] prices) {
    if (prices.length <= 1)
      return 0;
    int res = 0;
    boolean[] used = new boolean[prices.length];
    Arrays.fill(used, false);
    while (k-- > 0) {
      int[] posibleMax = new int[prices.length];
      for (int i = prices.length - 1; i >= 0; i--) {
        if (!used[i]) {
          if (i == prices.length - 1)
            posibleMax[prices.length - 1] = prices[prices.length - 1];
          else if (posibleMax[i + 1] > prices[i]) {
            posibleMax[i] = posibleMax[i + 1];
          } else
            posibleMax[i] = prices[i];
        } else
          posibleMax[i] = -1;
      }

      int mp = 0;
      int minIndex = -1, maxIndex = -1;
      for (int i = 0; i < prices.length; i++) {
        if (!used[i]) {
          int dif = posibleMax[i] - prices[i];

          if (dif > mp) {
            minIndex = i;
            mp = dif;
            int x = i;

            while (x < prices.length && posibleMax[x] == posibleMax[i])
              x = x + 1;
            maxIndex = x - 1;
          }
        }
      }
      if (maxIndex > -1 && minIndex > -1) {
        used[minIndex] = true;
        used[maxIndex] = true;
      }

      if (mp == 0)
        break;
      res += mp;
      System.out.println(Arrays.toString(used));
      System.out.println(Arrays.toString(posibleMax));
    }

    return res;
  }
}
