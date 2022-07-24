import java.util.Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ReverseArrayElement(array);

    System.out.println(Arrays.toString(array));
  }

  public static void ReverseArrayElement(int[] array) {
    int l = 0;
    int r = array.length - 1;
    while (l < r) {
      int temp = array[l];
      array[l] = array[r];
      array[r] = temp;
      r--;
      l++;
    }
  }
}
