package InterviewBit;

import java.util.ArrayList;

public class AntiDiagonals {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    int count = 1;
    for (int i = 0; i < 3; i++) {
      ArrayList<Integer> row = new ArrayList<>();
      for (int j = 0; j < 3; j++) {

        row.add(count++);
      }
      A.add(row);
    }
    System.out.println(diagonal(A));
  }

  public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    for (int i = 0; i < 2 * A.size() - 1; i++) {
      res.add(new ArrayList<>());
    }
    for (int i = 0; i < A.size(); i++) {
      for (int j = 0; j < A.get(i).size(); j++) {
        int index = i + j;

        res.get(index).add(A.get(i).get(j));

      }
    }
    return res;
  }

}
