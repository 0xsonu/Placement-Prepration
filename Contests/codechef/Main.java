package codechef;

/* package codechef; // don't place package name! */

import java.util.*;

public class Main {

  /* Name of the class has to be "Main" only if the class is public. */
  public static void main(String[] args) throws java.lang.Exception {
    // int[] arr = { 5 };
    // int[] arr = { 1, 5, 5, 5, 9 };
    // int[] arr = { 2, 5, 5, 2, 9, 9, 9, 12 };
    // int[] arr = { 12, 12, 18, 18 };
    // int[] arr = { 12, 15, 10, 5, 9 };
    int[] arr = { 14, 14, 14, 14, 14, 2, 2, 4, 4 };
    System.out.println(lcmhcf(arr));
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (check(arr[i], arr[j]))
          count++;
      }
    }
    System.out.println("Count " + count);

  }

  public static int countZero(int a, int b) {
    int start = a + 5 - (a % 5);
    int sum = 0;
    for (int i = start; i <= b; i += 5) {
      int curr = i;
      int mul = 1;
      while (curr > 0) {
        int check = curr % 10;
        if (check == 0) {
          sum++;
          mul = 0;
          break;
        }
        mul *= check;
        curr = curr / 10;
      }
      while (mul % 10 == 0 && mul > 0) {
        sum++;
        if (sum > 1000000007)
          sum = sum % 1000000007;
        mul = mul / 10;

      }

    }
    System.out.println(sum);
    return sum;
  }

  public static int lcmhcf(int[] arr) {
    HashMap<Integer, Integer> set = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
    }
    int res = 0;

    for (Integer v : set.values()) {
      if (v > 1) {
        res += posibleCombination(v);
      }
    }
    System.out.println("Set " + set);
    return res;
  }

  public static int posibleCombination(int n) {
    return (n * (n - 1)) / 2;

  }

  public static boolean check(int a, int b) {
    int x = a, y = b;
    int temp;

    while (y != 0) {
      temp = y;
      y = x % y;
      x = temp;
    }
    int gcd = x;
    int lcm = (a * b) / gcd;

    return lcm == gcd;
  }
  // public static void main(String[] args) throws java.lang.Exception {
  // // your code goes here
  // // Scanner sc = new Scanner(System.in);

  // // int t = sc.nextInt();

  // // while (t-- > 0) {
  // // int n = sc.nextInt();
  // // int[] a = new int[n];
  // // for (int i = 0; i < n; i++) {
  // // a[i] = sc.nextInt();
  // // }
  // // int k = sc.nextInt();
  // // HashSet<Integer> set = new HashSet<>();
  // // while (k-- > 0) {
  // // set.add(sc.nextInt());
  // // }

  // // //
  // // int a = 1, b = 1;
  // // if (a == 1 && b == 1)
  // // System.out.println("True");

  // // for (int i = 0; i < n; i++) {
  // // if (!set.contains(a[i]))
  // // System.out.print(a[i] + " ");
  // // }
  // // System.out.println();

  // // }

  // Set<Integer> set = new HashSet<Integer>();
  // System.out.println(set.add(1));
  // System.out.println(set.add(1));
  // }
}
