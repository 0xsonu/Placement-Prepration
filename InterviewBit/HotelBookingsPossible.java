package InterviewBit;

import java.util.ArrayList;

public class HotelBookingsPossible {
  public static void main(String[] args) {
    ArrayList<Integer> arrive = new ArrayList<>();
    arrive.add(1);
    arrive.add(3);
    arrive.add(5);
    ArrayList<Integer> depart = new ArrayList<>();
    arrive.add(2);
    arrive.add(6);
    arrive.add(8);
    System.out.println(hotel(arrive, depart, 1));
  }

  public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
    int roomRequired = K;
    for (int i = 0; i < arrive.size() - 1; i++) {
      if (roomRequired < 0)
        return false;
      if (depart.get(i + 1) < arrive.get(i)) {
        roomRequired--;
      }

    }
    return true;
  }
}
