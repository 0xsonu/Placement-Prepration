
public class MinMaxElementInArray {

  public static void main(String[] args) {
    int[] numbers = { 1000, 11, 445, 1, 330, 3000 };
    Pair res = getMinMax(numbers);
    System.out.println(res.max + " " + res.min);
  }

  static class Pair {
    public int max, min;
  }

  public static Pair getMinMax(int[] numbers) {
    Pair pair = new Pair();
    pair.max = Integer.MIN_VALUE;
    pair.min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > pair.max)
        pair.max = numbers[i];
      if (numbers[i] < pair.min)
        pair.min = numbers[i];
    }
    return pair;
  }
}
