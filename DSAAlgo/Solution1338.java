package DSAAlgo;

import java.util.HashMap;

class Solution1338 {
  public static void main(String[] args) {
    int arr[] = { 3, 3, 3, 3, 5, 5, 5, 2, 2, 7 };
    System.out.println(minSetSize(arr));
  }

  public static int minSetSize(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int total = arr.length;
    int count = 0;
    for (int i = 0; i < total; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    System.out.println(map);
    return count;
  }
}